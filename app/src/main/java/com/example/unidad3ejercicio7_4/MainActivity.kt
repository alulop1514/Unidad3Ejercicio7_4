package com.example.unidad3ejercicio7_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIniciar.setOnClickListener {
            if (etUsuario.text.toString() != "") {
                if (etContraseña.text.toString() != "") {
                    textoResultado.text = if (recordar.isChecked)
                        "Has introducido:\nUsuario: '${etUsuario.text}'\nConstreña: '${etContraseña.text}'\nSe recordará tu contraseña"
                    else
                        "Has introducido el usuario '${etUsuario.text}' y la constreña '${etContraseña.text}'"
                } else {
                    Toast.makeText(applicationContext, "No has introducido contraseña", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(applicationContext, "No has introducido usuario", Toast.LENGTH_SHORT).show()
            }
        }
    }
}