package com.example.travelmate

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Explore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explore)

        // Set up the BottomNavigationView to navigate between activities
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Navigate to Home activity
                    val homeIntent = Intent(this, Home::class.java)
                    startActivity(homeIntent)
                    finish()  // Close current activity (Explore) to avoid stacking
                    true
                }
                R.id.nav_explore -> {
                    // You are already in Explore activity, so no need to start a new one
                    true
                }
                R.id.nav_payment -> {
                    // Handle Payment item click if necessary
                    true
                }
                R.id.nav_profile -> {
                    // Handle Profile item click if necessary
                    true
                }
                else -> false
            }
        }

        // Optional: Set the default selected item in BottomNavigationView (Home)
        bottomNavigationView.selectedItemId = R.id.nav_explore

        // Handle system bar insets for edge-to-edge layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
