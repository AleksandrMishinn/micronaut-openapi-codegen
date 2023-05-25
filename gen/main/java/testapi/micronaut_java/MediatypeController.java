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
import io.micronaut.http.multipart.CompletedFileUpload;
import testapi.micronaut_java.Multipart;
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
public class MediatypeController {
    /**
     * mediatypeConsumesAndProduces
     *
     * @param _body  (required)
     * @return StringModel
     */
    @Post(uri="/mediatype/consumes-and-produces")
    @Produces(value = {"application/xml"})
    @Consumes(value = {"application/octet-stream"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel mediatypeConsumesAndProduces(
        @Body @NotNull CompletedFileUpload _body
    ) {
        // TODO implement mediatypeConsumesAndProduces();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * mediatypeConsumesMultipartWithFileUpload
     *
     * @param orderId  (required)
     * @param userId  (required)
     * @param _file  (required)
     * @return Multipart
     */
    @Post(uri="/mediatype/consumes-multipart-with-fileupload")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public Multipart mediatypeConsumesMultipartWithFileUpload(
        @NotNull Integer orderId, 
        @NotNull Integer userId, 
        @NotNull CompletedFileUpload _file
    ) {
        // TODO implement mediatypeConsumesMultipartWithFileUpload();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * mediatypeConsumesMultipartWithoutFileUpload
     *
     * @param orderId  (required)
     * @param userId  (required)
     * @return Multipart
     */
    @Post(uri="/mediatype/consumes-multipart-without-fileupload")
    @Produces(value = {"application/json"})
    @Consumes(value = {"multipart/form-data"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public Multipart mediatypeConsumesMultipartWithoutFileUpload(
        @NotNull Integer orderId, 
        @NotNull Integer userId
    ) {
        // TODO implement mediatypeConsumesMultipartWithoutFileUpload();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * mediatypeConsumesOctetStream
     *
     * @param _body  (required)
     * @return StringModel
     */
    @Post(uri="/mediatype/consumes-octet-stream")
    @Produces(value = {"application/json"})
    @Consumes(value = {"application/octet-stream"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel mediatypeConsumesOctetStream(
        @Body @NotNull CompletedFileUpload _body
    ) {
        // TODO implement mediatypeConsumesOctetStream();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * mediatypeConsumesPlain
     *
     * @param _body  (required)
     * @return StringModel
     */
    @Post(uri="/mediatype/consumes-plain")
    @Produces(value = {"application/json"})
    @Consumes(value = {"text/plain"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel mediatypeConsumesPlain(
        @Body @NotNull String _body
    ) {
        // TODO implement mediatypeConsumesPlain();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * mediatypeProducesDifferentModel
     *
     * @param value  (required)
     * @param plain  (required)
     * @return StringModel
     */
    @Get(uri="/mediatype/produces-with-different-model")
    @Produces(value = {"application/json", "text/plain"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel mediatypeProducesDifferentModel(
        @QueryValue(value="value") @NotNull String value, 
        @QueryValue(value="plain") @NotNull Boolean plain
    ) {
        // TODO implement mediatypeProducesDifferentModel();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }


    /**
     * mediatypeProducesSameModel
     *
     * @param value  (required)
     * @return StringModel
     */
    @Get(uri="/mediatype/produces-with-same-model")
    @Produces(value = {"application/json", "application/xml"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public StringModel mediatypeProducesSameModel(
        @QueryValue(value="value") @NotNull String value
    ) {
        // TODO implement mediatypeProducesSameModel();
        throw new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null);
    }

}