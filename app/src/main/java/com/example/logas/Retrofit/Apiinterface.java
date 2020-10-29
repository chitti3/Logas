package com.example.logas.Retrofit;

import com.example.logas.Model.Home;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiinterface {
    @GET("index.php")
    Call<Home> getHome(
            @Query("route") String route
    );
}
