package com.example.monsterhunter;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONplaceholder {
    @GET("monsters")
    Call <List<Monster>> getallmonsters();
}
