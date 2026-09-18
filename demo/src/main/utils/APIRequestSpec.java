import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class APIRequestSpec {

    private RequestSpecification reqSpec;
//Send request without path and query param
    public Response sendRequest(String url,String uri,HashMap<String, String> headers ){
        return reqSpec.basePath(url).baseUri(url).headers(headers).get();
    }
//SEND REQUEST WITH PATH PARAM
   public Response sendRequest(String url,String uri,HashMap<String, String> headers, HashMap<String, String> pathParam){
        return reqSpec.basePath(url).baseUri(url).headers(headers).pathParams(pathParam).get();
    }
//SEND REQUEST With QUERY PARAM
      public Response sendRequest(String url,String uri,HashMap<String, String> headers, HashMap<String, String> pathParam, HashMap<String, String> queryParam){
        return reqSpec.basePath(url).baseUri(url).headers(headers).queryParams(queryParam).get();
    }

    //Send request without path and query param
    public Response sendPost(String url,String uri,Object body,HashMap<String, String> headers ){
        return reqSpec.basePath(url).baseUri(url).body(body).headers(headers).post();
    }

     
}