package com.abhishekslal.android.campusconnect.visitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.abhishekslal.android.campusconnect.R;
import com.abhishekslal.android.campusconnect.student.StudentLogin;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Visitbutton = findViewById(R.id.VisitorButton);
        Visitbutton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,VisitorActivity.class);
                startActivity(intent);
            }
        });

        Button Studbutton = findViewById(R.id.StudentButton);
        Studbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, StudentLogin.class);
                startActivity(intent);
            }
        });
    }



}
