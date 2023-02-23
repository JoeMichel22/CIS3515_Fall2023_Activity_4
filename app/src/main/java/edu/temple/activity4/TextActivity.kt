package edu.temple.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        //when an element is selected from recycler second activity should start and
        //use the intent we passed to it will set the font size


    }
}