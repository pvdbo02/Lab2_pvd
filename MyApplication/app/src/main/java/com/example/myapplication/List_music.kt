package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_music.*

class List_music : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_music)
        title = "Thêm bài hát"

        btn_save.setOnClickListener {
//            val intent: Intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
            finish()
        }
    }
}