package fr.florianvansteene.androidkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btJava = findViewById(R.id.btJava) as Button
        var btKotlin = findViewById(R.id.btKotlin) as Button

        btJava.setOnClickListener {
            val intent = Intent(this, JavaActivity::class.java)
            startActivity(intent);
        }

        btKotlin.setOnClickListener {
            val intent = Intent(this, KotlinActivity::class.java)
            startActivity(intent);
        }
    }
}
