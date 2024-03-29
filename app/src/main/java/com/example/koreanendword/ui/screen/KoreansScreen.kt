package com.example.koreanendword.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.koreanendword.KoreanViewModel
import com.example.koreanendword.component.Label
import com.example.koreanendword.component.Message
import com.example.koreanendword.utils.KoreanFormat
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
            Label(label = it.toString())
            KoreanItem(names = names, format = it)
            Spacer(modifier = Modifier.fillMaxWidth().height(1.dp).background(Color.Black))
        }
    }
}

@Composable
fun KoreanItem(
    names: List<String>,
    format: KoreanFormat
) {
    names.forEach {
        Message(message = KoreanUtil.format(it, format))
    }
}