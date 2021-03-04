package com.sam.facebookdemokt
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth

class DetailsActivity : AppCompatActivity() {
    lateinit var mFirebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
//        val facebookId = intent.getStringExtra("facebook_id")
//        val facebookFirstName = intent.getStringExtra("facebook_first_name")
//        val facebookLastName = intent.getStringExtra("facebook_last_name")
//        val facebookPicture = intent.getStringExtra("facebook_picture")
//        val facebookEmail = intent.getStringExtra("facebook_email")
        // initializing views
        var token = getSharedPreferences("login", Context.MODE_PRIVATE)
        val fbId = findViewById<TextView>(R.id.fb_id)
        fbId.text = token.getString("facebook_id", "")
        val fbFName = findViewById<TextView>(R.id.f_name)
        fbFName.text = token.getString("facebook_first_name", "")
        val fbLName = findViewById<TextView>(R.id.l_name_fb)
        fbLName.text = token.getString("facebook_last_name", "")
        val fbEmail = findViewById<TextView>(R.id.email_fb)
        fbEmail.text = token.getString("facebook_email", "")
        val imageFb = findViewById<ImageView>(R.id.image_fb)
        var facebookPicture = token.getString("facebook_picture", "")
           Glide.with(applicationContext)
               .load(facebookPicture)
               .centerCrop()
               .placeholder(R.drawable.ic_error)
               .into(imageFb)
    }
}
