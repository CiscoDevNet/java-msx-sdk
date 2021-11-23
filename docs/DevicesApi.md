# DevicesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachDeviceTemplates**](DevicesApi.md#attachDeviceTemplates) | **POST** /manage/api/v8/devices/{id}/templates | Attaches one or more device templates to a device instance.
[**batchAttachDeviceTemplates**](DevicesApi.md#batchAttachDeviceTemplates) | **POST** /manage/api/v8/devices/templates/attach | Attaches one or more device templates to a batch of device instances.
[**createDevice**](DevicesApi.md#createDevice) | **POST** /manage/api/v8/devices | Creates a device.
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /manage/api/v8/devices/{id} | Deletes a device.
[**detachDeviceTemplate**](DevicesApi.md#detachDeviceTemplate) | **DELETE** /manage/api/v8/devices/{id}/templates/{templateId} | Detaches a template from a device.
[**detachDeviceTemplates**](DevicesApi.md#detachDeviceTemplates) | **DELETE** /manage/api/v8/devices/{id}/templates | Detach device templates that are already attached to a device.
[**getDevice**](DevicesApi.md#getDevice) | **GET** /manage/api/v8/devices/{id} | Returns a device.
[**getDeviceConfig**](DevicesApi.md#getDeviceConfig) | **GET** /manage/api/v8/devices/{id}/config | Returns the running configuration for a device.
[**getDeviceTemplateHistory**](DevicesApi.md#getDeviceTemplateHistory) | **GET** /manage/api/v8/devices/{id}/templates | Returns device template history.
[**getDevicesPage**](DevicesApi.md#getDevicesPage) | **GET** /manage/api/v8/devices | Returns a page of devices.
[**patchDevice**](DevicesApi.md#patchDevice) | **PATCH** /manage/api/v8/devices/{id} | Update a device.
[**redeployDevice**](DevicesApi.md#redeployDevice) | **POST** /manage/api/v8/devices/{id}/redeploy | Dedeploys a device.
[**updateDevice**](DevicesApi.md#updateDevice) | **PUT** /manage/api/v8/devices/{id} | Update a device.
[**updateDeviceTemplates**](DevicesApi.md#updateDeviceTemplates) | **PUT** /manage/api/v8/devices/{id}/templates | Update device templates that are already attached to a device.


<a name="attachDeviceTemplates"></a>
# **attachDeviceTemplates**
> List&lt;DeviceTemplateHistory&gt; attachDeviceTemplates(id, deviceTemplateAttachRequest)

Attaches one or more device templates to a device instance.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    DeviceTemplateAttachRequest deviceTemplateAttachRequest = new DeviceTemplateAttachRequest(); // DeviceTemplateAttachRequest | 
    try {
      List<DeviceTemplateHistory> result = apiInstance.attachDeviceTemplates(id, deviceTemplateAttachRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#attachDeviceTemplates");
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
 **deviceTemplateAttachRequest** | [**DeviceTemplateAttachRequest**](DeviceTemplateAttachRequest.md)|  |

### Return type

[**List&lt;DeviceTemplateHistory&gt;**](DeviceTemplateHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**202** | Pending Approval |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="batchAttachDeviceTemplates"></a>
# **batchAttachDeviceTemplates**
> List&lt;List&lt;DeviceTemplateHistorySummary&gt;&gt; batchAttachDeviceTemplates(deviceTemplateBatchAttachRequest)

Attaches one or more device templates to a batch of device instances.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    DeviceTemplateBatchAttachRequest deviceTemplateBatchAttachRequest = new DeviceTemplateBatchAttachRequest(); // DeviceTemplateBatchAttachRequest | 
    try {
      List<List<DeviceTemplateHistorySummary>> result = apiInstance.batchAttachDeviceTemplates(deviceTemplateBatchAttachRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#batchAttachDeviceTemplates");
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
 **deviceTemplateBatchAttachRequest** | [**DeviceTemplateBatchAttachRequest**](DeviceTemplateBatchAttachRequest.md)|  |

### Return type

[**List&lt;List&lt;DeviceTemplateHistorySummary&gt;&gt;**](List.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Pending Approval |  -  |
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="createDevice"></a>
# **createDevice**
> Device createDevice(deviceCreate)

Creates a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    DeviceCreate deviceCreate = new DeviceCreate(); // DeviceCreate | 
    try {
      Device result = apiInstance.createDevice(deviceCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#createDevice");
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
 **deviceCreate** | [**DeviceCreate**](DeviceCreate.md)|  |

### Return type

[**Device**](Device.md)

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

<a name="deleteDevice"></a>
# **deleteDevice**
> deleteDevice(id)

Deletes a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteDevice(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#deleteDevice");
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

<a name="detachDeviceTemplate"></a>
# **detachDeviceTemplate**
> List&lt;DeviceTemplateHistory&gt; detachDeviceTemplate(id, templateId)

Detaches a template from a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    UUID templateId = new UUID(); // UUID | 
    try {
      List<DeviceTemplateHistory> result = apiInstance.detachDeviceTemplate(id, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#detachDeviceTemplate");
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
 **templateId** | [**UUID**](.md)|  |

### Return type

[**List&lt;DeviceTemplateHistory&gt;**](DeviceTemplateHistory.md)

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

<a name="detachDeviceTemplates"></a>
# **detachDeviceTemplates**
> List&lt;DeviceTemplateHistory&gt; detachDeviceTemplates(id)

Detach device templates that are already attached to a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      List<DeviceTemplateHistory> result = apiInstance.detachDeviceTemplates(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#detachDeviceTemplates");
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

[**List&lt;DeviceTemplateHistory&gt;**](DeviceTemplateHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getDevice"></a>
# **getDevice**
> Device getDevice(id)

Returns a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Device result = apiInstance.getDevice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getDevice");
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

[**Device**](Device.md)

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

<a name="getDeviceConfig"></a>
# **getDeviceConfig**
> String getDeviceConfig(id)

Returns the running configuration for a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      String result = apiInstance.getDeviceConfig(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getDeviceConfig");
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

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getDeviceTemplateHistory"></a>
# **getDeviceTemplateHistory**
> List&lt;DeviceTemplateHistory&gt; getDeviceTemplateHistory(id, templateId)

Returns device template history.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    UUID templateId = new UUID(); // UUID | 
    try {
      List<DeviceTemplateHistory> result = apiInstance.getDeviceTemplateHistory(id, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getDeviceTemplateHistory");
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
 **templateId** | [**UUID**](.md)|  | [optional]

### Return type

[**List&lt;DeviceTemplateHistory&gt;**](DeviceTemplateHistory.md)

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

<a name="getDevicesPage"></a>
# **getDevicesPage**
> DevicesPage getDevicesPage(page, pageSize, deviceIds, serviceIds, types, serialKeys, serviceTypes, models, subtypes, names, versions, tenantIds, includeSubtenants, severities, complianceStates, vulnerabilityStates, sortBy, sortOrder)

Returns a page of devices.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    List<String> deviceIds = Arrays.asList(); // List<String> | 
    List<String> serviceIds = Arrays.asList(); // List<String> | 
    List<String> types = Arrays.asList(); // List<String> | 
    List<String> serialKeys = Arrays.asList(); // List<String> | 
    List<String> serviceTypes = Arrays.asList(); // List<String> | 
    List<String> models = Arrays.asList(); // List<String> | 
    List<String> subtypes = Arrays.asList(); // List<String> | 
    List<String> names = Arrays.asList(); // List<String> | 
    List<String> versions = Arrays.asList(); // List<String> | 
    List<UUID> tenantIds = Arrays.asList(); // List<UUID> | 
    Boolean includeSubtenants = false; // Boolean | 
    List<String> severities = Arrays.asList(); // List<String> | 
    List<DeviceComplianceState> complianceStates = Arrays.asList(); // List<DeviceComplianceState> | 
    List<DeviceVulnerabilityState> vulnerabilityStates = Arrays.asList(); // List<DeviceVulnerabilityState> | 
    String sortBy = "name"; // String | 
    String sortOrder = "asc"; // String | 
    try {
      DevicesPage result = apiInstance.getDevicesPage(page, pageSize, deviceIds, serviceIds, types, serialKeys, serviceTypes, models, subtypes, names, versions, tenantIds, includeSubtenants, severities, complianceStates, vulnerabilityStates, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#getDevicesPage");
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
 **deviceIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **serviceIds** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **types** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **serialKeys** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **serviceTypes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **models** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **subtypes** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **names** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **versions** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **tenantIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]
 **includeSubtenants** | **Boolean**|  | [optional] [default to false]
 **severities** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **complianceStates** | [**List&lt;DeviceComplianceState&gt;**](DeviceComplianceState.md)|  | [optional]
 **vulnerabilityStates** | [**List&lt;DeviceVulnerabilityState&gt;**](DeviceVulnerabilityState.md)|  | [optional]
 **sortBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional] [default to asc] [enum: asc, desc]

### Return type

[**DevicesPage**](DevicesPage.md)

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

<a name="patchDevice"></a>
# **patchDevice**
> Device patchDevice(id, devicePatch)

Update a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    DevicePatch devicePatch = new DevicePatch(); // DevicePatch | 
    try {
      Device result = apiInstance.patchDevice(id, devicePatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#patchDevice");
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
 **devicePatch** | [**DevicePatch**](DevicePatch.md)|  |

### Return type

[**Device**](Device.md)

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

<a name="redeployDevice"></a>
# **redeployDevice**
> redeployDevice(id)

Dedeploys a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.redeployDevice(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#redeployDevice");
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
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="updateDevice"></a>
# **updateDevice**
> Device updateDevice(id, deviceUpdate)

Update a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    DeviceUpdate deviceUpdate = new DeviceUpdate(); // DeviceUpdate | 
    try {
      Device result = apiInstance.updateDevice(id, deviceUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#updateDevice");
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
 **deviceUpdate** | [**DeviceUpdate**](DeviceUpdate.md)|  |

### Return type

[**Device**](Device.md)

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

<a name="updateDeviceTemplates"></a>
# **updateDeviceTemplates**
> List&lt;DeviceTemplateHistory&gt; updateDeviceTemplates(id, deviceTemplateUpdateRequest)

Update device templates that are already attached to a device.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DevicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    DeviceTemplateUpdateRequest deviceTemplateUpdateRequest = new DeviceTemplateUpdateRequest(); // DeviceTemplateUpdateRequest | 
    try {
      List<DeviceTemplateHistory> result = apiInstance.updateDeviceTemplates(id, deviceTemplateUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DevicesApi#updateDeviceTemplates");
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
 **deviceTemplateUpdateRequest** | [**DeviceTemplateUpdateRequest**](DeviceTemplateUpdateRequest.md)|  |

### Return type

[**List&lt;DeviceTemplateHistory&gt;**](DeviceTemplateHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

