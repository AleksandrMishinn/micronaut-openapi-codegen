package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ParameterApi {

	@io.micronaut.http.annotation.Get("/param/all/{path}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramAll(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "path")
			java.lang.String path,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "uuid")
			java.util.UUID uuid,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.LocalDate date,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Post("/param/body/optional")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramBodyOptional(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			ParameterModel parameterModel);

	@io.micronaut.http.annotation.Post("/param/body/required")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramBodyRequired(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			ParameterModel parameterModel);

	@io.micronaut.http.annotation.Get("/param/cookie/optionalWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramCookieOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.CookieValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/cookie/optionalWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramCookieOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.CookieValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/cookie/requiredWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramCookieRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.CookieValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/cookie/requiredWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramCookieRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.CookieValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{string:10}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathOverlayWithString(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			@jakarta.validation.constraints.Size(max = 10)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{uuid:[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathOverlayWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithDefault/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithoutDefault/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-bool/{bool:true|false}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithBoolean(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "bool")
			java.lang.Boolean bool);

	@io.micronaut.http.annotation.Get("/param/path/with-integer/{integer:\\-?[0-9]+}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithInteger(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/param/path/with-long/{long:\\-?[0-9]+}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithLong(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "long")
			java.lang.Long _long);

	@io.micronaut.http.annotation.Get("/param/path/with-max-length/{string:5}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithMaxLength(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			@jakarta.validation.constraints.Size(max = 5)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-pattern/{string:[0-9][a-z]}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			@jakarta.validation.constraints.Pattern(regexp = "[0-9][a-z]")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-uuid/{uuid:[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/query/date")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryDate(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.LocalDate date);

	@io.micronaut.http.annotation.Get("/param/query/date-time")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryDateTime(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.Instant date);

	@io.micronaut.http.annotation.Get("/param/query/multiple-lists")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryMultipleLists(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull String> a,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue
			java.util.List<java.util.@jakarta.validation.constraints.NotNull UUID> b,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> c);

	@io.micronaut.http.annotation.Get("/param/query/number")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryNumber(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.lang.Double date);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/uuid")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryUuid(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.UUID date);
}
