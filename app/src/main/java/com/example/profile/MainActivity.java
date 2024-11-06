package com.example.profile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);


        setFragment(new Firstgragment());

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.first_item) {
                setFragment(new BlankFragment());
                return true;
            } else if (id == R.id.second_item) {
                setFragment(new Firstgragment());
                return true;
            } else if (id == R.id.third_item) {
                setFragment(new ThirdFragment());
                return true;
            } else {
                return super.onContextItemSelected(item);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Toast.makeText(this, "Настройки выполнены", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.firstFrag) {
            setFragment(new BlankFragment());
            return true;
        } else if (id == R.id.twoFrag) {
            setFragment(new Firstgragment());
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

    public void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.selectedmenu, fragment, null).commit();
    }
}
