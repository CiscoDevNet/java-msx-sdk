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
import com.cisco.msx.platform.model.LegacySite;
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
 * LegacySubscriptionDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class LegacySubscriptionDetail {
  public static final String SERIALIZED_NAME_SITE_COUNT = "siteCount";
  @SerializedName(SERIALIZED_NAME_SITE_COUNT)
  private Object siteCount;

  public static final String SERIALIZED_NAME_SITES = "sites";
  @SerializedName(SERIALIZED_NAME_SITES)
  private List<LegacySite> sites = null;

  public static final String SERIALIZED_NAME_OFFER_SELECTION = "offerSelection";
  @SerializedName(SERIALIZED_NAME_OFFER_SELECTION)
  private Map<String, Object> offerSelection = null;

  public static final String SERIALIZED_NAME_SERVICE_INSTANCE_DETAIL = "serviceInstanceDetail";
  @SerializedName(SERIALIZED_NAME_SERVICE_INSTANCE_DETAIL)
  private Map<String, Object> serviceInstanceDetail = null;

  public static final String SERIALIZED_NAME_PRICE_DETAIL = "priceDetail";
  @SerializedName(SERIALIZED_NAME_PRICE_DETAIL)
  private Map<String, Object> priceDetail = null;

  public static final String SERIALIZED_NAME_DEALER_CODE = "dealerCode";
  @SerializedName(SERIALIZED_NAME_DEALER_CODE)
  private String dealerCode;

  public static final String SERIALIZED_NAME_PRICE_PLAN_ID = "pricePlanId";
  @SerializedName(SERIALIZED_NAME_PRICE_PLAN_ID)
  private String pricePlanId;

  public static final String SERIALIZED_NAME_TERMS_AND_CONDITION_ID = "termsAndConditionId";
  @SerializedName(SERIALIZED_NAME_TERMS_AND_CONDITION_ID)
  private String termsAndConditionId;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> _configuration = null;

  public LegacySubscriptionDetail() { 
  }

  public LegacySubscriptionDetail siteCount(Object siteCount) {
    
    this.siteCount = siteCount;
    return this;
  }

   /**
   * Get siteCount
   * @return siteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSiteCount() {
    return siteCount;
  }


  public void setSiteCount(Object siteCount) {
    this.siteCount = siteCount;
  }


  public LegacySubscriptionDetail sites(List<LegacySite> sites) {
    
    this.sites = sites;
    return this;
  }

  public LegacySubscriptionDetail addSitesItem(LegacySite sitesItem) {
    if (this.sites == null) {
      this.sites = new ArrayList<>();
    }
    this.sites.add(sitesItem);
    return this;
  }

   /**
   * Get sites
   * @return sites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LegacySite> getSites() {
    return sites;
  }


  public void setSites(List<LegacySite> sites) {
    this.sites = sites;
  }


  public LegacySubscriptionDetail offerSelection(Map<String, Object> offerSelection) {
    
    this.offerSelection = offerSelection;
    return this;
  }

  public LegacySubscriptionDetail putOfferSelectionItem(String key, Object offerSelectionItem) {
    if (this.offerSelection == null) {
      this.offerSelection = new HashMap<>();
    }
    this.offerSelection.put(key, offerSelectionItem);
    return this;
  }

   /**
   * Get offerSelection
   * @return offerSelection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getOfferSelection() {
    return offerSelection;
  }


  public void setOfferSelection(Map<String, Object> offerSelection) {
    this.offerSelection = offerSelection;
  }


  public LegacySubscriptionDetail serviceInstanceDetail(Map<String, Object> serviceInstanceDetail) {
    
    this.serviceInstanceDetail = serviceInstanceDetail;
    return this;
  }

  public LegacySubscriptionDetail putServiceInstanceDetailItem(String key, Object serviceInstanceDetailItem) {
    if (this.serviceInstanceDetail == null) {
      this.serviceInstanceDetail = new HashMap<>();
    }
    this.serviceInstanceDetail.put(key, serviceInstanceDetailItem);
    return this;
  }

   /**
   * Get serviceInstanceDetail
   * @return serviceInstanceDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getServiceInstanceDetail() {
    return serviceInstanceDetail;
  }


  public void setServiceInstanceDetail(Map<String, Object> serviceInstanceDetail) {
    this.serviceInstanceDetail = serviceInstanceDetail;
  }


  public LegacySubscriptionDetail priceDetail(Map<String, Object> priceDetail) {
    
    this.priceDetail = priceDetail;
    return this;
  }

  public LegacySubscriptionDetail putPriceDetailItem(String key, Object priceDetailItem) {
    if (this.priceDetail == null) {
      this.priceDetail = new HashMap<>();
    }
    this.priceDetail.put(key, priceDetailItem);
    return this;
  }

   /**
   * Get priceDetail
   * @return priceDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getPriceDetail() {
    return priceDetail;
  }


  public void setPriceDetail(Map<String, Object> priceDetail) {
    this.priceDetail = priceDetail;
  }


  public LegacySubscriptionDetail dealerCode(String dealerCode) {
    
    this.dealerCode = dealerCode;
    return this;
  }

   /**
   * Get dealerCode
   * @return dealerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDealerCode() {
    return dealerCode;
  }


  public void setDealerCode(String dealerCode) {
    this.dealerCode = dealerCode;
  }


  public LegacySubscriptionDetail pricePlanId(String pricePlanId) {
    
    this.pricePlanId = pricePlanId;
    return this;
  }

   /**
   * Get pricePlanId
   * @return pricePlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPricePlanId() {
    return pricePlanId;
  }


  public void setPricePlanId(String pricePlanId) {
    this.pricePlanId = pricePlanId;
  }


  public LegacySubscriptionDetail termsAndConditionId(String termsAndConditionId) {
    
    this.termsAndConditionId = termsAndConditionId;
    return this;
  }

   /**
   * Get termsAndConditionId
   * @return termsAndConditionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTermsAndConditionId() {
    return termsAndConditionId;
  }


  public void setTermsAndConditionId(String termsAndConditionId) {
    this.termsAndConditionId = termsAndConditionId;
  }


  public LegacySubscriptionDetail _configuration(Map<String, String> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public LegacySubscriptionDetail putConfigurationItem(String key, String _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(Map<String, String> _configuration) {
    this._configuration = _configuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySubscriptionDetail legacySubscriptionDetail = (LegacySubscriptionDetail) o;
    return Objects.equals(this.siteCount, legacySubscriptionDetail.siteCount) &&
        Objects.equals(this.sites, legacySubscriptionDetail.sites) &&
        Objects.equals(this.offerSelection, legacySubscriptionDetail.offerSelection) &&
        Objects.equals(this.serviceInstanceDetail, legacySubscriptionDetail.serviceInstanceDetail) &&
        Objects.equals(this.priceDetail, legacySubscriptionDetail.priceDetail) &&
        Objects.equals(this.dealerCode, legacySubscriptionDetail.dealerCode) &&
        Objects.equals(this.pricePlanId, legacySubscriptionDetail.pricePlanId) &&
        Objects.equals(this.termsAndConditionId, legacySubscriptionDetail.termsAndConditionId) &&
        Objects.equals(this._configuration, legacySubscriptionDetail._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siteCount, sites, offerSelection, serviceInstanceDetail, priceDetail, dealerCode, pricePlanId, termsAndConditionId, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySubscriptionDetail {\n");
    sb.append("    siteCount: ").append(toIndentedString(siteCount)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
    sb.append("    offerSelection: ").append(toIndentedString(offerSelection)).append("\n");
    sb.append("    serviceInstanceDetail: ").append(toIndentedString(serviceInstanceDetail)).append("\n");
    sb.append("    priceDetail: ").append(toIndentedString(priceDetail)).append("\n");
    sb.append("    dealerCode: ").append(toIndentedString(dealerCode)).append("\n");
    sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
    sb.append("    termsAndConditionId: ").append(toIndentedString(termsAndConditionId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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

