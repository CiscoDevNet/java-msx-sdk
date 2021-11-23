

# IncidentCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, Object&gt;** |  |  [optional]
**category** | **String** | inquiry|software|hardware|network|database |  [optional]
**description** | **String** |  | 
**impact** | [**ImpactEnum**](#ImpactEnum) |  |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) |  |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**subcategory** | **String** |  |  [optional]
**tenant** | **UUID** |  |  [optional]
**urgency** | [**UrgencyEnum**](#UrgencyEnum) |  |  [optional]



## Enum: ImpactEnum

Name | Value
---- | -----
HIGH | &quot;High&quot;
MEDIUM | &quot;Medium&quot;
LOW | &quot;Low&quot;



## Enum: PriorityEnum

Name | Value
---- | -----
CRITICAL | &quot;Critical&quot;
LOW | &quot;Low&quot;
HIGH | &quot;High&quot;
MODERATE | &quot;Moderate&quot;
PLANNING | &quot;Planning&quot;



## Enum: SeverityEnum

Name | Value
---- | -----
HIGH | &quot;High&quot;
MEDIUM | &quot;Medium&quot;
LOW | &quot;Low&quot;



## Enum: StateEnum

Name | Value
---- | -----
NEW | &quot;New&quot;
INPROGRESS | &quot;InProgress&quot;
ONHOLD | &quot;OnHold&quot;
RESOLVED | &quot;Resolved&quot;
CLOSE | &quot;Close&quot;
CANCELED | &quot;Canceled&quot;



## Enum: UrgencyEnum

Name | Value
---- | -----
HIGH | &quot;High&quot;
MEDIUM | &quot;Medium&quot;
LOW | &quot;Low&quot;



