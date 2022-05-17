# TemplateApplicationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyTemplate**](TemplateApplicationsApi.md#applyTemplate) | **POST** /template/api/v8/templates/{id}/applications | Applies a template to a target.
[**deleteTemplateApplication**](TemplateApplicationsApi.md#deleteTemplateApplication) | **DELETE** /template/api/v8/templates/applications/{id} | Deletes a template application.
[**getTemplateApplication**](TemplateApplicationsApi.md#getTemplateApplication) | **GET** /template/api/v8/templates/applications/{id} | Gets a template application.
[**getTemplateApplicationHistory**](TemplateApplicationsApi.md#getTemplateApplicationHistory) | **GET** /template/api/v8/templates/applications/{id}/history | Gets a template application history.
[**getTemplateApplicationsPage**](TemplateApplicationsApi.md#getTemplateApplicationsPage) | **GET** /template/api/v8/templates/applications | Get a page of template applications.
[**updateApplicationStatus**](TemplateApplicationsApi.md#updateApplicationStatus) | **PATCH** /template/api/v8/templates/applications/{id} | Updates an application status.


<a name="applyTemplate"></a>
# **applyTemplate**
> TemplateApplication applyTemplate(id, templateApplicationCreate)

Applies a template to a target.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateApplicationsApi apiInstance = new TemplateApplicationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    TemplateApplicationCreate templateApplicationCreate = new TemplateApplicationCreate(); // TemplateApplicationCreate | 
    try {
      TemplateApplication result = apiInstance.applyTemplate(id, templateApplicationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApplicationsApi#applyTemplate");
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
 **templateApplicationCreate** | [**TemplateApplicationCreate**](TemplateApplicationCreate.md)|  |

### Return type

[**TemplateApplication**](TemplateApplication.md)

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

<a name="deleteTemplateApplication"></a>
# **deleteTemplateApplication**
> deleteTemplateApplication(id)

Deletes a template application.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateApplicationsApi apiInstance = new TemplateApplicationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteTemplateApplication(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApplicationsApi#deleteTemplateApplication");
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

<a name="getTemplateApplication"></a>
# **getTemplateApplication**
> TemplateApplication getTemplateApplication(id)

Gets a template application.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateApplicationsApi apiInstance = new TemplateApplicationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      TemplateApplication result = apiInstance.getTemplateApplication(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApplicationsApi#getTemplateApplication");
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

[**TemplateApplication**](TemplateApplication.md)

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

<a name="getTemplateApplicationHistory"></a>
# **getTemplateApplicationHistory**
> List&lt;TemplateApplication&gt; getTemplateApplicationHistory(id)

Gets a template application history.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateApplicationsApi apiInstance = new TemplateApplicationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      List<TemplateApplication> result = apiInstance.getTemplateApplicationHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApplicationsApi#getTemplateApplicationHistory");
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

[**List&lt;TemplateApplication&gt;**](TemplateApplication.md)

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

<a name="getTemplateApplicationsPage"></a>
# **getTemplateApplicationsPage**
> TemplateApplicationsPage getTemplateApplicationsPage(tenantId, page, pageSize, templateId, targetId, targetType, calculateTotalItems, sortBy, sortOrder)

Get a page of template applications.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateApplicationsApi apiInstance = new TemplateApplicationsApi(defaultClient);
    UUID tenantId = UUID.randomUUID(); // UUID | 
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID templateId = UUID.randomUUID(); // UUID | 
    String targetId = "targetId_example"; // String | 
    String targetType = "targetType_example"; // String | 
    Boolean calculateTotalItems = true; // Boolean | 
    String sortBy = "applicationId"; // String | 
    String sortOrder = "asc"; // String | 
    try {
      TemplateApplicationsPage result = apiInstance.getTemplateApplicationsPage(tenantId, page, pageSize, templateId, targetId, targetType, calculateTotalItems, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApplicationsApi#getTemplateApplicationsPage");
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
 **templateId** | **UUID**|  | [optional]
 **targetId** | **String**|  | [optional]
 **targetType** | **String**|  | [optional]
 **calculateTotalItems** | **Boolean**|  | [optional]
 **sortBy** | **String**|  | [optional] [default to createdOn] [enum: applicationId, modifiedOn, createdOn, templateId, status, statusDetails, targetId, targetType]
 **sortOrder** | **String**|  | [optional] [default to asc] [enum: asc, desc]

### Return type

[**TemplateApplicationsPage**](TemplateApplicationsPage.md)

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

<a name="updateApplicationStatus"></a>
# **updateApplicationStatus**
> TemplateApplication updateApplicationStatus(id, templateApplicationStatusPatch)

Updates an application status.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplateApplicationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplateApplicationsApi apiInstance = new TemplateApplicationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    TemplateApplicationStatusPatch templateApplicationStatusPatch = new TemplateApplicationStatusPatch(); // TemplateApplicationStatusPatch | 
    try {
      TemplateApplication result = apiInstance.updateApplicationStatus(id, templateApplicationStatusPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateApplicationsApi#updateApplicationStatus");
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
 **templateApplicationStatusPatch** | [**TemplateApplicationStatusPatch**](TemplateApplicationStatusPatch.md)|  |

### Return type

[**TemplateApplication**](TemplateApplication.md)

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

