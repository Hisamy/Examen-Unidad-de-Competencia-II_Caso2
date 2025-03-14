package mx.edu.itson.examencaso1_cincohisamy

import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CatalogoProductos : AppCompatActivity() {
    var adapter: ProductoAdapter? = null
    var productos = ArrayList<Producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo_productos)

        val tipoProducto = intent.getStringExtra("TIPO_PRODUCTO") ?: "coldDrink"

        cargarProductos(tipoProducto)

        adapter = ProductoAdapter(this, productos)
        val gridProducto: GridView = findViewById(R.id.grid_productos)
        gridProducto.adapter = adapter

        val headerImage: ImageView = findViewById(R.id.imagen)
        when(tipoProducto) {
            "coldDrink" -> headerImage.setImageResource(R.drawable.colddrinks)
            "hotDrink" -> headerImage.setImageResource(R.drawable.hotdrinks)
            "sweets" -> headerImage.setImageResource(R.drawable.sweets)
            "salties" -> headerImage.setImageResource(R.drawable.salties)
        }
    }

    fun cargarProductos(tipo: String){
        productos.clear()

        when(tipo) {
            "coldDrink" -> {
                productos.add(Producto("Caramel Frap", 5.0, R.drawable.caramelfrap))
                productos.add(Producto("Chocolate Frap", 6.0, R.drawable.chocolatefrap))
                productos.add(Producto("Cold Brew", 3.0, R.drawable.coldbrew))
                productos.add(Producto("Matcha Latte", 4.0, R.drawable.matcha))
                productos.add(Producto("Oreo Milkshake", 7.0, R.drawable.oreomilkshake))
                productos.add(Producto("Peanut Milkshake", 7.0, R.drawable.peanutmilshake))
            }
            "hotDrink" -> {
                productos.add(Producto("Latte", 6.0, R.drawable.latte))
                productos.add(Producto("Hot Chocolate", 5.0, R.drawable.hotchocolate))
                productos.add(Producto("Espresso", 4.0, R.drawable.espresso))
                productos.add(Producto("Chai Latte", 6.0, R.drawable.chailatte))
                productos.add(Producto("Capuccino", 7.0, R.drawable.capuccino))
                productos.add(Producto("Americano Coffee", 2.0, R.drawable.americano))
            }
            "sweets" -> {
                productos.add(Producto("Blueberry cake", 6.0, R.drawable.blueberrycake))
                productos.add(Producto("Chocolate cupcake", 3.0, R.drawable.chocolatecupcake))
                productos.add(Producto("Lemon tartalette", 4.0, R.drawable.lemontartalette))
                productos.add(Producto("Red Velvet cake", 6.0, R.drawable.redvelvetcake))
                productos.add(Producto("Cherry cheesecak", 7.0, R.drawable.strawberrycheesecake))
                productos.add(Producto("Tiramisu", 6.0, R.drawable.tiramisu))
            }
            "salties" -> {
                productos.add(Producto("Chicken creps", 6.0, R.drawable.chickencrepes))
                productos.add(Producto("Club Sanwich", 5.0, R.drawable.clubsandwich))
                productos.add(Producto("Panini", 4.0, R.drawable.hampanini))
                productos.add(Producto("Phily Cheese Steack", 6.0, R.drawable.phillycheesesteak))
                productos.add(Producto("Nachos", 7.0, R.drawable.nachos))
            }
        }
    }
}
