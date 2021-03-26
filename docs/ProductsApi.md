# ProductsApi

All URIs are relative to *http://localhost:8765*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProductAssignments**](ProductsApi.md#addProductAssignments) | **POST** /consume/api/v8/products/{id}/assignments/add | Assigns a product to one or more tenants.
[**createProduct**](ProductsApi.md#createProduct) | **POST** /consume/api/v8/products | Creates a product.
[**deleteProduct**](ProductsApi.md#deleteProduct) | **DELETE** /consume/api/v8/products/{id} | Deletes a product.
[**getProduct**](ProductsApi.md#getProduct) | **GET** /consume/api/v8/products/{id} | Returns a product.
[**getProductAssignmentsList**](ProductsApi.md#getProductAssignmentsList) | **GET** /consume/api/v8/products/{id}/assignments/list | Returns a list of tenant assignments for a product .
[**getProductsCount**](ProductsApi.md#getProductsCount) | **GET** /consume/api/v8/products/count | Returns the number of products.
[**getProductsPage**](ProductsApi.md#getProductsPage) | **GET** /consume/api/v8/products | Returns a page of products.
[**removeProductAssignments**](ProductsApi.md#removeProductAssignments) | **POST** /consume/api/v8/products/{id}/assignments/remove | Unassigns a product from one or more tenants
[**updateProduct**](ProductsApi.md#updateProduct) | **PUT** /consume/api/v8/products/{id} | Updates a product.
[**updateProductAssignments**](ProductsApi.md#updateProductAssignments) | **PUT** /consume/api/v8/products/{id}/assignments | Updates the tenant assignments for a product.


<a name="addProductAssignments"></a>
# **addProductAssignments**
> List&lt;CatalogAssignment&gt; addProductAssignments(id, UUID)

Assigns a product to one or more tenants.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<UUID> UUID = ["e8ff9360-c8f1-4f06-84d8-d8105bd29e1e","3c64b303-ec28-4fe2-99b5-13f521b92700","48feaddb-45d0-4126-a216-3e450bfdbba4"]; // List<UUID> | 
    try {
      List<CatalogAssignment> result = apiInstance.addProductAssignments(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#addProductAssignments");
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

<a name="createProduct"></a>
# **createProduct**
> Product createProduct(productCreate)

Creates a product.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    ProductCreate productCreate = new ProductCreate(); // ProductCreate | 
    try {
      Product result = apiInstance.createProduct(productCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#createProduct");
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
 **productCreate** | [**ProductCreate**](ProductCreate.md)|  |

### Return type

[**Product**](Product.md)

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

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(id)

Deletes a product.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      apiInstance.deleteProduct(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#deleteProduct");
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

<a name="getProduct"></a>
# **getProduct**
> Product getProduct(id)

Returns a product.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      Product result = apiInstance.getProduct(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProduct");
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

[**Product**](Product.md)

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

<a name="getProductAssignmentsList"></a>
# **getProductAssignmentsList**
> List&lt;CatalogAssignment&gt; getProductAssignmentsList(id)

Returns a list of tenant assignments for a product .

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    try {
      List<CatalogAssignment> result = apiInstance.getProductAssignmentsList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProductAssignmentsList");
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

<a name="getProductsCount"></a>
# **getProductsCount**
> Long getProductsCount(tenantId)

Returns the number of products.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID tenantId = new UUID(); // UUID | 
    try {
      Long result = apiInstance.getProductsCount(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProductsCount");
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

<a name="getProductsPage"></a>
# **getProductsPage**
> ProductsPage getProductsPage(page, pageSize, tenantId)

Returns a page of products.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    UUID tenantId = new UUID(); // UUID | 
    try {
      ProductsPage result = apiInstance.getProductsPage(page, pageSize, tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#getProductsPage");
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
 **tenantId** | [**UUID**](.md)|  | [optional]

### Return type

[**ProductsPage**](ProductsPage.md)

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

<a name="removeProductAssignments"></a>
# **removeProductAssignments**
> List&lt;CatalogAssignment&gt; removeProductAssignments(id, UUID)

Unassigns a product from one or more tenants

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<UUID> UUID = ["e8ff9360-c8f1-4f06-84d8-d8105bd29e1e","3c64b303-ec28-4fe2-99b5-13f521b92700","48feaddb-45d0-4126-a216-3e450bfdbba4"]; // List<UUID> | 
    try {
      List<CatalogAssignment> result = apiInstance.removeProductAssignments(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#removeProductAssignments");
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

<a name="updateProduct"></a>
# **updateProduct**
> Product updateProduct(id, productUpdate)

Updates a product.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    ProductUpdate productUpdate = new ProductUpdate(); // ProductUpdate | 
    try {
      Product result = apiInstance.updateProduct(id, productUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProduct");
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
 **productUpdate** | [**ProductUpdate**](ProductUpdate.md)|  |

### Return type

[**Product**](Product.md)

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

<a name="updateProductAssignments"></a>
# **updateProductAssignments**
> List&lt;CatalogAssignment&gt; updateProductAssignments(id, UUID)

Updates the tenant assignments for a product.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.ProductsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    ProductsApi apiInstance = new ProductsApi(defaultClient);
    UUID id = new UUID(); // UUID | 
    List<UUID> UUID = ["e8ff9360-c8f1-4f06-84d8-d8105bd29e1e","3c64b303-ec28-4fe2-99b5-13f521b92700","48feaddb-45d0-4126-a216-3e450bfdbba4"]; // List<UUID> | 
    try {
      List<CatalogAssignment> result = apiInstance.updateProductAssignments(id, UUID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductsApi#updateProductAssignments");
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

