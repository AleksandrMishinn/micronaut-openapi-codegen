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

package testapi.micronaut_java;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import java.math.BigDecimal;
import testapi.micronaut_java.NumberModel;
import testapi.micronaut_java.StringModel;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Controller
public class ResponseController {
    /**
     * arrayComplex
     *
     * @return List&lt;StringModel&gt;
     */
    @Get(uri="/response/array-complex")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public List<StringModel> arrayComplex() {
        // TODO implement arrayComplex();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * arrayComplexNotFound
     *
     * @param found  (required)
     * @return List&lt;StringModel&gt;
     */
    @Get(uri="/response/array-complex-not-found")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public List<StringModel> arrayComplexNotFound(
        @QueryValue(value="found") @NotNull Boolean found
    ) {
        // TODO implement arrayComplexNotFound();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * arraySimple
     *
     * @return List&lt;String&gt;
     */
    @Get(uri="/response/array-simple")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public List<String> arraySimple() {
        // TODO implement arraySimple();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * arraySimpleEmpty
     *
     * @return List&lt;String&gt;
     */
    @Get(uri="/response/array-simple-empty")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public List<String> arraySimpleEmpty() {
        // TODO implement arraySimpleEmpty();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * arraySimpleNotFound
     *
     * @param found  (required)
     * @return List&lt;String&gt;
     */
    @Get(uri="/response/array-simple-not-found")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public List<String> arraySimpleNotFound(
        @QueryValue(value="found") @NotNull Boolean found
    ) {
        // TODO implement arraySimpleNotFound();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * callHeader
     *
     */
    @Get(uri="/response/header")
    @Produces(value = {})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public void callHeader() {
        // TODO implement callHeader();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * multipleDataTypes
     *
     * @param redirect  (required)
     * @return StringModel
     */
    @Get(uri="/response/multiple-datatypes")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel multipleDataTypes(
        @QueryValue(value="redirect") @NotNull Boolean redirect
    ) {
        // TODO implement multipleDataTypes();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * multipleDataTypesNotFound
     *
     * @param redirect  (required)
     * @param found  (required)
     * @return StringModel
     */
    @Get(uri="/response/multiple-datatypes-not-found")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel multipleDataTypesNotFound(
        @QueryValue(value="redirect") @NotNull Boolean redirect, 
        @QueryValue(value="found") @NotNull Boolean found
    ) {
        // TODO implement multipleDataTypesNotFound();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * multipleResponseCodes
     *
     * @param redirect  (required)
     * @return StringModel
     */
    @Get(uri="/response/multiple-response-codes")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel multipleResponseCodes(
        @QueryValue(value="redirect") @NotNull Boolean redirect
    ) {
        // TODO implement multipleResponseCodes();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * multipleResponseCodesNotFound
     *
     * @param redirect  (required)
     * @param found  (required)
     * @return StringModel
     */
    @Get(uri="/response/multiple-response-codes-not-found")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel multipleResponseCodesNotFound(
        @QueryValue(value="redirect") @NotNull Boolean redirect, 
        @QueryValue(value="found") @NotNull Boolean found
    ) {
        // TODO implement multipleResponseCodesNotFound();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * optional
     *
     * @param found  (required)
     * @return String
     */
    @Get(uri="/response/optional")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public String optional(
        @QueryValue(value="found") @NotNull Boolean found
    ) {
        // TODO implement optional();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * single
     *
     * @return String
     */
    @Get(uri="/response/single")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public String single() {
        // TODO implement single();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * voidFound
     *
     */
    @Get(uri="/response/void")
    @Produces(value = {})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public void voidFound() {
        // TODO implement voidFound();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * voidNotFound
     *
     * @param found  (required)
     */
    @Get(uri="/response/void-not-found")
    @Produces(value = {})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public void voidNotFound(
        @QueryValue(value="found") @NotNull Boolean found
    ) {
        // TODO implement voidNotFound();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * withDefault
     *
     */
    @Get(uri="/response/default")
    @Produces(value = {})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public void withDefault() {
        // TODO implement withDefault();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }

}
