package com.zmo.treeniapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Spinner;

/**
 * Created by Simo on 25.4.2014.
 */
public class ResultsFragment extends Fragment {

    private ExerciseMovementHolder exerciseMovementHolder;

    private ExpandableListAdapter expandableListAdapter;
    private Spinner muscleGroupSpinner;
    private Button randomButton;
    private ExpandableListView expandableListView;

    private Context context;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {

        View rootView = layoutInflater.inflate(R.layout.fragment_results, viewGroup, false);

        this.context = layoutInflater.getContext();

        // assign values to the view element variables
        muscleGroupSpinner = (Spinner) rootView.findViewById(R.id.muscleGroupSpinner);
        randomButton = (Button) rootView.findViewById(R.id.randomMoveButton);
        expandableListView = (ExpandableListView) rootView.findViewById(R.id.exerciseExpandableListView);

        // populate the listView
        exerciseMovementHolder = new ExerciseMovementHolder();

        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getAllExercises());
        expandableListView.setAdapter(expandableListAdapter);

        // call methods to add listeners
        addItemSelectedListenerToSpinner();
        addButtonListeners();

        return rootView;
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
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getAllExercises());
                        break;
                    case 1:
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getChestExercises());
                        break;
                    case 2:
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getShoulderExercises());
                        break;
                    case 3:
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getBicepExercises());
                        break;
                    case 4:
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getTricepExercises());
                        break;
                    case 5:
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getBackExercises());
                        break;
                    case 6:
                        expandableListAdapter = new ExpandableListAdapter(getActivity(), context, exerciseMovementHolder.getLegExercises());
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
}
