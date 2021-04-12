/*
 * KAKAPO - MSX SDK
 * MSX Platform SDK
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.msx.platform.client;

import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.model.Error;
import com.cisco.msx.platform.model.WorkflowEvent;
import com.cisco.msx.platform.model.WorkflowEventCreate;
import com.cisco.msx.platform.model.WorkflowEventUpdate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowEventsApi
 */
@Ignore
public class WorkflowEventsApiTest {

    private final WorkflowEventsApi api = new WorkflowEventsApi();

    
    /**
     * Creates a new workflow event.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createWorkflowEventTest() throws ApiException {
        WorkflowEventCreate workflowEventCreate = null;
        WorkflowEvent response = api.createWorkflowEvent(workflowEventCreate);

        // TODO: test validations
    }
    
    /**
     * Deletes a workflow event.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteWorkflowEventTest() throws ApiException {
        String id = null;
        api.deleteWorkflowEvent(id);

        // TODO: test validations
    }
    
    /**
     * Returns a workflow event.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowEventTest() throws ApiException {
        String id = null;
        WorkflowEvent response = api.getWorkflowEvent(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of workflow events.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowEventsListTest() throws ApiException {
        List<WorkflowEvent> response = api.getWorkflowEventsList();

        // TODO: test validations
    }
    
    /**
     * Updates a workflow event.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateWorkflowEventTest() throws ApiException {
        String id = null;
        WorkflowEventUpdate workflowEventUpdate = null;
        WorkflowEvent response = api.updateWorkflowEvent(id, workflowEventUpdate);

        // TODO: test validations
    }
    
}
