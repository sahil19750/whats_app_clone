package com.example.whatsappclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class StatusFragment extends Fragment {

    ArrayList<ContactModel> contactModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_status, container, false);




        RecyclerView recyclerView=view.findViewById(R.id.recycler_view);
        contactModels=new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        contactModels.add(new ContactModel(R.drawable.logo,"Aditya","10:00 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Nitin","10:25 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashish","10:00 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashwani","11:40 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Nitin","10:25 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashish","10:00 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashwani","11:40 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashish","10:00 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashwani","11:40 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Nitin","10:25 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashish","10:00 PM","India",R.drawable.call));
        contactModels.add(new ContactModel(R.drawable.logo,"Ashwani","11:40 PM","India",R.drawable.call));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(getContext(),contactModels);
        recyclerView.setAdapter(adapter);

        return view;
    }
}