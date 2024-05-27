package com.example.esportsnews.data.mappers

import com.example.esportsnews.data.local.NewsEntity
import com.example.esportsnews.data.remote.dto.NewsResponseDto

fun NewsResponseDto.toNewsEntity(): NewsEntity {
    return NewsEntity(
        articles = articles,
        status = status,
        totalResults = totalResults
    )
}
