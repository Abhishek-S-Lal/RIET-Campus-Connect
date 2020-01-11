package com.abhishekslal.android.campusconnect.visitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.abhishekslal.android.campusconnect.R;

public class foodcourt extends AppCompatActivity {

    private Button brekbtn;
    private Button lunchbtn;
    private Button snacksbtn;
    private Button juciesbtn;
    private Button specialsbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcourt);
        brekbtn= (Button) findViewById(R.id.breakfast);
        brekbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(foodcourt.this, breakfast.class);
                startActivity(intent);
            }
        });
        lunchbtn= (Button) findViewById(R.id.lunch);
        lunchbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(foodcourt.this,lunch.class);
                startActivity(intent);
            }
        });
        snacksbtn= (Button) findViewById(R.id.snacks);
        snacksbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(foodcourt.this,snacks.class);
                startActivity(intent);
            }
        });
        juciesbtn= (Button) findViewById(R.id.jucies);
        juciesbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(foodcourt.this,jucies.class);
                startActivity(intent);
            }
        });
        specialsbtn= (Button) findViewById(R.id.specials);
        specialsbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(foodcourt.this,specials.class);
                startActivity(intent);
            }
        });
    }
}
