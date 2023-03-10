package com.javierdimastri.android_sqlite_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {

            String usernameKey = username.getText().toString();
            String passwordKey = password.getText().toString();

            if (usernameKey.equals("admin") && passwordKey.equals("123")){
                Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                MainActivity.this.startActivity(intent);
                finish();
            }else {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username atau Password Anda salah!")
                        .setNegativeButton("Retry", null).create().show();
            }
        });

    }
}


