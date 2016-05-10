package com.dissidentmind.evanfa.puppy;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Fabio on 5/10/2016.
 */
public class DetailsMascot extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.mascot_details);

    }
}
