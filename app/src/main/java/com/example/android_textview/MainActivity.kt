package com.example.android_textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        var et_sixth = findViewById<TextInputLayout>(R.id.et_sixth)
        var et_fourth = findViewById<TextInputLayout>(R.id.et_fourth)


        checkFourthInput(et_fourth)
        checkSixthInput(et_sixth)

    }

    private fun checkSixthInput(etSixth: TextInputLayout) {
        etSixth.error = "Error"
    }


    private fun checkFourthInput(etFourth: TextInputLayout) {
        etFourth.setStartIconOnClickListener {
            Toast.makeText(this, "icon clicked", Toast.LENGTH_SHORT).show()
        }
    }
}