package com.example.olga.foodacademyv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WriteFeedbackActivity extends AppCompatActivity {

    EditText etDatum, etLastName, etFeedback;
    Button btnAdd;
    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_feedback);

        etFeedback = (EditText) findViewById(R.id.etFeedback);
        etDatum = (EditText) findViewById(R.id.etDatum);
        etLastName = (EditText) findViewById(R.id.etLastName);

        btnAdd = (Button) findViewById(R.id.btnAdd);

        myDB = new DatabaseHelper(this);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = etDatum.getText().toString();
                String lastName = etLastName.getText().toString();
                String feedback = etFeedback.getText().toString();
                Intent intent = new Intent(WriteFeedbackActivity.this, FeedbackActivity.class);
                if (checkFeedback(lastName, date, feedback)) {
                    AddData(date, lastName, feedback);
                    etFeedback.setText("");
                    etLastName.setText("");
                    etDatum.setText("");
                    startActivity(intent);
                } else {
                    Toast.makeText(WriteFeedbackActivity.this,"Nicht alle Felder sind ausgefüllt!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public boolean checkFeedback(String lastName, String date, String feedback) {
        if (date.length() != 0 && lastName.length() != 0 && feedback.length() != 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean AddData(String datum, String lastName, String feedback){
        boolean insertData = myDB.addData(datum, lastName, feedback);

        if (insertData == true) {
            Toast.makeText(WriteFeedbackActivity.this,"Deine Bewertung wurde hinzugefügt!",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(WriteFeedbackActivity.this,"Etwas ist schief gelaufen :(.",Toast.LENGTH_LONG).show();
        }
        return insertData;
    }
}
