package com.teamtreehouse.testingbase;

import android.os.Build;
import android.view.inputmethod.EditorInfo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * Created by tiany on 2017/8/5.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {
    MainActivity activity;
    @Before
    public void setUp(){
//        activity = new MainActivity();
//        activity.onCreate(null);
    }
    @Test
    public void editTextUpdatesTextView() throws Exception{
//        // Arrange
//        String givenString = "test123";
//        activity.editText.setText(givenString);
//        // Act
//        activity.editText.onEditorAction(EditorInfo.IME_ACTION_DONE);
//
//        // Assert
//        String actualString = activity.textView.getText().toString();
//        assertEquals(givenString,actualString);
    }
}
