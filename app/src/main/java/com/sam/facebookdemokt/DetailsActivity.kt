package com.sam.facebookdemokt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val facebookId = intent.getStringExtra("facebook_id")
        val facebookFirstName = intent.getStringExtra("facebook_first_name")
        val facebookLastName = intent.getStringExtra("facebook_last_name")
        val facebookPicture = intent.getStringExtra("facebook_picture")
        val facebookEmail = intent.getStringExtra("facebook_email")
        // initializing views
        val fbId = findViewById<TextView>(R.id.fb_id)
        fbId.text = facebookId
        val fbFName = findViewById<TextView>(R.id.f_name)
        fbFName.text = facebookFirstName
        val fbLName = findViewById<TextView>(R.id.l_name_fb)
        fbLName.text = facebookLastName
        val fbEmail = findViewById<TextView>(R.id.email_fb)
        fbEmail.text = facebookEmail
        val imageFb = findViewById<ImageView>(R.id.image_fb)
        Glide
            .with(this)
            .load(facebookPicture)
            .centerCrop()
            .placeholder(R.drawable.ic_error)
            .into(imageFb)
    }
    }
