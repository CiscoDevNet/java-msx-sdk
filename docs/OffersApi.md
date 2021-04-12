# OffersApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOffer**](OffersApi.md#createOffer) | **POST** /consume/api/v8/offers | Creates a product offer.
[**deleteOffer**](OffersApi.md#deleteOffer) | **DELETE** /consume/api/v8/offers/{id} | Deletes a product offer
[**getOffer**](OffersApi.md#getOffer) | **GET** /consume/api/v8/offers/{id} | Returns a product offer.
[**getOfferAssignmentsList**](OffersApi.md#getOfferAssignmentsList) | **GET** /consume/api/v8/offers/{id}/assignments/list | Returns a list of tenant assignments for a product offer.
[**getOffersCount**](OffersApi.md#getOffersCount) | **GET** /consume/api/v8/offers/count | Returns the number of product offers.
[**getOffersPage**](OffersApi.md#getOffersPage) | **GET** /consume/api/v8/offers | Returns a page of product offers.
[**updateOffer**](OffersApi.md#updateOffer) | **PUT** /consume/api/v8/offers/{id} | Updates a product offer.
[**updateOfferAssignments**](OffersApi.md#updateOfferAssignments) | **PUT** /consume/api/v8/offers/{id}/assignments | Updates the tenant assignemnts for a product offer.


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
    OfferCreate offerCreate = new OfferCreate(); // OfferCreate | 
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
> OffersPage getOffersPage(page, pageSize, productId, tenantIds)

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
    List<UUID> tenantIds = Arrays.asList(); // List<UUID> | 
    try {
      OffersPage result = apiInstance.getOffersPage(page, pageSize, productId, tenantIds);
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
 **tenantIds** | [**List&lt;UUID&gt;**](UUID.md)|  | [optional]

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
    OfferUpdate offerUpdate = new OfferUpdate(); // OfferUpdate | 
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

