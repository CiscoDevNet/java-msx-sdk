# OffersApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOfferAssignments**](OffersApi.md#addOfferAssignments) | **POST** /consume/api/v8/offers/{id}/assignments/add | Assigns a product offer to one or more tenants.
[**createOffer**](OffersApi.md#createOffer) | **POST** /consume/api/v8/offers | Creates a product offer.
[**deleteOffer**](OffersApi.md#deleteOffer) | **DELETE** /consume/api/v8/offers/{id} | Deletes a product offer
[**getOffer**](OffersApi.md#getOffer) | **GET** /consume/api/v8/offers/{id} | Returns a product offer.
[**getOfferAssignmentsList**](OffersApi.md#getOfferAssignmentsList) | **GET** /consume/api/v8/offers/{id}/assignments/list | Returns a list of tenant assignments for a product offer.
[**getOffersCount**](OffersApi.md#getOffersCount) | **GET** /consume/api/v8/offers/count | Returns the number of product offers.
[**getOffersPage**](OffersApi.md#getOffersPage) | **GET** /consume/api/v8/offers | Returns a page of product offers.
[**removeOfferAssignments**](OffersApi.md#removeOfferAssignments) | **POST** /consume/api/v8/offers/{id}/assignments/remove | Unassigns a product offer from one or more tenants.
[**updateOffer**](OffersApi.md#updateOffer) | **PUT** /consume/api/v8/offers/{id} | Updates a product offer.
[**updateOfferAssignments**](OffersApi.md#updateOfferAssignments) | **PUT** /consume/api/v8/offers/{id}/assignments | Updates the tenant assignemnts for a product offer.


<a name="addOfferAssignments"></a>
# **addOfferAssignments**
> List&lt;CatalogAssignment&gt; addOfferAssignments(id, UUID)

Assigns a product offer to one or more tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<UUID> UUID = ["e8ff9360-c8f1-4f06-84d8-d8105bd29e1e","3c64b303-ec28-4fe2-99b5-13f521b92700","48feaddb-45d0-4126-a216-3e450bfdbba4"]; // List<UUID> | 
    try {
      List<CatalogAssignment> result = apiInstance.addOfferAssignments(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#addOfferAssignments");
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
 **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  |

### Return type

[**List&lt;CatalogAssignment&gt;**](CatalogAssignment.md)

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

<a name="createOffer"></a>
# **createOffer**
> Offer createOffer(offerCreate)

Creates a product offer.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    OfferCreate offerCreate = {"name":"cisco.consume.service.manageddevice.label","label":"cisco.consume.manageddevice.offer.manageddevice.full","description":"cisco.consume.service.manageddevice.description.label","productId":"83432bdd-1293-4bf3-ab53-77a199e2beff","version":1,"displayOrder":1,"image":"services/manageddevice/images/managed-cpe.svg","price":"test","type":"test","supportedProperties":["Basic-small"],"supportedOptions":[{"name":"Centralized_device_management","value":"Yes"},{"name":"Zero_Touch_Deployment","value":"Yes"},{"name":"Configuration_templates","value":"Yes"},{"name":"Monitoring_and_metrics","value":"Yes"}]}; // OfferCreate | 
    try {
      Offer result = apiInstance.createOffer(offerCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#createOffer");
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
 **offerCreate** | [**OfferCreate**](OfferCreate.md)|  |

### Return type

[**Offer**](Offer.md)

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

<a name="deleteOffer"></a>
# **deleteOffer**
> deleteOffer(id)

Deletes a product offer

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteOffer(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#deleteOffer");
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

<a name="getOffer"></a>
# **getOffer**
> Offer getOffer(id)

Returns a product offer.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      Offer result = apiInstance.getOffer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#getOffer");
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

[**Offer**](Offer.md)

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

<a name="getOfferAssignmentsList"></a>
# **getOfferAssignmentsList**
> List&lt;CatalogAssignment&gt; getOfferAssignmentsList(id)

Returns a list of tenant assignments for a product offer.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      List<CatalogAssignment> result = apiInstance.getOfferAssignmentsList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#getOfferAssignmentsList");
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

[**List&lt;CatalogAssignment&gt;**](CatalogAssignment.md)

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

<a name="getOffersCount"></a>
# **getOffersCount**
> Long getOffersCount(productId, tenantId)

Returns the number of product offers.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID productId = new UUID(); // UUID | 
    UUID tenantId = new UUID(); // UUID | 
    try {
      Long result = apiInstance.getOffersCount(productId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#getOffersCount");
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
 **productId** | [**UUID**](.md)|  | [optional]
 **tenantId** | [**UUID**](.md)|  | [optional]

### Return type

**Long**

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

<a name="getOffersPage"></a>
# **getOffersPage**
> OffersPage getOffersPage(page, pageSize, productId, tenantId)

Returns a page of product offers.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID productId = new UUID(); // UUID | 
    UUID tenantId = new UUID(); // UUID | 
    try {
      OffersPage result = apiInstance.getOffersPage(page, pageSize, productId, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#getOffersPage");
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
 **productId** | [**UUID**](.md)|  | [optional]
 **tenantId** | [**UUID**](.md)|  | [optional]

### Return type

[**OffersPage**](OffersPage.md)

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

<a name="removeOfferAssignments"></a>
# **removeOfferAssignments**
> List&lt;CatalogAssignment&gt; removeOfferAssignments(id, UUID)

Unassigns a product offer from one or more tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<UUID> UUID = ["e8ff9360-c8f1-4f06-84d8-d8105bd29e1e","3c64b303-ec28-4fe2-99b5-13f521b92700","48feaddb-45d0-4126-a216-3e450bfdbba4"]; // List<UUID> | 
    try {
      List<CatalogAssignment> result = apiInstance.removeOfferAssignments(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#removeOfferAssignments");
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
 **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  |

### Return type

[**List&lt;CatalogAssignment&gt;**](CatalogAssignment.md)

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

<a name="updateOffer"></a>
# **updateOffer**
> Offer updateOffer(id, offerUpdate)

Updates a product offer.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    OfferUpdate offerUpdate = {"name":"branches","label":"cisco.consume.service.vbranch.offer.name","description":"cisco.consume.service.vbranch.offer.description","productId":"46bad1ba-2704-419d-b9b4-f1cdff79da4f","version":1,"displayOrder":1,"image":"/services/vbranch/images/icons/image_vbranch_service.svg","price":null,"type":null,"supportedProperties":["Basic-small"],"supportedOptions":[{"name":"Template_Development_Environment","value":"Yes"},{"name":"Zero_Touch_Deployment","value":"Yes"},{"name":"Custom_Service_Chaining","value":"Yes"},{"name":"Third_Party","value":"Yes"}],"approvals":null}; // OfferUpdate | 
    try {
      Offer result = apiInstance.updateOffer(id, offerUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#updateOffer");
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
 **offerUpdate** | [**OfferUpdate**](OfferUpdate.md)|  |

### Return type

[**Offer**](Offer.md)

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

<a name="updateOfferAssignments"></a>
# **updateOfferAssignments**
> List&lt;CatalogAssignment&gt; updateOfferAssignments(id, UUID)

Updates the tenant assignemnts for a product offer.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    OffersApi apiInstance = new OffersApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<UUID> UUID = ["e8ff9360-c8f1-4f06-84d8-d8105bd29e1e","3c64b303-ec28-4fe2-99b5-13f521b92700","48feaddb-45d0-4126-a216-3e450bfdbba4"]; // List<UUID> | 
    try {
      List<CatalogAssignment> result = apiInstance.updateOfferAssignments(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#updateOfferAssignments");
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
 **UUID** | [**List&lt;UUID&gt;**](UUID.md)|  |

### Return type

[**List&lt;CatalogAssignment&gt;**](CatalogAssignment.md)

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

