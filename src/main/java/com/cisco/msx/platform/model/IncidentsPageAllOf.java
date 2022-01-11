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
import com.cisco.msx.platform.model.Incident;
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
 * IncidentsPageAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T20:44:53.751167200-05:00[America/Toronto]")
public class IncidentsPageAllOf {
  public static final String SERIALIZED_NAME_CONTENTS = "contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private List<Incident> contents = null;


  public IncidentsPageAllOf contents(List<Incident> contents) {
    
    this.contents = contents;
    return this;
  }

  public IncidentsPageAllOf addContentsItem(Incident contentsItem) {
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

  public List<Incident> getContents() {
    return contents;
  }


  public void setContents(List<Incident> contents) {
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
    IncidentsPageAllOf incidentsPageAllOf = (IncidentsPageAllOf) o;
    return Objects.equals(this.contents, incidentsPageAllOf.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentsPageAllOf {\n");
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

