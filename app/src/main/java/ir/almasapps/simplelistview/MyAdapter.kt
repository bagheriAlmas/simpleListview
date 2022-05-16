package ir.almasapps.simplelistview

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import ir.almasapps.simplelistview.model.App

class MyAdapter(var context:Context,var list : List<App>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.list_items,null)
        var txtAppName : TextView= view.findViewById(R.id.item_txtName)
        var txtAppType : TextView = view.findViewById(R.id.item_txtType)
        var txtDescription : TextView = view.findViewById(R.id.item_txtDescription)
        var imgLogo : ImageView = view.findViewById(R.id.item_imgLogo)
        var layout : CardView = view.findViewById(R.id.item_layout)

        txtAppName.text = list[position].name
        txtAppType.text = list[position].type
        txtDescription.text = list[position].company + " - " + list[position].ceo
        imgLogo.setImageResource(list[position].image)
        layout.setCardBackgroundColor(Color.parseColor(list[position].color))


        layout.setOnClickListener(){
            Toast.makeText(context,list[position].name,Toast.LENGTH_SHORT).show()
        }
        return view
    }

}