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
import com.cisco.msx.platform.model.UserCreateAllOf;
import com.cisco.msx.platform.model.UserUpdate;
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
import java.util.UUID;

/**
 * UserCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-26T14:27:03.027365-04:00[America/New_York]")
public class UserCreate {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ROLE_IDS = "roleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<UUID> roleIds = null;

  public static final String SERIALIZED_NAME_TENANT_IDS = "tenantIds";
  @SerializedName(SERIALIZED_NAME_TENANT_IDS)
  private List<UUID> tenantIds = null;

  public static final String SERIALIZED_NAME_PASSWORD_POLICY_NAME = "passwordPolicyName";
  @SerializedName(SERIALIZED_NAME_PASSWORD_POLICY_NAME)
  private String passwordPolicyName;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;


  public UserCreate firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserCreate lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserCreate email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserCreate roleIds(List<UUID> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public UserCreate addRoleIdsItem(UUID roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Get roleIds
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<UUID> roleIds) {
    this.roleIds = roleIds;
  }


  public UserCreate tenantIds(List<UUID> tenantIds) {
    
    this.tenantIds = tenantIds;
    return this;
  }

  public UserCreate addTenantIdsItem(UUID tenantIdsItem) {
    if (this.tenantIds == null) {
      this.tenantIds = new ArrayList<>();
    }
    this.tenantIds.add(tenantIdsItem);
    return this;
  }

   /**
   * Get tenantIds
   * @return tenantIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getTenantIds() {
    return tenantIds;
  }


  public void setTenantIds(List<UUID> tenantIds) {
    this.tenantIds = tenantIds;
  }


  public UserCreate passwordPolicyName(String passwordPolicyName) {
    
    this.passwordPolicyName = passwordPolicyName;
    return this;
  }

   /**
   * Get passwordPolicyName
   * @return passwordPolicyName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPasswordPolicyName() {
    return passwordPolicyName;
  }


  public void setPasswordPolicyName(String passwordPolicyName) {
    this.passwordPolicyName = passwordPolicyName;
  }


  public UserCreate username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public UserCreate password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserCreate userCreate = (UserCreate) o;
    return Objects.equals(this.firstName, userCreate.firstName) &&
        Objects.equals(this.lastName, userCreate.lastName) &&
        Objects.equals(this.email, userCreate.email) &&
        Objects.equals(this.roleIds, userCreate.roleIds) &&
        Objects.equals(this.tenantIds, userCreate.tenantIds) &&
        Objects.equals(this.passwordPolicyName, userCreate.passwordPolicyName) &&
        Objects.equals(this.username, userCreate.username) &&
        Objects.equals(this.password, userCreate.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, roleIds, tenantIds, passwordPolicyName, username, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreate {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    tenantIds: ").append(toIndentedString(tenantIds)).append("\n");
    sb.append("    passwordPolicyName: ").append(toIndentedString(passwordPolicyName)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

