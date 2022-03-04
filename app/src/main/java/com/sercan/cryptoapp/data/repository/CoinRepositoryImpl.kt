package com.sercan.cryptoapp.data.repository


import com.sercan.cryptoapp.data.remote.CoinPaprikaApi
import com.sercan.cryptoapp.data.remote.dto.CoinDetailDto
import com.sercan.cryptoapp.data.remote.dto.CoinDto
import com.sercan.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}