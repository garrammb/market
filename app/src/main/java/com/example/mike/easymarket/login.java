package com.example.mike.easymarket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.market_login);
    }


    private void attemptLogin(String username, String password) {
        if (isInDb(username)) {
            if (correctCreds(username, password)) {

            } else {
                android.widget.Toast.makeText(getApplicationContext(), "incorrect password", Toast.LENGTH_LONG).show();
            }
        } else {
            android.widget.Toast.makeText(getApplicationContext(), username +
                    "is not a valid username", Toast.LENGTH_LONG).show();
        }
    }

    private boolean isInDb(String username) {
        return false;
    }

    private boolean correctCreds(String username, String password) {
        return false;
    }


}
