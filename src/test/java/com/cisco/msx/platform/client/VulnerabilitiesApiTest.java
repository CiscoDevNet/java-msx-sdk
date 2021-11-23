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
import java.time.OffsetDateTime;
import com.cisco.msx.platform.model.VulnerabilitiesPage;
import com.cisco.msx.platform.model.VulnerabilityFeed;
import com.cisco.msx.platform.model.VulnerabilityIngestPage;
import com.cisco.msx.platform.model.VulnerabilityIngestion;
import com.cisco.msx.platform.model.VulnerabilitySeverity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VulnerabilitiesApi
 */
@Ignore
public class VulnerabilitiesApiTest {

    private final VulnerabilitiesApi api = new VulnerabilitiesApi();

    
    /**
     * Returns a filtered page of ingest tasks.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIngestVulnerabilitiesTasksPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        VulnerabilityIngestPage response = api.getIngestVulnerabilitiesTasksPage(page, pageSize, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * Returns a filtered page of vulnerabilities.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVulnerabilitiesPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String cveId = null;
        String vendor = null;
        String product = null;
        String version = null;
        VulnerabilitySeverity severity = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        Integer year = null;
        String sortBy = null;
        String sortOrder = null;
        VulnerabilitiesPage response = api.getVulnerabilitiesPage(page, pageSize, cveId, vendor, product, version, severity, startDate, endDate, year, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Ingests a CVE JSON feed into the Vulnerability Service datastore.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void ingestVulnerabilitiesTest() throws ApiException {
        VulnerabilityFeed vulnerabilityFeed = null;
        VulnerabilityIngestion response = api.ingestVulnerabilities(vulnerabilityFeed);

        // TODO: test validations
    }
    
}