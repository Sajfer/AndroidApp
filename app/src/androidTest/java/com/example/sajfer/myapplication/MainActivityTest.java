package com.example.sajfer.myapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;


/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity activity;
    private TextView text;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        activity = getActivity();
        text = (TextView)activity.findViewById(R.id.tv_id);
    }

    public void testPreconditions() {
        assertNotNull("mFirstTestActivity is null", activity);
    }

    public void test1() {
        final String expected = activity.getString(R.string.textViewString)+ "1sd";
        final String actual = text.getText().toString();
        assertEquals(expected, actual);
    }
}