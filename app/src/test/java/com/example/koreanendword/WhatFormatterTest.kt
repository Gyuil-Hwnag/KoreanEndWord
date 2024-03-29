package com.example.koreanendword

import com.example.koreanendword.utils.library.WhatFormatter
import org.junit.Assert
import org.junit.Test

class WhatFormatterTest {

    @Test
    fun `이름이_황규일이면_결과는_황규일을_이다`() {
        val given = "황규일"
        val actual = WhatFormatter.format(given)
        val expected = "황규일을"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_duru이면_결과는_duru를_이다`() {
        val given = "duru"
        val actual = WhatFormatter.format(given)
        val expected = "duru를"

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `이름이_111이면_결과는_111을_이다`() {
        val given = "111"
        val actual = WhatFormatter.format(given)
        val expected = "111을"

        Assert.assertEquals(expected, actual)
    }
}