package com.example.androidactivitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowName extends AppCompatActivity {


    private TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name);

        tt = findViewById(R.id.Showname);

        Bundle wwe = getIntent().getExtras();

        if(wwe != null) {
            tt.setText(wwe.getInt("newage"));
            Log.d("Style", "onCreate: " + wwe.getInt("newAge"));
            Log.d("Style", "onCreate: " + wwe.getString("Avengers"));
        }

       /* if(getIntent().getStringExtra("guess")!= null) {

            tt.setText(getIntent().getStringExtra("guess"));
        }*/
    }
}