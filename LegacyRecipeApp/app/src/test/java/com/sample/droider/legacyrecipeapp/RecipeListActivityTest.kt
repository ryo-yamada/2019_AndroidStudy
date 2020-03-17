package com.sample.droider.legacyrecipeapp

import androidx.recyclerview.widget.RecyclerView
import com.sample.droider.legacyrecipeapp.activity.RecipeListActivity
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RecipeListActivityTest {

    @Test
    fun isRecipeListCountZero(){
        val controller = Robolectric.buildActivity<RecipeListActivity>(RecipeListActivity::class.java).setup()
        controller.start()

        val recyclerView: RecyclerView = controller.get().findViewById(R.id.recycler)
        assertThat(recyclerView.adapter?.itemCount, equalTo(0))
    }
}