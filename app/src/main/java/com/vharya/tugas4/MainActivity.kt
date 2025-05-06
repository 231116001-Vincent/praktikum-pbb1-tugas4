package com.vharya.tugas4

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonAbout: Button = findViewById(R.id.button_about)

        buttonAbout.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            alertDialog.setView(R.layout.dialog_detail)
            alertDialog.setPositiveButton("Close") { alertDialog, _ -> alertDialog.cancel() }
            alertDialog.show()
        }
    }
}