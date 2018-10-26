package com.ak.user.testconstraintset;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintSet constraintSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);

        TextView textViewRow = (TextView) LayoutInflater.from(this).inflate(R.layout.text_view_row,constraintLayout,false);
        constraintLayout.addView(textViewRow);

        constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);


        constraintSet.connect(textViewRow.getId(),ConstraintSet.BOTTOM,ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM);
        constraintSet.connect(textViewRow.getId(), ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);
        constraintSet.connect(textViewRow.getId(),ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END);


        constraintSet.applyTo(constraintLayout);



    }
}
