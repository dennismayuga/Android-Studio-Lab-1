package com.example.reversestringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView reverseStringText_View;
    private EditText inputStringEdit_Text;
    private Button reverseStringButton;
    private String inputString;
    private String reverseSring;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reverseStringButton = (Button) findViewById(R.id.reverse_string_button);
        reverseStringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reverseSring="";
                inputStringEdit_Text = (EditText) findViewById(R.id.input_string_edit_text);
                inputString = inputStringEdit_Text.getText().toString();
                for (int i=inputString.length()-1;i>=0;i--){
                    reverseSring+= inputString.charAt(i);
                }
                reverseStringText_View =(TextView) findViewById(R.id.reverse_string_text_view);
                reverseStringText_View.setText(reverseSring);


            }
        });






    }
}