package com.example.firstapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String username = "C2083207016";
    String password = "1A234*";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtPass = findViewById(R.id.txtPassword);

        Button btn_login = findViewById(R.id.menu_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (txtUser.getText().toString().equalsIgnoreCase(username) && txtPass.getText().toString().equalsIgnoreCase(password)) {
                    Intent x = new Intent (MainActivity.this,MainActivity2.class);
                    startActivity (x);
                    Toast.makeText(MainActivity.this, "Selamat Datang", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username/Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}