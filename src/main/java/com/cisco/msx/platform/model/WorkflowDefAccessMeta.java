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

/**
 * WorkflowDefAccessMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T16:01:54.199340-04:00[America/New_York]")
public class WorkflowDefAccessMeta {
  public static final String SERIALIZED_NAME_IS_INTEGRATION = "is_integration";
  @SerializedName(SERIALIZED_NAME_IS_INTEGRATION)
  private Boolean isIntegration;

  public static final String SERIALIZED_NAME_IS_INTERNAL = "is_internal";
  @SerializedName(SERIALIZED_NAME_IS_INTERNAL)
  private Boolean isInternal;


  public WorkflowDefAccessMeta isIntegration(Boolean isIntegration) {
    
    this.isIntegration = isIntegration;
    return this;
  }

   /**
   * Get isIntegration
   * @return isIntegration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsIntegration() {
    return isIntegration;
  }


  public void setIsIntegration(Boolean isIntegration) {
    this.isIntegration = isIntegration;
  }


  public WorkflowDefAccessMeta isInternal(Boolean isInternal) {
    
    this.isInternal = isInternal;
    return this;
  }

   /**
   * Get isInternal
   * @return isInternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsInternal() {
    return isInternal;
  }


  public void setIsInternal(Boolean isInternal) {
    this.isInternal = isInternal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowDefAccessMeta workflowDefAccessMeta = (WorkflowDefAccessMeta) o;
    return Objects.equals(this.isIntegration, workflowDefAccessMeta.isIntegration) &&
        Objects.equals(this.isInternal, workflowDefAccessMeta.isInternal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isIntegration, isInternal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDefAccessMeta {\n");
    sb.append("    isIntegration: ").append(toIndentedString(isIntegration)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
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

