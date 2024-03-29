package com.example.koreanendword.utils

enum class KoreanFormat {
    FROM, WITH, WHO, WHAT;

    override fun toString(): String = when (this) {
        FROM -> "${FROM.name} (은, 는)"
        WITH -> "${WITH.name} (와, 과)"
        WHO -> "${WHO.name} (이, 가)"
        WHAT -> "${WHAT.name} (을, 를)"
    }
}
