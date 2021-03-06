# java-msx-sdk

KAKAPO - MSX SDK
- API version: 1.0.2
  - Build date: 2021-04-12T15:11:34.208390-04:00[America/New_York]

MSX Platform SDK


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cisco.msx.platform</groupId>
  <artifactId>java-msx-sdk</artifactId>
  <version>1.0.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cisco.msx.platform:java-msx-sdk:1.0.2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/java-msx-sdk-1.0.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.cisco.msx.platform.ApiClient;
import com.cisco.msx.platform.ApiException;
import com.cisco.msx.platform.Configuration;
import com.cisco.msx.platform.models.*;
import com.cisco.msx.platform.client.DeviceTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8765");

    DeviceTemplatesApi apiInstance = new DeviceTemplatesApi(defaultClient);
    DeviceTemplateCreate deviceTemplateCreate = new DeviceTemplateCreate(); // DeviceTemplateCreate | 
    try {
      DeviceTemplate result = apiInstance.createDeviceTemplate(deviceTemplateCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceTemplatesApi#createDeviceTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8765*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DeviceTemplatesApi* | [**createDeviceTemplate**](docs/DeviceTemplatesApi.md#createDeviceTemplate) | **POST** /manage/api/v8/devicetemplates | Creates a device template.
*DeviceTemplatesApi* | [**deleteDeviceTemplate**](docs/DeviceTemplatesApi.md#deleteDeviceTemplate) | **DELETE** /manage/api/v8/devicetemplates/{id} | Deletes a device template.
*DeviceTemplatesApi* | [**getDeviceTemplate**](docs/DeviceTemplatesApi.md#getDeviceTemplate) | **GET** /manage/api/v8/devicetemplates/{id} | Returns a device template.
*DeviceTemplatesApi* | [**getDeviceTemplatesList**](docs/DeviceTemplatesApi.md#getDeviceTemplatesList) | **GET** /manage/api/v8/devicetemplates/list | Returns a list of device templates.
*DeviceTemplatesApi* | [**scanDeviceTemplateParameters**](docs/DeviceTemplatesApi.md#scanDeviceTemplateParameters) | **POST** /manage/api/v8/devicetemplates/parameters/scan | API to scan parameters from the device template XML.
*DeviceTemplatesApi* | [**updateDeviceTemplateAccess**](docs/DeviceTemplatesApi.md#updateDeviceTemplateAccess) | **PUT** /manage/api/v8/devicetemplates/{id}/access | Updates device template access.
*DevicesApi* | [**attachDeviceTemplates**](docs/DevicesApi.md#attachDeviceTemplates) | **POST** /manage/api/v8/devices/{id}/templates | Attaches one or more device templates to a device instance.
*DevicesApi* | [**createDevice**](docs/DevicesApi.md#createDevice) | **POST** /manage/api/v8/devices | Creates a device.
*DevicesApi* | [**deleteDevice**](docs/DevicesApi.md#deleteDevice) | **DELETE** /manage/api/v8/devices/{id} | Deletes a device.
*DevicesApi* | [**detachDeviceTemplate**](docs/DevicesApi.md#detachDeviceTemplate) | **DELETE** /manage/api/v8/devices/{id}/templates/{templateId} | Detaches a template from a device.
*DevicesApi* | [**detachDeviceTemplates**](docs/DevicesApi.md#detachDeviceTemplates) | **DELETE** /manage/api/v8/devices/{id}/templates | Detach device templates that are already attached to a device.
*DevicesApi* | [**getDevice**](docs/DevicesApi.md#getDevice) | **GET** /manage/api/v8/devices/{id} | Returns a device.
*DevicesApi* | [**getDeviceConfig**](docs/DevicesApi.md#getDeviceConfig) | **GET** /manage/api/v8/devices/{id}/config | Returns the running configuration for a device.
*DevicesApi* | [**getDeviceTemplateHistory**](docs/DevicesApi.md#getDeviceTemplateHistory) | **GET** /manage/api/v8/devices/{id}/templates | Returns device template history.
*DevicesApi* | [**getDevicesPage**](docs/DevicesApi.md#getDevicesPage) | **GET** /manage/api/v8/devices | Returns a page of devices.
*DevicesApi* | [**redeployDevice**](docs/DevicesApi.md#redeployDevice) | **POST** /manage/api/v8/devices/{id}/redeploy | Dedeploys a device.
*DevicesApi* | [**updateDeviceTemplates**](docs/DevicesApi.md#updateDeviceTemplates) | **PUT** /manage/api/v8/devices/{id}/templates | Update device templates that are already attached to a device.
*HealthApi* | [**getDevicesHealthList**](docs/HealthApi.md#getDevicesHealthList) | **GET** /monitor/api/v8/health/devices/list | 
*HealthApi* | [**getServicesHealthList**](docs/HealthApi.md#getServicesHealthList) | **GET** /monitor/api/v8/health/services/list | 
*OffersApi* | [**createOffer**](docs/OffersApi.md#createOffer) | **POST** /consume/api/v8/offers | Creates a product offer.
*OffersApi* | [**deleteOffer**](docs/OffersApi.md#deleteOffer) | **DELETE** /consume/api/v8/offers/{id} | Deletes a product offer
*OffersApi* | [**getOffer**](docs/OffersApi.md#getOffer) | **GET** /consume/api/v8/offers/{id} | Returns a product offer.
*OffersApi* | [**getOfferAssignmentsList**](docs/OffersApi.md#getOfferAssignmentsList) | **GET** /consume/api/v8/offers/{id}/assignments/list | Returns a list of tenant assignments for a product offer.
*OffersApi* | [**getOffersCount**](docs/OffersApi.md#getOffersCount) | **GET** /consume/api/v8/offers/count | Returns the number of product offers.
*OffersApi* | [**getOffersPage**](docs/OffersApi.md#getOffersPage) | **GET** /consume/api/v8/offers | Returns a page of product offers.
*OffersApi* | [**updateOffer**](docs/OffersApi.md#updateOffer) | **PUT** /consume/api/v8/offers/{id} | Updates a product offer.
*OffersApi* | [**updateOfferAssignments**](docs/OffersApi.md#updateOfferAssignments) | **PUT** /consume/api/v8/offers/{id}/assignments | Updates the tenant assignemnts for a product offer.
*ProductsApi* | [**createProduct**](docs/ProductsApi.md#createProduct) | **POST** /consume/api/v8/products | Creates a product.
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /consume/api/v8/products/{id} | Deletes a product.
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /consume/api/v8/products/{id} | Returns a product.
*ProductsApi* | [**getProductAssignmentsList**](docs/ProductsApi.md#getProductAssignmentsList) | **GET** /consume/api/v8/products/{id}/assignments/list | Returns a list of tenant assignments for a product .
*ProductsApi* | [**getProductsCount**](docs/ProductsApi.md#getProductsCount) | **GET** /consume/api/v8/products/count | Returns the number of products.
*ProductsApi* | [**getProductsPage**](docs/ProductsApi.md#getProductsPage) | **GET** /consume/api/v8/products | Returns a page of products.
*ProductsApi* | [**updateProduct**](docs/ProductsApi.md#updateProduct) | **PUT** /consume/api/v8/products/{id} | Updates a product.
*ProductsApi* | [**updateProductAssignments**](docs/ProductsApi.md#updateProductAssignments) | **PUT** /consume/api/v8/products/{id}/assignments | Updates the tenant assignments for a product.
*RolesApi* | [**getRoleByName**](docs/RolesApi.md#getRoleByName) | **GET** /idm/api/v8/roles/name/{name} | Returns a role by name.
*RolesApi* | [**getRolesList**](docs/RolesApi.md#getRolesList) | **GET** /idm/api/v8/roles/list | Returns a list of roles.
*SecurityApi* | [**getAccessToken**](docs/SecurityApi.md#getAccessToken) | **POST** /idm/v2/token | Returns an access token.
*ServicesApi* | [**deleteService**](docs/ServicesApi.md#deleteService) | **DELETE** /manage/api/v8/services/{id} | Deletes a service.
*ServicesApi* | [**getService**](docs/ServicesApi.md#getService) | **GET** /manage/api/v8/services/{id} | Returns a service.
*ServicesApi* | [**getServicesPage**](docs/ServicesApi.md#getServicesPage) | **GET** /manage/api/v8/services | Returns a page of services.
*ServicesApi* | [**submitOrder**](docs/ServicesApi.md#submitOrder) | **POST** /manage/api/v8/services | Submits an order.
*ServicesApi* | [**updateOrder**](docs/ServicesApi.md#updateOrder) | **PUT** /manage/api/v8/services | Updates an order.
*SitesApi* | [**addDevicesToSite**](docs/SitesApi.md#addDevicesToSite) | **POST** /manage/api/v8/sites/{id}/devices/add | Add devices to a site.
*SitesApi* | [**addServicesToSite**](docs/SitesApi.md#addServicesToSite) | **POST** /manage/api/v8/sites/{id}/services/add | Add services to a site.
*SitesApi* | [**createSite**](docs/SitesApi.md#createSite) | **POST** /manage/api/v8/sites | Creates a new site.
*SitesApi* | [**deleteSite**](docs/SitesApi.md#deleteSite) | **DELETE** /manage/api/v8/sites/{id} | Deletes a site.
*SitesApi* | [**getSite**](docs/SitesApi.md#getSite) | **GET** /manage/api/v8/sites/{id} | Returns a site.
*SitesApi* | [**getSitesPage**](docs/SitesApi.md#getSitesPage) | **GET** /manage/api/v8/sites | Returns a page of Sites. Only one filter is supported at a time.
*SitesApi* | [**removeDevicesFromSite**](docs/SitesApi.md#removeDevicesFromSite) | **POST** /manage/api/v8/sites/{id}/devices/remove | Removes devices from a site.
*SitesApi* | [**removeServicesFromSite**](docs/SitesApi.md#removeServicesFromSite) | **POST** /manage/api/v8/sites/{id}/services/remove | Remove services from a site.
*SitesApi* | [**updateSite**](docs/SitesApi.md#updateSite) | **PUT** /manage/api/v8/sites/{id} | Updates a site.
*TenantsApi* | [**createTenant**](docs/TenantsApi.md#createTenant) | **POST** /idm/api/v8/tenants | Creates a new tenant.
*TenantsApi* | [**deleteTenant**](docs/TenantsApi.md#deleteTenant) | **DELETE** /idm/api/v8/tenants/{id} | Deletes a tenant by id.
*TenantsApi* | [**getTenant**](docs/TenantsApi.md#getTenant) | **GET** /idm/api/v8/tenants/{id} | Returns a tenant by id.
*TenantsApi* | [**getTenantsList**](docs/TenantsApi.md#getTenantsList) | **GET** /idm/api/v8/tenants/list | Returns a list of tenants.
*TenantsApi* | [**getTenantsPage**](docs/TenantsApi.md#getTenantsPage) | **GET** /idm/api/v8/tenants | Returns a page of tenants.
*TenantsApi* | [**updateTenant**](docs/TenantsApi.md#updateTenant) | **PUT** /idm/api/v8/tenants/{id} | Updates a tenant by id.
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /idm/api/v8/users | Creates a new user.
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /idm/api/v8/users/{id} | Deletes a user by id.
*UsersApi* | [**getCurrentUser**](docs/UsersApi.md#getCurrentUser) | **GET** /idm/api/v8/users/current | Returns the current user.
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /idm/api/v8/users/{id} | Returns an existing user.
*UsersApi* | [**getUsersPage**](docs/UsersApi.md#getUsersPage) | **GET** /idm/api/v8/users | Returns a page of users.
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /idm/api/v8/users/{id} | Updates an existing user.
*UsersApi* | [**updateUserPassword**](docs/UsersApi.md#updateUserPassword) | **PUT** /idm/api/v8/users/updatepassword | Update a user password.
*WorkflowCategoriesApi* | [**createWorkflowCategory**](docs/WorkflowCategoriesApi.md#createWorkflowCategory) | **POST** /workflow/api/v8/categories | Creates a new workflow category.
*WorkflowCategoriesApi* | [**deleteWorkflowCategory**](docs/WorkflowCategoriesApi.md#deleteWorkflowCategory) | **DELETE** /workflow/api/v8/categories/{id} | Deletes a workflow category.
*WorkflowCategoriesApi* | [**getWorkflowCategoriesList**](docs/WorkflowCategoriesApi.md#getWorkflowCategoriesList) | **GET** /workflow/api/v8/categories/list | Returns a list of workflow categories.
*WorkflowCategoriesApi* | [**getWorkflowCategory**](docs/WorkflowCategoriesApi.md#getWorkflowCategory) | **GET** /workflow/api/v8/categories/{id} | Returns a workflow category.
*WorkflowCategoriesApi* | [**updateWorkflowCategory**](docs/WorkflowCategoriesApi.md#updateWorkflowCategory) | **PUT** /workflow/api/v8/categories/{id} | Updates a workflow category.
*WorkflowEventsApi* | [**createWorkflowEvent**](docs/WorkflowEventsApi.md#createWorkflowEvent) | **POST** /workflow/api/v8/events | Creates a new workflow event.
*WorkflowEventsApi* | [**deleteWorkflowEvent**](docs/WorkflowEventsApi.md#deleteWorkflowEvent) | **DELETE** /workflow/api/v8/events/{id} | Deletes a workflow event.
*WorkflowEventsApi* | [**getWorkflowEvent**](docs/WorkflowEventsApi.md#getWorkflowEvent) | **GET** /workflow/api/v8/events/{id} | Returns a workflow event.
*WorkflowEventsApi* | [**getWorkflowEventsList**](docs/WorkflowEventsApi.md#getWorkflowEventsList) | **GET** /workflow/api/v8/events/list | Returns a list of workflow events.
*WorkflowEventsApi* | [**updateWorkflowEvent**](docs/WorkflowEventsApi.md#updateWorkflowEvent) | **PUT** /workflow/api/v8/events/{id} | Updates a workflow event.
*WorkflowInstancesApi* | [**cancelWorkflowInstance**](docs/WorkflowInstancesApi.md#cancelWorkflowInstance) | **POST** /workflow/api/v8/workflows/instances/{id}/cancel | Cancels a workflow instance.
*WorkflowInstancesApi* | [**deleteWorkflowInstance**](docs/WorkflowInstancesApi.md#deleteWorkflowInstance) | **DELETE** /workflow/api/v8/workflows/instances/{id} | Deletes a workflow instance.
*WorkflowInstancesApi* | [**getWorkflowInstance**](docs/WorkflowInstancesApi.md#getWorkflowInstance) | **GET** /workflow/api/v8/workflows/instances/{id} | Returns a workflow instance.
*WorkflowInstancesApi* | [**getWorkflowInstanceAction**](docs/WorkflowInstancesApi.md#getWorkflowInstanceAction) | **GET** /workflow/api/v8/workflows/instances/{id}/actions/{actionId} | Returns a workflow instance action.
*WorkflowInstancesApi* | [**getWorkflowInstancesList**](docs/WorkflowInstancesApi.md#getWorkflowInstancesList) | **GET** /workflow/api/v8/workflows/{id}/instances/list | Returns a list of workflow instances.
*WorkflowSchemasApi* | [**getWorkflowSchema**](docs/WorkflowSchemasApi.md#getWorkflowSchema) | **GET** /workflow/api/v8/schemas/{id} | Returns a workflow schema.
*WorkflowSchemasApi* | [**getWorkflowSchemasList**](docs/WorkflowSchemasApi.md#getWorkflowSchemasList) | **GET** /workflow/api/v8/schemas/list | Returns a list of workflow schemas.
*WorkflowTargetsApi* | [**createWorkflowTarget**](docs/WorkflowTargetsApi.md#createWorkflowTarget) | **POST** /workflow/api/v8/targets | Creates a new workflow target.
*WorkflowTargetsApi* | [**deleteWorkflowTarget**](docs/WorkflowTargetsApi.md#deleteWorkflowTarget) | **DELETE** /workflow/api/v8/targets/{id} | Deletes a workflow target.
*WorkflowTargetsApi* | [**getWorkflowTarget**](docs/WorkflowTargetsApi.md#getWorkflowTarget) | **GET** /workflow/api/v8/targets/{id} | Returns a workflow target.
*WorkflowTargetsApi* | [**getWorkflowTargetsList**](docs/WorkflowTargetsApi.md#getWorkflowTargetsList) | **GET** /workflow/api/v8/targets/list | Returns a list of workflow targets.
*WorkflowTargetsApi* | [**updateWorkflowTarget**](docs/WorkflowTargetsApi.md#updateWorkflowTarget) | **PUT** /workflow/api/v8/targets/{id} | Updates a workflow target.
*WorkflowsApi* | [**deleteWorkflow**](docs/WorkflowsApi.md#deleteWorkflow) | **DELETE** /workflow/api/v8/workflows/{id} | Delete a workflow.
*WorkflowsApi* | [**exportWorkflow**](docs/WorkflowsApi.md#exportWorkflow) | **GET** /workflow/api/v8/workflows/{id}/export | Exports a workflow.
*WorkflowsApi* | [**getWorkflow**](docs/WorkflowsApi.md#getWorkflow) | **GET** /workflow/api/v8/workflows/{id} | Returns a workflow.
*WorkflowsApi* | [**getWorkflowStartConfig**](docs/WorkflowsApi.md#getWorkflowStartConfig) | **GET** /workflow/api/v8/workflows/{id}/startconfig | Returns a workflow start config.
*WorkflowsApi* | [**getWorkflowsList**](docs/WorkflowsApi.md#getWorkflowsList) | **GET** /workflow/api/v8/workflows/list | Returns a list of workflows.
*WorkflowsApi* | [**importWorkflow**](docs/WorkflowsApi.md#importWorkflow) | **POST** /workflow/api/v8/workflows | Imports a workflow.
*WorkflowsApi* | [**startWorkflow**](docs/WorkflowsApi.md#startWorkflow) | **POST** /workflow/api/v8/workflows/{id}/start | Starts a workflow.
*WorkflowsApi* | [**updateWorkflow**](docs/WorkflowsApi.md#updateWorkflow) | **PUT** /workflow/api/v8/workflows/{id} | Updates a workflow.
*WorkflowsApi* | [**validateWorkflow**](docs/WorkflowsApi.md#validateWorkflow) | **POST** /workflow/api/v8/workflows/{id}/validate | Validates a workflow.


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [CatalogAssignment](docs/CatalogAssignment.md)
 - [Device](docs/Device.md)
 - [DeviceAllOf](docs/DeviceAllOf.md)
 - [DeviceBilling](docs/DeviceBilling.md)
 - [DeviceCreate](docs/DeviceCreate.md)
 - [DeviceCreateAllOf](docs/DeviceCreateAllOf.md)
 - [DeviceSummary](docs/DeviceSummary.md)
 - [DeviceTemplate](docs/DeviceTemplate.md)
 - [DeviceTemplateAccess](docs/DeviceTemplateAccess.md)
 - [DeviceTemplateAccessResponse](docs/DeviceTemplateAccessResponse.md)
 - [DeviceTemplateAttachRequest](docs/DeviceTemplateAttachRequest.md)
 - [DeviceTemplateCreate](docs/DeviceTemplateCreate.md)
 - [DeviceTemplateDetails](docs/DeviceTemplateDetails.md)
 - [DeviceTemplateHistory](docs/DeviceTemplateHistory.md)
 - [DeviceTemplateUpdateDetails](docs/DeviceTemplateUpdateDetails.md)
 - [DeviceTemplateUpdateRequest](docs/DeviceTemplateUpdateRequest.md)
 - [DeviceUpdate](docs/DeviceUpdate.md)
 - [DevicesPage](docs/DevicesPage.md)
 - [DevicesPageAllOf](docs/DevicesPageAllOf.md)
 - [Error](docs/Error.md)
 - [LegacyAbsoluteConfig](docs/LegacyAbsoluteConfig.md)
 - [LegacyAddress](docs/LegacyAddress.md)
 - [LegacyNsoResponseTypes](docs/LegacyNsoResponseTypes.md)
 - [LegacyRelativeConfig](docs/LegacyRelativeConfig.md)
 - [LegacyScheduleConfig](docs/LegacyScheduleConfig.md)
 - [LegacyServiceOrder](docs/LegacyServiceOrder.md)
 - [LegacyServiceOrderDetail](docs/LegacyServiceOrderDetail.md)
 - [LegacyServiceOrderResponse](docs/LegacyServiceOrderResponse.md)
 - [LegacySite](docs/LegacySite.md)
 - [LegacySiteDevice](docs/LegacySiteDevice.md)
 - [LegacySiteDeviceOnboard](docs/LegacySiteDeviceOnboard.md)
 - [LegacySubscriptionDetail](docs/LegacySubscriptionDetail.md)
 - [NSOConfigDataXPath](docs/NSOConfigDataXPath.md)
 - [NameValue](docs/NameValue.md)
 - [Offer](docs/Offer.md)
 - [OfferAllOf](docs/OfferAllOf.md)
 - [OfferCreate](docs/OfferCreate.md)
 - [OfferUpdate](docs/OfferUpdate.md)
 - [OffersPage](docs/OffersPage.md)
 - [OffersPageAllOf](docs/OffersPageAllOf.md)
 - [PageHeader](docs/PageHeader.md)
 - [Product](docs/Product.md)
 - [ProductAllOf](docs/ProductAllOf.md)
 - [ProductCreate](docs/ProductCreate.md)
 - [ProductUpdate](docs/ProductUpdate.md)
 - [ProductsPage](docs/ProductsPage.md)
 - [ProductsPageAllOf](docs/ProductsPageAllOf.md)
 - [ResourceHealth](docs/ResourceHealth.md)
 - [ResourceStatus](docs/ResourceStatus.md)
 - [ResourceType](docs/ResourceType.md)
 - [Role](docs/Role.md)
 - [Service](docs/Service.md)
 - [ServiceElement](docs/ServiceElement.md)
 - [ServiceElementPrice](docs/ServiceElementPrice.md)
 - [ServiceUIConfig](docs/ServiceUIConfig.md)
 - [ServiceUILink](docs/ServiceUILink.md)
 - [ServicesPage](docs/ServicesPage.md)
 - [ServicesPageAllOf](docs/ServicesPageAllOf.md)
 - [Site](docs/Site.md)
 - [SiteAddress](docs/SiteAddress.md)
 - [SiteContact](docs/SiteContact.md)
 - [SiteCreate](docs/SiteCreate.md)
 - [SiteCreateAllOf](docs/SiteCreateAllOf.md)
 - [SiteLocation](docs/SiteLocation.md)
 - [SiteStatus](docs/SiteStatus.md)
 - [SiteUpdate](docs/SiteUpdate.md)
 - [SitesPage](docs/SitesPage.md)
 - [SitesPageAllOf](docs/SitesPageAllOf.md)
 - [StartWorkflowResponse](docs/StartWorkflowResponse.md)
 - [TemplateParameterValidator](docs/TemplateParameterValidator.md)
 - [Tenant](docs/Tenant.md)
 - [TenantAllOf](docs/TenantAllOf.md)
 - [TenantCreate](docs/TenantCreate.md)
 - [TenantCreateAllOf](docs/TenantCreateAllOf.md)
 - [TenantUpdate](docs/TenantUpdate.md)
 - [TenantsPage](docs/TenantsPage.md)
 - [TenantsPageAllOf](docs/TenantsPageAllOf.md)
 - [UpdatePassword](docs/UpdatePassword.md)
 - [User](docs/User.md)
 - [UserAllOf](docs/UserAllOf.md)
 - [UserCreate](docs/UserCreate.md)
 - [UserCreateAllOf](docs/UserCreateAllOf.md)
 - [UserUpdate](docs/UserUpdate.md)
 - [UsersPage](docs/UsersPage.md)
 - [UsersPageAllOf](docs/UsersPageAllOf.md)
 - [ValidateWorkflowResponse](docs/ValidateWorkflowResponse.md)
 - [Workflow](docs/Workflow.md)
 - [WorkflowAccessMeta](docs/WorkflowAccessMeta.md)
 - [WorkflowAccessMetaType](docs/WorkflowAccessMetaType.md)
 - [WorkflowAction](docs/WorkflowAction.md)
 - [WorkflowActionBlock](docs/WorkflowActionBlock.md)
 - [WorkflowAllOf](docs/WorkflowAllOf.md)
 - [WorkflowCategory](docs/WorkflowCategory.md)
 - [WorkflowCategoryAllOf](docs/WorkflowCategoryAllOf.md)
 - [WorkflowCategoryCreate](docs/WorkflowCategoryCreate.md)
 - [WorkflowCategoryUpdate](docs/WorkflowCategoryUpdate.md)
 - [WorkflowDefAccessMeta](docs/WorkflowDefAccessMeta.md)
 - [WorkflowEvent](docs/WorkflowEvent.md)
 - [WorkflowEventAllOf](docs/WorkflowEventAllOf.md)
 - [WorkflowEventCreate](docs/WorkflowEventCreate.md)
 - [WorkflowEventUpdate](docs/WorkflowEventUpdate.md)
 - [WorkflowFooter](docs/WorkflowFooter.md)
 - [WorkflowInstance](docs/WorkflowInstance.md)
 - [WorkflowInstanceAllOf](docs/WorkflowInstanceAllOf.md)
 - [WorkflowInstanceDeleteResponse](docs/WorkflowInstanceDeleteResponse.md)
 - [WorkflowMapping](docs/WorkflowMapping.md)
 - [WorkflowMetadata](docs/WorkflowMetadata.md)
 - [WorkflowMetadataGitInfo](docs/WorkflowMetadataGitInfo.md)
 - [WorkflowSchema](docs/WorkflowSchema.md)
 - [WorkflowSchemaAllOf](docs/WorkflowSchemaAllOf.md)
 - [WorkflowSchemaByTypeResponse](docs/WorkflowSchemaByTypeResponse.md)
 - [WorkflowStartConfig](docs/WorkflowStartConfig.md)
 - [WorkflowTarget](docs/WorkflowTarget.md)
 - [WorkflowTargetAllOf](docs/WorkflowTargetAllOf.md)
 - [WorkflowTargetCreate](docs/WorkflowTargetCreate.md)
 - [WorkflowTargetUpdate](docs/WorkflowTargetUpdate.md)
 - [WorkflowVariable](docs/WorkflowVariable.md)
 - [WorkflowVariableAllOf](docs/WorkflowVariableAllOf.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



