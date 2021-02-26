/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: somecontact@cisco.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.LegacySiteDeviceOnboard;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LegacySiteDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T21:36:18.317728-05:00[America/New_York]")
public class LegacySiteDevice {
  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DEVICE_ATTRIBUTES = "deviceAttributes";
  @SerializedName(SERIALIZED_NAME_DEVICE_ATTRIBUTES)
  private Map<String, Object> deviceAttributes = null;

  public static final String SERIALIZED_NAME_DEVICE_ONBOARDING = "deviceOnboarding";
  @SerializedName(SERIALIZED_NAME_DEVICE_ONBOARDING)
  private LegacySiteDeviceOnboard deviceOnboarding;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private Boolean delete;


  public LegacySiteDevice deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public LegacySiteDevice name(String name) {
    
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


  public LegacySiteDevice model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public LegacySiteDevice type(String type) {
    
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


  public LegacySiteDevice deviceAttributes(Map<String, Object> deviceAttributes) {
    
    this.deviceAttributes = deviceAttributes;
    return this;
  }

  public LegacySiteDevice putDeviceAttributesItem(String key, Object deviceAttributesItem) {
    if (this.deviceAttributes == null) {
      this.deviceAttributes = new HashMap<>();
    }
    this.deviceAttributes.put(key, deviceAttributesItem);
    return this;
  }

   /**
   * Get deviceAttributes
   * @return deviceAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getDeviceAttributes() {
    return deviceAttributes;
  }


  public void setDeviceAttributes(Map<String, Object> deviceAttributes) {
    this.deviceAttributes = deviceAttributes;
  }


  public LegacySiteDevice deviceOnboarding(LegacySiteDeviceOnboard deviceOnboarding) {
    
    this.deviceOnboarding = deviceOnboarding;
    return this;
  }

   /**
   * Get deviceOnboarding
   * @return deviceOnboarding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LegacySiteDeviceOnboard getDeviceOnboarding() {
    return deviceOnboarding;
  }


  public void setDeviceOnboarding(LegacySiteDeviceOnboard deviceOnboarding) {
    this.deviceOnboarding = deviceOnboarding;
  }


  public LegacySiteDevice delete(Boolean delete) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySiteDevice legacySiteDevice = (LegacySiteDevice) o;
    return Objects.equals(this.deviceId, legacySiteDevice.deviceId) &&
        Objects.equals(this.name, legacySiteDevice.name) &&
        Objects.equals(this.model, legacySiteDevice.model) &&
        Objects.equals(this.type, legacySiteDevice.type) &&
        Objects.equals(this.deviceAttributes, legacySiteDevice.deviceAttributes) &&
        Objects.equals(this.deviceOnboarding, legacySiteDevice.deviceOnboarding) &&
        Objects.equals(this.delete, legacySiteDevice.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, name, model, type, deviceAttributes, deviceOnboarding, delete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySiteDevice {\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deviceAttributes: ").append(toIndentedString(deviceAttributes)).append("\n");
    sb.append("    deviceOnboarding: ").append(toIndentedString(deviceOnboarding)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

