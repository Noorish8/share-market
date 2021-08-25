package com.example.sharemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Recyfragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyfragment)
        val fragment=Fragment2()
        supportFragmentManager.beginTransaction().replace(R.id.frag,Fragment3()).commit()
    }
}