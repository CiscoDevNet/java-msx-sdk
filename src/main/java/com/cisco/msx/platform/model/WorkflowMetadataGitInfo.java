/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.9
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
 * WorkflowMetadataGitInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T20:44:53.751167200-05:00[America/Toronto]")
public class WorkflowMetadataGitInfo {
  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_COMMIT_HASH = "commit_hash";
  @SerializedName(SERIALIZED_NAME_COMMIT_HASH)
  private String commitHash;

  public static final String SERIALIZED_NAME_COMMITTED_BY = "committed_by";
  @SerializedName(SERIALIZED_NAME_COMMITTED_BY)
  private String committedBy;

  public static final String SERIALIZED_NAME_COMMITED_ON = "commited_on";
  @SerializedName(SERIALIZED_NAME_COMMITED_ON)
  private String commitedOn;

  public static final String SERIALIZED_NAME_COMMITTED_ON = "committed_on";
  @SerializedName(SERIALIZED_NAME_COMMITTED_ON)
  private String committedOn;

  public static final String SERIALIZED_NAME_COMMIT_MESSAGE = "commit_message";
  @SerializedName(SERIALIZED_NAME_COMMIT_MESSAGE)
  private String commitMessage;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;


  public WorkflowMetadataGitInfo targetId(String targetId) {
    
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


  public WorkflowMetadataGitInfo commitHash(String commitHash) {
    
    this.commitHash = commitHash;
    return this;
  }

   /**
   * Get commitHash
   * @return commitHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommitHash() {
    return commitHash;
  }


  public void setCommitHash(String commitHash) {
    this.commitHash = commitHash;
  }


  public WorkflowMetadataGitInfo committedBy(String committedBy) {
    
    this.committedBy = committedBy;
    return this;
  }

   /**
   * Get committedBy
   * @return committedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommittedBy() {
    return committedBy;
  }


  public void setCommittedBy(String committedBy) {
    this.committedBy = committedBy;
  }


  public WorkflowMetadataGitInfo commitedOn(String commitedOn) {
    
    this.commitedOn = commitedOn;
    return this;
  }

   /**
   * Get commitedOn
   * @return commitedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommitedOn() {
    return commitedOn;
  }


  public void setCommitedOn(String commitedOn) {
    this.commitedOn = commitedOn;
  }


  public WorkflowMetadataGitInfo committedOn(String committedOn) {
    
    this.committedOn = committedOn;
    return this;
  }

   /**
   * Get committedOn
   * @return committedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommittedOn() {
    return committedOn;
  }


  public void setCommittedOn(String committedOn) {
    this.committedOn = committedOn;
  }


  public WorkflowMetadataGitInfo commitMessage(String commitMessage) {
    
    this.commitMessage = commitMessage;
    return this;
  }

   /**
   * Get commitMessage
   * @return commitMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommitMessage() {
    return commitMessage;
  }


  public void setCommitMessage(String commitMessage) {
    this.commitMessage = commitMessage;
  }


  public WorkflowMetadataGitInfo fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowMetadataGitInfo workflowMetadataGitInfo = (WorkflowMetadataGitInfo) o;
    return Objects.equals(this.targetId, workflowMetadataGitInfo.targetId) &&
        Objects.equals(this.commitHash, workflowMetadataGitInfo.commitHash) &&
        Objects.equals(this.committedBy, workflowMetadataGitInfo.committedBy) &&
        Objects.equals(this.commitedOn, workflowMetadataGitInfo.commitedOn) &&
        Objects.equals(this.committedOn, workflowMetadataGitInfo.committedOn) &&
        Objects.equals(this.commitMessage, workflowMetadataGitInfo.commitMessage) &&
        Objects.equals(this.fileName, workflowMetadataGitInfo.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, commitHash, committedBy, commitedOn, committedOn, commitMessage, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowMetadataGitInfo {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    commitHash: ").append(toIndentedString(commitHash)).append("\n");
    sb.append("    committedBy: ").append(toIndentedString(committedBy)).append("\n");
    sb.append("    commitedOn: ").append(toIndentedString(commitedOn)).append("\n");
    sb.append("    committedOn: ").append(toIndentedString(committedOn)).append("\n");
    sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

