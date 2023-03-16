package com.example.prac04

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

setListeners()
    }

    private fun makeColored(view: View){
        when(view.id){

            //Boxes using class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_four_text -> view.setBackgroundColor(Color.RED)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners(){
        val boxOneText=findViewById<TextView>(R.id.box_one_text)
        val boxTwoText=findViewById<TextView>(R.id.box_two_text)
        val boxThreeText=findViewById<TextView>(R.id.box_three_text)
        val boxFourText=findViewById<TextView>(R.id.box_four_text)
        val boxFiveText=findViewById<TextView>(R.id.box_five_text)

        val rootContraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableView : List<View> =
            listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootContraintLayout)

        for (item in clickableView){
        item.setOnClickListener{
            makeColored(it)
        }

        }

    }
}