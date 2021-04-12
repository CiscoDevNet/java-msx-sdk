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
import com.cisco.msx.platform.model.DeviceBilling;
import com.cisco.msx.platform.model.DeviceCreateAllOf;
import com.cisco.msx.platform.model.DeviceUpdate;
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
import java.util.UUID;

/**
 * DeviceCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T15:11:34.208390-04:00[America/New_York]")
public class DeviceCreate {
  public static final String SERIALIZED_NAME_SERVICE_INSTANCE_ID = "serviceInstanceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_INSTANCE_ID)
  private String serviceInstanceId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

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

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_SERIAL_KEY = "serialKey";
  @SerializedName(SERIALIZED_NAME_SERIAL_KEY)
  private String serialKey;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private Boolean managed = false;

  public static final String SERIALIZED_NAME_ONBOARD_TYPE = "onboardType";
  @SerializedName(SERIALIZED_NAME_ONBOARD_TYPE)
  private String onboardType;

  public static final String SERIALIZED_NAME_ONBOARD_INFORMATION = "onboardInformation";
  @SerializedName(SERIALIZED_NAME_ONBOARD_INFORMATION)
  private Map<String, String> onboardInformation = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private DeviceBilling billing;


  public DeviceCreate serviceInstanceId(String serviceInstanceId) {
    
    this.serviceInstanceId = serviceInstanceId;
    return this;
  }

   /**
   * Get serviceInstanceId
   * @return serviceInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceInstanceId() {
    return serviceInstanceId;
  }


  public void setServiceInstanceId(String serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
  }


  public DeviceCreate subscriptionId(String subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubscriptionId() {
    return subscriptionId;
  }


  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public DeviceCreate tenantId(UUID tenantId) {
    
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


  public DeviceCreate name(String name) {
    
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


  public DeviceCreate model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(required = true, value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public DeviceCreate type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public DeviceCreate subType(String subType) {
    
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


  public DeviceCreate serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public DeviceCreate tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public DeviceCreate putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public DeviceCreate serialKey(String serialKey) {
    
    this.serialKey = serialKey;
    return this;
  }

   /**
   * Get serialKey
   * @return serialKey
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSerialKey() {
    return serialKey;
  }


  public void setSerialKey(String serialKey) {
    this.serialKey = serialKey;
  }


  public DeviceCreate version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public DeviceCreate managed(Boolean managed) {
    
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getManaged() {
    return managed;
  }


  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  public DeviceCreate onboardType(String onboardType) {
    
    this.onboardType = onboardType;
    return this;
  }

   /**
   * Get onboardType
   * @return onboardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOnboardType() {
    return onboardType;
  }


  public void setOnboardType(String onboardType) {
    this.onboardType = onboardType;
  }


  public DeviceCreate onboardInformation(Map<String, String> onboardInformation) {
    
    this.onboardInformation = onboardInformation;
    return this;
  }

  public DeviceCreate putOnboardInformationItem(String key, String onboardInformationItem) {
    if (this.onboardInformation == null) {
      this.onboardInformation = new HashMap<>();
    }
    this.onboardInformation.put(key, onboardInformationItem);
    return this;
  }

   /**
   * Get onboardInformation
   * @return onboardInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getOnboardInformation() {
    return onboardInformation;
  }


  public void setOnboardInformation(Map<String, String> onboardInformation) {
    this.onboardInformation = onboardInformation;
  }


  public DeviceCreate attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public DeviceCreate putAttributesItem(String key, String attributesItem) {
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


  public DeviceCreate billing(DeviceBilling billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeviceBilling getBilling() {
    return billing;
  }


  public void setBilling(DeviceBilling billing) {
    this.billing = billing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceCreate deviceCreate = (DeviceCreate) o;
    return Objects.equals(this.serviceInstanceId, deviceCreate.serviceInstanceId) &&
        Objects.equals(this.subscriptionId, deviceCreate.subscriptionId) &&
        Objects.equals(this.tenantId, deviceCreate.tenantId) &&
        Objects.equals(this.name, deviceCreate.name) &&
        Objects.equals(this.model, deviceCreate.model) &&
        Objects.equals(this.type, deviceCreate.type) &&
        Objects.equals(this.subType, deviceCreate.subType) &&
        Objects.equals(this.serviceType, deviceCreate.serviceType) &&
        Objects.equals(this.tags, deviceCreate.tags) &&
        Objects.equals(this.serialKey, deviceCreate.serialKey) &&
        Objects.equals(this.version, deviceCreate.version) &&
        Objects.equals(this.managed, deviceCreate.managed) &&
        Objects.equals(this.onboardType, deviceCreate.onboardType) &&
        Objects.equals(this.onboardInformation, deviceCreate.onboardInformation) &&
        Objects.equals(this.attributes, deviceCreate.attributes) &&
        Objects.equals(this.billing, deviceCreate.billing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceInstanceId, subscriptionId, tenantId, name, model, type, subType, serviceType, tags, serialKey, version, managed, onboardType, onboardInformation, attributes, billing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCreate {\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    serialKey: ").append(toIndentedString(serialKey)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    onboardType: ").append(toIndentedString(onboardType)).append("\n");
    sb.append("    onboardInformation: ").append(toIndentedString(onboardInformation)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
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

