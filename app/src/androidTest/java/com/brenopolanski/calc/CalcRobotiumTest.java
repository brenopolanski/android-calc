package com.brenopolanski.calc;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by root on 09/03/18.
 */

public class CalcRobotiumTest extends ActivityInstrumentationTestCase2<CalcActivity> {

    private Solo solo;

    public CalcRobotiumTest() {
        super(CalcActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

    public void testFillInputs() {
        solo.enterText(0, "5");
        solo.enterText(1, "3");
        solo.clickOnButton(0);
    }

    public void testNullInputs() {
        solo.enterText(0, "");
        solo.enterText(1, "");
        solo.clickOnButton(0);
    }

    public void testCalcSum() {
        solo.enterText(0, "2");
        solo.enterText(1, "2");
        solo.clickOnButton(0);

        String result = solo.getText(2).getText().toString();

        boolean isRight = result.equals("4");
        assertTrue("Value does not match: ", isRight);
    }

    public void testCalcMinus() {
        solo.enterText(0, "10");
        solo.enterText(1, "5");
        solo.clickOnButton(1);

        String result = solo.getText(2).getText().toString();

        boolean isRight = result.equals("5");
        assertTrue("Value does not match: ", isRight);
    }

    public void testCalcDivision() {
        solo.enterText(0, "0");
        solo.enterText(1, "0");
        solo.clickOnButton(3);
        assertTrue("Message not displayed: ", solo.searchText("Can't be split by zero!"));
    }
}
