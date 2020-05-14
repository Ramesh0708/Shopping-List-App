package com.example.grocery_listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splashscreen extends AppCompatActivity {

    ImageView imageView;


    private  static int    Splash_Time_out = 3000;
    Animation fromBottom,fromTop,fromright,fromleft,rotate,scale;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        imageView = (ImageView) findViewById(R.id.list);
        Handler handler;



        fromBottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);
        fromTop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        fromleft= AnimationUtils.loadAnimation(this,R.anim.fromleft);
        fromright = AnimationUtils.loadAnimation(this,R.anim.fromright);
        rotate = AnimationUtils.loadAnimation(this,R.anim.rotate);
        scale = AnimationUtils.loadAnimation(this,R.anim.scale);



        imageView.setAnimation(fromBottom);



        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },Splash_Time_out);

    }
}
