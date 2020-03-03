package com.sample.droider.legacyrecipeapp.activity

import androidx.test.espresso.IdlingResource

class TestIdlingResource(private val name: String) : IdlingResource {

    private var callback: IdlingResource.ResourceCallback? = null
    var isIdle: Boolean = false
        set(value) {
            field = value
            if (value) {
                callback?.run { onTransitionToIdle() }
            }
        }

    override fun getName(): String = this.name

    override fun isIdleNow(): Boolean = isIdle

    override fun registerIdleTransitionCallback(callback: IdlingResource.ResourceCallback?) {
        this.callback = callback
    }
}