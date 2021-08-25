package com.example.sharemarket

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterrecyfragmen (val context: Context?,val text1:Array<String>, val text2:Array<String>,  val text3:Array<String>
        ):RecyclerView.Adapter<adapterrecyfragmen.ViewHolder>() {
        private  val inflater: LayoutInflater
                =context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater

        class ViewHolder (view: View): RecyclerView.ViewHolder(view){
                val textView1: TextView =view.findViewById(R.id.txt1)
                val textView2:TextView=view.findViewById(R.id.txt2)
                val textView3:TextView=view.findViewById(R.id.txt3)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val rowView=inflater.inflate(R.layout.recyframlist, parent, false)
                return ViewHolder(rowView)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.textView1.text = text1[position]
                holder.textView2.text=text2.get(position)
                holder.textView3.text=text3.get(position)
        }

        override fun getItemCount(): Int {
                return text1.size

        }


        }