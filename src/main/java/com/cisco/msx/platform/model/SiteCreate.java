/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.SiteAddress;
import com.cisco.msx.platform.model.SiteContact;
import com.cisco.msx.platform.model.SiteCreateAllOf;
import com.cisco.msx.platform.model.SiteLocation;
import com.cisco.msx.platform.model.SiteUpdate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * SiteCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T14:27:03.027365-04:00[America/New_York]")
public class SiteCreate {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_DEVICE_IDS = "deviceIds";
  @SerializedName(SERIALIZED_NAME_DEVICE_IDS)
  private List<String> deviceIds = null;

  public static final String SERIALIZED_NAME_SERVICE_IDS = "serviceIds";
  @SerializedName(SERIALIZED_NAME_SERVICE_IDS)
  private List<String> serviceIds = null;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private SiteAddress address;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private SiteContact contact;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SiteLocation location;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;


  public SiteCreate tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getTenantId() {
    return tenantId;
  }


  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public SiteCreate deviceIds(List<String> deviceIds) {
    
    this.deviceIds = deviceIds;
    return this;
  }

  public SiteCreate addDeviceIdsItem(String deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

   /**
   * Get deviceIds
   * @return deviceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeviceIds() {
    return deviceIds;
  }


  public void setDeviceIds(List<String> deviceIds) {
    this.deviceIds = deviceIds;
  }


  public SiteCreate serviceIds(List<String> serviceIds) {
    
    this.serviceIds = serviceIds;
    return this;
  }

  public SiteCreate addServiceIdsItem(String serviceIdsItem) {
    if (this.serviceIds == null) {
      this.serviceIds = new ArrayList<>();
    }
    this.serviceIds.add(serviceIdsItem);
    return this;
  }

   /**
   * Get serviceIds
   * @return serviceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getServiceIds() {
    return serviceIds;
  }


  public void setServiceIds(List<String> serviceIds) {
    this.serviceIds = serviceIds;
  }


  public SiteCreate parentId(UUID parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getParentId() {
    return parentId;
  }


  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public SiteCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SiteCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public SiteCreate type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public SiteCreate address(SiteAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SiteAddress getAddress() {
    return address;
  }


  public void setAddress(SiteAddress address) {
    this.address = address;
  }


  public SiteCreate contact(SiteContact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SiteContact getContact() {
    return contact;
  }


  public void setContact(SiteContact contact) {
    this.contact = contact;
  }


  public SiteCreate location(SiteLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SiteLocation getLocation() {
    return location;
  }


  public void setLocation(SiteLocation location) {
    this.location = location;
  }


  public SiteCreate image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public SiteCreate attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public SiteCreate putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteCreate siteCreate = (SiteCreate) o;
    return Objects.equals(this.tenantId, siteCreate.tenantId) &&
        Objects.equals(this.deviceIds, siteCreate.deviceIds) &&
        Objects.equals(this.serviceIds, siteCreate.serviceIds) &&
        Objects.equals(this.parentId, siteCreate.parentId) &&
        Objects.equals(this.name, siteCreate.name) &&
        Objects.equals(this.description, siteCreate.description) &&
        Objects.equals(this.type, siteCreate.type) &&
        Objects.equals(this.address, siteCreate.address) &&
        Objects.equals(this.contact, siteCreate.contact) &&
        Objects.equals(this.location, siteCreate.location) &&
        Objects.equals(this.image, siteCreate.image) &&
        Objects.equals(this.attributes, siteCreate.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, deviceIds, serviceIds, parentId, name, description, type, address, contact, location, image, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteCreate {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

