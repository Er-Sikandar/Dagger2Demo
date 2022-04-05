package com.shailersolutions.dagger2injectiondemo.interfaces;

import com.shailersolutions.dagger2injectiondemo.Car;

import dagger.Component;

@Component
public interface ApplicationComponent {

     Car getCar();


}
