package nibm.hdse242f.newww

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText
    private lateinit var cardInput: EditText
    private lateinit var addressInput: EditText
    private lateinit var payButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        nameInput = findViewById(R.id.nameInput)
        cardInput = findViewById(R.id.cardInput)
        addressInput = findViewById(R.id.addressInput)
        payButton = findViewById(R.id.payButton)

        payButton.setOnClickListener {
            val name = nameInput.text.toString()
            val card = cardInput.text.toString()
            val address = addressInput.text.toString()

            if (name.isEmpty() || card.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Please fill in all details ⚠️", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, OrderSuccessActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
