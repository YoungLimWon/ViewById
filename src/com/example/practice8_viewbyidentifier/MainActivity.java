package com.example.practice8_viewbyidentifier;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        for(int i = 1; i<4; i++)
        {
        	int resID = getResources().getIdentifier("textview"+i, "id", "com.example.practice8_viewbyidentifier");
        	((TextView)findViewById(resID)).setText("ÅØ½ºÆ®ºä" + i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
