package com.example.project11;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project11.History_to_running1;
import com.example.project11.R;

import static com.example.project11.R.menu.menu_main;

public class Mainmenu_to_history extends AppCompatActivity {

    private Button menu_search;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(menu_main);

        Button menu_search = findViewById(R.id.menu_search);
        menu_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(com.example.project11.Mainmenu_to_history.this , History_to_running1.class);
                startActivity(intent); //액티비티 이동
                finish();
            }
        });
    }
}
