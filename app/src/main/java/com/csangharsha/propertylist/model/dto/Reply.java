
package com.csangharsha.propertylist.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Reply {

    @SerializedName("embeddable")
    @Expose
    private boolean embeddable;
    @SerializedName("href")
    @Expose
    private String href;

    public boolean isEmbeddable() {
        return embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("embeddable", embeddable).append("href", href).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(embeddable).append(href).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reply) == false) {
            return false;
        }
        Reply rhs = ((Reply) other);
        return new EqualsBuilder().append(embeddable, rhs.embeddable).append(href, rhs.href).isEquals();
    }

}
