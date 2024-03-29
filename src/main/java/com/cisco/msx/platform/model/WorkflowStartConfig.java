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
import com.cisco.msx.platform.model.WorkflowVariable;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WorkflowStartConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class WorkflowStartConfig {
  public static final String SERIALIZED_NAME_INPUT_VARIABLES = "input_variables";
  @SerializedName(SERIALIZED_NAME_INPUT_VARIABLES)
  private List<WorkflowVariable> inputVariables = null;

  public static final String SERIALIZED_NAME_TYPE_OF_TARGET_NEEDED = "type_of_target_needed";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_TARGET_NEEDED)
  private String typeOfTargetNeeded;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public WorkflowStartConfig() { 
  }

  public WorkflowStartConfig inputVariables(List<WorkflowVariable> inputVariables) {
    
    this.inputVariables = inputVariables;
    return this;
  }

  public WorkflowStartConfig addInputVariablesItem(WorkflowVariable inputVariablesItem) {
    if (this.inputVariables == null) {
      this.inputVariables = new ArrayList<>();
    }
    this.inputVariables.add(inputVariablesItem);
    return this;
  }

   /**
   * Get inputVariables
   * @return inputVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowVariable> getInputVariables() {
    return inputVariables;
  }


  public void setInputVariables(List<WorkflowVariable> inputVariables) {
    this.inputVariables = inputVariables;
  }


  public WorkflowStartConfig typeOfTargetNeeded(String typeOfTargetNeeded) {
    
    this.typeOfTargetNeeded = typeOfTargetNeeded;
    return this;
  }

   /**
   * Get typeOfTargetNeeded
   * @return typeOfTargetNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTypeOfTargetNeeded() {
    return typeOfTargetNeeded;
  }


  public void setTypeOfTargetNeeded(String typeOfTargetNeeded) {
    this.typeOfTargetNeeded = typeOfTargetNeeded;
  }


  public WorkflowStartConfig targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Get targetId
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStartConfig workflowStartConfig = (WorkflowStartConfig) o;
    return Objects.equals(this.inputVariables, workflowStartConfig.inputVariables) &&
        Objects.equals(this.typeOfTargetNeeded, workflowStartConfig.typeOfTargetNeeded) &&
        Objects.equals(this.targetId, workflowStartConfig.targetId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputVariables, typeOfTargetNeeded, targetId);
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
    sb.append("class WorkflowStartConfig {\n");
    sb.append("    inputVariables: ").append(toIndentedString(inputVariables)).append("\n");
    sb.append("    typeOfTargetNeeded: ").append(toIndentedString(typeOfTargetNeeded)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

