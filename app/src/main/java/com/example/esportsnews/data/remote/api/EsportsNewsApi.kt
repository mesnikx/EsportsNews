package com.example.esportsnews.data.remote.api

import com.example.esportsnews.common.utils.Constants.Companion.API_KEY
import com.example.esportsnews.data.remote.dto.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EsportsNewsApi {

    @GET("v2/everything")

    suspend fun getEsportsNews(
        @Query("q") searchQuery: String = "esports",
        @Query("page") pageNumber: Int,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>

}