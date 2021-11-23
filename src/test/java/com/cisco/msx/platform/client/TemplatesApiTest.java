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
import com.cisco.msx.platform.model.Template;
import com.cisco.msx.platform.model.TemplateCreate;
import com.cisco.msx.platform.model.TemplatePatch;
import com.cisco.msx.platform.model.TemplatesPage;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Ignore
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    
    /**
     * Deletes a template.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateTest() throws ApiException {
        UUID id = null;
        api.deleteTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Returns a template by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateTest() throws ApiException {
        UUID id = null;
        Template response = api.getTemplate(id);

        // TODO: test validations
    }
    
    /**
     * Returns a template history by id.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateHistoryTest() throws ApiException {
        UUID id = null;
        List<Template> response = api.getTemplateHistory(id);

        // TODO: test validations
    }
    
    /**
     * Returns a page of templates.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatesPageTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        Boolean calculateTotalItems = null;
        String externalId = null;
        String service = null;
        List<String> tags = null;
        TemplatesPage response = api.getTemplatesPage(page, pageSize, calculateTotalItems, externalId, service, tags);

        // TODO: test validations
    }
    
    /**
     * Imports a template.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importTemplateTest() throws ApiException {
        TemplateCreate templateCreate = null;
        Template response = api.importTemplate(templateCreate);

        // TODO: test validations
    }
    
    /**
     * Updates a template status.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTemplateStatusTest() throws ApiException {
        UUID id = null;
        TemplatePatch templatePatch = null;
        Template response = api.updateTemplateStatus(id, templatePatch);

        // TODO: test validations
    }
    
}