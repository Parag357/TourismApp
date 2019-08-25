package com.example.tourism;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageView;
public class Detail extends AppCompatActivity {
    String title,loc,describe;
    int image;
    float rating;
    TextView tv1,tv2,tv3;
    RatingBar r1;
    ImageView img;
    int ltype;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        img=findViewById(R.id.detail_image);
        tv1=findViewById(R.id.detail_title);
        tv2=findViewById(R.id.detail_loc);
        tv3=findViewById(R.id.detail_describe);
        r1=findViewById(R.id.detail_rating);
        b1=findViewById(R.id.detail_maps);
        b2=findViewById(R.id.detail_ola);
        b3=findViewById(R.id.detail_uber);
        Intent i1=getIntent();
        title=i1.getStringExtra("title");
        loc=i1.getStringExtra("loc");
        describe=i1.getStringExtra("describe");
        rating=i1.getFloatExtra("rating",4);
        image=i1.getIntExtra("image",R.drawable.download);
        ltype=i1.getIntExtra("listype",1);
        tv1.setText(title);
        tv2.setText(loc);
        tv3.setText(describe);
        r1.setRating(rating);
        r1.setEnabled(false);
        img.setImageResource(image);
        ActionBar ab= getSupportActionBar();
        ab.setTitle(title);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent mapIntent = new Intent();
                mapIntent.setAction(Intent.ACTION_VIEW);
                mapIntent.setData(Uri.parse("geo:0,0?q=" + title + "," + loc));

                mapIntent.setPackage("com.google.android.apps.maps");


                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.olacabs.customer");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }else
                {
                    Uri uri = Uri.parse("market://details?id=com.olacabs.customer"+"?q="+title+","+loc);
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.olacabs.customer")));
                    }
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.ubercab");
                if (launchIntent != null) {
                    startActivity(launchIntent);//null pointer check in case package name was not found
                }else
                {
                    Uri uri = Uri.parse("market://details?id=com.ubercab");
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.ubercab")));
                    }
                }
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId()==android.R.id.home)
        {
            Intent i1 = new Intent(this, ListActivity.class);
            i1.putExtra("Type",ltype);
            startActivity(i1);
            return true;
        }
        else
            return(super.onOptionsItemSelected(item));
    }
}
