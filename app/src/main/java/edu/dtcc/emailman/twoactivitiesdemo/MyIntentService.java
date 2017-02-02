package edu.dtcc.emailman.twoactivitiesdemo;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by eric on 2/2/17.
 */

public class MyIntentService extends IntentService{

    private static final String TAG = "ERIC";

    public MyIntentService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Service Started");
    }
}
