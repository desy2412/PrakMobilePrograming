package com.example.mobileprograming

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
    private lateinit var input_panjang: EditText
    private lateinit var input_lebar: EditText
    private lateinit var input_tinggi: EditText
    private lateinit var btn: Button
    private lateinit var teks_hasil: TextView
    private lateinit var result: TextView

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input_panjang = findViewById(R.id.edt_length)
        input_lebar = findViewById(R.id.edt_width)
        input_tinggi = findViewById(R.id.edt_height)
        btn = findViewById(R.id.btn_result)
        teks_hasil = findViewById(R.id.result)
        result = findViewById(R.id.result)
        btn.setOnClickListener (this )

        if (savedInstanceState != null){
            result.text = savedInstanceState.getString( STATE_RESULT)
        }
    }

    override fun onClick(v: View?) {
        if (v?.id==R.id.btn_result) {
            val tinggi = input_tinggi.text.toString().trim()
            val lebar = input_lebar.text.toString().trim()
            val panjang = input_panjang.text.toString().trim()
            val volume = panjang.toDouble()*tinggi.toDouble()*lebar.toDouble()
            teks_hasil.text = volume.toString()
            }

        }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, result.text.toString())
    }

    }
