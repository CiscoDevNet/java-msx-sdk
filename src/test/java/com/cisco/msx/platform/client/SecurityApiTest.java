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

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.AccessToken;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityApi
 */
@Ignore
public class SecurityApiTest {

    private final SecurityApi api = new SecurityApi();

    
    /**
     * Returns an access token.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessTokenTest() throws ApiException {
        String authorization = null;
        String grantType = null;
        String username = null;
        String password = null;
        String accessToken = null;
        String switchUsername = null;
        UUID tenantId = null;
        String scope = null;
        String nonce = null;
        String tenantName = null;
                AccessToken response = api.getAccessToken(authorization, grantType, username, password, accessToken, switchUsername, tenantId, scope, nonce, tenantName);
        // TODO: test validations
    }
    
}
