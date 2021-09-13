# SecurityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccessToken**](SecurityApi.md#getAccessToken) | **POST** /idm/v2/token | Returns an access token.


<a name="getAccessToken"></a>
# **getAccessToken**
> AccessToken getAccessToken(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName)

Returns an access token.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SecurityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    SecurityApi apiInstance = new SecurityApi(defaultClient);
    String authorization = "authorization_example"; // String | 
    String grantType = "grantType_example"; // String | 
    String username = "username_example"; // String | 
    String password = "password_example"; // String | 
    String accessToken = "accessToken_example"; // String | 
    String switchUsername = "switchUsername_example"; // String | 
    UUID tenantId = new UUID(); // UUID | 
    String scope = "scope_example"; // String | 
    String nonce = "nonce_example"; // String | 
    String tenantName = "tenantName_example"; // String | 
    try {
      AccessToken result = apiInstance.getAccessToken(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityApi#getAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**|  |
 **grantType** | **String**|  |
 **username** | **String**|  | [optional]
 **password** | **String**|  | [optional]
 **accessToken** | **String**|  | [optional]
 **switchUsername** | **String**|  | [optional]
 **tenantId** | [**UUID**](UUID.md)|  | [optional]
 **scope** | **String**|  | [optional]
 **nonce** | **String**|  | [optional]
 **tenantName** | **String**|  | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**0** | Failed |  -  |

