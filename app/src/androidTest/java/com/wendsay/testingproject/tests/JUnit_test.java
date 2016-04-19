package com.wendsay.testingproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.wendsay.testingproject.MainActivity;
import com.wendsay.testingproject.R;

/**
 * Created by Glynn on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
