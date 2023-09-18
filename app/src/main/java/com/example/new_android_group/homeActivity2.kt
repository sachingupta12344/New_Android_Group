package com.example.new_android_group

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.LabeledIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class homeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val button=findViewById<Button>(R.id.next)
        button.setOnClickListener {
          showdialog()
        }
        customDialog()
    }
    @SuppressLint("MissingInflatedId")
    fun customDialog(){
        val alertDialog = AlertDialog.Builder(this)
         val view=LayoutInflater.from(this).inflate(R.layout.custom_dialog,null,false)

        val ram =  intent.extras?.getString("name")
        val mohan =  intent.extras?.getString("email")
        val sohan =  intent.extras?.getString("password")
        val sachin =  intent.extras?.getString("phone")

        val name =findViewById<TextView>(R.id.text1)
        val email= findViewById<TextView>(R.id.em)
        val password= findViewById<TextView>(R.id.pass)
        val phone = findViewById<TextView>(R.id.mon)

        name.text=ram
        email.text = mohan
        password.text = sohan
        phone.text = sachin
    }
    fun showdialog(){
        val alertDialog=AlertDialog.Builder(this)
        alertDialog.setNeutralButton("Cencle",DialogInterface.OnClickListener{dialogInterface, i ->
            Toast.makeText( this,"Cancled", Toast.LENGTH_SHORT).show()
        })

        alertDialog.setPositiveButton("Yes",DialogInterface.OnClickListener{dialogInterface, i ->
            onBackPressed()
            Toast.makeText(this,"successfull", Toast.LENGTH_SHORT).show()
        })
        alertDialog.setNegativeButton("No",DialogInterface.OnClickListener{dialogInterface, i ->
            Toast.makeText(this, "WelCome To My Page", Toast.LENGTH_SHORT).show()
        })

        val dialog = alertDialog.create()
        dialog.setTitle("Greeting")
        dialog.setMessage("Are you Soure")
        dialog.show()
    }
}