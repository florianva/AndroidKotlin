package fr.florianvansteene.androidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class KotlinActivity : AppCompatActivity(), View.OnClickListener {

    private var value1: EditText? = null
    private var value2: EditText? = null
    private var calculate: Button? = null
    private var operator: Spinner? = null
    private var tvResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        value1 = findViewById(R.id.value1)
        value2 = findViewById(R.id.value2)
        calculate = findViewById(R.id.btCalculate)
        operator = findViewById(R.id.selectedOperator)
        tvResult = findViewById(R.id.tvResult)

        calculate!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btCalculate) {
            tvResult!!.setText(R.string.DefaultResult)
            val v1 = value1!!.text.toString()
            val v2 = value2!!.text.toString()
            try {
                val num = Integer.parseInt(v1)
                val num2 = Integer.parseInt(v2)
                val op = operator!!.selectedItem.toString()
                var result: String? = null
                when (op) {
                    "+" -> result = (num + num2).toString()
                    "-" -> result = (num - num2).toString()
                    "x" -> result = (num * num2).toString()
                    "/" -> result = (num / num2).toString()
                }

                tvResult!!.text = "Your result is $result ! :)"


            } catch (e: NumberFormatException) {
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show()
            }

        }
    }
}
