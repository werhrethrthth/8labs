package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rButton: Button = findViewById(R.id.bnt_red)
        val gButton: Button = findViewById(R.id.bnt_green)
        val yButton: Button = findViewById(R.id.bnt_yellow)
        val textView: TextView = findViewById(R.id.txtcolor)
        val rLayout : ConstraintLayout = findViewById(R.id.root_layout)

        rButton.setOnClickListener{
            textView.setText(resources.getText(R.string.red))
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
            textView.setTextSize(10F)
        }
        gButton.setOnClickListener{
            textView.setText(resources.getText(R.string.green))
            rLayout.setBackgroundColor((resources.getColor(R.color.greenColor, null)))
            textView.setTextSize(15F)
        }
        yButton.setOnClickListener{
            textView.setText(resources.getText(R.string.yellow))
            rLayout.setBackgroundColor((resources.getColor(R.color.yellowColor, null)))
            textView.setTextSize(20F)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}