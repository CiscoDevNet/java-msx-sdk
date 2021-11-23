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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TemplateStatus
 */
@JsonAdapter(TemplateStatus.Adapter.class)
public enum TemplateStatus {
  
  NEW("NEW"),
  
  PENDING("PENDING"),
  
  FAILED("FAILED"),
  
  SUCCESS("SUCCESS"),
  
  DELETE("DELETE"),
  
  ERROR("ERROR");

  private String value;

  TemplateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TemplateStatus fromValue(String value) {
    for (TemplateStatus b : TemplateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TemplateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TemplateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TemplateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TemplateStatus.fromValue(value);
    }
  }
}

