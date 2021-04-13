package com.example.hotelsbd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adapter extends FirebaseRecyclerAdapter<model, Adapter.viewholder> {

    public Adapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewholder holder, int position, @NonNull model model) {
        holder.textView.setText(model.getH_Name());
        holder.textView1.setText(model.getAddress());
        Glide.with(holder.imageView.getContext()).load(model.getImage()).into(holder.imageView);
        holder.ratingBar.setRating(model.getRating());
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel,parent,false);
        return new viewholder(view);
    }

    public class viewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView,textView1;
        RatingBar ratingBar;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img1);
            textView = itemView.findViewById(R.id.hname);
            textView1 = itemView.findViewById(R.id.address);
            ratingBar = itemView.findViewById(R.id.mainratingBar);

        }
    }
}
