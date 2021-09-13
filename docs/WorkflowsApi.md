# WorkflowsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWorkflow**](WorkflowsApi.md#deleteWorkflow) | **DELETE** /workflow/api/v8/workflows/{id} | Delete a workflow.
[**exportWorkflow**](WorkflowsApi.md#exportWorkflow) | **GET** /workflow/api/v8/workflows/{id}/export | Exports a workflow.
[**getWorkflow**](WorkflowsApi.md#getWorkflow) | **GET** /workflow/api/v8/workflows/{id} | Returns a workflow.
[**getWorkflowStartConfig**](WorkflowsApi.md#getWorkflowStartConfig) | **GET** /workflow/api/v8/workflows/{id}/startconfig | Returns a workflow start config.
[**getWorkflowsList**](WorkflowsApi.md#getWorkflowsList) | **GET** /workflow/api/v8/workflows/list | Returns a list of workflows.
[**importWorkflow**](WorkflowsApi.md#importWorkflow) | **POST** /workflow/api/v8/workflows | Imports a workflow.
[**startWorkflow**](WorkflowsApi.md#startWorkflow) | **POST** /workflow/api/v8/workflows/{id}/start | Starts a workflow.
[**updateWorkflow**](WorkflowsApi.md#updateWorkflow) | **PUT** /workflow/api/v8/workflows/{id} | Updates a workflow.
[**validateWorkflow**](WorkflowsApi.md#validateWorkflow) | **POST** /workflow/api/v8/workflows/{id}/validate | Validates a workflow.


<a name="deleteWorkflow"></a>
# **deleteWorkflow**
> deleteWorkflow(id)

Delete a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteWorkflow(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#deleteWorkflow");
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

<a name="exportWorkflow"></a>
# **exportWorkflow**
> Map&lt;String, Object&gt; exportWorkflow(id)

Exports a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Map<String, Object> result = apiInstance.exportWorkflow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#exportWorkflow");
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

**Map&lt;String, Object&gt;**

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

<a name="getWorkflow"></a>
# **getWorkflow**
> Workflow getWorkflow(id)

Returns a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Workflow result = apiInstance.getWorkflow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflow");
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

[**Workflow**](Workflow.md)

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

<a name="getWorkflowStartConfig"></a>
# **getWorkflowStartConfig**
> WorkflowStartConfig getWorkflowStartConfig(id)

Returns a workflow start config.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowStartConfig result = apiInstance.getWorkflowStartConfig(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowStartConfig");
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

[**WorkflowStartConfig**](WorkflowStartConfig.md)

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

<a name="getWorkflowsList"></a>
# **getWorkflowsList**
> List&lt;Workflow&gt; getWorkflowsList(tenantId, atomic)

Returns a list of workflows.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID tenantId = new UUID(); // UUID | 
    Boolean atomic = false; // Boolean | 
    try {
      List<Workflow> result = apiInstance.getWorkflowsList(tenantId, atomic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowsList");
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
 **tenantId** | [**UUID**](.md)|  | [optional]
 **atomic** | **Boolean**|  | [optional] [default to false]

### Return type

[**List&lt;Workflow&gt;**](Workflow.md)

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

<a name="importWorkflow"></a>
# **importWorkflow**
> WorkflowMapping importWorkflow(requestBody, tenantIds, global)

Imports a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    Map<String, Object> requestBody = {"workflow":{"unique_name":"definition_workflow_1flwhkwsayquzQyyfgz6tdRoyK2","name":"Health Check Atomic","title":"Health Check Atomic","type":"generic.workflow","base_type":"workflow","variables":[{"schema_id":"1flwhm42MFVKT16QCVpnzTV3NDL","properties":{"value":"","scope":"input","name":"service_name","type":"datatype.string"},"unique_name":"variable_workflow_1flwhkauAJQe4uzBvUDvCBdY2HM","object_type":"variable_workflow"}],"properties":{"atomic":{"is_atomic":false},"delete_workflow_instance":false,"display_name":"Health Check Atomic","favorite":false,"target":{"target_type":"web-service.endpoint","target_id":"definition_target_1flwhpdkMV95YN7uSm2ygMYsVe2","execute_on_workflow_target":true}},"object_type":"definition_workflow","actions":[{"unique_name":"definition_activity_1flwhq819QYFkMjAfPWDcg4zliI","name":"HTTP Request","title":"HTTP Request","type":"web-service.http_request","base_type":"activity","properties":{"accept":"application/json","action_timeout":180,"allow_auto_redirect":true,"content_type":"application/json","continue_on_error_status_code":false,"continue_on_failure":false,"custom_headers":[{"name":"Content-type","value":"application/vnd.spring-boot.actuator.v1+json"}],"display_name":"HTTP Request","method":"GET","relative_url":"/$workflow.definition_workflow_1flwhkwsayquzQyyfgz6tdRoyK2.input.variable_workflow_1flwhkauAJQe4uzBvUDvCBdY2HM$/admin/health","runtime_user":{"override_target_runtime_user":false,"target_default":true},"target":{"override_workflow_target":false,"use_workflow_target":true}},"object_type":"definition_activity"}]},"targets":{"definition_target_1flwhpdkMV95YN7uSm2ygMYsVe2":{"unique_name":"definition_target_1flwhpdkMV95YN7uSm2ygMYsVe2","name":"Router Service","title":"Router Service","type":"web-service.endpoint","base_type":"target","object_type":"definition_target","properties":{"description":"Router Service","disable_certificate_validation":true,"display_name":"Router Service","host":"dev-plt-aio1.lab.ciscomsx.com","no_runtime_user":true,"port":-1,"protocol":"https"}}}}; // Map<String, Object> | 
    List<UUID> tenantIds = Arrays.asList(); // List<UUID> | 
    Boolean global = true; // Boolean | 
    try {
      WorkflowMapping result = apiInstance.importWorkflow(requestBody, tenantIds, global);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#importWorkflow");
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
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  |
 **tenantIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **global** | **Boolean**|  | [optional]

### Return type

[**WorkflowMapping**](WorkflowMapping.md)

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

<a name="startWorkflow"></a>
# **startWorkflow**
> List&lt;StartWorkflowResponse&gt; startWorkflow(id, workflowStartConfig, sync)

Starts a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    WorkflowStartConfig workflowStartConfig = new WorkflowStartConfig(); // WorkflowStartConfig | 
    Boolean sync = true; // Boolean | 
    try {
      List<StartWorkflowResponse> result = apiInstance.startWorkflow(id, workflowStartConfig, sync);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#startWorkflow");
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
 **workflowStartConfig** | [**WorkflowStartConfig**](WorkflowStartConfig.md)|  |
 **sync** | **Boolean**|  | [optional]

### Return type

[**List&lt;StartWorkflowResponse&gt;**](StartWorkflowResponse.md)

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

<a name="updateWorkflow"></a>
# **updateWorkflow**
> WorkflowMapping updateWorkflow(id, requestBody, tenantIds, global)

Updates a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    List<UUID> tenantIds = Arrays.asList(); // List<UUID> | 
    Boolean global = true; // Boolean | 
    try {
      WorkflowMapping result = apiInstance.updateWorkflow(id, requestBody, tenantIds, global);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateWorkflow");
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
 **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  |
 **tenantIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **global** | **Boolean**|  | [optional]

### Return type

[**WorkflowMapping**](WorkflowMapping.md)

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

<a name="validateWorkflow"></a>
# **validateWorkflow**
> ValidateWorkflowResponse validateWorkflow(id)

Validates a workflow.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ValidateWorkflowResponse result = apiInstance.validateWorkflow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#validateWorkflow");
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

[**ValidateWorkflowResponse**](ValidateWorkflowResponse.md)

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

