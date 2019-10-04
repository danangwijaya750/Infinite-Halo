package id.infiniteuny.kulanuwundunyo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.button_saya

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_saya.setOnClickListener {
           kalaudiklik()
        }
        button_saya.setOnLongClickListener {
            kalaudiklik()
            return@setOnLongClickListener true
        }
    }

    fun kalaudiklik(){
        Toast.makeText(this, "Click Me!", Toast.LENGTH_SHORT).show()
        val intent= Intent(this,DetailActivity::class.java)
        startActivity(intent)
    }
}
