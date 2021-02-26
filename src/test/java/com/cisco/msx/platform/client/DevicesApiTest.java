/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 3.10.0
 * Contact: somecontact@cisco.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.client;

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.Device;
import com.cisco.msx.platform.model.DeviceCreate;
import com.cisco.msx.platform.model.DeviceTemplateAttachRequest;
import com.cisco.msx.platform.model.DeviceTemplateHistory;
import com.cisco.msx.platform.model.DeviceTemplateUpdateRequest;
import com.cisco.msx.platform.model.DevicesPage;
import com.cisco.msx.platform.model.Error;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevicesApi
 */
@Ignore
public class DevicesApiTest {

    private final DevicesApi api = new DevicesApi();

    
    /**
     * Attaches one or more device templates to a device instance.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void attachDeviceTemplatesTest() throws ApiException {
        String id = null;
        DeviceTemplateAttachRequest deviceTemplateAttachRequest = null;
        List<DeviceTemplateHistory> response = api.attachDeviceTemplates(id, deviceTemplateAttachRequest);

        // TODO: test validations
    }
    
    /**
     * Creates a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceTest() throws ApiException {
        DeviceCreate deviceCreate = null;
        Device response = api.createDevice(deviceCreate);

        // TODO: test validations
    }
    
    /**
     * Deletes a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceTest() throws ApiException {
        String id = null;
        api.deleteDevice(id);

        // TODO: test validations
    }
    
    /**
     * Detaches a template from a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachDeviceTemplateTest() throws ApiException {
        String id = null;
        UUID templateId = null;
        List<DeviceTemplateHistory> response = api.detachDeviceTemplate(id, templateId);

        // TODO: test validations
    }
    
    /**
     * Detach device templates that are already attached to a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void detachDeviceTemplatesTest() throws ApiException {
        String id = null;
        List<DeviceTemplateHistory> response = api.detachDeviceTemplates(id);

        // TODO: test validations
    }
    
    /**
     * Returns a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTest() throws ApiException {
        String id = null;
        Device response = api.getDevice(id);

        // TODO: test validations
    }
    
    /**
     * Returns the running configuration for a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceConfigTest() throws ApiException {
        String id = null;
        String response = api.getDeviceConfig(id);

        // TODO: test validations
    }
    
    /**
     * Returns device template history.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceTemplateHistoryTest() throws ApiException {
        String id = null;
        UUID templateId = null;
        List<DeviceTemplateHistory> response = api.getDeviceTemplateHistory(id, templateId);

        // TODO: test validations
    }
    
    /**
     * Returns a page of devices.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDevicesPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        List<String> deviceIds = null;
        List<String> serviceIds = null;
        List<String> types = null;
        List<String> serialKeys = null;
        List<String> serviceTypes = null;
        List<String> models = null;
        List<String> subtypes = null;
        List<String> names = null;
        List<String> versions = null;
        List<UUID> tenantIds = null;
        List<String> severities = null;
        String sortBy = null;
        String sortOrder = null;
        DevicesPage response = api.getDevicesPage(page, pageSize, deviceIds, serviceIds, types, serialKeys, serviceTypes, models, subtypes, names, versions, tenantIds, severities, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Dedeploys a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redeployDeviceTest() throws ApiException {
        String id = null;
        api.redeployDevice(id);

        // TODO: test validations
    }
    
    /**
     * Update device templates that are already attached to a device.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceTemplatesTest() throws ApiException {
        String id = null;
        DeviceTemplateUpdateRequest deviceTemplateUpdateRequest = null;
        List<DeviceTemplateHistory> response = api.updateDeviceTemplates(id, deviceTemplateUpdateRequest);

        // TODO: test validations
    }
    
}
