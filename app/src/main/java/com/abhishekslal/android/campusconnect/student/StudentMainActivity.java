package com.abhishekslal.android.campusconnect.student;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.abhishekslal.android.campusconnect.R;
import com.abhishekslal.android.campusconnect.student.ui.main.SectionsPagerAdapter;
import com.abhishekslal.android.campusconnect.visitor.VisitorActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;


public class StudentMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
        findViewById(R.id.NavDrawerIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.nav_1://Home
                        Toast.makeText(StudentMainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                        //No code for Home
                        break;
                    case R.id.nav_2://Profile
                        Intent i = new Intent(StudentMainActivity.this, StudentProfile.class);
                        startActivity(i);
                        break;
                    case R.id.nav_3://Notification
                        Toast.makeText(StudentMainActivity.this, "Notifications Selected", Toast.LENGTH_SHORT).show();
                        //Write code for notifications here
                        break;
                    case R.id.nav_4://Announcements
                        Toast.makeText(StudentMainActivity.this, "Announcements Selected", Toast.LENGTH_SHORT).show();
                        //Write code for announcements here
                        break;
                    case R.id.nav_5://View as Visitor
                        Intent t = new Intent(StudentMainActivity.this, VisitorActivity.class);
                        startActivity(t);
                        break;
                    case R.id.nav_6://About Us
                        Toast.makeText(StudentMainActivity.this, "About Us Selected", Toast.LENGTH_SHORT).show();
                        //Write code for about us here
                        break;
                    case R.id.nav_7://Share
                        Toast.makeText(StudentMainActivity.this, "Share Selected", Toast.LENGTH_SHORT).show();
                        //Write code for share here
                        break;
                    case R.id.nav_8://Developers
                        Toast.makeText(StudentMainActivity.this, "Developers Selected", Toast.LENGTH_SHORT).show();
                        //Write code for announcements here
                        break;
                    case R.id.nav_9://Rate Us
                        Toast.makeText(StudentMainActivity.this, "Rate Us Selected", Toast.LENGTH_SHORT).show();
                        //Write code for rate us here
                        break;
//
                }
                drawer.closeDrawers();
                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.student_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}