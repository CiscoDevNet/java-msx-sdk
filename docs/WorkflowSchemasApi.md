# WorkflowSchemasApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkflowSchema**](WorkflowSchemasApi.md#getWorkflowSchema) | **GET** /workflow/api/v8/schemas/{id} | Returns a workflow schema.
[**getWorkflowSchemasList**](WorkflowSchemasApi.md#getWorkflowSchemasList) | **GET** /workflow/api/v8/schemas/list | Returns a list of workflow schemas.


<a name="getWorkflowSchema"></a>
# **getWorkflowSchema**
> WorkflowSchemaByTypeResponse getWorkflowSchema(id, schemaType)

Returns a workflow schema.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowSchemasApi apiInstance = new WorkflowSchemasApi(defaultClient);
    String id = "id_example"; // String | 
    String schemaType = "view"; // String | 
    try {
      WorkflowSchemaByTypeResponse result = apiInstance.getWorkflowSchema(id, schemaType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemasApi#getWorkflowSchema");
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
 **schemaType** | **String**|  | [optional] [default to view]

### Return type

[**WorkflowSchemaByTypeResponse**](WorkflowSchemaByTypeResponse.md)

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

<a name="getWorkflowSchemasList"></a>
# **getWorkflowSchemasList**
> List&lt;WorkflowSchema&gt; getWorkflowSchemasList(baseType, schemaType, variableType)

Returns a list of workflow schemas.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowSchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowSchemasApi apiInstance = new WorkflowSchemasApi(defaultClient);
    String baseType = "category"; // String | 
    String schemaType = "view"; // String | 
    Boolean variableType = false; // Boolean | 
    try {
      List<WorkflowSchema> result = apiInstance.getWorkflowSchemasList(baseType, schemaType, variableType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowSchemasApi#getWorkflowSchemasList");
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
 **baseType** | **String**|  | [default to category]
 **schemaType** | **String**|  | [optional] [default to view]
 **variableType** | **Boolean**|  | [optional] [default to false]

### Return type

[**List&lt;WorkflowSchema&gt;**](WorkflowSchema.md)

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

