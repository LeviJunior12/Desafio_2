package com.example.digitalhousefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        setSupportActionBar(findViewById(R.id.toolbar))
        var actionBar = supportActionBar
        actionBar!!.title = "Register"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)

        window.setStatusBarColor(ContextCompat.getColor(this, R.color.purple_700))

        btnRegister.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}