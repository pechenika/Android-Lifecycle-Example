package com.pechenika.androidlifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "MainActivity: onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(applicationContext, "MainActivity: onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(applicationContext, "MainActivity: onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(applicationContext, "MainActivity: onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(applicationContext, "MainActivity: onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(applicationContext, "MainActivity: onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(applicationContext, "MainActivity: onDestroy", Toast.LENGTH_SHORT).show()
    }

    fun buttonTransparent() {
        Toast.makeText(applicationContext, "MainActivity: buttonTransparent", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, TransparentActivity::class.java)
        startActivity(intent)
    }

    fun buttonThird() {
        Toast.makeText(applicationContext, "MainActivity: buttonThird", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}
