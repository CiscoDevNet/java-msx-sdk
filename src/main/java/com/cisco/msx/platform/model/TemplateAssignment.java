/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.model;

import java.util.Objects;
import java.util.Arrays;
import com.cisco.msx.platform.model.TemplateAssignmentAllOf;
import com.cisco.msx.platform.model.TemplateStatus;
import com.cisco.msx.platform.model.TemplateStatusMeta;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * TemplateAssignment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class TemplateAssignment {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "templateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;

  public static final String SERIALIZED_NAME_ASSIGNED_TENANT_ID = "assignedTenantId";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_TENANT_ID)
  private UUID assignedTenantId;

  public static final String SERIALIZED_NAME_INHERITABLE = "inheritable";
  @SerializedName(SERIALIZED_NAME_INHERITABLE)
  private Boolean inheritable;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TemplateStatus status;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "statusDetails";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private String statusDetails;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private UUID createdBy;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private UUID modifiedBy;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }




   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTemplateId() {
    return templateId;
  }




   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplateName() {
    return templateName;
  }




   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTenantId() {
    return tenantId;
  }




   /**
   * Get assignedTenantId
   * @return assignedTenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAssignedTenantId() {
    return assignedTenantId;
  }




   /**
   * Get inheritable
   * @return inheritable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInheritable() {
    return inheritable;
  }




  public TemplateAssignment status(TemplateStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateStatus getStatus() {
    return status;
  }


  public void setStatus(TemplateStatus status) {
    this.status = status;
  }


   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusDetails() {
    return statusDetails;
  }




   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }




   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedBy() {
    return createdBy;
  }




   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }




   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getModifiedBy() {
    return modifiedBy;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateAssignment templateAssignment = (TemplateAssignment) o;
    return Objects.equals(this.id, templateAssignment.id) &&
        Objects.equals(this.templateId, templateAssignment.templateId) &&
        Objects.equals(this.templateName, templateAssignment.templateName) &&
        Objects.equals(this.tenantId, templateAssignment.tenantId) &&
        Objects.equals(this.assignedTenantId, templateAssignment.assignedTenantId) &&
        Objects.equals(this.inheritable, templateAssignment.inheritable) &&
        Objects.equals(this.status, templateAssignment.status) &&
        Objects.equals(this.statusDetails, templateAssignment.statusDetails) &&
        Objects.equals(this.createdOn, templateAssignment.createdOn) &&
        Objects.equals(this.createdBy, templateAssignment.createdBy) &&
        Objects.equals(this.modifiedOn, templateAssignment.modifiedOn) &&
        Objects.equals(this.modifiedBy, templateAssignment.modifiedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, templateId, templateName, tenantId, assignedTenantId, inheritable, status, statusDetails, createdOn, createdBy, modifiedOn, modifiedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateAssignment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    assignedTenantId: ").append(toIndentedString(assignedTenantId)).append("\n");
    sb.append("    inheritable: ").append(toIndentedString(inheritable)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

