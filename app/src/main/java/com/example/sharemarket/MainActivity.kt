package com.example.sharemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
//import com.example.sharemarket.R.id.btn2
import org.json.JSONArray
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
//    lateinit var searchView: SearchView
//    lateinit var btn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment=Fragment2()
       supportFragmentManager.beginTransaction().replace(R.id.frame1,Fragment3()).commit()
//        searchView = findViewById(R.id.search)
//
//   btn2= findViewById(R.id.btn2)
//    btn2.setOnClickListener {
//        Toast.makeText(this,"button",Toast.LENGTH_SHORT).show()
//        val fragment=Fragment2()
//        supportFragmentManager.beginTransaction().replace(R.id.frame1,Fragment3()).commit()
//    }


    }
//        btn.setOnClickListener {
//            fun loadfragment(frag1: Fragment1) {
//                val ft = supportFragmentManager.beginTransaction()
//                ft.replace(R.id.frame1, frag1)
//                ft.commit()
//
//            }
//        }


//     list1=ArrayList<DataModal>()
//        val stringRequest: StringRequest =object: StringRequest(Method.GET,Url,Response.Listener { response ->
//            Log.e("noorish", response)
//            val jsonObject:JSONObject=JSONObject(response)
//            val jsonArray:JSONArray=jsonObject.getJSONArray("list")
//            for (i in 0 until jsonArray.length()) {
//                val jsonobject1 = jsonArray.getJSONObject(i)
//                val ststock: String = jsonobject1.getString("ststock")
//              val dataModal=DataModal()
//              dataModal.ststock=ststock
//                list1.add(dataModal)
//            }
//
//
//
//        },Response.ErrorListener { error ->
//
//
//        }){
//
//        }
//        val requestQueue = Volley.newRequestQueue(this)
//        requestQueue.add(stringRequest)
//    }
    }

















