package com.example.third

import android.app.NotificationManager
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.content_detail.*

const val DETAIL_ACTIVITY_INTENT_STATUS_KEY = "Status"
const val DETAIL_ACTIVITY_INTENT_FILENAME_KEY = "FileName"

class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        val notificationManager = getSystemService(NotificationManager::class.java)
        notificationManager.cancelAll()

        val fileName = intent.getStringExtra(DETAIL_ACTIVITY_INTENT_STATUS_KEY)
        fileNameValue.text = fileName

        val status = intent.getStringExtra(DETAIL_ACTIVITY_INTENT_FILENAME_KEY)
        statusValue.text = status

        button.setOnClickListener {
            finish()
        }
    }
}
