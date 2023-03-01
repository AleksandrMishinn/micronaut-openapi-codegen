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
import testmodel.micronaut_java.InheritanceWithoutType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * InheritanceWithoutType2
 */
@JsonPropertyOrder({
  InheritanceWithoutType2.JSON_PROPERTY_G
})
@JsonTypeName("InheritanceWithoutType2")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class InheritanceWithoutType2 extends InheritanceWithoutType {
    public static final String JSON_PROPERTY_G = "g";
    private String g;

    public InheritanceWithoutType2() {
        super();
    }

    public InheritanceWithoutType2 g(String g) {
        this.g = g;
        return this;
    }

    /**
     * Get g
     * @return g
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getG() {
        return g;
    }

    @JsonProperty(JSON_PROPERTY_G)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setG(String g) {
        this.g = g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InheritanceWithoutType2 inheritanceWithoutType2 = (InheritanceWithoutType2) o;
        return Objects.equals(this.g, inheritanceWithoutType2.g) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InheritanceWithoutType2 {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    g: ").append(toIndentedString(g)).append("\n");
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
