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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * BillingCycleProcessAccepted
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class BillingCycleProcessAccepted {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NEXT_BILLED_ON = "nextBilledOn";
  @SerializedName(SERIALIZED_NAME_NEXT_BILLED_ON)
  private OffsetDateTime nextBilledOn;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;


  public BillingCycleProcessAccepted id(UUID id) {
    
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


  public BillingCycleProcessAccepted nextBilledOn(OffsetDateTime nextBilledOn) {
    
    this.nextBilledOn = nextBilledOn;
    return this;
  }

   /**
   * Get nextBilledOn
   * @return nextBilledOn
  **/
  @ApiModelProperty(example = "2020-09-18T18:37:33.810Z", required = true, value = "")

  public OffsetDateTime getNextBilledOn() {
    return nextBilledOn;
  }


  public void setNextBilledOn(OffsetDateTime nextBilledOn) {
    this.nextBilledOn = nextBilledOn;
  }


  public BillingCycleProcessAccepted createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-09-18T18:37:33.810Z", value = "")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCycleProcessAccepted billingCycleProcessAccepted = (BillingCycleProcessAccepted) o;
    return Objects.equals(this.id, billingCycleProcessAccepted.id) &&
        Objects.equals(this.nextBilledOn, billingCycleProcessAccepted.nextBilledOn) &&
        Objects.equals(this.createdOn, billingCycleProcessAccepted.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nextBilledOn, createdOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCycleProcessAccepted {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nextBilledOn: ").append(toIndentedString(nextBilledOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

