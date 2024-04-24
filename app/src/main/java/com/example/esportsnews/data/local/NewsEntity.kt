package com.example.esportsnews.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.esportsnews.domain.model.Article

@Entity
data class NewsEntity(
    @PrimaryKey
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
