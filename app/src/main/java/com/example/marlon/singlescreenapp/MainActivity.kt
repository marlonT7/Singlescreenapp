package com.example.marlon.singlescreenapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phone = findViewById<TextView>(R.id.phone)


        phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL_BUTTON);
            intent.data = Uri.parse("tel:${phone.text}");
            startActivity(intent)
        }

    }
}
