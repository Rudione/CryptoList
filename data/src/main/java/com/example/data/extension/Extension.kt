package com.example.data.extension

import com.example.data.model.CoinModel
import com.example.domain.model.Coin

fun CoinModel.toCoin(): Coin {
    return Coin(
        id, name, isActive, rank, symbol
    )
}