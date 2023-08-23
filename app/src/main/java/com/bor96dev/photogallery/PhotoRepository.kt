package com.bor96dev.photogallery

import com.bor96dev.photogallery.api.GalleryItem
import com.bor96dev.photogallery.api.UnsplashApi
import com.bor96dev.photogallery.api.UnsplashApi.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class PhotoRepository {
    private val unsplashApi: UnsplashApi

    init{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        unsplashApi = retrofit.create()
    }

    suspend fun fetchPhotos() : List<GalleryItem> = unsplashApi.fetchPhotos().galleryItems
}