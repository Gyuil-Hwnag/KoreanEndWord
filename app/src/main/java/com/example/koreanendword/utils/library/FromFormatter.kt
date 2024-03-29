package com.example.koreanendword.utils.library

import com.example.koreanendword.utils.checkEnglish
import com.example.koreanendword.utils.checkKorean
import com.example.koreanendword.utils.checkNumber

object FromFormatter {
    fun format(name: String): String {
        val lastName = name[name.length - 1]

        if (checkKorean(lastName) || checkEnglish(lastName)) {
            if (lastName.code < 0xAC00 || lastName.code > 0xD7A3) {
                return name + "는"
            }
            val formatValue = if ((lastName.code - 0xAC00) % 28 > 0) "은" else "는"
            return name + formatValue
        }
        if (checkNumber(lastName)) return name + "은"
        return name
    }
}
