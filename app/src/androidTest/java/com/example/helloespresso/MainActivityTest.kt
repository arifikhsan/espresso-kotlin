package com.example.helloespresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


// Created by Arif Ikhsanudin on 9/2/2019.

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun areYouThere() {
        onView(withId(R.id.hello_world_text)).check(matches(isDisplayed()))
    }

    @Test
    fun listGoesOverTheFold() {
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}
