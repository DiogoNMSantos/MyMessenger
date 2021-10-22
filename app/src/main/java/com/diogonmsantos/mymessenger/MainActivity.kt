package com.diogonmsantos.mymessenger

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSendMessage(view: android.view.View) {
//        val intent = Intent(this, ReceiveMessageActivity::class.java)
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"

        val messageView = findViewById<EditText>(R.id.message)
        val messageText = messageView.text.toString()

        intent.putExtra(Intent.EXTRA_TEXT, messageText)
        val chooserTitle = getString(R.string.chooser)
        val chosenIntent = Intent.createChooser(intent, chooserTitle)
//        intent.putExtra("message", messageText)
        startActivity(chosenIntent)
    }
}