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
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.Site;
import com.cisco.msx.platform.model.SiteCreate;
import com.cisco.msx.platform.model.SiteUpdate;
import com.cisco.msx.platform.model.SitesPage;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SitesApi
 */
@Ignore
public class SitesApiTest {

    private final SitesApi api = new SitesApi();

    
    /**
     * Add devices to a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDevicesToSiteTest() throws ApiException {
        UUID id = null;
        List<String> requestBody = null;
                Site response = api.addDevicesToSite(id, requestBody);
        // TODO: test validations
    }
    
    /**
     * Add services to a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addServicesToSiteTest() throws ApiException {
        UUID id = null;
        List<String> requestBody = null;
                Site response = api.addServicesToSite(id, requestBody);
        // TODO: test validations
    }
    
    /**
     * Creates a new site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSiteTest() throws ApiException {
        SiteCreate siteCreate = null;
                Site response = api.createSite(siteCreate);
        // TODO: test validations
    }
    
    /**
     * Deletes a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSiteTest() throws ApiException {
        UUID id = null;
                api.deleteSite(id);
        // TODO: test validations
    }
    
    /**
     * Returns a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteTest() throws ApiException {
        UUID id = null;
        Boolean showImage = null;
                Site response = api.getSite(id, showImage);
        // TODO: test validations
    }
    
    /**
     * Returns a page of Sites. Only one filter is supported at a time.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSitesPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        UUID tenantId = null;
        Boolean includeSubtenants = null;
        String serviceId = null;
        String serviceType = null;
        String deviceId = null;
        String parentId = null;
        String type = null;
        String managingControlPlaneId = null;
        Boolean showImage = null;
                SitesPage response = api.getSitesPage(page, pageSize, tenantId, includeSubtenants, serviceId, serviceType, deviceId, parentId, type, managingControlPlaneId, showImage);
        // TODO: test validations
    }
    
    /**
     * Removes devices from a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDevicesFromSiteTest() throws ApiException {
        UUID id = null;
        List<String> requestBody = null;
                Site response = api.removeDevicesFromSite(id, requestBody);
        // TODO: test validations
    }
    
    /**
     * Remove services from a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeServicesFromSiteTest() throws ApiException {
        String id = null;
        List<String> requestBody = null;
                Site response = api.removeServicesFromSite(id, requestBody);
        // TODO: test validations
    }
    
    /**
     * Updates a site.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSiteTest() throws ApiException {
        UUID id = null;
        SiteUpdate siteUpdate = null;
        Boolean sendNotification = null;
                Site response = api.updateSite(id, siteUpdate, sendNotification);
        // TODO: test validations
    }
    
}
