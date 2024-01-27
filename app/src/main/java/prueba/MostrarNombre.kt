package prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prueba03.R

class MostrarNombre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_nombre)
        val name = intent.extras?.getString("nombre").orEmpty()
        val editText = findViewById<TextView>(R.id.textView2)
        editText.text = "Tu capybara se llama ${name}"
    }
}