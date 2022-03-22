package com.uts.satu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LingkaranActivity : AppCompatActivity() {
    lateinit var txtJariJari : EditText
    lateinit var viewHasil : EditText
    lateinit var btnHitung : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)
        txtJariJari = findViewById(R.id.jariJari)
        viewHasil = findViewById(R.id.hasil)
        btnHitung = findViewById(R.id.bHitung)

        btnHitung.setOnClickListener{
            var jariJari : Int = Integer.parseInt(txtJariJari.text.toString())
            var hasil : Double = 3.14 * jariJari * jariJari

            viewHasil.setText(hasil.toString())
        }
    }
}