package com.example.soliuhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)




        var buttontwo = findViewById<Button>(R.id.button2)
        buttontwo.setOnClickListener {
            val intent2 = Intent (this, MainActivity::class.java)
            startActivity(intent2)
        }


    }
}


