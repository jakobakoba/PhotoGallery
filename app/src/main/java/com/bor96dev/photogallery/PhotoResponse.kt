package com.bor96dev.photogallery

import com.bor96dev.photogallery.api.GalleryItem
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoResponse (
    @Json(name = "photo") val galleryItems: List<GalleryItem>
)