# TemplateAssignmentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchAssignTemplate**](TemplateAssignmentsApi.md#batchAssignTemplate) | **POST** /template/api/v8/templates/{id}/assignments/add | Assigns a template to one or more tenants.
[**batchUnassignTemplate**](TemplateAssignmentsApi.md#batchUnassignTemplate) | **POST** /template/api/v8/templates/{id}/assignments/remove | Unassigns a template from one or more tenants.
[**getAssignment**](TemplateAssignmentsApi.md#getAssignment) | **GET** /template/api/v8/templates/assignments/{id} | Gets a template assignment.
[**getAssignmentHistory**](TemplateAssignmentsApi.md#getAssignmentHistory) | **GET** /template/api/v8/templates/assignments/{id}/history | Gets a template assignment history.
[**getTemplateAssignmentsPage**](TemplateAssignmentsApi.md#getTemplateAssignmentsPage) | **GET** /template/api/v8/templates/assignments | Returns a page of template assignments.
[**updateAssignmentStatus**](TemplateAssignmentsApi.md#updateAssignmentStatus) | **PATCH** /template/api/v8/templates/assignments/{id} | Updates a template assignment status.


<a name="batchAssignTemplate"></a>
# **batchAssignTemplate**
> List&lt;TemplateAssignmentResponse&gt; batchAssignTemplate(id, UUID, inheritable)

Assigns a template to one or more tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateAssignmentsApi apiInstance = new TemplateAssignmentsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    Boolean inheritable = true; // Boolean | 
    try {
      List<TemplateAssignmentResponse> result = apiInstance.batchAssignTemplate(id, UUID, inheritable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateAssignmentsApi#batchAssignTemplate");
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
 **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  |
 **inheritable** | **Boolean**|  | [optional]

### Return type

[**List&lt;TemplateAssignmentResponse&gt;**](TemplateAssignmentResponse.md)

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
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="batchUnassignTemplate"></a>
# **batchUnassignTemplate**
> List&lt;TemplateAssignmentResponse&gt; batchUnassignTemplate(id, UUID)

Unassigns a template from one or more tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateAssignmentsApi apiInstance = new TemplateAssignmentsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    List<UUID> UUID = Arrays.asList(); // List<UUID> | 
    try {
      List<TemplateAssignmentResponse> result = apiInstance.batchUnassignTemplate(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateAssignmentsApi#batchUnassignTemplate");
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
 **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  |

### Return type

[**List&lt;TemplateAssignmentResponse&gt;**](TemplateAssignmentResponse.md)

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
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getAssignment"></a>
# **getAssignment**
> TemplateAssignment getAssignment(id)

Gets a template assignment.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateAssignmentsApi apiInstance = new TemplateAssignmentsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of template assignment record.
    try {
      TemplateAssignment result = apiInstance.getAssignment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateAssignmentsApi#getAssignment");
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
 **id** | **UUID**| ID of template assignment record. |

### Return type

[**TemplateAssignment**](TemplateAssignment.md)

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

<a name="getAssignmentHistory"></a>
# **getAssignmentHistory**
> List&lt;TemplateAssignment&gt; getAssignmentHistory(id)

Gets a template assignment history.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateAssignmentsApi apiInstance = new TemplateAssignmentsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      List<TemplateAssignment> result = apiInstance.getAssignmentHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateAssignmentsApi#getAssignmentHistory");
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

[**List&lt;TemplateAssignment&gt;**](TemplateAssignment.md)

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

<a name="getTemplateAssignmentsPage"></a>
# **getTemplateAssignmentsPage**
> TemplateAssignmentsPage getTemplateAssignmentsPage(page, pageSize, templateId, tenantId, calculateTotalItems)

Returns a page of template assignments.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateAssignmentsApi apiInstance = new TemplateAssignmentsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    UUID tenantId = UUID.randomUUID(); // UUID | 
    Boolean calculateTotalItems = true; // Boolean | 
    try {
      TemplateAssignmentsPage result = apiInstance.getTemplateAssignmentsPage(page, pageSize, templateId, tenantId, calculateTotalItems);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateAssignmentsApi#getTemplateAssignmentsPage");
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
 **page** | **Integer**|  |
 **pageSize** | **Integer**|  |
 **templateId** | **UUID**|  | [optional]
 **tenantId** | **UUID**|  | [optional]
 **calculateTotalItems** | **Boolean**|  | [optional]

### Return type

[**TemplateAssignmentsPage**](TemplateAssignmentsPage.md)

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

<a name="updateAssignmentStatus"></a>
# **updateAssignmentStatus**
> TemplateAssignment updateAssignmentStatus(id, templateAssignmentStatusPatch)

Updates a template assignment status.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateAssignmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateAssignmentsApi apiInstance = new TemplateAssignmentsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | ID of template assignment record.
    TemplateAssignmentStatusPatch templateAssignmentStatusPatch = new TemplateAssignmentStatusPatch(); // TemplateAssignmentStatusPatch | 
    try {
      TemplateAssignment result = apiInstance.updateAssignmentStatus(id, templateAssignmentStatusPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateAssignmentsApi#updateAssignmentStatus");
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
 **id** | **UUID**| ID of template assignment record. |
 **templateAssignmentStatusPatch** | [**TemplateAssignmentStatusPatch**](TemplateAssignmentStatusPatch.md)|  |

### Return type

[**TemplateAssignment**](TemplateAssignment.md)

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

