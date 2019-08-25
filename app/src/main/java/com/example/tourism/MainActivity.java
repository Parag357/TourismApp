package com.example.tourism;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.ActionBar;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar ab=getSupportActionBar();
        ab.setTitle("Tourism");
        b1 = findViewById(R.id.falls);
        b2 = findViewById(R.id.temples);
        b3 = findViewById(R.id.museums);
        b4 = findViewById(R.id.hills);
        b5 = findViewById(R.id.parks);
        b6 = findViewById(R.id.dams);
        b1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, ListActivity.class);
                i1.putExtra("Type", 1);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, ListActivity.class);
                i1.putExtra("Type", 2);
                startActivity(i1);
            }
        });

        b3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, ListActivity.class);
                i1.putExtra("Type", 3);
                startActivity(i1);
            }
        });
        b4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, ListActivity.class);
                i1.putExtra("Type", 4);
                startActivity(i1);
            }
        });
        b5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, ListActivity.class);
                i1.putExtra("Type", 5);
                startActivity(i1);
            }
        });
        b6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i1 = new Intent(MainActivity.this, ListActivity.class);
                i1.putExtra("Type", 6);
                startActivity(i1);
            }
        });
        /*
    public void showFalls(View v)
    {

    }
    public void showTemples(View v)
    {
        Intent i1=new Intent(this,ListActivity.class);
        i1.putExtra("Type",2);
        startActivity(i1);
    }
    public void showMuseums(View v)
    {
        Intent i1=new Intent(this,ListActivity.class);
        i1.putExtra("Type",3);
        startActivity(i1);
    }
    public void showHills(View v)
    {
        Intent i1=new Intent(this,ListActivity.class);
        i1.putExtra("Type",4);
        startActivity(i1);
    }
    public void showParks(View v)
    {
        Intent i1=new Intent(this,ListActivity.class);
        i1.putExtra("Type",5);
        startActivity(i1);
    }
    public void showDams(View v)
    {
        Intent i1=new Intent(this,ListActivity.class);
        i1.putExtra("Type",6);
        startActivity(i1);
    }
    */
    }
}