package com.sercan.cryptoapp.domain.model

import com.sercan.cryptoapp.data.remote.dto.Team

data class CoinDetail(

    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank:Int,
    val isActive: Boolean,
    var tags : List<String>,
    val team: List<Team>,
    val type: String

)
