package fr.florianvansteene.androidkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btJava = findViewById(R.id.btJava) as Button
        var btKotlin = findViewById(R.id.btKotlin) as Button

        btJava!!.setOnClickListener(this)
        btKotlin!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btJava) {
            val intent = Intent(this, JavaActivity::class.java)
            startActivity(intent)
        }
        if (v.id == R.id.btKotlin) {
            val intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent)
        }
    }
}
