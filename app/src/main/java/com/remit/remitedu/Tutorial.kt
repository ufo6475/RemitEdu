package com.remit.remitedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tutorial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)

        clickEvent()
    }

    //클릭 이벤트 모음
    private fun clickEvent(){
        var tT= findViewById<TextView>(R.id.tutorialTemp)

        tT.setOnClickListener {
            val intent = Intent(this, MakeStep1::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }
    }
}