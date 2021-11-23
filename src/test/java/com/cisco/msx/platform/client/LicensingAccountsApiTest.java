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

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.SmartAccountType;
import com.cisco.msx.platform.model.SmartUserAccounts;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LicensingAccountsApi
 */
@Ignore
public class LicensingAccountsApiTest {

    private final LicensingAccountsApi api = new LicensingAccountsApi();

    
    /**
     * Returns a filtered page of smart accounts.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserAccountsListTest() throws ApiException {
        String userId = null;
        String domain = null;
        String roleName = null;
        SmartAccountType type = null;
        SmartUserAccounts response = api.getUserAccountsList(userId, domain, roleName, type);

        // TODO: test validations
    }
    
}
