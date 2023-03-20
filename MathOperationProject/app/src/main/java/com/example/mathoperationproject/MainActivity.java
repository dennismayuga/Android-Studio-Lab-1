package com.example.mathoperationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText inputX;
    private EditText inputY;
    private TextView addition;
    private TextView subtraction;
    private TextView product;
    private TextView divide;
    private Button CalcButton;
    private Float x;
    private Float y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CalcButton = (Button) findViewById(R.id.button);
        CalcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            inputX = (EditText) findViewById(R.id.x);
            inputY = (EditText) findViewById(R.id.y);

            addition = (TextView) findViewById(R.id.addition);
            subtraction = (TextView) findViewById(R.id.subtraction);
            product = (TextView) findViewById(R.id.product);
            divide = (TextView) findViewById(R.id.divide);


            try {
                x = Float.valueOf(inputX.getText().toString());
                y = Float.valueOf(inputY.getText().toString());

                addition.setText("Addition of x + y = "+String.valueOf(x+y));
                subtraction.setText("Subtraction of x + y = "+String.valueOf(x-y));
                product.setText("Product of x + y = "+String.valueOf(x*y));
                divide.setText("Divide of x + y = "+String.valueOf(x/y));
            } catch(Exception e){

                addition.setText("ERROR INVALID INPUT");
                subtraction.setText("ERROR INVALID INPUT");
                product.setText("ERROR INVALID INPUT");
                divide.setText("ERROR INVALID INPUT");
            }














            }
        });





    }
}