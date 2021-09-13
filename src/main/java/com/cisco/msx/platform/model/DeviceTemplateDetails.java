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
 * DeviceTemplateDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-10T10:48:16.525056800-04:00[America/Toronto]")
public class DeviceTemplateDetails {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private List<NameValue> templateParams = null;


  public DeviceTemplateDetails templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTemplateId() {
    return templateId;
  }


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public DeviceTemplateDetails templateParams(List<NameValue> templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

  public DeviceTemplateDetails addTemplateParamsItem(NameValue templateParamsItem) {
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
    DeviceTemplateDetails deviceTemplateDetails = (DeviceTemplateDetails) o;
    return Objects.equals(this.templateId, deviceTemplateDetails.templateId) &&
        Objects.equals(this.templateParams, deviceTemplateDetails.templateParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, templateParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTemplateDetails {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

