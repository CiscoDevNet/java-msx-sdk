/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: somecontact@cisco.com
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
import java.time.LocalDate;
import com.cisco.msx.platform.model.WorkflowAction;
import com.cisco.msx.platform.model.WorkflowInstance;
import com.cisco.msx.platform.model.WorkflowInstanceDeleteResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkflowInstancesApi {
    private ApiClient localVarApiClient;

    public WorkflowInstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WorkflowInstancesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for cancelWorkflowInstance
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
    public okhttp3.Call cancelWorkflowInstanceCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflow/api/v8/workflows/instances/{id}/cancel"
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
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelWorkflowInstanceValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling cancelWorkflowInstance(Async)");
        }
        

        okhttp3.Call localVarCall = cancelWorkflowInstanceCall(id, _callback);
        return localVarCall;

    }

    /**
     * Cancels a workflow instance.
     * 
     * @param id  (required)
     * @return WorkflowInstance
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
    public WorkflowInstance cancelWorkflowInstance(String id) throws ApiException {
        ApiResponse<WorkflowInstance> localVarResp = cancelWorkflowInstanceWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Cancels a workflow instance.
     * 
     * @param id  (required)
     * @return ApiResponse&lt;WorkflowInstance&gt;
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
    public ApiResponse<WorkflowInstance> cancelWorkflowInstanceWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = cancelWorkflowInstanceValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<WorkflowInstance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancels a workflow instance. (asynchronously)
     * 
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
    public okhttp3.Call cancelWorkflowInstanceAsync(String id, final ApiCallback<WorkflowInstance> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelWorkflowInstanceValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<WorkflowInstance>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteWorkflowInstance
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
    public okhttp3.Call deleteWorkflowInstanceCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflow/api/v8/workflows/instances/{id}"
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
    private okhttp3.Call deleteWorkflowInstanceValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteWorkflowInstance(Async)");
        }
        

        okhttp3.Call localVarCall = deleteWorkflowInstanceCall(id, _callback);
        return localVarCall;

    }

    /**
     * Deletes a workflow instance.
     * 
     * @param id  (required)
     * @return WorkflowInstanceDeleteResponse
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
    public WorkflowInstanceDeleteResponse deleteWorkflowInstance(String id) throws ApiException {
        ApiResponse<WorkflowInstanceDeleteResponse> localVarResp = deleteWorkflowInstanceWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Deletes a workflow instance.
     * 
     * @param id  (required)
     * @return ApiResponse&lt;WorkflowInstanceDeleteResponse&gt;
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
    public ApiResponse<WorkflowInstanceDeleteResponse> deleteWorkflowInstanceWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = deleteWorkflowInstanceValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<WorkflowInstanceDeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletes a workflow instance. (asynchronously)
     * 
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
    public okhttp3.Call deleteWorkflowInstanceAsync(String id, final ApiCallback<WorkflowInstanceDeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteWorkflowInstanceValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<WorkflowInstanceDeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorkflowInstance
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
    public okhttp3.Call getWorkflowInstanceCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflow/api/v8/workflows/instances/{id}"
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
    private okhttp3.Call getWorkflowInstanceValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getWorkflowInstance(Async)");
        }
        

        okhttp3.Call localVarCall = getWorkflowInstanceCall(id, _callback);
        return localVarCall;

    }

    /**
     * Returns a workflow instance.
     * 
     * @param id  (required)
     * @return WorkflowInstance
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
    public WorkflowInstance getWorkflowInstance(String id) throws ApiException {
        ApiResponse<WorkflowInstance> localVarResp = getWorkflowInstanceWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Returns a workflow instance.
     * 
     * @param id  (required)
     * @return ApiResponse&lt;WorkflowInstance&gt;
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
    public ApiResponse<WorkflowInstance> getWorkflowInstanceWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getWorkflowInstanceValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<WorkflowInstance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a workflow instance. (asynchronously)
     * 
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
    public okhttp3.Call getWorkflowInstanceAsync(String id, final ApiCallback<WorkflowInstance> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkflowInstanceValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<WorkflowInstance>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorkflowInstanceAction
     * @param id  (required)
     * @param actionId  (required)
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
    public okhttp3.Call getWorkflowInstanceActionCall(String id, String actionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflow/api/v8/workflows/instances/{id}/actions/{actionId}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()))
            .replaceAll("\\{" + "actionId" + "\\}", localVarApiClient.escapeString(actionId.toString()));

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
    private okhttp3.Call getWorkflowInstanceActionValidateBeforeCall(String id, String actionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getWorkflowInstanceAction(Async)");
        }
        
        // verify the required parameter 'actionId' is set
        if (actionId == null) {
            throw new ApiException("Missing the required parameter 'actionId' when calling getWorkflowInstanceAction(Async)");
        }
        

        okhttp3.Call localVarCall = getWorkflowInstanceActionCall(id, actionId, _callback);
        return localVarCall;

    }

    /**
     * Returns a workflow instance action.
     * 
     * @param id  (required)
     * @param actionId  (required)
     * @return WorkflowAction
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
    public WorkflowAction getWorkflowInstanceAction(String id, String actionId) throws ApiException {
        ApiResponse<WorkflowAction> localVarResp = getWorkflowInstanceActionWithHttpInfo(id, actionId);
        return localVarResp.getData();
    }

    /**
     * Returns a workflow instance action.
     * 
     * @param id  (required)
     * @param actionId  (required)
     * @return ApiResponse&lt;WorkflowAction&gt;
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
    public ApiResponse<WorkflowAction> getWorkflowInstanceActionWithHttpInfo(String id, String actionId) throws ApiException {
        okhttp3.Call localVarCall = getWorkflowInstanceActionValidateBeforeCall(id, actionId, null);
        Type localVarReturnType = new TypeToken<WorkflowAction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a workflow instance action. (asynchronously)
     * 
     * @param id  (required)
     * @param actionId  (required)
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
    public okhttp3.Call getWorkflowInstanceActionAsync(String id, String actionId, final ApiCallback<WorkflowAction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkflowInstanceActionValidateBeforeCall(id, actionId, _callback);
        Type localVarReturnType = new TypeToken<WorkflowAction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWorkflowInstancesList
     * @param id  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
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
    public okhttp3.Call getWorkflowInstancesListCall(String id, Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workflow/api/v8/workflows/{id}/instances/list"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dateFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dateFrom", dateFrom));
        }

        if (dateTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dateTo", dateTo));
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
    private okhttp3.Call getWorkflowInstancesListValidateBeforeCall(String id, Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getWorkflowInstancesList(Async)");
        }
        
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getWorkflowInstancesList(Async)");
        }
        
        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getWorkflowInstancesList(Async)");
        }
        

        okhttp3.Call localVarCall = getWorkflowInstancesListCall(id, page, pageSize, dateFrom, dateTo, _callback);
        return localVarCall;

    }

    /**
     * Returns a list of workflow instances.
     * 
     * @param id  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @return List&lt;WorkflowInstance&gt;
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
    public List<WorkflowInstance> getWorkflowInstancesList(String id, Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo) throws ApiException {
        ApiResponse<List<WorkflowInstance>> localVarResp = getWorkflowInstancesListWithHttpInfo(id, page, pageSize, dateFrom, dateTo);
        return localVarResp.getData();
    }

    /**
     * Returns a list of workflow instances.
     * 
     * @param id  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
     * @return ApiResponse&lt;List&lt;WorkflowInstance&gt;&gt;
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
    public ApiResponse<List<WorkflowInstance>> getWorkflowInstancesListWithHttpInfo(String id, Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo) throws ApiException {
        okhttp3.Call localVarCall = getWorkflowInstancesListValidateBeforeCall(id, page, pageSize, dateFrom, dateTo, null);
        Type localVarReturnType = new TypeToken<List<WorkflowInstance>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a list of workflow instances. (asynchronously)
     * 
     * @param id  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param dateFrom  (optional)
     * @param dateTo  (optional)
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
    public okhttp3.Call getWorkflowInstancesListAsync(String id, Integer page, Integer pageSize, LocalDate dateFrom, LocalDate dateTo, final ApiCallback<List<WorkflowInstance>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWorkflowInstancesListValidateBeforeCall(id, page, pageSize, dateFrom, dateTo, _callback);
        Type localVarReturnType = new TypeToken<List<WorkflowInstance>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
