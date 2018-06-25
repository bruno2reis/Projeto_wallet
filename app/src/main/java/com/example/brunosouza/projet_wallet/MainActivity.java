package com.example.brunosouza.projet_wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView btEmail = (TextView) findViewById(R.id.email);
                TextView btPassword = (TextView) findViewById(R.id.password);
                String email = btEmail.getText().toString();
                String passaword = btPassword.getText().toString();

                if(email.equals("Bruno") && passaword.equals("123")){
                    alert("Usuario logado");
                }else{
                    alert("Usuario não logado");
                }
            }
        });
    }
    private void alert(String s){
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }


}
