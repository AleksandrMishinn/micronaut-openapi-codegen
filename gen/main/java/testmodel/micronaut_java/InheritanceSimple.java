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
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * InheritanceSimple
 */
@JsonPropertyOrder({
  InheritanceSimple.JSON_PROPERTY_FOO
})
@JsonTypeName("InheritanceSimple")
@java.lang.SuppressWarnings("all")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class InheritanceSimple {
    public static final String JSON_PROPERTY_FOO = "foo";
    private String foo;

    public InheritanceSimple(String foo) {
        this.foo = foo;
    }

    public InheritanceSimple foo(String foo) {
        this.foo = foo;
        return this;
    }

    /**
     * Get foo
     * @return foo
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_FOO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFoo() {
        return foo;
    }

    @JsonProperty(JSON_PROPERTY_FOO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFoo(String foo) {
        this.foo = foo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InheritanceSimple inheritanceSimple = (InheritanceSimple) o;
        return Objects.equals(this.foo, inheritanceSimple.foo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InheritanceSimple {\n");
        sb.append("    foo: ").append(toIndentedString(foo)).append("\n");
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

