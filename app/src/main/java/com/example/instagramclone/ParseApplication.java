package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("LT9qOgQALwtI6ilhueLKnbnci29g2iLdk1t9jfv4")
            .clientKey("VuFi1VJr8q5pkpN3NVf7vwzW4fMckWwW4W9DJTkU")
            .server("https://parseapi.back4app.com").build()
        );
    }
}
