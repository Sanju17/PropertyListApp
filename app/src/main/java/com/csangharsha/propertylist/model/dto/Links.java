
package com.csangharsha.propertylist.model.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Links {

    @SerializedName("self")
    @Expose
    private List<Self> self = null;
    @SerializedName("collection")
    @Expose
    private List<Collection> collection = null;
    @SerializedName("about")
    @Expose
    private List<About> about = null;
    @SerializedName("author")
    @Expose
    private List<Author> author = null;
    @SerializedName("replies")
    @Expose
    private List<Reply> replies = null;
    @SerializedName("version-history")
    @Expose
    private List<VersionHistory> versionHistory = null;
    @SerializedName("wp:featuredmedia")
    @Expose
    private List<WpFeaturedmedium> wpFeaturedmedia = null;
    @SerializedName("wp:attachment")
    @Expose
    private List<WpAttachment> wpAttachment = null;
    @SerializedName("curies")
    @Expose
    private List<Cury> curies = null;
    @SerializedName("up")
    @Expose
    private List<Up> up = null;

    public List<Self> getSelf() {
        return self;
    }

    public void setSelf(List<Self> self) {
        this.self = self;
    }

    public List<Collection> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    public List<About> getAbout() {
        return about;
    }

    public void setAbout(List<About> about) {
        this.about = about;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public List<VersionHistory> getVersionHistory() {
        return versionHistory;
    }

    public void setVersionHistory(List<VersionHistory> versionHistory) {
        this.versionHistory = versionHistory;
    }

    public List<WpFeaturedmedium> getWpFeaturedmedia() {
        return wpFeaturedmedia;
    }

    public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
    }

    public List<WpAttachment> getWpAttachment() {
        return wpAttachment;
    }

    public void setWpAttachment(List<WpAttachment> wpAttachment) {
        this.wpAttachment = wpAttachment;
    }

    public List<Cury> getCuries() {
        return curies;
    }

    public void setCuries(List<Cury> curies) {
        this.curies = curies;
    }

    public List<Up> getUp() {
        return up;
    }

    public void setUp(List<Up> up) {
        this.up = up;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("self", self).append("collection", collection).append("about", about).append("author", author).append("replies", replies).append("versionHistory", versionHistory).append("wpFeaturedmedia", wpFeaturedmedia).append("wpAttachment", wpAttachment).append("curies", curies).append("up", up).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(author).append(versionHistory).append(replies).append(about).append(wpAttachment).append(self).append(wpFeaturedmedia).append(collection).append(curies).append(up).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return new EqualsBuilder().append(author, rhs.author).append(versionHistory, rhs.versionHistory).append(replies, rhs.replies).append(about, rhs.about).append(wpAttachment, rhs.wpAttachment).append(self, rhs.self).append(wpFeaturedmedia, rhs.wpFeaturedmedia).append(collection, rhs.collection).append(curies, rhs.curies).append(up, rhs.up).isEquals();
    }

}
