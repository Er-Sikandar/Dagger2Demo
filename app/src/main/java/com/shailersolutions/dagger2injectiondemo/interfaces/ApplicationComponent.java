package com.shailersolutions.dagger2injectiondemo.interfaces;

import com.shailersolutions.dagger2injectiondemo.MainActivity;

 import dagger.Component;

@Component
public interface ApplicationComponent {
     //  Car getCar();

     void inject(MainActivity mainActivity);


}
