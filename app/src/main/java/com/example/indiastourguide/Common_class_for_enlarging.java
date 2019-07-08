package com.example.indiastourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Common_class_for_enlarging extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.after_enlarging);

        Toolbar toolbar = findViewById(R.id.toolbar_after_enlarging);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ImageView imageView = findViewById(R.id.image_after_enlarging);
        TextView textView = findViewById(R.id.text_after_enlarging);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("Image", 0));
        textView.setText(intent.getStringExtra("Text"));
    }
}
