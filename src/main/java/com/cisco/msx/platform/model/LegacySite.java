/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.LegacyAddress;
import com.cisco.msx.platform.model.LegacySiteDevice;
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
 * LegacySite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T15:11:34.208390-04:00[America/New_York]")
public class LegacySite {
  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private UUID siteId;

  public static final String SERIALIZED_NAME_SITE_NAME = "siteName";
  @SerializedName(SERIALIZED_NAME_SITE_NAME)
  private String siteName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private LegacyAddress address;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<LegacySiteDevice> devices = null;

  public static final String SERIALIZED_NAME_SITE_ATTRIBUTES = "siteAttributes";
  @SerializedName(SERIALIZED_NAME_SITE_ATTRIBUTES)
  private Map<String, Object> siteAttributes = null;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private Boolean delete;

  public static final String SERIALIZED_NAME_OPERATIONAL_STATUS = "operationalStatus";
  @SerializedName(SERIALIZED_NAME_OPERATIONAL_STATUS)
  private String operationalStatus;


  public LegacySite siteId(UUID siteId) {
    
    this.siteId = siteId;
    return this;
  }

   /**
   * Get siteId
   * @return siteId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getSiteId() {
    return siteId;
  }


  public void setSiteId(UUID siteId) {
    this.siteId = siteId;
  }


  public LegacySite siteName(String siteName) {
    
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSiteName() {
    return siteName;
  }


  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }


  public LegacySite displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public LegacySite address(LegacyAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public LegacyAddress getAddress() {
    return address;
  }


  public void setAddress(LegacyAddress address) {
    this.address = address;
  }


  public LegacySite devices(List<LegacySiteDevice> devices) {
    
    this.devices = devices;
    return this;
  }

  public LegacySite addDevicesItem(LegacySiteDevice devicesItem) {
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

  public List<LegacySiteDevice> getDevices() {
    return devices;
  }


  public void setDevices(List<LegacySiteDevice> devices) {
    this.devices = devices;
  }


  public LegacySite siteAttributes(Map<String, Object> siteAttributes) {
    
    this.siteAttributes = siteAttributes;
    return this;
  }

  public LegacySite putSiteAttributesItem(String key, Object siteAttributesItem) {
    if (this.siteAttributes == null) {
      this.siteAttributes = new HashMap<>();
    }
    this.siteAttributes.put(key, siteAttributesItem);
    return this;
  }

   /**
   * Get siteAttributes
   * @return siteAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getSiteAttributes() {
    return siteAttributes;
  }


  public void setSiteAttributes(Map<String, Object> siteAttributes) {
    this.siteAttributes = siteAttributes;
  }


  public LegacySite delete(Boolean delete) {
    
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDelete() {
    return delete;
  }


  public void setDelete(Boolean delete) {
    this.delete = delete;
  }


  public LegacySite operationalStatus(String operationalStatus) {
    
    this.operationalStatus = operationalStatus;
    return this;
  }

   /**
   * Get operationalStatus
   * @return operationalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOperationalStatus() {
    return operationalStatus;
  }


  public void setOperationalStatus(String operationalStatus) {
    this.operationalStatus = operationalStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySite legacySite = (LegacySite) o;
    return Objects.equals(this.siteId, legacySite.siteId) &&
        Objects.equals(this.siteName, legacySite.siteName) &&
        Objects.equals(this.displayName, legacySite.displayName) &&
        Objects.equals(this.address, legacySite.address) &&
        Objects.equals(this.devices, legacySite.devices) &&
        Objects.equals(this.siteAttributes, legacySite.siteAttributes) &&
        Objects.equals(this.delete, legacySite.delete) &&
        Objects.equals(this.operationalStatus, legacySite.operationalStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteId, siteName, displayName, address, devices, siteAttributes, delete, operationalStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySite {\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    siteAttributes: ").append(toIndentedString(siteAttributes)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    operationalStatus: ").append(toIndentedString(operationalStatus)).append("\n");
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

