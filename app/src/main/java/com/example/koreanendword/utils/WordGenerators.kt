package com.example.koreanendword.utils

import kotlin.random.Random

object WordGenerators {

    private val random = Random

    fun generates(size: Int): List<String> {
        val words: MutableList<String> = mutableListOf()
        for (i in 0 until size) {
            words.add(wordGenerate())
        }
        return words.toList()
    }

    private fun wordGenerate(length: Int = random.nextInt(1, 10)): String {
        val chars = mutableListOf<Char>()
        val koreanRange = 0xAC00..0xD7A3
        val englishRange = 'a'.code..'z'.code
        val numbersRange = '0'.code..'9'.code

        for (i in 0 until length) {
            val char = when (random.nextInt(3)) {
                0 -> random.nextInt(englishRange.last - englishRange.first + 1) + englishRange.first
                1 -> random.nextInt(numbersRange.last - numbersRange.first + 1) + numbersRange.first
                else -> random.nextInt(koreanRange.last - koreanRange.first + 1) + koreanRange.first
            }.toChar()
            chars.add(char)
        }
        return chars.joinToString("")
    }
}