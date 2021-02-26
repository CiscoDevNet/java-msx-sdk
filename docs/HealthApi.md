# HealthApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDevicesHealthList**](HealthApi.md#getDevicesHealthList) | **GET** /monitor/api/v8/health/devices/list | 
[**getServicesHealthList**](HealthApi.md#getServicesHealthList) | **GET** /monitor/api/v8/health/services/list | 


<a name="getDevicesHealthList"></a>
# **getDevicesHealthList**
> List&lt;ResourceHealth&gt; getDevicesHealthList(ids)



### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.HealthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    HealthApi apiInstance = new HealthApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | 
    try {
      List<ResourceHealth> result = apiInstance.getDevicesHealthList(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#getDevicesHealthList");
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
 **ids** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**List&lt;ResourceHealth&gt;**](ResourceHealth.md)

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

<a name="getServicesHealthList"></a>
# **getServicesHealthList**
> List&lt;ResourceHealth&gt; getServicesHealthList(ids)



### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.HealthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    HealthApi apiInstance = new HealthApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | 
    try {
      List<ResourceHealth> result = apiInstance.getServicesHealthList(ids);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#getServicesHealthList");
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
 **ids** | [**List&lt;String&gt;**](String.md)|  |

### Return type

[**List&lt;ResourceHealth&gt;**](ResourceHealth.md)

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

