package com.bor96dev.photogallery.api

import com.bor96dev.photogallery.PhotoResponse
import retrofit2.http.GET

interface UnsplashApi {

    @GET("photos?&client_id=$ACCESS_KEY&per_page=10&format=json&nojsoncallback=1&extras=url_s")
    suspend fun fetchPhotos(): PhotoResponse

    companion object{
        const val BASE_URL = "https://api.unsplash.com/"
        const val ACCESS_KEY = "Iz7A4aVP8c0F-ZbolbOnREOdXOKehcsPlbIsStnup38"
    }
}