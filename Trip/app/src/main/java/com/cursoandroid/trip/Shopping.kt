package com.cursoandroid.trip

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.RemoteException
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.getnet.posdigital.PosDigital
import com.getnet.posdigital.printer.AlignMode
import com.getnet.posdigital.printer.FontFormat
import com.getnet.posdigital.printer.IPrinterCallback
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog


class Shopping : AppCompatActivity()/*, AdapterView.OnItemClickListener*/ {
    private var freePrintButton = true

    val REQUEST_CODE = 1001
    val ARG_RESULT = "result"
    val ARG_PAYMENTTYPE = "debit"
    val ARG_AMOUNT = "000001234000"
    val ARG_CURRENCUPOSITION = "CURRENCY_AFTER_AMOUNT"
    val ARG_CALLERID = "1"
    val ARG_CURRENCYCODE = "986"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        compra1()

        testPrint()

    }

    fun testPrint() {
        val btnPPrint = findViewById<Button>(R.id.buttonPrint)
        
        btnPPrint.setOnClickListener {
            PosDigital.getInstance().getPrinter().init()
            PosDigital.getInstance().getPrinter().setGray(5)
            PosDigital.getInstance().getPrinter().defineFontFormat(FontFormat.MEDIUM)
            PosDigital.getInstance().getPrinter().addText(AlignMode.CENTER,"Pedro Impressões")
            PosDigital.getInstance().getPrinter().print(getPrinterCallback())
        }
    }
    private fun getPrinterCallback(): IPrinterCallback.Stub {
        return object : IPrinterCallback.Stub() {

            @Throws(RemoteException::class)
            override fun onSuccess() {
                freePrintButton = true
                openInfoDialog("Impresso com sucesso")
            }

            @Throws(RemoteException::class)
            override fun onError(cause: Int) {
                freePrintButton = true
               // openErrorDialog(parseStatus(cause))
            }
        }
    }

    fun compra1() {
        val btn1: Button = findViewById<Button>(R.id.comprar1)
        btn1.setOnClickListener() {

            PosDigital.getInstance().getLed().turnOnAll()
            PosDigital.getInstance().led.turnOffAll()

            // montar informações do pagamento
            var bundle = Bundle()
            bundle.putString("paymentType", "debit")
            //bundle.putString("creditType","creditMerchant")
            bundle.putString("amount", "000001234000")
            bundle.putString("currencyPosition", "CURRENCY_AFTER_AMOUNT")
            bundle.putString("callerId", "1")
            bundle.putString("CurrencyCode", "986")

            // montar chamda API
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("getnet://pagamento/v3/payment"))
            intent.putExtras(bundle)
            startActivityForResult(intent, REQUEST_CODE)

        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (REQUEST_CODE == requestCode && RESULT_OK == resultCode) {
            var result = data?.getStringExtra(ARG_RESULT)
            var paymentType = data?.getStringExtra(ARG_PAYMENTTYPE)
            var amount = data?.getStringExtra(ARG_AMOUNT)
            var currencyPosition = data?.getStringExtra(ARG_CURRENCUPOSITION)
            var callerId = data?.getStringExtra(ARG_CALLERID)
        }
    }


    fun openInfoDialog(message: String) {
        //openBottomSheetDialog("Info", message)
    }

    fun openErrorDialog(message: String) {
        //openBottomSheetDialog("Error", message)
    }

/*
    fun onActionResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, requestCode, data)
        if (REQUEST_CODE == requestCode && RESULT_OK == resultCode) {
            var result = data.getStringExtra(ARG_RESULT)
            var paymentType = data.getStringExtra(ARG_PAYMENTTYPE)
            var amount = data.getStringExtra(ARG_AMOUNT)
            var currencyPosition = data.getStringExtra(ARG_CURRENCUPOSITION)
            var callerId = data.getStringExtra(ARG_CALLERID)

            Toast.makeText(this, "Total cobrado " + amount, Toast.LENGTH_SHORT).show()

        }

    }

 */


}





