package com.sample.droider.legacyrecipeapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.sample.droider.legacyrecipeapp.util.DimensUtil
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.not
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DimensUtilTest {
    @Test
    fun dpToPxIsZeroTest() {
        Assert.assertThat(DimensUtil.dpToPx(0, InstrumentationRegistry.getInstrumentation().context), `is`(0))
    }

    @Test
    fun dpToPxNotZeroTest() {
        Assert.assertThat(DimensUtil.dpToPx(8, InstrumentationRegistry.getInstrumentation().context), `is`(not(0)))
    }

    @Test
    fun pxToDpIsZeroTest() {
        Assert.assertThat(DimensUtil.pxToDp(0, InstrumentationRegistry.getInstrumentation().context), `is`(0))
    }

    @Test
    fun pxToDpNotZeroTest() {
        Assert.assertThat(DimensUtil.pxToDp(8, InstrumentationRegistry.getInstrumentation().context), `is`(not(0)))
    }

}