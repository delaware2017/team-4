package com.example.that1guy.code4good;

import android.content.Intent;
import android.widget.TextView;

/**
 * Created by pureu on 11/4/2017.
 */

public class ExtraMethods {

    public void AddNewBalance()
    {
        Intent i = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
        finish();
    }
}
