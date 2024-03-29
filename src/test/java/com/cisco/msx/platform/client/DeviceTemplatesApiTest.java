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
import com.cisco.msx.platform.model.DeviceTemplate;
import com.cisco.msx.platform.model.DeviceTemplateAccess;
import com.cisco.msx.platform.model.DeviceTemplateAccessResponse;
import com.cisco.msx.platform.model.DeviceTemplateCreate;
import com.cisco.msx.platform.model.DeviceTemplateVersionCreate;
import com.cisco.msx.platform.model.Error;
import java.io.File;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceTemplatesApi
 */
@Ignore
public class DeviceTemplatesApiTest {

    private final DeviceTemplatesApi api = new DeviceTemplatesApi();

    
    /**
     * Creates a device template.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceTemplateTest() throws ApiException {
        DeviceTemplateCreate deviceTemplateCreate = null;
                DeviceTemplate response = api.createDeviceTemplate(deviceTemplateCreate);
        // TODO: test validations
    }
    
    /**
     * Creates a new version of an existing device template.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceTemplateVersionTest() throws ApiException {
        DeviceTemplateVersionCreate deviceTemplateVersionCreate = null;
                DeviceTemplate response = api.createDeviceTemplateVersion(deviceTemplateVersionCreate);
        // TODO: test validations
    }
    
    /**
     * Deletes a device template.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceTemplateTest() throws ApiException {
        UUID id = null;
                api.deleteDeviceTemplate(id);
        // TODO: test validations
    }
    
    /**
     * Returns a device template.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTemplateTest() throws ApiException {
        UUID id = null;
                DeviceTemplate response = api.getDeviceTemplate(id);
        // TODO: test validations
    }
    
    /**
     * Returns a list of device templates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTemplatesListTest() throws ApiException {
        Boolean allVersions = null;
        String serviceType = null;
        UUID tenantId = null;
                List<DeviceTemplate> response = api.getDeviceTemplatesList(allVersions, serviceType, tenantId);
        // TODO: test validations
    }
    
    /**
     * API to scan parameters from the device template XML.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scanDeviceTemplateParametersTest() throws ApiException {
        File _file = null;
                List<String> response = api.scanDeviceTemplateParameters(_file);
        // TODO: test validations
    }
    
    /**
     * Updates device template access.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceTemplateAccessTest() throws ApiException {
        UUID id = null;
        DeviceTemplateAccess deviceTemplateAccess = null;
                DeviceTemplateAccessResponse response = api.updateDeviceTemplateAccess(id, deviceTemplateAccess);
        // TODO: test validations
    }
    
}
