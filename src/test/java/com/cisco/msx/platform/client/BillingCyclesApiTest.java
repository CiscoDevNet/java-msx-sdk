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
import com.cisco.msx.platform.model.BillingCycle;
import com.cisco.msx.platform.model.BillingCycleCreate;
import com.cisco.msx.platform.model.BillingCycleProcess;
import com.cisco.msx.platform.model.BillingCycleProcessAccepted;
import com.cisco.msx.platform.model.BillingCycleUpdate;
import com.cisco.msx.platform.model.BillingCyclesPage;
import com.cisco.msx.platform.model.Error;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BillingCyclesApi
 */
@Ignore
public class BillingCyclesApiTest {

    private final BillingCyclesApi api = new BillingCyclesApi();

    
    /**
     * Add a billing cycle.
     *
     * Needs MANAGE_BILLINGCYCLE permission to allow for the creation a billing cycle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addBillingCycleTest() throws ApiException {
        BillingCycleCreate billingCycleCreate = null;
        BillingCycle response = api.addBillingCycle(billingCycleCreate);

        // TODO: test validations
    }
    
    /**
     * Delete a billing cycle.
     *
     * Needs MANAGE_BILLINGCYCLE permission to delete a billing cycle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBillingCycleTest() throws ApiException {
        UUID id = null;
        api.deleteBillingCycle(id);

        // TODO: test validations
    }
    
    /**
     * Get a billing cycle.
     *
     * Needs VIEW_BILLINGCYCLE permission to get billing cycle detail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBillingCycleTest() throws ApiException {
        UUID id = null;
        BillingCycle response = api.getBillingCycle(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve a page of billing cycles.
     *
     * Needs VIEW_BILLINGCYCLE permission to view the billing cycle details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBillingCyclesPageTest() throws ApiException {
        UUID tenantId = null;
        Integer page = null;
        Integer pageSize = null;
        OffsetDateTime nextBilledOn = null;
        BillingCyclesPage response = api.getBillingCyclesPage(tenantId, page, pageSize, nextBilledOn);

        // TODO: test validations
    }
    
    /**
     * Process a billing cycle.
     *
     * Needs MANAGE_BILLINGCYCLE permission to allow for the creation a billing cycle.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processBillingCycleTest() throws ApiException {
        BillingCycleProcess billingCycleProcess = null;
        BillingCycleProcessAccepted response = api.processBillingCycle(billingCycleProcess);

        // TODO: test validations
    }
    
    /**
     * Update billing cycle for an event type and tenant.
     *
     * Needs MANAGE_BILLINGCYCLE permission to update a billing cycle detail.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBillingCycleTest() throws ApiException {
        UUID id = null;
        BillingCycleUpdate billingCycleUpdate = null;
        BillingCycle response = api.updateBillingCycle(id, billingCycleUpdate);

        // TODO: test validations
    }
    
}
