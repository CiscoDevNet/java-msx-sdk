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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ValidateWorkflowResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class ValidateWorkflowResponse {
  public static final String SERIALIZED_NAME_TOTAL_ACTIONS = "total_actions";
  @SerializedName(SERIALIZED_NAME_TOTAL_ACTIONS)
  private Integer totalActions;

  public static final String SERIALIZED_NAME_TOTAL_VALID = "total_valid";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALID)
  private Integer totalValid;

  public static final String SERIALIZED_NAME_WORKFLOW_VALID = "workflow_valid";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_VALID)
  private Boolean workflowValid;

  public static final String SERIALIZED_NAME_INVALID_ACTION_IDS = "invalid_action_ids";
  @SerializedName(SERIALIZED_NAME_INVALID_ACTION_IDS)
  private List<String> invalidActionIds = null;

  public ValidateWorkflowResponse() { 
  }

  public ValidateWorkflowResponse totalActions(Integer totalActions) {
    
    this.totalActions = totalActions;
    return this;
  }

   /**
   * Get totalActions
   * @return totalActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalActions() {
    return totalActions;
  }


  public void setTotalActions(Integer totalActions) {
    this.totalActions = totalActions;
  }


  public ValidateWorkflowResponse totalValid(Integer totalValid) {
    
    this.totalValid = totalValid;
    return this;
  }

   /**
   * Get totalValid
   * @return totalValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalValid() {
    return totalValid;
  }


  public void setTotalValid(Integer totalValid) {
    this.totalValid = totalValid;
  }


  public ValidateWorkflowResponse workflowValid(Boolean workflowValid) {
    
    this.workflowValid = workflowValid;
    return this;
  }

   /**
   * Get workflowValid
   * @return workflowValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWorkflowValid() {
    return workflowValid;
  }


  public void setWorkflowValid(Boolean workflowValid) {
    this.workflowValid = workflowValid;
  }


  public ValidateWorkflowResponse invalidActionIds(List<String> invalidActionIds) {
    
    this.invalidActionIds = invalidActionIds;
    return this;
  }

  public ValidateWorkflowResponse addInvalidActionIdsItem(String invalidActionIdsItem) {
    if (this.invalidActionIds == null) {
      this.invalidActionIds = new ArrayList<>();
    }
    this.invalidActionIds.add(invalidActionIdsItem);
    return this;
  }

   /**
   * Get invalidActionIds
   * @return invalidActionIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getInvalidActionIds() {
    return invalidActionIds;
  }


  public void setInvalidActionIds(List<String> invalidActionIds) {
    this.invalidActionIds = invalidActionIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateWorkflowResponse validateWorkflowResponse = (ValidateWorkflowResponse) o;
    return Objects.equals(this.totalActions, validateWorkflowResponse.totalActions) &&
        Objects.equals(this.totalValid, validateWorkflowResponse.totalValid) &&
        Objects.equals(this.workflowValid, validateWorkflowResponse.workflowValid) &&
        Objects.equals(this.invalidActionIds, validateWorkflowResponse.invalidActionIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalActions, totalValid, workflowValid, invalidActionIds);
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
    sb.append("class ValidateWorkflowResponse {\n");
    sb.append("    totalActions: ").append(toIndentedString(totalActions)).append("\n");
    sb.append("    totalValid: ").append(toIndentedString(totalValid)).append("\n");
    sb.append("    workflowValid: ").append(toIndentedString(workflowValid)).append("\n");
    sb.append("    invalidActionIds: ").append(toIndentedString(invalidActionIds)).append("\n");
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

