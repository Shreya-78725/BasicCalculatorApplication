package com.example.basiccalculatorapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var bplus:Button
    lateinit var bminus:Button
    lateinit var bmul:Button
    lateinit var bdiv:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var num1=findViewById<EditText>(R.id.Num1)
        var num2=findViewById<EditText>(R.id.Num2)
        var ans=findViewById<TextView>(R.id.result)

        bplus=findViewById(R.id.btnplus)
        bminus=findViewById(R.id.btnminus)
        bmul=findViewById(R.id.btnmul)
        bdiv=findViewById(R.id.btndiv)
        bplus.setOnClickListener{
            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var answer=addnum1 + addnum2
            ans.text = " $answer"
        }

        bminus.setOnClickListener{
            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var answer=addnum1 - addnum2
            ans.text = " $answer"
        }
        bmul.setOnClickListener{
            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var answer=addnum1 * addnum2
            ans.text = "$answer"
        }
        bdiv.setOnClickListener{
            var addnum1=num1.text.toString().toInt()
            var addnum2=num2.text.toString().toInt()
            var answer=addnum1 / addnum2
            ans.text = "$answer"
        }
        var Clear=findViewById<Button>(R.id.clear)
        Clear.setOnClickListener{
            finish()
        }

    }
}