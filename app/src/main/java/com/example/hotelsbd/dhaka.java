package com.example.hotelsbd;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class dhaka extends Fragment {

    LinearLayout rad;
    Adapter adapter;
    RecyclerView recyclerView;
    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference mRef= firebaseDatabase.getReference("District");

    public dhaka() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dhaka, container, false);
//        rad=view.findViewById(R.id.raddision);
        recyclerView=view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        FirebaseRecyclerOptions<model> data =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(mRef.child("Dhaka"), model.class)
                        .build();

        adapter=new Adapter(data);
        recyclerView.setAdapter(adapter);


//        rad.setOnClickListener(new  View.OnClickListener() {
//            @Override
//            public void onClick(View view1) {
////                Intent raddison = new Intent(getActivity(), radission.class);
////                startActivity(raddison);
//            };
//        });

        return view;
    }

//    @Override
//    public void onStart() {
//        super.onStart();
//        adapter.startListening();
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        adapter.stopListening();
//    }
}