/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 1.0.2
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


import com.cisco.msx.platform.model.AccessToken;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecurityApi {
    private ApiClient localVarApiClient;

    public SecurityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SecurityApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getAccessToken
     * @param authorization  (required)
     * @param grantType  (required)
     * @param username  (optional)
     * @param password  (optional)
     * @param accessToken  (optional)
     * @param switchUsername  (optional)
     * @param tenantId  (optional)
     * @param scope  (optional)
     * @param nonce  (optional)
     * @param tenantName  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessTokenCall(String authorization, String grantType, String username, String password, String accessToken, String switchUsername, UUID tenantId, String scope, String nonce, String tenantName, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/idm/v2/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        if (username != null) {
            localVarFormParams.put("username", username);
        }

        if (password != null) {
            localVarFormParams.put("password", password);
        }

        if (accessToken != null) {
            localVarFormParams.put("access_token", accessToken);
        }

        if (switchUsername != null) {
            localVarFormParams.put("switch_username", switchUsername);
        }

        if (tenantId != null) {
            localVarFormParams.put("tenant_id", tenantId);
        }

        if (scope != null) {
            localVarFormParams.put("scope", scope);
        }

        if (nonce != null) {
            localVarFormParams.put("nonce", nonce);
        }

        if (tenantName != null) {
            localVarFormParams.put("tenant_name", tenantName);
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAccessTokenValidateBeforeCall(String authorization, String grantType, String username, String password, String accessToken, String switchUsername, UUID tenantId, String scope, String nonce, String tenantName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getAccessToken(Async)");
        }
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling getAccessToken(Async)");
        }
        

        okhttp3.Call localVarCall = getAccessTokenCall(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName, _callback);
        return localVarCall;

    }

    /**
     * Returns an access token.
     * 
     * @param authorization  (required)
     * @param grantType  (required)
     * @param username  (optional)
     * @param password  (optional)
     * @param accessToken  (optional)
     * @param switchUsername  (optional)
     * @param tenantId  (optional)
     * @param scope  (optional)
     * @param nonce  (optional)
     * @param tenantName  (optional)
     * @return AccessToken
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public AccessToken getAccessToken(String authorization, String grantType, String username, String password, String accessToken, String switchUsername, UUID tenantId, String scope, String nonce, String tenantName) throws ApiException {
        ApiResponse<AccessToken> localVarResp = getAccessTokenWithHttpInfo(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName);
        return localVarResp.getData();
    }

    /**
     * Returns an access token.
     * 
     * @param authorization  (required)
     * @param grantType  (required)
     * @param username  (optional)
     * @param password  (optional)
     * @param accessToken  (optional)
     * @param switchUsername  (optional)
     * @param tenantId  (optional)
     * @param scope  (optional)
     * @param nonce  (optional)
     * @param tenantName  (optional)
     * @return ApiResponse&lt;AccessToken&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AccessToken> getAccessTokenWithHttpInfo(String authorization, String grantType, String username, String password, String accessToken, String switchUsername, UUID tenantId, String scope, String nonce, String tenantName) throws ApiException {
        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName, null);
        Type localVarReturnType = new TypeToken<AccessToken>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns an access token. (asynchronously)
     * 
     * @param authorization  (required)
     * @param grantType  (required)
     * @param username  (optional)
     * @param password  (optional)
     * @param accessToken  (optional)
     * @param switchUsername  (optional)
     * @param tenantId  (optional)
     * @param scope  (optional)
     * @param nonce  (optional)
     * @param tenantName  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Failed </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessTokenAsync(String authorization, String grantType, String username, String password, String accessToken, String switchUsername, UUID tenantId, String scope, String nonce, String tenantName, final ApiCallback<AccessToken> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccessTokenValidateBeforeCall(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName, _callback);
        Type localVarReturnType = new TypeToken<AccessToken>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
