package com.example.evenbuttononclick;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnSignIn);

        edemail=findViewById(R.id.edEmail);

        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                nama = edemail.getText().toString();

                password = edpassword.getText().toString();

                String email ="fayadaffa";
                String pass = "2704";

                if (nama.equals(email)&&password.equals(pass)){
                    Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();
                    b.putString("a",nama.trim());
                    b.putString("b",password.trim());

                    Intent i = new Intent(getApplicationContext(),ActivtyKedua.class);
                    i.putExtras(b);
                    startActivity(i);
                }
                else{
                    Toast t = Toast.makeText(getApplicationContext(),"Login Gagal",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });


    }
}