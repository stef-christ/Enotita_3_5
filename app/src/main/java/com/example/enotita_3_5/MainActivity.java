package com.example.enotita_3_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVw_name = findViewById(R.id.txtVw_fname);
        final EditText edtxt_name = findViewById(R.id.edtxt_fname);
        TextView txtVw_lname = findViewById(R.id.txtVw_lname);
        final EditText edtxt_lname = findViewById(R.id.edtxt_lname);
        TextView txtVw_email = findViewById(R.id.txtVw_email);
        final EditText edtxt_email = findViewById(R.id.edtxt_email);
        TextView txtVw_password = findViewById(R.id.txtVw_password);
        final EditText edtxt_password = findViewById(R.id.edtxt_password);
        Button btn_reg = findViewById(R.id.btn_reg);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myname = edtxt_name.getText().toString();
                String mylname = edtxt_lname.getText().toString();
                String myemail = edtxt_email.getText().toString();
                String mypass = edtxt_password.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", myname);
                intent.putExtra("lname", mylname);
                intent.putExtra("email", myemail);
                intent.putExtra("password", mypass);

                startActivity(intent);
            }
        });

    }
}
