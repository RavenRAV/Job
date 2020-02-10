package com.example.jobs.ui.main;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jobs.R;
import com.example.jobs.data.entity.Result;

public class JobViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle;
    private TextView tvDesc;

    public JobViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvDesc = itemView.findViewById(R.id.tvDescription);
    }

    public void bind(Result result) {
        tvTitle.setText(result.getTitle());
        tvDesc.setText(result.getDescription());

    }
}
