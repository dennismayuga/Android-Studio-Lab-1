package com.example.temperatureproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView conversionTextView;
    private EditText inputPlainText;
    private Button convertButton;
    private Double calculation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    convertButton = (Button) findViewById(R.id.button);
    convertButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        inputPlainText = (EditText) findViewById(R.id.input_plain_text);
        conversionTextView = (TextView) findViewById(R.id.output_text_view);
        try {
            calculation = (Double.valueOf(inputPlainText.getText().toString()) - 32) * 5 / 9;             // committing calculation

            DecimalFormat df = new DecimalFormat(".00");
            conversionTextView.setText("Temperature in Celsius is:"+'\n'+String.valueOf(df.format(calculation)));
        }catch (Exception e){

            conversionTextView.setText("ERROR INVALID INPUT");
        }
        }




    });

    }
}