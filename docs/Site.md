

# Site


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional] [readonly]
**tenantId** | **UUID** |  |  [optional]
**parentId** | **UUID** |  |  [optional]
**name** | **String** |  |  [optional]
**type** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**address** | [**SiteAddress**](SiteAddress.md) |  |  [optional]
**contact** | [**SiteContact**](SiteContact.md) |  |  [optional]
**image** | **String** |  |  [optional]
**managingControlPlaneId** | **String** |  |  [optional]
**attributes** | **Map&lt;String, String&gt;** |  |  [optional]
**devices** | [**List&lt;DeviceSummary&gt;**](DeviceSummary.md) |  |  [optional]
**serviceIds** | **List&lt;String&gt;** |  |  [optional]
**location** | [**SiteLocation**](SiteLocation.md) |  |  [optional]
**status** | [**SiteStatus**](SiteStatus.md) |  |  [optional]
**createdOn** | **OffsetDateTime** |  |  [optional] [readonly]
**createdBy** | **String** |  |  [optional] [readonly]
**modifiedOn** | **OffsetDateTime** |  |  [optional] [readonly]
**modifiedBy** | **String** |  |  [optional] [readonly]



