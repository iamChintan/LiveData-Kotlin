package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewMIdel
    private val textView : TextView
    get() = findViewById(R.id.text)
    private val btnUpdate : Button
    get() = findViewById(R.id.update)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewMIdel::class.java)
        mainViewModel.factLiveData.observe(this, Observer {
            textView.text = it
        })

        btnUpdate.setOnClickListener {
            mainViewModel.updateLiveData()
        }
    }
}