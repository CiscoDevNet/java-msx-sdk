# RegistrationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRegisteredProductVersion**](RegistrationApi.md#deleteRegisteredProductVersion) | **DELETE** /vulnerability/api/v8/vulnerabilities/registrations/{id} | Delete a registration.
[**getRegisteredProductVersionPage**](RegistrationApi.md#getRegisteredProductVersionPage) | **GET** /vulnerability/api/v8/vulnerabilities/registrations | Returns a filtered page of registered products / versions.
[**registerProductVersion**](RegistrationApi.md#registerProductVersion) | **POST** /vulnerability/api/v8/vulnerabilities/registrations | Register a product / verison combination for vulnerability inspection.


<a name="deleteRegisteredProductVersion"></a>
# **deleteRegisteredProductVersion**
> deleteRegisteredProductVersion(id)

Delete a registration.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.RegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RegistrationApi apiInstance = new RegistrationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteRegisteredProductVersion(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#deleteRegisteredProductVersion");
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
 **id** | **UUID**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getRegisteredProductVersionPage"></a>
# **getRegisteredProductVersionPage**
> VulnerabilitiesRegistrationPage getRegisteredProductVersionPage(page, pageSize, product, version)

Returns a filtered page of registered products / versions.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.RegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RegistrationApi apiInstance = new RegistrationApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    String product = "ios_xe"; // String | Product identifier (as defined in NIST's CPE dictionary) to filter by.
    String version = "12.3"; // String | Product version (as defined in NIST's CPE dictionary) filter to filter by.
    try {
      VulnerabilitiesRegistrationPage result = apiInstance.getRegisteredProductVersionPage(page, pageSize, product, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#getRegisteredProductVersionPage");
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
 **product** | **String**| Product identifier (as defined in NIST&#39;s CPE dictionary) to filter by. | [optional]
 **version** | **String**| Product version (as defined in NIST&#39;s CPE dictionary) filter to filter by. | [optional]

### Return type

[**VulnerabilitiesRegistrationPage**](VulnerabilitiesRegistrationPage.md)

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

<a name="registerProductVersion"></a>
# **registerProductVersion**
> VulnerabilityRegistration registerProductVersion(vulnerabilityRegistrationCreate)

Register a product / verison combination for vulnerability inspection.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.RegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    RegistrationApi apiInstance = new RegistrationApi(defaultClient);
    VulnerabilityRegistrationCreate vulnerabilityRegistrationCreate = new VulnerabilityRegistrationCreate(); // VulnerabilityRegistrationCreate | 
    try {
      VulnerabilityRegistration result = apiInstance.registerProductVersion(vulnerabilityRegistrationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#registerProductVersion");
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
 **vulnerabilityRegistrationCreate** | [**VulnerabilityRegistrationCreate**](VulnerabilityRegistrationCreate.md)|  |

### Return type

[**VulnerabilityRegistration**](VulnerabilityRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

