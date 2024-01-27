package prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.prueba03.R
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nombre = findViewById<EditText>(R.id.editText)
        val btnGuardar = findViewById<Button>(R.id.button1)

        btnGuardar.setOnClickListener {
            Log.i("app", "El nombre ingresado es: ${nombre.text}")
            if (nombre.text.toString().isNotEmpty()) {
                val inten = Intent(this, MostrarNombre::class.java)
                inten.putExtra("nombre", nombre.text.toString())
                startActivity(inten)
            }
        }
    }
}