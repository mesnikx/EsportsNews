package com.example.esportsnews.data.mappers

import com.example.esportsnews.data.local.NewsEntity
import com.example.esportsnews.data.remote.dto.NewsResponseDto
import com.example.esportsnews.domain.model.Article
import com.example.esportsnews.domain.model.Source

fun NewsResponseDto.toNewsEntity(): NewsEntity {
    return NewsEntity(
        articles = articles,
        status = status,
        totalResults = totalResults
    )
}

fun NewsEntity.toArticle(): Article {
    return Article(
        author =
    )
}