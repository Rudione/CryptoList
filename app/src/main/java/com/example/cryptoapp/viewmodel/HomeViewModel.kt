package com.example.cryptoapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.domain.usecase.GetCoinsUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val useCase: GetCoinsUseCase
): ViewModel() {

}