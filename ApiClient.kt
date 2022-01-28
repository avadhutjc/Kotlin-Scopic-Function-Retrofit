package com.ajc.kotlinscopicfunction

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {
    //https://reqres.in/api/users/2
    @GET("/api/users/{ID}")


    fun getUserDetails(@Path("ID") id: Int): Call<ResponseDTO>
}