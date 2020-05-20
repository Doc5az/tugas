package com.example.bolaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detailsActivity extends AppCompatActivity {

    private int detailsClubImage;
    private String detailsClubName;
    private String detailsClubDetails,detailsClubRevenue;

    private ImageView detailsClubImageIV;
    private TextView detailsClubNameTV;
    private TextView detailsClubDetailsTV,detailsCLubRevenueTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        detailsClubImageIV = findViewById(R.id.detailsClubLogoIV);
        detailsClubNameTV = findViewById(R.id.detailsClubNameTV);
        detailsCLubRevenueTV = findViewById(R.id.detailsClubRevenueTV);
        detailsClubDetailsTV = findViewById(R.id.detailsClubDetailsTV);

        if(getIntent().getExtras()!= null)
        {
            detailsClubImage = getIntent().getIntExtra("image",0);
            detailsClubName = getIntent().getStringExtra("name");
            detailsClubRevenue = getIntent().getStringExtra("revenue");
            detailsClubDetails = getIntent().getStringExtra("details");

            detailsClubImageIV.setImageResource(detailsClubImage);
            detailsClubNameTV.setText(detailsClubName);
            detailsCLubRevenueTV.setText("Pendapatan club 2019  "+detailsClubRevenue);
            detailsClubDetailsTV.setText(detailsClubDetails);

        }
        else
        {
            Toast.makeText(this, "Data Tidak Ada Error", Toast.LENGTH_LONG).show();
        }
    }

    public void back(View view) {

        onBackPressed();
    }
}
