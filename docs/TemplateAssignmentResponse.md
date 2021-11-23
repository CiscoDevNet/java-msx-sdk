

# TemplateAssignmentResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**templateId** | **UUID** |  |  [optional] [readonly]
**templateName** | **String** |  |  [optional] [readonly]
**tenantId** | **UUID** |  |  [optional] [readonly]
**assignedTenantId** | **UUID** |  |  [optional] [readonly]
**inheritable** | **Boolean** |  |  [optional] [readonly]
**status** | **TemplateStatus** |  |  [optional]
**statusDetails** | **String** |  |  [optional] [readonly]
**createdOn** | **OffsetDateTime** |  |  [optional] [readonly]
**createdBy** | **UUID** |  |  [optional] [readonly]
**modifiedOn** | **OffsetDateTime** |  |  [optional] [readonly]
**modifiedBy** | **UUID** |  |  [optional] [readonly]
**responseStatus** | [**ResponseStatusEnum**](#ResponseStatusEnum) |  |  [optional] [readonly]



## Enum: ResponseStatusEnum

Name | Value
---- | -----
NEW | &quot;NEW&quot;
OK | &quot;OK&quot;
CONFLICT | &quot;CONFLICT&quot;
UNASSIGNED | &quot;UNASSIGNED&quot;
ERROR | &quot;ERROR&quot;



