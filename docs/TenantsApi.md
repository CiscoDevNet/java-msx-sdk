# TenantsApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenant**](TenantsApi.md#createTenant) | **POST** /idm/api/v8/tenants | Creates a new tenant.
[**deleteTenant**](TenantsApi.md#deleteTenant) | **DELETE** /idm/api/v8/tenants/{id} | Deletes a tenant by id.
[**getTenant**](TenantsApi.md#getTenant) | **GET** /idm/api/v8/tenants/{id} | Returns a tenant by id.
[**getTenantsList**](TenantsApi.md#getTenantsList) | **GET** /idm/api/v8/tenants/list | Returns a list of tenants.
[**getTenantsPage**](TenantsApi.md#getTenantsPage) | **GET** /idm/api/v8/tenants | Returns a page of tenants.
[**updateTenant**](TenantsApi.md#updateTenant) | **PUT** /idm/api/v8/tenants/{id} | Updates a tenant by id.


<a name="createTenant"></a>
# **createTenant**
> Tenant createTenant(tenantCreate)

Creates a new tenant.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    TenantCreate tenantCreate = {"name":"Acme Company","description":"An anvil for every roadrunner.","url":"https://cisco.com"}; // TenantCreate | 
    try {
      Tenant result = apiInstance.createTenant(tenantCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenant");
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
 **tenantCreate** | [**TenantCreate**](TenantCreate.md)|  |

### Return type

[**Tenant**](Tenant.md)

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
**500** | Internal Server Error |  -  |

<a name="deleteTenant"></a>
# **deleteTenant**
> deleteTenant(id)

Deletes a tenant by id.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteTenant(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#deleteTenant");
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
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="getTenant"></a>
# **getTenant**
> Tenant getTenant(id)

Returns a tenant by id.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      Tenant result = apiInstance.getTenant(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenant");
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

[**Tenant**](Tenant.md)

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

<a name="getTenantsList"></a>
# **getTenantsList**
> List&lt;Tenant&gt; getTenantsList(ids, showImage)

Returns a list of tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    List<UUID> ids = Arrays.asList(); // List<UUID> | 
    Boolean showImage = false; // Boolean | 
    try {
      List<Tenant> result = apiInstance.getTenantsList(ids, showImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantsList");
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
 **ids** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **showImage** | **Boolean**|  | [optional] [default to false]

### Return type

[**List&lt;Tenant&gt;**](Tenant.md)

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

<a name="getTenantsPage"></a>
# **getTenantsPage**
> TenantsPage getTenantsPage(page, pageSize, parentId, showImage, sortBy, sortOrder)

Returns a page of tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID parentId = new UUID(); // UUID | 
    Boolean showImage = false; // Boolean | 
    String sortBy = "name"; // String | 
    String sortOrder = "asc"; // String | 
    try {
      TenantsPage result = apiInstance.getTenantsPage(page, pageSize, parentId, showImage, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantsPage");
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
 **parentId** | [**UUID**](.md)|  | [optional]
 **showImage** | **Boolean**|  | [optional] [default to false]
 **sortBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional] [default to asc] [enum: asc, desc]

### Return type

[**TenantsPage**](TenantsPage.md)

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

<a name="updateTenant"></a>
# **updateTenant**
> Tenant updateTenant(id, tenantUpdate)

Updates a tenant by id.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TenantsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    TenantUpdate tenantUpdate = {"name":"Acme Company","description":"We sell rocket powered rollerskates.","url":"https://cisco.com"}; // TenantUpdate | 
    try {
      Tenant result = apiInstance.updateTenant(id, tenantUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenant");
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
 **tenantUpdate** | [**TenantUpdate**](TenantUpdate.md)|  |

### Return type

[**Tenant**](Tenant.md)

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

