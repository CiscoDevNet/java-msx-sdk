# WorkflowCategoriesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflowCategory**](WorkflowCategoriesApi.md#createWorkflowCategory) | **POST** /workflow/api/v8/categories | Creates a new workflow category.
[**deleteWorkflowCategory**](WorkflowCategoriesApi.md#deleteWorkflowCategory) | **DELETE** /workflow/api/v8/categories/{id} | Deletes a workflow category.
[**getWorkflowCategoriesList**](WorkflowCategoriesApi.md#getWorkflowCategoriesList) | **GET** /workflow/api/v8/categories/list | Returns a list of workflow categories.
[**getWorkflowCategory**](WorkflowCategoriesApi.md#getWorkflowCategory) | **GET** /workflow/api/v8/categories/{id} | Returns a workflow category.
[**updateWorkflowCategory**](WorkflowCategoriesApi.md#updateWorkflowCategory) | **PUT** /workflow/api/v8/categories/{id} | Updates a workflow category.


<a name="createWorkflowCategory"></a>
# **createWorkflowCategory**
> WorkflowCategory createWorkflowCategory(tenantId, workflowCategoryCreate)

Creates a new workflow category.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowCategoriesApi apiInstance = new WorkflowCategoriesApi(defaultClient);
    UUID tenantId = new UUID(); // UUID | 
    WorkflowCategoryCreate workflowCategoryCreate = new WorkflowCategoryCreate(); // WorkflowCategoryCreate | 
    try {
      WorkflowCategory result = apiInstance.createWorkflowCategory(tenantId, workflowCategoryCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowCategoriesApi#createWorkflowCategory");
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
 **workflowCategoryCreate** | [**WorkflowCategoryCreate**](WorkflowCategoryCreate.md)|  |

### Return type

[**WorkflowCategory**](WorkflowCategory.md)

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

<a name="deleteWorkflowCategory"></a>
# **deleteWorkflowCategory**
> deleteWorkflowCategory(id)

Deletes a workflow category.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowCategoriesApi apiInstance = new WorkflowCategoriesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteWorkflowCategory(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowCategoriesApi#deleteWorkflowCategory");
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

<a name="getWorkflowCategoriesList"></a>
# **getWorkflowCategoriesList**
> List&lt;WorkflowCategory&gt; getWorkflowCategoriesList(tenantId)

Returns a list of workflow categories.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowCategoriesApi apiInstance = new WorkflowCategoriesApi(defaultClient);
    UUID tenantId = new UUID(); // UUID | 
    try {
      List<WorkflowCategory> result = apiInstance.getWorkflowCategoriesList(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowCategoriesApi#getWorkflowCategoriesList");
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

### Return type

[**List&lt;WorkflowCategory&gt;**](WorkflowCategory.md)

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

<a name="getWorkflowCategory"></a>
# **getWorkflowCategory**
> WorkflowCategory getWorkflowCategory(id)

Returns a workflow category.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowCategoriesApi apiInstance = new WorkflowCategoriesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WorkflowCategory result = apiInstance.getWorkflowCategory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowCategoriesApi#getWorkflowCategory");
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

[**WorkflowCategory**](WorkflowCategory.md)

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

<a name="updateWorkflowCategory"></a>
# **updateWorkflowCategory**
> WorkflowCategory updateWorkflowCategory(id, workflowCategoryUpdate)

Updates a workflow category.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.WorkflowCategoriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    WorkflowCategoriesApi apiInstance = new WorkflowCategoriesApi(defaultClient);
    String id = "id_example"; // String | 
    WorkflowCategoryUpdate workflowCategoryUpdate = new WorkflowCategoryUpdate(); // WorkflowCategoryUpdate | 
    try {
      WorkflowCategory result = apiInstance.updateWorkflowCategory(id, workflowCategoryUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowCategoriesApi#updateWorkflowCategory");
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
 **workflowCategoryUpdate** | [**WorkflowCategoryUpdate**](WorkflowCategoryUpdate.md)|  |

### Return type

[**WorkflowCategory**](WorkflowCategory.md)

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

