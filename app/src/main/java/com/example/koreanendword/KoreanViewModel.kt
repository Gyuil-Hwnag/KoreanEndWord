package com.example.koreanendword

import androidx.lifecycle.ViewModel
import com.example.koreanendword.utils.checkNames
import com.example.koreanendword.utils.fromFormat
import com.example.koreanendword.utils.whatFormat
import com.example.koreanendword.utils.whoFormat
import com.example.koreanendword.utils.withFormat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class KoreanViewModel : ViewModel() {

    private val _names: MutableStateFlow<List<String>> = MutableStateFlow<List<String>>(emptyList())
    val names: StateFlow<List<String>> = _names.asStateFlow()

    private val _format: MutableStateFlow<List<Pair<String, String>>> = MutableStateFlow<List<Pair<String, String>>>(emptyList())
    val format: StateFlow<List<Pair<String, String>>> = _format.asStateFlow()

    init {
        _names.value = checkNames
        _format.value = listOf(fromFormat, withFormat, whoFormat, whatFormat)
    }

}