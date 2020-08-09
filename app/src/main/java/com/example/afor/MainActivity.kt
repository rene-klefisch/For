package com.example.afor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = listOf("Hallo", "Test", "noch etwas")
        var ausgabe = ""
        /*for (i in text) {
            ausgabe = ausgabe + i
        }
         */

        var i = 0
        while(i < 10) {
            textfeld.text = i.toString()
            i++
        }

        //textfeld.text = ausgabe
    }
}