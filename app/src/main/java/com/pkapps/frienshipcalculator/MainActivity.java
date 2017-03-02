package com.pkapps.frienshipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button Calculate;
    EditText Yourname,Friendname;
    String str1,str2;

    int Friendshippercent;
    Random ran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yourname = (EditText)findViewById(R.id.editText);
        Friendname=(EditText)findViewById(R.id.editText2);
        Calculate = (Button)findViewById(R.id.button);
        ran = new Random();
        Calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Friendshippercent = ran.nextInt(100);
                str1=Yourname.getText().toString();
                str2=Friendname.getText().toString();

                String concat= String.valueOf(Yourname).concat((String.valueOf(Friendname))).toUpperCase();
                if ((toString().trim().length() == 0 )|| (Friendname).toString().trim().length() == 0) {
                    Toast.makeText(MainActivity.this, "Please fill Both", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,str1+ "Trust to"+str2+Friendshippercent+"%",Toast.LENGTH_LONG).show();
                }

            }



        });
    }
}
