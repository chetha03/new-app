package nibm.hdse242f.newww

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity   // ✅ correct one

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }
}
