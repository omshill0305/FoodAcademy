package com.example.olga.foodacademyv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WriteFeedbackActivity extends AppCompatActivity {

    EditText etDatum,etLastName,etFeedback;
    Button btnAdd,btnView;
    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_feedback);

        etFeedback = (EditText) findViewById(R.id.etFeedback);
        etDatum = (EditText) findViewById(R.id.etDatum);
        etLastName = (EditText) findViewById(R.id.etLastName);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnView = (Button) findViewById(R.id.btnView);
        myDB = new DatabaseHelper(this);


        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WriteFeedbackActivity.this,FeedbackActivity.class);
                startActivity(intent);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName = etDatum.getText().toString();
                String lName = etLastName.getText().toString();
                String fFood = etFeedback.getText().toString();
                if(fName.length() != 0 && lName.length() != 0 && fFood.length() != 0){
                    AddData(fName,lName, fFood);
                    etFeedback.setText("");
                    etLastName.setText("");
                    etDatum.setText("");
                }else{
                    Toast.makeText(WriteFeedbackActivity.this,"You must put something in the text field!",Toast.LENGTH_LONG).show();
                }
            }
        });




    }

    public void AddData(String datum,String lastName, String feedback ){
        boolean insertData = myDB.addData(datum,lastName,feedback);

        if(insertData==true){
            Toast.makeText(WriteFeedbackActivity.this,"Successfully Entered Data!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(WriteFeedbackActivity.this,"Something went wrong :(.",Toast.LENGTH_LONG).show();
        }
    }
}
