package dev.ballbot.aptnamer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");
        Log.d("APTNamer", command + " is exec by " + name);
        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {}
            Log.d("APTNamer", i + " seconds");
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}