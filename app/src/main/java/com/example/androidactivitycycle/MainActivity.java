package com.example.androidactivitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String guess;
    private EditText enterGuess;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Cycle", "onCreate: onCreate started");
        Toast.makeText(this, "OnCreate...", Toast.LENGTH_SHORT).show();


        b1 = findViewById(R.id.button);
        enterGuess = findViewById(R.id.guess_field);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                guess = enterGuess.getText().toString().trim();

                int a = 100;
                Intent intent = new Intent(MainActivity.this,ShowName.class);
                intent.putExtra("guess", guess);
                intent.putExtra("Avengers","Thor");
                intent.putExtra("newAge",a);
                startActivity(intent);
            }
        });
    }

   //
}