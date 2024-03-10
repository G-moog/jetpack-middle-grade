package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

// DataBinding
// 이름처럼, 뭔가 데이터를 어쩌고 저쩌고 해줄 수 없을까?(연결)
// 데이터 결합

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var testCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 기존의 방법
        // binding.tvTest.text = "바뀐 텍스트"

        // 데이터 결합
        val person = Person("피카츄", 30)
        binding.user = person
    }

    fun myClick(view: View){
        Log.d("MainActivity", "버튼 클릭했어!!!!!!")
        testCount++

        val person = Person("꼬부기", testCount)
        binding.user = person

    }
}