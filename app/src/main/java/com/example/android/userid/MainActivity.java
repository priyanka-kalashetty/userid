package com.example.android.userid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static EditText Name;
    public static EditText password;
    public static Button login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText) findViewById(R.id.Name);
        password=(EditText)findViewById(R.id.password);
        login=(EditText)findViewById(R.id.login);
    }

    public void launchSecondActivity(View view) {
        if(Name.getText().toString().equals("priyanka")&&password.getText().toString().equals("priyanka")) {
            Intent intent = new Intent(this, userpage.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Invalide Name or password",Toast.LENGTH_LONG).show();
        }

    }
}
