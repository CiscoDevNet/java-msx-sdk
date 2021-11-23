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
import com.cisco.msx.platform.model.SmartAccountType;
import com.cisco.msx.platform.model.SmartAccountUserRole;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * SmartAccountUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-21T19:51:07.781399800-05:00[America/Toronto]")
public class SmartAccountUser {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_DOMAIN = "accountDomain";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DOMAIN)
  private URI accountDomain;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private SmartAccountType accountType;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<SmartAccountUserRole> roles = null;


   /**
   * Smart Account identifier
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Smart Account identifier")

  public Integer getAccountId() {
    return accountId;
  }




   /**
   * Smart Account Name
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Smart Account Name")

  public String getAccountName() {
    return accountName;
  }




   /**
   * Smart Accont Domain
   * @return accountDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Smart Accont Domain")

  public URI getAccountDomain() {
    return accountDomain;
  }




  public SmartAccountUser accountType(SmartAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SmartAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(SmartAccountType accountType) {
    this.accountType = accountType;
  }


  public SmartAccountUser roles(List<SmartAccountUserRole> roles) {
    
    this.roles = roles;
    return this;
  }

  public SmartAccountUser addRolesItem(SmartAccountUserRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SmartAccountUserRole> getRoles() {
    return roles;
  }


  public void setRoles(List<SmartAccountUserRole> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartAccountUser smartAccountUser = (SmartAccountUser) o;
    return Objects.equals(this.accountId, smartAccountUser.accountId) &&
        Objects.equals(this.accountName, smartAccountUser.accountName) &&
        Objects.equals(this.accountDomain, smartAccountUser.accountDomain) &&
        Objects.equals(this.accountType, smartAccountUser.accountType) &&
        Objects.equals(this.roles, smartAccountUser.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountDomain, accountType, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartAccountUser {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountDomain: ").append(toIndentedString(accountDomain)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
