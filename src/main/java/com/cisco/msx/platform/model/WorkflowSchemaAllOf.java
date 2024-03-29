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
import com.cisco.msx.platform.model.WorkflowAccessMeta;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WorkflowSchemaAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class WorkflowSchemaAllOf {
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

  public WorkflowSchemaAllOf() { 
  }

  public WorkflowSchemaAllOf id(String id) {
    
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


  public WorkflowSchemaAllOf schemaId(String schemaId) {
    
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


  public WorkflowSchemaAllOf name(String name) {
    
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


  public WorkflowSchemaAllOf title(String title) {
    
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


  public WorkflowSchemaAllOf description(String description) {
    
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


  public WorkflowSchemaAllOf type(String type) {
    
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


  public WorkflowSchemaAllOf baseType(String baseType) {
    
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


  public WorkflowSchemaAllOf version(String version) {
    
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


  public WorkflowSchemaAllOf invisible(Boolean invisible) {
    
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


  public WorkflowSchemaAllOf inherits(String inherits) {
    
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


  public WorkflowSchemaAllOf accessMeta(WorkflowAccessMeta accessMeta) {
    
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


  public WorkflowSchemaAllOf variableSchema(Map<String, Object> variableSchema) {
    
    this.variableSchema = variableSchema;
    return this;
  }

  public WorkflowSchemaAllOf putVariableSchemaItem(String key, Object variableSchemaItem) {
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


  public WorkflowSchemaAllOf propertySchema(Map<String, Object> propertySchema) {
    
    this.propertySchema = propertySchema;
    return this;
  }

  public WorkflowSchemaAllOf putPropertySchemaItem(String key, Object propertySchemaItem) {
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


  public WorkflowSchemaAllOf outputSchema(Map<String, Object> outputSchema) {
    
    this.outputSchema = outputSchema;
    return this;
  }

  public WorkflowSchemaAllOf putOutputSchemaItem(String key, Object outputSchemaItem) {
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


  public WorkflowSchemaAllOf viewConfig(Map<String, Object> viewConfig) {
    
    this.viewConfig = viewConfig;
    return this;
  }

  public WorkflowSchemaAllOf putViewConfigItem(String key, Object viewConfigItem) {
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


  public WorkflowSchemaAllOf attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public WorkflowSchemaAllOf putAttributesItem(String key, Object attributesItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowSchemaAllOf workflowSchemaAllOf = (WorkflowSchemaAllOf) o;
    return Objects.equals(this.id, workflowSchemaAllOf.id) &&
        Objects.equals(this.schemaId, workflowSchemaAllOf.schemaId) &&
        Objects.equals(this.name, workflowSchemaAllOf.name) &&
        Objects.equals(this.title, workflowSchemaAllOf.title) &&
        Objects.equals(this.description, workflowSchemaAllOf.description) &&
        Objects.equals(this.type, workflowSchemaAllOf.type) &&
        Objects.equals(this.baseType, workflowSchemaAllOf.baseType) &&
        Objects.equals(this.version, workflowSchemaAllOf.version) &&
        Objects.equals(this.invisible, workflowSchemaAllOf.invisible) &&
        Objects.equals(this.inherits, workflowSchemaAllOf.inherits) &&
        Objects.equals(this.accessMeta, workflowSchemaAllOf.accessMeta) &&
        Objects.equals(this.variableSchema, workflowSchemaAllOf.variableSchema) &&
        Objects.equals(this.propertySchema, workflowSchemaAllOf.propertySchema) &&
        Objects.equals(this.outputSchema, workflowSchemaAllOf.outputSchema) &&
        Objects.equals(this.viewConfig, workflowSchemaAllOf.viewConfig) &&
        Objects.equals(this.attributes, workflowSchemaAllOf.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemaId, name, title, description, type, baseType, version, invisible, inherits, accessMeta, variableSchema, propertySchema, outputSchema, viewConfig, attributes);
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
    sb.append("class WorkflowSchemaAllOf {\n");
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

