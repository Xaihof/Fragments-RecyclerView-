package com.example.frecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.frecycler.databinding.ItemLayoutBinding;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {

    ArrayList<ModelClass> modelClassArrayList = new ArrayList<>();

    public AdapterClass(ArrayList<ModelClass> modelClassArrayList) {
        this.modelClassArrayList = modelClassArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ModelClass modelClass = modelClassArrayList.get(position);
        holder.itemLayoutBinding.textViewName.setText(modelClass.getName());
        holder.itemLayoutBinding.textViewPassword.setText(modelClass.getPassword());
        holder.itemView.setOnClickListener(view -> {

            Toast.makeText(view.getContext(), modelClass.getName(), Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLayoutBinding itemLayoutBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemLayoutBinding = ItemLayoutBinding.bind(itemView);
        }
    }

}
