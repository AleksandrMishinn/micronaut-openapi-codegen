package testmodel.micronaut_record;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.serde.annotation.Serdeable
public record SecondLevelTwoModel(

	@com.fasterxml.jackson.annotation.JsonProperty("type")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String type,

	@com.fasterxml.jackson.annotation.JsonProperty("two")
	@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
	java.lang.String two) implements SecondLevelModel {}