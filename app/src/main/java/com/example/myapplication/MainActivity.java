package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    TextView result;
    Button btnPress, btnClear, Add, Sub, Mul, Div;
    EditText input1, input2, out;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.txtResult);
        input1=findViewById(R.id.txtInput1);
        input2=findViewById(R.id.txtInput2);
        Add=findViewById(R.id.btnAdd);
        Sub=findViewById(R.id.btnSub);
        Mul=findViewById(R.id.btnMul);
        Div=findViewById(R.id.btnDiv);

        //Operations//

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double Input1 =Double.parseDouble(input1.getText().toString());
                double Input2 =Double.parseDouble(input2.getText().toString());
                double sum = Input1 + Input2;

                result.setText(String.valueOf(sum));
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Input1 =Double.parseDouble(input1.getText().toString());
                double Input2 =Double.parseDouble(input2.getText().toString());
                double Sub = Input1 - Input2;

                result.setText(String.valueOf(Sub));
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Input1 =Double.parseDouble(input1.getText().toString());
                double Input2 =Double.parseDouble(input2.getText().toString());
                double mul = Input1 * Input2;

                result.setText(String.valueOf(mul));
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Input1 =Double.parseDouble(input1.getText().toString());
                double Input2 =Double.parseDouble(input2.getText().toString());
                double div = Input1 / Input2;

                result.setText(String.valueOf(div));
            }
        });

    }
}