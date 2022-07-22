package com.example.atm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderAPI {

    @GET("/atm")
    Call<List<Model>> getData();
}
