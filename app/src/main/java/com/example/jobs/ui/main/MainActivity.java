package com.example.jobs.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.jobs.R;
import com.example.jobs.data.entity.JobsEntity;
import com.example.jobs.data.network.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private JobAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
        setupRecyclerView();
        fetchJobs();
    }

    private void setupViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void setupRecyclerView() {
        adapter = new JobAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void fetchJobs() {
        RetrofitBuilder
                .getService()
                .getJobs("fc559d2c", "9fcf90902bee2a0896eff852fb5ba21f")
                .enqueue(new Callback<JobsEntity>() {
                    @Override
                    public void onResponse(Call<JobsEntity> call, Response<JobsEntity> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            adapter.setList(response.body().getResults());
                        } else {
                            Toast.makeText(getApplicationContext(), "No data", Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void onFailure(Call<JobsEntity> call, Throwable t) {
                        Log.d("Failure", "hgrd");
                    }
                });
    }
}
