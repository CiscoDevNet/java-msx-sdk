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


import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.ResourceHealth;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HealthApi {
    private ApiClient localVarApiClient;

    public HealthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HealthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getDevicesHealthList
     * @param ids  (required)
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
    public okhttp3.Call getDevicesHealthListCall(List<String> ids, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/monitor/api/v8/health/devices/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ids != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ids", ids));
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
    private okhttp3.Call getDevicesHealthListValidateBeforeCall(List<String> ids, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling getDevicesHealthList(Async)");
        }
        

        okhttp3.Call localVarCall = getDevicesHealthListCall(ids, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param ids  (required)
     * @return List&lt;ResourceHealth&gt;
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
    public List<ResourceHealth> getDevicesHealthList(List<String> ids) throws ApiException {
        ApiResponse<List<ResourceHealth>> localVarResp = getDevicesHealthListWithHttpInfo(ids);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ids  (required)
     * @return ApiResponse&lt;List&lt;ResourceHealth&gt;&gt;
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
    public ApiResponse<List<ResourceHealth>> getDevicesHealthListWithHttpInfo(List<String> ids) throws ApiException {
        okhttp3.Call localVarCall = getDevicesHealthListValidateBeforeCall(ids, null);
        Type localVarReturnType = new TypeToken<List<ResourceHealth>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ids  (required)
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
    public okhttp3.Call getDevicesHealthListAsync(List<String> ids, final ApiCallback<List<ResourceHealth>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDevicesHealthListValidateBeforeCall(ids, _callback);
        Type localVarReturnType = new TypeToken<List<ResourceHealth>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getServicesHealthList
     * @param ids  (required)
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
    public okhttp3.Call getServicesHealthListCall(List<String> ids, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/monitor/api/v8/health/services/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (ids != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ids", ids));
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
    private okhttp3.Call getServicesHealthListValidateBeforeCall(List<String> ids, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'ids' is set
        if (ids == null) {
            throw new ApiException("Missing the required parameter 'ids' when calling getServicesHealthList(Async)");
        }
        

        okhttp3.Call localVarCall = getServicesHealthListCall(ids, _callback);
        return localVarCall;

    }

    /**
     * 
     * 
     * @param ids  (required)
     * @return List&lt;ResourceHealth&gt;
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
    public List<ResourceHealth> getServicesHealthList(List<String> ids) throws ApiException {
        ApiResponse<List<ResourceHealth>> localVarResp = getServicesHealthListWithHttpInfo(ids);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param ids  (required)
     * @return ApiResponse&lt;List&lt;ResourceHealth&gt;&gt;
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
    public ApiResponse<List<ResourceHealth>> getServicesHealthListWithHttpInfo(List<String> ids) throws ApiException {
        okhttp3.Call localVarCall = getServicesHealthListValidateBeforeCall(ids, null);
        Type localVarReturnType = new TypeToken<List<ResourceHealth>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param ids  (required)
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
    public okhttp3.Call getServicesHealthListAsync(List<String> ids, final ApiCallback<List<ResourceHealth>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getServicesHealthListValidateBeforeCall(ids, _callback);
        Type localVarReturnType = new TypeToken<List<ResourceHealth>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
