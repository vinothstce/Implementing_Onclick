package com.implementing.button.demo.implementing_onclick;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mFirstButton;
    private Button mSecondButton;
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstButton = (Button) findViewById(R.id.bFirstButton);
        mSecondButton = (Button) findViewById(R.id.bSecondButton);

        mFirstButton.setOnClickListener(MainActivity.this);
        mSecondButton.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.bFirstButton:
                Log.d(TAG, "First Button is clicked");
                break;
            case R.id.bSecondButton:
                Log.d(TAG, "Second Button is clicked");
                break;
        }

    }

}

