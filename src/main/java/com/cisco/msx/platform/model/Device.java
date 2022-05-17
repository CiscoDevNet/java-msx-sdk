/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.DeviceAllOf;
import com.cisco.msx.platform.model.DeviceCreate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Device
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class Device {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private UUID providerId;

  public static final String SERIALIZED_NAME_VULNERABILITY_STATE = "vulnerabilityState";
  @SerializedName(SERIALIZED_NAME_VULNERABILITY_STATE)
  private String vulnerabilityState;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_SERVICE_INSTANCE_ID = "serviceInstanceId";
  @SerializedName(SERIALIZED_NAME_SERVICE_INSTANCE_ID)
  private String serviceInstanceId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_MANAGED = "managed";
  @SerializedName(SERIALIZED_NAME_MANAGED)
  private Boolean managed = false;

  public static final String SERIALIZED_NAME_ONBOARD_TYPE = "onboardType";
  @SerializedName(SERIALIZED_NAME_ONBOARD_TYPE)
  private String onboardType;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

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
  private String complianceState;

  public static final String SERIALIZED_NAME_ONBOARD_INFORMATION = "onboardInformation";
  @SerializedName(SERIALIZED_NAME_ONBOARD_INFORMATION)
  private Map<String, Object> onboardInformation = null;

  public Device() { 
  }

  public Device id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Device userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public Device providerId(UUID providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Get providerId
   * @return providerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getProviderId() {
    return providerId;
  }


  public void setProviderId(UUID providerId) {
    this.providerId = providerId;
  }


  public Device vulnerabilityState(String vulnerabilityState) {
    
    this.vulnerabilityState = vulnerabilityState;
    return this;
  }

   /**
   * Valid values: VULNERABLE, NOT_VULNERABLE, NOT_APPLICABLE, UNKNOWN
   * @return vulnerabilityState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Valid values: VULNERABLE, NOT_VULNERABLE, NOT_APPLICABLE, UNKNOWN")

  public String getVulnerabilityState() {
    return vulnerabilityState;
  }


  public void setVulnerabilityState(String vulnerabilityState) {
    this.vulnerabilityState = vulnerabilityState;
  }


  public Device createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
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


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public Device modifiedOn(OffsetDateTime modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
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


  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  public Device serviceInstanceId(String serviceInstanceId) {
    
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


  public Device subscriptionId(String subscriptionId) {
    
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


  public Device tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getTenantId() {
    return tenantId;
  }


  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public Device serviceType(String serviceType) {
    
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


  public Device tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Device putTagsItem(String key, String tagsItem) {
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


  public Device managed(Boolean managed) {
    
    this.managed = managed;
    return this;
  }

   /**
   * Get managed
   * @return managed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getManaged() {
    return managed;
  }


  public void setManaged(Boolean managed) {
    this.managed = managed;
  }


  public Device onboardType(String onboardType) {
    
    this.onboardType = onboardType;
    return this;
  }

   /**
   * Get onboardType
   * @return onboardType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getOnboardType() {
    return onboardType;
  }


  public void setOnboardType(String onboardType) {
    this.onboardType = onboardType;
  }


  public Device attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Device putAttributesItem(String key, Object attributesItem) {
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

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public Device name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Device model(String model) {
    
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    this.model = model;
  }


  public Device type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Device subType(String subType) {
    
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


  public Device serialKey(String serialKey) {
    
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


  public Device version(String version) {
    
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


  public Device complianceState(String complianceState) {
    
    this.complianceState = complianceState;
    return this;
  }

   /**
   * Valid values: COMPLIANT, NOT_COMPLIANT, APPLICABLE, NOT_APPLICABLE, UNKNOWN
   * @return complianceState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Valid values: COMPLIANT, NOT_COMPLIANT, APPLICABLE, NOT_APPLICABLE, UNKNOWN")

  public String getComplianceState() {
    return complianceState;
  }


  public void setComplianceState(String complianceState) {
    this.complianceState = complianceState;
  }


  public Device onboardInformation(Map<String, Object> onboardInformation) {
    
    this.onboardInformation = onboardInformation;
    return this;
  }

  public Device putOnboardInformationItem(String key, Object onboardInformationItem) {
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

  public Map<String, Object> getOnboardInformation() {
    return onboardInformation;
  }


  public void setOnboardInformation(Map<String, Object> onboardInformation) {
    this.onboardInformation = onboardInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.id, device.id) &&
        Objects.equals(this.userId, device.userId) &&
        Objects.equals(this.providerId, device.providerId) &&
        Objects.equals(this.vulnerabilityState, device.vulnerabilityState) &&
        Objects.equals(this.createdOn, device.createdOn) &&
        Objects.equals(this.modifiedOn, device.modifiedOn) &&
        Objects.equals(this.serviceInstanceId, device.serviceInstanceId) &&
        Objects.equals(this.subscriptionId, device.subscriptionId) &&
        Objects.equals(this.tenantId, device.tenantId) &&
        Objects.equals(this.serviceType, device.serviceType) &&
        Objects.equals(this.tags, device.tags) &&
        Objects.equals(this.managed, device.managed) &&
        Objects.equals(this.onboardType, device.onboardType) &&
        Objects.equals(this.attributes, device.attributes) &&
        Objects.equals(this.name, device.name) &&
        Objects.equals(this.model, device.model) &&
        Objects.equals(this.type, device.type) &&
        Objects.equals(this.subType, device.subType) &&
        Objects.equals(this.serialKey, device.serialKey) &&
        Objects.equals(this.version, device.version) &&
        Objects.equals(this.complianceState, device.complianceState) &&
        Objects.equals(this.onboardInformation, device.onboardInformation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, providerId, vulnerabilityState, createdOn, modifiedOn, serviceInstanceId, subscriptionId, tenantId, serviceType, tags, managed, onboardType, attributes, name, model, type, subType, serialKey, version, complianceState, onboardInformation);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    vulnerabilityState: ").append(toIndentedString(vulnerabilityState)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    managed: ").append(toIndentedString(managed)).append("\n");
    sb.append("    onboardType: ").append(toIndentedString(onboardType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    serialKey: ").append(toIndentedString(serialKey)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
    sb.append("    onboardInformation: ").append(toIndentedString(onboardInformation)).append("\n");
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

