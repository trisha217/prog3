package com.example.texttosppech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextToSpeech t1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.edit1);
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i!= TextToSpeech.ERROR){
                    t1.setLanguage(Locale.UK);
                }
            }
        });
    }

    public void textToSpeech(View view) {
        String str = e1.getText().toString();
        t1.speak(str,TextToSpeech.QUEUE_FLUSH, null,null);
    }
}