package com.example.parth.kotlinpractice_2.support

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.parth.kotlinpractice_2.R

class CoreActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context): Intent {
            var intent = Intent(context, CoreActivity::class.java)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)
    }
}
