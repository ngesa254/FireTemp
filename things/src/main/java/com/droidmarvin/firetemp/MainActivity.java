package com.droidmarvin.firetemp;

import android.app.Activity;
import android.os.Bundle;

/**
 * detect high temp and send events to firebase
 * Receive instructions form a companion app through firebase
 * Push notifications to companion app
 * https://github.com/androidthings/contrib-drivers/tree/master/apa102
 * https://github.com/androidthings/contrib-drivers/tree/master/bmx280
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
