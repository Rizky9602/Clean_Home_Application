package com.muriz.clean_home

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import com.MuRiz.clean_home.R
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var  activityScenarioRule = ActivityScenarioRule(IntroActivity::class.java)

    @Test
    fun useAppContext() {
        val context =ApplicationProvider.getApplicationContext<Context>()

        /**
         * on intro will be testing and wait for 1,5 sec
         * after that, program will clicking at button
         */
        Thread.sleep(1500)
        onView(withId(R.id.intro_button)).perform(click())

//        /**
//         * program will typing username and password uncorrected
//         * next step program try typing again with correct
//         */
//        onView(withId(R.id.login_username))
//            .perform(SlowTypeTextAction("salah",200))
//        onView(withId(R.id.login_password))
//            .perform(SlowTypeTextAction("salah",200))
//        onView(withId(R.id.login_password))
//            .perform(pressImeActionButton())
//        Thread.sleep(2000)

        onView(withId(R.id.login_username))
            .perform(SlowTypeTextAction("username",200))
        onView(withId(R.id.login_password))
            .perform(SlowTypeTextAction("password",200))
        onView(withId(R.id.login_password))
            .perform(pressImeActionButton())
        Thread.sleep(1500)

        onView(withId((R.id.main_ac)))
            .perform(click())
        Thread.sleep(1500)
        onView((withId(R.id.desc_back)))
            .perform(click())

        onView(withId((R.id.main_fabric)))
            .perform(click())
        Thread.sleep(1500)
        onView((withId(R.id.desc_back)))
            .perform(click())

        onView(withId((R.id.main_leather)))
            .perform(click())
        Thread.sleep(1500)
        onView((withId(R.id.desc_back)))
            .perform(click())

        onView(withId((R.id.main_carpet)))
            .perform(click())
        Thread.sleep(1500)
        onView((withId(R.id.desc_back)))
            .perform(click())
    }
}