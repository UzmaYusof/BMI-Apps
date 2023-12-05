package com.example.procrudadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.procrudadmin.databinding.ActivityFaqBinding

class FAQ : AppCompatActivity() {

    private lateinit var binding: ActivityFaqBinding

    //declare the button Next AND Back
    private lateinit var btnBack: Button
    private lateinit var btnNext2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        //initialize the component same as layout
        //the component find via id was given through layout attribute
        this.btnBack = findViewById<Button>(R.id.btnBack)
        this.btnNext2 = findViewById(R.id.btnNext2)

        //event function
        btnBack.setOnClickListener {
            //i = intent
            //to connect with other pages
            //button Back connect with about page
            val i = Intent(this, MainActivity::class.java)
            //run on the pages.Open session
            startActivity(i)
        }
                btnNext2.setOnClickListener {
                    val i = Intent(this, CalculateBMI::class.java)
                    startActivity(i)
        }

    }
}
