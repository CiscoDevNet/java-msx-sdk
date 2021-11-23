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
import com.cisco.msx.platform.model.WorkflowSchema;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowSchemaByTypeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class WorkflowSchemaByTypeResponse {
  public static final String SERIALIZED_NAME_VIEW_SCHEMA = "view_schema";
  @SerializedName(SERIALIZED_NAME_VIEW_SCHEMA)
  private WorkflowSchema viewSchema = null;

  public static final String SERIALIZED_NAME_DATA_SCHEMA = "data_schema";
  @SerializedName(SERIALIZED_NAME_DATA_SCHEMA)
  private WorkflowSchema dataSchema = null;


  public WorkflowSchemaByTypeResponse viewSchema(WorkflowSchema viewSchema) {
    
    this.viewSchema = viewSchema;
    return this;
  }

   /**
   * Get viewSchema
   * @return viewSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowSchema getViewSchema() {
    return viewSchema;
  }


  public void setViewSchema(WorkflowSchema viewSchema) {
    this.viewSchema = viewSchema;
  }


  public WorkflowSchemaByTypeResponse dataSchema(WorkflowSchema dataSchema) {
    
    this.dataSchema = dataSchema;
    return this;
  }

   /**
   * Get dataSchema
   * @return dataSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowSchema getDataSchema() {
    return dataSchema;
  }


  public void setDataSchema(WorkflowSchema dataSchema) {
    this.dataSchema = dataSchema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemaByTypeResponse workflowSchemaByTypeResponse = (WorkflowSchemaByTypeResponse) o;
    return Objects.equals(this.viewSchema, workflowSchemaByTypeResponse.viewSchema) &&
        Objects.equals(this.dataSchema, workflowSchemaByTypeResponse.dataSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewSchema, dataSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchemaByTypeResponse {\n");
    sb.append("    viewSchema: ").append(toIndentedString(viewSchema)).append("\n");
    sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
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

