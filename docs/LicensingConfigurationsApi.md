# LicensingConfigurationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSmartAccountConfiguration**](LicensingConfigurationsApi.md#createSmartAccountConfiguration) | **POST** /licensing/api/v8/configuration | Creates a smart account configuration.
[**getSmartAccountConfiguration**](LicensingConfigurationsApi.md#getSmartAccountConfiguration) | **GET** /licensing/api/v8/configuration | Returns a smart account configuration.
[**updateSmartAccountConfiguration**](LicensingConfigurationsApi.md#updateSmartAccountConfiguration) | **PUT** /licensing/api/v8/configuration | Updates a smart account configuration.


<a name="createSmartAccountConfiguration"></a>
# **createSmartAccountConfiguration**
> SmartAccountConfiguration createSmartAccountConfiguration(smartAccountConfigurationCreate)

Creates a smart account configuration.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.LicensingConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LicensingConfigurationsApi apiInstance = new LicensingConfigurationsApi(defaultClient);
    SmartAccountConfigurationCreate smartAccountConfigurationCreate = new SmartAccountConfigurationCreate(); // SmartAccountConfigurationCreate | 
    try {
      SmartAccountConfiguration result = apiInstance.createSmartAccountConfiguration(smartAccountConfigurationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingConfigurationsApi#createSmartAccountConfiguration");
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
 **smartAccountConfigurationCreate** | [**SmartAccountConfigurationCreate**](SmartAccountConfigurationCreate.md)|  |

### Return type

[**SmartAccountConfiguration**](SmartAccountConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="getSmartAccountConfiguration"></a>
# **getSmartAccountConfiguration**
> SmartAccountConfiguration getSmartAccountConfiguration()

Returns a smart account configuration.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.LicensingConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LicensingConfigurationsApi apiInstance = new LicensingConfigurationsApi(defaultClient);
    try {
      SmartAccountConfiguration result = apiInstance.getSmartAccountConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingConfigurationsApi#getSmartAccountConfiguration");
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

[**SmartAccountConfiguration**](SmartAccountConfiguration.md)

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
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="updateSmartAccountConfiguration"></a>
# **updateSmartAccountConfiguration**
> SmartAccountConfiguration updateSmartAccountConfiguration(smartAccountConfigurationUpdate)

Updates a smart account configuration.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.LicensingConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    LicensingConfigurationsApi apiInstance = new LicensingConfigurationsApi(defaultClient);
    SmartAccountConfigurationUpdate smartAccountConfigurationUpdate = new SmartAccountConfigurationUpdate(); // SmartAccountConfigurationUpdate | 
    try {
      SmartAccountConfiguration result = apiInstance.updateSmartAccountConfiguration(smartAccountConfigurationUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LicensingConfigurationsApi#updateSmartAccountConfiguration");
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
 **smartAccountConfigurationUpdate** | [**SmartAccountConfigurationUpdate**](SmartAccountConfigurationUpdate.md)|  |

### Return type

[**SmartAccountConfiguration**](SmartAccountConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

