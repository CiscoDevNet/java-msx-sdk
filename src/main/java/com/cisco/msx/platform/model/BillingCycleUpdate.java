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
 * BillingCycleUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class BillingCycleUpdate {
  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private UUID eventId;

  public static final String SERIALIZED_NAME_LAST_BILLED_ON = "lastBilledOn";
  @SerializedName(SERIALIZED_NAME_LAST_BILLED_ON)
  private String lastBilledOn;

  public static final String SERIALIZED_NAME_NEXT_BILLED_ON = "nextBilledOn";
  @SerializedName(SERIALIZED_NAME_NEXT_BILLED_ON)
  private String nextBilledOn;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private UUID tenantId;


  public BillingCycleUpdate eventId(UUID eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getEventId() {
    return eventId;
  }


  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }


  public BillingCycleUpdate lastBilledOn(String lastBilledOn) {
    
    this.lastBilledOn = lastBilledOn;
    return this;
  }

   /**
   * Get lastBilledOn
   * @return lastBilledOn
  **/
  @ApiModelProperty(example = "2020-09-18T18:37:33.810Z", required = true, value = "")

  public String getLastBilledOn() {
    return lastBilledOn;
  }


  public void setLastBilledOn(String lastBilledOn) {
    this.lastBilledOn = lastBilledOn;
  }


  public BillingCycleUpdate nextBilledOn(String nextBilledOn) {
    
    this.nextBilledOn = nextBilledOn;
    return this;
  }

   /**
   * Get nextBilledOn
   * @return nextBilledOn
  **/
  @ApiModelProperty(example = "2020-09-18T18:37:33.810Z", required = true, value = "")

  public String getNextBilledOn() {
    return nextBilledOn;
  }


  public void setNextBilledOn(String nextBilledOn) {
    this.nextBilledOn = nextBilledOn;
  }


  public BillingCycleUpdate tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getTenantId() {
    return tenantId;
  }


  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCycleUpdate billingCycleUpdate = (BillingCycleUpdate) o;
    return Objects.equals(this.eventId, billingCycleUpdate.eventId) &&
        Objects.equals(this.lastBilledOn, billingCycleUpdate.lastBilledOn) &&
        Objects.equals(this.nextBilledOn, billingCycleUpdate.nextBilledOn) &&
        Objects.equals(this.tenantId, billingCycleUpdate.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, lastBilledOn, nextBilledOn, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCycleUpdate {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    lastBilledOn: ").append(toIndentedString(lastBilledOn)).append("\n");
    sb.append("    nextBilledOn: ").append(toIndentedString(nextBilledOn)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

