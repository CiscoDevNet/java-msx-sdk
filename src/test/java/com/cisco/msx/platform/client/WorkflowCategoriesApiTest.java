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
import com.cisco.msx.platform.model.Error;
import java.util.UUID;
import com.cisco.msx.platform.model.WorkflowCategory;
import com.cisco.msx.platform.model.WorkflowCategoryCreate;
import com.cisco.msx.platform.model.WorkflowCategoryUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowCategoriesApi
 */
@Ignore
public class WorkflowCategoriesApiTest {

    private final WorkflowCategoriesApi api = new WorkflowCategoriesApi();

    
    /**
     * Creates a new workflow category.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWorkflowCategoryTest() throws ApiException {
        UUID tenantId = null;
        WorkflowCategoryCreate workflowCategoryCreate = null;
        WorkflowCategory response = api.createWorkflowCategory(tenantId, workflowCategoryCreate);

        // TODO: test validations
    }
    
    /**
     * Deletes a workflow category.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkflowCategoryTest() throws ApiException {
        String id = null;
        api.deleteWorkflowCategory(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of workflow categories.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowCategoriesListTest() throws ApiException {
        UUID tenantId = null;
        List<WorkflowCategory> response = api.getWorkflowCategoriesList(tenantId);

        // TODO: test validations
    }
    
    /**
     * Returns a workflow category.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowCategoryTest() throws ApiException {
        String id = null;
        WorkflowCategory response = api.getWorkflowCategory(id);

        // TODO: test validations
    }
    
    /**
     * Updates a workflow category.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkflowCategoryTest() throws ApiException {
        String id = null;
        WorkflowCategoryUpdate workflowCategoryUpdate = null;
        WorkflowCategory response = api.updateWorkflowCategory(id, workflowCategoryUpdate);

        // TODO: test validations
    }
    
}
