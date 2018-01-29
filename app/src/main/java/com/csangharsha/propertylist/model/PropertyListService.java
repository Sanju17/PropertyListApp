package com.csangharsha.propertylist.model;

import com.csangharsha.propertylist.model.dto.Property;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by csangharsha on 1/29/18.
 */

public interface PropertyListService {
    @GET("wp-json/wp/v2/property")
    Call<List<Property>> getProperties();
}
