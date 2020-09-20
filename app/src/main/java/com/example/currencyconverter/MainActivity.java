package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ObjectStreamField;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    

    public void clickbtn(View view){
        EditText dolleramount=(EditText) findViewById(R.id.dollerText);
        String doller= dolleramount.getText().toString();
        Double doubledoller= Double.parseDouble(doller);
        Double rupee=73.61*doubledoller;
        String toastString;
        toastString = rupee.toString();

//        Toast toast=Toast.makeText(getApplicationContext(),toastString,Toast.LENGTH_SHORT);
//        toast.show();

        TextView showRupees=(TextView) findViewById(R.id.textView2);
        showRupees.setText(toastString);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}