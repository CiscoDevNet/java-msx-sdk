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
import com.cisco.msx.platform.model.IncidentAllOf;
import com.cisco.msx.platform.model.IncidentUpdate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Incident
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-10T20:44:53.751167200-05:00[America/Toronto]")
public class Incident {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, Object> attributes = null;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_MODIFIED_BY = "modifiedBy";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY)
  private String modifiedBy;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  private OffsetDateTime modifiedOn;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category = "inquiry";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets impact
   */
  @JsonAdapter(ImpactEnum.Adapter.class)
  public enum ImpactEnum {
    HIGH("High"),
    
    MEDIUM("Medium"),
    
    LOW("Low");

    private String value;

    ImpactEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImpactEnum fromValue(String value) {
      for (ImpactEnum b : ImpactEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ImpactEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImpactEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImpactEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ImpactEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_IMPACT = "impact";
  @SerializedName(SERIALIZED_NAME_IMPACT)
  private ImpactEnum impact = ImpactEnum.LOW;

  /**
   * Gets or Sets priority
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    CRITICAL("Critical"),
    
    LOW("Low"),
    
    HIGH("High"),
    
    MODERATE("Moderate"),
    
    PLANNING("Planning");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriorityEnum fromValue(String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private PriorityEnum priority = PriorityEnum.PLANNING;

  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    HIGH("High"),
    
    MEDIUM("Medium"),
    
    LOW("Low");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SeverityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private SeverityEnum severity = SeverityEnum.LOW;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    NEW("New"),
    
    INPROGRESS("InProgress"),
    
    ONHOLD("OnHold"),
    
    RESOLVED("Resolved"),
    
    CLOSE("Close"),
    
    CANCELED("Canceled");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state = StateEnum.NEW;

  public static final String SERIALIZED_NAME_SUBCATEGORY = "subcategory";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORY)
  private String subcategory;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private UUID tenant;

  /**
   * Gets or Sets urgency
   */
  @JsonAdapter(UrgencyEnum.Adapter.class)
  public enum UrgencyEnum {
    HIGH("High"),
    
    MEDIUM("Medium"),
    
    LOW("Low");

    private String value;

    UrgencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UrgencyEnum fromValue(String value) {
      for (UrgencyEnum b : UrgencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UrgencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UrgencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UrgencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UrgencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_URGENCY = "urgency";
  @SerializedName(SERIALIZED_NAME_URGENCY)
  private UrgencyEnum urgency = UrgencyEnum.LOW;


   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }




   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getExternalId() {
    return externalId;
  }




  public Incident attributes(Map<String, Object> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public Incident putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  public Incident notes(List<String> notes) {
    
    this.notes = notes;
    return this;
  }

  public Incident addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    this.notes = notes;
  }


  public Incident createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public Incident createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public Incident modifiedBy(String modifiedBy) {
    
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModifiedBy() {
    return modifiedBy;
  }


  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  public Incident modifiedOn(OffsetDateTime modifiedOn) {
    
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }


  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  public Incident category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * inquiry|software|hardware|network|database
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "inquiry|software|hardware|network|database")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public Incident description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Incident impact(ImpactEnum impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ImpactEnum getImpact() {
    return impact;
  }


  public void setImpact(ImpactEnum impact) {
    this.impact = impact;
  }


  public Incident priority(PriorityEnum priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PriorityEnum getPriority() {
    return priority;
  }


  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  public Incident severity(SeverityEnum severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SeverityEnum getSeverity() {
    return severity;
  }


  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public Incident state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public Incident subcategory(String subcategory) {
    
    this.subcategory = subcategory;
    return this;
  }

   /**
   * Get subcategory
   * @return subcategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubcategory() {
    return subcategory;
  }


  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }


  public Incident tenant(UUID tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getTenant() {
    return tenant;
  }


  public void setTenant(UUID tenant) {
    this.tenant = tenant;
  }


  public Incident urgency(UrgencyEnum urgency) {
    
    this.urgency = urgency;
    return this;
  }

   /**
   * Get urgency
   * @return urgency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UrgencyEnum getUrgency() {
    return urgency;
  }


  public void setUrgency(UrgencyEnum urgency) {
    this.urgency = urgency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incident incident = (Incident) o;
    return Objects.equals(this.id, incident.id) &&
        Objects.equals(this.externalId, incident.externalId) &&
        Objects.equals(this.attributes, incident.attributes) &&
        Objects.equals(this.notes, incident.notes) &&
        Objects.equals(this.createdBy, incident.createdBy) &&
        Objects.equals(this.createdOn, incident.createdOn) &&
        Objects.equals(this.modifiedBy, incident.modifiedBy) &&
        Objects.equals(this.modifiedOn, incident.modifiedOn) &&
        Objects.equals(this.category, incident.category) &&
        Objects.equals(this.description, incident.description) &&
        Objects.equals(this.impact, incident.impact) &&
        Objects.equals(this.priority, incident.priority) &&
        Objects.equals(this.severity, incident.severity) &&
        Objects.equals(this.state, incident.state) &&
        Objects.equals(this.subcategory, incident.subcategory) &&
        Objects.equals(this.tenant, incident.tenant) &&
        Objects.equals(this.urgency, incident.urgency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, attributes, notes, createdBy, createdOn, modifiedBy, modifiedOn, category, description, impact, priority, severity, state, subcategory, tenant, urgency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Incident {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
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

