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
import com.cisco.msx.platform.model.WorkflowAction;
import com.cisco.msx.platform.model.WorkflowMetadata;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WorkflowAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T15:11:34.208390-04:00[America/New_York]")
public class WorkflowAllOf {
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

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BASE_TYPE = "base_type";
  @SerializedName(SERIALIZED_NAME_BASE_TYPE)
  private String baseType;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_WORKFLOW_VALID = "workflow_valid";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_VALID)
  private Boolean workflowValid;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private WorkflowMetadata metadata;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Map<String, Object> status = null;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private List<WorkflowVariable> variables = null;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<WorkflowAction> actions = null;


  public WorkflowAllOf id(String id) {
    
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


  public WorkflowAllOf schemaId(String schemaId) {
    
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


  public WorkflowAllOf name(String name) {
    
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


  public WorkflowAllOf title(String title) {
    
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


  public WorkflowAllOf type(String type) {
    
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


  public WorkflowAllOf baseType(String baseType) {
    
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


  public WorkflowAllOf objectType(String objectType) {
    
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


  public WorkflowAllOf properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public WorkflowAllOf putPropertiesItem(String key, Object propertiesItem) {
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


  public WorkflowAllOf valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public WorkflowAllOf workflowValid(Boolean workflowValid) {
    
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


  public WorkflowAllOf categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public WorkflowAllOf addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public WorkflowAllOf metadata(WorkflowMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(WorkflowMetadata metadata) {
    this.metadata = metadata;
  }


  public WorkflowAllOf status(Map<String, Object> status) {
    
    this.status = status;
    return this;
  }

  public WorkflowAllOf putStatusItem(String key, Object statusItem) {
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


  public WorkflowAllOf permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public WorkflowAllOf addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public WorkflowAllOf variables(List<WorkflowVariable> variables) {
    
    this.variables = variables;
    return this;
  }

  public WorkflowAllOf addVariablesItem(WorkflowVariable variablesItem) {
    if (this.variables == null) {
      this.variables = new ArrayList<>();
    }
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowVariable> getVariables() {
    return variables;
  }


  public void setVariables(List<WorkflowVariable> variables) {
    this.variables = variables;
  }


  public WorkflowAllOf actions(List<WorkflowAction> actions) {
    
    this.actions = actions;
    return this;
  }

  public WorkflowAllOf addActionsItem(WorkflowAction actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowAction> getActions() {
    return actions;
  }


  public void setActions(List<WorkflowAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowAllOf workflowAllOf = (WorkflowAllOf) o;
    return Objects.equals(this.id, workflowAllOf.id) &&
        Objects.equals(this.schemaId, workflowAllOf.schemaId) &&
        Objects.equals(this.name, workflowAllOf.name) &&
        Objects.equals(this.title, workflowAllOf.title) &&
        Objects.equals(this.type, workflowAllOf.type) &&
        Objects.equals(this.baseType, workflowAllOf.baseType) &&
        Objects.equals(this.objectType, workflowAllOf.objectType) &&
        Objects.equals(this.properties, workflowAllOf.properties) &&
        Objects.equals(this.valid, workflowAllOf.valid) &&
        Objects.equals(this.workflowValid, workflowAllOf.workflowValid) &&
        Objects.equals(this.categories, workflowAllOf.categories) &&
        Objects.equals(this.metadata, workflowAllOf.metadata) &&
        Objects.equals(this.status, workflowAllOf.status) &&
        Objects.equals(this.permissions, workflowAllOf.permissions) &&
        Objects.equals(this.variables, workflowAllOf.variables) &&
        Objects.equals(this.actions, workflowAllOf.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemaId, name, title, type, baseType, objectType, properties, valid, workflowValid, categories, metadata, status, permissions, variables, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    workflowValid: ").append(toIndentedString(workflowValid)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

