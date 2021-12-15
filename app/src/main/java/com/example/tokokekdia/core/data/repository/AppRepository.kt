package com.example.tokokekdia.core.data.repository


import com.example.tokokekdia.core.data.source.local.LocalDataSource
import com.example.tokokekdia.core.data.source.remote.RemoteDataSource
import com.example.tokokekdia.core.data.source.remote.request.LoginRequest
import kotlinx.coroutines.flow.flow

class AppRepository (val local :LocalDataSource, val remote:RemoteDataSource) {
    fun login(data :LoginRequest) = flow {
        try {
            remote.login(data).let {
                if(it.isSuccessful){
                    val body=it.body()
                    emit(body)
                    com.inyongtisto.myhelper.extension.logs("success"+body.toString())

                }else{
                    com.inyongtisto.myhelper.extension.logs("Error:"+"keterangan eror")
                }
            }
        }catch (e:Exception){
            com.inyongtisto.myhelper.extension.logs("login erorr yang di handle :"+ e.message)
        }
    }
}