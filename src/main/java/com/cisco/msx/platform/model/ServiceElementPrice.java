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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ServiceElementPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class ServiceElementPrice {
  public static final String SERIALIZED_NAME_ONE_TIME_PRICE = "oneTimePrice";
  @SerializedName(SERIALIZED_NAME_ONE_TIME_PRICE)
  private String oneTimePrice;

  public static final String SERIALIZED_NAME_PERIODIC_PRICE = "periodicPrice";
  @SerializedName(SERIALIZED_NAME_PERIODIC_PRICE)
  private String periodicPrice;

  public static final String SERIALIZED_NAME_TIME_PERIOD = "timePeriod";
  @SerializedName(SERIALIZED_NAME_TIME_PERIOD)
  private String timePeriod;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unitOfMeasure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private String unitOfMeasure;

  public static final String SERIALIZED_NAME_INCLUDED_QUANTITY = "includedQuantity";
  @SerializedName(SERIALIZED_NAME_INCLUDED_QUANTITY)
  private Integer includedQuantity;

  public static final String SERIALIZED_NAME_ADDITIONAL_ONE_TIME_PRICE = "additionalOneTimePrice";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ONE_TIME_PRICE)
  private String additionalOneTimePrice;

  public static final String SERIALIZED_NAME_ADDITIONAL_PERIODIC_PRICE = "additionalPeriodicPrice";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PERIODIC_PRICE)
  private String additionalPeriodicPrice;

  public static final String SERIALIZED_NAME_ADDITIONAL_QUANTITY = "additionalQuantity";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_QUANTITY)
  private Integer additionalQuantity;

  public ServiceElementPrice() { 
  }

  public ServiceElementPrice oneTimePrice(String oneTimePrice) {
    
    this.oneTimePrice = oneTimePrice;
    return this;
  }

   /**
   * Get oneTimePrice
   * @return oneTimePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOneTimePrice() {
    return oneTimePrice;
  }


  public void setOneTimePrice(String oneTimePrice) {
    this.oneTimePrice = oneTimePrice;
  }


  public ServiceElementPrice periodicPrice(String periodicPrice) {
    
    this.periodicPrice = periodicPrice;
    return this;
  }

   /**
   * Get periodicPrice
   * @return periodicPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPeriodicPrice() {
    return periodicPrice;
  }


  public void setPeriodicPrice(String periodicPrice) {
    this.periodicPrice = periodicPrice;
  }


  public ServiceElementPrice timePeriod(String timePeriod) {
    
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * Get timePeriod
   * @return timePeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimePeriod() {
    return timePeriod;
  }


  public void setTimePeriod(String timePeriod) {
    this.timePeriod = timePeriod;
  }


  public ServiceElementPrice unitOfMeasure(String unitOfMeasure) {
    
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Get unitOfMeasure
   * @return unitOfMeasure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }


  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  public ServiceElementPrice includedQuantity(Integer includedQuantity) {
    
    this.includedQuantity = includedQuantity;
    return this;
  }

   /**
   * Get includedQuantity
   * @return includedQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIncludedQuantity() {
    return includedQuantity;
  }


  public void setIncludedQuantity(Integer includedQuantity) {
    this.includedQuantity = includedQuantity;
  }


  public ServiceElementPrice additionalOneTimePrice(String additionalOneTimePrice) {
    
    this.additionalOneTimePrice = additionalOneTimePrice;
    return this;
  }

   /**
   * Get additionalOneTimePrice
   * @return additionalOneTimePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdditionalOneTimePrice() {
    return additionalOneTimePrice;
  }


  public void setAdditionalOneTimePrice(String additionalOneTimePrice) {
    this.additionalOneTimePrice = additionalOneTimePrice;
  }


  public ServiceElementPrice additionalPeriodicPrice(String additionalPeriodicPrice) {
    
    this.additionalPeriodicPrice = additionalPeriodicPrice;
    return this;
  }

   /**
   * Get additionalPeriodicPrice
   * @return additionalPeriodicPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdditionalPeriodicPrice() {
    return additionalPeriodicPrice;
  }


  public void setAdditionalPeriodicPrice(String additionalPeriodicPrice) {
    this.additionalPeriodicPrice = additionalPeriodicPrice;
  }


  public ServiceElementPrice additionalQuantity(Integer additionalQuantity) {
    
    this.additionalQuantity = additionalQuantity;
    return this;
  }

   /**
   * Get additionalQuantity
   * @return additionalQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAdditionalQuantity() {
    return additionalQuantity;
  }


  public void setAdditionalQuantity(Integer additionalQuantity) {
    this.additionalQuantity = additionalQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceElementPrice serviceElementPrice = (ServiceElementPrice) o;
    return Objects.equals(this.oneTimePrice, serviceElementPrice.oneTimePrice) &&
        Objects.equals(this.periodicPrice, serviceElementPrice.periodicPrice) &&
        Objects.equals(this.timePeriod, serviceElementPrice.timePeriod) &&
        Objects.equals(this.unitOfMeasure, serviceElementPrice.unitOfMeasure) &&
        Objects.equals(this.includedQuantity, serviceElementPrice.includedQuantity) &&
        Objects.equals(this.additionalOneTimePrice, serviceElementPrice.additionalOneTimePrice) &&
        Objects.equals(this.additionalPeriodicPrice, serviceElementPrice.additionalPeriodicPrice) &&
        Objects.equals(this.additionalQuantity, serviceElementPrice.additionalQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneTimePrice, periodicPrice, timePeriod, unitOfMeasure, includedQuantity, additionalOneTimePrice, additionalPeriodicPrice, additionalQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceElementPrice {\n");
    sb.append("    oneTimePrice: ").append(toIndentedString(oneTimePrice)).append("\n");
    sb.append("    periodicPrice: ").append(toIndentedString(periodicPrice)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    includedQuantity: ").append(toIndentedString(includedQuantity)).append("\n");
    sb.append("    additionalOneTimePrice: ").append(toIndentedString(additionalOneTimePrice)).append("\n");
    sb.append("    additionalPeriodicPrice: ").append(toIndentedString(additionalPeriodicPrice)).append("\n");
    sb.append("    additionalQuantity: ").append(toIndentedString(additionalQuantity)).append("\n");
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

