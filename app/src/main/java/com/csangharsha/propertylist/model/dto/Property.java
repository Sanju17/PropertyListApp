
package com.csangharsha.propertylist.model.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Property {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_gmt")
    @Expose
    private String dateGmt;
    @SerializedName("guid")
    @Expose
    private Guid guid;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("modified_gmt")
    @Expose
    private String modifiedGmt;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("content")
    @Expose
    private Content content;
    @SerializedName("excerpt")
    @Expose
    private Excerpt excerpt;
    @SerializedName("author")
    @Expose
    private int author;
    @SerializedName("featured_media")
    @Expose
    private int featuredMedia;
    @SerializedName("parent")
    @Expose
    private int parent;
    @SerializedName("menu_order")
    @Expose
    private int menuOrder;
    @SerializedName("comment_status")
    @Expose
    private String commentStatus;
    @SerializedName("ping_status")
    @Expose
    private String pingStatus;
    @SerializedName("template")
    @Expose
    private String template;
    @SerializedName("real_homes_property_price")
    @Expose
    private Object realHomesPropertyPrice;
    @SerializedName("real_homes_property_price_postfix")
    @Expose
    private Object realHomesPropertyPricePostfix;
    @SerializedName("real_homes_property_size")
    @Expose
    private Object realHomesPropertySize;
    @SerializedName("real_homes_property_size_postfix")
    @Expose
    private Object realHomesPropertySizePostfix;
    @SerializedName("real_homes_property_address")
    @Expose
    private Object realHomesPropertyAddress;
    @SerializedName("real_homes_property_location")
    @Expose
    private Object realHomesPropertyLocation;
    @SerializedName("real_homes_agent_display_option")
    @Expose
    private Object realHomesAgentDisplayOption;
    @SerializedName("real_homes_agents")
    @Expose
    private Object realHomesAgents;
    @SerializedName("real_homes_featured")
    @Expose
    private Object realHomesFeatured;
    @SerializedName("real_homes_add_in_slider")
    @Expose
    private Object realHomesAddInSlider;
    @SerializedName("real_homes_additional_details")
    @Expose
    private Object realHomesAdditionalDetails;
    @SerializedName("real_homes_property_id")
    @Expose
    private Object realHomesPropertyId;
    @SerializedName("real_homes_tour_video_url")
    @Expose
    private Object realHomesTourVideoUrl;
    @SerializedName("real_homes_property_map")
    @Expose
    private Object realHomesPropertyMap;
    @SerializedName("inspiry_floor_plans")
    @Expose
    private List<Object> inspiryFloorPlans = null;
    @SerializedName("real_homes_property_bedrooms")
    @Expose
    private Object realHomesPropertyBedrooms;
    @SerializedName("real_homes_property_bathrooms")
    @Expose
    private Object realHomesPropertyBathrooms;
    @SerializedName("real_homes_property_garage")
    @Expose
    private Object realHomesPropertyGarage;
    @SerializedName("real_homes_property_images")
    @Expose
    private Object realHomesPropertyImages;
    @SerializedName("slide_template")
    @Expose
    private String slideTemplate;
    @SerializedName("real_homes_slider_image")
    @Expose
    private Object realHomesSliderImage;
    @SerializedName("_links")
    @Expose
    private Links links;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateGmt() {
        return dateGmt;
    }

    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModifiedGmt() {
        return modifiedGmt;
    }

    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getFeaturedMedia() {
        return featuredMedia;
    }

    public void setFeaturedMedia(int featuredMedia) {
        this.featuredMedia = featuredMedia;
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(int menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Object getRealHomesPropertyPrice() {
        return realHomesPropertyPrice;
    }

    public void setRealHomesPropertyPrice(Object realHomesPropertyPrice) {
        this.realHomesPropertyPrice = realHomesPropertyPrice;
    }

    public Object getRealHomesPropertyPricePostfix() {
        return realHomesPropertyPricePostfix;
    }

    public void setRealHomesPropertyPricePostfix(Object realHomesPropertyPricePostfix) {
        this.realHomesPropertyPricePostfix = realHomesPropertyPricePostfix;
    }

    public Object getRealHomesPropertySize() {
        return realHomesPropertySize;
    }

    public void setRealHomesPropertySize(Object realHomesPropertySize) {
        this.realHomesPropertySize = realHomesPropertySize;
    }

    public Object getRealHomesPropertySizePostfix() {
        return realHomesPropertySizePostfix;
    }

    public void setRealHomesPropertySizePostfix(Object realHomesPropertySizePostfix) {
        this.realHomesPropertySizePostfix = realHomesPropertySizePostfix;
    }

    public Object getRealHomesPropertyAddress() {
        return realHomesPropertyAddress;
    }

    public void setRealHomesPropertyAddress(Object realHomesPropertyAddress) {
        this.realHomesPropertyAddress = realHomesPropertyAddress;
    }

    public Object getRealHomesPropertyLocation() {
        return realHomesPropertyLocation;
    }

    public void setRealHomesPropertyLocation(Object realHomesPropertyLocation) {
        this.realHomesPropertyLocation = realHomesPropertyLocation;
    }

    public Object getRealHomesAgentDisplayOption() {
        return realHomesAgentDisplayOption;
    }

    public void setRealHomesAgentDisplayOption(Object realHomesAgentDisplayOption) {
        this.realHomesAgentDisplayOption = realHomesAgentDisplayOption;
    }

    public Object getRealHomesAgents() {
        return realHomesAgents;
    }

    public void setRealHomesAgents(Object realHomesAgents) {
        this.realHomesAgents = realHomesAgents;
    }

    public Object getRealHomesFeatured() {
        return realHomesFeatured;
    }

    public void setRealHomesFeatured(Object realHomesFeatured) {
        this.realHomesFeatured = realHomesFeatured;
    }

    public Object getRealHomesAddInSlider() {
        return realHomesAddInSlider;
    }

    public void setRealHomesAddInSlider(Object realHomesAddInSlider) {
        this.realHomesAddInSlider = realHomesAddInSlider;
    }

    public Object getRealHomesAdditionalDetails() {
        return realHomesAdditionalDetails;
    }

    public void setRealHomesAdditionalDetails(Object realHomesAdditionalDetails) {
        this.realHomesAdditionalDetails = realHomesAdditionalDetails;
    }

    public Object getRealHomesPropertyId() {
        return realHomesPropertyId;
    }

    public void setRealHomesPropertyId(Object realHomesPropertyId) {
        this.realHomesPropertyId = realHomesPropertyId;
    }

    public Object getRealHomesTourVideoUrl() {
        return realHomesTourVideoUrl;
    }

    public void setRealHomesTourVideoUrl(Object realHomesTourVideoUrl) {
        this.realHomesTourVideoUrl = realHomesTourVideoUrl;
    }

    public Object getRealHomesPropertyMap() {
        return realHomesPropertyMap;
    }

    public void setRealHomesPropertyMap(Object realHomesPropertyMap) {
        this.realHomesPropertyMap = realHomesPropertyMap;
    }

    public List<Object> getInspiryFloorPlans() {
        return inspiryFloorPlans;
    }

    public void setInspiryFloorPlans(List<Object> inspiryFloorPlans) {
        this.inspiryFloorPlans = inspiryFloorPlans;
    }

    public Object getRealHomesPropertyBedrooms() {
        return realHomesPropertyBedrooms;
    }

    public void setRealHomesPropertyBedrooms(Object realHomesPropertyBedrooms) {
        this.realHomesPropertyBedrooms = realHomesPropertyBedrooms;
    }

    public Object getRealHomesPropertyBathrooms() {
        return realHomesPropertyBathrooms;
    }

    public void setRealHomesPropertyBathrooms(Object realHomesPropertyBathrooms) {
        this.realHomesPropertyBathrooms = realHomesPropertyBathrooms;
    }

    public Object getRealHomesPropertyGarage() {
        return realHomesPropertyGarage;
    }

    public void setRealHomesPropertyGarage(Object realHomesPropertyGarage) {
        this.realHomesPropertyGarage = realHomesPropertyGarage;
    }

    public Object getRealHomesPropertyImages() {
        return realHomesPropertyImages;
    }

    public void setRealHomesPropertyImages(Object realHomesPropertyImages) {
        this.realHomesPropertyImages = realHomesPropertyImages;
    }

    public String getSlideTemplate() {
        return slideTemplate;
    }

    public void setSlideTemplate(String slideTemplate) {
        this.slideTemplate = slideTemplate;
    }

    public Object getRealHomesSliderImage() {
        return realHomesSliderImage;
    }

    public void setRealHomesSliderImage(Object realHomesSliderImage) {
        this.realHomesSliderImage = realHomesSliderImage;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("date", date).append("dateGmt", dateGmt).append("guid", guid).append("modified", modified).append("modifiedGmt", modifiedGmt).append("slug", slug).append("status", status).append("type", type).append("link", link).append("title", title).append("content", content).append("excerpt", excerpt).append("author", author).append("featuredMedia", featuredMedia).append("parent", parent).append("menuOrder", menuOrder).append("commentStatus", commentStatus).append("pingStatus", pingStatus).append("template", template).append("realHomesPropertyPrice", realHomesPropertyPrice).append("realHomesPropertyPricePostfix", realHomesPropertyPricePostfix).append("realHomesPropertySize", realHomesPropertySize).append("realHomesPropertySizePostfix", realHomesPropertySizePostfix).append("realHomesPropertyAddress", realHomesPropertyAddress).append("realHomesPropertyLocation", realHomesPropertyLocation).append("realHomesAgentDisplayOption", realHomesAgentDisplayOption).append("realHomesAgents", realHomesAgents).append("realHomesFeatured", realHomesFeatured).append("realHomesAddInSlider", realHomesAddInSlider).append("realHomesAdditionalDetails", realHomesAdditionalDetails).append("realHomesPropertyId", realHomesPropertyId).append("realHomesTourVideoUrl", realHomesTourVideoUrl).append("realHomesPropertyMap", realHomesPropertyMap).append("inspiryFloorPlans", inspiryFloorPlans).append("realHomesPropertyBedrooms", realHomesPropertyBedrooms).append("realHomesPropertyBathrooms", realHomesPropertyBathrooms).append("realHomesPropertyGarage", realHomesPropertyGarage).append("realHomesPropertyImages", realHomesPropertyImages).append("slideTemplate", slideTemplate).append("realHomesSliderImage", realHomesSliderImage).append("links", links).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(realHomesPropertyPricePostfix).append(link).append(realHomesPropertyBathrooms).append(menuOrder).append(dateGmt).append(realHomesAgents).append(type).append(date).append(realHomesAgentDisplayOption).append(realHomesPropertySizePostfix).append(realHomesPropertyLocation).append(id).append(realHomesFeatured).append(author).append(title).append(realHomesPropertyId).append(slideTemplate).append(realHomesPropertyMap).append(inspiryFloorPlans).append(template).append(realHomesSliderImage).append(status).append(realHomesTourVideoUrl).append(commentStatus).append(excerpt).append(parent).append(links).append(realHomesPropertyAddress).append(realHomesPropertyBedrooms).append(pingStatus).append(realHomesPropertyPrice).append(realHomesPropertySize).append(modified).append(content).append(modifiedGmt).append(guid).append(realHomesAdditionalDetails).append(realHomesPropertyImages).append(realHomesPropertyGarage).append(realHomesAddInSlider).append(featuredMedia).append(slug).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Property) == false) {
            return false;
        }
        Property rhs = ((Property) other);
        return new EqualsBuilder().append(realHomesPropertyPricePostfix, rhs.realHomesPropertyPricePostfix).append(link, rhs.link).append(realHomesPropertyBathrooms, rhs.realHomesPropertyBathrooms).append(menuOrder, rhs.menuOrder).append(dateGmt, rhs.dateGmt).append(realHomesAgents, rhs.realHomesAgents).append(type, rhs.type).append(date, rhs.date).append(realHomesAgentDisplayOption, rhs.realHomesAgentDisplayOption).append(realHomesPropertySizePostfix, rhs.realHomesPropertySizePostfix).append(realHomesPropertyLocation, rhs.realHomesPropertyLocation).append(id, rhs.id).append(realHomesFeatured, rhs.realHomesFeatured).append(author, rhs.author).append(title, rhs.title).append(realHomesPropertyId, rhs.realHomesPropertyId).append(slideTemplate, rhs.slideTemplate).append(realHomesPropertyMap, rhs.realHomesPropertyMap).append(inspiryFloorPlans, rhs.inspiryFloorPlans).append(template, rhs.template).append(realHomesSliderImage, rhs.realHomesSliderImage).append(status, rhs.status).append(realHomesTourVideoUrl, rhs.realHomesTourVideoUrl).append(commentStatus, rhs.commentStatus).append(excerpt, rhs.excerpt).append(parent, rhs.parent).append(links, rhs.links).append(realHomesPropertyAddress, rhs.realHomesPropertyAddress).append(realHomesPropertyBedrooms, rhs.realHomesPropertyBedrooms).append(pingStatus, rhs.pingStatus).append(realHomesPropertyPrice, rhs.realHomesPropertyPrice).append(realHomesPropertySize, rhs.realHomesPropertySize).append(modified, rhs.modified).append(content, rhs.content).append(modifiedGmt, rhs.modifiedGmt).append(guid, rhs.guid).append(realHomesAdditionalDetails, rhs.realHomesAdditionalDetails).append(realHomesPropertyImages, rhs.realHomesPropertyImages).append(realHomesPropertyGarage, rhs.realHomesPropertyGarage).append(realHomesAddInSlider, rhs.realHomesAddInSlider).append(featuredMedia, rhs.featuredMedia).append(slug, rhs.slug).isEquals();
    }

}
