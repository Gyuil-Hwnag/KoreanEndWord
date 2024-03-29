package com.example.koreanendword.utils

object KoreanUtil {
    fun format(name: String, firstFormat: String, secondFormat: String): String {
        val lastName = name[name.length - 1]

        if (lastName.code < 0xAC00 || lastName.code > 0xD7A3) {
            return name + secondFormat
        }
        val formatValue = if ((lastName.code - 0xAC00) % 28 > 0) firstFormat else secondFormat
        return name + formatValue
    }
}
