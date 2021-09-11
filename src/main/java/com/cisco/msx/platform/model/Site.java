/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.DeviceSummary;
import com.cisco.msx.platform.model.SiteAddress;
import com.cisco.msx.platform.model.SiteContact;
import com.cisco.msx.platform.model.SiteLocation;
import com.cisco.msx.platform.model.SiteStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Site
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-10T10:48:16.525056800-04:00[America/Toronto]")
public class Site {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private SiteAddress address;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private SiteContact contact;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<DeviceSummary> devices = null;

  public static final String SERIALIZED_NAME_SERVICE_IDS = "serviceIds";
  @SerializedName(SERIALIZED_NAME_SERVICE_IDS)
  private List<String> serviceIds = null;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private SiteLocation location;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SiteStatus status;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }




  public Site tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTenantId() {
    return tenantId;
  }


  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public Site parentId(UUID parentId) {
    
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


  public Site name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Site type(String type) {
    
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


  public Site description(String description) {
    
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


  public Site address(SiteAddress address) {
    
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


  public Site contact(SiteContact contact) {
    
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


  public Site image(String image) {
    
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


  public Site attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Site putAttributesItem(String key, String attributesItem) {
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


  public Site devices(List<DeviceSummary> devices) {
    
    this.devices = devices;
    return this;
  }

  public Site addDevicesItem(DeviceSummary devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeviceSummary> getDevices() {
    return devices;
  }


  public void setDevices(List<DeviceSummary> devices) {
    this.devices = devices;
  }


  public Site serviceIds(List<String> serviceIds) {
    
    this.serviceIds = serviceIds;
    return this;
  }

  public Site addServiceIdsItem(String serviceIdsItem) {
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


  public Site location(SiteLocation location) {
    
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


  public Site status(SiteStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SiteStatus getStatus() {
    return status;
  }


  public void setStatus(SiteStatus status) {
    this.status = status;
  }


   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }




   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }




   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }




   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedBy() {
    return modifiedBy;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site site = (Site) o;
    return Objects.equals(this.id, site.id) &&
        Objects.equals(this.tenantId, site.tenantId) &&
        Objects.equals(this.parentId, site.parentId) &&
        Objects.equals(this.name, site.name) &&
        Objects.equals(this.type, site.type) &&
        Objects.equals(this.description, site.description) &&
        Objects.equals(this.address, site.address) &&
        Objects.equals(this.contact, site.contact) &&
        Objects.equals(this.image, site.image) &&
        Objects.equals(this.attributes, site.attributes) &&
        Objects.equals(this.devices, site.devices) &&
        Objects.equals(this.serviceIds, site.serviceIds) &&
        Objects.equals(this.location, site.location) &&
        Objects.equals(this.status, site.status) &&
        Objects.equals(this.createdOn, site.createdOn) &&
        Objects.equals(this.createdBy, site.createdBy) &&
        Objects.equals(this.modifiedOn, site.modifiedOn) &&
        Objects.equals(this.modifiedBy, site.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, parentId, name, type, description, address, contact, image, attributes, devices, serviceIds, location, status, createdOn, createdBy, modifiedOn, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

