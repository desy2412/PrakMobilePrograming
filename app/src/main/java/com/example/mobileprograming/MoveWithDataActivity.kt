package com.example.mobileprograming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_JURUSAN = "extra_jurusan"
        const val EXTRA_PRODI = "extra_prodi"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val receiveData = findViewById<TextView>(R.id.dataReceive)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val jurusan= intent.getStringExtra(EXTRA_JURUSAN)
        val prodi = intent.getStringExtra(EXTRA_PRODI)
        val text = "Name : $name, Your Age : $age, Jurusan :$jurusan, Prodi : $prodi"
        receiveData.text = text

    }
}