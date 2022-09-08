package com.example.spaceapp.data.remote

import com.example.spaceapp.data.entities.ResultSpace
import retrofit2.Response
import retrofit2.http.GET

interface SpaceService {
    @GET("articles")
    suspend fun getAllSpace() : Response<ResultSpace>
}