package com.example.actividad_08moviles

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los elementos
        val checkBoxMateria1 = findViewById<CheckBox>(R.id.materia1)
        val checkBoxMateria2 = findViewById<CheckBox>(R.id.materia2)
        val checkBoxMateria3 = findViewById<CheckBox>(R.id.materia3)
        val radioGroupTurno = findViewById<RadioGroup>(R.id.turnoGroup)
        val botonEnviar = findViewById<Button>(R.id.botonEnviar)

        botonEnviar.setOnClickListener {
            // Materias seleccionadas
            val materiasSeleccionadas = StringBuilder("Materias seleccionadas:\n")

            if (checkBoxMateria1.isChecked) materiasSeleccionadas.append("Matemáticas\n")
            if (checkBoxMateria2.isChecked) materiasSeleccionadas.append("Ciencias\n")
            if (checkBoxMateria3.isChecked) materiasSeleccionadas.append("Historia\n")

            // Turno seleccionado
            val turnoSeleccionadoId = radioGroupTurno.checkedRadioButtonId
            val turnoSeleccionado = when (turnoSeleccionadoId) {
                R.id.turnoManana -> "Turno Mañana"
                R.id.turnoTarde -> "Turno Tarde"
                else -> "No se seleccionó turno"
            }

            // Mostrar selección en un Toast
            val mensajeFinal = "$materiasSeleccionadas\nTurno seleccionado: $turnoSeleccionado"
            Toast.makeText(this, mensajeFinal, Toast.LENGTH_LONG).show()

        }
    }
}

