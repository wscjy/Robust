package com.meituan.sample;

import android.util.Log;

/**
 * Created by hedingxu on 17/9/5.
 */

public class AddCustomClass {
    public static void visit() {
        int value = 2;
        TestPatchActivity testPatchActivity = new TestPatchActivity(value);
        Log.e("robust", "AddCustomClass : " + testPatchActivity.toString());
    }
}