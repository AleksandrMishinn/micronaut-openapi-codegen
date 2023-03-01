package testapi.types;

/** Test client for {@link RequestApi}. **/
@io.micronaut.http.client.annotation.Client("/")
public interface RequestApiTestClient {

	@io.micronaut.http.annotation.Get("/no-operation-id")
	io.micronaut.http.HttpResponse<?> noOperationIdGet();
}