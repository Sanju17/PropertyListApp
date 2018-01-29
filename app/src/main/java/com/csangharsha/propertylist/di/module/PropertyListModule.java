package com.csangharsha.propertylist.di.module;

import com.csangharsha.propertylist.di.ActivityScope;
import com.csangharsha.propertylist.di.qualifier.PropertyListRetrofit;
import com.csangharsha.propertylist.model.PropertyListService;
import com.fatboyindustrial.gsonjodatime.DateTimeConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.joda.time.DateTime;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by csangharsha on 1/26/18.
 */

@Module(includes = {NetworkModule.class})
public class PropertyListModule {

    @Provides
    @ActivityScope
    public PropertyListService providesPropertyListService(@PropertyListRetrofit Retrofit propertyListRetrofit) {
        return propertyListRetrofit.create(PropertyListService.class);
    }

    @Provides
    @ActivityScope
    public Gson providesGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeConverter());
        return gsonBuilder.create();
    }

    @Provides
    @ActivityScope
    @PropertyListRetrofit
    public Retrofit providesRetrofit(OkHttpClient okHttpClient, Gson gson) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .baseUrl("http://suvaproperties.com/")
                .build();
    }

}
