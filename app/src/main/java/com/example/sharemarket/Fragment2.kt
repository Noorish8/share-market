package com.example.sharemarket

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject


class Fragment2 : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var Url: String = "https://maxgenitsolutions.in/stock/apistockview?category=intraday"
        var i: Int = 0
        var recyclerView: RecyclerView
        var adapter:Adapter
        recyclerView=view.findViewById(R.id.recyclerview1)

        var list1: ArrayList<DataModal> = ArrayList<DataModal>()

        list1 = ArrayList<DataModal>()
        val stringRequest: StringRequest = StringRequest(Request.Method.GET, Url, {
                response ->
            Log.e("noorish", response)
            val jsonObject: JSONObject = JSONObject(response)
            val jsonArray: JSONArray = jsonObject.getJSONArray("list")
            for (i in 0 until jsonArray.length()) {
                val jsonobject1 = jsonArray.getJSONObject(i)
                val ststock: String = jsonobject1.getString("ststock")
                val dataModal=DataModal()
                dataModal.ststock=ststock
                list1.add(dataModal)
            }
            adapter= Adapter(activity,list1)
            val layoutManager= LinearLayoutManager(context)
            recyclerView.layoutManager=layoutManager
            recyclerView.adapter=adapter
        }, Response.ErrorListener {

        })
        val queue:RequestQueue=Volley.newRequestQueue(context)
        queue.add(stringRequest)
    }
    }



