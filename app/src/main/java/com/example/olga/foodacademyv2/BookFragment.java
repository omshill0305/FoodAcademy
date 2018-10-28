package com.example.olga.foodacademyv2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends Fragment {


    public BookFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View rootView = inflater.inflate(R.layout.fragment_book, container, false);
        Button bt_send = (Button) rootView.findViewById(R.id.button);
        bt_send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                System.out.println("Hi its me");
                EditText date = (EditText) rootView.findViewById(R.id.dateTE);
                Log.i("Datum", date.getText().toString());
            }
        });
        return rootView;
    }

}
