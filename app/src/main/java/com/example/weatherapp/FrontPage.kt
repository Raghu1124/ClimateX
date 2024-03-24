package com.example.weatherapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class FrontPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)

//        for top action bar
        setStatusBarColor(getColor(R.color.black))
//        for bottom action bar
        setWindowNavigationBarColor(getColor(R.color.black))

        val cityName = findViewById<EditText>(R.id.cityName)
        val submitbtn = findViewById<Button>(R.id.submitbtn)

        submitbtn.setOnClickListener {
            if (cityName.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter the valid city name", Toast.LENGTH_SHORT).show()
            } else {
                val usercityname = cityName.text.toString()
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("usercityname", usercityname)
                startActivity(intent)
                cityName.text.clear()

            }
        }
    }

    private fun setWindowNavigationBarColor(color: Int) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            window.navigationBarColor = color
//        } else {
//            val decorView = window.decorView
//            decorView.systemUiVisibility = decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
//        }
    }

    private fun setStatusBarColor(color: Int) {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = color
//        }
    }
}