package com.example.boundservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.util.Random;

public class SampleService extends Service {

    private IBinder binder = new LocalBinder();
    private Random random = new Random();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    public int getRandom(){
        return random.nextInt();
    }

    public class LocalBinder extends Binder{
        SampleService getService(){
            return SampleService.this;
        }
    }
}
