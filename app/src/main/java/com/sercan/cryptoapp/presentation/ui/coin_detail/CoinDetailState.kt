package com.sercan.cryptoapp.presentation.ui.coin_detail

import com.sercan.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)