package com.kidsapp.childplay.customclasses;

import static com.google.firebase.FirebaseApp.getInstance;

import android.app.Application;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.kidsapp.childplay.R;
import com.kidsapp.childplay.utils.Utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Naynesh Patel on 06-Mar-19.
 */
public class AppControl extends Application implements TextToSpeech.OnInitListener{
    Context context;
    public static TextToSpeech textToSpeech;
    @Override
    public void onCreate() {
        super.onCreate();


        context=this;
        new Utils(context);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("Fon/OhWhale.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        textToSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                   // textToSpeech = new TextToSpeech(context, this, "com.google.android.tts");
                    Set<String> a=new HashSet<>();
                    a.add("male");//here you can give male if you want to select male voice.
                    Voice v=new Voice("tr-tr-x-sfg#male_2-local",new Locale("tr","TR"),800,200,true,a);
                    textToSpeech.setLanguage(new Locale("tr-TR"));
                    textToSpeech.setVoice(v);
                    textToSpeech.setEngineByPackageName("com.google.android.tts");
                    textToSpeech.setPitch(0.8F);



//                    HashMap<String, String> onlineSpeech = new HashMap<>();
//                    onlineSpeech.put(TextToSpeech.Engine.KEY_FEATURE_NETWORK_SYNTHESIS, "true");

//                    Set<String> a=new HashSet<>();
//                    a.add("male");//here you can give male if you want to select male voice.
//                    //Voice v=new Voice("en-us-x-sfg#female_2-local",new Locale("en","US"),400,200,true,a);
//                    Voice v=new Voice("tr-tr-x-sfg#male_2-local",new Locale("tr","TR"),400,200,true,a);
//                    textToSpeech.setVoice(v);
//                    textToSpeech.setSpeechRate(0.8f);
//
                    // int result = textToSpeech.setLanguage(Locale.US);
//                    int result = textToSpeech.setVoice(v);
//
//                    if (result == TextToSpeech.LANG_MISSING_DATA
//                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                        Log.e("TTS", "This Language is not supported");
//                    }
//                    textToSpeech.setLanguage(new Locale("tr-TR"));
//                    textToSpeech.setLanguage(Locale.forLanguageTag(""));
                }
            }

        });
    }

    @Override
    public void onInit(int status) {
        if (status != TextToSpeech.ERROR) {

//            Set<String> a = new HashSet<>();
//            a.add("male");//here you can give male if you want to select male voice.
//            //Voice v=new Voice("en-us-x-sfg#female_2-local",new Locale("en","US"),400,200,true,a);
//            Voice v = new Voice("tr-tr-x-sfg#male_2-local", new Locale("tr", "TR"), 400, 200, true, a);
//            textToSpeech.setVoice(v);
//            textToSpeech.setSpeechRate(0.8f);
//            FirebaseApp.initializeApp(context);
//            // int result = T2S.setLanguage(Locale.US);
//            int result = textToSpeech.setVoice(v);
//
//            if (result == TextToSpeech.LANG_MISSING_DATA
//                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
//                Log.e("TTS", "This Language is not supported");
//            }

        }
    }
}
