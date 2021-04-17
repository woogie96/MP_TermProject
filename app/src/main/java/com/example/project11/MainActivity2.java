package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.project11.R;

public class MainActivity2 extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.menu_refresh:
                Intent intent=new Intent(this, Profile.class);
                startActivity(intent);
            case R.id.menu_search:
                Intent intent1=new Intent(this, Profile.class);
                startActivity(intent1);
            case R.id.menu_some:
                Intent intent2=new Intent(this, Profile.class);
                startActivity(intent2);
            case R.id.menu_settings:
                Intent intent3=new Intent(this, Profile.class);
                startActivity(intent3);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button A=(Button)findViewById(R.id.A);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        Button B=(Button)findViewById(R.id.B);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this, Collaboration.class);
                startActivity(intent);
            }
        });
        Button C=(Button)findViewById(R.id.C);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this, Game.class);
                startActivity(intent);
            }
        });
    }
}
