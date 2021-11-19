package com.example.helloworlddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toVote;
    Button toFMReps;
    Button toLeg;
    EditText streetField;
    EditText cityField;
    EditText stateField;
    EditText zipField;
    String street;
    String city;
    String state;
    String zip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toFMReps = findViewById(R.id.toFMReps);
        toFMReps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collectUserInput();
                switchActivity(Try3.class);
            }
        });

        toLeg = findViewById(R.id.toLeg);
        toLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collectUserInput();
                switchActivity(Try3.class);
            }
        });

        //to switch to three-tabbed voting-info activity
        toVote = findViewById(R.id.toVote);
        toVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                collectUserInput();
                switchActivity(Try3.class);
            }
        });
    }
    private void switchActivity(Class name){
        Intent switchActivityIntent = new Intent(this, name);
        Bundle extras = new Bundle();
        extras.putString("street", street);
        extras.putString("city", city);
        extras.putString("state", state);
        extras.putString("zip", zip);
        switchActivityIntent.putExtras(extras);
        startActivity(switchActivityIntent);
    }

    //user input collection
    private void collectUserInput(){
        streetField = (EditText)findViewById(R.id.streetField);
        street = streetField.getText().toString();
        cityField = findViewById(R.id.cityField);
        city = cityField.getText().toString();
        stateField = findViewById(R.id.stateField);
        state = stateField.getText().toString();
        zipField = findViewById(R.id.zipField);
        zip = zipField.getText().toString();

        Toast.makeText(MainActivity.this, "street: " + street + " city: " + city + " state: " + state + " zip: " + zip, Toast.LENGTH_SHORT).show();
    }
}