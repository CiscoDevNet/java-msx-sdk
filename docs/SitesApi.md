# SitesApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDevicesToSite**](SitesApi.md#addDevicesToSite) | **POST** /manage/api/v8/sites/{id}/devices/add | Add devices to a site.
[**addServicesToSite**](SitesApi.md#addServicesToSite) | **POST** /manage/api/v8/sites/{id}/services/add | Add services to a site.
[**createSite**](SitesApi.md#createSite) | **POST** /manage/api/v8/sites | Creates a new site.
[**deleteSite**](SitesApi.md#deleteSite) | **DELETE** /manage/api/v8/sites/{id} | Deletes a site.
[**getSite**](SitesApi.md#getSite) | **GET** /manage/api/v8/sites/{id} | Returns a site.
[**getSitesPage**](SitesApi.md#getSitesPage) | **GET** /manage/api/v8/sites | Returns a page of Sites. Only one filter is supported at a time.
[**removeDevicesFromSite**](SitesApi.md#removeDevicesFromSite) | **POST** /manage/api/v8/sites/{id}/devices/remove | Removes devices from a site.
[**removeServicesFromSite**](SitesApi.md#removeServicesFromSite) | **POST** /manage/api/v8/sites/{id}/services/remove | Remove services from a site.
[**updateSite**](SitesApi.md#updateSite) | **PUT** /manage/api/v8/sites/{id} | Updates a site.


<a name="addDevicesToSite"></a>
# **addDevicesToSite**
> Site addDevicesToSite(id, requestBody)

Add devices to a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      Site result = apiInstance.addDevicesToSite(id, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#addDevicesToSite");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**Site**](Site.md)

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

<a name="addServicesToSite"></a>
# **addServicesToSite**
> Site addServicesToSite(id, requestBody)

Add services to a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      Site result = apiInstance.addServicesToSite(id, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#addServicesToSite");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**Site**](Site.md)

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

<a name="createSite"></a>
# **createSite**
> Site createSite(siteCreate)

Creates a new site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    SiteCreate siteCreate = new SiteCreate(); // SiteCreate | 
    try {
      Site result = apiInstance.createSite(siteCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#createSite");
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
 **siteCreate** | [**SiteCreate**](SiteCreate.md)|  |

### Return type

[**Site**](Site.md)

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

<a name="deleteSite"></a>
# **deleteSite**
> deleteSite(id)

Deletes a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteSite(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#deleteSite");
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

<a name="getSite"></a>
# **getSite**
> Site getSite(id, showImage)

Returns a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    Boolean showImage = false; // Boolean | 
    try {
      Site result = apiInstance.getSite(id, showImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#getSite");
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
 **showImage** | **Boolean**|  | [optional] [default to false]

### Return type

[**Site**](Site.md)

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

<a name="getSitesPage"></a>
# **getSitesPage**
> SitesPage getSitesPage(page, pageSize, tenantId, serviceId, serviceType, deviceId, parentId, type, managingControlPlaneId, showImage)

Returns a page of Sites. Only one filter is supported at a time.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID tenantId = new UUID(); // UUID | 
    String serviceId = "serviceId_example"; // String | 
    String serviceType = "serviceType_example"; // String | 
    String deviceId = "deviceId_example"; // String | 
    String parentId = "parentId_example"; // String | 
    String type = "type_example"; // String | 
    String managingControlPlaneId = "managingControlPlaneId_example"; // String | 
    Boolean showImage = false; // Boolean | 
    try {
      SitesPage result = apiInstance.getSitesPage(page, pageSize, tenantId, serviceId, serviceType, deviceId, parentId, type, managingControlPlaneId, showImage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#getSitesPage");
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
 **serviceId** | **String**|  | [optional]
 **serviceType** | **String**|  | [optional]
 **deviceId** | **String**|  | [optional]
 **parentId** | **String**|  | [optional]
 **type** | **String**|  | [optional]
 **managingControlPlaneId** | **String**|  | [optional]
 **showImage** | **Boolean**|  | [optional] [default to false]

### Return type

[**SitesPage**](SitesPage.md)

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

<a name="removeDevicesFromSite"></a>
# **removeDevicesFromSite**
> Site removeDevicesFromSite(id, requestBody)

Removes devices from a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      Site result = apiInstance.removeDevicesFromSite(id, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#removeDevicesFromSite");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**Site**](Site.md)

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

<a name="removeServicesFromSite"></a>
# **removeServicesFromSite**
> Site removeServicesFromSite(id, requestBody)

Remove services from a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    String id = "id_example"; // String | 
    List<String> requestBody = Arrays.asList(); // List<String> | 
    try {
      Site result = apiInstance.removeServicesFromSite(id, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#removeServicesFromSite");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**Site**](Site.md)

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

<a name="updateSite"></a>
# **updateSite**
> Site updateSite(id, siteUpdate, sendNotification)

Updates a site.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.SitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    SitesApi apiInstance = new SitesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    SiteUpdate siteUpdate = new SiteUpdate(); // SiteUpdate | 
    Boolean sendNotification = false; // Boolean | 
    try {
      Site result = apiInstance.updateSite(id, siteUpdate, sendNotification);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SitesApi#updateSite");
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
 **siteUpdate** | [**SiteUpdate**](SiteUpdate.md)|  |
 **sendNotification** | **Boolean**|  | [optional] [default to false]

### Return type

[**Site**](Site.md)

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

