package com.royalaviation.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayActivityGreeting : AppCompatActivity() {

    companion object {
        const val  NAME_EXTRA= "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)

        val nameTV : TextView = findViewById(R.id.bdayGreet)
        nameTV.text = "Happy Birthday\n$name!"
    }
}