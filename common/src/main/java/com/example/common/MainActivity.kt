package com.example.common

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.textview.MaterialTextView


class MainActivity : AppCompatActivity() {

    private lateinit var buttonStart:Button
    private lateinit var etName:AppCompatEditText
    private lateinit var home_LBL_ad: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()

        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

    private fun findViews() {
        buttonStart = findViewById(R.id.btn_start)
        etName = findViewById(R.id.et_name)
        home_LBL_ad = findViewById(R.id.home_LBL_ad)
        initAds()
    }

    private fun initAds() {
        val id: String = App_Parent.adId
        home_LBL_ad.setText(id)
    }
}

