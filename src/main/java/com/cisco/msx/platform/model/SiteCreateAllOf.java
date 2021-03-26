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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SiteCreateAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T16:01:54.199340-04:00[America/New_York]")
public class SiteCreateAllOf {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_DEVICE_IDS = "deviceIds";
  @SerializedName(SERIALIZED_NAME_DEVICE_IDS)
  private List<String> deviceIds = null;

  public static final String SERIALIZED_NAME_SERVICE_IDS = "serviceIds";
  @SerializedName(SERIALIZED_NAME_SERVICE_IDS)
  private List<String> serviceIds = null;


  public SiteCreateAllOf tenantId(UUID tenantId) {
    
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


  public SiteCreateAllOf deviceIds(List<String> deviceIds) {
    
    this.deviceIds = deviceIds;
    return this;
  }

  public SiteCreateAllOf addDeviceIdsItem(String deviceIdsItem) {
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


  public SiteCreateAllOf serviceIds(List<String> serviceIds) {
    
    this.serviceIds = serviceIds;
    return this;
  }

  public SiteCreateAllOf addServiceIdsItem(String serviceIdsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SiteCreateAllOf siteCreateAllOf = (SiteCreateAllOf) o;
    return Objects.equals(this.tenantId, siteCreateAllOf.tenantId) &&
        Objects.equals(this.deviceIds, siteCreateAllOf.deviceIds) &&
        Objects.equals(this.serviceIds, siteCreateAllOf.serviceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, deviceIds, serviceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SiteCreateAllOf {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    serviceIds: ").append(toIndentedString(serviceIds)).append("\n");
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

