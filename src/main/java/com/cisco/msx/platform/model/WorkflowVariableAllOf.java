/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 1.0.1
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowVariableAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T14:27:03.027365-04:00[America/New_York]")
public class WorkflowVariableAllOf {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BASE_TYPE = "base_type";
  @SerializedName(SERIALIZED_NAME_BASE_TYPE)
  private String baseType;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;


  public WorkflowVariableAllOf id(String id) {
    
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


  public WorkflowVariableAllOf type(String type) {
    
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


  public WorkflowVariableAllOf baseType(String baseType) {
    
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


  public WorkflowVariableAllOf schemaId(String schemaId) {
    
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


  public WorkflowVariableAllOf objectType(String objectType) {
    
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


  public WorkflowVariableAllOf properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public WorkflowVariableAllOf putPropertiesItem(String key, Object propertiesItem) {
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


  public WorkflowVariableAllOf dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public WorkflowVariableAllOf scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowVariableAllOf workflowVariableAllOf = (WorkflowVariableAllOf) o;
    return Objects.equals(this.id, workflowVariableAllOf.id) &&
        Objects.equals(this.type, workflowVariableAllOf.type) &&
        Objects.equals(this.baseType, workflowVariableAllOf.baseType) &&
        Objects.equals(this.schemaId, workflowVariableAllOf.schemaId) &&
        Objects.equals(this.objectType, workflowVariableAllOf.objectType) &&
        Objects.equals(this.properties, workflowVariableAllOf.properties) &&
        Objects.equals(this.dataType, workflowVariableAllOf.dataType) &&
        Objects.equals(this.scope, workflowVariableAllOf.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, baseType, schemaId, objectType, properties, dataType, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowVariableAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

