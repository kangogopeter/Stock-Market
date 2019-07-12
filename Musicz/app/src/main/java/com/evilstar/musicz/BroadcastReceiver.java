package com.evilstar.musicz;

import android.content.Context;
import android.content.Intent;

public class BroadcastReceiver becomingNoisyReceiver = new BroadcastReceiver(){
    @Override
    public void onReceive(Context context, Intent intent) {
        //pause audio on ACTION_AUDIO_BECOMING_NOISY
        pauseMedia();
        buildNotification(PlaybackStatus.PAUSED);
    }
};

private void registerBecomingNoisyReceiver() {
        //register after getting audio focus
        IntentFilter intentFilter = new IntentFilter(AudioManager.ACTION_AUDIO_BECOMING_NOISY);
        registerReceiver(becomingNoisyReceiver, intentFilter);
}
