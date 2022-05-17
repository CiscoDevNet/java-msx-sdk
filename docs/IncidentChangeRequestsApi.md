# IncidentChangeRequestsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChangeRequest**](IncidentChangeRequestsApi.md#createChangeRequest) | **POST** /incident/api/v8/changerequests | Create a change request.
[**deleteChangeRequest**](IncidentChangeRequestsApi.md#deleteChangeRequest) | **DELETE** /incident/api/v8/changerequests/{id} | Deletes a change request.
[**getChangeRequest**](IncidentChangeRequestsApi.md#getChangeRequest) | **GET** /incident/api/v8/changerequests/{id} | Returns a change request.
[**getChangeRequestsPage**](IncidentChangeRequestsApi.md#getChangeRequestsPage) | **GET** /incident/api/v8/changerequests | Returns a filtered list of change requests.
[**updateChangeRequest**](IncidentChangeRequestsApi.md#updateChangeRequest) | **PUT** /incident/api/v8/changerequests/{id} | Updates a change request.


<a name="createChangeRequest"></a>
# **createChangeRequest**
> ChangeRequest createChangeRequest(changeRequestCreate)

Create a change request.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentChangeRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentChangeRequestsApi apiInstance = new IncidentChangeRequestsApi(defaultClient);
    ChangeRequestCreate changeRequestCreate = new ChangeRequestCreate(); // ChangeRequestCreate | 
    try {
      ChangeRequest result = apiInstance.createChangeRequest(changeRequestCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentChangeRequestsApi#createChangeRequest");
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
 **changeRequestCreate** | [**ChangeRequestCreate**](ChangeRequestCreate.md)|  |

### Return type

[**ChangeRequest**](ChangeRequest.md)

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

<a name="deleteChangeRequest"></a>
# **deleteChangeRequest**
> deleteChangeRequest(id, tenantId)

Deletes a change request.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentChangeRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentChangeRequestsApi apiInstance = new IncidentChangeRequestsApi(defaultClient);
    String id = "id_example"; // String | 
    UUID tenantId = UUID.randomUUID(); // UUID | Required for bi-directional scenario
    try {
      apiInstance.deleteChangeRequest(id, tenantId);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentChangeRequestsApi#deleteChangeRequest");
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
 **id** | **String**|  |
 **tenantId** | **UUID**| Required for bi-directional scenario | [optional]

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

<a name="getChangeRequest"></a>
# **getChangeRequest**
> ChangeRequest getChangeRequest(id, tenantId)

Returns a change request.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentChangeRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentChangeRequestsApi apiInstance = new IncidentChangeRequestsApi(defaultClient);
    String id = "id_example"; // String | Change Request Number  CHG0030022
    UUID tenantId = UUID.randomUUID(); // UUID | Required for bi-directional scenario
    try {
      ChangeRequest result = apiInstance.getChangeRequest(id, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentChangeRequestsApi#getChangeRequest");
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
 **id** | **String**| Change Request Number  CHG0030022 |
 **tenantId** | **UUID**| Required for bi-directional scenario | [optional]

### Return type

[**ChangeRequest**](ChangeRequest.md)

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

<a name="getChangeRequestsPage"></a>
# **getChangeRequestsPage**
> ChangeRequestsPage getChangeRequestsPage(page, pageSize, tenantId)

Returns a filtered list of change requests.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentChangeRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentChangeRequestsApi apiInstance = new IncidentChangeRequestsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    try {
      ChangeRequestsPage result = apiInstance.getChangeRequestsPage(page, pageSize, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentChangeRequestsApi#getChangeRequestsPage");
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
 **tenantId** | **UUID**|  | [optional]

### Return type

[**ChangeRequestsPage**](ChangeRequestsPage.md)

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

<a name="updateChangeRequest"></a>
# **updateChangeRequest**
> ChangeRequest updateChangeRequest(id, changeRequestUpdate)

Updates a change request.

Update change requests. Returns not found, if passed in tenant&#39;s serviceNow instance does not hold the record.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentChangeRequestsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentChangeRequestsApi apiInstance = new IncidentChangeRequestsApi(defaultClient);
    String id = "id_example"; // String | 
    ChangeRequestUpdate changeRequestUpdate = new ChangeRequestUpdate(); // ChangeRequestUpdate | 
    try {
      ChangeRequest result = apiInstance.updateChangeRequest(id, changeRequestUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentChangeRequestsApi#updateChangeRequest");
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
 **id** | **String**|  |
 **changeRequestUpdate** | [**ChangeRequestUpdate**](ChangeRequestUpdate.md)|  |

### Return type

[**ChangeRequest**](ChangeRequest.md)

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

