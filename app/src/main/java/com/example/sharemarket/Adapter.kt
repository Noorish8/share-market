package com.example.sharemarket

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val context: Context?, val list: ArrayList<DataModal>):
 RecyclerView.Adapter<Adapter.ViewHolder>(){

    private val inflater
    = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as? LayoutInflater

    class ViewHolder (view: View):RecyclerView.ViewHolder(view) {
    val textView:TextView=view.findViewById(R.id.layoutlist)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val rowView=inflater?.inflate(R.layout.sharelist,parent,false)
        return Adapter.ViewHolder(rowView!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text=list.get(position).ststock

        Log.e("list>>>",holder.textView.text.toString())
    }

    override fun getItemCount(): Int {
        return list.size
    }
}