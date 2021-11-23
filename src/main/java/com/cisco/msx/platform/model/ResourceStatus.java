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
 * Gets or Sets ResourceStatus
 */
@JsonAdapter(ResourceStatus.Adapter.class)
public enum ResourceStatus {
  
  UP("up"),
  
  DOWN("down"),
  
  UNKNOWN("unknown");

  private String value;

  ResourceStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResourceStatus fromValue(String value) {
    for (ResourceStatus b : ResourceStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResourceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResourceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResourceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResourceStatus.fromValue(value);
    }
  }
}

