package com.muriz.clean_home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ButtonBarLayout
import com.MuRiz.clean_home.R

class IntroActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?, ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_layout)

        button = findViewById(R.id.intro_button)

        button.setOnClickListener{
            startActivity(Intent(this,LoginFormActivity::class.java))
        }
    }
}