package com.abhishekslal.android.campusconnect.visitor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.abhishekslal.android.campusconnect.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VisitorActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(this);

        loadFragment(new VisitorHomeFragment());
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.VisitorContainer, fragment)
                    .commit();
            return true;
        }
        return false;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new VisitorHomeFragment();
                break;

            case R.id.navigation_explore:
                fragment = new VisitorExploreFragment();
                break;

            case R.id.navigation_more:
                fragment = new VisitorMoreFragment();
                break;

        }

        return loadFragment(fragment);
    }

    public void openMap(View view) {

        Uri uri = Uri.parse("geo:8.736913, 76.834510?q=" + Uri.encode("Rajadhani Campus"));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

}
