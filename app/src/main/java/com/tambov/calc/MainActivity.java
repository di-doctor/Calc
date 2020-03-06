package com.tambov.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button plus;
    Button divide;
    Button multiple;
    Button difference;
    EditText number1;
    EditText number2;
    EditText total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        total = findViewById(R.id.total);
        plus = findViewById(R.id.button_plus);

        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        float firstNumber = Float.parseFloat(number1.getText().toString());
                        float secondNumber = Float.parseFloat(number2.getText().toString());
                        total.setText("" + (firstNumber + secondNumber));
                    }
                }
        );
    }
}
