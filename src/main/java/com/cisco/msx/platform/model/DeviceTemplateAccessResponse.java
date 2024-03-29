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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * DeviceTemplateAccessResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class DeviceTemplateAccessResponse {
  public static final String SERIALIZED_NAME_FAILURE_LIST_OF_TENANTS = "failureListOfTenants";
  @SerializedName(SERIALIZED_NAME_FAILURE_LIST_OF_TENANTS)
  private List<UUID> failureListOfTenants = null;

  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  private Boolean global;

  public static final String SERIALIZED_NAME_SUCCESS_LIST_OF_TENANTS = "successListOfTenants";
  @SerializedName(SERIALIZED_NAME_SUCCESS_LIST_OF_TENANTS)
  private List<UUID> successListOfTenants = null;

  public DeviceTemplateAccessResponse() { 
  }

  public DeviceTemplateAccessResponse failureListOfTenants(List<UUID> failureListOfTenants) {
    
    this.failureListOfTenants = failureListOfTenants;
    return this;
  }

  public DeviceTemplateAccessResponse addFailureListOfTenantsItem(UUID failureListOfTenantsItem) {
    if (this.failureListOfTenants == null) {
      this.failureListOfTenants = new ArrayList<>();
    }
    this.failureListOfTenants.add(failureListOfTenantsItem);
    return this;
  }

   /**
   * Get failureListOfTenants
   * @return failureListOfTenants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getFailureListOfTenants() {
    return failureListOfTenants;
  }


  public void setFailureListOfTenants(List<UUID> failureListOfTenants) {
    this.failureListOfTenants = failureListOfTenants;
  }


  public DeviceTemplateAccessResponse global(Boolean global) {
    
    this.global = global;
    return this;
  }

   /**
   * Get global
   * @return global
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGlobal() {
    return global;
  }


  public void setGlobal(Boolean global) {
    this.global = global;
  }


  public DeviceTemplateAccessResponse successListOfTenants(List<UUID> successListOfTenants) {
    
    this.successListOfTenants = successListOfTenants;
    return this;
  }

  public DeviceTemplateAccessResponse addSuccessListOfTenantsItem(UUID successListOfTenantsItem) {
    if (this.successListOfTenants == null) {
      this.successListOfTenants = new ArrayList<>();
    }
    this.successListOfTenants.add(successListOfTenantsItem);
    return this;
  }

   /**
   * Get successListOfTenants
   * @return successListOfTenants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getSuccessListOfTenants() {
    return successListOfTenants;
  }


  public void setSuccessListOfTenants(List<UUID> successListOfTenants) {
    this.successListOfTenants = successListOfTenants;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTemplateAccessResponse deviceTemplateAccessResponse = (DeviceTemplateAccessResponse) o;
    return Objects.equals(this.failureListOfTenants, deviceTemplateAccessResponse.failureListOfTenants) &&
        Objects.equals(this.global, deviceTemplateAccessResponse.global) &&
        Objects.equals(this.successListOfTenants, deviceTemplateAccessResponse.successListOfTenants);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureListOfTenants, global, successListOfTenants);
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
    sb.append("class DeviceTemplateAccessResponse {\n");
    sb.append("    failureListOfTenants: ").append(toIndentedString(failureListOfTenants)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    successListOfTenants: ").append(toIndentedString(successListOfTenants)).append("\n");
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

