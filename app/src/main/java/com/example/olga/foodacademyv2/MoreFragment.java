package com.example.olga.foodacademyv2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import static com.example.olga.foodacademyv2.R.id.button_gallery;
import static com.example.olga.foodacademyv2.R.id.button_route;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment implements View.OnClickListener{


    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_more, container, false);
        Button button1 = (Button) rootView.findViewById(R.id.button_gallery);
        Button button2 = (Button) rootView.findViewById(R.id.button_speisekarte);
        Button button3 = (Button) rootView.findViewById(R.id.button_feedback);
        Button button4 = (Button) rootView.findViewById(R.id.button_route);
        Button button5 = (Button) rootView.findViewById(R.id.button_about);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button_gallery:
                Intent intent = new Intent(getActivity(), GalleryActivity.class);
                startActivity(intent);
                break;
            case R.id.button_speisekarte:
                Intent intent1 = new Intent(getActivity(), MenuActivity.class);
                startActivity(intent1);
                break;
           case R.id.button_feedback:
               Intent intent2 = new Intent(getActivity(), FeedbackActivity.class);
                startActivity(intent2);
                break;
            case R.id.button_route:
                Intent intent3 = new Intent(getActivity(), RouteActivity.class);
                startActivity(intent3);
                break;
            case R.id.button_about:
                Intent intent4 = new Intent(getActivity(), WirActivity.class);
                startActivity(intent4);
                break;


            }
    }
}
