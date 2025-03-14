package mx.edu.itson.examencaso1_cincohisamy

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetallesProdutos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles_produtos)

        val imagen: ImageView = findViewById(R.id.imagenProductoDetalle)
        val nombre: TextView = findViewById(R.id.nombreProductoDetalle)
        val precio : TextView = findViewById(R.id.precioProductoDetalle)

        val bundle = intent.extras
        if (bundle!=null){
            imagen.setImageResource(bundle.getInt("imagen"))
            nombre.setText(bundle.getString("titulo"))
            precio.setText(bundle.getString("precio"))
        }
    }
}