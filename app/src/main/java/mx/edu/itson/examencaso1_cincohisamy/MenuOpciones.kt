package mx.edu.itson.examencaso1_cincohisamy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuOpciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_opciones)

        val coldDrinks:Button = findViewById(R.id.cold_drinks)
        val hotDrinks:Button = findViewById(R.id.hot_drinks)
        val sweets:Button = findViewById(R.id.sweets)
        val salties:Button = findViewById(R.id.salties)

        coldDrinks.setOnClickListener{
            val intent = Intent(this, CatalogoProductos::class.java)
            intent.putExtra("TIPO_PRODUCTO", "coldDrink")
            startActivity(intent)
        }

        hotDrinks.setOnClickListener{
            val intent = Intent(this, CatalogoProductos::class.java)
            intent.putExtra("TIPO_PRODUCTO", "hotDrink")
            startActivity(intent)
        }

        sweets.setOnClickListener{
            val intent = Intent(this, CatalogoProductos::class.java)
            intent.putExtra("TIPO_PRODUCTO", "sweets")
            startActivity(intent)
        }

        salties.setOnClickListener{
            val intent = Intent(this, CatalogoProductos::class.java)
            intent.putExtra("TIPO_PRODUCTO", "salties")
            startActivity(intent)
        }
    }
}