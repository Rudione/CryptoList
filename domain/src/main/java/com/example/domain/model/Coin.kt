package com.example.domain.model

data class Coin(
    val id: String,
    val name: String,
    val isActive: Boolean,
    val rank: Int,
    val symbol: String
)