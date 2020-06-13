package com.example.new_jinakproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class fragmentController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_controller);

        BottomNavigationView btn_nav = findViewById(R.id.navbar);
        btn_nav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new homeFragment()).commit();
    }
     private BottomNavigationView.OnNavigationItemSelectedListener navListener =
             new BottomNavigationView.OnNavigationItemSelectedListener() {
                 @Override
                 public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                     Fragment selectedFragment = null;

                     switch (item.getItemId()) {
                         case R.id.nav_home:
                             selectedFragment = new homeFragment();
                             break;
                         case R.id.nav_healt:
                             selectedFragment = new healtFragment();
                             break;
                         case R.id.nav_chat:
                             selectedFragment = new chatFragment();
                             break;
                         case R.id.nav_favorite:
                             selectedFragment = new favoriteFragment();
                             break;
                         case R.id.nav_profil:
                             selectedFragment = new profilFragment();
                             break;
                     }

                     getSupportFragmentManager().beginTransaction().replace(R.id.frame, selectedFragment).commit();

                     return true;
                 }
             };
}
