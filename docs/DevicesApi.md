# DevicesApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachDeviceTemplates**](DevicesApi.md#attachDeviceTemplates) | **POST** /manage/api/v8/devices/{id}/templates | Attaches one or more device templates to a device instance.
[**createDevice**](DevicesApi.md#createDevice) | **POST** /manage/api/v8/devices | Creates a device.
[**deleteDevice**](DevicesApi.md#deleteDevice) | **DELETE** /manage/api/v8/devices/{id} | Deletes a device.
[**detachDeviceTemplate**](DevicesApi.md#detachDeviceTemplate) | **DELETE** /manage/api/v8/devices/{id}/templates/{templateId} | Detaches a template from a device.
[**detachDeviceTemplates**](DevicesApi.md#detachDeviceTemplates) | **DELETE** /manage/api/v8/devices/{id}/templates | Detach device templates that are already attached to a device.
[**getDevice**](DevicesApi.md#getDevice) | **GET** /manage/api/v8/devices/{id} | Returns a device.
[**getDeviceConfig**](DevicesApi.md#getDeviceConfig) | **GET** /manage/api/v8/devices/{id}/config | Returns the running configuration for a device.
[**getDeviceTemplateHistory**](DevicesApi.md#getDeviceTemplateHistory) | **GET** /manage/api/v8/devices/{id}/templates | Returns device template history.
[**getDevicesPage**](DevicesApi.md#getDevicesPage) | **GET** /manage/api/v8/devices | Returns a page of devices.
[**redeployDevice**](DevicesApi.md#redeployDevice) | **POST** /manage/api/v8/devices/{id}/redeploy | Dedeploys a device.
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
    defaultClient.setBasePath("http://localhost:8765");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    String id = "id_example"; // String | 
    DeviceTemplateAttachRequest deviceTemplateAttachRequest = {"templateDetails":[{"templateId":"e7e20070-9d67-40a8-a21d-f655606b7421","templateParams":[{"name":"name1","value":"value10461b304-da18-42bd-a48b-502d8e5166a4"},{"name":"name2","value":"value217c83dd3-f732-4a36-ae27-d86599c7f513"}]},{"templateId":"87710499-3431-4c53-8ce2-c28170c261e7","templateParams":[{"name":"name1","value":"value1fc9ca565-8a74-401a-9dce-5fe35d203150"},{"name":"name2","value":"value2bfde5275-8d32-4e2c-b023-7b987cb9a1ff"}]}]}; // DeviceTemplateAttachRequest | 
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
    defaultClient.setBasePath("http://localhost:8765");

    DevicesApi apiInstance = new DevicesApi(defaultClient);
    DeviceCreate deviceCreate = {"tenantId":"4ea8924b-fb40-43ae-ad10-de99139e7357","name":"device-name-5fb3c0fb-0bdf-485a-ad63-15106c6e3bed","model":"CISCO CSR 1000v","type":"CISCO CSR 1000v","serviceType":"manageddevice","serialKey":"CLctKw8azMR","version":"123","managed":true,"onboardType":"direct","onboardInformation":{"serviceType":"manageddevice","variables":"{\"ONBOARDING_INTERFACE\":\"GigabitEthernet1\",\"CUSTOMER_PASSWORD_MD5\":\"$8$/lH9SrDINF1YkYD7/x9FSYHnoxeAY4AEcncCGbe1ZWGOGx1nkn6+EdsPYacwXUdh\",\"CPE_SNMP_V3_AUTH_PASS\":\"$8$BnSiQUd4kW5VqGe/6jLziV59kU3n4DKKumlBgVGMCRIV6dcRzybuNJ16cGZE+G+A\",\"onboarding-template-id\":\"cisco-ios-secure-onboarding\",\"CPE_SNMP_V3_PRIV_PASS\":\"$8$Tx9ngrtcjB+l9ihlUJTAYFE10GhI+8IB43he/+SGbnr45Bi0ETyP9Wq90km3gbeh\",\"ENABLE_SECRET\":\"$8$maC3mSZ0hY4c25G7M6bWBsx9+b5ys1Ehin/SJFIuwNjh50BQpR0sSpGOXo0BvG0d\",\"CUSTOMER_USERNAME\":\"vmsmd33\"}","address":"10.254.0.3","always-allocate-ip":"true","ned-id":"cisco-ios","onboarding-template-done":"true","password":"$8$/lH9SrDINF1YkYD7/x9FSYHnoxeAY4AEcncCGbe1ZWGOGx1nkn6+EdsPYacwXUdh","port":"22","secondary-password":"$8$maC3mSZ0hY4c25G7M6bWBsx9+b5ys1Ehin/SJFIuwNjh50BQpR0sSpGOXo0BvG0d","device-type":"cli","original-address":"3.134.83.79","username":"vmsmd33"}}; // DeviceCreate | 
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
    defaultClient.setBasePath("http://localhost:8765");

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
    defaultClient.setBasePath("http://localhost:8765");

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
    defaultClient.setBasePath("http://localhost:8765");

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
    defaultClient.setBasePath("http://localhost:8765");

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
    defaultClient.setBasePath("http://localhost:8765");

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
    defaultClient.setBasePath("http://localhost:8765");

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
> DevicesPage getDevicesPage(page, pageSize, deviceIds, serviceIds, types, serialKeys, serviceTypes, models, subtypes, names, versions, tenantIds, severities, sortBy, sortOrder)

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
    defaultClient.setBasePath("http://localhost:8765");

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
    List<String> severities = Arrays.asList(); // List<String> | 
    String sortBy = "name"; // String | 
    String sortOrder = "asc"; // String | 
    try {
      DevicesPage result = apiInstance.getDevicesPage(page, pageSize, deviceIds, serviceIds, types, serialKeys, serviceTypes, models, subtypes, names, versions, tenantIds, severities, sortBy, sortOrder);
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
 **severities** | [**List&lt;String&gt;**](String.md)|  | [optional]
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
    defaultClient.setBasePath("http://localhost:8765");

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
    defaultClient.setBasePath("http://localhost:8765");

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
**400** | Bad Request |  -  |
**401** | Unauthenticated |  -  |
**403** | Unauthorized |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

