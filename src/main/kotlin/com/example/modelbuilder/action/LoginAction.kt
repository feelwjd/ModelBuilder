package com.example.modelbuilder.action

import com.example.modelbuilder.data.LoginResponse
import com.example.modelbuilder.dialog.LoginDialog
import com.example.modelbuilder.module.RetrofitClient
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        // 사용자 입력값 받아오기
        val username = e.presentation.text // 예시로 액션의 텍스트를 사용하였습니다.
        val password = "your_password" // 비밀번호는 안전한 방법으로 처리되어야 합니다.

        // Retrofit2를 통한 로그인 요청
        val call: Call<LoginResponse> = RetrofitClient.authService.login(username, password)

        call.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful) {
                    val loginResponse = response.body()
                    val token = loginResponse?.token
                    // 로그인 성공 처리
                } else {
                    // 로그인 실패 처리
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                // 네트워크 오류 등 실패 시 처리
            }
        })
    }
}