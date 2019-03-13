package earen.com.daggertest.objects;


import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheels;

    @Inject
    public Car(Engine engine, Wheel wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    @Inject
    public void disableRemote(Remote remote) {
        remote.setListener(null);
    }
    public void drive() {
        Log.d(TAG, "driving...");
    }
}