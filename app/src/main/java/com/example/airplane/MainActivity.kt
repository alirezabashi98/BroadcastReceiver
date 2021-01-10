package com.example.airplane

import android.content.IntentFilter
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),myBrodcast.setData {

    lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Cast()

    }

    override fun onStart() {
        super.onStart()
        this.registerReceiver(myBrodcast(this), IntentFilter("android.intent.action.AIRPLANE_MODE"))
    }

    private fun Cast() {

        txt = findViewById(R.id.textView_main)

    }

    override fun onAirplaneMode(text: String) {
        txt.text = text
    }


}