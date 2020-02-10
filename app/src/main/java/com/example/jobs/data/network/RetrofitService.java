package com.example.jobs.data.network;

import com.example.jobs.data.entity.JobsEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("jobs/gb/search/1")
    Call<JobsEntity> getJobs(
            @Query("app_id") String appId,
            @Query("app_key") String appKey
    );
}
//?app_id=fc559d2c&app_key=9fcf90902bee2a0896eff852fb5ba21f
