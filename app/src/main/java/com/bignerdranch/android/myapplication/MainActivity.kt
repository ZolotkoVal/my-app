package com.bignerdranch.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var okButton: Button
    private lateinit var priceInput: EditText
    private lateinit var discountAmountText: TextView
    private lateinit var discountSeekBar: SeekBar
    private lateinit var dollarRadioButton: RadioButton
    private lateinit var euroRadioButton: RadioButton
    private lateinit var poundRadioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}