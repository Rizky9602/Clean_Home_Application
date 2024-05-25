package com.muriz.clean_home

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.MuRiz.clean_home.R

class DescriptionActivity : AppCompatActivity() {
    private lateinit var back: ImageButton
    private lateinit var descModel: ImageView
    private lateinit var descTitle: TextView
    private lateinit var descPrice: TextView
    private lateinit var desc: TextView
    private lateinit var procced: Button

    private fun init() {
        descModel = findViewById(R.id.desc_model)
        descTitle = findViewById(R.id.desc_title)
        descPrice = findViewById(R.id.desc_price)
        desc = findViewById(R.id.desc_desc)
        procced = findViewById(R.id.desc_procced)
        back = findViewById(R.id.desc_back)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        init()
        val intent = intent
        val message = intent.getStringExtra("key")

        when (message) {
            "ac" -> {
                descModel.setImageResource(R.drawable.desc_ac)
                descTitle.text = resources.getString(R.string.ac_cleaning)
                descPrice.text = resources.getString(R.string.price_1)
                desc.text = resources.getString(R.string.description_ac)
            }
            "fabric" -> {
                descModel.setImageResource(R.drawable.desc_fabric)
                descTitle.text = resources.getString(R.string.clean_sofa)
                descPrice.text = resources.getString(R.string.price_2)
                desc.text = resources.getString(R.string.description_fabric)
            }
            "leather" -> {
                descModel.setImageResource(R.drawable.desc_leather)
                descTitle.text = resources.getString(R.string.clean_sofa_leather)
                descPrice.text = resources.getString(R.string.price_3)
                desc.text = resources.getString(R.string.description_leahter)
            }
            "carpet" -> {
                descModel.setImageResource(R.drawable.desc_carpet)
                descTitle.text = resources.getString(R.string.clean_carpet)
                descPrice.text = resources.getString(R.string.price_4)
                desc.text = resources.getString(R.string.description_carpet)
            }
        }

        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        procced.setOnClickListener {
            val bottomDialog  = BottomDialog();
            bottomDialog.show(supportFragmentManager,"TAG",)
        }
    }
}