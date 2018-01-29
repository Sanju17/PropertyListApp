
package com.csangharsha.propertylist.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Guid {

    @SerializedName("rendered")
    @Expose
    private String rendered;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rendered", rendered).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rendered).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Guid) == false) {
            return false;
        }
        Guid rhs = ((Guid) other);
        return new EqualsBuilder().append(rendered, rhs.rendered).isEquals();
    }

}
