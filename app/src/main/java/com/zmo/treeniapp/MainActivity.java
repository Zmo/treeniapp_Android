package com.zmo.treeniapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    private final static String SELECTED_MUSCLE_GROUP = "Rintalihakset";

    private String selectedMuscleGroup;

    private Spinner muscleGroupSpinner;

    private Button showAllButton;
    private Button randomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) { // if the app is starting for the first time

            selectedMuscleGroup = "Rintalihakset";

        } else {

            selectedMuscleGroup = SELECTED_MUSCLE_GROUP;
        }
        // assign values to the variables
        muscleGroupSpinner = (Spinner) findViewById(R.id.muscleGroupSpinner);

        showAllButton = (Button) findViewById(R.id.showAllButton);
        randomButton = (Button) findViewById(R.id.randomMoveButton);

        // call methods to add listeners
        addItemSelectedListenerToSpinner();
        addButtonListeners();
    }

    private void addButtonListeners() {
        showAllButton.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });

        randomButton.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });
    }

    private void addItemSelectedListenerToSpinner() {
        muscleGroupSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
