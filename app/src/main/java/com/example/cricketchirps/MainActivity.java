package com.example.cricketchirps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView eyebtn;
    EditText ET;
    Button btnsubmit;
    TextView tempresults;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eyebtn=findViewById(R.id.eyebtn);
        ET=findViewById(R.id.ET);
        btnsubmit=findViewById(R.id.btnsubmit);
        tempresults=findViewById(R.id.tempresults);
        tempresults.setVisibility(View.GONE);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String temp = ET.getText().toString().trim();

                int n = Integer.parseInt(temp);
                double result = n/3.0 + 4.0;

                tempresults.setVisibility(View.VISIBLE);
                String result1= "Temperature as recorded is "+ result;
                tempresults.setText(result1);






























            }
        });

            }
        }



