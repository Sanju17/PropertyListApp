
package com.csangharsha.propertylist.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Excerpt {

    @SerializedName("rendered")
    @Expose
    private String rendered;
    @SerializedName("protected")
    @Expose
    private boolean _protected;

    public String getRendered() {
        return rendered;
    }

    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    public boolean isProtected() {
        return _protected;
    }

    public void setProtected(boolean _protected) {
        this._protected = _protected;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rendered", rendered).append("_protected", _protected).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rendered).append(_protected).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Excerpt) == false) {
            return false;
        }
        Excerpt rhs = ((Excerpt) other);
        return new EqualsBuilder().append(rendered, rhs.rendered).append(_protected, rhs._protected).isEquals();
    }

}
