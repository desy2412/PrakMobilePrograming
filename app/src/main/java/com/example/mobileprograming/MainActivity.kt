package com.example.mobileprograming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.service.autofill.OnClickAction
import android.view.ActionMode
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // deklarasi variable
    private lateinit var btn_switch: Button
    private lateinit var btn_move : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_switch = findViewById(R.id.btn_switch)
        btn_switch.setOnClickListener(this)
        btn_move = findViewById(R.id.btn_move)
        btn_move.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_switch -> {
                val move = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(move)
            }
            R.id.btn_move -> {
                val intentData = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                intentData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Desy Rahmayanti")
                intentData.putExtra(MoveWithDataActivity.EXTRA_AGE, 20)
                intentData.putExtra(MoveWithDataActivity.EXTRA_JURUSAN, "Teknik Elektronika")
                intentData.putExtra(MoveWithDataActivity.EXTRA_PRODI, "Pendidikan Teknik Informatika")
                startActivity(intentData)
            }
        }
    }
}
