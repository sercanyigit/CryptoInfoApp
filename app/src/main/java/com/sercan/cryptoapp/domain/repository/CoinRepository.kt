package com.sercan.cryptoapp.domain.repository


import com.sercan.cryptoapp.data.remote.dto.CoinDetailDto
import com.sercan.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}