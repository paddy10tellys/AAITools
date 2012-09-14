package com.paddy10tellys.aaitools;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AAITools extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aaitools);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_aaitools, menu);
        return true;
    }
}
