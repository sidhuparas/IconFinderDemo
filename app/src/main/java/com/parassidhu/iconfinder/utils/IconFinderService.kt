package com.parassidhu.iconfinder.utils

import com.parassidhu.iconfinder.model.ApiResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap
import retrofit2.http.Streaming
import retrofit2.http.Url

interface IconFinderService {

    @GET(ICONS_URL)
    suspend fun getIcons(@QueryMap params: Map<String, String>) : Response<ApiResponse>

    @GET
    @Streaming
    fun downloadFile(@Url url: String): Call<ResponseBody>
}