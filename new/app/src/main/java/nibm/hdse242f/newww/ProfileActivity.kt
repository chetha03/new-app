package nibm.hdse242f.newww

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val editBtn: Button = findViewById(R.id.editProfileBtn)
        val logoutBtn: Button = findViewById(R.id.logoutBtn)

        editBtn.setOnClickListener {
            Toast.makeText(this, "Edit Profile Coming Soon ✏️", Toast.LENGTH_SHORT).show()
        }

        logoutBtn.setOnClickListener {
            Toast.makeText(this, "Logged Out Successfully 👋", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
