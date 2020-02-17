package com.sample.droider.legacyrecipeapp.scenario

import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.IdlingResource
import androidx.test.espresso.intent.rule.IntentsTestRule
import com.sample.droider.legacyrecipeapp.activity.RecipeListActivity
import com.sample.droider.legacyrecipeapp.pages.RecipeListPage
import com.squareup.spoon.SpoonRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class RecipeListTestScenario {
    @JvmField
    @Rule
    val rule: IntentsTestRule<RecipeListActivity> = IntentsTestRule(RecipeListActivity::class.java, true, true)

    var initializeIdlingResource: IdlingResource? = null

    @JvmField
    @Rule
    val spoon = SpoonRule()

    @Before
    fun setUp() {
        initializeIdlingResource = rule.activity.loadingIdlingResource
        IdlingRegistry.getInstance().register(initializeIdlingResource)
    }

    @After
    fun tearDown() {
        initializeIdlingResource?.run {
            IdlingRegistry.getInstance().unregister(this)
            initializeIdlingResource = null
        }
    }

    @Test
    fun launchRecipeList(){
        spoon.screenshot(rule.activity, "RecipeList")
    }

    @Test
    fun moveToDetail() {
        val page = RecipeListPage()
        page.clickToList(0)
    }
}