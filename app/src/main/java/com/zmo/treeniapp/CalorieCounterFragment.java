package com.zmo.treeniapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Simo on 25.4.2014.
 */
public class CalorieCounterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState) {

        View rootView = layoutInflater.inflate(R.layout.fragment_calorie_counter, viewGroup, false);

        return rootView;
    }
}
