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
import com.cisco.msx.platform.model.NameValue;
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
 * DeviceTemplateUpdateDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T15:11:34.208390-04:00[America/New_York]")
public class DeviceTemplateUpdateDetails {
  public static final String SERIALIZED_NAME_TEMPLATE_HISTORY_ID = "templateHistoryId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_HISTORY_ID)
  private UUID templateHistoryId;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private List<NameValue> templateParams = null;


  public DeviceTemplateUpdateDetails templateHistoryId(UUID templateHistoryId) {
    
    this.templateHistoryId = templateHistoryId;
    return this;
  }

   /**
   * Get templateHistoryId
   * @return templateHistoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTemplateHistoryId() {
    return templateHistoryId;
  }


  public void setTemplateHistoryId(UUID templateHistoryId) {
    this.templateHistoryId = templateHistoryId;
  }


  public DeviceTemplateUpdateDetails templateParams(List<NameValue> templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

  public DeviceTemplateUpdateDetails addTemplateParamsItem(NameValue templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<>();
    }
    this.templateParams.add(templateParamsItem);
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NameValue> getTemplateParams() {
    return templateParams;
  }


  public void setTemplateParams(List<NameValue> templateParams) {
    this.templateParams = templateParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTemplateUpdateDetails deviceTemplateUpdateDetails = (DeviceTemplateUpdateDetails) o;
    return Objects.equals(this.templateHistoryId, deviceTemplateUpdateDetails.templateHistoryId) &&
        Objects.equals(this.templateParams, deviceTemplateUpdateDetails.templateParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateHistoryId, templateParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTemplateUpdateDetails {\n");
    sb.append("    templateHistoryId: ").append(toIndentedString(templateHistoryId)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
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

