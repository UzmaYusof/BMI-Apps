package com.example.procrudadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.example.procrudadmin.databinding.ActivityCalculateBmiBinding
import com.example.procrudadmin.databinding.ActivityUpdateBinding
import com.google.firebase.database.DatabaseReference
import java.text.DecimalFormat

class CalculateBMI : AppCompatActivity() {

    private lateinit var binding: ActivityCalculateBmiBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBmiBinding.inflate(layoutInflater)
        setContentView(binding.root)


    //declare component that will use
    //lateinit - never initialize the button btn1 - btnCalculate
    lateinit var b1 : Button
    //lateinit - never initialize the button btn2 - btnReset2
    lateinit var b2 : Button
    //lateinit - never initialize the textview - edittextStatus
    lateinit var t1 : TextView
    //lateinit - never initialize the EditText "editTHeight
    lateinit var height : EditText
    //lateinit - never initialize the EditText "editTWeight
    lateinit var weight : EditText


        b1 = findViewById<Button>(R.id.btnCalculate)
        b2 = findViewById<Button>(R.id.btnReset2)
        t1 = findViewById<TextView>(R.id.tvStatus)
        height = findViewById<EditText>(R.id.editTextHeight)
        weight = findViewById<EditText>(R.id.editTextWeight)


        //initialize function decimal
        val df = DecimalFormat("##.##")
        //set function for button Calculate
        b1.setOnClickListener {
            var heightVal: Double = height.text.toString().toDouble()
            var weightVal: Double = weight.text.toString().toDouble()
            //calculate the BMI accordingly to the formula
            var calculate = weightVal / (heightVal * heightVal)
            t1.text = df.format(calculate).toString()

        }
        //set function for button Reset
        b2.setOnClickListener {
            //to reset all amount
            height.setText("")
            weight.setText("")
            t1.text = ""
        }

    }
}