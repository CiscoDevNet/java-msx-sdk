/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.8
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
import java.util.UUID;

/**
 * TemplateApplicationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class TemplateApplicationAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
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




   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplateName() {
    return templateName;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateApplicationAllOf templateApplicationAllOf = (TemplateApplicationAllOf) o;
    return Objects.equals(this.id, templateApplicationAllOf.id) &&
        Objects.equals(this.templateId, templateApplicationAllOf.templateId) &&
        Objects.equals(this.templateName, templateApplicationAllOf.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, templateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateApplicationAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
