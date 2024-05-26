package com.muriz.clean_home

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.MuRiz.clean_home.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val acLayout = findViewById<LinearLayout>(R.id.main_ac)
        val fabricLayout = findViewById<LinearLayout>(R.id.main_fabric)
        val leatherLayout = findViewById<LinearLayout>(R.id.main_leather)
        val carpetLayout = findViewById<LinearLayout>(R.id.main_carpet)


        acLayout.setOnClickListener{
            val intent = Intent(this,DescriptionActivity::class.java)
            intent.putExtra("key", "ac")
            startActivity(intent)
        }

        fabricLayout.setOnClickListener{
            val intent = Intent(this,DescriptionActivity::class.java)
            intent.putExtra("key", "fabric")
            startActivity(intent)
        }

        leatherLayout.setOnClickListener{
            val intent = Intent(this,DescriptionActivity::class.java)
            intent.putExtra("key", "leather")
            startActivity(intent)
        }

        carpetLayout.setOnClickListener{
            val intent = Intent(this,DescriptionActivity::class.java)
            intent.putExtra("key", "carpet")
            startActivity(intent)
        }

    }
}