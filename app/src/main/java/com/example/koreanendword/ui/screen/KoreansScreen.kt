package com.example.koreanendword.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.koreanendword.KoreanViewModel
import com.example.koreanendword.component.Label
import com.example.koreanendword.component.Message
import com.example.koreanendword.utils.KoreanUtil

@Composable
fun KoreanScreen(
    viewModel: KoreanViewModel
) {
    val scrollState = rememberScrollState()

    val names by viewModel.names.collectAsState()
    val format by viewModel.format.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        format.forEach {
            KoreanItem(names = names, format = it)
        }
    }
}

@Composable
fun KoreanItem(
    names: List<String>,
    format: Pair<String, String>
) {
    names.forEach {
        Label(label = format.toString())
        Message(message = KoreanUtil.format(it, format.first, format.second))
    }
}