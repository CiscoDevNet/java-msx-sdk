/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.client;

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.Role;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
@Ignore
public class RolesApiTest {

    private final RolesApi api = new RolesApi();

    
    /**
     * Returns a role by name.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoleByNameTest() throws ApiException {
        String name = null;
        Role response = api.getRoleByName(name);

        // TODO: test validations
    }
    
    /**
     * Returns a list of roles.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolesListTest() throws ApiException {
        List<UUID> ids = null;
        List<Role> response = api.getRolesList(ids);

        // TODO: test validations
    }
    
}
