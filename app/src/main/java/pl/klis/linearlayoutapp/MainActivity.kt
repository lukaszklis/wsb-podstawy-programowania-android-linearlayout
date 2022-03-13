package pl.klis.linearlayoutapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val ENTERED_NAME_MESSAGE = "pl.klis.linearlayoutapp.ENTERED_NAME_MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.showInput)

        showButton.setOnClickListener {
            handleSubmit()
        }
    }

    private fun handleSubmit() {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()

        if (message.isNotEmpty()) {
            greetUser(message)
        } else {
            showWarning()
        }
    }

    private fun greetUser(message: String) {
        val intent = Intent(this, DisplayNameActivity::class.java).apply {
            putExtra(ENTERED_NAME_MESSAGE, message)
        }

        startActivity(intent)
    }

    private fun showWarning() {
        Toast
            .makeText(this@MainActivity, getString(R.string.name_input_warning), Toast.LENGTH_LONG)
            .show()
    }
}