package com.shailersolutions.dagger2injectiondemo.classes;

import android.util.Log;

import com.shailersolutions.dagger2injectiondemo.classes.Car;

import javax.inject.Inject;

class Remote {
@Inject
    public Remote() {
    }



   public void setListener(Car car){
       Log.e("Remote ","Remote");
   }
}
