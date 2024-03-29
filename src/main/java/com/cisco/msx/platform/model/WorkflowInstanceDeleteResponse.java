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
 * WorkflowInstanceDeleteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class WorkflowInstanceDeleteResponse {
  public static final String SERIALIZED_NAME_DELETED_CHILD_WORKFLOW_INSTANCE_IDS = "deleted_child_workflow_instance_ids";
  @SerializedName(SERIALIZED_NAME_DELETED_CHILD_WORKFLOW_INSTANCE_IDS)
  private List<String> deletedChildWorkflowInstanceIds = null;

  public WorkflowInstanceDeleteResponse() { 
  }

  public WorkflowInstanceDeleteResponse deletedChildWorkflowInstanceIds(List<String> deletedChildWorkflowInstanceIds) {
    
    this.deletedChildWorkflowInstanceIds = deletedChildWorkflowInstanceIds;
    return this;
  }

  public WorkflowInstanceDeleteResponse addDeletedChildWorkflowInstanceIdsItem(String deletedChildWorkflowInstanceIdsItem) {
    if (this.deletedChildWorkflowInstanceIds == null) {
      this.deletedChildWorkflowInstanceIds = new ArrayList<>();
    }
    this.deletedChildWorkflowInstanceIds.add(deletedChildWorkflowInstanceIdsItem);
    return this;
  }

   /**
   * Get deletedChildWorkflowInstanceIds
   * @return deletedChildWorkflowInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDeletedChildWorkflowInstanceIds() {
    return deletedChildWorkflowInstanceIds;
  }


  public void setDeletedChildWorkflowInstanceIds(List<String> deletedChildWorkflowInstanceIds) {
    this.deletedChildWorkflowInstanceIds = deletedChildWorkflowInstanceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowInstanceDeleteResponse workflowInstanceDeleteResponse = (WorkflowInstanceDeleteResponse) o;
    return Objects.equals(this.deletedChildWorkflowInstanceIds, workflowInstanceDeleteResponse.deletedChildWorkflowInstanceIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedChildWorkflowInstanceIds);
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
    sb.append("class WorkflowInstanceDeleteResponse {\n");
    sb.append("    deletedChildWorkflowInstanceIds: ").append(toIndentedString(deletedChildWorkflowInstanceIds)).append("\n");
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

