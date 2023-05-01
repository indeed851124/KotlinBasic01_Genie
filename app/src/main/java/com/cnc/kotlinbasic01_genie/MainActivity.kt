package com.cnc.kotlinbasic01_genie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.clickBtn

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {
            //코드에 메모 남기기
            Log.d("메인화면로그","클릭용로 버튼")
            
        }
    }
}