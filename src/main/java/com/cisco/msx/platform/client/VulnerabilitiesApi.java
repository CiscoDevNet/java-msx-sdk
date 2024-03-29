/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.client;

import com.cisco.msx.platform.ApiCallback;
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.ApiResponse;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.Pair;
import com.cisco.msx.platform.ProgressRequestBody;
import com.cisco.msx.platform.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cisco.msx.platform.model.Error;
import java.time.OffsetDateTime;
import com.cisco.msx.platform.model.VulnerabilitiesPage;
import com.cisco.msx.platform.model.VulnerabilityFeed;
import com.cisco.msx.platform.model.VulnerabilityIngestPage;
import com.cisco.msx.platform.model.VulnerabilityIngestion;
import com.cisco.msx.platform.model.VulnerabilitySeverity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VulnerabilitiesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VulnerabilitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VulnerabilitiesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getIngestVulnerabilitiesTasksPage
     * @param page  (required)
     * @param pageSize  (required)
     * @param startDate Start date for date range filter on validation execution date. (optional)
     * @param endDate End date for date range filter on validation execution date. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIngestVulnerabilitiesTasksPageCall(Integer page, Integer pageSize, OffsetDateTime startDate, OffsetDateTime endDate, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vulnerability/api/v8/vulnerabilities/ingests";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", endDate));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIngestVulnerabilitiesTasksPageValidateBeforeCall(Integer page, Integer pageSize, OffsetDateTime startDate, OffsetDateTime endDate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getIngestVulnerabilitiesTasksPage(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getIngestVulnerabilitiesTasksPage(Async)");
        }
        

        okhttp3.Call localVarCall = getIngestVulnerabilitiesTasksPageCall(page, pageSize, startDate, endDate, _callback);
        return localVarCall;

    }

    /**
     * Returns a filtered page of ingest tasks.
     * 
     * @param page  (required)
     * @param pageSize  (required)
     * @param startDate Start date for date range filter on validation execution date. (optional)
     * @param endDate End date for date range filter on validation execution date. (optional)
     * @return VulnerabilityIngestPage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public VulnerabilityIngestPage getIngestVulnerabilitiesTasksPage(Integer page, Integer pageSize, OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
        ApiResponse<VulnerabilityIngestPage> localVarResp = getIngestVulnerabilitiesTasksPageWithHttpInfo(page, pageSize, startDate, endDate);
        return localVarResp.getData();
    }

    /**
     * Returns a filtered page of ingest tasks.
     * 
     * @param page  (required)
     * @param pageSize  (required)
     * @param startDate Start date for date range filter on validation execution date. (optional)
     * @param endDate End date for date range filter on validation execution date. (optional)
     * @return ApiResponse&lt;VulnerabilityIngestPage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VulnerabilityIngestPage> getIngestVulnerabilitiesTasksPageWithHttpInfo(Integer page, Integer pageSize, OffsetDateTime startDate, OffsetDateTime endDate) throws ApiException {
        okhttp3.Call localVarCall = getIngestVulnerabilitiesTasksPageValidateBeforeCall(page, pageSize, startDate, endDate, null);
        Type localVarReturnType = new TypeToken<VulnerabilityIngestPage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a filtered page of ingest tasks. (asynchronously)
     * 
     * @param page  (required)
     * @param pageSize  (required)
     * @param startDate Start date for date range filter on validation execution date. (optional)
     * @param endDate End date for date range filter on validation execution date. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getIngestVulnerabilitiesTasksPageAsync(Integer page, Integer pageSize, OffsetDateTime startDate, OffsetDateTime endDate, final ApiCallback<VulnerabilityIngestPage> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIngestVulnerabilitiesTasksPageValidateBeforeCall(page, pageSize, startDate, endDate, _callback);
        Type localVarReturnType = new TypeToken<VulnerabilityIngestPage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVulnerabilitiesPage
     * @param page  (required)
     * @param pageSize  (required)
     * @param cveId CVE identifer (https://www.cvedetails.com/cve-help.php) to filter by. (optional)
     * @param vendor Vendor identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param product Product identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param version Product version (as defined in NIST&#39;s CPE dictionary) filter to filter by. (optional)
     * @param severity A CVSS severity level (https://nvd.nist.gov/vuln-metrics/cvss) to filter by. (optional)
     * @param startDate Start date for date range filter on CVE published date. (optional)
     * @param endDate End date for date range filter on CVE published date. (optional)
     * @param year Year CVE published filter. (optional)
     * @param sortBy  (optional, default to publishedOn)
     * @param sortOrder  (optional, default to asc)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVulnerabilitiesPageCall(Integer page, Integer pageSize, String cveId, String vendor, String product, String version, VulnerabilitySeverity severity, OffsetDateTime startDate, OffsetDateTime endDate, Integer year, String sortBy, String sortOrder, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/vulnerability/api/v8/vulnerabilities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cveId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cveId", cveId));
        }

        if (vendor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("vendor", vendor));
        }

        if (product != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product", product));
        }

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (severity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("severity", severity));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startDate", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endDate", endDate));
        }

        if (year != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("year", year));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortBy", sortBy));
        }

        if (sortOrder != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sortOrder", sortOrder));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVulnerabilitiesPageValidateBeforeCall(Integer page, Integer pageSize, String cveId, String vendor, String product, String version, VulnerabilitySeverity severity, OffsetDateTime startDate, OffsetDateTime endDate, Integer year, String sortBy, String sortOrder, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getVulnerabilitiesPage(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getVulnerabilitiesPage(Async)");
        }
        

        okhttp3.Call localVarCall = getVulnerabilitiesPageCall(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder, _callback);
        return localVarCall;

    }

    /**
     * Returns a filtered page of vulnerabilities.
     * 
     * @param page  (required)
     * @param pageSize  (required)
     * @param cveId CVE identifer (https://www.cvedetails.com/cve-help.php) to filter by. (optional)
     * @param vendor Vendor identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param product Product identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param version Product version (as defined in NIST&#39;s CPE dictionary) filter to filter by. (optional)
     * @param severity A CVSS severity level (https://nvd.nist.gov/vuln-metrics/cvss) to filter by. (optional)
     * @param startDate Start date for date range filter on CVE published date. (optional)
     * @param endDate End date for date range filter on CVE published date. (optional)
     * @param year Year CVE published filter. (optional)
     * @param sortBy  (optional, default to publishedOn)
     * @param sortOrder  (optional, default to asc)
     * @return VulnerabilitiesPage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public VulnerabilitiesPage getVulnerabilitiesPage(Integer page, Integer pageSize, String cveId, String vendor, String product, String version, VulnerabilitySeverity severity, OffsetDateTime startDate, OffsetDateTime endDate, Integer year, String sortBy, String sortOrder) throws ApiException {
        ApiResponse<VulnerabilitiesPage> localVarResp = getVulnerabilitiesPageWithHttpInfo(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder);
        return localVarResp.getData();
    }

    /**
     * Returns a filtered page of vulnerabilities.
     * 
     * @param page  (required)
     * @param pageSize  (required)
     * @param cveId CVE identifer (https://www.cvedetails.com/cve-help.php) to filter by. (optional)
     * @param vendor Vendor identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param product Product identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param version Product version (as defined in NIST&#39;s CPE dictionary) filter to filter by. (optional)
     * @param severity A CVSS severity level (https://nvd.nist.gov/vuln-metrics/cvss) to filter by. (optional)
     * @param startDate Start date for date range filter on CVE published date. (optional)
     * @param endDate End date for date range filter on CVE published date. (optional)
     * @param year Year CVE published filter. (optional)
     * @param sortBy  (optional, default to publishedOn)
     * @param sortOrder  (optional, default to asc)
     * @return ApiResponse&lt;VulnerabilitiesPage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VulnerabilitiesPage> getVulnerabilitiesPageWithHttpInfo(Integer page, Integer pageSize, String cveId, String vendor, String product, String version, VulnerabilitySeverity severity, OffsetDateTime startDate, OffsetDateTime endDate, Integer year, String sortBy, String sortOrder) throws ApiException {
        okhttp3.Call localVarCall = getVulnerabilitiesPageValidateBeforeCall(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder, null);
        Type localVarReturnType = new TypeToken<VulnerabilitiesPage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a filtered page of vulnerabilities. (asynchronously)
     * 
     * @param page  (required)
     * @param pageSize  (required)
     * @param cveId CVE identifer (https://www.cvedetails.com/cve-help.php) to filter by. (optional)
     * @param vendor Vendor identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param product Product identifier (as defined in NIST&#39;s CPE dictionary) to filter by. (optional)
     * @param version Product version (as defined in NIST&#39;s CPE dictionary) filter to filter by. (optional)
     * @param severity A CVSS severity level (https://nvd.nist.gov/vuln-metrics/cvss) to filter by. (optional)
     * @param startDate Start date for date range filter on CVE published date. (optional)
     * @param endDate End date for date range filter on CVE published date. (optional)
     * @param year Year CVE published filter. (optional)
     * @param sortBy  (optional, default to publishedOn)
     * @param sortOrder  (optional, default to asc)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVulnerabilitiesPageAsync(Integer page, Integer pageSize, String cveId, String vendor, String product, String version, VulnerabilitySeverity severity, OffsetDateTime startDate, OffsetDateTime endDate, Integer year, String sortBy, String sortOrder, final ApiCallback<VulnerabilitiesPage> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVulnerabilitiesPageValidateBeforeCall(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder, _callback);
        Type localVarReturnType = new TypeToken<VulnerabilitiesPage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for ingestVulnerabilities
     * @param vulnerabilityFeed  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestVulnerabilitiesCall(VulnerabilityFeed vulnerabilityFeed, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = vulnerabilityFeed;

        // create path and map variables
        String localVarPath = "/vulnerability/api/v8/vulnerabilities/ingests";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call ingestVulnerabilitiesValidateBeforeCall(VulnerabilityFeed vulnerabilityFeed, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'vulnerabilityFeed' is set
        if (vulnerabilityFeed == null) {
            throw new ApiException("Missing the required parameter 'vulnerabilityFeed' when calling ingestVulnerabilities(Async)");
        }
        

        okhttp3.Call localVarCall = ingestVulnerabilitiesCall(vulnerabilityFeed, _callback);
        return localVarCall;

    }

    /**
     * Ingests a CVE JSON feed into the Vulnerability Service datastore.
     * 
     * @param vulnerabilityFeed  (required)
     * @return VulnerabilityIngestion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public VulnerabilityIngestion ingestVulnerabilities(VulnerabilityFeed vulnerabilityFeed) throws ApiException {
        ApiResponse<VulnerabilityIngestion> localVarResp = ingestVulnerabilitiesWithHttpInfo(vulnerabilityFeed);
        return localVarResp.getData();
    }

    /**
     * Ingests a CVE JSON feed into the Vulnerability Service datastore.
     * 
     * @param vulnerabilityFeed  (required)
     * @return ApiResponse&lt;VulnerabilityIngestion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VulnerabilityIngestion> ingestVulnerabilitiesWithHttpInfo(VulnerabilityFeed vulnerabilityFeed) throws ApiException {
        okhttp3.Call localVarCall = ingestVulnerabilitiesValidateBeforeCall(vulnerabilityFeed, null);
        Type localVarReturnType = new TypeToken<VulnerabilityIngestion>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Ingests a CVE JSON feed into the Vulnerability Service datastore. (asynchronously)
     * 
     * @param vulnerabilityFeed  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call ingestVulnerabilitiesAsync(VulnerabilityFeed vulnerabilityFeed, final ApiCallback<VulnerabilityIngestion> _callback) throws ApiException {

        okhttp3.Call localVarCall = ingestVulnerabilitiesValidateBeforeCall(vulnerabilityFeed, _callback);
        Type localVarReturnType = new TypeToken<VulnerabilityIngestion>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
