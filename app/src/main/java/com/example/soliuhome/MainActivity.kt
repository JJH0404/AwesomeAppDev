package com.example.soliuhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.DateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity() {

yoon
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent1 = Intent (this, activity2::class.java)
            startActivity(intent1)
        }
        val calendar = Calendar.getInstance().time
        val dateFormat = DateFormat.getDateInstance().format(calendar)
        val dateTextView = findViewById<TextView>(R.id.dateTime)
        dateTextView.text = dateFormat

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent2 = Intent(this, calendar_progress::class.java)
            startActivity(intent2)
        }


    }
}