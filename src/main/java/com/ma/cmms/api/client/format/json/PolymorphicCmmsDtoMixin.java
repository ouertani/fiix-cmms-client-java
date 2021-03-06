package com.ma.cmms.api.client.format.json;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.ma.cmms.api.format.json.JsonFormatConstants;

@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = JsonFormatConstants.MAGICK_DTO_JSON_FIELD_NAME)
@JsonSubTypes(
{
		@Type(value = com.ma.cmms.api.client.dto.Account.class, name = "Account"),
		@Type(value = com.ma.cmms.api.client.dto.Asset.class, name = "Asset"),
		@Type(value = com.ma.cmms.api.client.dto.AssetActivityLog.class, name = "AssetActivityLog"),
		@Type(value = com.ma.cmms.api.client.dto.AssetBusiness.class, name = "AssetBusiness"),
		@Type(value = com.ma.cmms.api.client.dto.AssetCategory.class, name = "AssetCategory"),
		@Type(value = com.ma.cmms.api.client.dto.AssetCategoryResolved.class, name = "AssetCategoryResolved"),
		@Type(value = com.ma.cmms.api.client.dto.AssetClassificationLog.class, name = "AssetClassificationLog"),
		@Type(value = com.ma.cmms.api.client.dto.AssetConsumingReference.class, name = "AssetConsumingReference"),
		@Type(value = com.ma.cmms.api.client.dto.AssetEvent.class, name = "AssetEvent"),
		@Type(value = com.ma.cmms.api.client.dto.AssetEventType.class, name = "AssetEventType"),
		@Type(value = com.ma.cmms.api.client.dto.AssetEventTypeAsset.class, name = "AssetEventTypeAsset"),
		@Type(value = com.ma.cmms.api.client.dto.AssetOfflineTracker.class, name = "AssetOfflineTracker"),
		@Type(value = com.ma.cmms.api.client.dto.AssetProperty.class, name = "AssetProperty"),
		@Type(value = com.ma.cmms.api.client.dto.AssetPropertyDomainElement.class, name = "AssetPropertyDomainElement"),
		@Type(value = com.ma.cmms.api.client.dto.AssetPropertyType.class, name = "AssetPropertyType"),
		@Type(value = com.ma.cmms.api.client.dto.AssetPropertyValue.class, name = "AssetPropertyValue"),
		@Type(value = com.ma.cmms.api.client.dto.AssetResolved.class, name = "AssetResolved"),
		@Type(value = com.ma.cmms.api.client.dto.AssetUser.class, name = "AssetUser"),
		@Type(value = com.ma.cmms.api.client.dto.Business.class, name = "Business"),
		@Type(value = com.ma.cmms.api.client.dto.BusinessClassification.class, name = "BusinessClassification"),
		@Type(value = com.ma.cmms.api.client.dto.BusinessGroup.class, name = "BusinessGroup"),
		@Type(value = com.ma.cmms.api.client.dto.CalendarEvent.class, name = "CalendarEvent"),
		@Type(value = com.ma.cmms.api.client.dto.ChargeDepartment.class, name = "ChargeDepartment"),
		@Type(value = com.ma.cmms.api.client.dto.Country.class, name = "Country"),
		@Type(value = com.ma.cmms.api.client.dto.Currency.class, name = "Currency"),
		@Type(value = com.ma.cmms.api.client.dto.CycleCount.class, name = "CycleCount"),
		@Type(value = com.ma.cmms.api.client.dto.Dashboard.class, name = "Dashboard"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardDashboardPersona.class, name = "DashboardDashboardPersona"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardPersona.class, name = "DashboardPersona"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidget.class, name = "DashboardWidget"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetCategory.class, name = "DashboardWidgetCategory"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetDashboardPersona.class, name = "DashboardWidgetDashboardPersona"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetParameter.class, name = "DashboardWidgetParameter"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetPosition.class, name = "DashboardWidgetPosition"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetPositionFilter.class, name = "DashboardWidgetPositionFilter"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetPositionParameter.class, name = "DashboardWidgetPositionParameter"),
		@Type(value = com.ma.cmms.api.client.dto.DashboardWidgetQuery.class, name = "DashboardWidgetQuery"),
		@Type(value = com.ma.cmms.api.client.dto.File.class, name = "File"),
		@Type(value = com.ma.cmms.api.client.dto.FileContents.class, name = "FileContents"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcAsset.class, name = "GHGCalcAsset"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcCarbonMarket.class, name = "GHGCalcCarbonMarket"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcFuel.class, name = "GHGCalcFuel"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcGWP.class, name = "GHGCalcGWP"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcLocation.class, name = "GHGCalcLocation"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcResource.class, name = "GHGCalcResource"),
		@Type(value = com.ma.cmms.api.client.dto.GHGCalcVehicle.class, name = "GHGCalcVehicle"),
		@Type(value = com.ma.cmms.api.client.dto.KpiResult.class, name = "KpiResult"),
		@Type(value = com.ma.cmms.api.client.dto.MaintenanceType.class, name = "MaintenanceType"),
		@Type(value = com.ma.cmms.api.client.dto.MeterReading.class, name = "MeterReading"),
		@Type(value = com.ma.cmms.api.client.dto.MeterReadingUnit.class, name = "MeterReadingUnit"),
		@Type(value = com.ma.cmms.api.client.dto.Move.class, name = "Move"),
		@Type(value = com.ma.cmms.api.client.dto.MoveAsset.class, name = "MoveAsset"),
		@Type(value = com.ma.cmms.api.client.dto.MoveBack.class, name = "MoveBack"),
		@Type(value = com.ma.cmms.api.client.dto.MoveBackAsset.class, name = "MoveBackAsset"),
		@Type(value = com.ma.cmms.api.client.dto.MoveSiteManager.class, name = "MoveSiteManager"),
		@Type(value = com.ma.cmms.api.client.dto.MoveStatus.class, name = "MoveStatus"),
		@Type(value = com.ma.cmms.api.client.dto.PricingTier.class, name = "PricingTier"),
		@Type(value = com.ma.cmms.api.client.dto.Priority.class, name = "Priority"),
		@Type(value = com.ma.cmms.api.client.dto.Product.class, name = "Product"),
		@Type(value = com.ma.cmms.api.client.dto.ProductOffering.class, name = "ProductOffering"),
		@Type(value = com.ma.cmms.api.client.dto.ProductTier.class, name = "ProductTier"),
		@Type(value = com.ma.cmms.api.client.dto.PurchaseOrder.class, name = "PurchaseOrder"),
		@Type(value = com.ma.cmms.api.client.dto.PurchaseOrderLineItem.class, name = "PurchaseOrderLineItem"),
		@Type(value = com.ma.cmms.api.client.dto.PurchaseOrderStatus.class, name = "PurchaseOrderStatus"),
		@Type(value = com.ma.cmms.api.client.dto.RFQStatus.class, name = "RFQStatus"),
		@Type(value = com.ma.cmms.api.client.dto.ReasonToSetAssetOffline.class, name = "ReasonToSetAssetOffline"),
		@Type(value = com.ma.cmms.api.client.dto.ReasonToSetAssetOnline.class, name = "ReasonToSetAssetOnline"),
		@Type(value = com.ma.cmms.api.client.dto.Receipt.class, name = "Receipt"),
		@Type(value = com.ma.cmms.api.client.dto.ReceiptLineItem.class, name = "ReceiptLineItem"),
		@Type(value = com.ma.cmms.api.client.dto.ReceiptStatus.class, name = "ReceiptStatus"),
		@Type(value = com.ma.cmms.api.client.dto.RegionUser.class, name = "RegionUser"),
		@Type(value = com.ma.cmms.api.client.dto.RegionUserGroup.class, name = "RegionUserGroup"),
		@Type(value = com.ma.cmms.api.client.dto.ReportsToResolved.class, name = "ReportsToResolved"),
		@Type(value = com.ma.cmms.api.client.dto.SSOImplementation.class, name = "SSOImplementation"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledMaintenance.class, name = "ScheduledMaintenance"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledMaintenanceAsset.class, name = "ScheduledMaintenanceAsset"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledMaintenanceBusiness.class, name = "ScheduledMaintenanceBusiness"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledMaintenancePart.class, name = "ScheduledMaintenancePart"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledMaintenanceUser.class, name = "ScheduledMaintenanceUser"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledTask.class, name = "ScheduledTask"),
		@Type(value = com.ma.cmms.api.client.dto.ScheduledTaskFile.class, name = "ScheduledTaskFile"),
		@Type(value = com.ma.cmms.api.client.dto.SiteUser.class, name = "SiteUser"),
		@Type(value = com.ma.cmms.api.client.dto.SiteUserGroup.class, name = "SiteUserGroup"),
		@Type(value = com.ma.cmms.api.client.dto.Stock.class, name = "Stock"),
		@Type(value = com.ma.cmms.api.client.dto.StockCycleCount.class, name = "StockCycleCount"),
		@Type(value = com.ma.cmms.api.client.dto.SystemSetting.class, name = "SystemSetting"),
		@Type(value = com.ma.cmms.api.client.dto.TaskFile.class, name = "TaskFile"),
		@Type(value = com.ma.cmms.api.client.dto.User.class, name = "User"),
		@Type(value = com.ma.cmms.api.client.dto.UserGroupDashboardPersona.class, name = "UserGroupDashboardPersona"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrder.class, name = "WorkOrder"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderAsset.class, name = "WorkOrderAsset"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderBusiness.class, name = "WorkOrderBusiness"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderPart.class, name = "WorkOrderPart"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderStatus.class, name = "WorkOrderStatus"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderTask.class, name = "WorkOrderTask"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderTaskFile.class, name = "WorkOrderTaskFile"),
		@Type(value = com.ma.cmms.api.client.dto.WorkOrderUser.class, name = "WorkOrderUser"),
})
abstract public class PolymorphicCmmsDtoMixin
{
}
