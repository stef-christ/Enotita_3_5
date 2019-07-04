package com.example.enotita_3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView givenname = findViewById(R.id.txtVw_givenname);
        TextView givensurname = findViewById(R.id.txtVw_givensurname);
        TextView givenemail = findViewById(R.id.txtVw_givenemail);
        TextView givenepass = findViewById(R.id.txtVw_givenpassword);

        String givenName = getIntent().getExtras().getString("name", "default text");
        String givenSurname = getIntent().getExtras().getString("lname", "default text");
        String givenEmail = getIntent().getExtras().getString("email", "default text");
        String givenPassword = getIntent().getExtras().getString("password", "default text");

        givenname.setText("Name: " + givenName);
        givensurname.setText("Surname: " + givenSurname);
        givenemail.setText("Email: " + givenEmail);
        givenepass.setText("Password: " + givenPassword);
    }
}
