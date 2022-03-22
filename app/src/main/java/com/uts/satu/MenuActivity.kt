package com.uts.satu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MenuActivity : AppCompatActivity() {
    lateinit var btnLingkaran : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        btnLingkaran = findViewById(R.id.bLingkaran)
        val message = intent.getStringExtra("message_key")
        val messageTextView: TextView = findViewById(R.id.textView)
        messageTextView.text =  message
        btnLingkaran.setOnClickListener{
            var i = Intent(this,LingkaranActivity::class.java)
            startActivity(i)
        }
    }
}