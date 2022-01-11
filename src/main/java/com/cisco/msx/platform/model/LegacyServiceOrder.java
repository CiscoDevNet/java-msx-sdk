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
import com.cisco.msx.platform.model.LegacyScheduleConfig;
import com.cisco.msx.platform.model.LegacyServiceOrderDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * LegacyServiceOrder
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T20:44:53.751167200-05:00[America/Toronto]")
public class LegacyServiceOrder {
  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SERVICE_TYPE = "serviceType";
  @SerializedName(SERIALIZED_NAME_SERVICE_TYPE)
  private String serviceType;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private LegacyScheduleConfig schedule;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private LegacyServiceOrderDetail payload;

  public static final String SERIALIZED_NAME_TRANSACTION_U_U_I_D = "transactionUUID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_U_U_I_D)
  private UUID transactionUUID;


  public LegacyServiceOrder messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public LegacyServiceOrder type(String type) {
    
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


  public LegacyServiceOrder serviceType(String serviceType) {
    
    this.serviceType = serviceType;
    return this;
  }

   /**
   * Get serviceType
   * @return serviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServiceType() {
    return serviceType;
  }


  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }


  public LegacyServiceOrder action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public LegacyServiceOrder schedule(LegacyScheduleConfig schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LegacyScheduleConfig getSchedule() {
    return schedule;
  }


  public void setSchedule(LegacyScheduleConfig schedule) {
    this.schedule = schedule;
  }


  public LegacyServiceOrder payload(LegacyServiceOrderDetail payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LegacyServiceOrderDetail getPayload() {
    return payload;
  }


  public void setPayload(LegacyServiceOrderDetail payload) {
    this.payload = payload;
  }


  public LegacyServiceOrder transactionUUID(UUID transactionUUID) {
    
    this.transactionUUID = transactionUUID;
    return this;
  }

   /**
   * Get transactionUUID
   * @return transactionUUID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTransactionUUID() {
    return transactionUUID;
  }


  public void setTransactionUUID(UUID transactionUUID) {
    this.transactionUUID = transactionUUID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyServiceOrder legacyServiceOrder = (LegacyServiceOrder) o;
    return Objects.equals(this.messageId, legacyServiceOrder.messageId) &&
        Objects.equals(this.type, legacyServiceOrder.type) &&
        Objects.equals(this.serviceType, legacyServiceOrder.serviceType) &&
        Objects.equals(this.action, legacyServiceOrder.action) &&
        Objects.equals(this.schedule, legacyServiceOrder.schedule) &&
        Objects.equals(this.payload, legacyServiceOrder.payload) &&
        Objects.equals(this.transactionUUID, legacyServiceOrder.transactionUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, type, serviceType, action, schedule, payload, transactionUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyServiceOrder {\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    transactionUUID: ").append(toIndentedString(transactionUUID)).append("\n");
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

