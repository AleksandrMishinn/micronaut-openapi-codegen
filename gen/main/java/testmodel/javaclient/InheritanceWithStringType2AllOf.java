/*
 * Spec for api tests.
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package testmodel.javaclient;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InheritanceWithStringType2AllOf
 */
@JsonPropertyOrder({
  InheritanceWithStringType2AllOf.JSON_PROPERTY_C
})
@JsonTypeName("InheritanceWithStringType2_allOf")
@java.lang.SuppressWarnings("all")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InheritanceWithStringType2AllOf {
  public static final String JSON_PROPERTY_C = "c";
  private String c;

  public InheritanceWithStringType2AllOf() {
  }

  public InheritanceWithStringType2AllOf c(String c) {
    
    this.c = c;
    return this;
  }

   /**
   * Get c
   * @return c
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getC() {
    return c;
  }


  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setC(String c) {
    this.c = c;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InheritanceWithStringType2AllOf inheritanceWithStringType2AllOf = (InheritanceWithStringType2AllOf) o;
    return Objects.equals(this.c, inheritanceWithStringType2AllOf.c);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InheritanceWithStringType2AllOf {\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
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

