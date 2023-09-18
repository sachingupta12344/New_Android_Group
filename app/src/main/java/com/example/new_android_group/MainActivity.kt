package com.example.new_android_group

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn =findViewById<Button>(R.id.next)

        val name = findViewById<EditText>(R.id.name)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val phone = findViewById<EditText>(R.id.phone)

        btn.setOnClickListener{
            val intent = Intent(this,homeActivity2::class.java)
            intent.putExtra("name","${name.text}")
            intent.putExtra("email","${email.text}")
            intent.putExtra("password","${password.text}")
            intent.putExtra("phone","${phone.text}")
            startActivity(intent)
        }
    }
}