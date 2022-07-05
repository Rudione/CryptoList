package com.example.data.repository

import com.example.data.api.CoinApi
import com.example.data.extension.toCoin
import com.example.domain.model.Coin
import com.example.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinApi: CoinApi
): CoinRepository {
    override suspend fun getAllCoins(): List<Coin> {
        return coinApi.getCoins().map { it.toCoin() }
    }
}