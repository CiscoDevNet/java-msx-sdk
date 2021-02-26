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
import com.cisco.msx.platform.model.NameValue;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * DeviceTemplateHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-01T21:36:18.317728-05:00[America/New_York]")
public class DeviceTemplateHistory {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "templateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private UUID templateId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private UUID userId;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    APPLIED("Applied"),
    
    APPLYING("Applying"),
    
    APPLY_FAILED("Apply Failed"),
    
    DETACHED("Detached"),
    
    DETACHING("Detaching"),
    
    DETACH_FAILED("Detach Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_ERROR = "statusError";
  @SerializedName(SERIALIZED_NAME_STATUS_ERROR)
  private String statusError;

  public static final String SERIALIZED_NAME_TEMPLATE_PARAMS = "templateParams";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_PARAMS)
  private List<NameValue> templateParams = null;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;


  public DeviceTemplateHistory id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public DeviceTemplateHistory deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public DeviceTemplateHistory templateId(UUID templateId) {
    
    this.templateId = templateId;
    return this;
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


  public void setTemplateId(UUID templateId) {
    this.templateId = templateId;
  }


  public DeviceTemplateHistory userId(UUID userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getUserId() {
    return userId;
  }


  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public DeviceTemplateHistory status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public DeviceTemplateHistory statusError(String statusError) {
    
    this.statusError = statusError;
    return this;
  }

   /**
   * Get statusError
   * @return statusError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusError() {
    return statusError;
  }


  public void setStatusError(String statusError) {
    this.statusError = statusError;
  }


  public DeviceTemplateHistory templateParams(List<NameValue> templateParams) {
    
    this.templateParams = templateParams;
    return this;
  }

  public DeviceTemplateHistory addTemplateParamsItem(NameValue templateParamsItem) {
    if (this.templateParams == null) {
      this.templateParams = new ArrayList<>();
    }
    this.templateParams.add(templateParamsItem);
    return this;
  }

   /**
   * Get templateParams
   * @return templateParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NameValue> getTemplateParams() {
    return templateParams;
  }


  public void setTemplateParams(List<NameValue> templateParams) {
    this.templateParams = templateParams;
  }


  public DeviceTemplateHistory modifiedOn(OffsetDateTime modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
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


  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceTemplateHistory deviceTemplateHistory = (DeviceTemplateHistory) o;
    return Objects.equals(this.id, deviceTemplateHistory.id) &&
        Objects.equals(this.deviceId, deviceTemplateHistory.deviceId) &&
        Objects.equals(this.templateId, deviceTemplateHistory.templateId) &&
        Objects.equals(this.userId, deviceTemplateHistory.userId) &&
        Objects.equals(this.status, deviceTemplateHistory.status) &&
        Objects.equals(this.statusError, deviceTemplateHistory.statusError) &&
        Objects.equals(this.templateParams, deviceTemplateHistory.templateParams) &&
        Objects.equals(this.modifiedOn, deviceTemplateHistory.modifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, deviceId, templateId, userId, status, statusError, templateParams, modifiedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceTemplateHistory {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusError: ").append(toIndentedString(statusError)).append("\n");
    sb.append("    templateParams: ").append(toIndentedString(templateParams)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
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

