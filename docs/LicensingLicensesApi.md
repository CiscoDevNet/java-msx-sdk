# LicensingLicensesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLicensesList**](LicensingLicensesApi.md#getLicensesList) | **GET** /licensing/api/v8/licensing/api/v8/licenses/list | Returns a filtered list of licenses.


<a name="getLicensesList"></a>
# **getLicensesList**
> List&lt;LicenseSummary&gt; getLicensesList(smartAccountId, virtualAccountId)

Returns a filtered list of licenses.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.LicensingLicensesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LicensingLicensesApi apiInstance = new LicensingLicensesApi(defaultClient);
    String smartAccountId = "295183"; // String | Smart Account Identifier
    String virtualAccountId = "123123"; // String | Virtual Account Identifier
    try {
      List<LicenseSummary> result = apiInstance.getLicensesList(smartAccountId, virtualAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingLicensesApi#getLicensesList");
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
 **smartAccountId** | **String**| Smart Account Identifier |
 **virtualAccountId** | **String**| Virtual Account Identifier |

### Return type

[**List&lt;LicenseSummary&gt;**](LicenseSummary.md)

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

