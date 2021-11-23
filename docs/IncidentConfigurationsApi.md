# IncidentConfigurationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceNowConfiguration**](IncidentConfigurationsApi.md#createServiceNowConfiguration) | **POST** /incident/api/v8/configurations | Creates a ServiceNow configuration.
[**deleteServiceNowConfiguration**](IncidentConfigurationsApi.md#deleteServiceNowConfiguration) | **DELETE** /incident/api/v8/configurations/{id} | Deletes a ServiceNow configuration.
[**getConfiguration**](IncidentConfigurationsApi.md#getConfiguration) | **GET** /incident/api/v1/config | API to get configuration of encloud service.
[**getServiceNowConfiguration**](IncidentConfigurationsApi.md#getServiceNowConfiguration) | **GET** /incident/api/v8/configurations/{id} | Returns a ServiceNow configuration.
[**getServiceNowConfigurationsPage**](IncidentConfigurationsApi.md#getServiceNowConfigurationsPage) | **GET** /incident/api/v8/configurations | Returns a ServiceNow configurations.
[**patchConfiguration**](IncidentConfigurationsApi.md#patchConfiguration) | **PATCH** /incident/api/v1/config | API to patch configure encloud service
[**updateConfiguration**](IncidentConfigurationsApi.md#updateConfiguration) | **PUT** /incident/api/v1/config | API to configure encloud service.


<a name="createServiceNowConfiguration"></a>
# **createServiceNowConfiguration**
> ServiceNowConfiguration createServiceNowConfiguration(serviceNowConfigurationCreate)

Creates a ServiceNow configuration.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    ServiceNowConfigurationCreate serviceNowConfigurationCreate = new ServiceNowConfigurationCreate(); // ServiceNowConfigurationCreate | 
    try {
      ServiceNowConfiguration result = apiInstance.createServiceNowConfiguration(serviceNowConfigurationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#createServiceNowConfiguration");
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
 **serviceNowConfigurationCreate** | [**ServiceNowConfigurationCreate**](ServiceNowConfigurationCreate.md)|  |

### Return type

[**ServiceNowConfiguration**](ServiceNowConfiguration.md)

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

<a name="deleteServiceNowConfiguration"></a>
# **deleteServiceNowConfiguration**
> deleteServiceNowConfiguration(id)

Deletes a ServiceNow configuration.

Delete service now configuration, only if no associated entities exists.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteServiceNowConfiguration(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#deleteServiceNowConfiguration");
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
 **id** | [**UUID**](.md)|  |

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
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getConfiguration"></a>
# **getConfiguration**
> IncidentConfig getConfiguration()

API to get configuration of encloud service.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    try {
      IncidentConfig result = apiInstance.getConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#getConfiguration");
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

[**IncidentConfig**](IncidentConfig.md)

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

<a name="getServiceNowConfiguration"></a>
# **getServiceNowConfiguration**
> ServiceNowConfiguration getServiceNowConfiguration(id)

Returns a ServiceNow configuration.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      ServiceNowConfiguration result = apiInstance.getServiceNowConfiguration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#getServiceNowConfiguration");
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
 **id** | [**UUID**](.md)|  |

### Return type

[**ServiceNowConfiguration**](ServiceNowConfiguration.md)

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

<a name="getServiceNowConfigurationsPage"></a>
# **getServiceNowConfigurationsPage**
> ServiceNowConfigurationsPage getServiceNowConfigurationsPage(page, pageSize, tenantId, domain)

Returns a ServiceNow configurations.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID tenantId = new UUID(); // UUID | 
    String domain = "domain_example"; // String | 
    try {
      ServiceNowConfigurationsPage result = apiInstance.getServiceNowConfigurationsPage(page, pageSize, tenantId, domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#getServiceNowConfigurationsPage");
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
 **tenantId** | [**UUID**](.md)|  | [optional]
 **domain** | **String**|  | [optional]

### Return type

[**ServiceNowConfigurationsPage**](ServiceNowConfigurationsPage.md)

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

<a name="patchConfiguration"></a>
# **patchConfiguration**
> IncidentConfig patchConfiguration(incidentConfigPatch)

API to patch configure encloud service

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    IncidentConfigPatch incidentConfigPatch = new IncidentConfigPatch(); // IncidentConfigPatch | 
    try {
      IncidentConfig result = apiInstance.patchConfiguration(incidentConfigPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#patchConfiguration");
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
 **incidentConfigPatch** | [**IncidentConfigPatch**](IncidentConfigPatch.md)|  |

### Return type

[**IncidentConfig**](IncidentConfig.md)

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
**500** | Internal Server Error |  -  |

<a name="updateConfiguration"></a>
# **updateConfiguration**
> IncidentConfig updateConfiguration(incidentConfigUpdate)

API to configure encloud service.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentConfigurationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentConfigurationsApi apiInstance = new IncidentConfigurationsApi(defaultClient);
    IncidentConfigUpdate incidentConfigUpdate = new IncidentConfigUpdate(); // IncidentConfigUpdate | 
    try {
      IncidentConfig result = apiInstance.updateConfiguration(incidentConfigUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentConfigurationsApi#updateConfiguration");
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
 **incidentConfigUpdate** | [**IncidentConfigUpdate**](IncidentConfigUpdate.md)|  |

### Return type

[**IncidentConfig**](IncidentConfig.md)

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
**500** | Internal Server Error |  -  |

