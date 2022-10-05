package com.developeralamin.firechat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home:
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.setting:
                startActivity(new Intent(MainActivity.this, SettingActivity.class));
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                startActivity(new Intent(MainActivity.this, LogoutActivity.class));
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }


}