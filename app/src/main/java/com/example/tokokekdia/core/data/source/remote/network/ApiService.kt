package com.example.tokokekdia.core.data.source.remote.network
import com.example.tokokekdia.core.data.source.remote.request.LoginRequest
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @POST("login")
    suspend fun login(
        @Body login: LoginRequest,


    ): Response<RequestBody>

    @POST("register")
    suspend fun register(
        //@Body user: User
    ): Response<RequestBody>


}