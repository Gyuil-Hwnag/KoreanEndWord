package com.example.koreanendword.utils

fun checkKorean(char: Char): Boolean = char.toString().matches("[ㄱ-ㅎ가-힣]+".toRegex())
fun checkEnglish(char: Char): Boolean = char.toString().matches("[a-zA-Z]+".toRegex())
fun checkNumber(char: Char): Boolean = char.toString().matches("[0-9]+".toRegex())