package org.openapitools.codegen.languages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

public class IssueCodegenTest extends AbstractCodegenTest {

	@DisplayName("model without micronaut annotations")
	@Test
	void modelWithoutMicronaut() {
		generate(configurator("src/test/resources/openapi/issue-303.yaml", "issue._303").setGenerateAliasAsModel(true));
	}

	@DisplayName("model with additional properties does not include properties in hashcode/equals")
	@Test
	void modelWithAdditionapProperties() {
		generate(configurator("src/test/resources/openapi/issue-315.yaml", "issue._315").setGenerateAliasAsModel(true));
	}

	@DisplayName("model with suffix")
	@Test
	void modelWithSuffix() {
		generate(configurator("src/test/resources/openapi/issue-318.yaml", "issue._318").setModelNameSuffix("Dto"));
	}

	@DisplayName("model with additional properties and multiple properties generate invalid hashcode/equals")
	@Test
	void modelWithAdditionapPropertiesAndMultipleProperties() {
		generate(configurator("src/test/resources/openapi/issue-336.yaml", "issue._336").setGenerateAliasAsModel(true));
	}

	@DisplayName("model with arrays items with validation")
	@Test
	void modelWithArrayItemsWithValidation() {
		var configurator = configurator("src/test/resources/openapi/issue-331.yaml", "issue._331");
		generate(configurator);
		generate(configurator.addAdditionalProperty("clientId", "test"));
	}

	static void generate(CodegenConfigurator configurator) {
		var gen = new DefaultGenerator();
		gen.setGenerateMetadata(false);
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.APIS, "true");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODELS, "true");
		gen.opts(configurator.toClientOptInput()).generate();
	}
}
