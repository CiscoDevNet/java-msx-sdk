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
import com.cisco.msx.platform.model.WorkflowMetadataGitInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WorkflowMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class WorkflowMetadata {
  public static final String SERIALIZED_NAME_GIT_INFO = "git_info";
  @SerializedName(SERIALIZED_NAME_GIT_INFO)
  private WorkflowMetadataGitInfo gitInfo;

  public WorkflowMetadata() { 
  }

  public WorkflowMetadata gitInfo(WorkflowMetadataGitInfo gitInfo) {
    
    this.gitInfo = gitInfo;
    return this;
  }

   /**
   * Get gitInfo
   * @return gitInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowMetadataGitInfo getGitInfo() {
    return gitInfo;
  }


  public void setGitInfo(WorkflowMetadataGitInfo gitInfo) {
    this.gitInfo = gitInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowMetadata workflowMetadata = (WorkflowMetadata) o;
    return Objects.equals(this.gitInfo, workflowMetadata.gitInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowMetadata {\n");
    sb.append("    gitInfo: ").append(toIndentedString(gitInfo)).append("\n");
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

