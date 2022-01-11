/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.ServiceUILink;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ServiceUIConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T20:44:53.751167200-05:00[America/Toronto]")
public class ServiceUIConfig {
  public static final String SERIALIZED_NAME_BANNER_IMAGE = "bannerImage";
  @SerializedName(SERIALIZED_NAME_BANNER_IMAGE)
  private String bannerImage;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ServiceUILink> links = null;


  public ServiceUIConfig bannerImage(String bannerImage) {
    
    this.bannerImage = bannerImage;
    return this;
  }

   /**
   * Get bannerImage
   * @return bannerImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBannerImage() {
    return bannerImage;
  }


  public void setBannerImage(String bannerImage) {
    this.bannerImage = bannerImage;
  }


  public ServiceUIConfig links(List<ServiceUILink> links) {
    
    this.links = links;
    return this;
  }

  public ServiceUIConfig addLinksItem(ServiceUILink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServiceUILink> getLinks() {
    return links;
  }


  public void setLinks(List<ServiceUILink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceUIConfig serviceUIConfig = (ServiceUIConfig) o;
    return Objects.equals(this.bannerImage, serviceUIConfig.bannerImage) &&
        Objects.equals(this.links, serviceUIConfig.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bannerImage, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceUIConfig {\n");
    sb.append("    bannerImage: ").append(toIndentedString(bannerImage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

