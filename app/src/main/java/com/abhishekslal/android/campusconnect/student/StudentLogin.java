package com.abhishekslal.android.campusconnect.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.abhishekslal.android.campusconnect.R;
import com.abhishekslal.android.campusconnect.visitor.VisitorActivity;

public class StudentLogin extends AppCompatActivity {
    EditText admsnNo, pswd;

    private Button VisitorLoginButton, StudentLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        admsnNo = findViewById(R.id.inputUserName);
        pswd = findViewById(R.id.inputPassword);

        StudentLoginButton = findViewById(R.id.buttonSignIn);
        StudentLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String admission_no = admsnNo.getText().toString();
                String password = pswd.getText().toString();


                if (("".equals(admission_no)) && ("".equals(password))) {
                    Toast.makeText(StudentLogin.this, "Fields are empty", Toast.LENGTH_SHORT).show();
                } else if ("".equals(password)) {
                    pswd.setError("Please enter your Linways password");
                    pswd.requestFocus();
                } else if ("".equals(admission_no)) {
                    admsnNo.setError("Please enter admission number");
                    admsnNo.requestFocus();
                } else //if (!(admission_no.isEmpty() && password.isEmpty()))
                {

                    // Replace with Linways Aunthentication statements

                    //Test Login Start
                    if (admission_no.equals("7141") && password.equals("aqwe")) {
                        Toast.makeText(StudentLogin.this, "Test Login Successfull!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(StudentLogin.this, StudentMainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(StudentLogin.this, "Invalid Credentials\nTest Login Failed!\nPlease try again", Toast.LENGTH_LONG).show();
                    }
                    //Test Login End

                }

            }
        });

        VisitorLoginButton = findViewById(R.id.buttonVisitorLogIn);
        VisitorLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentLogin.this, VisitorActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();//to kill the activity so that the user cannot go back
        moveTaskToBack(true);
    }
}


