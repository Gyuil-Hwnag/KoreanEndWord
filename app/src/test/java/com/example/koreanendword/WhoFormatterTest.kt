package com.example.koreanendword

import com.example.koreanendword.utils.library.WhoFormatter
import org.junit.Assert
import org.junit.Test

class WhoFormatterTest {

    @Test
    fun `이름이_황규일이면_결과는_황규일이_이다`() {
        val given = "황규일"
        val actual = WhoFormatter.format(given)
        val expected = "황규일이"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_duru이면_결과는_duru가_이다`() {
        val given = "duru"
        val actual = WhoFormatter.format(given)
        val expected = "duru가"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_111이면_결과는_111이_이다`() {
        val given = "111"
        val actual = WhoFormatter.format(given)
        val expected = "111이"

        Assert.assertEquals(expected, actual)
    }
}