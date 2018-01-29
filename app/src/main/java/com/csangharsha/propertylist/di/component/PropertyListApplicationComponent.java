package com.csangharsha.propertylist.di.component;

import com.csangharsha.propertylist.di.ActivityScope;
import com.csangharsha.propertylist.di.module.PicassoModule;
import com.csangharsha.propertylist.di.module.PropertyListModule;
import com.csangharsha.propertylist.model.PropertyListService;
import com.squareup.picasso.Picasso;

import dagger.Component;

/**
 * Created by csangharsha on 1/26/18.
 */

@ActivityScope
@Component(modules = {
        PropertyListModule.class,
        PicassoModule.class
})
public interface PropertyListApplicationComponent {
    Picasso getPicasso();
    PropertyListService getPropertyListService();
}
