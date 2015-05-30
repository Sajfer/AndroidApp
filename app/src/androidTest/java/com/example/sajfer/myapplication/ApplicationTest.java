package com.example.sajfer.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {

    private Application app;

    public ApplicationTest() {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        app = getApplication();
    }

    public void testPreconditions() {
        assertNotNull("mFirstTestActivity is null", app);
    }

    public void test1() {

    }
}