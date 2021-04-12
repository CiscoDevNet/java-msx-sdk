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
import com.cisco.msx.platform.model.WorkflowActionBlock;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T15:11:34.208390-04:00[America/New_York]")
public class WorkflowAction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflow_id";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private String workflowId;

  public static final String SERIALIZED_NAME_DEFINITION_ID = "definition_id";
  @SerializedName(SERIALIZED_NAME_DEFINITION_ID)
  private String definitionId;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_ADAPTER_ID = "adapter_id";
  @SerializedName(SERIALIZED_NAME_ADAPTER_ID)
  private String adapterId;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "unique_name";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BASE_TYPE = "base_type";
  @SerializedName(SERIALIZED_NAME_BASE_TYPE)
  private String baseType;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_STARTED_BY = "started_by";
  @SerializedName(SERIALIZED_NAME_STARTED_BY)
  private String startedBy;

  public static final String SERIALIZED_NAME_BLOCKS = "blocks";
  @SerializedName(SERIALIZED_NAME_BLOCKS)
  private List<WorkflowActionBlock> blocks = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Map<String, Object> status = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private Map<String, Object> output = null;

  public static final String SERIALIZED_NAME_STARTED_ON = "started_on";
  @SerializedName(SERIALIZED_NAME_STARTED_ON)
  private String startedOn;

  public static final String SERIALIZED_NAME_ENDED_ON = "ended_on";
  @SerializedName(SERIALIZED_NAME_ENDED_ON)
  private String endedOn;


  public WorkflowAction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WorkflowAction workflowId(String workflowId) {
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }


  public WorkflowAction definitionId(String definitionId) {
    
    this.definitionId = definitionId;
    return this;
  }

   /**
   * Get definitionId
   * @return definitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefinitionId() {
    return definitionId;
  }


  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }


  public WorkflowAction schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * Get schemaId
   * @return schemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public WorkflowAction adapterId(String adapterId) {
    
    this.adapterId = adapterId;
    return this;
  }

   /**
   * Get adapterId
   * @return adapterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdapterId() {
    return adapterId;
  }


  public void setAdapterId(String adapterId) {
    this.adapterId = adapterId;
  }


  public WorkflowAction uniqueName(String uniqueName) {
    
    this.uniqueName = uniqueName;
    return this;
  }

   /**
   * Get uniqueName
   * @return uniqueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueName() {
    return uniqueName;
  }


  public void setUniqueName(String uniqueName) {
    this.uniqueName = uniqueName;
  }


  public WorkflowAction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowAction title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public WorkflowAction type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public WorkflowAction baseType(String baseType) {
    
    this.baseType = baseType;
    return this;
  }

   /**
   * Get baseType
   * @return baseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseType() {
    return baseType;
  }


  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }


  public WorkflowAction properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public WorkflowAction putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }


  public WorkflowAction objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public WorkflowAction startedBy(String startedBy) {
    
    this.startedBy = startedBy;
    return this;
  }

   /**
   * Get startedBy
   * @return startedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedBy() {
    return startedBy;
  }


  public void setStartedBy(String startedBy) {
    this.startedBy = startedBy;
  }


  public WorkflowAction blocks(List<WorkflowActionBlock> blocks) {
    
    this.blocks = blocks;
    return this;
  }

  public WorkflowAction addBlocksItem(WorkflowActionBlock blocksItem) {
    if (this.blocks == null) {
      this.blocks = new ArrayList<>();
    }
    this.blocks.add(blocksItem);
    return this;
  }

   /**
   * Get blocks
   * @return blocks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowActionBlock> getBlocks() {
    return blocks;
  }


  public void setBlocks(List<WorkflowActionBlock> blocks) {
    this.blocks = blocks;
  }


  public WorkflowAction status(Map<String, Object> status) {
    
    this.status = status;
    return this;
  }

  public WorkflowAction putStatusItem(String key, Object statusItem) {
    if (this.status == null) {
      this.status = new HashMap<>();
    }
    this.status.put(key, statusItem);
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getStatus() {
    return status;
  }


  public void setStatus(Map<String, Object> status) {
    this.status = status;
  }


  public WorkflowAction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WorkflowAction output(Map<String, Object> output) {
    
    this.output = output;
    return this;
  }

  public WorkflowAction putOutputItem(String key, Object outputItem) {
    if (this.output == null) {
      this.output = new HashMap<>();
    }
    this.output.put(key, outputItem);
    return this;
  }

   /**
   * Get output
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getOutput() {
    return output;
  }


  public void setOutput(Map<String, Object> output) {
    this.output = output;
  }


  public WorkflowAction startedOn(String startedOn) {
    
    this.startedOn = startedOn;
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartedOn() {
    return startedOn;
  }


  public void setStartedOn(String startedOn) {
    this.startedOn = startedOn;
  }


  public WorkflowAction endedOn(String endedOn) {
    
    this.endedOn = endedOn;
    return this;
  }

   /**
   * Get endedOn
   * @return endedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndedOn() {
    return endedOn;
  }


  public void setEndedOn(String endedOn) {
    this.endedOn = endedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowAction workflowAction = (WorkflowAction) o;
    return Objects.equals(this.id, workflowAction.id) &&
        Objects.equals(this.workflowId, workflowAction.workflowId) &&
        Objects.equals(this.definitionId, workflowAction.definitionId) &&
        Objects.equals(this.schemaId, workflowAction.schemaId) &&
        Objects.equals(this.adapterId, workflowAction.adapterId) &&
        Objects.equals(this.uniqueName, workflowAction.uniqueName) &&
        Objects.equals(this.name, workflowAction.name) &&
        Objects.equals(this.title, workflowAction.title) &&
        Objects.equals(this.type, workflowAction.type) &&
        Objects.equals(this.baseType, workflowAction.baseType) &&
        Objects.equals(this.properties, workflowAction.properties) &&
        Objects.equals(this.objectType, workflowAction.objectType) &&
        Objects.equals(this.startedBy, workflowAction.startedBy) &&
        Objects.equals(this.blocks, workflowAction.blocks) &&
        Objects.equals(this.status, workflowAction.status) &&
        Objects.equals(this.description, workflowAction.description) &&
        Objects.equals(this.output, workflowAction.output) &&
        Objects.equals(this.startedOn, workflowAction.startedOn) &&
        Objects.equals(this.endedOn, workflowAction.endedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workflowId, definitionId, schemaId, adapterId, uniqueName, name, title, type, baseType, properties, objectType, startedBy, blocks, status, description, output, startedOn, endedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowAction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    adapterId: ").append(toIndentedString(adapterId)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    startedBy: ").append(toIndentedString(startedBy)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    endedOn: ").append(toIndentedString(endedOn)).append("\n");
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

