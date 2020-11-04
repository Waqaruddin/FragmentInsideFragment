package com.example.multiplefragments2.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiplefragments2.R
import com.example.multiplefragments2.fragment.OneFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    private fun init(){
        button_add.setOnClickListener {

            var fragmentManger = supportFragmentManager
            var fragmentTransaction = fragmentManger.beginTransaction()
            fragmentTransaction.add(R.id.fragement_container, OneFragment()).commit()

        }
    }


}