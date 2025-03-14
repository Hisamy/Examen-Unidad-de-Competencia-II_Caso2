package mx.edu.itson.examencaso1_cincohisamy

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class ProductoAdapter(var context: Context?, var productos: ArrayList<Producto>) : BaseAdapter() {
    override fun getCount(): Int {
        return productos.size
    }

    override fun getItem(p0: Int): Any {
        return productos[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(pe: Int, p1: View?, p2: ViewGroup?): View {
        var producto = productos[pe]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var vista = inflator.inflate(R.layout.plantilla_producto, null)
        var image: ImageView = vista.findViewById(R.id.image_producto)
        var title: TextView = vista.findViewById(R.id.title_producto)

        image.setImageResource(producto.image)
        title.setText(producto.titulo)

        image.setOnClickListener() {
            val intento = Intent(context, DetallesProdutos::class.java)
            intento.putExtra("titulo", producto.titulo)
            intento.putExtra("imagen", producto.image)
            intento.putExtra("precio", producto.precio.toString())
            context!!.startActivity(intento)
        }

        return vista
    }
}