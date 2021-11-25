package com.example.getreq.repository

import com.example.Retrofit.model.Post
import com.example.getreq.api.RetrofitInstance
import retrofit2.Response


class Repository {

    suspend fun getPost(): Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}