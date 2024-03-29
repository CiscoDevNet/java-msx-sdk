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
 * It&#39;s metadata about a parameter for use in the UI.  A name to put on the field, a type so it can be validated (e.g. an IP address or an integer value, or list of allowed values for an enumeration/list).
 */
@ApiModel(description = "It's metadata about a parameter for use in the UI.  A name to put on the field, a type so it can be validated (e.g. an IP address or an integer value, or list of allowed values for an enumeration/list).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T18:31:30.346538700-04:00[America/Toronto]")
public class TemplateParameterValidator {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_HINT_TEXT = "hintText";
  @SerializedName(SERIALIZED_NAME_HINT_TEXT)
  private String hintText;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DISPLAY_TYPE = "displayType";
  @SerializedName(SERIALIZED_NAME_DISPLAY_TYPE)
  private String displayType;

  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<String> allowedValues = null;

  public static final String SERIALIZED_NAME_TOOL_TIP_TEXT = "toolTipText";
  @SerializedName(SERIALIZED_NAME_TOOL_TIP_TEXT)
  private String toolTipText;

  public TemplateParameterValidator() { 
  }

  public TemplateParameterValidator name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TemplateParameterValidator hintText(String hintText) {
    
    this.hintText = hintText;
    return this;
  }

   /**
   * Get hintText
   * @return hintText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHintText() {
    return hintText;
  }


  public void setHintText(String hintText) {
    this.hintText = hintText;
  }


  public TemplateParameterValidator label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public TemplateParameterValidator type(String type) {
    
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


  public TemplateParameterValidator displayType(String displayType) {
    
    this.displayType = displayType;
    return this;
  }

   /**
   * Get displayType
   * @return displayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayType() {
    return displayType;
  }


  public void setDisplayType(String displayType) {
    this.displayType = displayType;
  }


  public TemplateParameterValidator allowedValues(List<String> allowedValues) {
    
    this.allowedValues = allowedValues;
    return this;
  }

  public TemplateParameterValidator addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * Get allowedValues
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedValues() {
    return allowedValues;
  }


  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }


  public TemplateParameterValidator toolTipText(String toolTipText) {
    
    this.toolTipText = toolTipText;
    return this;
  }

   /**
   * Get toolTipText
   * @return toolTipText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getToolTipText() {
    return toolTipText;
  }


  public void setToolTipText(String toolTipText) {
    this.toolTipText = toolTipText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateParameterValidator templateParameterValidator = (TemplateParameterValidator) o;
    return Objects.equals(this.name, templateParameterValidator.name) &&
        Objects.equals(this.hintText, templateParameterValidator.hintText) &&
        Objects.equals(this.label, templateParameterValidator.label) &&
        Objects.equals(this.type, templateParameterValidator.type) &&
        Objects.equals(this.displayType, templateParameterValidator.displayType) &&
        Objects.equals(this.allowedValues, templateParameterValidator.allowedValues) &&
        Objects.equals(this.toolTipText, templateParameterValidator.toolTipText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, hintText, label, type, displayType, allowedValues, toolTipText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateParameterValidator {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hintText: ").append(toIndentedString(hintText)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    toolTipText: ").append(toIndentedString(toolTipText)).append("\n");
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

