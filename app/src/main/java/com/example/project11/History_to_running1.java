package com.example.project11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class History_to_running1 extends AppCompatActivity {

    private ImageButton image_btn1_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ImageButton image_btn1_click = findViewById(R.id.image_btn1_click);
        image_btn1_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.project11.History_to_running1.this, running1_to_history.class);
                startActivity(intent); //액티비티 이동
                finish();
            }
        });
    }
}