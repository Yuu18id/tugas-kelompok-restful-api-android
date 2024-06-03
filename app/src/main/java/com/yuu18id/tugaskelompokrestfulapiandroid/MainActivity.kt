package com.yuu18id.tugaskelompokrestfulapiandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yuu18id.tugaskelompokrestfulapiandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            loginButton.setOnClickListener {
                val email = email.text.toString()
                val password = password.text.toString()
                if (email != "" && password != "") {
                    val i = Intent(this@MainActivity, HomeActivity::class.java)
                    i.putExtra("email", email)
                    startActivity(i)
                } else {
                    Toast.makeText(
                        this@MainActivity, "Email atau Password Salah", Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}