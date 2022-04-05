package com.shailersolutions.dagger2injectiondemo;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    Engine engine;
    Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    void drive(){
        Log.e("Tag","Driving..");
    }
}
