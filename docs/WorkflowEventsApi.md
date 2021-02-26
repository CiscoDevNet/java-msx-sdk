# WorkflowEventsApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflowEvent**](WorkflowEventsApi.md#createWorkflowEvent) | **POST** /workflow/api/v8/events | Creates a new workflow event.
[**deleteWorkflowEvent**](WorkflowEventsApi.md#deleteWorkflowEvent) | **DELETE** /workflow/api/v8/events/{id} | Deletes a workflow event.
[**getWorkflowEvent**](WorkflowEventsApi.md#getWorkflowEvent) | **GET** /workflow/api/v8/events/{id} | Returns a workflow event.
[**getWorkflowEventsList**](WorkflowEventsApi.md#getWorkflowEventsList) | **GET** /workflow/api/v8/events/list | Returns a list of workflow events.
[**updateWorkflowEvent**](WorkflowEventsApi.md#updateWorkflowEvent) | **PUT** /workflow/api/v8/events/{id} | Updates a workflow event.


<a name="createWorkflowEvent"></a>
# **createWorkflowEvent**
> WorkflowEvent createWorkflowEvent(workflowEventCreate)

Creates a new workflow event.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    WorkflowEventsApi apiInstance = new WorkflowEventsApi(defaultClient);
    WorkflowEventCreate workflowEventCreate = {"title":"Event One","description":"This is not the description you are looking for.","target_id":"01HTUSVW1CT4X66ht5sueGVrOatrKeh8wkK","schema_id":"01HQR51UJFSML2CKLOFnnYq7YgGQIgzmvHx","properties":{"title":"Event One","target_id":"01HTUSVW1CT4X66ht5sueGVrOatrKeh8wkK","topic_name":"TEST_TOPIC"}}; // WorkflowEventCreate | 
    try {
      WorkflowEvent result = apiInstance.createWorkflowEvent(workflowEventCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowEventsApi#createWorkflowEvent");
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
 **workflowEventCreate** | [**WorkflowEventCreate**](WorkflowEventCreate.md)|  |

### Return type

[**WorkflowEvent**](WorkflowEvent.md)

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

<a name="deleteWorkflowEvent"></a>
# **deleteWorkflowEvent**
> deleteWorkflowEvent(id)

Deletes a workflow event.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    WorkflowEventsApi apiInstance = new WorkflowEventsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteWorkflowEvent(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowEventsApi#deleteWorkflowEvent");
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

<a name="getWorkflowEvent"></a>
# **getWorkflowEvent**
> WorkflowEvent getWorkflowEvent(id)

Returns a workflow event.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    WorkflowEventsApi apiInstance = new WorkflowEventsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowEvent result = apiInstance.getWorkflowEvent(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowEventsApi#getWorkflowEvent");
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

[**WorkflowEvent**](WorkflowEvent.md)

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

<a name="getWorkflowEventsList"></a>
# **getWorkflowEventsList**
> List&lt;WorkflowEvent&gt; getWorkflowEventsList()

Returns a list of workflow events.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    WorkflowEventsApi apiInstance = new WorkflowEventsApi(defaultClient);
    try {
      List<WorkflowEvent> result = apiInstance.getWorkflowEventsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowEventsApi#getWorkflowEventsList");
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

[**List&lt;WorkflowEvent&gt;**](WorkflowEvent.md)

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

<a name="updateWorkflowEvent"></a>
# **updateWorkflowEvent**
> WorkflowEvent updateWorkflowEvent(id, workflowEventUpdate)

Updates a workflow event.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    WorkflowEventsApi apiInstance = new WorkflowEventsApi(defaultClient);
    String id = "id_example"; // String | 
    WorkflowEventUpdate workflowEventUpdate = {"title":"New Title","description":"All singing, all dancing event description.","target_id":"01HTV56F9BGYF7TPAc3p1WaP5ASSxPjvWkO","schema_id":"01HQR51UJFSML2CKLOFnnYq7YgGQIgzmvHx","properties":{"title":"New Title","target_id":"01HTV56F9BGYF7TPAc3p1WaP5ASSxPjvWkO","topic_name":"TEST_TOPIC"}}; // WorkflowEventUpdate | 
    try {
      WorkflowEvent result = apiInstance.updateWorkflowEvent(id, workflowEventUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowEventsApi#updateWorkflowEvent");
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
 **workflowEventUpdate** | [**WorkflowEventUpdate**](WorkflowEventUpdate.md)|  |

### Return type

[**WorkflowEvent**](WorkflowEvent.md)

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

