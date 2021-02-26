/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: somecontact@cisco.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.WorkflowAccessMeta;
import com.cisco.msx.platform.model.WorkflowFooter;
import com.cisco.msx.platform.model.WorkflowSchemaAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T21:36:18.317728-05:00[America/New_York]")
public class WorkflowSchema {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BASE_TYPE = "base_type";
  @SerializedName(SERIALIZED_NAME_BASE_TYPE)
  private String baseType;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_INVISIBLE = "invisible";
  @SerializedName(SERIALIZED_NAME_INVISIBLE)
  private Boolean invisible;

  public static final String SERIALIZED_NAME_INHERITS = "inherits";
  @SerializedName(SERIALIZED_NAME_INHERITS)
  private String inherits;

  public static final String SERIALIZED_NAME_ACCESS_META = "access_meta";
  @SerializedName(SERIALIZED_NAME_ACCESS_META)
  private WorkflowAccessMeta accessMeta;

  public static final String SERIALIZED_NAME_VARIABLE_SCHEMA = "variable_schema";
  @SerializedName(SERIALIZED_NAME_VARIABLE_SCHEMA)
  private Map<String, Object> variableSchema = null;

  public static final String SERIALIZED_NAME_PROPERTY_SCHEMA = "property_schema";
  @SerializedName(SERIALIZED_NAME_PROPERTY_SCHEMA)
  private Map<String, Object> propertySchema = null;

  public static final String SERIALIZED_NAME_OUTPUT_SCHEMA = "output_schema";
  @SerializedName(SERIALIZED_NAME_OUTPUT_SCHEMA)
  private Map<String, Object> outputSchema = null;

  public static final String SERIALIZED_NAME_VIEW_CONFIG = "view_config";
  @SerializedName(SERIALIZED_NAME_VIEW_CONFIG)
  private Map<String, Object> viewConfig = null;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_CREATED_ON = "created_on";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updated_on";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private String updatedOn;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updated_by";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "unique_name";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;


  public WorkflowSchema id(String id) {
    
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


  public WorkflowSchema schemaId(String schemaId) {
    
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


  public WorkflowSchema name(String name) {
    
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


  public WorkflowSchema title(String title) {
    
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


  public WorkflowSchema description(String description) {
    
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


  public WorkflowSchema type(String type) {
    
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


  public WorkflowSchema baseType(String baseType) {
    
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


  public WorkflowSchema version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public WorkflowSchema invisible(Boolean invisible) {
    
    this.invisible = invisible;
    return this;
  }

   /**
   * Get invisible
   * @return invisible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInvisible() {
    return invisible;
  }


  public void setInvisible(Boolean invisible) {
    this.invisible = invisible;
  }


  public WorkflowSchema inherits(String inherits) {
    
    this.inherits = inherits;
    return this;
  }

   /**
   * Get inherits
   * @return inherits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInherits() {
    return inherits;
  }


  public void setInherits(String inherits) {
    this.inherits = inherits;
  }


  public WorkflowSchema accessMeta(WorkflowAccessMeta accessMeta) {
    
    this.accessMeta = accessMeta;
    return this;
  }

   /**
   * Get accessMeta
   * @return accessMeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowAccessMeta getAccessMeta() {
    return accessMeta;
  }


  public void setAccessMeta(WorkflowAccessMeta accessMeta) {
    this.accessMeta = accessMeta;
  }


  public WorkflowSchema variableSchema(Map<String, Object> variableSchema) {
    
    this.variableSchema = variableSchema;
    return this;
  }

  public WorkflowSchema putVariableSchemaItem(String key, Object variableSchemaItem) {
    if (this.variableSchema == null) {
      this.variableSchema = new HashMap<>();
    }
    this.variableSchema.put(key, variableSchemaItem);
    return this;
  }

   /**
   * Get variableSchema
   * @return variableSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getVariableSchema() {
    return variableSchema;
  }


  public void setVariableSchema(Map<String, Object> variableSchema) {
    this.variableSchema = variableSchema;
  }


  public WorkflowSchema propertySchema(Map<String, Object> propertySchema) {
    
    this.propertySchema = propertySchema;
    return this;
  }

  public WorkflowSchema putPropertySchemaItem(String key, Object propertySchemaItem) {
    if (this.propertySchema == null) {
      this.propertySchema = new HashMap<>();
    }
    this.propertySchema.put(key, propertySchemaItem);
    return this;
  }

   /**
   * Get propertySchema
   * @return propertySchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getPropertySchema() {
    return propertySchema;
  }


  public void setPropertySchema(Map<String, Object> propertySchema) {
    this.propertySchema = propertySchema;
  }


  public WorkflowSchema outputSchema(Map<String, Object> outputSchema) {
    
    this.outputSchema = outputSchema;
    return this;
  }

  public WorkflowSchema putOutputSchemaItem(String key, Object outputSchemaItem) {
    if (this.outputSchema == null) {
      this.outputSchema = new HashMap<>();
    }
    this.outputSchema.put(key, outputSchemaItem);
    return this;
  }

   /**
   * Get outputSchema
   * @return outputSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getOutputSchema() {
    return outputSchema;
  }


  public void setOutputSchema(Map<String, Object> outputSchema) {
    this.outputSchema = outputSchema;
  }


  public WorkflowSchema viewConfig(Map<String, Object> viewConfig) {
    
    this.viewConfig = viewConfig;
    return this;
  }

  public WorkflowSchema putViewConfigItem(String key, Object viewConfigItem) {
    if (this.viewConfig == null) {
      this.viewConfig = new HashMap<>();
    }
    this.viewConfig.put(key, viewConfigItem);
    return this;
  }

   /**
   * Get viewConfig
   * @return viewConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getViewConfig() {
    return viewConfig;
  }


  public void setViewConfig(Map<String, Object> viewConfig) {
    this.viewConfig = viewConfig;
  }


  public WorkflowSchema attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public WorkflowSchema putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public WorkflowSchema createdOn(String createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  public WorkflowSchema createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public WorkflowSchema updatedOn(String updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Get updatedOn
   * @return updatedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedOn() {
    return updatedOn;
  }


  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  public WorkflowSchema updatedBy(String updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  public WorkflowSchema owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public WorkflowSchema uniqueName(String uniqueName) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchema workflowSchema = (WorkflowSchema) o;
    return Objects.equals(this.id, workflowSchema.id) &&
        Objects.equals(this.schemaId, workflowSchema.schemaId) &&
        Objects.equals(this.name, workflowSchema.name) &&
        Objects.equals(this.title, workflowSchema.title) &&
        Objects.equals(this.description, workflowSchema.description) &&
        Objects.equals(this.type, workflowSchema.type) &&
        Objects.equals(this.baseType, workflowSchema.baseType) &&
        Objects.equals(this.version, workflowSchema.version) &&
        Objects.equals(this.invisible, workflowSchema.invisible) &&
        Objects.equals(this.inherits, workflowSchema.inherits) &&
        Objects.equals(this.accessMeta, workflowSchema.accessMeta) &&
        Objects.equals(this.variableSchema, workflowSchema.variableSchema) &&
        Objects.equals(this.propertySchema, workflowSchema.propertySchema) &&
        Objects.equals(this.outputSchema, workflowSchema.outputSchema) &&
        Objects.equals(this.viewConfig, workflowSchema.viewConfig) &&
        Objects.equals(this.attributes, workflowSchema.attributes) &&
        Objects.equals(this.createdOn, workflowSchema.createdOn) &&
        Objects.equals(this.createdBy, workflowSchema.createdBy) &&
        Objects.equals(this.updatedOn, workflowSchema.updatedOn) &&
        Objects.equals(this.updatedBy, workflowSchema.updatedBy) &&
        Objects.equals(this.owner, workflowSchema.owner) &&
        Objects.equals(this.uniqueName, workflowSchema.uniqueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemaId, name, title, description, type, baseType, version, invisible, inherits, accessMeta, variableSchema, propertySchema, outputSchema, viewConfig, attributes, createdOn, createdBy, updatedOn, updatedBy, owner, uniqueName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    invisible: ").append(toIndentedString(invisible)).append("\n");
    sb.append("    inherits: ").append(toIndentedString(inherits)).append("\n");
    sb.append("    accessMeta: ").append(toIndentedString(accessMeta)).append("\n");
    sb.append("    variableSchema: ").append(toIndentedString(variableSchema)).append("\n");
    sb.append("    propertySchema: ").append(toIndentedString(propertySchema)).append("\n");
    sb.append("    outputSchema: ").append(toIndentedString(outputSchema)).append("\n");
    sb.append("    viewConfig: ").append(toIndentedString(viewConfig)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
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

