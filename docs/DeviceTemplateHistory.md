

# DeviceTemplateHistory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**deviceId** | **String** |  |  [optional]
**instanceId** | **String** |  |  [optional]
**templateId** | **UUID** |  |  [optional]
**userId** | **UUID** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusError** | **String** |  |  [optional]
**templateParams** | [**List&lt;NameValue&gt;**](NameValue.md) |  |  [optional]
**lastUpdated** | **OffsetDateTime** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
APPLIED | &quot;Applied&quot;
APPLYING | &quot;Applying&quot;
APPLY_FAILED | &quot;Apply Failed&quot;
DETACHED | &quot;Detached&quot;
DETACHING | &quot;Detaching&quot;
DETACH_FAILED | &quot;Detach Failed&quot;



