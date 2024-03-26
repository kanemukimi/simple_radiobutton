package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton1 = findViewById(R.id.radio1);
        radioButton2 = findViewById(R.id.radio2);
        radioButton3 = findViewById(R.id.radio3);
        button = findViewById(R.id.btnsubmit);
        // on click for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a string for the selected answer
                String SelectedAns="Nothing Selected";

                // check if the radio button is checked or not
                if (radioButton1.isChecked()){
                    SelectedAns=radioButton1.getText().toString();
                }
                // for radiobutton2
                else if (radioButton2.isChecked()){
                    SelectedAns=radioButton2.getText().toString();
                }
                // for radio button3
                else if (radioButton3.isChecked()){
                    SelectedAns=radioButton3.getText().toString();
                }
                // check on the selected answer if its equal to the character answer
                if(SelectedAns.equals("JavaScript Object Notation")){
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }
                else
                Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            }
        });
    }
}