package com.example.roadster.walkjog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CollectActivityPocket1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_activity_pocket1);
    }

    public void walkStart(View view){

        String newAct = getIntent().getStringExtra("new");

        //Creates New Intent
        Intent startNewActivity = new Intent(this, CollectActivityPocketFall1.class);

        startNewActivity.putExtra("new",newAct);

        this.finish();

        //Send To New Activity
        startActivity(startNewActivity);



    }
}
