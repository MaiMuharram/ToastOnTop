package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t_Button.setOnClickListener{
            val tost = Toast.makeText(this,R.string.correct_msg, Toast.LENGTH_LONG)
            tost.setGravity(Gravity.TOP,0,0)
            tost.show()
        }

        f_Button.setOnClickListener{
            val tost = Toast.makeText(this,R.string.incorrect_msg, Toast.LENGTH_LONG)
            tost.setGravity(Gravity.TOP,0,0)
            tost.show()
        }
    }
}