package com.dissidentmind.evanfa.puppy;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.BundleCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Fabio on 5/10/2016.
 */
public class DetailsMascot extends AppCompatActivity {

    SwipeRefreshLayout refreshLayout;
    ListView vList;
    Adapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.mascot_details);
        addFloatButton();

        refreshLayout = (SwipeRefreshLayout) findViewById(R.id.refreshLayout);
        vList = (ListView) findViewById(R.id.vList);

        String dogs[] = getResources().getStringArray(R.array.listDogs);
        vList.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, dogs));

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshContent();
            }
        });

    }

    public void refreshContent(){
        String dogs[] = getResources().getStringArray(R.array.listDogs);
        vList.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, dogs));
        refreshLayout.setRefreshing(false);
    }

    public void addFloatButton(){
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.btnFloat);

        miFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(),getResources().getString(R.string.toastOne),Toast.LENGTH_SHORT).show();
                Snackbar.make(v,getResources().getString(R.string.toastOne),Snackbar.LENGTH_SHORT)
                        .setAction(getResources().getString(R.string.testAction), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("SNACKBAR","Snack Bar - Click");
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorPrimaryDark))
                        .show();

            }
        });
    }
}
