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
import com.cisco.msx.platform.model.PageHeader;
import com.cisco.msx.platform.model.ServiceNowConfiguration;
import com.cisco.msx.platform.model.ServiceNowConfigurationsPageAllOf;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ServiceNowConfigurationsPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class ServiceNowConfigurationsPage {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_ITEMS = "totalItems";
  @SerializedName(SERIALIZED_NAME_TOTAL_ITEMS)
  private Long totalItems;

  public static final String SERIALIZED_NAME_HAS_NEXT = "hasNext";
  @SerializedName(SERIALIZED_NAME_HAS_NEXT)
  private Boolean hasNext;

  public static final String SERIALIZED_NAME_HAS_PREVIOUS = "hasPrevious";
  @SerializedName(SERIALIZED_NAME_HAS_PREVIOUS)
  private Boolean hasPrevious;

  public static final String SERIALIZED_NAME_SORT_BY = "sortBy";
  @SerializedName(SERIALIZED_NAME_SORT_BY)
  private String sortBy;

  /**
   * Gets or Sets sortOrder
   */
  @JsonAdapter(SortOrderEnum.Adapter.class)
  public enum SortOrderEnum {
    ASC("asc"),
    
    DESC("desc"),
    
    NULL("null");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String value) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortOrderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SortOrderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private SortOrderEnum sortOrder;

  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<ServiceNowConfiguration> contents = null;


   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPage() {
    return page;
  }




   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPageSize() {
    return pageSize;
  }




   /**
   * Get totalItems
   * @return totalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTotalItems() {
    return totalItems;
  }




   /**
   * Get hasNext
   * @return hasNext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasNext() {
    return hasNext;
  }




   /**
   * Get hasPrevious
   * @return hasPrevious
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasPrevious() {
    return hasPrevious;
  }




   /**
   * Get sortBy
   * @return sortBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSortBy() {
    return sortBy;
  }




   /**
   * Get sortOrder
   * @return sortOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }




  public ServiceNowConfigurationsPage contents(List<ServiceNowConfiguration> contents) {
    
    this.contents = contents;
    return this;
  }

  public ServiceNowConfigurationsPage addContentsItem(ServiceNowConfiguration contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<>();
    }
    this.contents.add(contentsItem);
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ServiceNowConfiguration> getContents() {
    return contents;
  }


  public void setContents(List<ServiceNowConfiguration> contents) {
    this.contents = contents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceNowConfigurationsPage serviceNowConfigurationsPage = (ServiceNowConfigurationsPage) o;
    return Objects.equals(this.page, serviceNowConfigurationsPage.page) &&
        Objects.equals(this.pageSize, serviceNowConfigurationsPage.pageSize) &&
        Objects.equals(this.totalItems, serviceNowConfigurationsPage.totalItems) &&
        Objects.equals(this.hasNext, serviceNowConfigurationsPage.hasNext) &&
        Objects.equals(this.hasPrevious, serviceNowConfigurationsPage.hasPrevious) &&
        Objects.equals(this.sortBy, serviceNowConfigurationsPage.sortBy) &&
        Objects.equals(this.sortOrder, serviceNowConfigurationsPage.sortOrder) &&
        Objects.equals(this.contents, serviceNowConfigurationsPage.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalItems, hasNext, hasPrevious, sortBy, sortOrder, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceNowConfigurationsPage {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalItems: ").append(toIndentedString(totalItems)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

