package com.csangharsha.propertylist.application;

import android.app.Activity;
import android.app.Application;

import com.csangharsha.propertylist.di.component.DaggerPropertyListApplicationComponent;
import com.csangharsha.propertylist.di.component.PropertyListApplicationComponent;
import com.csangharsha.propertylist.di.module.ContextModule;
import com.csangharsha.propertylist.model.PropertyListService;
import com.squareup.picasso.Picasso;

import timber.log.Timber;

/**
 * Created by csangharsha on 1/26/18.
 */

public class PropertyListApplication extends Application {

    private Picasso picasso;
    private PropertyListService propertyListService;

    public static PropertyListApplication get(Activity activity) {
        return (PropertyListApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        PropertyListApplicationComponent component = DaggerPropertyListApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();

        picasso = component.getPicasso();
        propertyListService = component.getPropertyListService();

    }

    public Picasso getPicasso() {
        return picasso;
    }

    public PropertyListService getPropertyListService() {
        return propertyListService;
    }
}
