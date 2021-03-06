package com.dev.userdetailsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dev.userdetailsapp.data.ApiHelper
import com.dev.userdetailsapp.repository.UserRepositoryImpl
import com.dev.userdetailsapp.viewmodel.UserDetailViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserDetailViewModel::class.java)) {
            return UserDetailViewModel(UserRepositoryImpl(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}