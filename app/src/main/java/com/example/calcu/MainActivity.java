    package com.example.calcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public
class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    EditText edone, edtwo;
    TextView tvAns;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edone = findViewById(R.id.edone);
        edtwo = findViewById(R.id.edtwo);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tvAns = findViewById(R.id.tvAns);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                int firstValue, SecondValue, Ans;
                firstValue = Integer.parseInt(edone.getText().toString());
                SecondValue = Integer.parseInt(edtwo.getText().toString());

                Ans = firstValue + SecondValue ;
                tvAns.setText("Ans : "+Ans);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                int firstValue, SecondValue, Ans;
                firstValue = Integer.parseInt(edone.getText().toString());
                SecondValue = Integer.parseInt(edtwo.getText().toString());

                Ans = firstValue - SecondValue ;
                tvAns.setText("Ans : "+Ans);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                int firstValue, SecondValue, Ans;
                firstValue = Integer.parseInt(edone.getText().toString());
                SecondValue = Integer.parseInt(edtwo.getText().toString());

                Ans = firstValue * SecondValue ;
                tvAns.setText("Ans : "+Ans);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                int firstValue, SecondValue, Ans;
                firstValue = Integer.parseInt(edone.getText().toString());
                SecondValue = Integer.parseInt(edtwo.getText().toString());

                Ans = firstValue / SecondValue ;
                tvAns.setText("Ans : "+Ans);
            }
        });
    }
}