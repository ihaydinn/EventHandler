package com.ismailhakkiaydin.eventhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.nio.channels.Channels;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private LinearLayout pnl;
    private TextView txtTest;
    private Button btnIncrement;

    private void init(){
        pnl = new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);

        txtTest = new TextView(this);
        txtTest.setText("Count : ");

        btnIncrement = new Button(this);
        btnIncrement.setText("Increment");

        pnl.addView(btnIncrement);
        pnl.addView(txtTest);

       /* btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++count;
                txtTest.setText("Count : "+ count);
            }
        });*/

    }

    public void btnIncrement_Click(){
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++count;
                txtTest.setText("Count : "+count);
            }
        });
    }

    public void registeredHandlers(){
        btnIncrement_Click();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        setContentView(pnl);
        registeredHandlers();

    }
}
