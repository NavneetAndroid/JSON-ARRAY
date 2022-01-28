package com.example.jsonarray;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface myapi {
    @GET("todos")
    Call<List<model>>getmodel();
}
