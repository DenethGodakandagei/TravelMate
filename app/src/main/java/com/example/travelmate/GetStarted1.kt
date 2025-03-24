package com.example.travelmate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetStarted1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started1) // Set the content view first.

        enableEdgeToEdge() // Enable edge-to-edge layout.

        // Access the button only after setting the layout.
        val btnNavigate: Button = findViewById(R.id.Continue)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, GetStarted2::class.java)
            startActivity(intent)
        }

        // Apply window insets to the root view.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
