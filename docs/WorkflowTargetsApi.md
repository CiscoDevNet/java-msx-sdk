# WorkflowTargetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflowTarget**](WorkflowTargetsApi.md#createWorkflowTarget) | **POST** /workflow/api/v8/targets | Creates a new workflow target.
[**deleteWorkflowTarget**](WorkflowTargetsApi.md#deleteWorkflowTarget) | **DELETE** /workflow/api/v8/targets/{id} | Deletes a workflow target.
[**getWorkflowTarget**](WorkflowTargetsApi.md#getWorkflowTarget) | **GET** /workflow/api/v8/targets/{id} | Returns a workflow target.
[**getWorkflowTargetsList**](WorkflowTargetsApi.md#getWorkflowTargetsList) | **GET** /workflow/api/v8/targets/list | Returns a list of workflow targets.
[**updateWorkflowTarget**](WorkflowTargetsApi.md#updateWorkflowTarget) | **PUT** /workflow/api/v8/targets/{id} | Updates a workflow target.


<a name="createWorkflowTarget"></a>
# **createWorkflowTarget**
> WorkflowTarget createWorkflowTarget(workflowTargetCreate)

Creates a new workflow target.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowTargetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowTargetsApi apiInstance = new WorkflowTargetsApi(defaultClient);
    WorkflowTargetCreate workflowTargetCreate = new WorkflowTargetCreate(); // WorkflowTargetCreate | 
    try {
      WorkflowTarget result = apiInstance.createWorkflowTarget(workflowTargetCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTargetsApi#createWorkflowTarget");
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
 **workflowTargetCreate** | [**WorkflowTargetCreate**](WorkflowTargetCreate.md)|  |

### Return type

[**WorkflowTarget**](WorkflowTarget.md)

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

<a name="deleteWorkflowTarget"></a>
# **deleteWorkflowTarget**
> deleteWorkflowTarget(id)

Deletes a workflow target.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowTargetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowTargetsApi apiInstance = new WorkflowTargetsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteWorkflowTarget(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTargetsApi#deleteWorkflowTarget");
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

<a name="getWorkflowTarget"></a>
# **getWorkflowTarget**
> WorkflowTarget getWorkflowTarget(id)

Returns a workflow target.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowTargetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowTargetsApi apiInstance = new WorkflowTargetsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowTarget result = apiInstance.getWorkflowTarget(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTargetsApi#getWorkflowTarget");
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

[**WorkflowTarget**](WorkflowTarget.md)

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

<a name="getWorkflowTargetsList"></a>
# **getWorkflowTargetsList**
> List&lt;WorkflowTarget&gt; getWorkflowTargetsList(internal, type)

Returns a list of workflow targets.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowTargetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowTargetsApi apiInstance = new WorkflowTargetsApi(defaultClient);
    Boolean internal = true; // Boolean | 
    String type = "type_example"; // String | 
    try {
      List<WorkflowTarget> result = apiInstance.getWorkflowTargetsList(internal, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTargetsApi#getWorkflowTargetsList");
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
 **internal** | **Boolean**|  | [optional]
 **type** | **String**|  | [optional]

### Return type

[**List&lt;WorkflowTarget&gt;**](WorkflowTarget.md)

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

<a name="updateWorkflowTarget"></a>
# **updateWorkflowTarget**
> WorkflowTarget updateWorkflowTarget(id, workflowTargetUpdate)

Updates a workflow target.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowTargetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowTargetsApi apiInstance = new WorkflowTargetsApi(defaultClient);
    String id = "id_example"; // String | 
    WorkflowTargetUpdate workflowTargetUpdate = new WorkflowTargetUpdate(); // WorkflowTargetUpdate | 
    try {
      WorkflowTarget result = apiInstance.updateWorkflowTarget(id, workflowTargetUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowTargetsApi#updateWorkflowTarget");
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
 **workflowTargetUpdate** | [**WorkflowTargetUpdate**](WorkflowTargetUpdate.md)|  |

### Return type

[**WorkflowTarget**](WorkflowTarget.md)

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

