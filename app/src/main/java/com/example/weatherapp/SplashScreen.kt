package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // for top action bar
        setStatusBarColor(getColor(R.color.black))
//        for bottom action bar
        setWindowNavigationBarColor(getColor(R.color.black))

//        code for splash screen
        val splashScreen= findViewById<ImageView>(R.id.splashscreen)
        splashScreen.alpha= 0f
        splashScreen.animate().setDuration(3000).alpha(1f).withEndAction {
            val intent= Intent(this, FrontPage::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }

    private fun setWindowNavigationBarColor(color: Int) {
        window.navigationBarColor = color
    }

    private fun setStatusBarColor(color: Int) {
        window.statusBarColor = color
    }
}