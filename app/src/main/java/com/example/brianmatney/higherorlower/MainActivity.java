package com.example.brianmatney.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;
    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void higherOrLower(View view){

        EditText numberEntered = (EditText)findViewById(R.id.numberEntered);

        int newNumber = Integer.parseInt(numberEntered.getText().toString());

        if(newNumber > random){
            makeToast("Lower");
        } else if(newNumber < random){
            makeToast("Higher");
        }else{
            makeToast("Correct! Try Again");
            numberEntered.setText("");
            random = new Random().nextInt(20)+1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random().nextInt(20)+1;

    }
}
