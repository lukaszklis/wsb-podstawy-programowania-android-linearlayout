package pl.klis.linearlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_name)

        val message = intent.getStringExtra(ENTERED_NAME_MESSAGE)

        findViewById<TextView>(R.id.enteredNameView).apply {
            text = getString(R.string.display_name, message)
        }
    }
}