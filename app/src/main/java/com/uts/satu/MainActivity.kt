package com.uts.satu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin : Button
    lateinit var usernameLogin : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin = findViewById(R.id.bLogin)
        usernameLogin = findViewById(R.id.username)
        btnLogin.setOnClickListener{
            var i = Intent(this,MenuActivity::class.java)
            val message = "Hello, " + usernameLogin.text.toString()
            i.putExtra("message_key", message)
            startActivity(i)
        }
    }
}