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
import com.cisco.msx.platform.model.NSOConfigDataXPath;
import com.cisco.msx.platform.model.ProductUpdate;
import com.cisco.msx.platform.model.ServiceElement;
import com.cisco.msx.platform.model.ServiceUIConfig;
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
 * ProductCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-12T15:11:34.208390-04:00[America/New_York]")
public class ProductCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_MULTIPLE_INSTANCE_ALLOWED = "multipleInstanceAllowed";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_INSTANCE_ALLOWED)
  private Boolean multipleInstanceAllowed;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "displayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ORDER_LIMIT = "orderLimit";
  @SerializedName(SERIALIZED_NAME_ORDER_LIMIT)
  private Integer orderLimit;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ServiceElement> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<ServiceElement> properties = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> _configuration = new HashMap<>();

  public static final String SERIALIZED_NAME_IS_RESOURCE = "isResource";
  @SerializedName(SERIALIZED_NAME_IS_RESOURCE)
  private Boolean isResource;

  public static final String SERIALIZED_NAME_HAS_CHILDREN = "hasChildren";
  @SerializedName(SERIALIZED_NAME_HAS_CHILDREN)
  private Boolean hasChildren;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private UUID parentId;

  public static final String SERIALIZED_NAME_SERVICE_EXTENSIONS = "serviceExtensions";
  @SerializedName(SERIALIZED_NAME_SERVICE_EXTENSIONS)
  private List<NSOConfigDataXPath> serviceExtensions = null;

  public static final String SERIALIZED_NAME_SERVICE_CONFIG_QUERY_ROOT_X_PATHS = "serviceConfigQueryRootXPaths";
  @SerializedName(SERIALIZED_NAME_SERVICE_CONFIG_QUERY_ROOT_X_PATHS)
  private List<String> serviceConfigQueryRootXPaths = null;

  public static final String SERIALIZED_NAME_UI_CONFIG = "uiConfig";
  @SerializedName(SERIALIZED_NAME_UI_CONFIG)
  private ServiceUIConfig uiConfig;


  public ProductCreate name(String name) {
    
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


  public ProductCreate label(String label) {
    
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


  public ProductCreate version(Integer version) {
    
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


  public ProductCreate description(String description) {
    
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


  public ProductCreate image(String image) {
    
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


  public ProductCreate multipleInstanceAllowed(Boolean multipleInstanceAllowed) {
    
    this.multipleInstanceAllowed = multipleInstanceAllowed;
    return this;
  }

   /**
   * Get multipleInstanceAllowed
   * @return multipleInstanceAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMultipleInstanceAllowed() {
    return multipleInstanceAllowed;
  }


  public void setMultipleInstanceAllowed(Boolean multipleInstanceAllowed) {
    this.multipleInstanceAllowed = multipleInstanceAllowed;
  }


  public ProductCreate price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public ProductCreate displayOrder(Integer displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }


  public ProductCreate active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public ProductCreate orderLimit(Integer orderLimit) {
    
    this.orderLimit = orderLimit;
    return this;
  }

   /**
   * Get orderLimit
   * @return orderLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrderLimit() {
    return orderLimit;
  }


  public void setOrderLimit(Integer orderLimit) {
    this.orderLimit = orderLimit;
  }


  public ProductCreate options(List<ServiceElement> options) {
    
    this.options = options;
    return this;
  }

  public ProductCreate addOptionsItem(ServiceElement optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(required = true, value = "")

  public List<ServiceElement> getOptions() {
    return options;
  }


  public void setOptions(List<ServiceElement> options) {
    this.options = options;
  }


  public ProductCreate properties(List<ServiceElement> properties) {
    
    this.properties = properties;
    return this;
  }

  public ProductCreate addPropertiesItem(ServiceElement propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public List<ServiceElement> getProperties() {
    return properties;
  }


  public void setProperties(List<ServiceElement> properties) {
    this.properties = properties;
  }


  public ProductCreate _configuration(Map<String, String> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public ProductCreate putConfigurationItem(String key, String _configurationItem) {
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(Map<String, String> _configuration) {
    this._configuration = _configuration;
  }


  public ProductCreate isResource(Boolean isResource) {
    
    this.isResource = isResource;
    return this;
  }

   /**
   * Get isResource
   * @return isResource
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsResource() {
    return isResource;
  }


  public void setIsResource(Boolean isResource) {
    this.isResource = isResource;
  }


  public ProductCreate hasChildren(Boolean hasChildren) {
    
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * Get hasChildren
   * @return hasChildren
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasChildren() {
    return hasChildren;
  }


  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  public ProductCreate parentId(UUID parentId) {
    
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getParentId() {
    return parentId;
  }


  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }


  public ProductCreate serviceExtensions(List<NSOConfigDataXPath> serviceExtensions) {
    
    this.serviceExtensions = serviceExtensions;
    return this;
  }

  public ProductCreate addServiceExtensionsItem(NSOConfigDataXPath serviceExtensionsItem) {
    if (this.serviceExtensions == null) {
      this.serviceExtensions = new ArrayList<>();
    }
    this.serviceExtensions.add(serviceExtensionsItem);
    return this;
  }

   /**
   * Get serviceExtensions
   * @return serviceExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NSOConfigDataXPath> getServiceExtensions() {
    return serviceExtensions;
  }


  public void setServiceExtensions(List<NSOConfigDataXPath> serviceExtensions) {
    this.serviceExtensions = serviceExtensions;
  }


  public ProductCreate serviceConfigQueryRootXPaths(List<String> serviceConfigQueryRootXPaths) {
    
    this.serviceConfigQueryRootXPaths = serviceConfigQueryRootXPaths;
    return this;
  }

  public ProductCreate addServiceConfigQueryRootXPathsItem(String serviceConfigQueryRootXPathsItem) {
    if (this.serviceConfigQueryRootXPaths == null) {
      this.serviceConfigQueryRootXPaths = new ArrayList<>();
    }
    this.serviceConfigQueryRootXPaths.add(serviceConfigQueryRootXPathsItem);
    return this;
  }

   /**
   * Get serviceConfigQueryRootXPaths
   * @return serviceConfigQueryRootXPaths
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getServiceConfigQueryRootXPaths() {
    return serviceConfigQueryRootXPaths;
  }


  public void setServiceConfigQueryRootXPaths(List<String> serviceConfigQueryRootXPaths) {
    this.serviceConfigQueryRootXPaths = serviceConfigQueryRootXPaths;
  }


  public ProductCreate uiConfig(ServiceUIConfig uiConfig) {
    
    this.uiConfig = uiConfig;
    return this;
  }

   /**
   * Get uiConfig
   * @return uiConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceUIConfig getUiConfig() {
    return uiConfig;
  }


  public void setUiConfig(ServiceUIConfig uiConfig) {
    this.uiConfig = uiConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCreate productCreate = (ProductCreate) o;
    return Objects.equals(this.name, productCreate.name) &&
        Objects.equals(this.label, productCreate.label) &&
        Objects.equals(this.version, productCreate.version) &&
        Objects.equals(this.description, productCreate.description) &&
        Objects.equals(this.image, productCreate.image) &&
        Objects.equals(this.multipleInstanceAllowed, productCreate.multipleInstanceAllowed) &&
        Objects.equals(this.price, productCreate.price) &&
        Objects.equals(this.displayOrder, productCreate.displayOrder) &&
        Objects.equals(this.active, productCreate.active) &&
        Objects.equals(this.orderLimit, productCreate.orderLimit) &&
        Objects.equals(this.options, productCreate.options) &&
        Objects.equals(this.properties, productCreate.properties) &&
        Objects.equals(this._configuration, productCreate._configuration) &&
        Objects.equals(this.isResource, productCreate.isResource) &&
        Objects.equals(this.hasChildren, productCreate.hasChildren) &&
        Objects.equals(this.parentId, productCreate.parentId) &&
        Objects.equals(this.serviceExtensions, productCreate.serviceExtensions) &&
        Objects.equals(this.serviceConfigQueryRootXPaths, productCreate.serviceConfigQueryRootXPaths) &&
        Objects.equals(this.uiConfig, productCreate.uiConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, version, description, image, multipleInstanceAllowed, price, displayOrder, active, orderLimit, options, properties, _configuration, isResource, hasChildren, parentId, serviceExtensions, serviceConfigQueryRootXPaths, uiConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    multipleInstanceAllowed: ").append(toIndentedString(multipleInstanceAllowed)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    orderLimit: ").append(toIndentedString(orderLimit)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    isResource: ").append(toIndentedString(isResource)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    serviceExtensions: ").append(toIndentedString(serviceExtensions)).append("\n");
    sb.append("    serviceConfigQueryRootXPaths: ").append(toIndentedString(serviceConfigQueryRootXPaths)).append("\n");
    sb.append("    uiConfig: ").append(toIndentedString(uiConfig)).append("\n");
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

