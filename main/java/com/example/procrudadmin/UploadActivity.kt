package com.example.procrudadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.procrudadmin.databinding.ActivityUploadBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UploadActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUploadBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.saveButton.setOnClickListener {

            val name = binding.uploadName.text.toString()
            val age = binding.uploadAge.text.toString()
            val gender = binding.uploadGender.text.toString()
            val phone = binding.uploadPhone.text.toString()
            database = FirebaseDatabase.getInstance().getReference("Users")
            val users = User(name,age,gender,phone)
            database.child(phone).setValue(users).addOnSuccessListener {
                binding.uploadName.text.clear()
                binding.uploadAge.text.clear()
                binding.uploadGender.text.clear()
                binding.uploadPhone.text.clear()

                Toast.makeText(this,"Saved", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@UploadActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }.addOnFailureListener{
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}