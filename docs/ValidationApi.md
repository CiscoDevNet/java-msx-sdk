# ValidationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getValidateProductVersionPage**](ValidationApi.md#getValidateProductVersionPage) | **GET** /vulnerability/api/v8/vulnerabilities/validations | Returns a filtered page of validations.
[**validateProductVersion**](ValidationApi.md#validateProductVersion) | **POST** /vulnerability/api/v8/vulnerabilities/validations | Validate registered product / verison combinations for vulnerabilities.


<a name="getValidateProductVersionPage"></a>
# **getValidateProductVersionPage**
> VulnerabilityValidationPage getValidateProductVersionPage(page, pageSize, startDate, endDate)

Returns a filtered page of validations.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    OffsetDateTime startDate = OffsetDateTime.parse("2020-01-15T18:15Z"); // OffsetDateTime | Start date for date range filter on validation execution date.
    OffsetDateTime endDate = OffsetDateTime.parse("2021-01-15T18:15Z"); // OffsetDateTime | End date for date range filter on validation execution date.
    try {
      VulnerabilityValidationPage result = apiInstance.getValidateProductVersionPage(page, pageSize, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#getValidateProductVersionPage");
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
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **startDate** | **OffsetDateTime**| Start date for date range filter on validation execution date. | [optional]
 **endDate** | **OffsetDateTime**| End date for date range filter on validation execution date. | [optional]

### Return type

[**VulnerabilityValidationPage**](VulnerabilityValidationPage.md)

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

<a name="validateProductVersion"></a>
# **validateProductVersion**
> VulnerabilityValidation validateProductVersion()

Validate registered product / verison combinations for vulnerabilities.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ValidationApi apiInstance = new ValidationApi(defaultClient);
    try {
      VulnerabilityValidation result = apiInstance.validateProductVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ValidationApi#validateProductVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VulnerabilityValidation**](VulnerabilityValidation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

