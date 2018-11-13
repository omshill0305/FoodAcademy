package com.example.olga.foodacademyv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.feedback_layout_id);
                String message= "";
                int duration = Snackbar.LENGTH_LONG;

                showSnackbar(view, message, duration);


            }

        });
    }
     public void showSnackbar(View view, String message,int duration){
         final Snackbar snackbar = Snackbar.make(view, message, duration);

        snackbar.setAction("Klick hier, um deine Bewertung zu schreiben", new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(FeedbackActivity.this, WriteFeedbackActivity.class));


             }
         });

         snackbar.show();
     }

}
