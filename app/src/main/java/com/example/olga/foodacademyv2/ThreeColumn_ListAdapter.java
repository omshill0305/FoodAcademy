package com.example.olga.foodacademyv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ThreeColumn_ListAdapter extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);


        if (user != null) {
            TextView datum = (TextView) convertView.findViewById(R.id.textDatum);
            TextView lastName = (TextView) convertView.findViewById(R.id.textLastName);
            TextView feedback = (TextView) convertView.findViewById(R.id.textFeedback);
            if (datum != null) {
                datum.setText(user.getDatum());
            }
            if (lastName != null) {
                lastName.setText((user.getLastName()));
            }
            if (feedback != null) {
                feedback.setText((user.getFeedback()));
            }
        }

        return convertView;
    }
}
