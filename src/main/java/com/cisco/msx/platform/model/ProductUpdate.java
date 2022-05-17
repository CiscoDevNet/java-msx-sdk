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
import com.cisco.msx.platform.model.NSOConfigDataXPath;
import com.cisco.msx.platform.model.ServiceElement;
import com.cisco.msx.platform.model.ServiceSLMUIConfig;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ProductUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class ProductUpdate {
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
  private List<ServiceElement> options = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<ServiceElement> properties = null;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, String> _configuration = null;

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

  public static final String SERIALIZED_NAME_SLM_UI_CONFIG = "slmUiConfig";
  @SerializedName(SERIALIZED_NAME_SLM_UI_CONFIG)
  private ServiceSLMUIConfig slmUiConfig;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private UUID externalId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public ProductUpdate() { 
  }

  public ProductUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProductUpdate label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ProductUpdate version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ProductUpdate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProductUpdate image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public ProductUpdate multipleInstanceAllowed(Boolean multipleInstanceAllowed) {
    
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


  public ProductUpdate price(String price) {
    
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


  public ProductUpdate displayOrder(Integer displayOrder) {
    
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


  public ProductUpdate active(Boolean active) {
    
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


  public ProductUpdate orderLimit(Integer orderLimit) {
    
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


  public ProductUpdate options(List<ServiceElement> options) {
    
    this.options = options;
    return this;
  }

  public ProductUpdate addOptionsItem(ServiceElement optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServiceElement> getOptions() {
    return options;
  }


  public void setOptions(List<ServiceElement> options) {
    this.options = options;
  }


  public ProductUpdate properties(List<ServiceElement> properties) {
    
    this.properties = properties;
    return this;
  }

  public ProductUpdate addPropertiesItem(ServiceElement propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServiceElement> getProperties() {
    return properties;
  }


  public void setProperties(List<ServiceElement> properties) {
    this.properties = properties;
  }


  public ProductUpdate _configuration(Map<String, String> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public ProductUpdate putConfigurationItem(String key, String _configurationItem) {
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


  public ProductUpdate isResource(Boolean isResource) {
    
    this.isResource = isResource;
    return this;
  }

   /**
   * Get isResource
   * @return isResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsResource() {
    return isResource;
  }


  public void setIsResource(Boolean isResource) {
    this.isResource = isResource;
  }


  public ProductUpdate hasChildren(Boolean hasChildren) {
    
    this.hasChildren = hasChildren;
    return this;
  }

   /**
   * Get hasChildren
   * @return hasChildren
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasChildren() {
    return hasChildren;
  }


  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }


  public ProductUpdate parentId(UUID parentId) {
    
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


  public ProductUpdate serviceExtensions(List<NSOConfigDataXPath> serviceExtensions) {
    
    this.serviceExtensions = serviceExtensions;
    return this;
  }

  public ProductUpdate addServiceExtensionsItem(NSOConfigDataXPath serviceExtensionsItem) {
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


  public ProductUpdate serviceConfigQueryRootXPaths(List<String> serviceConfigQueryRootXPaths) {
    
    this.serviceConfigQueryRootXPaths = serviceConfigQueryRootXPaths;
    return this;
  }

  public ProductUpdate addServiceConfigQueryRootXPathsItem(String serviceConfigQueryRootXPathsItem) {
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


  public ProductUpdate uiConfig(ServiceUIConfig uiConfig) {
    
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


  public ProductUpdate slmUiConfig(ServiceSLMUIConfig slmUiConfig) {
    
    this.slmUiConfig = slmUiConfig;
    return this;
  }

   /**
   * Get slmUiConfig
   * @return slmUiConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServiceSLMUIConfig getSlmUiConfig() {
    return slmUiConfig;
  }


  public void setSlmUiConfig(ServiceSLMUIConfig slmUiConfig) {
    this.slmUiConfig = slmUiConfig;
  }


  public ProductUpdate externalId(UUID externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getExternalId() {
    return externalId;
  }


  public void setExternalId(UUID externalId) {
    this.externalId = externalId;
  }


  public ProductUpdate tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public ProductUpdate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductUpdate productUpdate = (ProductUpdate) o;
    return Objects.equals(this.name, productUpdate.name) &&
        Objects.equals(this.label, productUpdate.label) &&
        Objects.equals(this.version, productUpdate.version) &&
        Objects.equals(this.description, productUpdate.description) &&
        Objects.equals(this.image, productUpdate.image) &&
        Objects.equals(this.multipleInstanceAllowed, productUpdate.multipleInstanceAllowed) &&
        Objects.equals(this.price, productUpdate.price) &&
        Objects.equals(this.displayOrder, productUpdate.displayOrder) &&
        Objects.equals(this.active, productUpdate.active) &&
        Objects.equals(this.orderLimit, productUpdate.orderLimit) &&
        Objects.equals(this.options, productUpdate.options) &&
        Objects.equals(this.properties, productUpdate.properties) &&
        Objects.equals(this._configuration, productUpdate._configuration) &&
        Objects.equals(this.isResource, productUpdate.isResource) &&
        Objects.equals(this.hasChildren, productUpdate.hasChildren) &&
        Objects.equals(this.parentId, productUpdate.parentId) &&
        Objects.equals(this.serviceExtensions, productUpdate.serviceExtensions) &&
        Objects.equals(this.serviceConfigQueryRootXPaths, productUpdate.serviceConfigQueryRootXPaths) &&
        Objects.equals(this.uiConfig, productUpdate.uiConfig) &&
        Objects.equals(this.slmUiConfig, productUpdate.slmUiConfig) &&
        Objects.equals(this.externalId, productUpdate.externalId) &&
        Objects.equals(this.tags, productUpdate.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, version, description, image, multipleInstanceAllowed, price, displayOrder, active, orderLimit, options, properties, _configuration, isResource, hasChildren, parentId, serviceExtensions, serviceConfigQueryRootXPaths, uiConfig, slmUiConfig, externalId, tags);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductUpdate {\n");
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
    sb.append("    slmUiConfig: ").append(toIndentedString(slmUiConfig)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

