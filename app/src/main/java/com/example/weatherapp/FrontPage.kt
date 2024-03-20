package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FrontPage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front_page)

        val cityName= findViewById<EditText>(R.id.cityName)
        val submitbtn= findViewById<Button>(R.id.submitbtn)

        submitbtn.setOnClickListener {
            if(cityName.text.toString().isEmpty()){
                Toast.makeText(this, "Enter the valid city name", Toast.LENGTH_SHORT).show()
            }
            else{
                val usercityname= cityName.text.toString()
                val intent= Intent(this, MainActivity::class.java)
                intent.putExtra("usercityname", usercityname)
                startActivity(intent)
                cityName.text.clear()

            }
        }
    }
}