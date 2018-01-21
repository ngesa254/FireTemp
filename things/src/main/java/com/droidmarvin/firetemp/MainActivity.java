package com.droidmarvin.firetemp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.things.contrib.driver.apa102.Apa102;
import com.google.android.things.contrib.driver.bmx280.Bmx280;

import java.io.IOException;

import static android.content.ContentValues.TAG;

/**
 * detect high temp and send events to firebase
 * Receive instructions form a companion app through firebase
 * Push notifications to companion app
 * https://github.com/androidthings/contrib-drivers/tree/master/apa102
 * https://github.com/androidthings/contrib-drivers/tree/master/bmx280
 */

public class MainActivity extends Activity {

    private static final String SPI_LED_BUS = "";
    private static final String I2C_TEMP_BUS = "";

    private Apa102 mRGB;
    private Bmx280 mTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void setupRGB() {

        try {
            mRGB = new Apa102(SPI_LED_BUS, Apa102.Mode.RGB);
        } catch (IOException e) {
            Log.e(TAG, "Error while ", e);
        }

        Log.d(TAG, "OLED screen activity created");
    }

}
