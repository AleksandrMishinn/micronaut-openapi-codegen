package testmodel.spring;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;


import java.util.*;
import javax.annotation.Generated;

/**
 * InheritanceWithoutType
 */
@java.lang.SuppressWarnings("all")

@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = InheritanceWithoutType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithoutType2.class, name = "Inheritance2")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class InheritanceWithoutType {

  @JsonProperty("e")
  private String e;

  public InheritanceWithoutType e(String e) {
    this.e = e;
    return this;
  }

  /**
   * Get e
   * @return e
  */
  
  public String getE() {
    return e;
  }

  public void setE(String e) {
    this.e = e;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithoutType inheritanceWithoutType = (InheritanceWithoutType) o;
    return Objects.equals(this.e, inheritanceWithoutType.e);
  }

  @Override
  public int hashCode() {
    return Objects.hash(e);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithoutType {\n");
    sb.append("    e: ").append(toIndentedString(e)).append("\n");
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

