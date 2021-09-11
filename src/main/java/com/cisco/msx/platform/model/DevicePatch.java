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
import com.cisco.msx.platform.model.DeviceComplianceState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DevicePatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-10T10:48:16.525056800-04:00[America/Toronto]")
public class DevicePatch {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SUB_TYPE = "subType";
  @SerializedName(SERIALIZED_NAME_SUB_TYPE)
  private String subType;

  public static final String SERIALIZED_NAME_SERIAL_KEY = "serialKey";
  @SerializedName(SERIALIZED_NAME_SERIAL_KEY)
  private String serialKey;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_COMPLIANCE_STATE = "complianceState";
  @SerializedName(SERIALIZED_NAME_COMPLIANCE_STATE)
  private DeviceComplianceState complianceState;


  public DevicePatch name(String name) {
    
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


  public DevicePatch model(String model) {
    
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


  public DevicePatch type(String type) {
    
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


  public DevicePatch subType(String subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * Get subType
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubType() {
    return subType;
  }


  public void setSubType(String subType) {
    this.subType = subType;
  }


  public DevicePatch serialKey(String serialKey) {
    
    this.serialKey = serialKey;
    return this;
  }

   /**
   * Get serialKey
   * @return serialKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialKey() {
    return serialKey;
  }


  public void setSerialKey(String serialKey) {
    this.serialKey = serialKey;
  }


  public DevicePatch version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public DevicePatch complianceState(DeviceComplianceState complianceState) {
    
    this.complianceState = complianceState;
    return this;
  }

   /**
   * Get complianceState
   * @return complianceState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceComplianceState getComplianceState() {
    return complianceState;
  }


  public void setComplianceState(DeviceComplianceState complianceState) {
    this.complianceState = complianceState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicePatch devicePatch = (DevicePatch) o;
    return Objects.equals(this.name, devicePatch.name) &&
        Objects.equals(this.model, devicePatch.model) &&
        Objects.equals(this.type, devicePatch.type) &&
        Objects.equals(this.subType, devicePatch.subType) &&
        Objects.equals(this.serialKey, devicePatch.serialKey) &&
        Objects.equals(this.version, devicePatch.version) &&
        Objects.equals(this.complianceState, devicePatch.complianceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, model, type, subType, serialKey, version, complianceState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicePatch {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    serialKey: ").append(toIndentedString(serialKey)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
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

