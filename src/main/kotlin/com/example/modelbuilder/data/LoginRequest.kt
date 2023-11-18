package com.example.modelbuilder.data

data class LoginRequest(
        val j_username: String,
        val j_password: String,
        val x: Int = 0,
        val y: Int = 0
)