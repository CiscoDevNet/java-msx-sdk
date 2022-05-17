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
import com.cisco.msx.platform.model.PageHeader;
import com.cisco.msx.platform.model.User;
import com.cisco.msx.platform.model.UsersPageAllOf;
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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UsersPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class UsersPage {
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
  private List<User> contents = null;

  public UsersPage() { 
  }

  
  public UsersPage(
     Integer page, 
     Integer pageSize, 
     Long totalItems, 
     Boolean hasNext, 
     Boolean hasPrevious, 
     String sortBy, 
     SortOrderEnum sortOrder
  ) {
    this();
    this.page = page;
    this.pageSize = pageSize;
    this.totalItems = totalItems;
    this.hasNext = hasNext;
    this.hasPrevious = hasPrevious;
    this.sortBy = sortBy;
    this.sortOrder = sortOrder;
  }

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




  public UsersPage contents(List<User> contents) {
    
    this.contents = contents;
    return this;
  }

  public UsersPage addContentsItem(User contentsItem) {
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

  public List<User> getContents() {
    return contents;
  }


  public void setContents(List<User> contents) {
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
    UsersPage usersPage = (UsersPage) o;
    return Objects.equals(this.page, usersPage.page) &&
        Objects.equals(this.pageSize, usersPage.pageSize) &&
        Objects.equals(this.totalItems, usersPage.totalItems) &&
        Objects.equals(this.hasNext, usersPage.hasNext) &&
        Objects.equals(this.hasPrevious, usersPage.hasPrevious) &&
        Objects.equals(this.sortBy, usersPage.sortBy) &&
        Objects.equals(this.sortOrder, usersPage.sortOrder) &&
        Objects.equals(this.contents, usersPage.contents);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalItems, hasNext, hasPrevious, sortBy, sortOrder, contents);
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
    sb.append("class UsersPage {\n");
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

