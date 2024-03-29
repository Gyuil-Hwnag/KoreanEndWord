package com.example.koreanendword

import androidx.lifecycle.ViewModel
import com.example.koreanendword.utils.KoreanFormat
import com.example.koreanendword.utils.checkNames
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class KoreanViewModel : ViewModel() {

    private val _names: MutableStateFlow<List<String>> = MutableStateFlow<List<String>>(emptyList())
    val names: StateFlow<List<String>> = _names.asStateFlow()

    private val _format: MutableStateFlow<List<KoreanFormat>> = MutableStateFlow<List<KoreanFormat>>(emptyList())
    val format: StateFlow<List<KoreanFormat>> = _format.asStateFlow()

    init {
        _names.value = checkNames
        _format.value = listOf(KoreanFormat.FROM, KoreanFormat.WITH, KoreanFormat.WHO, KoreanFormat.WHAT)
    }

}