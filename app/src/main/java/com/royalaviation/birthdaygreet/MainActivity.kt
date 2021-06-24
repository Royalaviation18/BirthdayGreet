package com.royalaviation.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun createBirthdayCard(view: View) {

        val nameInput : EditText= findViewById(R.id.nameInput)

        val name=nameInput.text.toString()


       // Toast.makeText(this,"Name is $name",Toast.LENGTH_SHORT).show()

        val intent = Intent(this,BirthdayActivityGreeting::class.java)
        intent.putExtra(BirthdayActivityGreeting.NAME_EXTRA,name)
        startActivity(intent)

    }
}