package com.example.modelbuilder.service

import com.example.modelbuilder.data.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthService {
    @FormUrlEncoded
    @POST("/builder/j_spring_security_check")
    fun login(
            @Field("j_username") username: String,
            @Field("j_password") password: String,
    ): Call<LoginResponse>
}