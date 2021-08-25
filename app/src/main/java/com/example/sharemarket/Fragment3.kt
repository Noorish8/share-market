package com.example.sharemarket

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONObject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment3 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var Url: String = "https://maxgenitsolutions.in/stock/apistockview?category=intraday"
        var i: Int = 0
        var recyclerView: RecyclerView
        var adapter:Adapter
        recyclerView=view.findViewById(R.id.recyclerview1)

        val list =ArrayList<DataModal>()


        val stringRequest: StringRequest = StringRequest(Request.Method.GET, Url, {
                response ->
            Log.e("noorish", response)
            val jsonObject: JSONObject = JSONObject(response)
            val jsonArray: JSONArray = jsonObject.getJSONArray("list")
            for (i in 0 until jsonArray.length()) {
                val jsonobject1 = jsonArray.getJSONObject(i)
                val ststock: String = jsonobject1.getString("ststock")

                Log.e("stock>>>>",ststock)

                val dataModal=DataModal()
                dataModal.ststock=ststock
                list.add(dataModal)


            }
            adapter= Adapter(activity,list)
            recyclerView.layoutManager=LinearLayoutManager(context)
//            val layoutManager= LinearLayoutManager(activity)
//            recyclerView.layoutManager=layoutManager
            recyclerView.adapter=adapter
        }, Response.ErrorListener {

        })
        val queue: RequestQueue = Volley.newRequestQueue(context)
        queue.add(stringRequest)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment3().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}