# LicensingAccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserAccountsList**](LicensingAccountsApi.md#getUserAccountsList) | **GET** /licensing/api/v8/accounts/smart/list | Returns a filtered page of smart accounts.


<a name="getUserAccountsList"></a>
# **getUserAccountsList**
> SmartUserAccounts getUserAccountsList(userId, domain, roleName, type)

Returns a filtered page of smart accounts.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.LicensingAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LicensingAccountsApi apiInstance = new LicensingAccountsApi(defaultClient);
    String userId = "bdavis"; // String | User Id
    String domain = "abhtest001.cisco.com"; // String | Smart Account domain
    String roleName = "AccountAdmin"; // String | Role Name
    SmartAccountType type = SmartAccountType.fromValue("CUSTOMER"); // SmartAccountType | 
    try {
      SmartUserAccounts result = apiInstance.getUserAccountsList(userId, domain, roleName, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingAccountsApi#getUserAccountsList");
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
 **userId** | **String**| User Id |
 **domain** | **String**| Smart Account domain | [optional]
 **roleName** | **String**| Role Name | [optional]
 **type** | [**SmartAccountType**](.md)|  | [optional] [enum: CUSTOMER, HOLDING]

### Return type

[**SmartUserAccounts**](SmartUserAccounts.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

