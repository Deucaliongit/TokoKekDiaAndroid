package com.example.tokokekdia.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.tokokekdia.core.data.repository.AppRepository
import com.example.tokokekdia.core.data.source.remote.request.LoginRequest

class LoginViewModel(val repo: AppRepository):ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hy im Ilham"
    }
    val text: LiveData<String> = _text

    fun ubahData(){
        _text.postValue("GW develop ")
    }
    fun login(data :LoginRequest) = repo.login(data).asLiveData()

}