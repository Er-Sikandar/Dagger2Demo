package com.shailersolutions.dagger2injectiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.RemoteInput;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.shailersolutions.dagger2injectiondemo.interfaces.ApplicationComponent;
import com.shailersolutions.dagger2injectiondemo.interfaces.DaggerApplicationComponent;

public class MainActivity extends AppCompatActivity {
  private Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApplicationComponent component= DaggerApplicationComponent.create();
       car=component.getCar();

        
     car.drive();


    }
}