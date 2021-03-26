/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.client;

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.Tenant;
import com.cisco.msx.platform.model.TenantCreate;
import com.cisco.msx.platform.model.TenantUpdate;
import com.cisco.msx.platform.model.TenantsPage;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TenantsApi
 */
@Ignore
public class TenantsApiTest {

    private final TenantsApi api = new TenantsApi();

    
    /**
     * Creates a new tenant.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTenantTest() throws ApiException {
        TenantCreate tenantCreate = null;
        Tenant response = api.createTenant(tenantCreate);

        // TODO: test validations
    }
    
    /**
     * Deletes a tenant by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTenantTest() throws ApiException {
        UUID id = null;
        api.deleteTenant(id);

        // TODO: test validations
    }
    
    /**
     * Returns a tenant by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantTest() throws ApiException {
        UUID id = null;
        Tenant response = api.getTenant(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of tenants.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantsListTest() throws ApiException {
        List<UUID> ids = null;
        Boolean showImage = null;
        List<Tenant> response = api.getTenantsList(ids, showImage);

        // TODO: test validations
    }
    
    /**
     * Returns a page of tenants.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantsPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        UUID parentId = null;
        Boolean showImage = null;
        String sortBy = null;
        String sortOrder = null;
        TenantsPage response = api.getTenantsPage(page, pageSize, parentId, showImage, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Updates a tenant by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTenantTest() throws ApiException {
        UUID id = null;
        TenantUpdate tenantUpdate = null;
        Tenant response = api.updateTenant(id, tenantUpdate);

        // TODO: test validations
    }
    
}
