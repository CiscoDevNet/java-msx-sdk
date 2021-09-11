

# GenericEvent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** |  |  [optional]
**time** | **OffsetDateTime** |  |  [optional]
**severity** | **GenericEventSeverity** |  |  [optional]
**subtype** | **String** |  |  [optional]
**service** | **String** | Service that generated the event |  [optional]
**keywords** | **String** | Space separated list of keywords to be used for search |  [optional]
**details** | **Map&lt;String, String&gt;** |  |  [optional]
**trace** | [**GenericEventTrace**](GenericEventTrace.md) |  |  [optional]
**security** | [**GenericEventSecurity**](GenericEventSecurity.md) |  |  [optional]
**description** | **String** |  |  [optional]



