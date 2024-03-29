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

/**
 * LegacyNsoResponseTypes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class LegacyNsoResponseTypes {
  public static final String SERIALIZED_NAME_CREATE_OPERATION = "createOperation";
  @SerializedName(SERIALIZED_NAME_CREATE_OPERATION)
  private String createOperation;

  public static final String SERIALIZED_NAME_UPDATE_OPERATION = "updateOperation";
  @SerializedName(SERIALIZED_NAME_UPDATE_OPERATION)
  private String updateOperation;

  public static final String SERIALIZED_NAME_DELETE_OPERATION = "deleteOperation";
  @SerializedName(SERIALIZED_NAME_DELETE_OPERATION)
  private String deleteOperation;

  public LegacyNsoResponseTypes() { 
  }

  public LegacyNsoResponseTypes createOperation(String createOperation) {
    
    this.createOperation = createOperation;
    return this;
  }

   /**
   * Get createOperation
   * @return createOperation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreateOperation() {
    return createOperation;
  }


  public void setCreateOperation(String createOperation) {
    this.createOperation = createOperation;
  }


  public LegacyNsoResponseTypes updateOperation(String updateOperation) {
    
    this.updateOperation = updateOperation;
    return this;
  }

   /**
   * Get updateOperation
   * @return updateOperation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdateOperation() {
    return updateOperation;
  }


  public void setUpdateOperation(String updateOperation) {
    this.updateOperation = updateOperation;
  }


  public LegacyNsoResponseTypes deleteOperation(String deleteOperation) {
    
    this.deleteOperation = deleteOperation;
    return this;
  }

   /**
   * Get deleteOperation
   * @return deleteOperation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeleteOperation() {
    return deleteOperation;
  }


  public void setDeleteOperation(String deleteOperation) {
    this.deleteOperation = deleteOperation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyNsoResponseTypes legacyNsoResponseTypes = (LegacyNsoResponseTypes) o;
    return Objects.equals(this.createOperation, legacyNsoResponseTypes.createOperation) &&
        Objects.equals(this.updateOperation, legacyNsoResponseTypes.updateOperation) &&
        Objects.equals(this.deleteOperation, legacyNsoResponseTypes.deleteOperation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createOperation, updateOperation, deleteOperation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyNsoResponseTypes {\n");
    sb.append("    createOperation: ").append(toIndentedString(createOperation)).append("\n");
    sb.append("    updateOperation: ").append(toIndentedString(updateOperation)).append("\n");
    sb.append("    deleteOperation: ").append(toIndentedString(deleteOperation)).append("\n");
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

