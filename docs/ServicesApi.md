# ServicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteService**](ServicesApi.md#deleteService) | **DELETE** /manage/api/v8/services/{id} | Deletes a service.
[**getService**](ServicesApi.md#getService) | **GET** /manage/api/v8/services/{id} | Returns a service.
[**getServicesPage**](ServicesApi.md#getServicesPage) | **GET** /manage/api/v8/services | Returns a page of services.
[**submitOrder**](ServicesApi.md#submitOrder) | **POST** /manage/api/v8/services | Submits an order.
[**updateOrder**](ServicesApi.md#updateOrder) | **PUT** /manage/api/v8/services | Updates an order.
[**updateService**](ServicesApi.md#updateService) | **PUT** /manage/api/v8/services/{id} | Updates a service.


<a name="deleteService"></a>
# **deleteService**
> deleteService(id)

Deletes a service.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteService(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#deleteService");
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

<a name="getService"></a>
# **getService**
> Service getService(id)

Returns a service.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Service result = apiInstance.getService(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#getService");
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

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getServicesPage"></a>
# **getServicesPage**
> ServicesPage getServicesPage(page, pageSize, tenantIds)

Returns a page of services.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    List<UUID> tenantIds = Arrays.asList(); // List<UUID> | 
    try {
      ServicesPage result = apiInstance.getServicesPage(page, pageSize, tenantIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#getServicesPage");
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
 **tenantIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]

### Return type

[**ServicesPage**](ServicesPage.md)

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

<a name="submitOrder"></a>
# **submitOrder**
> LegacyServiceOrderResponse submitOrder(productId, offerId, legacyServiceOrder)

Submits an order.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID offerId = UUID.randomUUID(); // UUID | 
    LegacyServiceOrder legacyServiceOrder = new LegacyServiceOrder(); // LegacyServiceOrder | 
    try {
      LegacyServiceOrderResponse result = apiInstance.submitOrder(productId, offerId, legacyServiceOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#submitOrder");
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
 **productId** | **UUID**|  |
 **offerId** | **UUID**|  |
 **legacyServiceOrder** | [**LegacyServiceOrder**](LegacyServiceOrder.md)|  |

### Return type

[**LegacyServiceOrderResponse**](LegacyServiceOrderResponse.md)

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

<a name="updateOrder"></a>
# **updateOrder**
> LegacyServiceOrderResponse updateOrder(productId, offerId, legacyServiceOrder)

Updates an order.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | 
    UUID offerId = UUID.randomUUID(); // UUID | 
    LegacyServiceOrder legacyServiceOrder = new LegacyServiceOrder(); // LegacyServiceOrder | 
    try {
      LegacyServiceOrderResponse result = apiInstance.updateOrder(productId, offerId, legacyServiceOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#updateOrder");
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
 **productId** | **UUID**|  |
 **offerId** | **UUID**|  |
 **legacyServiceOrder** | [**LegacyServiceOrder**](LegacyServiceOrder.md)|  |

### Return type

[**LegacyServiceOrderResponse**](LegacyServiceOrderResponse.md)

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

<a name="updateService"></a>
# **updateService**
> Service updateService(id, serviceUpdate)

Updates a service.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ServicesApi apiInstance = new ServicesApi(defaultClient);
    String id = "id_example"; // String | 
    ServiceUpdate serviceUpdate = new ServiceUpdate(); // ServiceUpdate | 
    try {
      Service result = apiInstance.updateService(id, serviceUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServicesApi#updateService");
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
 **serviceUpdate** | [**ServiceUpdate**](ServiceUpdate.md)|  |

### Return type

[**Service**](Service.md)

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

