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
import com.cisco.msx.platform.model.WorkflowSchema;
import com.cisco.msx.platform.model.WorkflowSchemaByTypeResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowSchemasApi
 */
@Ignore
public class WorkflowSchemasApiTest {

    private final WorkflowSchemasApi api = new WorkflowSchemasApi();

    
    /**
     * Returns a workflow schema.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowSchemaTest() throws ApiException {
        String id = null;
        String schemaType = null;
        WorkflowSchemaByTypeResponse response = api.getWorkflowSchema(id, schemaType);

        // TODO: test validations
    }
    
    /**
     * Returns a list of workflow schemas.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowSchemasListTest() throws ApiException {
        String baseType = null;
        String schemaType = null;
        Boolean variableType = null;
        List<WorkflowSchema> response = api.getWorkflowSchemasList(baseType, schemaType, variableType);

        // TODO: test validations
    }
    
}
