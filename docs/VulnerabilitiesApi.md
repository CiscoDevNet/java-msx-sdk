# VulnerabilitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIngestVulnerabilitiesTasksPage**](VulnerabilitiesApi.md#getIngestVulnerabilitiesTasksPage) | **GET** /vulnerability/api/v8/vulnerabilities/ingests | Returns a filtered page of ingest tasks.
[**getVulnerabilitiesPage**](VulnerabilitiesApi.md#getVulnerabilitiesPage) | **GET** /vulnerability/api/v8/vulnerabilities | Returns a filtered page of vulnerabilities.
[**ingestVulnerabilities**](VulnerabilitiesApi.md#ingestVulnerabilities) | **POST** /vulnerability/api/v8/vulnerabilities/ingests | Ingests a CVE JSON feed into the Vulnerability Service datastore.


<a name="getIngestVulnerabilitiesTasksPage"></a>
# **getIngestVulnerabilitiesTasksPage**
> VulnerabilityIngestPage getIngestVulnerabilitiesTasksPage(page, pageSize, startDate, endDate)

Returns a filtered page of ingest tasks.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.VulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VulnerabilitiesApi apiInstance = new VulnerabilitiesApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date for date range filter on validation execution date.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date for date range filter on validation execution date.
    try {
      VulnerabilityIngestPage result = apiInstance.getIngestVulnerabilitiesTasksPage(page, pageSize, startDate, endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VulnerabilitiesApi#getIngestVulnerabilitiesTasksPage");
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
 **startDate** | **OffsetDateTime**| Start date for date range filter on validation execution date. | [optional]
 **endDate** | **OffsetDateTime**| End date for date range filter on validation execution date. | [optional]

### Return type

[**VulnerabilityIngestPage**](VulnerabilityIngestPage.md)

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

<a name="getVulnerabilitiesPage"></a>
# **getVulnerabilitiesPage**
> VulnerabilitiesPage getVulnerabilitiesPage(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder)

Returns a filtered page of vulnerabilities.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.VulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VulnerabilitiesApi apiInstance = new VulnerabilitiesApi(defaultClient);
    Integer page = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    String cveId = "CVE-2021-0202"; // String | CVE identifer (https://www.cvedetails.com/cve-help.php) to filter by.
    String vendor = "cisco"; // String | Vendor identifier (as defined in NIST's CPE dictionary) to filter by.
    String product = "ios_xe"; // String | Product identifier (as defined in NIST's CPE dictionary) to filter by.
    String version = "12.3"; // String | Product version (as defined in NIST's CPE dictionary) filter to filter by.
    VulnerabilitySeverity severity = VulnerabilitySeverity.fromValue("NONE"); // VulnerabilitySeverity | A CVSS severity level (https://nvd.nist.gov/vuln-metrics/cvss) to filter by.
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date for date range filter on CVE published date.
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date for date range filter on CVE published date.
    Integer year = 2019; // Integer | Year CVE published filter.
    String sortBy = "publishedOn"; // String | 
    String sortOrder = "asc"; // String | 
    try {
      VulnerabilitiesPage result = apiInstance.getVulnerabilitiesPage(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VulnerabilitiesApi#getVulnerabilitiesPage");
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
 **cveId** | **String**| CVE identifer (https://www.cvedetails.com/cve-help.php) to filter by. | [optional]
 **vendor** | **String**| Vendor identifier (as defined in NIST&#39;s CPE dictionary) to filter by. | [optional]
 **product** | **String**| Product identifier (as defined in NIST&#39;s CPE dictionary) to filter by. | [optional]
 **version** | **String**| Product version (as defined in NIST&#39;s CPE dictionary) filter to filter by. | [optional]
 **severity** | [**VulnerabilitySeverity**](.md)| A CVSS severity level (https://nvd.nist.gov/vuln-metrics/cvss) to filter by. | [optional] [enum: NONE, LOW, MEDIUM, HIGH, CRITICAL]
 **startDate** | **OffsetDateTime**| Start date for date range filter on CVE published date. | [optional]
 **endDate** | **OffsetDateTime**| End date for date range filter on CVE published date. | [optional]
 **year** | **Integer**| Year CVE published filter. | [optional]
 **sortBy** | **String**|  | [optional] [default to publishedOn] [enum: publishedOn, modifiedOn]
 **sortOrder** | **String**|  | [optional] [default to asc] [enum: asc, desc]

### Return type

[**VulnerabilitiesPage**](VulnerabilitiesPage.md)

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

<a name="ingestVulnerabilities"></a>
# **ingestVulnerabilities**
> VulnerabilityIngestion ingestVulnerabilities(vulnerabilityFeed)

Ingests a CVE JSON feed into the Vulnerability Service datastore.

### Example
```java
// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.VulnerabilitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VulnerabilitiesApi apiInstance = new VulnerabilitiesApi(defaultClient);
    VulnerabilityFeed vulnerabilityFeed = new VulnerabilityFeed(); // VulnerabilityFeed | 
    try {
      VulnerabilityIngestion result = apiInstance.ingestVulnerabilities(vulnerabilityFeed);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VulnerabilitiesApi#ingestVulnerabilities");
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
 **vulnerabilityFeed** | [**VulnerabilityFeed**](VulnerabilityFeed.md)|  |

### Return type

[**VulnerabilityIngestion**](VulnerabilityIngestion.md)

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

