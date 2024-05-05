package com.example.frecycler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.frecycler.databinding.FragmentRecyclerBinding;

import java.util.ArrayList;

public class RecyclerFragment extends Fragment {

    public RecyclerFragment() {
        // Required empty public constructor
    }

    FragmentRecyclerBinding fragmentRecyclerBinding;
    ArrayList<ModelClass> modelClassArrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentRecyclerBinding = FragmentRecyclerBinding.inflate(inflater, container, false);
        return fragmentRecyclerBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        modelClassArrayList = new ArrayList<>();
        modelClassArrayList.add(new ModelClass("Abdullah Azeem XAIHOF", "a"));
        modelClassArrayList.add(new ModelClass("Arslan Rajpoot", "b"));
        modelClassArrayList.add(new ModelClass("Khalil Akbar Niazi", "c"));
        modelClassArrayList.add(new ModelClass("Ahmed Raza", "d"));
        modelClassArrayList.add(new ModelClass("Basim Khan", "e"));
        modelClassArrayList.add(new ModelClass("Farhan Gul", "f"));
        modelClassArrayList.add(new ModelClass("Shahid Ali", "g"));
        modelClassArrayList.add(new ModelClass("Zeshan Khan", "h"));
        modelClassArrayList.add(new ModelClass("Rehan Ahmed", "i"));
        modelClassArrayList.add(new ModelClass("Abdullah Azeem XAIHOF", "a"));
        modelClassArrayList.add(new ModelClass("Arslan Rajpoot", "b"));
        modelClassArrayList.add(new ModelClass("Khalil Akbar Niazi", "c"));
        modelClassArrayList.add(new ModelClass("Ahmed Raza", "d"));
        modelClassArrayList.add(new ModelClass("Basim Khan", "e"));
        modelClassArrayList.add(new ModelClass("Farhan Gul", "f"));
        modelClassArrayList.add(new ModelClass("Shahid Ali", "g"));
        modelClassArrayList.add(new ModelClass("Zeshan Khan", "h"));
        modelClassArrayList.add(new ModelClass("Rehan Ahmed", "i"));


        AdapterClass adapterClass = new AdapterClass(modelClassArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        fragmentRecyclerBinding.recyclerView.setLayoutManager(linearLayoutManager);
        fragmentRecyclerBinding.recyclerView.setAdapter(adapterClass);


    }
}