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
import com.cisco.msx.platform.model.NameValue;
import com.cisco.msx.platform.model.OfferUpdate;
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
import java.util.UUID;

/**
 * OfferCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T14:27:03.027365-04:00[America/New_York]")
public class OfferCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private UUID productId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "displayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SUPPORTED_PROPERTIES = "supportedProperties";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_PROPERTIES)
  private List<String> supportedProperties = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUPPORTED_OPTIONS = "supportedOptions";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_OPTIONS)
  private List<NameValue> supportedOptions = new ArrayList<>();

  public static final String SERIALIZED_NAME_APPROVALS = "approvals";
  @SerializedName(SERIALIZED_NAME_APPROVALS)
  private Map<String, List<String>> approvals = null;


  public OfferCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OfferCreate label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public OfferCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public OfferCreate productId(UUID productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "")

  public UUID getProductId() {
    return productId;
  }


  public void setProductId(UUID productId) {
    this.productId = productId;
  }


  public OfferCreate version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public OfferCreate displayOrder(Integer displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  public OfferCreate image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(required = true, value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public OfferCreate price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public OfferCreate type(String type) {
    
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


  public OfferCreate supportedProperties(List<String> supportedProperties) {
    
    this.supportedProperties = supportedProperties;
    return this;
  }

  public OfferCreate addSupportedPropertiesItem(String supportedPropertiesItem) {
    this.supportedProperties.add(supportedPropertiesItem);
    return this;
  }

   /**
   * Get supportedProperties
   * @return supportedProperties
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getSupportedProperties() {
    return supportedProperties;
  }


  public void setSupportedProperties(List<String> supportedProperties) {
    this.supportedProperties = supportedProperties;
  }


  public OfferCreate supportedOptions(List<NameValue> supportedOptions) {
    
    this.supportedOptions = supportedOptions;
    return this;
  }

  public OfferCreate addSupportedOptionsItem(NameValue supportedOptionsItem) {
    this.supportedOptions.add(supportedOptionsItem);
    return this;
  }

   /**
   * Get supportedOptions
   * @return supportedOptions
  **/
  @ApiModelProperty(required = true, value = "")

  public List<NameValue> getSupportedOptions() {
    return supportedOptions;
  }


  public void setSupportedOptions(List<NameValue> supportedOptions) {
    this.supportedOptions = supportedOptions;
  }


  public OfferCreate approvals(Map<String, List<String>> approvals) {
    
    this.approvals = approvals;
    return this;
  }

  public OfferCreate putApprovalsItem(String key, List<String> approvalsItem) {
    if (this.approvals == null) {
      this.approvals = new HashMap<>();
    }
    this.approvals.put(key, approvalsItem);
    return this;
  }

   /**
   * Get approvals
   * @return approvals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getApprovals() {
    return approvals;
  }


  public void setApprovals(Map<String, List<String>> approvals) {
    this.approvals = approvals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCreate offerCreate = (OfferCreate) o;
    return Objects.equals(this.name, offerCreate.name) &&
        Objects.equals(this.label, offerCreate.label) &&
        Objects.equals(this.description, offerCreate.description) &&
        Objects.equals(this.productId, offerCreate.productId) &&
        Objects.equals(this.version, offerCreate.version) &&
        Objects.equals(this.displayOrder, offerCreate.displayOrder) &&
        Objects.equals(this.image, offerCreate.image) &&
        Objects.equals(this.price, offerCreate.price) &&
        Objects.equals(this.type, offerCreate.type) &&
        Objects.equals(this.supportedProperties, offerCreate.supportedProperties) &&
        Objects.equals(this.supportedOptions, offerCreate.supportedOptions) &&
        Objects.equals(this.approvals, offerCreate.approvals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, description, productId, version, displayOrder, image, price, type, supportedProperties, supportedOptions, approvals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supportedProperties: ").append(toIndentedString(supportedProperties)).append("\n");
    sb.append("    supportedOptions: ").append(toIndentedString(supportedOptions)).append("\n");
    sb.append("    approvals: ").append(toIndentedString(approvals)).append("\n");
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

