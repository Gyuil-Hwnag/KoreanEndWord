package com.example.koreanendword

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.koreanendword.ui.screen.KoreanScreen
import com.example.koreanendword.ui.theme.KoreanEndWordTheme

class KoreanActivity : ComponentActivity() {

    private val viewModel by viewModels<KoreanViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KoreanEndWordTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    KoreanScreen(viewModel = viewModel)
                }
            }
        }
    }
}