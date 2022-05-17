# BillingEventsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostSummary**](BillingEventsApi.md#getCostSummary) | **GET** /billing/api/v8/events/costs | Retrieve a summary for tenant cost.
[**getEvent**](BillingEventsApi.md#getEvent) | **GET** /billing/api/v8/events/{id} | Get an Event.
[**getEventsPage**](BillingEventsApi.md#getEventsPage) | **GET** /billing/api/v8/events | Retrieve a page of events for tenant.


<a name="getCostSummary"></a>
# **getCostSummary**
> BillingCostsReport getCostSummary(tenantId, fromDate, toDate, groupBy)

Retrieve a summary for tenant cost.

Needs VIEW_COSTS permission to view cost details.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingEventsApi apiInstance = new BillingEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    OffsetDateTime fromDate = OffsetDateTime.parse("2020-09-18T18:37:33.810Z"); // OffsetDateTime | 
    OffsetDateTime toDate = OffsetDateTime.parse("2020-09-19T18:37:33.810Z"); // OffsetDateTime | 
    String groupBy = "type, subtype or service"; // String | 
    try {
      BillingCostsReport result = apiInstance.getCostSummary(tenantId, fromDate, toDate, groupBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingEventsApi#getCostSummary");
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
 **fromDate** | **OffsetDateTime**|  | [optional]
 **toDate** | **OffsetDateTime**|  | [optional]
 **groupBy** | **String**|  | [optional]

### Return type

[**BillingCostsReport**](BillingCostsReport.md)

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

<a name="getEvent"></a>
# **getEvent**
> BillingEvent getEvent(id)

Get an Event.

Needs VIEW_EVENTS permission to get a billing event.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingEventsApi apiInstance = new BillingEventsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      BillingEvent result = apiInstance.getEvent(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingEventsApi#getEvent");
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

[**BillingEvent**](BillingEvent.md)

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

<a name="getEventsPage"></a>
# **getEventsPage**
> BillingEventsPage getEventsPage(tenantId, page, pageSize, fromDate, toDate, type, subtype)

Retrieve a page of events for tenant.

Needs VIEW_EVENTS permission to view the billing events.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.BillingEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    BillingEventsApi apiInstance = new BillingEventsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    OffsetDateTime fromDate = OffsetDateTime.parse("2020-09-18T18:37:33.810Z"); // OffsetDateTime | 
    OffsetDateTime toDate = OffsetDateTime.parse("2020-09-19T18:37:33.810Z"); // OffsetDateTime | 
    String type = "type_example"; // String | 
    String subtype = "subtype_example"; // String | 
    try {
      BillingEventsPage result = apiInstance.getEventsPage(tenantId, page, pageSize, fromDate, toDate, type, subtype);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingEventsApi#getEventsPage");
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
 **fromDate** | **OffsetDateTime**|  | [optional]
 **toDate** | **OffsetDateTime**|  | [optional]
 **type** | **String**|  | [optional]
 **subtype** | **String**|  | [optional]

### Return type

[**BillingEventsPage**](BillingEventsPage.md)

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

