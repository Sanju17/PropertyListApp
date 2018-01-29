
package com.csangharsha.propertylist.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Cury {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("templated")
    @Expose
    private boolean templated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public boolean isTemplated() {
        return templated;
    }

    public void setTemplated(boolean templated) {
        this.templated = templated;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("href", href).append("templated", templated).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(templated).append(name).append(href).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cury) == false) {
            return false;
        }
        Cury rhs = ((Cury) other);
        return new EqualsBuilder().append(templated, rhs.templated).append(name, rhs.name).append(href, rhs.href).isEquals();
    }

}
