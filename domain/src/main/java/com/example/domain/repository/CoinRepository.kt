package com.example.domain.repository

import com.example.domain.model.Coin

interface CoinRepository {

    suspend fun getAllCoins(): List<Coin>
}