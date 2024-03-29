package com.example.koreanendword

import com.example.koreanendword.utils.library.WithFormatter
import org.junit.Assert
import org.junit.Test

class WithFormatterTest {

    @Test
    fun `이름이_황규일이면_결과는_황규일과_이다`() {
        val given = "황규일"
        val actual = WithFormatter.format(given)
        val expected = "황규일과"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_duru이면_결과는_duru와_이다`() {
        val given = "duru"
        val actual = WithFormatter.format(given)
        val expected = "duru와"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_111이면_결과는_111과_이다`() {
        val given = "111"
        val actual = WithFormatter.format(given)
        val expected = "111과"

        Assert.assertEquals(expected, actual)
    }
}