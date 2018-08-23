package com.kardusinfo.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val satu = findViewById<EditText>(R.id.firstT)
        val dua = findViewById<EditText>(R.id.secondT)
        val hasilnya = findViewById<TextView>(R.id.hasil)
        val btnTambah = findViewById<Button>(R.id.tambah)
        val btnKurang = findViewById<Button>(R.id.kurang)
        val btnKali = findViewById<Button>(R.id.kali)
        val btnBagi = findViewById<Button>(R.id.bagi)

        fun kurang() {
            if (satu.text.isEmpty() || dua.text.isEmpty()) {
                Toast.makeText(applicationContext, "silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = satu.text.toString().toInt()
                val b: Int = dua.text.toString().toInt()
                val c: Int = a - b
                hasilnya.setText(c.toString())
            }
        }

        fun tambah() {
            if (satu.text.isEmpty() || dua.text.isEmpty()) {
                Toast.makeText(applicationContext, "silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = satu.text.toString().toInt()
                val b: Int = dua.text.toString().toInt()
                val c: Int = a + b
                hasilnya.setText(c.toString())
            }
        }

        fun kali() {
            if (satu.text.isEmpty() || dua.text.isEmpty()) {
                Toast.makeText(applicationContext, "silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = satu.text.toString().toInt()
                val b: Int = dua.text.toString().toInt()
                val c: Int = a * b
                hasilnya.setText(c.toString())
            }
        }

        fun bagi() {
            if (satu.text.isEmpty() || dua.text.isEmpty()) {
                Toast.makeText(applicationContext, "silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                val a: Int = satu.text.toString().toInt()
                val b: Int = dua.text.toString().toInt()
                val c: Int = a / b
                hasilnya.setText(c.toString())
            }
        }

        btnTambah.setOnClickListener() { v ->
            tambah()
        }

        btnKurang.setOnClickListener() { v ->
            kurang()
        }

        btnKali.setOnClickListener(){v ->
            kali()
        }

        fun ambil1(): Int {
            val a: String = satu.text.toString()
            return a.toInt()
        }

        fun ambil2(): Int {
            val b: String = dua.text.toString()
            return b.toInt()
        }

        btnBagi.setOnClickListener{
            v -> hasilnya.text = (ambil1() / ambil2()).toString()
        }
    }
}
