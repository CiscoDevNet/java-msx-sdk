# BillingCyclesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBillingCycle**](BillingCyclesApi.md#addBillingCycle) | **POST** /billing/api/v8/cycles | Add a billing cycle.
[**deleteBillingCycle**](BillingCyclesApi.md#deleteBillingCycle) | **DELETE** /billing/api/v8/cycles/{id} | Delete a billing cycle.
[**getBillingCycle**](BillingCyclesApi.md#getBillingCycle) | **GET** /billing/api/v8/cycles/{id} | Get a billing cycle.
[**getBillingCyclesPage**](BillingCyclesApi.md#getBillingCyclesPage) | **GET** /billing/api/v8/cycles | Retrieve a page of billing cycles.
[**processBillingCycle**](BillingCyclesApi.md#processBillingCycle) | **POST** /billing/api/v8/cycles/process | Process a billing cycle.
[**updateBillingCycle**](BillingCyclesApi.md#updateBillingCycle) | **PUT** /billing/api/v8/cycles/{id} | Update billing cycle for an event type and tenant.


<a name="addBillingCycle"></a>
# **addBillingCycle**
> BillingCycle addBillingCycle(billingCycleCreate)

Add a billing cycle.

Needs MANAGE_BILLINGCYCLE permission to allow for the creation a billing cycle.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingCyclesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingCyclesApi apiInstance = new BillingCyclesApi(defaultClient);
    BillingCycleCreate billingCycleCreate = new BillingCycleCreate(); // BillingCycleCreate | 
    try {
      BillingCycle result = apiInstance.addBillingCycle(billingCycleCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingCyclesApi#addBillingCycle");
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
 **billingCycleCreate** | [**BillingCycleCreate**](BillingCycleCreate.md)|  |

### Return type

[**BillingCycle**](BillingCycle.md)

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

<a name="deleteBillingCycle"></a>
# **deleteBillingCycle**
> deleteBillingCycle(id)

Delete a billing cycle.

Needs MANAGE_BILLINGCYCLE permission to delete a billing cycle.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingCyclesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingCyclesApi apiInstance = new BillingCyclesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteBillingCycle(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingCyclesApi#deleteBillingCycle");
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
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getBillingCycle"></a>
# **getBillingCycle**
> BillingCycle getBillingCycle(id)

Get a billing cycle.

Needs VIEW_BILLINGCYCLE permission to get billing cycle detail.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingCyclesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingCyclesApi apiInstance = new BillingCyclesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      BillingCycle result = apiInstance.getBillingCycle(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingCyclesApi#getBillingCycle");
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

[**BillingCycle**](BillingCycle.md)

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

<a name="getBillingCyclesPage"></a>
# **getBillingCyclesPage**
> BillingCyclesPage getBillingCyclesPage(tenantId, page, pageSize, nextBilledOn)

Retrieve a page of billing cycles.

Needs VIEW_BILLINGCYCLE permission to view the billing cycle details.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingCyclesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingCyclesApi apiInstance = new BillingCyclesApi(defaultClient);
    UUID tenantId = new UUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    OffsetDateTime nextBilledOn = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      BillingCyclesPage result = apiInstance.getBillingCyclesPage(tenantId, page, pageSize, nextBilledOn);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingCyclesApi#getBillingCyclesPage");
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
 **tenantId** | [**UUID**](.md)|  |
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **nextBilledOn** | **OffsetDateTime**|  | [optional]

### Return type

[**BillingCyclesPage**](BillingCyclesPage.md)

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

<a name="processBillingCycle"></a>
# **processBillingCycle**
> BillingCycleProcessAccepted processBillingCycle(billingCycleProcess)

Process a billing cycle.

Needs MANAGE_BILLINGCYCLE permission to allow for the creation a billing cycle.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingCyclesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingCyclesApi apiInstance = new BillingCyclesApi(defaultClient);
    BillingCycleProcess billingCycleProcess = new BillingCycleProcess(); // BillingCycleProcess | 
    try {
      BillingCycleProcessAccepted result = apiInstance.processBillingCycle(billingCycleProcess);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingCyclesApi#processBillingCycle");
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
 **billingCycleProcess** | [**BillingCycleProcess**](BillingCycleProcess.md)|  |

### Return type

[**BillingCycleProcessAccepted**](BillingCycleProcessAccepted.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

<a name="updateBillingCycle"></a>
# **updateBillingCycle**
> BillingCycle updateBillingCycle(id, billingCycleUpdate)

Update billing cycle for an event type and tenant.

Needs MANAGE_BILLINGCYCLE permission to update a billing cycle detail.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingCyclesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingCyclesApi apiInstance = new BillingCyclesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    BillingCycleUpdate billingCycleUpdate = new BillingCycleUpdate(); // BillingCycleUpdate | 
    try {
      BillingCycle result = apiInstance.updateBillingCycle(id, billingCycleUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingCyclesApi#updateBillingCycle");
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
 **billingCycleUpdate** | [**BillingCycleUpdate**](BillingCycleUpdate.md)|  |

### Return type

[**BillingCycle**](BillingCycle.md)

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

