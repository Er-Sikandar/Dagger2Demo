package com.shailersolutions.dagger2injectiondemo;

import android.util.Log;

import javax.inject.Inject;

class Remote {
@Inject
    public Remote() {
    }



   public void setListener(Car car){
       Log.e("Remote ","Remote");
   }
}
