package com.neppplus.kotlinbasic_20210819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logBtn02.setOnClickListener {
            Log.d("메인화면", "두번째 로그 버튼 눌림")
        }

        toastBtn2.setOnClickListener {
            Toast.makeText(this, "두번째 토스트", Toast.LENGTH_SHORT).show()

        }

        toastBtn.setOnClickListener {

//            사용자에게 알림 (토스트) 띄우기.

            Toast.makeText(this, "연습용 토스트 띄우기", Toast.LENGTH_SHORT).show()

        }

        logBtn01.setOnClickListener {

            // 무슨 말을 적어도 괜찮다. (메모 - 주석)
//            Ctrl + / : 주석 다는 단축키

            Log.d("메인화면", "첫번째 로그 버튼 눌림")
            Log.e("메인화면", "e로 로그 찍어봄")
            Log.i("메인화면", "i로 로그 찍기")


        }

    }
}

















