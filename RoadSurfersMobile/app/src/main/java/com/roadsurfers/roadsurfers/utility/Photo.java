package com.roadsurfers.roadsurfers.utility;

/**
 * Created by raula on 1/21/2017.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Photo {

    @JsonProperty("height")
    private Integer height;
    @JsonIgnore
    private List<String> htmlAttributions = null;
    @JsonProperty("photo_reference")
    private String photoReference;
    @JsonProperty("width")
    private Integer width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("photo_reference")
    public String getPhotoReference() {
        return photoReference;
    }

    @JsonProperty("photo_reference")
    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}