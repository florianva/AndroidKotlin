package fr.florianvansteene.androidkotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class JavaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText value1, value2;
    private Button calculate;
    private Spinner operator;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        value1 = findViewById(R.id.value1);
        value2 = findViewById(R.id.value2);
        calculate = findViewById(R.id.btCalculate);
        operator = findViewById(R.id.selectedOperator);
        tvResult = findViewById(R.id.tvResult);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btCalculate) {
            tvResult.setText(R.string.DefaultResult);
            String v1 = value1.getText().toString();
            String v2 = value2.getText().toString();
            try {
                int num = Integer.parseInt(v1);
                int num2 = Integer.parseInt(v2);
                String op = operator.getSelectedItem().toString();
                String result = null;
                switch (op){
                    case "+" : result = String.valueOf(num + num2); break;
                    case "-" : result = String.valueOf(num - num2); break;
                    case "x" : result = String.valueOf(num * num2); break;
                    case "/" : result = String.valueOf(num / num2); break;
                }

                tvResult.setText("Your result is "+result+" ! :)");


            } catch (NumberFormatException e) {
                Toast.makeText(this,"Please enter a number", Toast.LENGTH_LONG).show();
            }
        }
    }
}
