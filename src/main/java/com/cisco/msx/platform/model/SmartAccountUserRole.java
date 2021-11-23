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

/**
 * SmartAccountUserRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class SmartAccountUserRole {
  public static final String SERIALIZED_NAME_ROLE_NAME = "roleName";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_VIRTUAL_ACCOUNT_ID = "virtualAccountId";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_ACCOUNT_ID)
  private Integer virtualAccountId;

  public static final String SERIALIZED_NAME_VIRTUAL_ACCOUNT_NAME = "virtualAccountName";
  @SerializedName(SERIALIZED_NAME_VIRTUAL_ACCOUNT_NAME)
  private String virtualAccountName;


   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleName() {
    return roleName;
  }




   /**
   * Virtual Account identifier
   * @return virtualAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Virtual Account identifier")

  public Integer getVirtualAccountId() {
    return virtualAccountId;
  }




   /**
   * Virtual Account Name
   * @return virtualAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Virtual Account Name")

  public String getVirtualAccountName() {
    return virtualAccountName;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartAccountUserRole smartAccountUserRole = (SmartAccountUserRole) o;
    return Objects.equals(this.roleName, smartAccountUserRole.roleName) &&
        Objects.equals(this.virtualAccountId, smartAccountUserRole.virtualAccountId) &&
        Objects.equals(this.virtualAccountName, smartAccountUserRole.virtualAccountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, virtualAccountId, virtualAccountName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartAccountUserRole {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    virtualAccountId: ").append(toIndentedString(virtualAccountId)).append("\n");
    sb.append("    virtualAccountName: ").append(toIndentedString(virtualAccountName)).append("\n");
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
