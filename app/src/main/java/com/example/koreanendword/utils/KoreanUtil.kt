package com.example.koreanendword.utils

import com.example.koreanendword.utils.library.FromFormatter
import com.example.koreanendword.utils.library.WhatFormatter
import com.example.koreanendword.utils.library.WhoFormatter
import com.example.koreanendword.utils.library.WithFormatter

object KoreanUtil {
    fun format(name: String, type: KoreanFormat): String {
        return when (type) {
            KoreanFormat.FROM -> FromFormatter.format(name)
            KoreanFormat.WITH -> WithFormatter.format(name)
            KoreanFormat.WHO -> WhoFormatter.format(name)
            KoreanFormat.WHAT -> WhatFormatter.format(name)
        }
    }
}
