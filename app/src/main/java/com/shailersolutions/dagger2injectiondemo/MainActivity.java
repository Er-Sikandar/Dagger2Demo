package com.shailersolutions.dagger2injectiondemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.shailersolutions.dagger2injectiondemo.classes.Car;
import com.shailersolutions.dagger2injectiondemo.databinding.ActivityMainBinding;


 import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
  @Inject Car car;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        ((MyApplication) getApplicationContext()).appComponent.inject(MainActivity.this);





        
     car.drive();


    }
}