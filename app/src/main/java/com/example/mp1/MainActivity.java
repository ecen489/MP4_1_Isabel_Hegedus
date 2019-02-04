package com.example.mp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void runButton(View v){
        EditText box = (EditText) findViewById(R.id.userInput);
        String ans = box.getText().toString();
        System.out.println(ans);
        TextView disp = findViewById(R.id.ourDisp);
        disp.setText(ans);
        System.out.println(disp.getText().toString());
    }
}
