/*
 * MSX SDK
 * MSX SDK client.
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.client;

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.GenericEvent;
import com.cisco.msx.platform.model.GenericEventCreate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditingGenericEventsApi
 */
@Ignore
public class AuditingGenericEventsApiTest {

    private final AuditingGenericEventsApi api = new AuditingGenericEventsApi();

    
    /**
     * Create Generic Event
     *
     * Needs CREATE_AUDIT_GENERIC_EVENT_PERMISSION to create a Generic Event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGenericEventTest() throws ApiException {
        GenericEventCreate genericEventCreate = null;
        GenericEvent response = api.createGenericEvent(genericEventCreate);

        // TODO: test validations
    }
    
}
