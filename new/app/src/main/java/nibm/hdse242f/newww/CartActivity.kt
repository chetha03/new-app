package nibm.hdse242f.newww

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CartActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var checkoutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        recyclerView = findViewById(R.id.cartRecyclerView)
        checkoutButton = findViewById(R.id.checkoutButton)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf("Luxury Watch", "Golden Necklace", "Leather Wallet")
        val adapter = CartAdapter(items)
        recyclerView.adapter = adapter

        checkoutButton.setOnClickListener {
            Toast.makeText(this, "Proceeding to Checkout 💳", Toast.LENGTH_SHORT).show()
        }
    }
}
