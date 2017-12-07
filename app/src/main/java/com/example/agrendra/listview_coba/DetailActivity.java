package com.example.agrendra.listview_coba;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    int gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = (ImageView)findViewById(R.id.foto);
        TextView textView = (TextView)findViewById(R.id.teks);
        TextView textView2 = (TextView)findViewById(R.id.teks2);

        Intent intent = getIntent();
        gambar = intent.getIntExtra("gambar",gambar);
        imageView.setImageResource(gambar);
        textView.setText(intent.getStringExtra("text1"));
        textView2.setText(intent.getStringExtra("text2"));

        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home) finish();
        return  super.onOptionsItemSelected(item);
    }
}
