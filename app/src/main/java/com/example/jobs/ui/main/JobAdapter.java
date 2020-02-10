package com.example.jobs.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jobs.R;
import com.example.jobs.data.entity.JobsEntity;
import com.example.jobs.data.entity.Result;

import java.util.ArrayList;
import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobViewHolder> {
    private List<Result> data = new ArrayList<>();
    private Context context;

    @NonNull
    @Override
    public JobViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new JobViewHolder(LayoutInflater
                .from(context = parent.getContext())
                .inflate(R.layout.item_jobs, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull JobViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public void setList(List<Result>data){
        this.data = data;
        notifyDataSetChanged();
    }
}
