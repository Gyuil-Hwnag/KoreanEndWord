package com.example.koreanendword.utils.library

import com.example.koreanendword.utils.checkEnglish
import com.example.koreanendword.utils.checkKorean
import com.example.koreanendword.utils.checkNumber

object WithFormatter {
    fun format(name: String): String {
        val lastName = name[name.length - 1]

        if (checkKorean(lastName)) {
            if (lastName.code < 0xAC00 || lastName.code > 0xD7A3) {
                return name + "과"
            }
            val formatValue = if ((lastName.code - 0xAC00) % 28 > 0) "과" else "와"
            return name + formatValue
        }
        if (checkEnglish(lastName)) return name + "와"
        if (checkNumber(lastName)) return name + "과"
        return name
    }
}
