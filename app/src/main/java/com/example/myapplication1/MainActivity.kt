package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton3 = findViewById<Button>(R.id.button3)
        var txtBuscar = findViewById<TextView>(R.id.txt_buscar)

        boton3.text = "INGRESAR"
        boton3.setOnClickListener {
            txtBuscar.text = "El evento se ha ejecutado"
       //     Toast.makeText(this, "Este es un ejemplo", Toast.LENGTH_SHORT)
        //        .show()

            var f = Snackbar.make(boton3, "Este es otro mensaje", Snackbar.LENGTH_SHORT)
            f.setBackgroundTint(R.color.white).show()

        }
    }
}