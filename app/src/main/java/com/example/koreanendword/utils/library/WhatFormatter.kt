package com.example.koreanendword.utils.library

import com.example.koreanendword.utils.checkEnglish
import com.example.koreanendword.utils.checkKorean
import com.example.koreanendword.utils.checkNumber

object WhatFormatter {
    fun format(name: String): String {
        val lastName = name[name.length - 1]

        if (checkKorean(lastName)) {
            if (lastName.code < 0xAC00 || lastName.code > 0xD7A3) {
                return name + "을"
            }
            val formatValue = if ((lastName.code - 0xAC00) % 28 > 0) "을" else "를"
            return name + formatValue
        }
        if (checkEnglish(lastName)) return name + "를"
        if (checkNumber(lastName)) return name + "을"
        return name
    }
}
