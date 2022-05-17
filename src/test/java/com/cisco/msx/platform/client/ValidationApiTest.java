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
import java.time.OffsetDateTime;
import com.cisco.msx.platform.model.VulnerabilityValidation;
import com.cisco.msx.platform.model.VulnerabilityValidationPage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidationApi
 */
@Ignore
public class ValidationApiTest {

    private final ValidationApi api = new ValidationApi();

    
    /**
     * Returns a filtered page of validations.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getValidateProductVersionPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
                VulnerabilityValidationPage response = api.getValidateProductVersionPage(page, pageSize, startDate, endDate);
        // TODO: test validations
    }
    
    /**
     * Validate registered product / verison combinations for vulnerabilities.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateProductVersionTest() throws ApiException {
                VulnerabilityValidation response = api.validateProductVersion();
        // TODO: test validations
    }
    
}
