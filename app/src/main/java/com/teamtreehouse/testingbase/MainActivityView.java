package com.teamtreehouse.testingbase;

/**
 * Created by tiany on 2017/8/5.
 */

public interface MainActivityView {
    void changeTextViewText(String text);
    void changeBackgroundColor(int color);
    void launchOtherActivity(Class activity);
}
