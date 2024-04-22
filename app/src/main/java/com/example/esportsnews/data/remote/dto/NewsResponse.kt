package com.example.esportsnews.data.remote.dto

import com.example.esportsnews.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
