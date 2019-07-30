package com.example.student.lab4;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Context context = getApplicationContext();
//        CharSequence  tomstMsg = "Hello tost";
//        int duration = Toast.LENGTH_LONG;
//
//        Toast t = Toast.makeText(context,tomstMsg,duration);
//        t.setGravity(Gravity.TOP,0,0);
//        t.show();


        LayoutInflater l = getLayoutInflater();
        View layout = l.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_container));


        TextView text = (TextView) layout.findViewById(R.id.txtToast);
        text.setText("This is a custom toast");



        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

//i am from Git
    }
}

