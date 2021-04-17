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
        int curid=item.getItemId();
        if(curid==R.id.menu_settings)

        switch(curid){
            case R.id.menu_refresh:
                Toast.makeText(this, "프로필", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_search:
                Toast.makeText(this, "기록", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_some:
                Toast.makeText(this, "...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_settings:
                Toast.makeText(this, "설정", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
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
