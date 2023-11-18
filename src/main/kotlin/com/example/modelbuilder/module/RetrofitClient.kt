package com.example.modelbuilder.module

import com.example.modelbuilder.service.AuthService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://bizmob.mcnc.co.kr"

    val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val authService: AuthService = retrofit.create(AuthService::class.java)
}