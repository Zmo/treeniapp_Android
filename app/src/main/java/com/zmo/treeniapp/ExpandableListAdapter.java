package com.zmo.treeniapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Simo on 21.4.2014.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {

    Activity activity;
    private Context context;
    private ArrayList<Exercise> contentList;

    public ExpandableListAdapter(Activity activity, Context context, ArrayList<Exercise> contentList) {
        this.activity = activity;
        this.context = context;
        this.contentList = contentList;
    }

    @Override
    public int getGroupCount() {
        return this.contentList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 4;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.contentList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        String temp = "";
        switch (childPosition) {
            case 0:
                temp = "Normisarjapaino: " + Integer.toString(this.contentList.get(groupPosition).getNormalSetWeight());
                break;
            case 1:
                temp = "Raskassarjapaino: " + Integer.toString(this.contentList.get(groupPosition).getHeavySetWeight());
                break;
            case 2:
                temp = "2x6 -paino: " + Integer.toString(this.contentList.get(groupPosition).getTwoXSixWeight());
                break;
            case 3:
                temp = "Maksimi: " + Integer.toString(this.contentList.get(groupPosition).getOneRepMax());
                break;
        }
        return temp;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        Exercise exercise = (Exercise) getGroup(groupPosition);
        String headerTitle = exercise.getName();
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.group_row, null);
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.row_name);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);

        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {


        String childText = (String) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.child_row, null);
        }

        final TextView txtListChild = (TextView) convertView.findViewById(R.id.group_child);
        txtListChild.setText(childText);

        txtListChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater layoutInflater = LayoutInflater.from(activity);
                View promptView = layoutInflater.inflate(R.layout.prompt, null);
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
                alertDialogBuilder.setView(promptView);
                final EditText input = (EditText) promptView.findViewById(R.id.userInput);

                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int id) {
                                switch (childPosition) {
                                    case 0:
                                        contentList.get(groupPosition).setNormalSetWeight(Integer.parseInt(input.getText().toString()));
                                        break;
                                    case 1:
                                        contentList.get(groupPosition).setHeavySetWeight(Integer.parseInt(input.getText().toString()));
                                        break;
                                    case 2:
                                        contentList.get(groupPosition).setTwoXSixWeight(Integer.parseInt(input.getText().toString()));
                                        break;
                                    case 3:
                                        contentList.get(groupPosition).setOneRepMax(Integer.parseInt(input.getText().toString()));
                                        break;
                                }
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialogInterface, int id) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
