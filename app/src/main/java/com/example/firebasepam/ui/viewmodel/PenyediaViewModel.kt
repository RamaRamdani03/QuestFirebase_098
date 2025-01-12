package com.example.firebasepam.ui.viewmodel

import InsertViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebasepam.MahasiswaApplications

object PenyediaViewModel {

    object PenyediaViewModel {
        val Factory = viewModelFactory {
            initializer { HomeViewModel(
                aplikasiKontak().container.mahasiswaRepository) }
            initializer { InsertViewModel(
                aplikasiKontak().container.mahasiswaRepository) }
        }
    }

    fun CreationExtras.aplikasiKontak(): MahasiswaApplications =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)
}