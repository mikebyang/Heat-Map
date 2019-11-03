package com.example.heatmap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //numeric progress display and progress bar display
        val numProg = findViewById<TextView>(R.id.numProg)
//        val dispProg = findViewById<ProgressBar>(R.id.dispProg)
        val loadProg = 0
        numProg.setText(loadProg)


        //go to next screen after loading all the data from the file
//        val intent = Intent(this, usage_heatmap::class.java)
//        startActivity(intent)
    }
}
