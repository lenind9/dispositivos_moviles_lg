package com.example.myapplication1.ui.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication1.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //se crea una var binding para inicializarla despues
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //se inicializa la variable binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //se sobreescribe el ciclo de vida onStart y se ejecuta la clase initClass ahi
    override fun onStart(){
        super.onStart()
        initClass()
    }

    //Creo una funcion initClass para llamarla en el metodo anterior
    private fun initClass(){
        binding.button3.setOnClickListener {
            binding.txtBuscar.text = "El codigo ejecuta correctamente"
            //    txtBuscar.text = "El evento se ha ejecutado"
            //     Toast.makeText(this, "Este es un ejemplo", Toast.LENGTH_SHORT)
            //        .show()

            var f = Snackbar.make(binding.button3, "Este es otro mensaje", Snackbar.LENGTH_SHORT)
            f.show()
        }
    }
}