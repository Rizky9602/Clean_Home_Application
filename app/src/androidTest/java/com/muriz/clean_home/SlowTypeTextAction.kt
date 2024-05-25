package com.muriz.clean_home

import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import android.view.View
import android.widget.EditText
import org.hamcrest.Matcher
import java.util.concurrent.TimeUnit
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom

class SlowTypeTextAction(private val text: String, private val delay: Long) : ViewAction {
    override fun getConstraints(): Matcher<View> {
        return isDisplayed()
    }

    override fun getDescription(): String {
        return "Type text slowly with delay $delay ms between characters"
    }

    override fun perform(uiController: UiController, view: View) {
        if (view is EditText) {
            for (c in text.toCharArray()) {
                view.append(c.toString())
                uiController.loopMainThreadForAtLeast(delay)
            }
        }
    }
}