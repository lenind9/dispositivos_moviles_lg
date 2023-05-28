package com.example.myapplication1.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication1.R
import com.example.myapplication1.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart(){
        super.onStart()
        initClass()
    }

    private fun initClass(){
        binding.buttonBindingView.setOnClickListener {
            binding.textBindingView.text = "BindingView ejecutado"
        }
    }
}