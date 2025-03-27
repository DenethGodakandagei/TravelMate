package com.example.travelmate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnNavigate1: CardView = findViewById(R.id.package1)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, Explore::class.java)
            startActivity(intent)
        }
        val btnNavigate2: CardView  = findViewById(R.id.package2)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, Explore::class.java)
            startActivity(intent)
        }
        val btnNavigate3: CardView  = findViewById(R.id.package3)
        btnNavigate3.setOnClickListener {
            val intent = Intent(this, Explore::class.java)
            startActivity(intent)
        }
        val btnNavigate4: CardView  = findViewById(R.id.package4)
        btnNavigate4.setOnClickListener {
            val intent = Intent(this, Explore::class.java)
            startActivity(intent)
        }



        // Adjust padding for edge-to-edge content
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
