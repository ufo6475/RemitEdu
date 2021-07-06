package com.remit.remitedu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.remit.remitedu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //firstCheck()
        clickEvent()
    }

    //클릭 이벤트 모음
    private fun clickEvent(){
        binding.mainTempNext.setOnClickListener {
            val intent = Intent(this, MakeStep1::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }
    }

/* 현재 문제 있음(2번째 실행시 오류)
    //처음 왔는지 체크해서 튜토리얼 페이지로
    private fun firstCheck(){
        val pref = getSharedPreferences("checkFirst", Activity.MODE_PRIVATE)
        val checkFirst = pref.getBoolean("checkFirst",false)

        if(!checkFirst){
            pref.edit().putBoolean("checkFirst",true)
            pref.edit().commit()
            val intent = Intent(this, Tutorial::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        }
    }
 */
}