package com.example.mrpotatohead;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // check if something was saved in the bundle for landscape version
        if (savedInstanceState != null){
            if (savedInstanceState.getInt("arms") == View.VISIBLE){
                findViewById(R.id.arms).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("mustache") == View.VISIBLE){
                findViewById(R.id.mustache).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("ears") == View.VISIBLE){
                findViewById(R.id.ears).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("eyebrows") == View.VISIBLE){
                findViewById(R.id.eyebrows).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("hat") == View.VISIBLE){
                findViewById(R.id.hat).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("mouth") == View.VISIBLE){
                findViewById(R.id.mouth).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("nose") == View.VISIBLE){
                findViewById(R.id.nose).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("eyes") == View.VISIBLE){
                findViewById(R.id.eyes).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("glasses") == View.VISIBLE){
                findViewById(R.id.glasses).setVisibility(View.VISIBLE);
            }
            if (savedInstanceState.getInt("shoes") == View.VISIBLE){
                findViewById(R.id.shoes).setVisibility(View.VISIBLE);
            }
        }


    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;

        ImageView image;
        int Id = checkbox.getId();
        switch (Id) {
            case R.id.checkBox_arms:
                image = (ImageView) findViewById(R.id.arms);
                break;
            case R.id.checkBox_mustache:
                image = (ImageView) findViewById(R.id.mustache);
                break;
            case R.id.checkBox_ears:
                image = (ImageView) findViewById(R.id.ears);
                break;
            case R.id.checkBox_eyebrows:
                image = (ImageView) findViewById(R.id.eyebrows);
                break;
            case R.id.checkBox_hat:
                image = (ImageView) findViewById(R.id.hat);
                break;
            case R.id.checkBox_mouth:
                image = (ImageView) findViewById(R.id.mouth);
                break;
            case R.id.checkBox_nose:
                image = (ImageView) findViewById(R.id.nose);
                break;
            case R.id.checkBox_eyes:
                image = (ImageView) findViewById(R.id.eyes);
                break;
            case R.id.checkBox_glasses:
                image = (ImageView) findViewById(R.id.glasses);
                break;
            case R.id.checkBox_shoes:
                image = (ImageView) findViewById(R.id.shoes);
                break;
            default:
                image = (ImageView) findViewById(R.id.arms);
        }

        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        outState.putInt("arms", findViewById(R.id.arms).getVisibility());
        outState.putInt("mustache", findViewById(R.id.mustache).getVisibility());
        outState.putInt("ears", findViewById(R.id.ears).getVisibility());
        outState.putInt("eyebrows", findViewById(R.id.eyebrows).getVisibility());
        outState.putInt("hat", findViewById(R.id.hat).getVisibility());
        outState.putInt("mouth", findViewById(R.id.mouth).getVisibility());
        outState.putInt("nose", findViewById(R.id.nose).getVisibility());
        outState.putInt("eyes", findViewById(R.id.eyes).getVisibility());
        outState.putInt("glasses", findViewById(R.id.glasses).getVisibility());
        outState.putInt("shoes", findViewById(R.id.shoes).getVisibility());
    }
}


