/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.8
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


import com.cisco.msx.platform.model.BillingPrice;
import com.cisco.msx.platform.model.BillingPriceCreate;
import com.cisco.msx.platform.model.BillingPriceUpdate;
import com.cisco.msx.platform.model.BillingPricesPage;
import com.cisco.msx.platform.model.Error;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingPricesApi {
    private ApiClient localVarApiClient;

    public BillingPricesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingPricesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addPrice
     * @param billingPriceCreate  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPriceCall(BillingPriceCreate billingPriceCreate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = billingPriceCreate;

        // create path and map variables
        String localVarPath = "/billing/api/v8/prices";

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addPriceValidateBeforeCall(BillingPriceCreate billingPriceCreate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'billingPriceCreate' is set
        if (billingPriceCreate == null) {
            throw new ApiException("Missing the required parameter 'billingPriceCreate' when calling addPrice(Async)");
        }
        

        okhttp3.Call localVarCall = addPriceCall(billingPriceCreate, _callback);
        return localVarCall;

    }

    /**
     * Add price for tenant and event type.
     * Needs MANAGE_PRICES permission to allow for the creation of a price.
     * @param billingPriceCreate  (required)
     * @return BillingPrice
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public BillingPrice addPrice(BillingPriceCreate billingPriceCreate) throws ApiException {
        ApiResponse<BillingPrice> localVarResp = addPriceWithHttpInfo(billingPriceCreate);
        return localVarResp.getData();
    }

    /**
     * Add price for tenant and event type.
     * Needs MANAGE_PRICES permission to allow for the creation of a price.
     * @param billingPriceCreate  (required)
     * @return ApiResponse&lt;BillingPrice&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillingPrice> addPriceWithHttpInfo(BillingPriceCreate billingPriceCreate) throws ApiException {
        okhttp3.Call localVarCall = addPriceValidateBeforeCall(billingPriceCreate, null);
        Type localVarReturnType = new TypeToken<BillingPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add price for tenant and event type. (asynchronously)
     * Needs MANAGE_PRICES permission to allow for the creation of a price.
     * @param billingPriceCreate  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPriceAsync(BillingPriceCreate billingPriceCreate, final ApiCallback<BillingPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = addPriceValidateBeforeCall(billingPriceCreate, _callback);
        Type localVarReturnType = new TypeToken<BillingPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePrice
     * @param id  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePriceCall(UUID id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billing/api/v8/prices/{id}"
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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePriceValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePrice(Async)");
        }
        

        okhttp3.Call localVarCall = deletePriceCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete a price.
     * Needs MANAGE_PRICES permission to delete a price.
     * @param id  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void deletePrice(UUID id) throws ApiException {
        deletePriceWithHttpInfo(id);
    }

    /**
     * Delete a price.
     * Needs MANAGE_PRICES permission to delete a price.
     * @param id  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deletePriceWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deletePriceValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete a price. (asynchronously)
     * Needs MANAGE_PRICES permission to delete a price.
     * @param id  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthenticated </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePriceAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePriceValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPrice
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
    public okhttp3.Call getPriceCall(UUID id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billing/api/v8/prices/{id}"
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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPriceValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPrice(Async)");
        }
        

        okhttp3.Call localVarCall = getPriceCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get a price.
     * Needs VIEW_PRICES permission to get pricing detail.
     * @param id  (required)
     * @return BillingPrice
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
    public BillingPrice getPrice(UUID id) throws ApiException {
        ApiResponse<BillingPrice> localVarResp = getPriceWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get a price.
     * Needs VIEW_PRICES permission to get pricing detail.
     * @param id  (required)
     * @return ApiResponse&lt;BillingPrice&gt;
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
    public ApiResponse<BillingPrice> getPriceWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getPriceValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<BillingPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a price. (asynchronously)
     * Needs VIEW_PRICES permission to get pricing detail.
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
    public okhttp3.Call getPriceAsync(UUID id, final ApiCallback<BillingPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPriceValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<BillingPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPricesPage
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
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
    public okhttp3.Call getPricesPageCall(UUID tenantId, Integer page, Integer pageSize, String type, String subtype, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billing/api/v8/prices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPricesPageValidateBeforeCall(UUID tenantId, Integer page, Integer pageSize, String type, String subtype, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new ApiException("Missing the required parameter 'tenantId' when calling getPricesPage(Async)");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getPricesPage(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getPricesPage(Async)");
        }
        

        okhttp3.Call localVarCall = getPricesPageCall(tenantId, page, pageSize, type, subtype, _callback);
        return localVarCall;

    }

    /**
     * Retrieve a page of prices.
     * Needs VIEW_PRICES permission to view the pricing details.
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param type  (optional)
     * @param subtype  (optional)
     * @return BillingPricesPage
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
    public BillingPricesPage getPricesPage(UUID tenantId, Integer page, Integer pageSize, String type, String subtype) throws ApiException {
        ApiResponse<BillingPricesPage> localVarResp = getPricesPageWithHttpInfo(tenantId, page, pageSize, type, subtype);
        return localVarResp.getData();
    }

    /**
     * Retrieve a page of prices.
     * Needs VIEW_PRICES permission to view the pricing details.
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param type  (optional)
     * @param subtype  (optional)
     * @return ApiResponse&lt;BillingPricesPage&gt;
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
    public ApiResponse<BillingPricesPage> getPricesPageWithHttpInfo(UUID tenantId, Integer page, Integer pageSize, String type, String subtype) throws ApiException {
        okhttp3.Call localVarCall = getPricesPageValidateBeforeCall(tenantId, page, pageSize, type, subtype, null);
        Type localVarReturnType = new TypeToken<BillingPricesPage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve a page of prices. (asynchronously)
     * Needs VIEW_PRICES permission to view the pricing details.
     * @param tenantId  (required)
     * @param page  (required)
     * @param pageSize  (required)
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
    public okhttp3.Call getPricesPageAsync(UUID tenantId, Integer page, Integer pageSize, String type, String subtype, final ApiCallback<BillingPricesPage> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPricesPageValidateBeforeCall(tenantId, page, pageSize, type, subtype, _callback);
        Type localVarReturnType = new TypeToken<BillingPricesPage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePrice
     * @param id  (required)
     * @param billingPriceUpdate  (required)
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
    public okhttp3.Call updatePriceCall(UUID id, BillingPriceUpdate billingPriceUpdate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = billingPriceUpdate;

        // create path and map variables
        String localVarPath = "/billing/api/v8/prices/{id}"
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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePriceValidateBeforeCall(UUID id, BillingPriceUpdate billingPriceUpdate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updatePrice(Async)");
        }
        
        // verify the required parameter 'billingPriceUpdate' is set
        if (billingPriceUpdate == null) {
            throw new ApiException("Missing the required parameter 'billingPriceUpdate' when calling updatePrice(Async)");
        }
        

        okhttp3.Call localVarCall = updatePriceCall(id, billingPriceUpdate, _callback);
        return localVarCall;

    }

    /**
     * Update price for an event type and tenant.
     * Needs MANAGE_PRICES permission to update a pricing detail.
     * @param id  (required)
     * @param billingPriceUpdate  (required)
     * @return BillingPrice
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
    public BillingPrice updatePrice(UUID id, BillingPriceUpdate billingPriceUpdate) throws ApiException {
        ApiResponse<BillingPrice> localVarResp = updatePriceWithHttpInfo(id, billingPriceUpdate);
        return localVarResp.getData();
    }

    /**
     * Update price for an event type and tenant.
     * Needs MANAGE_PRICES permission to update a pricing detail.
     * @param id  (required)
     * @param billingPriceUpdate  (required)
     * @return ApiResponse&lt;BillingPrice&gt;
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
    public ApiResponse<BillingPrice> updatePriceWithHttpInfo(UUID id, BillingPriceUpdate billingPriceUpdate) throws ApiException {
        okhttp3.Call localVarCall = updatePriceValidateBeforeCall(id, billingPriceUpdate, null);
        Type localVarReturnType = new TypeToken<BillingPrice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update price for an event type and tenant. (asynchronously)
     * Needs MANAGE_PRICES permission to update a pricing detail.
     * @param id  (required)
     * @param billingPriceUpdate  (required)
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
    public okhttp3.Call updatePriceAsync(UUID id, BillingPriceUpdate billingPriceUpdate, final ApiCallback<BillingPrice> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePriceValidateBeforeCall(id, billingPriceUpdate, _callback);
        Type localVarReturnType = new TypeToken<BillingPrice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
