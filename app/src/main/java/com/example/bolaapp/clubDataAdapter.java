package com.example.bolaapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class clubDataAdapter extends RecyclerView.Adapter<clubDataAdapter.ViewHolder> {

    private ArrayList<clubData> clubs;
    private Context context;

    public clubDataAdapter(ArrayList<clubData> clubs, Context context) {
        this.clubs = clubs;
        this.context = context;
    }

    @NonNull
    @Override
    public clubDataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View clubItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_layout,parent,false);
        return new ViewHolder(clubItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull clubDataAdapter.ViewHolder holder, int position) {
        final clubData currentClub = clubs.get(position);

        holder.logoCIV.setImageResource(currentClub.getClubLogo());
        holder.nameTV.setText(currentClub.getNamaClub());
        holder.locationTV.setText(currentClub.getLokasiClub());
        holder.revenueTV.setText("Pendapatan Club 2019:  "+currentClub.getPendaptanClub());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,detailsActivity.class);

                intent.putExtra("image",currentClub.getClubImage());
                intent.putExtra("name",currentClub.getNamaClub());
                intent.putExtra("location",currentClub.getLokasiClub());
                intent.putExtra("revenue",currentClub.getPendaptanClub());
                intent.putExtra("details",currentClub.getClubDetails());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView logoCIV;
        private TextView nameTV,locationTV,revenueTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            logoCIV = itemView.findViewById(R.id.clubLogoCIV);
            nameTV = itemView.findViewById(R.id.clubNameTV);
            locationTV = itemView.findViewById(R.id.clubLocationTV);
            revenueTV = itemView.findViewById(R.id.clubRevenueTV);
        }
    }
}
