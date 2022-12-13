package com.example.gitpracticeandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello_Git", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello_Git", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello_Git3", Toast.LENGTH_SHORT).show();
    }

    public void ali(){
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }
}
