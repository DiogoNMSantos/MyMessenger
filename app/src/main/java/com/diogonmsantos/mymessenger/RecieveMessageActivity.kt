package com.diogonmsantos.mymessenger

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class ReceiveMessageActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recieve_message)
        val message = intent.getStringExtra("message")
        val messageView = findViewById<TextView>(R.id.message)
        messageView.text = message
    }
}