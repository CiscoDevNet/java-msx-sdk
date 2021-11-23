# IncidentsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelIncident**](IncidentsApi.md#cancelIncident) | **PATCH** /incident/api/v1/incidents/{id}/cancel | Cancels an incident.
[**createIncident**](IncidentsApi.md#createIncident) | **POST** /incident/api/v1/incidents | Create a new Incident.
[**deleteIncident**](IncidentsApi.md#deleteIncident) | **DELETE** /incident/api/v1/incidents/{id} | Deletes an incident.
[**getIncident**](IncidentsApi.md#getIncident) | **GET** /incident/api/v1/incidents/{id} | Get incident details.
[**getIncidents**](IncidentsApi.md#getIncidents) | **GET** /incident/api/v1/incidents | Get Incidents by filter.
[**updateIncident**](IncidentsApi.md#updateIncident) | **PUT** /incident/api/v1/incidents/{id} | Updates an incident.


<a name="cancelIncident"></a>
# **cancelIncident**
> Incident cancelIncident(id, incidentCancel)

Cancels an incident.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String id = "id_example"; // String | 
    IncidentCancel incidentCancel = new IncidentCancel(); // IncidentCancel | 
    try {
      Incident result = apiInstance.cancelIncident(id, incidentCancel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#cancelIncident");
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
 **incidentCancel** | [**IncidentCancel**](IncidentCancel.md)|  |

### Return type

[**Incident**](Incident.md)

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

<a name="createIncident"></a>
# **createIncident**
> Incident createIncident(incidentCreate)

Create a new Incident.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    IncidentCreate incidentCreate = new IncidentCreate(); // IncidentCreate | 
    try {
      Incident result = apiInstance.createIncident(incidentCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncident");
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
 **incidentCreate** | [**IncidentCreate**](IncidentCreate.md)|  |

### Return type

[**Incident**](Incident.md)

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
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteIncident"></a>
# **deleteIncident**
> deleteIncident(id)

Deletes an incident.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteIncident(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#deleteIncident");
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

<a name="getIncident"></a>
# **getIncident**
> Incident getIncident(id)

Get incident details.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      Incident result = apiInstance.getIncident(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncident");
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

[**Incident**](Incident.md)

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

<a name="getIncidents"></a>
# **getIncidents**
> IncidentsPage getIncidents(page, pageSize, id, externalId, tenantId, category, subcategory, state, priority, severity, sortBy, sortOrder)

Get Incidents by filter.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    String id = "id_example"; // String | 
    String externalId = "externalId_example"; // String | 
    String tenantId = "tenantId_example"; // String | 
    String category = "category_example"; // String | 
    String subcategory = "subcategory_example"; // String | 
    String state = "state_example"; // String | New|InProgress|OnHold|Resolved|Canceled
    String priority = "priority_example"; // String | Critical|Low|High|Moderate|Planning
    String severity = "severity_example"; // String | High|Medium|Low
    String sortBy = "sortBy_example"; // String | category|subcategory|priority|severity|state
    String sortOrder = "sortOrder_example"; // String | ASC/DESC
    try {
      IncidentsPage result = apiInstance.getIncidents(page, pageSize, id, externalId, tenantId, category, subcategory, state, priority, severity, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#getIncidents");
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
 **id** | **String**|  | [optional]
 **externalId** | **String**|  | [optional]
 **tenantId** | **String**|  | [optional]
 **category** | **String**|  | [optional]
 **subcategory** | **String**|  | [optional]
 **state** | **String**| New|InProgress|OnHold|Resolved|Canceled | [optional]
 **priority** | **String**| Critical|Low|High|Moderate|Planning | [optional]
 **severity** | **String**| High|Medium|Low | [optional]
 **sortBy** | **String**| category|subcategory|priority|severity|state | [optional]
 **sortOrder** | **String**| ASC/DESC | [optional]

### Return type

[**IncidentsPage**](IncidentsPage.md)

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

<a name="updateIncident"></a>
# **updateIncident**
> Incident updateIncident(id, incidentUpdate)

Updates an incident.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.IncidentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    IncidentsApi apiInstance = new IncidentsApi(defaultClient);
    String id = "id_example"; // String | 
    IncidentUpdate incidentUpdate = new IncidentUpdate(); // IncidentUpdate | 
    try {
      Incident result = apiInstance.updateIncident(id, incidentUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncident");
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
 **incidentUpdate** | [**IncidentUpdate**](IncidentUpdate.md)|  |

### Return type

[**Incident**](Incident.md)

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

