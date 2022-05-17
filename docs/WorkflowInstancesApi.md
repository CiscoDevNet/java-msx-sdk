# WorkflowInstancesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelWorkflowInstance**](WorkflowInstancesApi.md#cancelWorkflowInstance) | **POST** /workflow/api/v8/workflows/instances/{id}/cancel | Cancels a workflow instance.
[**deleteWorkflowInstance**](WorkflowInstancesApi.md#deleteWorkflowInstance) | **DELETE** /workflow/api/v8/workflows/instances/{id} | Deletes a workflow instance.
[**getWorkflowInstance**](WorkflowInstancesApi.md#getWorkflowInstance) | **GET** /workflow/api/v8/workflows/instances/{id} | Returns a workflow instance.
[**getWorkflowInstanceAction**](WorkflowInstancesApi.md#getWorkflowInstanceAction) | **GET** /workflow/api/v8/workflows/instances/{id}/actions/{actionId} | Returns a workflow instance action.
[**getWorkflowInstancesList**](WorkflowInstancesApi.md#getWorkflowInstancesList) | **GET** /workflow/api/v8/workflows/{id}/instances/list | Returns a list of workflow instances.


<a name="cancelWorkflowInstance"></a>
# **cancelWorkflowInstance**
> WorkflowInstance cancelWorkflowInstance(id)

Cancels a workflow instance.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowInstancesApi apiInstance = new WorkflowInstancesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowInstance result = apiInstance.cancelWorkflowInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstancesApi#cancelWorkflowInstance");
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

[**WorkflowInstance**](WorkflowInstance.md)

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

<a name="deleteWorkflowInstance"></a>
# **deleteWorkflowInstance**
> WorkflowInstanceDeleteResponse deleteWorkflowInstance(id)

Deletes a workflow instance.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowInstancesApi apiInstance = new WorkflowInstancesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowInstanceDeleteResponse result = apiInstance.deleteWorkflowInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstancesApi#deleteWorkflowInstance");
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

[**WorkflowInstanceDeleteResponse**](WorkflowInstanceDeleteResponse.md)

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

<a name="getWorkflowInstance"></a>
# **getWorkflowInstance**
> WorkflowInstance getWorkflowInstance(id)

Returns a workflow instance.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowInstancesApi apiInstance = new WorkflowInstancesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowInstance result = apiInstance.getWorkflowInstance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstancesApi#getWorkflowInstance");
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

[**WorkflowInstance**](WorkflowInstance.md)

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

<a name="getWorkflowInstanceAction"></a>
# **getWorkflowInstanceAction**
> WorkflowAction getWorkflowInstanceAction(id, actionId)

Returns a workflow instance action.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowInstancesApi apiInstance = new WorkflowInstancesApi(defaultClient);
    String id = "id_example"; // String | 
    String actionId = "actionId_example"; // String | 
    try {
      WorkflowAction result = apiInstance.getWorkflowInstanceAction(id, actionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstancesApi#getWorkflowInstanceAction");
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
 **actionId** | **String**|  |

### Return type

[**WorkflowAction**](WorkflowAction.md)

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

<a name="getWorkflowInstancesList"></a>
# **getWorkflowInstancesList**
> List&lt;WorkflowInstance&gt; getWorkflowInstancesList(id, page, pageSize, dateFrom, dateTo)

Returns a list of workflow instances.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowInstancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowInstancesApi apiInstance = new WorkflowInstancesApi(defaultClient);
    String id = "id_example"; // String | 
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    LocalDate dateFrom = LocalDate.now(); // LocalDate | 
    LocalDate dateTo = LocalDate.now(); // LocalDate | 
    try {
      List<WorkflowInstance> result = apiInstance.getWorkflowInstancesList(id, page, pageSize, dateFrom, dateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowInstancesApi#getWorkflowInstancesList");
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
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **dateFrom** | **LocalDate**|  | [optional]
 **dateTo** | **LocalDate**|  | [optional]

### Return type

[**List&lt;WorkflowInstance&gt;**](WorkflowInstance.md)

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

