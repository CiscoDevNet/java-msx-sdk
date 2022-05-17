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


import com.cisco.msx.platform.model.BillingCostsReport;
import com.cisco.msx.platform.model.BillingEvent;
import com.cisco.msx.platform.model.BillingEventsPage;
import com.cisco.msx.platform.model.Error;
import java.time.OffsetDateTime;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingEventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BillingEventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingEventsApi(ApiClient apiClient) {
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
     * Build call for getCostSummary
     * @param tenantId  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param groupBy  (optional)
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
    public okhttp3.Call getCostSummaryCall(UUID tenantId, OffsetDateTime fromDate, OffsetDateTime toDate, String groupBy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/billing/api/v8/events/costs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (groupBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("groupBy", groupBy));
        }

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
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
    private okhttp3.Call getCostSummaryValidateBeforeCall(UUID tenantId, OffsetDateTime fromDate, OffsetDateTime toDate, String groupBy, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling getCostSummary(Async)");
        }
        

        okhttp3.Call localVarCall = getCostSummaryCall(tenantId, fromDate, toDate, groupBy, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a summary for tenant cost.
     * Needs VIEW_COSTS permission to view cost details.
     * @param tenantId  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param groupBy  (optional)
     * @return BillingCostsReport
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
    public BillingCostsReport getCostSummary(UUID tenantId, OffsetDateTime fromDate, OffsetDateTime toDate, String groupBy) throws ApiException {
        ApiResponse<BillingCostsReport> localVarResp = getCostSummaryWithHttpInfo(tenantId, fromDate, toDate, groupBy);
        return localVarResp.getData();
    }

    /**
     * Retrieve a summary for tenant cost.
     * Needs VIEW_COSTS permission to view cost details.
     * @param tenantId  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param groupBy  (optional)
     * @return ApiResponse&lt;BillingCostsReport&gt;
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
    public ApiResponse<BillingCostsReport> getCostSummaryWithHttpInfo(UUID tenantId, OffsetDateTime fromDate, OffsetDateTime toDate, String groupBy) throws ApiException {
        okhttp3.Call localVarCall = getCostSummaryValidateBeforeCall(tenantId, fromDate, toDate, groupBy, null);
        Type localVarReturnType = new TypeToken<BillingCostsReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a summary for tenant cost. (asynchronously)
     * Needs VIEW_COSTS permission to view cost details.
     * @param tenantId  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param groupBy  (optional)
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
    public okhttp3.Call getCostSummaryAsync(UUID tenantId, OffsetDateTime fromDate, OffsetDateTime toDate, String groupBy, final ApiCallback<BillingCostsReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCostSummaryValidateBeforeCall(tenantId, fromDate, toDate, groupBy, _callback);
        Type localVarReturnType = new TypeToken<BillingCostsReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEvent
     * @param id  (required)
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
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/billing/api/v8/events/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEventValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvent(Async)");
        }
        

        okhttp3.Call localVarCall = getEventCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get an Event.
     * Needs VIEW_EVENTS permission to get a billing event.
     * @param id  (required)
     * @return BillingEvent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public BillingEvent getEvent(UUID id) throws ApiException {
        ApiResponse<BillingEvent> localVarResp = getEventWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get an Event.
     * Needs VIEW_EVENTS permission to get a billing event.
     * @param id  (required)
     * @return ApiResponse&lt;BillingEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillingEvent> getEventWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getEventValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<BillingEvent>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an Event. (asynchronously)
     * Needs VIEW_EVENTS permission to get a billing event.
     * @param id  (required)
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
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEventAsync(UUID id, final ApiCallback<BillingEvent> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEventValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<BillingEvent>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEventsPage
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param type  (optional)
     * @param subtype  (optional)
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
    public okhttp3.Call getEventsPageCall(UUID tenantId, Integer page, Integer pageSize, OffsetDateTime fromDate, OffsetDateTime toDate, String type, String subtype, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/billing/api/v8/events";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromDate", fromDate));
        }

        if (toDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toDate", toDate));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (subtype != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subtype", subtype));
        }

        if (tenantId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tenantId", tenantId));
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
    private okhttp3.Call getEventsPageValidateBeforeCall(UUID tenantId, Integer page, Integer pageSize, OffsetDateTime fromDate, OffsetDateTime toDate, String type, String subtype, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling getEventsPage(Async)");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getEventsPage(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getEventsPage(Async)");
        }
        

        okhttp3.Call localVarCall = getEventsPageCall(tenantId, page, pageSize, fromDate, toDate, type, subtype, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a page of events for tenant.
     * Needs VIEW_EVENTS permission to view the billing events.
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param type  (optional)
     * @param subtype  (optional)
     * @return BillingEventsPage
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
    public BillingEventsPage getEventsPage(UUID tenantId, Integer page, Integer pageSize, OffsetDateTime fromDate, OffsetDateTime toDate, String type, String subtype) throws ApiException {
        ApiResponse<BillingEventsPage> localVarResp = getEventsPageWithHttpInfo(tenantId, page, pageSize, fromDate, toDate, type, subtype);
        return localVarResp.getData();
    }

    /**
     * Retrieve a page of events for tenant.
     * Needs VIEW_EVENTS permission to view the billing events.
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param type  (optional)
     * @param subtype  (optional)
     * @return ApiResponse&lt;BillingEventsPage&gt;
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
    public ApiResponse<BillingEventsPage> getEventsPageWithHttpInfo(UUID tenantId, Integer page, Integer pageSize, OffsetDateTime fromDate, OffsetDateTime toDate, String type, String subtype) throws ApiException {
        okhttp3.Call localVarCall = getEventsPageValidateBeforeCall(tenantId, page, pageSize, fromDate, toDate, type, subtype, null);
        Type localVarReturnType = new TypeToken<BillingEventsPage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a page of events for tenant. (asynchronously)
     * Needs VIEW_EVENTS permission to view the billing events.
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param type  (optional)
     * @param subtype  (optional)
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
    public okhttp3.Call getEventsPageAsync(UUID tenantId, Integer page, Integer pageSize, OffsetDateTime fromDate, OffsetDateTime toDate, String type, String subtype, final ApiCallback<BillingEventsPage> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEventsPageValidateBeforeCall(tenantId, page, pageSize, fromDate, toDate, type, subtype, _callback);
        Type localVarReturnType = new TypeToken<BillingEventsPage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
