# DeviceTemplatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceTemplate**](DeviceTemplatesApi.md#createDeviceTemplate) | **POST** /manage/api/v8/devicetemplates | Creates a device template.
[**createDeviceTemplateVersion**](DeviceTemplatesApi.md#createDeviceTemplateVersion) | **POST** /manage/api/v8/devicetemplates/versions | Creates a new version of an existing device template.
[**deleteDeviceTemplate**](DeviceTemplatesApi.md#deleteDeviceTemplate) | **DELETE** /manage/api/v8/devicetemplates/{id} | Deletes a device template.
[**getDeviceTemplate**](DeviceTemplatesApi.md#getDeviceTemplate) | **GET** /manage/api/v8/devicetemplates/{id} | Returns a device template.
[**getDeviceTemplatesList**](DeviceTemplatesApi.md#getDeviceTemplatesList) | **GET** /manage/api/v8/devicetemplates/list | Returns a list of device templates.
[**scanDeviceTemplateParameters**](DeviceTemplatesApi.md#scanDeviceTemplateParameters) | **POST** /manage/api/v8/devicetemplates/parameters/scan | API to scan parameters from the device template XML.
[**updateDeviceTemplateAccess**](DeviceTemplatesApi.md#updateDeviceTemplateAccess) | **PUT** /manage/api/v8/devicetemplates/{id}/access | Updates device template access.


<a name="createDeviceTemplate"></a>
# **createDeviceTemplate**
> DeviceTemplate createDeviceTemplate(deviceTemplateCreate)

Creates a device template.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    DeviceTemplateCreate deviceTemplateCreate = new DeviceTemplateCreate(); // DeviceTemplateCreate | 
    try {
      DeviceTemplate result = apiInstance.createDeviceTemplate(deviceTemplateCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#createDeviceTemplate");
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
 **deviceTemplateCreate** | [**DeviceTemplateCreate**](DeviceTemplateCreate.md)|  |

### Return type

[**DeviceTemplate**](DeviceTemplate.md)

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

<a name="createDeviceTemplateVersion"></a>
# **createDeviceTemplateVersion**
> DeviceTemplate createDeviceTemplateVersion(deviceTemplateVersionCreate)

Creates a new version of an existing device template.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    DeviceTemplateVersionCreate deviceTemplateVersionCreate = new DeviceTemplateVersionCreate(); // DeviceTemplateVersionCreate | 
    try {
      DeviceTemplate result = apiInstance.createDeviceTemplateVersion(deviceTemplateVersionCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#createDeviceTemplateVersion");
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
 **deviceTemplateVersionCreate** | [**DeviceTemplateVersionCreate**](DeviceTemplateVersionCreate.md)|  |

### Return type

[**DeviceTemplate**](DeviceTemplate.md)

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

<a name="deleteDeviceTemplate"></a>
# **deleteDeviceTemplate**
> deleteDeviceTemplate(id)

Deletes a device template.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteDeviceTemplate(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#deleteDeviceTemplate");
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
 **id** | [**UUID**](.md)|  |

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

<a name="getDeviceTemplate"></a>
# **getDeviceTemplate**
> DeviceTemplate getDeviceTemplate(id)

Returns a device template.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      DeviceTemplate result = apiInstance.getDeviceTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#getDeviceTemplate");
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
 **id** | [**UUID**](.md)|  |

### Return type

[**DeviceTemplate**](DeviceTemplate.md)

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

<a name="getDeviceTemplatesList"></a>
# **getDeviceTemplatesList**
> List&lt;DeviceTemplate&gt; getDeviceTemplatesList(allVersions, serviceType, tenantId)

Returns a list of device templates.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    Boolean allVersions = false; // Boolean | 
    String serviceType = "manageddevice"; // String | 
    UUID tenantId = new UUID(); // UUID | 
    try {
      List<DeviceTemplate> result = apiInstance.getDeviceTemplatesList(allVersions, serviceType, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#getDeviceTemplatesList");
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
 **allVersions** | **Boolean**|  | [optional] [default to false]
 **serviceType** | **String**|  | [optional]
 **tenantId** | [**UUID**](.md)|  | [optional]

### Return type

[**List&lt;DeviceTemplate&gt;**](DeviceTemplate.md)

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

<a name="scanDeviceTemplateParameters"></a>
# **scanDeviceTemplateParameters**
> List&lt;String&gt; scanDeviceTemplateParameters(file)

API to scan parameters from the device template XML.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    File file = new File("/path/to/file"); // File | The XML template file of a device template
    try {
      List<String> result = apiInstance.scanDeviceTemplateParameters(file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#scanDeviceTemplateParameters");
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
 **file** | **File**| The XML template file of a device template | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ok |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**500** | Internal Server Error |  -  |

<a name="updateDeviceTemplateAccess"></a>
# **updateDeviceTemplateAccess**
> DeviceTemplateAccessResponse updateDeviceTemplateAccess(id, deviceTemplateAccess)

Updates device template access.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    DeviceTemplateAccess deviceTemplateAccess = new DeviceTemplateAccess(); // DeviceTemplateAccess | 
    try {
      DeviceTemplateAccessResponse result = apiInstance.updateDeviceTemplateAccess(id, deviceTemplateAccess);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#updateDeviceTemplateAccess");
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
 **id** | [**UUID**](.md)|  |
 **deviceTemplateAccess** | [**DeviceTemplateAccess**](DeviceTemplateAccess.md)|  |

### Return type

[**DeviceTemplateAccessResponse**](DeviceTemplateAccessResponse.md)

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

