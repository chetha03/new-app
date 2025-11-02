package nibm.hdse242f.newww

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.widget.Button

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val payButton: Button = findViewById(R.id.payButton)
        payButton.setOnClickListener {
            Toast.makeText(this, "Payment Successful 💳✨", Toast.LENGTH_LONG).show()
        }
    }
}
