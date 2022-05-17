# BillingPricesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPrice**](BillingPricesApi.md#addPrice) | **POST** /billing/api/v8/prices | Add price for tenant and event type.
[**deletePrice**](BillingPricesApi.md#deletePrice) | **DELETE** /billing/api/v8/prices/{id} | Delete a price.
[**getPrice**](BillingPricesApi.md#getPrice) | **GET** /billing/api/v8/prices/{id} | Get a price.
[**getPricesPage**](BillingPricesApi.md#getPricesPage) | **GET** /billing/api/v8/prices | Retrieve a page of prices.
[**updatePrice**](BillingPricesApi.md#updatePrice) | **PUT** /billing/api/v8/prices/{id} | Update price for an event type and tenant.


<a name="addPrice"></a>
# **addPrice**
> BillingPrice addPrice(billingPriceCreate)

Add price for tenant and event type.

Needs MANAGE_PRICES permission to allow for the creation of a price.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingPricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingPricesApi apiInstance = new BillingPricesApi(defaultClient);
    BillingPriceCreate billingPriceCreate = new BillingPriceCreate(); // BillingPriceCreate | 
    try {
      BillingPrice result = apiInstance.addPrice(billingPriceCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPricesApi#addPrice");
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
 **billingPriceCreate** | [**BillingPriceCreate**](BillingPriceCreate.md)|  |

### Return type

[**BillingPrice**](BillingPrice.md)

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

<a name="deletePrice"></a>
# **deletePrice**
> deletePrice(id)

Delete a price.

Needs MANAGE_PRICES permission to delete a price.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingPricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingPricesApi apiInstance = new BillingPricesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deletePrice(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPricesApi#deletePrice");
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

<a name="getPrice"></a>
# **getPrice**
> BillingPrice getPrice(id)

Get a price.

Needs VIEW_PRICES permission to get pricing detail.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingPricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingPricesApi apiInstance = new BillingPricesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      BillingPrice result = apiInstance.getPrice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPricesApi#getPrice");
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

[**BillingPrice**](BillingPrice.md)

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

<a name="getPricesPage"></a>
# **getPricesPage**
> BillingPricesPage getPricesPage(tenantId, page, pageSize, type, subtype)

Retrieve a page of prices.

Needs VIEW_PRICES permission to view the pricing details.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingPricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingPricesApi apiInstance = new BillingPricesApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    String type = "type_example"; // String | 
    String subtype = "subtype_example"; // String | 
    try {
      BillingPricesPage result = apiInstance.getPricesPage(tenantId, page, pageSize, type, subtype);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPricesApi#getPricesPage");
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
 **tenantId** | **UUID**|  |
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **type** | **String**|  | [optional]
 **subtype** | **String**|  | [optional]

### Return type

[**BillingPricesPage**](BillingPricesPage.md)

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

<a name="updatePrice"></a>
# **updatePrice**
> BillingPrice updatePrice(id, billingPriceUpdate)

Update price for an event type and tenant.

Needs MANAGE_PRICES permission to update a pricing detail.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingPricesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingPricesApi apiInstance = new BillingPricesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    BillingPriceUpdate billingPriceUpdate = new BillingPriceUpdate(); // BillingPriceUpdate | 
    try {
      BillingPrice result = apiInstance.updatePrice(id, billingPriceUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingPricesApi#updatePrice");
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
 **billingPriceUpdate** | [**BillingPriceUpdate**](BillingPriceUpdate.md)|  |

### Return type

[**BillingPrice**](BillingPrice.md)

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

