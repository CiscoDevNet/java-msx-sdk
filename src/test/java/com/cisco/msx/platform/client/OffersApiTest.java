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
import com.cisco.msx.platform.model.CatalogAssignment;
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.Offer;
import com.cisco.msx.platform.model.OfferCreate;
import com.cisco.msx.platform.model.OfferUpdate;
import com.cisco.msx.platform.model.OffersPage;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OffersApi
 */
@Ignore
public class OffersApiTest {

    private final OffersApi api = new OffersApi();

    
    /**
     * Creates a product offer.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOfferTest() throws ApiException {
        OfferCreate offerCreate = null;
        Offer response = api.createOffer(offerCreate);

        // TODO: test validations
    }
    
    /**
     * Deletes a product offer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOfferTest() throws ApiException {
        UUID id = null;
        api.deleteOffer(id);

        // TODO: test validations
    }
    
    /**
     * Returns a product offer.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOfferTest() throws ApiException {
        UUID id = null;
        Offer response = api.getOffer(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of tenant assignments for a product offer.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOfferAssignmentsListTest() throws ApiException {
        UUID id = null;
        List<CatalogAssignment> response = api.getOfferAssignmentsList(id);

        // TODO: test validations
    }
    
    /**
     * Returns the number of product offers.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOffersCountTest() throws ApiException {
        UUID productId = null;
        UUID tenantId = null;
        Long response = api.getOffersCount(productId, tenantId);

        // TODO: test validations
    }
    
    /**
     * Returns a page of product offers.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOffersPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        UUID productId = null;
        List<UUID> tenantIds = null;
        OffersPage response = api.getOffersPage(page, pageSize, productId, tenantIds);

        // TODO: test validations
    }
    
    /**
     * Updates a product offer.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOfferTest() throws ApiException {
        UUID id = null;
        OfferUpdate offerUpdate = null;
        Offer response = api.updateOffer(id, offerUpdate);

        // TODO: test validations
    }
    
    /**
     * Updates the tenant assignemnts for a product offer.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOfferAssignmentsTest() throws ApiException {
        UUID id = null;
        List<UUID> UUID = null;
        List<CatalogAssignment> response = api.updateOfferAssignments(id, UUID);

        // TODO: test validations
    }
    
}
