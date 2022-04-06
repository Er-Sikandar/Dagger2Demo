package com.shailersolutions.dagger2injectiondemo.classes;

import android.util.Log;

import javax.inject.Inject;

public class Engine {

    @Inject
    public Engine() {

    }
    @Inject
    void getFourWheel(){
        Log.e("Four wheels ","Four Wheels");
    }
    @Inject
    void getTwoWheel(){
        Log.e("Two wheels ","Two Wheels");
    }

}
