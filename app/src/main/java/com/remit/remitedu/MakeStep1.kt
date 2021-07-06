package com.remit.remitedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import com.remit.remitedu.databinding.ActivityMainBinding
import com.remit.remitedu.databinding.ActivityMakeStep1Binding

class MakeStep1 : AppCompatActivity() {
    private lateinit var binding: ActivityMakeStep1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMakeStep1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        clickEvent()
        aboutUI()
    }

    private fun aboutUI(){
        var goalList = arrayOf("영어회화","토익","독서","다이어트")
        binding.makeStep1Spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,goalList)
    }

    //클릭 이벤트 모음
    private fun clickEvent(){
        binding.makeStep1Next.setOnClickListener {
            val intent = Intent(this, MakeStep2::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }
    }
}