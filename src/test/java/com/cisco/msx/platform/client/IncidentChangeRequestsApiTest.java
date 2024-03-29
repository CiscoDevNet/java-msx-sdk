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
import com.cisco.msx.platform.model.ChangeRequest;
import com.cisco.msx.platform.model.ChangeRequestCreate;
import com.cisco.msx.platform.model.ChangeRequestUpdate;
import com.cisco.msx.platform.model.ChangeRequestsPage;
import com.cisco.msx.platform.model.Error;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IncidentChangeRequestsApi
 */
@Ignore
public class IncidentChangeRequestsApiTest {

    private final IncidentChangeRequestsApi api = new IncidentChangeRequestsApi();

    
    /**
     * Create a change request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChangeRequestTest() throws ApiException {
        ChangeRequestCreate changeRequestCreate = null;
                ChangeRequest response = api.createChangeRequest(changeRequestCreate);
        // TODO: test validations
    }
    
    /**
     * Deletes a change request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChangeRequestTest() throws ApiException {
        String id = null;
        UUID tenantId = null;
                api.deleteChangeRequest(id, tenantId);
        // TODO: test validations
    }
    
    /**
     * Returns a change request.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChangeRequestTest() throws ApiException {
        String id = null;
        UUID tenantId = null;
                ChangeRequest response = api.getChangeRequest(id, tenantId);
        // TODO: test validations
    }
    
    /**
     * Returns a filtered list of change requests.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChangeRequestsPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        UUID tenantId = null;
                ChangeRequestsPage response = api.getChangeRequestsPage(page, pageSize, tenantId);
        // TODO: test validations
    }
    
    /**
     * Updates a change request.
     *
     * Update change requests. Returns not found, if passed in tenant&#39;s serviceNow instance does not hold the record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChangeRequestTest() throws ApiException {
        String id = null;
        ChangeRequestUpdate changeRequestUpdate = null;
                ChangeRequest response = api.updateChangeRequest(id, changeRequestUpdate);
        // TODO: test validations
    }
    
}
