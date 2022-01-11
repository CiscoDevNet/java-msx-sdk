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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdatePassword
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T20:44:53.751167200-05:00[America/Toronto]")
public class UpdatePassword {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_OLD_PASSWORD = "oldPassword";
  @SerializedName(SERIALIZED_NAME_OLD_PASSWORD)
  private String oldPassword;

  public static final String SERIALIZED_NAME_NEW_PASSWORD = "newPassword";
  @SerializedName(SERIALIZED_NAME_NEW_PASSWORD)
  private String newPassword;


  public UpdatePassword username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UpdatePassword oldPassword(String oldPassword) {
    
    this.oldPassword = oldPassword;
    return this;
  }

   /**
   * Get oldPassword
   * @return oldPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOldPassword() {
    return oldPassword;
  }


  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }


  public UpdatePassword newPassword(String newPassword) {
    
    this.newPassword = newPassword;
    return this;
  }

   /**
   * Get newPassword
   * @return newPassword
  **/
  @ApiModelProperty(required = true, value = "")

  public String getNewPassword() {
    return newPassword;
  }


  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePassword updatePassword = (UpdatePassword) o;
    return Objects.equals(this.username, updatePassword.username) &&
        Objects.equals(this.oldPassword, updatePassword.oldPassword) &&
        Objects.equals(this.newPassword, updatePassword.newPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, oldPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePassword {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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

