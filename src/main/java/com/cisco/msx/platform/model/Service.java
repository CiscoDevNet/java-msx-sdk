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

/**
 * Service
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T16:01:54.199340-04:00[America/New_York]")
public class Service {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private UUID providerId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_PROVISIONED_ON = "provisionedOn";
  @SerializedName(SERIALIZED_NAME_PROVISIONED_ON)
  private OffsetDateTime provisionedOn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Map<String, String> status = null;

  public static final String SERIALIZED_NAME_DEFINITION_ATTRIBUTES = "definitionAttributes";
  @SerializedName(SERIALIZED_NAME_DEFINITION_ATTRIBUTES)
  private Map<String, Object> definitionAttributes = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }




  public Service providerId(UUID providerId) {
    
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


  public Service tenantId(UUID tenantId) {
    
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


  public Service userId(UUID userId) {
    
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


  public Service subscriptionId(String subscriptionId) {
    
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
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }




   /**
   * Get provisionedOn
   * @return provisionedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getProvisionedOn() {
    return provisionedOn;
  }




  public Service status(Map<String, String> status) {
    
    this.status = status;
    return this;
  }

  public Service putStatusItem(String key, String statusItem) {
    if (this.status == null) {
      this.status = new HashMap<>();
    }
    this.status.put(key, statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getStatus() {
    return status;
  }


  public void setStatus(Map<String, String> status) {
    this.status = status;
  }


  public Service definitionAttributes(Map<String, Object> definitionAttributes) {
    
    this.definitionAttributes = definitionAttributes;
    return this;
  }

  public Service putDefinitionAttributesItem(String key, Object definitionAttributesItem) {
    if (this.definitionAttributes == null) {
      this.definitionAttributes = new HashMap<>();
    }
    this.definitionAttributes.put(key, definitionAttributesItem);
    return this;
  }

   /**
   * Get definitionAttributes
   * @return definitionAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getDefinitionAttributes() {
    return definitionAttributes;
  }


  public void setDefinitionAttributes(Map<String, Object> definitionAttributes) {
    this.definitionAttributes = definitionAttributes;
  }


  public Service attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Service putAttributesItem(String key, Object attributesItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.providerId, service.providerId) &&
        Objects.equals(this.tenantId, service.tenantId) &&
        Objects.equals(this.userId, service.userId) &&
        Objects.equals(this.subscriptionId, service.subscriptionId) &&
        Objects.equals(this.createdOn, service.createdOn) &&
        Objects.equals(this.modifiedOn, service.modifiedOn) &&
        Objects.equals(this.provisionedOn, service.provisionedOn) &&
        Objects.equals(this.status, service.status) &&
        Objects.equals(this.definitionAttributes, service.definitionAttributes) &&
        Objects.equals(this.attributes, service.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, providerId, tenantId, userId, subscriptionId, createdOn, modifiedOn, provisionedOn, status, definitionAttributes, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    provisionedOn: ").append(toIndentedString(provisionedOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    definitionAttributes: ").append(toIndentedString(definitionAttributes)).append("\n");
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

