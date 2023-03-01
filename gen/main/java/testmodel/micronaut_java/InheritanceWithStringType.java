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

package testmodel.micronaut_java;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * InheritanceWithStringType
 */
@JsonPropertyOrder({
  InheritanceWithStringType.JSON_PROPERTY_TYPE,
  InheritanceWithStringType.JSON_PROPERTY_A
})
@JsonTypeName("InheritanceWithStringType")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@JsonIgnoreProperties(
  value = "type", // ignore manually set type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = InheritanceWithStringType1.class, name = "Inheritance1"),
  @JsonSubTypes.Type(value = InheritanceWithStringType2.class, name = "Inheritance2"),
})

@Introspected
public class InheritanceWithStringType {
    public static final String JSON_PROPERTY_TYPE = "type";
    protected String type;

    public static final String JSON_PROPERTY_A = "a";
    private String a;

    public InheritanceWithStringType() {
    }

    public InheritanceWithStringType type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public InheritanceWithStringType a(String a) {
        this.a = a;
        return this;
    }

    /**
     * Get a
     * @return a
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_A)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getA() {
        return a;
    }

    @JsonProperty(JSON_PROPERTY_A)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setA(String a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InheritanceWithStringType inheritanceWithStringType = (InheritanceWithStringType) o;
        return Objects.equals(this.type, inheritanceWithStringType.type) &&
            Objects.equals(this.a, inheritanceWithStringType.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, a);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InheritanceWithStringType {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    a: ").append(toIndentedString(a)).append("\n");
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
