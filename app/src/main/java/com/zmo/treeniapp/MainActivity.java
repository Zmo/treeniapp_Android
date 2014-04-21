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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private final static String SELECTED_MUSCLE_GROUP = "Rintalihakset";

    private ExerciseMovementHolder exerciseMovementHolder;

    private ExpandableListAdapter expandableListAdapter;

    private Spinner muscleGroupSpinner;
    private Button randomButton;
    private ExpandableListView expandableListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) { // if the app is starting for the first time

        } else {

        }
        // assign values to the view element variables
        muscleGroupSpinner = (Spinner) findViewById(R.id.muscleGroupSpinner);
        randomButton = (Button) findViewById(R.id.randomMoveButton);
        expandableListView = (ExpandableListView) findViewById(R.id.exerciseExpandableListView);

        // populate the listView
        exerciseMovementHolder = new ExerciseMovementHolder();
        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getAllExercises());
        expandableListView.setAdapter(expandableListAdapter);

        // call methods to add listeners
        addItemSelectedListenerToSpinner();
        addButtonListeners();
    }

    private void addButtonListeners() {
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
                //Toast.makeText(getApplicationContext(), String.valueOf(id), Toast.LENGTH_SHORT).show();
                Integer i = (int) (long) id;
                switch (i) {
                    case 0:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getAllExercises());
                        break;
                    case 1:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getChestExercises());
                        break;
                    case 2:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getShoulderExercises());
                        break;
                    case 3:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getBicepExercises());
                        break;
                    case 4:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getTricepExercises());
                        break;
                    case 5:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getBackExercises());
                        break;
                    case 6:
                        expandableListAdapter = new ExpandableListAdapter(getApplicationContext(), exerciseMovementHolder.getLegExercises());
                        break;
                }
                expandableListView.setAdapter(expandableListAdapter);
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
