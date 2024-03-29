package com.example.koreanendword

import com.example.koreanendword.utils.library.FromFormatter
import org.junit.Assert
import org.junit.Test

class FromFormatterTest {

    @Test
    fun `이름이_황규일이면_결과는_황규일은_이다`() {
        val given = "황규일"
        val actual = FromFormatter.format(given)
        val expected = "황규일은"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_duru이면_결과는_duru는_이다`() {
        val given = "duru"
        val actual = FromFormatter.format(given)
        val expected = "duru는"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_111이면_결과는_111은_이다`() {
        val given = "111"
        val actual = FromFormatter.format(given)
        val expected = "111은"

        Assert.assertEquals(expected, actual)
    }
}