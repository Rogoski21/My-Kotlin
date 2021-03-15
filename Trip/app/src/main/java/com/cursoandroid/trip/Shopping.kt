package com.cursoandroid.trip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.cursoandroid.trip.adapters.ProductAdapter
import com.cursoandroid.trip.model.Product

class Shopping : AppCompatActivity()/*, AdapterView.OnItemClickListener*/ {

    private var arrayList: ArrayList<Product>? = null
    private var gridview: GridView? = null
    private var productAdapter: ProductAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        gridview = findViewById(R.id.my_grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataList()
        productAdapter = ProductAdapter(applicationContext, arrayList!!)
        gridview?.adapter = productAdapter
       // gridview?.onItemClickListener = this

    }

    private fun setDataList(): ArrayList<Product> {
        var arrayList: ArrayList<Product> = ArrayList()

        arrayList.add(Product(R.drawable.singapore, "Pacote de viagem Singapura", 10000.00))
        arrayList.add(Product(R.drawable.hongkong, "Pacote de viagem Hong Kong", 20000.00))
        arrayList.add(Product(R.drawable.tehran, "Pacote de viagem Tehran", 5000.00))
        arrayList.add(Product(R.drawable.cazak, "Pacote de viagem Cazaquistão", 9900.00))

        return arrayList
    }

   /*
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var item: Product = arrayList!!.get(position)
        Toast.makeText(applicationContext, item.name, Toast.LENGTH_LONG).show()

    }

    */

}