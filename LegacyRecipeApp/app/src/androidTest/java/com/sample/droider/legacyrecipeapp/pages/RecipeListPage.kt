package com.sample.droider.legacyrecipeapp.pages

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.sample.droider.legacyrecipeapp.R

object RecipeListPage {

    /**
     * 指定した位置をタップする
     * @param position position
     */
    fun clickToList(position: Int) = apply {
        onView(withId(R.id.recycler)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(position, click()))
    }
}
