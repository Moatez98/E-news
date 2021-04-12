package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mail,pass;
    Button akek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            akek=findViewById(R.id.btnlogin);
            mail=findViewById(R.id.email);
            pass=findViewById(R.id.password);

            akek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String m=mail.getText().toString();
                    String p=pass.getText().toString();
                    if(m.equals("admin") && p.equals("admin")){
                        Intent i=new Intent(getApplicationContext(),home.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(),"mot de pass ghalet",Toast.LENGTH_LONG).show();
                    }

                }
            });



    }


}