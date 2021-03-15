package com.cursoandroid.trip.adapters

import android.content.ClipData
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cursoandroid.trip.R
import com.cursoandroid.trip.model.Product

class ProductAdapter(var context: Context, var arrayList: ArrayList<Product>) : BaseAdapter() {
    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View = View.inflate(context, R.layout.card_view_item_grid, null)
        var icon: ImageView = view.findViewById(R.id.icon)
        var name: TextView = view.findViewById(R.id.name_text_view1)
        var valor: TextView = view.findViewById(R.id.name_text_view2)

        val listItem: Product = arrayList.get(position)

        icon.setImageResource(listItem.icons!!)
        name.text = listItem.name
        valor.text = "R$: " + listItem.valor.toString()


        return view
    }

}
