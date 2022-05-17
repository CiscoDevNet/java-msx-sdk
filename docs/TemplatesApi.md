# TemplatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTemplate**](TemplatesApi.md#deleteTemplate) | **DELETE** /template/api/v8/templates/{id} | Deletes a template.
[**getTemplate**](TemplatesApi.md#getTemplate) | **GET** /template/api/v8/templates/{id} | Returns a template by id.
[**getTemplateHistory**](TemplatesApi.md#getTemplateHistory) | **GET** /template/api/v8/templates/{id}/history | Returns a template history by id.
[**getTemplatesPage**](TemplatesApi.md#getTemplatesPage) | **GET** /template/api/v8/templates | Returns a page of templates.
[**importTemplate**](TemplatesApi.md#importTemplate) | **POST** /template/api/v8/templates | Imports a template.
[**updateTemplateStatus**](TemplatesApi.md#updateTemplateStatus) | **PATCH** /template/api/v8/templates/{id} | Updates a template status.


<a name="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(id)

Deletes a template.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteTemplate(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteTemplate");
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

<a name="getTemplate"></a>
# **getTemplate**
> Template getTemplate(id)

Returns a template by id.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      Template result = apiInstance.getTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getTemplate");
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

[**Template**](Template.md)

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

<a name="getTemplateHistory"></a>
# **getTemplateHistory**
> List&lt;Template&gt; getTemplateHistory(id)

Returns a template history by id.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      List<Template> result = apiInstance.getTemplateHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getTemplateHistory");
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

[**List&lt;Template&gt;**](Template.md)

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

<a name="getTemplatesPage"></a>
# **getTemplatesPage**
> TemplatesPage getTemplatesPage(page, pageSize, calculateTotalItems, externalId, service, tags)

Returns a page of templates.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    Boolean calculateTotalItems = true; // Boolean | 
    String externalId = "externalId_example"; // String | External ID to filter templates by.
    String service = "service_example"; // String | Name of service to filter templates by.
    List<String> tags = Arrays.asList(); // List<String> | 
    try {
      TemplatesPage result = apiInstance.getTemplatesPage(page, pageSize, calculateTotalItems, externalId, service, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getTemplatesPage");
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
 **calculateTotalItems** | **Boolean**|  | [optional]
 **externalId** | **String**| External ID to filter templates by. | [optional]
 **service** | **String**| Name of service to filter templates by. | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**TemplatesPage**](TemplatesPage.md)

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

<a name="importTemplate"></a>
# **importTemplate**
> Template importTemplate(templateCreate)

Imports a template.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    TemplateCreate templateCreate = new TemplateCreate(); // TemplateCreate | 
    try {
      Template result = apiInstance.importTemplate(templateCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#importTemplate");
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
 **templateCreate** | [**TemplateCreate**](TemplateCreate.md)|  |

### Return type

[**Template**](Template.md)

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
**500** | Internal Server Error |  -  |

<a name="updateTemplateStatus"></a>
# **updateTemplateStatus**
> Template updateTemplateStatus(id, templatePatch)

Updates a template status.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    TemplatePatch templatePatch = new TemplatePatch(); // TemplatePatch | 
    try {
      Template result = apiInstance.updateTemplateStatus(id, templatePatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateTemplateStatus");
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
 **templatePatch** | [**TemplatePatch**](TemplatePatch.md)|  |

### Return type

[**Template**](Template.md)

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

