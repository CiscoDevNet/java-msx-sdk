# AuditingGenericEventsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGenericEvent**](AuditingGenericEventsApi.md#createGenericEvent) | **POST** /auditing/api/v8/genericevents | Create Generic Event


<a name="createGenericEvent"></a>
# **createGenericEvent**
> GenericEvent createGenericEvent(genericEventCreate)

Create Generic Event

Needs CREATE_AUDIT_GENERIC_EVENT_PERMISSION to create a Generic Event.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.AuditingGenericEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AuditingGenericEventsApi apiInstance = new AuditingGenericEventsApi(defaultClient);
    GenericEventCreate genericEventCreate = new GenericEventCreate(); // GenericEventCreate | 
    try {
      GenericEvent result = apiInstance.createGenericEvent(genericEventCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuditingGenericEventsApi#createGenericEvent");
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
 **genericEventCreate** | [**GenericEventCreate**](GenericEventCreate.md)|  |

### Return type

[**GenericEvent**](GenericEvent.md)

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

