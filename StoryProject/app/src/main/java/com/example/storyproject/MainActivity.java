package com.example.storyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button displayStoryButton;
    private TextView storyOutput;
    private EditText nameInput;
    private EditText ageInput;
    private EditText cityInput;
    private EditText collegeNameInput;
    private EditText professionInput;
    private EditText animalTypeInput;
    private EditText petNameInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    displayStoryButton = (Button) findViewById(R.id.story_button);
    storyOutput = (TextView) findViewById(R.id.story_text_view) ;
    nameInput = (EditText) findViewById(R.id.name_text_view) ;
    ageInput = (EditText) findViewById(R.id.age_text_view);
    cityInput = findViewById(R.id.city_text_view);
    collegeNameInput = findViewById(R.id.college_name_text_view);
    professionInput = findViewById(R.id.profession_text_view);
    animalTypeInput = findViewById(R.id.animal_type_text_view);
    petNameInput = findViewById(R.id.pet_name_text_view);


    displayStoryButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            // creating constructor object using story inputs pulling from input EditText sections
            Story story = new Story(nameInput.getText().toString(),ageInput.getText().toString(),cityInput.getText().toString(),collegeNameInput.getText().toString(),professionInput.getText().toString(),animalTypeInput.getText().toString(), petNameInput.getText().toString());

            storyOutput.setText(story.toString());




        }
    });




    }
}