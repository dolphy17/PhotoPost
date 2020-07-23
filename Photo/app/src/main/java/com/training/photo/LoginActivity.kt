package com.training.photo

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.training.photo.R


class LoginActivity : AppCompatActivity() {

    lateinit var mLoginBtn : Button
    lateinit var mCreateUser : TextView
    lateinit var mForgetPass : TextView
    lateinit var mLoginEmail : EditText
    lateinit var mLoginPass : EditText
    lateinit var mProgressbar : ProgressDialog

    lateinit var mAuth  : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        mCreateUser = findViewById(R.id.loginCreateBtn)
        mLoginBtn = findViewById(R.id.postBtn)
        mLoginEmail = findViewById(R.id.loginEmail)
        mLoginPass = findViewById(R.id.loginPassword)
        mForgetPass = findViewById(R.id.loginForgetPass)

        mCreateUser.setOnClickListener {

            val regiterIntent = Intent(applicationContext , RegisterActivity::class.java)
            startActivity(regiterIntent)
            finish()
        }
    }
}

