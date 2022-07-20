package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSnackbar.setOnClickListener {
            val snackbar= Snackbar.make(binding.root, "Ini Snack Bar", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("dismiss"){
//                Toast.makeText(this, "dismiss dipencet", Toast.LENGTH_SHORT).show()

//          Log.d buat tahu berhasil/tidaknya botton, bisa di check di logcat debug
           Log.d("Main", "dismiss")
            }.show()
        }

        binding.btnToast.setOnClickListener {
            val toast=Toast.makeText(this, "Ini adalah Toast",Toast.LENGTH_SHORT)
            toast.show()

        }
    }
}