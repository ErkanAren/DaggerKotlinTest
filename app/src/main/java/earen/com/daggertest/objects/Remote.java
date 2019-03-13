package earen.com.daggertest.objects;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        if(car==null){
            Log.d(TAG, "Remote disconnected");

        }else {
            Log.d(TAG, "Remote connected");

        }
    }
}