package com.example.procrudadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.procrudadmin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mainUpload.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, UploadActivity::class.java)
            startActivity(intent)
            finish()
        })
        binding.mainUpdate.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, UpdateActivity::class.java)
            startActivity(intent)
        })
        binding.mainDelete.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, DeleteActivity::class.java)
            startActivity(intent)
        })

        binding.mainFAQ.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, FAQ::class.java)
            startActivity(intent)
        })
        binding.mainCalculate.setOnClickListener(View.OnClickListener{
            val intent = Intent(this@MainActivity, CalculateBMI::class.java)
            startActivity(intent)
        })

        }
    }

