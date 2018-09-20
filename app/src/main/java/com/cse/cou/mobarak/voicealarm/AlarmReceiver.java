package com.cse.cou.mobarak.voicealarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
public class AlarmReceiver extends BroadcastReceiver {



    TextToSpeech textToSpeech;
    @Override
    public void onReceive(Context context, Intent intent) {

        String s=intent.getStringExtra("message");
        Intent intent1=new Intent(context,SpeakMessage.class);
        intent1.putExtra("message",s);
        context.startActivity(intent1);



    }
}
