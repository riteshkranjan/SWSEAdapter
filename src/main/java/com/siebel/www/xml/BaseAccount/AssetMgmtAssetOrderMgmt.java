/**
 * AssetMgmtAssetOrderMgmt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.siebel.www.xml.BaseAccount;

public class AssetMgmtAssetOrderMgmt implements java.io.Serializable {

	@Override
	public String toString() {
		return "AssetMgmtAssetOrderMgmt [billingAccount=" + billingAccount + ", billingAccountId=" + billingAccountId
				+ ", integrationId=" + integrationId + ", productName=" + productName + ", serviceAccountId="
				+ serviceAccountId + ", getEffectiveEndDate=" + effectiveEndDate + "]";
	}

	private java.lang.String id;

	private java.lang.String created;

	private java.lang.String createdBy;

	private java.lang.String updated;

	private java.lang.String updatedBy;

	private java.lang.String conflictId;

	private java.lang.String modId;

	private java.lang.String accountPrimaryAddress;

	private java.lang.String accountPrimaryAddressId;

	private java.lang.String accountPrimaryAddressLine2;

	private java.lang.String accountPrimaryCity;

	private java.lang.String accountPrimaryCountry;

	private java.lang.String accountPrimaryServiceAgreementId;

	private java.lang.String accountPrimaryState;

	private java.lang.String accountPrimaryZip;

	private java.lang.String accountingMethod;

	private java.lang.String adjustedListPrice;

	private java.lang.String agreementId;

	private java.lang.String agreementName;

	private java.lang.String assetCurrencyCode;

	private java.lang.String assetDescription;

	private java.lang.String assetId;

	private java.lang.String assetNumber;

	private java.lang.String assetValue;

	private java.lang.String assetValueExchangeDate;

	private java.lang.String basePrice;

	private java.lang.String billingAccount;

	private java.lang.String billingAccountId;

	private java.lang.String billingProfileId2;

	private java.lang.String billingProfileName;

	private java.lang.String billingType;

	private java.lang.String build;

	private java.lang.String CLLI;

	private java.lang.String cfgStateCode;

	private java.lang.String cfgType;

	private java.lang.String comments;

	private java.lang.String compoundProductFlag;

	private java.lang.String compoundProductNumber;

	private java.lang.String condition;

	private java.lang.String convertToAssetFlag;

	private java.lang.String costListId;

	private java.lang.String currencyCode2;

	private java.lang.String customizableFlag;

	private java.lang.String effectiveEndDate;

	private java.lang.String exchangeDate;

	private java.lang.String extendedQuantity;

	private java.lang.String installDate;

	private java.lang.String integrationId;

	private java.lang.String inventoryLocationId;

	private java.lang.String licenseNumber;

	private java.lang.String meterCount;

	private java.lang.String mfgDate;

	private java.lang.String name;

	private java.lang.String networkElementType;

	private java.lang.String node;

	private java.lang.String operatingStatus;

	private java.lang.String organization;

	private java.lang.String organizationId;

	private java.lang.String organizationalUnitAddressId;

	private java.lang.String originalCost;

	private java.lang.String originalOrderId;

	private java.lang.String owner;

	private java.lang.String ownerAccountId;

	private java.lang.String ownerAssetNumber;

	private java.lang.String ownerContactId;

	private java.lang.String ownerFirstName;

	private java.lang.String ownerLastName;

	private java.lang.String ownership;

	private java.lang.String parentAssetId;

	private java.lang.String paymentType;

	private java.lang.String personalAddressId;

	private java.lang.String portNumber;

	private java.lang.String prefix;

	private java.lang.String primaryBillingProfileId;

	private java.lang.String primaryContactId;

	private java.lang.String primaryEmployeeId;

	private java.lang.String primaryOrganizationId;

	private java.lang.String primaryPositionId;

	private java.lang.String primaryWarrantyCoverageId;

	private java.lang.String primaryWarrantyEndDate;

	private java.lang.String primaryWarrantyStartDate;

	private java.lang.String primaryWarrantyType;

	private java.lang.String primaryWarranyId;

	private java.lang.String prodItemId;

	private java.lang.String prodPromId;

	private java.lang.String prodPromInstanceId;

	private java.lang.String prodPromName;

	private java.lang.String prodPromRuleId;

	private java.lang.String prodPromSourceId;

	private java.lang.String productBuild;

	private java.lang.String productDefTypeCode;

	private java.lang.String productDescription;

	private java.lang.String productId;

	private java.lang.String productInventoryId;

	private java.lang.String productName;

	private java.lang.String productPartNumber;

	private java.lang.String productPortId;

	private java.lang.String productPrimaryProductLine;

	private java.lang.String productPrimaryProductLineId;

	private java.lang.String productSPNDefinitionId;

	private java.lang.String productSerializedFlag;

	private java.lang.String productType;

	private java.lang.String productVersion;

	private java.lang.String productXAClassId;

	private java.lang.String purchaseDate2;

	private java.lang.String purchaseLocationDescription;

	private java.lang.String quantity;

	private java.lang.String referenceFlag;

	private java.lang.String referenceNumber2;

	private java.lang.String referenceNumber3;

	private java.lang.String registeredDate;

	private java.lang.String replacementValue;

	private java.lang.String rootAssetId;

	private java.lang.String rootAssetNumber;

	private java.lang.String rootAssetServiceAccountId;

	private java.lang.String rootCfgType;

	private java.lang.String rootIntegrationId;

	private java.lang.String rootProductDefTypeCode;

	private java.lang.String rootProductId;

	private java.lang.String serialNumber;

	private java.lang.String serialNumberVerifiedFlag;

	private java.lang.String serviceAccount;

	private java.lang.String serviceAccountId;

	private java.lang.String serviceAddress;

	private java.lang.String serviceAddressId;

	private java.lang.String serviceLength;

	private java.lang.String serviceLengthUoM;

	private java.lang.String servicePointId;

	private java.lang.String servicePointSerialNumber;

	private java.lang.String serviceType;

	private java.lang.String shipDate;

	private java.lang.String smartPartNumber;

	private java.lang.String startDate;

	private java.lang.String status;

	private java.lang.String toCLLI;

	private java.lang.String toNode;

	private java.lang.String toPortNumber;

	private java.lang.String toPrefix;

	private java.lang.String toServiceAccount;

	private java.lang.String toServiceAccountId;

	private java.lang.String toServiceAddress;

	private java.lang.String toServiceAddressId;

	private java.lang.String toServicePoint;

	private java.lang.String toServicePointId;

	private java.lang.String unitofMeasure3;

	private java.lang.String valueBasis;

	private java.lang.String version;

	private java.lang.String warrantyEndDate;

	private java.lang.String warrantyStartDate;

	private java.lang.String warrantyType;

	private com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt[] assetMgmtAssetOrderMgmt;

	private java.lang.String operation; // attribute

	private java.lang.String searchspec; // attribute

	public AssetMgmtAssetOrderMgmt() {
	}

	public AssetMgmtAssetOrderMgmt(java.lang.String id, java.lang.String created, java.lang.String createdBy,
			java.lang.String updated, java.lang.String updatedBy, java.lang.String conflictId, java.lang.String modId,
			java.lang.String accountPrimaryAddress, java.lang.String accountPrimaryAddressId,
			java.lang.String accountPrimaryAddressLine2, java.lang.String accountPrimaryCity,
			java.lang.String accountPrimaryCountry, java.lang.String accountPrimaryServiceAgreementId,
			java.lang.String accountPrimaryState, java.lang.String accountPrimaryZip, java.lang.String accountingMethod,
			java.lang.String adjustedListPrice, java.lang.String agreementId, java.lang.String agreementName,
			java.lang.String assetCurrencyCode, java.lang.String assetDescription, java.lang.String assetId,
			java.lang.String assetNumber, java.lang.String assetValue, java.lang.String assetValueExchangeDate,
			java.lang.String basePrice, java.lang.String billingAccount, java.lang.String billingAccountId,
			java.lang.String billingProfileId2, java.lang.String billingProfileName, java.lang.String billingType,
			java.lang.String build, java.lang.String CLLI, java.lang.String cfgStateCode, java.lang.String cfgType,
			java.lang.String comments, java.lang.String compoundProductFlag, java.lang.String compoundProductNumber,
			java.lang.String condition, java.lang.String convertToAssetFlag, java.lang.String costListId,
			java.lang.String currencyCode2, java.lang.String customizableFlag, java.lang.String effectiveEndDate,
			java.lang.String exchangeDate, java.lang.String extendedQuantity, java.lang.String installDate,
			java.lang.String integrationId, java.lang.String inventoryLocationId, java.lang.String licenseNumber,
			java.lang.String meterCount, java.lang.String mfgDate, java.lang.String name,
			java.lang.String networkElementType, java.lang.String node, java.lang.String operatingStatus,
			java.lang.String organization, java.lang.String organizationId,
			java.lang.String organizationalUnitAddressId, java.lang.String originalCost,
			java.lang.String originalOrderId, java.lang.String owner, java.lang.String ownerAccountId,
			java.lang.String ownerAssetNumber, java.lang.String ownerContactId, java.lang.String ownerFirstName,
			java.lang.String ownerLastName, java.lang.String ownership, java.lang.String parentAssetId,
			java.lang.String paymentType, java.lang.String personalAddressId, java.lang.String portNumber,
			java.lang.String prefix, java.lang.String primaryBillingProfileId, java.lang.String primaryContactId,
			java.lang.String primaryEmployeeId, java.lang.String primaryOrganizationId,
			java.lang.String primaryPositionId, java.lang.String primaryWarrantyCoverageId,
			java.lang.String primaryWarrantyEndDate, java.lang.String primaryWarrantyStartDate,
			java.lang.String primaryWarrantyType, java.lang.String primaryWarranyId, java.lang.String prodItemId,
			java.lang.String prodPromId, java.lang.String prodPromInstanceId, java.lang.String prodPromName,
			java.lang.String prodPromRuleId, java.lang.String prodPromSourceId, java.lang.String productBuild,
			java.lang.String productDefTypeCode, java.lang.String productDescription, java.lang.String productId,
			java.lang.String productInventoryId, java.lang.String productName, java.lang.String productPartNumber,
			java.lang.String productPortId, java.lang.String productPrimaryProductLine,
			java.lang.String productPrimaryProductLineId, java.lang.String productSPNDefinitionId,
			java.lang.String productSerializedFlag, java.lang.String productType, java.lang.String productVersion,
			java.lang.String productXAClassId, java.lang.String purchaseDate2,
			java.lang.String purchaseLocationDescription, java.lang.String quantity, java.lang.String referenceFlag,
			java.lang.String referenceNumber2, java.lang.String referenceNumber3, java.lang.String registeredDate,
			java.lang.String replacementValue, java.lang.String rootAssetId, java.lang.String rootAssetNumber,
			java.lang.String rootAssetServiceAccountId, java.lang.String rootCfgType,
			java.lang.String rootIntegrationId, java.lang.String rootProductDefTypeCode, java.lang.String rootProductId,
			java.lang.String serialNumber, java.lang.String serialNumberVerifiedFlag, java.lang.String serviceAccount,
			java.lang.String serviceAccountId, java.lang.String serviceAddress, java.lang.String serviceAddressId,
			java.lang.String serviceLength, java.lang.String serviceLengthUoM, java.lang.String servicePointId,
			java.lang.String servicePointSerialNumber, java.lang.String serviceType, java.lang.String shipDate,
			java.lang.String smartPartNumber, java.lang.String startDate, java.lang.String status,
			java.lang.String toCLLI, java.lang.String toNode, java.lang.String toPortNumber, java.lang.String toPrefix,
			java.lang.String toServiceAccount, java.lang.String toServiceAccountId, java.lang.String toServiceAddress,
			java.lang.String toServiceAddressId, java.lang.String toServicePoint, java.lang.String toServicePointId,
			java.lang.String unitofMeasure3, java.lang.String valueBasis, java.lang.String version,
			java.lang.String warrantyEndDate, java.lang.String warrantyStartDate, java.lang.String warrantyType,
			com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt[] assetMgmtAssetOrderMgmt,
			java.lang.String operation, java.lang.String searchspec) {
		this.id = id;
		this.created = created;
		this.createdBy = createdBy;
		this.updated = updated;
		this.updatedBy = updatedBy;
		this.conflictId = conflictId;
		this.modId = modId;
		this.accountPrimaryAddress = accountPrimaryAddress;
		this.accountPrimaryAddressId = accountPrimaryAddressId;
		this.accountPrimaryAddressLine2 = accountPrimaryAddressLine2;
		this.accountPrimaryCity = accountPrimaryCity;
		this.accountPrimaryCountry = accountPrimaryCountry;
		this.accountPrimaryServiceAgreementId = accountPrimaryServiceAgreementId;
		this.accountPrimaryState = accountPrimaryState;
		this.accountPrimaryZip = accountPrimaryZip;
		this.accountingMethod = accountingMethod;
		this.adjustedListPrice = adjustedListPrice;
		this.agreementId = agreementId;
		this.agreementName = agreementName;
		this.assetCurrencyCode = assetCurrencyCode;
		this.assetDescription = assetDescription;
		this.assetId = assetId;
		this.assetNumber = assetNumber;
		this.assetValue = assetValue;
		this.assetValueExchangeDate = assetValueExchangeDate;
		this.basePrice = basePrice;
		this.billingAccount = billingAccount;
		this.billingAccountId = billingAccountId;
		this.billingProfileId2 = billingProfileId2;
		this.billingProfileName = billingProfileName;
		this.billingType = billingType;
		this.build = build;
		this.CLLI = CLLI;
		this.cfgStateCode = cfgStateCode;
		this.cfgType = cfgType;
		this.comments = comments;
		this.compoundProductFlag = compoundProductFlag;
		this.compoundProductNumber = compoundProductNumber;
		this.condition = condition;
		this.convertToAssetFlag = convertToAssetFlag;
		this.costListId = costListId;
		this.currencyCode2 = currencyCode2;
		this.customizableFlag = customizableFlag;
		this.effectiveEndDate = effectiveEndDate;
		this.exchangeDate = exchangeDate;
		this.extendedQuantity = extendedQuantity;
		this.installDate = installDate;
		this.integrationId = integrationId;
		this.inventoryLocationId = inventoryLocationId;
		this.licenseNumber = licenseNumber;
		this.meterCount = meterCount;
		this.mfgDate = mfgDate;
		this.name = name;
		this.networkElementType = networkElementType;
		this.node = node;
		this.operatingStatus = operatingStatus;
		this.organization = organization;
		this.organizationId = organizationId;
		this.organizationalUnitAddressId = organizationalUnitAddressId;
		this.originalCost = originalCost;
		this.originalOrderId = originalOrderId;
		this.owner = owner;
		this.ownerAccountId = ownerAccountId;
		this.ownerAssetNumber = ownerAssetNumber;
		this.ownerContactId = ownerContactId;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.ownership = ownership;
		this.parentAssetId = parentAssetId;
		this.paymentType = paymentType;
		this.personalAddressId = personalAddressId;
		this.portNumber = portNumber;
		this.prefix = prefix;
		this.primaryBillingProfileId = primaryBillingProfileId;
		this.primaryContactId = primaryContactId;
		this.primaryEmployeeId = primaryEmployeeId;
		this.primaryOrganizationId = primaryOrganizationId;
		this.primaryPositionId = primaryPositionId;
		this.primaryWarrantyCoverageId = primaryWarrantyCoverageId;
		this.primaryWarrantyEndDate = primaryWarrantyEndDate;
		this.primaryWarrantyStartDate = primaryWarrantyStartDate;
		this.primaryWarrantyType = primaryWarrantyType;
		this.primaryWarranyId = primaryWarranyId;
		this.prodItemId = prodItemId;
		this.prodPromId = prodPromId;
		this.prodPromInstanceId = prodPromInstanceId;
		this.prodPromName = prodPromName;
		this.prodPromRuleId = prodPromRuleId;
		this.prodPromSourceId = prodPromSourceId;
		this.productBuild = productBuild;
		this.productDefTypeCode = productDefTypeCode;
		this.productDescription = productDescription;
		this.productId = productId;
		this.productInventoryId = productInventoryId;
		this.productName = productName;
		this.productPartNumber = productPartNumber;
		this.productPortId = productPortId;
		this.productPrimaryProductLine = productPrimaryProductLine;
		this.productPrimaryProductLineId = productPrimaryProductLineId;
		this.productSPNDefinitionId = productSPNDefinitionId;
		this.productSerializedFlag = productSerializedFlag;
		this.productType = productType;
		this.productVersion = productVersion;
		this.productXAClassId = productXAClassId;
		this.purchaseDate2 = purchaseDate2;
		this.purchaseLocationDescription = purchaseLocationDescription;
		this.quantity = quantity;
		this.referenceFlag = referenceFlag;
		this.referenceNumber2 = referenceNumber2;
		this.referenceNumber3 = referenceNumber3;
		this.registeredDate = registeredDate;
		this.replacementValue = replacementValue;
		this.rootAssetId = rootAssetId;
		this.rootAssetNumber = rootAssetNumber;
		this.rootAssetServiceAccountId = rootAssetServiceAccountId;
		this.rootCfgType = rootCfgType;
		this.rootIntegrationId = rootIntegrationId;
		this.rootProductDefTypeCode = rootProductDefTypeCode;
		this.rootProductId = rootProductId;
		this.serialNumber = serialNumber;
		this.serialNumberVerifiedFlag = serialNumberVerifiedFlag;
		this.serviceAccount = serviceAccount;
		this.serviceAccountId = serviceAccountId;
		this.serviceAddress = serviceAddress;
		this.serviceAddressId = serviceAddressId;
		this.serviceLength = serviceLength;
		this.serviceLengthUoM = serviceLengthUoM;
		this.servicePointId = servicePointId;
		this.servicePointSerialNumber = servicePointSerialNumber;
		this.serviceType = serviceType;
		this.shipDate = shipDate;
		this.smartPartNumber = smartPartNumber;
		this.startDate = startDate;
		this.status = status;
		this.toCLLI = toCLLI;
		this.toNode = toNode;
		this.toPortNumber = toPortNumber;
		this.toPrefix = toPrefix;
		this.toServiceAccount = toServiceAccount;
		this.toServiceAccountId = toServiceAccountId;
		this.toServiceAddress = toServiceAddress;
		this.toServiceAddressId = toServiceAddressId;
		this.toServicePoint = toServicePoint;
		this.toServicePointId = toServicePointId;
		this.unitofMeasure3 = unitofMeasure3;
		this.valueBasis = valueBasis;
		this.version = version;
		this.warrantyEndDate = warrantyEndDate;
		this.warrantyStartDate = warrantyStartDate;
		this.warrantyType = warrantyType;
		this.assetMgmtAssetOrderMgmt = assetMgmtAssetOrderMgmt;
		this.operation = operation;
		this.searchspec = searchspec;
	}

	/**
	 * Gets the id value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return id
	 */
	public java.lang.String getId() {
		return id;
	}

	/**
	 * Sets the id value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param id
	 */
	public void setId(java.lang.String id) {
		this.id = id;
	}

	/**
	 * Gets the created value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return created
	 */
	public java.lang.String getCreated() {
		return created;
	}

	/**
	 * Sets the created value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param created
	 */
	public void setCreated(java.lang.String created) {
		this.created = created;
	}

	/**
	 * Gets the createdBy value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return createdBy
	 */
	public java.lang.String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the createdBy value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param createdBy
	 */
	public void setCreatedBy(java.lang.String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Gets the updated value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return updated
	 */
	public java.lang.String getUpdated() {
		return updated;
	}

	/**
	 * Sets the updated value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param updated
	 */
	public void setUpdated(java.lang.String updated) {
		this.updated = updated;
	}

	/**
	 * Gets the updatedBy value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return updatedBy
	 */
	public java.lang.String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * Sets the updatedBy value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param updatedBy
	 */
	public void setUpdatedBy(java.lang.String updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * Gets the conflictId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return conflictId
	 */
	public java.lang.String getConflictId() {
		return conflictId;
	}

	/**
	 * Sets the conflictId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param conflictId
	 */
	public void setConflictId(java.lang.String conflictId) {
		this.conflictId = conflictId;
	}

	/**
	 * Gets the modId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return modId
	 */
	public java.lang.String getModId() {
		return modId;
	}

	/**
	 * Sets the modId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param modId
	 */
	public void setModId(java.lang.String modId) {
		this.modId = modId;
	}

	/**
	 * Gets the accountPrimaryAddress value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryAddress
	 */
	public java.lang.String getAccountPrimaryAddress() {
		return accountPrimaryAddress;
	}

	/**
	 * Sets the accountPrimaryAddress value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryAddress
	 */
	public void setAccountPrimaryAddress(java.lang.String accountPrimaryAddress) {
		this.accountPrimaryAddress = accountPrimaryAddress;
	}

	/**
	 * Gets the accountPrimaryAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryAddressId
	 */
	public java.lang.String getAccountPrimaryAddressId() {
		return accountPrimaryAddressId;
	}

	/**
	 * Sets the accountPrimaryAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryAddressId
	 */
	public void setAccountPrimaryAddressId(java.lang.String accountPrimaryAddressId) {
		this.accountPrimaryAddressId = accountPrimaryAddressId;
	}

	/**
	 * Gets the accountPrimaryAddressLine2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryAddressLine2
	 */
	public java.lang.String getAccountPrimaryAddressLine2() {
		return accountPrimaryAddressLine2;
	}

	/**
	 * Sets the accountPrimaryAddressLine2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryAddressLine2
	 */
	public void setAccountPrimaryAddressLine2(java.lang.String accountPrimaryAddressLine2) {
		this.accountPrimaryAddressLine2 = accountPrimaryAddressLine2;
	}

	/**
	 * Gets the accountPrimaryCity value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryCity
	 */
	public java.lang.String getAccountPrimaryCity() {
		return accountPrimaryCity;
	}

	/**
	 * Sets the accountPrimaryCity value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryCity
	 */
	public void setAccountPrimaryCity(java.lang.String accountPrimaryCity) {
		this.accountPrimaryCity = accountPrimaryCity;
	}

	/**
	 * Gets the accountPrimaryCountry value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryCountry
	 */
	public java.lang.String getAccountPrimaryCountry() {
		return accountPrimaryCountry;
	}

	/**
	 * Sets the accountPrimaryCountry value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryCountry
	 */
	public void setAccountPrimaryCountry(java.lang.String accountPrimaryCountry) {
		this.accountPrimaryCountry = accountPrimaryCountry;
	}

	/**
	 * Gets the accountPrimaryServiceAgreementId value for this
	 * AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryServiceAgreementId
	 */
	public java.lang.String getAccountPrimaryServiceAgreementId() {
		return accountPrimaryServiceAgreementId;
	}

	/**
	 * Sets the accountPrimaryServiceAgreementId value for this
	 * AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryServiceAgreementId
	 */
	public void setAccountPrimaryServiceAgreementId(java.lang.String accountPrimaryServiceAgreementId) {
		this.accountPrimaryServiceAgreementId = accountPrimaryServiceAgreementId;
	}

	/**
	 * Gets the accountPrimaryState value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryState
	 */
	public java.lang.String getAccountPrimaryState() {
		return accountPrimaryState;
	}

	/**
	 * Sets the accountPrimaryState value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryState
	 */
	public void setAccountPrimaryState(java.lang.String accountPrimaryState) {
		this.accountPrimaryState = accountPrimaryState;
	}

	/**
	 * Gets the accountPrimaryZip value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountPrimaryZip
	 */
	public java.lang.String getAccountPrimaryZip() {
		return accountPrimaryZip;
	}

	/**
	 * Sets the accountPrimaryZip value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountPrimaryZip
	 */
	public void setAccountPrimaryZip(java.lang.String accountPrimaryZip) {
		this.accountPrimaryZip = accountPrimaryZip;
	}

	/**
	 * Gets the accountingMethod value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return accountingMethod
	 */
	public java.lang.String getAccountingMethod() {
		return accountingMethod;
	}

	/**
	 * Sets the accountingMethod value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param accountingMethod
	 */
	public void setAccountingMethod(java.lang.String accountingMethod) {
		this.accountingMethod = accountingMethod;
	}

	/**
	 * Gets the adjustedListPrice value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return adjustedListPrice
	 */
	public java.lang.String getAdjustedListPrice() {
		return adjustedListPrice;
	}

	/**
	 * Sets the adjustedListPrice value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param adjustedListPrice
	 */
	public void setAdjustedListPrice(java.lang.String adjustedListPrice) {
		this.adjustedListPrice = adjustedListPrice;
	}

	/**
	 * Gets the agreementId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return agreementId
	 */
	public java.lang.String getAgreementId() {
		return agreementId;
	}

	/**
	 * Sets the agreementId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param agreementId
	 */
	public void setAgreementId(java.lang.String agreementId) {
		this.agreementId = agreementId;
	}

	/**
	 * Gets the agreementName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return agreementName
	 */
	public java.lang.String getAgreementName() {
		return agreementName;
	}

	/**
	 * Sets the agreementName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param agreementName
	 */
	public void setAgreementName(java.lang.String agreementName) {
		this.agreementName = agreementName;
	}

	/**
	 * Gets the assetCurrencyCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetCurrencyCode
	 */
	public java.lang.String getAssetCurrencyCode() {
		return assetCurrencyCode;
	}

	/**
	 * Sets the assetCurrencyCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetCurrencyCode
	 */
	public void setAssetCurrencyCode(java.lang.String assetCurrencyCode) {
		this.assetCurrencyCode = assetCurrencyCode;
	}

	/**
	 * Gets the assetDescription value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetDescription
	 */
	public java.lang.String getAssetDescription() {
		return assetDescription;
	}

	/**
	 * Sets the assetDescription value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetDescription
	 */
	public void setAssetDescription(java.lang.String assetDescription) {
		this.assetDescription = assetDescription;
	}

	/**
	 * Gets the assetId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetId
	 */
	public java.lang.String getAssetId() {
		return assetId;
	}

	/**
	 * Sets the assetId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetId
	 */
	public void setAssetId(java.lang.String assetId) {
		this.assetId = assetId;
	}

	/**
	 * Gets the assetNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetNumber
	 */
	public java.lang.String getAssetNumber() {
		return assetNumber;
	}

	/**
	 * Sets the assetNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetNumber
	 */
	public void setAssetNumber(java.lang.String assetNumber) {
		this.assetNumber = assetNumber;
	}

	/**
	 * Gets the assetValue value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetValue
	 */
	public java.lang.String getAssetValue() {
		return assetValue;
	}

	/**
	 * Sets the assetValue value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetValue
	 */
	public void setAssetValue(java.lang.String assetValue) {
		this.assetValue = assetValue;
	}

	/**
	 * Gets the assetValueExchangeDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetValueExchangeDate
	 */
	public java.lang.String getAssetValueExchangeDate() {
		return assetValueExchangeDate;
	}

	/**
	 * Sets the assetValueExchangeDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetValueExchangeDate
	 */
	public void setAssetValueExchangeDate(java.lang.String assetValueExchangeDate) {
		this.assetValueExchangeDate = assetValueExchangeDate;
	}

	/**
	 * Gets the basePrice value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return basePrice
	 */
	public java.lang.String getBasePrice() {
		return basePrice;
	}

	/**
	 * Sets the basePrice value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param basePrice
	 */
	public void setBasePrice(java.lang.String basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * Gets the billingAccount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return billingAccount
	 */
	public java.lang.String getBillingAccount() {
		return billingAccount;
	}

	/**
	 * Sets the billingAccount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param billingAccount
	 */
	public void setBillingAccount(java.lang.String billingAccount) {
		this.billingAccount = billingAccount;
	}

	/**
	 * Gets the billingAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return billingAccountId
	 */
	public java.lang.String getBillingAccountId() {
		return billingAccountId;
	}

	/**
	 * Sets the billingAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param billingAccountId
	 */
	public void setBillingAccountId(java.lang.String billingAccountId) {
		this.billingAccountId = billingAccountId;
	}

	/**
	 * Gets the billingProfileId2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return billingProfileId2
	 */
	public java.lang.String getBillingProfileId2() {
		return billingProfileId2;
	}

	/**
	 * Sets the billingProfileId2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param billingProfileId2
	 */
	public void setBillingProfileId2(java.lang.String billingProfileId2) {
		this.billingProfileId2 = billingProfileId2;
	}

	/**
	 * Gets the billingProfileName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return billingProfileName
	 */
	public java.lang.String getBillingProfileName() {
		return billingProfileName;
	}

	/**
	 * Sets the billingProfileName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param billingProfileName
	 */
	public void setBillingProfileName(java.lang.String billingProfileName) {
		this.billingProfileName = billingProfileName;
	}

	/**
	 * Gets the billingType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return billingType
	 */
	public java.lang.String getBillingType() {
		return billingType;
	}

	/**
	 * Sets the billingType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param billingType
	 */
	public void setBillingType(java.lang.String billingType) {
		this.billingType = billingType;
	}

	/**
	 * Gets the build value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return build
	 */
	public java.lang.String getBuild() {
		return build;
	}

	/**
	 * Sets the build value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param build
	 */
	public void setBuild(java.lang.String build) {
		this.build = build;
	}

	/**
	 * Gets the CLLI value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return CLLI
	 */
	public java.lang.String getCLLI() {
		return CLLI;
	}

	/**
	 * Sets the CLLI value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param CLLI
	 */
	public void setCLLI(java.lang.String CLLI) {
		this.CLLI = CLLI;
	}

	/**
	 * Gets the cfgStateCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return cfgStateCode
	 */
	public java.lang.String getCfgStateCode() {
		return cfgStateCode;
	}

	/**
	 * Sets the cfgStateCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param cfgStateCode
	 */
	public void setCfgStateCode(java.lang.String cfgStateCode) {
		this.cfgStateCode = cfgStateCode;
	}

	/**
	 * Gets the cfgType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return cfgType
	 */
	public java.lang.String getCfgType() {
		return cfgType;
	}

	/**
	 * Sets the cfgType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param cfgType
	 */
	public void setCfgType(java.lang.String cfgType) {
		this.cfgType = cfgType;
	}

	/**
	 * Gets the comments value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return comments
	 */
	public java.lang.String getComments() {
		return comments;
	}

	/**
	 * Sets the comments value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param comments
	 */
	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	/**
	 * Gets the compoundProductFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return compoundProductFlag
	 */
	public java.lang.String getCompoundProductFlag() {
		return compoundProductFlag;
	}

	/**
	 * Sets the compoundProductFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param compoundProductFlag
	 */
	public void setCompoundProductFlag(java.lang.String compoundProductFlag) {
		this.compoundProductFlag = compoundProductFlag;
	}

	/**
	 * Gets the compoundProductNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return compoundProductNumber
	 */
	public java.lang.String getCompoundProductNumber() {
		return compoundProductNumber;
	}

	/**
	 * Sets the compoundProductNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param compoundProductNumber
	 */
	public void setCompoundProductNumber(java.lang.String compoundProductNumber) {
		this.compoundProductNumber = compoundProductNumber;
	}

	/**
	 * Gets the condition value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return condition
	 */
	public java.lang.String getCondition() {
		return condition;
	}

	/**
	 * Sets the condition value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param condition
	 */
	public void setCondition(java.lang.String condition) {
		this.condition = condition;
	}

	/**
	 * Gets the convertToAssetFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return convertToAssetFlag
	 */
	public java.lang.String getConvertToAssetFlag() {
		return convertToAssetFlag;
	}

	/**
	 * Sets the convertToAssetFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param convertToAssetFlag
	 */
	public void setConvertToAssetFlag(java.lang.String convertToAssetFlag) {
		this.convertToAssetFlag = convertToAssetFlag;
	}

	/**
	 * Gets the costListId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return costListId
	 */
	public java.lang.String getCostListId() {
		return costListId;
	}

	/**
	 * Sets the costListId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param costListId
	 */
	public void setCostListId(java.lang.String costListId) {
		this.costListId = costListId;
	}

	/**
	 * Gets the currencyCode2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return currencyCode2
	 */
	public java.lang.String getCurrencyCode2() {
		return currencyCode2;
	}

	/**
	 * Sets the currencyCode2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param currencyCode2
	 */
	public void setCurrencyCode2(java.lang.String currencyCode2) {
		this.currencyCode2 = currencyCode2;
	}

	/**
	 * Gets the customizableFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return customizableFlag
	 */
	public java.lang.String getCustomizableFlag() {
		return customizableFlag;
	}

	/**
	 * Sets the customizableFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param customizableFlag
	 */
	public void setCustomizableFlag(java.lang.String customizableFlag) {
		this.customizableFlag = customizableFlag;
	}

	/**
	 * Gets the effectiveEndDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return effectiveEndDate
	 */
	public java.lang.String getEffectiveEndDate() {
		return effectiveEndDate;
	}

	/**
	 * Sets the effectiveEndDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param effectiveEndDate
	 */
	public void setEffectiveEndDate(java.lang.String effectiveEndDate) {
		this.effectiveEndDate = effectiveEndDate;
	}

	/**
	 * Gets the exchangeDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return exchangeDate
	 */
	public java.lang.String getExchangeDate() {
		return exchangeDate;
	}

	/**
	 * Sets the exchangeDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param exchangeDate
	 */
	public void setExchangeDate(java.lang.String exchangeDate) {
		this.exchangeDate = exchangeDate;
	}

	/**
	 * Gets the extendedQuantity value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return extendedQuantity
	 */
	public java.lang.String getExtendedQuantity() {
		return extendedQuantity;
	}

	/**
	 * Sets the extendedQuantity value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param extendedQuantity
	 */
	public void setExtendedQuantity(java.lang.String extendedQuantity) {
		this.extendedQuantity = extendedQuantity;
	}

	/**
	 * Gets the installDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return installDate
	 */
	public java.lang.String getInstallDate() {
		return installDate;
	}

	/**
	 * Sets the installDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param installDate
	 */
	public void setInstallDate(java.lang.String installDate) {
		this.installDate = installDate;
	}

	/**
	 * Gets the integrationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return integrationId
	 */
	public java.lang.String getIntegrationId() {
		return integrationId;
	}

	/**
	 * Sets the integrationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param integrationId
	 */
	public void setIntegrationId(java.lang.String integrationId) {
		this.integrationId = integrationId;
	}

	/**
	 * Gets the inventoryLocationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return inventoryLocationId
	 */
	public java.lang.String getInventoryLocationId() {
		return inventoryLocationId;
	}

	/**
	 * Sets the inventoryLocationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param inventoryLocationId
	 */
	public void setInventoryLocationId(java.lang.String inventoryLocationId) {
		this.inventoryLocationId = inventoryLocationId;
	}

	/**
	 * Gets the licenseNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return licenseNumber
	 */
	public java.lang.String getLicenseNumber() {
		return licenseNumber;
	}

	/**
	 * Sets the licenseNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param licenseNumber
	 */
	public void setLicenseNumber(java.lang.String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	/**
	 * Gets the meterCount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return meterCount
	 */
	public java.lang.String getMeterCount() {
		return meterCount;
	}

	/**
	 * Sets the meterCount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param meterCount
	 */
	public void setMeterCount(java.lang.String meterCount) {
		this.meterCount = meterCount;
	}

	/**
	 * Gets the mfgDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return mfgDate
	 */
	public java.lang.String getMfgDate() {
		return mfgDate;
	}

	/**
	 * Sets the mfgDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param mfgDate
	 */
	public void setMfgDate(java.lang.String mfgDate) {
		this.mfgDate = mfgDate;
	}

	/**
	 * Gets the name value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the networkElementType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return networkElementType
	 */
	public java.lang.String getNetworkElementType() {
		return networkElementType;
	}

	/**
	 * Sets the networkElementType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param networkElementType
	 */
	public void setNetworkElementType(java.lang.String networkElementType) {
		this.networkElementType = networkElementType;
	}

	/**
	 * Gets the node value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return node
	 */
	public java.lang.String getNode() {
		return node;
	}

	/**
	 * Sets the node value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param node
	 */
	public void setNode(java.lang.String node) {
		this.node = node;
	}

	/**
	 * Gets the operatingStatus value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return operatingStatus
	 */
	public java.lang.String getOperatingStatus() {
		return operatingStatus;
	}

	/**
	 * Sets the operatingStatus value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param operatingStatus
	 */
	public void setOperatingStatus(java.lang.String operatingStatus) {
		this.operatingStatus = operatingStatus;
	}

	/**
	 * Gets the organization value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return organization
	 */
	public java.lang.String getOrganization() {
		return organization;
	}

	/**
	 * Sets the organization value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param organization
	 */
	public void setOrganization(java.lang.String organization) {
		this.organization = organization;
	}

	/**
	 * Gets the organizationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return organizationId
	 */
	public java.lang.String getOrganizationId() {
		return organizationId;
	}

	/**
	 * Sets the organizationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param organizationId
	 */
	public void setOrganizationId(java.lang.String organizationId) {
		this.organizationId = organizationId;
	}

	/**
	 * Gets the organizationalUnitAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return organizationalUnitAddressId
	 */
	public java.lang.String getOrganizationalUnitAddressId() {
		return organizationalUnitAddressId;
	}

	/**
	 * Sets the organizationalUnitAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param organizationalUnitAddressId
	 */
	public void setOrganizationalUnitAddressId(java.lang.String organizationalUnitAddressId) {
		this.organizationalUnitAddressId = organizationalUnitAddressId;
	}

	/**
	 * Gets the originalCost value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return originalCost
	 */
	public java.lang.String getOriginalCost() {
		return originalCost;
	}

	/**
	 * Sets the originalCost value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param originalCost
	 */
	public void setOriginalCost(java.lang.String originalCost) {
		this.originalCost = originalCost;
	}

	/**
	 * Gets the originalOrderId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return originalOrderId
	 */
	public java.lang.String getOriginalOrderId() {
		return originalOrderId;
	}

	/**
	 * Sets the originalOrderId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param originalOrderId
	 */
	public void setOriginalOrderId(java.lang.String originalOrderId) {
		this.originalOrderId = originalOrderId;
	}

	/**
	 * Gets the owner value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return owner
	 */
	public java.lang.String getOwner() {
		return owner;
	}

	/**
	 * Sets the owner value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param owner
	 */
	public void setOwner(java.lang.String owner) {
		this.owner = owner;
	}

	/**
	 * Gets the ownerAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return ownerAccountId
	 */
	public java.lang.String getOwnerAccountId() {
		return ownerAccountId;
	}

	/**
	 * Sets the ownerAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param ownerAccountId
	 */
	public void setOwnerAccountId(java.lang.String ownerAccountId) {
		this.ownerAccountId = ownerAccountId;
	}

	/**
	 * Gets the ownerAssetNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return ownerAssetNumber
	 */
	public java.lang.String getOwnerAssetNumber() {
		return ownerAssetNumber;
	}

	/**
	 * Sets the ownerAssetNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param ownerAssetNumber
	 */
	public void setOwnerAssetNumber(java.lang.String ownerAssetNumber) {
		this.ownerAssetNumber = ownerAssetNumber;
	}

	/**
	 * Gets the ownerContactId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return ownerContactId
	 */
	public java.lang.String getOwnerContactId() {
		return ownerContactId;
	}

	/**
	 * Sets the ownerContactId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param ownerContactId
	 */
	public void setOwnerContactId(java.lang.String ownerContactId) {
		this.ownerContactId = ownerContactId;
	}

	/**
	 * Gets the ownerFirstName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return ownerFirstName
	 */
	public java.lang.String getOwnerFirstName() {
		return ownerFirstName;
	}

	/**
	 * Sets the ownerFirstName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param ownerFirstName
	 */
	public void setOwnerFirstName(java.lang.String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	/**
	 * Gets the ownerLastName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return ownerLastName
	 */
	public java.lang.String getOwnerLastName() {
		return ownerLastName;
	}

	/**
	 * Sets the ownerLastName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param ownerLastName
	 */
	public void setOwnerLastName(java.lang.String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	/**
	 * Gets the ownership value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return ownership
	 */
	public java.lang.String getOwnership() {
		return ownership;
	}

	/**
	 * Sets the ownership value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param ownership
	 */
	public void setOwnership(java.lang.String ownership) {
		this.ownership = ownership;
	}

	/**
	 * Gets the parentAssetId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return parentAssetId
	 */
	public java.lang.String getParentAssetId() {
		return parentAssetId;
	}

	/**
	 * Sets the parentAssetId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param parentAssetId
	 */
	public void setParentAssetId(java.lang.String parentAssetId) {
		this.parentAssetId = parentAssetId;
	}

	/**
	 * Gets the paymentType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return paymentType
	 */
	public java.lang.String getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the paymentType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param paymentType
	 */
	public void setPaymentType(java.lang.String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * Gets the personalAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return personalAddressId
	 */
	public java.lang.String getPersonalAddressId() {
		return personalAddressId;
	}

	/**
	 * Sets the personalAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param personalAddressId
	 */
	public void setPersonalAddressId(java.lang.String personalAddressId) {
		this.personalAddressId = personalAddressId;
	}

	/**
	 * Gets the portNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return portNumber
	 */
	public java.lang.String getPortNumber() {
		return portNumber;
	}

	/**
	 * Sets the portNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param portNumber
	 */
	public void setPortNumber(java.lang.String portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * Gets the prefix value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prefix
	 */
	public java.lang.String getPrefix() {
		return prefix;
	}

	/**
	 * Sets the prefix value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prefix
	 */
	public void setPrefix(java.lang.String prefix) {
		this.prefix = prefix;
	}

	/**
	 * Gets the primaryBillingProfileId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryBillingProfileId
	 */
	public java.lang.String getPrimaryBillingProfileId() {
		return primaryBillingProfileId;
	}

	/**
	 * Sets the primaryBillingProfileId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryBillingProfileId
	 */
	public void setPrimaryBillingProfileId(java.lang.String primaryBillingProfileId) {
		this.primaryBillingProfileId = primaryBillingProfileId;
	}

	/**
	 * Gets the primaryContactId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryContactId
	 */
	public java.lang.String getPrimaryContactId() {
		return primaryContactId;
	}

	/**
	 * Sets the primaryContactId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryContactId
	 */
	public void setPrimaryContactId(java.lang.String primaryContactId) {
		this.primaryContactId = primaryContactId;
	}

	/**
	 * Gets the primaryEmployeeId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryEmployeeId
	 */
	public java.lang.String getPrimaryEmployeeId() {
		return primaryEmployeeId;
	}

	/**
	 * Sets the primaryEmployeeId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryEmployeeId
	 */
	public void setPrimaryEmployeeId(java.lang.String primaryEmployeeId) {
		this.primaryEmployeeId = primaryEmployeeId;
	}

	/**
	 * Gets the primaryOrganizationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryOrganizationId
	 */
	public java.lang.String getPrimaryOrganizationId() {
		return primaryOrganizationId;
	}

	/**
	 * Sets the primaryOrganizationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryOrganizationId
	 */
	public void setPrimaryOrganizationId(java.lang.String primaryOrganizationId) {
		this.primaryOrganizationId = primaryOrganizationId;
	}

	/**
	 * Gets the primaryPositionId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryPositionId
	 */
	public java.lang.String getPrimaryPositionId() {
		return primaryPositionId;
	}

	/**
	 * Sets the primaryPositionId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryPositionId
	 */
	public void setPrimaryPositionId(java.lang.String primaryPositionId) {
		this.primaryPositionId = primaryPositionId;
	}

	/**
	 * Gets the primaryWarrantyCoverageId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryWarrantyCoverageId
	 */
	public java.lang.String getPrimaryWarrantyCoverageId() {
		return primaryWarrantyCoverageId;
	}

	/**
	 * Sets the primaryWarrantyCoverageId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryWarrantyCoverageId
	 */
	public void setPrimaryWarrantyCoverageId(java.lang.String primaryWarrantyCoverageId) {
		this.primaryWarrantyCoverageId = primaryWarrantyCoverageId;
	}

	/**
	 * Gets the primaryWarrantyEndDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryWarrantyEndDate
	 */
	public java.lang.String getPrimaryWarrantyEndDate() {
		return primaryWarrantyEndDate;
	}

	/**
	 * Sets the primaryWarrantyEndDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryWarrantyEndDate
	 */
	public void setPrimaryWarrantyEndDate(java.lang.String primaryWarrantyEndDate) {
		this.primaryWarrantyEndDate = primaryWarrantyEndDate;
	}

	/**
	 * Gets the primaryWarrantyStartDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryWarrantyStartDate
	 */
	public java.lang.String getPrimaryWarrantyStartDate() {
		return primaryWarrantyStartDate;
	}

	/**
	 * Sets the primaryWarrantyStartDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryWarrantyStartDate
	 */
	public void setPrimaryWarrantyStartDate(java.lang.String primaryWarrantyStartDate) {
		this.primaryWarrantyStartDate = primaryWarrantyStartDate;
	}

	/**
	 * Gets the primaryWarrantyType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryWarrantyType
	 */
	public java.lang.String getPrimaryWarrantyType() {
		return primaryWarrantyType;
	}

	/**
	 * Sets the primaryWarrantyType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryWarrantyType
	 */
	public void setPrimaryWarrantyType(java.lang.String primaryWarrantyType) {
		this.primaryWarrantyType = primaryWarrantyType;
	}

	/**
	 * Gets the primaryWarranyId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return primaryWarranyId
	 */
	public java.lang.String getPrimaryWarranyId() {
		return primaryWarranyId;
	}

	/**
	 * Sets the primaryWarranyId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param primaryWarranyId
	 */
	public void setPrimaryWarranyId(java.lang.String primaryWarranyId) {
		this.primaryWarranyId = primaryWarranyId;
	}

	/**
	 * Gets the prodItemId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prodItemId
	 */
	public java.lang.String getProdItemId() {
		return prodItemId;
	}

	/**
	 * Sets the prodItemId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prodItemId
	 */
	public void setProdItemId(java.lang.String prodItemId) {
		this.prodItemId = prodItemId;
	}

	/**
	 * Gets the prodPromId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prodPromId
	 */
	public java.lang.String getProdPromId() {
		return prodPromId;
	}

	/**
	 * Sets the prodPromId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prodPromId
	 */
	public void setProdPromId(java.lang.String prodPromId) {
		this.prodPromId = prodPromId;
	}

	/**
	 * Gets the prodPromInstanceId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prodPromInstanceId
	 */
	public java.lang.String getProdPromInstanceId() {
		return prodPromInstanceId;
	}

	/**
	 * Sets the prodPromInstanceId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prodPromInstanceId
	 */
	public void setProdPromInstanceId(java.lang.String prodPromInstanceId) {
		this.prodPromInstanceId = prodPromInstanceId;
	}

	/**
	 * Gets the prodPromName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prodPromName
	 */
	public java.lang.String getProdPromName() {
		return prodPromName;
	}

	/**
	 * Sets the prodPromName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prodPromName
	 */
	public void setProdPromName(java.lang.String prodPromName) {
		this.prodPromName = prodPromName;
	}

	/**
	 * Gets the prodPromRuleId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prodPromRuleId
	 */
	public java.lang.String getProdPromRuleId() {
		return prodPromRuleId;
	}

	/**
	 * Sets the prodPromRuleId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prodPromRuleId
	 */
	public void setProdPromRuleId(java.lang.String prodPromRuleId) {
		this.prodPromRuleId = prodPromRuleId;
	}

	/**
	 * Gets the prodPromSourceId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return prodPromSourceId
	 */
	public java.lang.String getProdPromSourceId() {
		return prodPromSourceId;
	}

	/**
	 * Sets the prodPromSourceId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param prodPromSourceId
	 */
	public void setProdPromSourceId(java.lang.String prodPromSourceId) {
		this.prodPromSourceId = prodPromSourceId;
	}

	/**
	 * Gets the productBuild value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productBuild
	 */
	public java.lang.String getProductBuild() {
		return productBuild;
	}

	/**
	 * Sets the productBuild value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productBuild
	 */
	public void setProductBuild(java.lang.String productBuild) {
		this.productBuild = productBuild;
	}

	/**
	 * Gets the productDefTypeCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productDefTypeCode
	 */
	public java.lang.String getProductDefTypeCode() {
		return productDefTypeCode;
	}

	/**
	 * Sets the productDefTypeCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productDefTypeCode
	 */
	public void setProductDefTypeCode(java.lang.String productDefTypeCode) {
		this.productDefTypeCode = productDefTypeCode;
	}

	/**
	 * Gets the productDescription value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productDescription
	 */
	public java.lang.String getProductDescription() {
		return productDescription;
	}

	/**
	 * Sets the productDescription value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productDescription
	 */
	public void setProductDescription(java.lang.String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * Gets the productId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productId
	 */
	public java.lang.String getProductId() {
		return productId;
	}

	/**
	 * Sets the productId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productId
	 */
	public void setProductId(java.lang.String productId) {
		this.productId = productId;
	}

	/**
	 * Gets the productInventoryId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productInventoryId
	 */
	public java.lang.String getProductInventoryId() {
		return productInventoryId;
	}

	/**
	 * Sets the productInventoryId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productInventoryId
	 */
	public void setProductInventoryId(java.lang.String productInventoryId) {
		this.productInventoryId = productInventoryId;
	}

	/**
	 * Gets the productName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productName
	 */
	public java.lang.String getProductName() {
		return productName;
	}

	/**
	 * Sets the productName value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productName
	 */
	public void setProductName(java.lang.String productName) {
		this.productName = productName;
	}

	/**
	 * Gets the productPartNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productPartNumber
	 */
	public java.lang.String getProductPartNumber() {
		return productPartNumber;
	}

	/**
	 * Sets the productPartNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productPartNumber
	 */
	public void setProductPartNumber(java.lang.String productPartNumber) {
		this.productPartNumber = productPartNumber;
	}

	/**
	 * Gets the productPortId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productPortId
	 */
	public java.lang.String getProductPortId() {
		return productPortId;
	}

	/**
	 * Sets the productPortId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productPortId
	 */
	public void setProductPortId(java.lang.String productPortId) {
		this.productPortId = productPortId;
	}

	/**
	 * Gets the productPrimaryProductLine value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productPrimaryProductLine
	 */
	public java.lang.String getProductPrimaryProductLine() {
		return productPrimaryProductLine;
	}

	/**
	 * Sets the productPrimaryProductLine value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productPrimaryProductLine
	 */
	public void setProductPrimaryProductLine(java.lang.String productPrimaryProductLine) {
		this.productPrimaryProductLine = productPrimaryProductLine;
	}

	/**
	 * Gets the productPrimaryProductLineId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productPrimaryProductLineId
	 */
	public java.lang.String getProductPrimaryProductLineId() {
		return productPrimaryProductLineId;
	}

	/**
	 * Sets the productPrimaryProductLineId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productPrimaryProductLineId
	 */
	public void setProductPrimaryProductLineId(java.lang.String productPrimaryProductLineId) {
		this.productPrimaryProductLineId = productPrimaryProductLineId;
	}

	/**
	 * Gets the productSPNDefinitionId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productSPNDefinitionId
	 */
	public java.lang.String getProductSPNDefinitionId() {
		return productSPNDefinitionId;
	}

	/**
	 * Sets the productSPNDefinitionId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productSPNDefinitionId
	 */
	public void setProductSPNDefinitionId(java.lang.String productSPNDefinitionId) {
		this.productSPNDefinitionId = productSPNDefinitionId;
	}

	/**
	 * Gets the productSerializedFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productSerializedFlag
	 */
	public java.lang.String getProductSerializedFlag() {
		return productSerializedFlag;
	}

	/**
	 * Sets the productSerializedFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productSerializedFlag
	 */
	public void setProductSerializedFlag(java.lang.String productSerializedFlag) {
		this.productSerializedFlag = productSerializedFlag;
	}

	/**
	 * Gets the productType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productType
	 */
	public java.lang.String getProductType() {
		return productType;
	}

	/**
	 * Sets the productType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productType
	 */
	public void setProductType(java.lang.String productType) {
		this.productType = productType;
	}

	/**
	 * Gets the productVersion value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productVersion
	 */
	public java.lang.String getProductVersion() {
		return productVersion;
	}

	/**
	 * Sets the productVersion value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productVersion
	 */
	public void setProductVersion(java.lang.String productVersion) {
		this.productVersion = productVersion;
	}

	/**
	 * Gets the productXAClassId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return productXAClassId
	 */
	public java.lang.String getProductXAClassId() {
		return productXAClassId;
	}

	/**
	 * Sets the productXAClassId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param productXAClassId
	 */
	public void setProductXAClassId(java.lang.String productXAClassId) {
		this.productXAClassId = productXAClassId;
	}

	/**
	 * Gets the purchaseDate2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return purchaseDate2
	 */
	public java.lang.String getPurchaseDate2() {
		return purchaseDate2;
	}

	/**
	 * Sets the purchaseDate2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param purchaseDate2
	 */
	public void setPurchaseDate2(java.lang.String purchaseDate2) {
		this.purchaseDate2 = purchaseDate2;
	}

	/**
	 * Gets the purchaseLocationDescription value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return purchaseLocationDescription
	 */
	public java.lang.String getPurchaseLocationDescription() {
		return purchaseLocationDescription;
	}

	/**
	 * Sets the purchaseLocationDescription value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param purchaseLocationDescription
	 */
	public void setPurchaseLocationDescription(java.lang.String purchaseLocationDescription) {
		this.purchaseLocationDescription = purchaseLocationDescription;
	}

	/**
	 * Gets the quantity value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return quantity
	 */
	public java.lang.String getQuantity() {
		return quantity;
	}

	/**
	 * Sets the quantity value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param quantity
	 */
	public void setQuantity(java.lang.String quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the referenceFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return referenceFlag
	 */
	public java.lang.String getReferenceFlag() {
		return referenceFlag;
	}

	/**
	 * Sets the referenceFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param referenceFlag
	 */
	public void setReferenceFlag(java.lang.String referenceFlag) {
		this.referenceFlag = referenceFlag;
	}

	/**
	 * Gets the referenceNumber2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return referenceNumber2
	 */
	public java.lang.String getReferenceNumber2() {
		return referenceNumber2;
	}

	/**
	 * Sets the referenceNumber2 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param referenceNumber2
	 */
	public void setReferenceNumber2(java.lang.String referenceNumber2) {
		this.referenceNumber2 = referenceNumber2;
	}

	/**
	 * Gets the referenceNumber3 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return referenceNumber3
	 */
	public java.lang.String getReferenceNumber3() {
		return referenceNumber3;
	}

	/**
	 * Sets the referenceNumber3 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param referenceNumber3
	 */
	public void setReferenceNumber3(java.lang.String referenceNumber3) {
		this.referenceNumber3 = referenceNumber3;
	}

	/**
	 * Gets the registeredDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return registeredDate
	 */
	public java.lang.String getRegisteredDate() {
		return registeredDate;
	}

	/**
	 * Sets the registeredDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param registeredDate
	 */
	public void setRegisteredDate(java.lang.String registeredDate) {
		this.registeredDate = registeredDate;
	}

	/**
	 * Gets the replacementValue value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return replacementValue
	 */
	public java.lang.String getReplacementValue() {
		return replacementValue;
	}

	/**
	 * Sets the replacementValue value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param replacementValue
	 */
	public void setReplacementValue(java.lang.String replacementValue) {
		this.replacementValue = replacementValue;
	}

	/**
	 * Gets the rootAssetId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootAssetId
	 */
	public java.lang.String getRootAssetId() {
		return rootAssetId;
	}

	/**
	 * Sets the rootAssetId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootAssetId
	 */
	public void setRootAssetId(java.lang.String rootAssetId) {
		this.rootAssetId = rootAssetId;
	}

	/**
	 * Gets the rootAssetNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootAssetNumber
	 */
	public java.lang.String getRootAssetNumber() {
		return rootAssetNumber;
	}

	/**
	 * Sets the rootAssetNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootAssetNumber
	 */
	public void setRootAssetNumber(java.lang.String rootAssetNumber) {
		this.rootAssetNumber = rootAssetNumber;
	}

	/**
	 * Gets the rootAssetServiceAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootAssetServiceAccountId
	 */
	public java.lang.String getRootAssetServiceAccountId() {
		return rootAssetServiceAccountId;
	}

	/**
	 * Sets the rootAssetServiceAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootAssetServiceAccountId
	 */
	public void setRootAssetServiceAccountId(java.lang.String rootAssetServiceAccountId) {
		this.rootAssetServiceAccountId = rootAssetServiceAccountId;
	}

	/**
	 * Gets the rootCfgType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootCfgType
	 */
	public java.lang.String getRootCfgType() {
		return rootCfgType;
	}

	/**
	 * Sets the rootCfgType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootCfgType
	 */
	public void setRootCfgType(java.lang.String rootCfgType) {
		this.rootCfgType = rootCfgType;
	}

	/**
	 * Gets the rootIntegrationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootIntegrationId
	 */
	public java.lang.String getRootIntegrationId() {
		return rootIntegrationId;
	}

	/**
	 * Sets the rootIntegrationId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootIntegrationId
	 */
	public void setRootIntegrationId(java.lang.String rootIntegrationId) {
		this.rootIntegrationId = rootIntegrationId;
	}

	/**
	 * Gets the rootProductDefTypeCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootProductDefTypeCode
	 */
	public java.lang.String getRootProductDefTypeCode() {
		return rootProductDefTypeCode;
	}

	/**
	 * Sets the rootProductDefTypeCode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootProductDefTypeCode
	 */
	public void setRootProductDefTypeCode(java.lang.String rootProductDefTypeCode) {
		this.rootProductDefTypeCode = rootProductDefTypeCode;
	}

	/**
	 * Gets the rootProductId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return rootProductId
	 */
	public java.lang.String getRootProductId() {
		return rootProductId;
	}

	/**
	 * Sets the rootProductId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param rootProductId
	 */
	public void setRootProductId(java.lang.String rootProductId) {
		this.rootProductId = rootProductId;
	}

	/**
	 * Gets the serialNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serialNumber
	 */
	public java.lang.String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Sets the serialNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serialNumber
	 */
	public void setSerialNumber(java.lang.String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * Gets the serialNumberVerifiedFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serialNumberVerifiedFlag
	 */
	public java.lang.String getSerialNumberVerifiedFlag() {
		return serialNumberVerifiedFlag;
	}

	/**
	 * Sets the serialNumberVerifiedFlag value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serialNumberVerifiedFlag
	 */
	public void setSerialNumberVerifiedFlag(java.lang.String serialNumberVerifiedFlag) {
		this.serialNumberVerifiedFlag = serialNumberVerifiedFlag;
	}

	/**
	 * Gets the serviceAccount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceAccount
	 */
	public java.lang.String getServiceAccount() {
		return serviceAccount;
	}

	/**
	 * Sets the serviceAccount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceAccount
	 */
	public void setServiceAccount(java.lang.String serviceAccount) {
		this.serviceAccount = serviceAccount;
	}

	/**
	 * Gets the serviceAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceAccountId
	 */
	public java.lang.String getServiceAccountId() {
		return serviceAccountId;
	}

	/**
	 * Sets the serviceAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceAccountId
	 */
	public void setServiceAccountId(java.lang.String serviceAccountId) {
		this.serviceAccountId = serviceAccountId;
	}

	/**
	 * Gets the serviceAddress value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceAddress
	 */
	public java.lang.String getServiceAddress() {
		return serviceAddress;
	}

	/**
	 * Sets the serviceAddress value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceAddress
	 */
	public void setServiceAddress(java.lang.String serviceAddress) {
		this.serviceAddress = serviceAddress;
	}

	/**
	 * Gets the serviceAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceAddressId
	 */
	public java.lang.String getServiceAddressId() {
		return serviceAddressId;
	}

	/**
	 * Sets the serviceAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceAddressId
	 */
	public void setServiceAddressId(java.lang.String serviceAddressId) {
		this.serviceAddressId = serviceAddressId;
	}

	/**
	 * Gets the serviceLength value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceLength
	 */
	public java.lang.String getServiceLength() {
		return serviceLength;
	}

	/**
	 * Sets the serviceLength value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceLength
	 */
	public void setServiceLength(java.lang.String serviceLength) {
		this.serviceLength = serviceLength;
	}

	/**
	 * Gets the serviceLengthUoM value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceLengthUoM
	 */
	public java.lang.String getServiceLengthUoM() {
		return serviceLengthUoM;
	}

	/**
	 * Sets the serviceLengthUoM value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceLengthUoM
	 */
	public void setServiceLengthUoM(java.lang.String serviceLengthUoM) {
		this.serviceLengthUoM = serviceLengthUoM;
	}

	/**
	 * Gets the servicePointId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return servicePointId
	 */
	public java.lang.String getServicePointId() {
		return servicePointId;
	}

	/**
	 * Sets the servicePointId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param servicePointId
	 */
	public void setServicePointId(java.lang.String servicePointId) {
		this.servicePointId = servicePointId;
	}

	/**
	 * Gets the servicePointSerialNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return servicePointSerialNumber
	 */
	public java.lang.String getServicePointSerialNumber() {
		return servicePointSerialNumber;
	}

	/**
	 * Sets the servicePointSerialNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param servicePointSerialNumber
	 */
	public void setServicePointSerialNumber(java.lang.String servicePointSerialNumber) {
		this.servicePointSerialNumber = servicePointSerialNumber;
	}

	/**
	 * Gets the serviceType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return serviceType
	 */
	public java.lang.String getServiceType() {
		return serviceType;
	}

	/**
	 * Sets the serviceType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param serviceType
	 */
	public void setServiceType(java.lang.String serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * Gets the shipDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return shipDate
	 */
	public java.lang.String getShipDate() {
		return shipDate;
	}

	/**
	 * Sets the shipDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param shipDate
	 */
	public void setShipDate(java.lang.String shipDate) {
		this.shipDate = shipDate;
	}

	/**
	 * Gets the smartPartNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return smartPartNumber
	 */
	public java.lang.String getSmartPartNumber() {
		return smartPartNumber;
	}

	/**
	 * Sets the smartPartNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param smartPartNumber
	 */
	public void setSmartPartNumber(java.lang.String smartPartNumber) {
		this.smartPartNumber = smartPartNumber;
	}

	/**
	 * Gets the startDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return startDate
	 */
	public java.lang.String getStartDate() {
		return startDate;
	}

	/**
	 * Sets the startDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param startDate
	 */
	public void setStartDate(java.lang.String startDate) {
		this.startDate = startDate;
	}

	/**
	 * Gets the status value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return status
	 */
	public java.lang.String getStatus() {
		return status;
	}

	/**
	 * Sets the status value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param status
	 */
	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	/**
	 * Gets the toCLLI value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toCLLI
	 */
	public java.lang.String getToCLLI() {
		return toCLLI;
	}

	/**
	 * Sets the toCLLI value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toCLLI
	 */
	public void setToCLLI(java.lang.String toCLLI) {
		this.toCLLI = toCLLI;
	}

	/**
	 * Gets the toNode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toNode
	 */
	public java.lang.String getToNode() {
		return toNode;
	}

	/**
	 * Sets the toNode value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toNode
	 */
	public void setToNode(java.lang.String toNode) {
		this.toNode = toNode;
	}

	/**
	 * Gets the toPortNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toPortNumber
	 */
	public java.lang.String getToPortNumber() {
		return toPortNumber;
	}

	/**
	 * Sets the toPortNumber value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toPortNumber
	 */
	public void setToPortNumber(java.lang.String toPortNumber) {
		this.toPortNumber = toPortNumber;
	}

	/**
	 * Gets the toPrefix value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toPrefix
	 */
	public java.lang.String getToPrefix() {
		return toPrefix;
	}

	/**
	 * Sets the toPrefix value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toPrefix
	 */
	public void setToPrefix(java.lang.String toPrefix) {
		this.toPrefix = toPrefix;
	}

	/**
	 * Gets the toServiceAccount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toServiceAccount
	 */
	public java.lang.String getToServiceAccount() {
		return toServiceAccount;
	}

	/**
	 * Sets the toServiceAccount value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toServiceAccount
	 */
	public void setToServiceAccount(java.lang.String toServiceAccount) {
		this.toServiceAccount = toServiceAccount;
	}

	/**
	 * Gets the toServiceAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toServiceAccountId
	 */
	public java.lang.String getToServiceAccountId() {
		return toServiceAccountId;
	}

	/**
	 * Sets the toServiceAccountId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toServiceAccountId
	 */
	public void setToServiceAccountId(java.lang.String toServiceAccountId) {
		this.toServiceAccountId = toServiceAccountId;
	}

	/**
	 * Gets the toServiceAddress value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toServiceAddress
	 */
	public java.lang.String getToServiceAddress() {
		return toServiceAddress;
	}

	/**
	 * Sets the toServiceAddress value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toServiceAddress
	 */
	public void setToServiceAddress(java.lang.String toServiceAddress) {
		this.toServiceAddress = toServiceAddress;
	}

	/**
	 * Gets the toServiceAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toServiceAddressId
	 */
	public java.lang.String getToServiceAddressId() {
		return toServiceAddressId;
	}

	/**
	 * Sets the toServiceAddressId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toServiceAddressId
	 */
	public void setToServiceAddressId(java.lang.String toServiceAddressId) {
		this.toServiceAddressId = toServiceAddressId;
	}

	/**
	 * Gets the toServicePoint value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toServicePoint
	 */
	public java.lang.String getToServicePoint() {
		return toServicePoint;
	}

	/**
	 * Sets the toServicePoint value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toServicePoint
	 */
	public void setToServicePoint(java.lang.String toServicePoint) {
		this.toServicePoint = toServicePoint;
	}

	/**
	 * Gets the toServicePointId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return toServicePointId
	 */
	public java.lang.String getToServicePointId() {
		return toServicePointId;
	}

	/**
	 * Sets the toServicePointId value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param toServicePointId
	 */
	public void setToServicePointId(java.lang.String toServicePointId) {
		this.toServicePointId = toServicePointId;
	}

	/**
	 * Gets the unitofMeasure3 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return unitofMeasure3
	 */
	public java.lang.String getUnitofMeasure3() {
		return unitofMeasure3;
	}

	/**
	 * Sets the unitofMeasure3 value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param unitofMeasure3
	 */
	public void setUnitofMeasure3(java.lang.String unitofMeasure3) {
		this.unitofMeasure3 = unitofMeasure3;
	}

	/**
	 * Gets the valueBasis value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return valueBasis
	 */
	public java.lang.String getValueBasis() {
		return valueBasis;
	}

	/**
	 * Sets the valueBasis value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param valueBasis
	 */
	public void setValueBasis(java.lang.String valueBasis) {
		this.valueBasis = valueBasis;
	}

	/**
	 * Gets the version value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return version
	 */
	public java.lang.String getVersion() {
		return version;
	}

	/**
	 * Sets the version value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param version
	 */
	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	/**
	 * Gets the warrantyEndDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return warrantyEndDate
	 */
	public java.lang.String getWarrantyEndDate() {
		return warrantyEndDate;
	}

	/**
	 * Sets the warrantyEndDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param warrantyEndDate
	 */
	public void setWarrantyEndDate(java.lang.String warrantyEndDate) {
		this.warrantyEndDate = warrantyEndDate;
	}

	/**
	 * Gets the warrantyStartDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return warrantyStartDate
	 */
	public java.lang.String getWarrantyStartDate() {
		return warrantyStartDate;
	}

	/**
	 * Sets the warrantyStartDate value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param warrantyStartDate
	 */
	public void setWarrantyStartDate(java.lang.String warrantyStartDate) {
		this.warrantyStartDate = warrantyStartDate;
	}

	/**
	 * Gets the warrantyType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return warrantyType
	 */
	public java.lang.String getWarrantyType() {
		return warrantyType;
	}

	/**
	 * Sets the warrantyType value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param warrantyType
	 */
	public void setWarrantyType(java.lang.String warrantyType) {
		this.warrantyType = warrantyType;
	}

	/**
	 * Gets the assetMgmtAssetOrderMgmt value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return assetMgmtAssetOrderMgmt
	 */
	public com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt[] getAssetMgmtAssetOrderMgmt() {
		return assetMgmtAssetOrderMgmt;
	}

	/**
	 * Sets the assetMgmtAssetOrderMgmt value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param assetMgmtAssetOrderMgmt
	 */
	public void setAssetMgmtAssetOrderMgmt(
			com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt[] assetMgmtAssetOrderMgmt) {
		this.assetMgmtAssetOrderMgmt = assetMgmtAssetOrderMgmt;
	}

	public com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt getAssetMgmtAssetOrderMgmt(int i) {
		return this.assetMgmtAssetOrderMgmt[i];
	}

	public void setAssetMgmtAssetOrderMgmt(int i, com.siebel.www.xml.BaseAccount.AssetMgmtAssetOrderMgmt _value) {
		this.assetMgmtAssetOrderMgmt[i] = _value;
	}

	/**
	 * Gets the operation value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return operation
	 */
	public java.lang.String getOperation() {
		return operation;
	}

	/**
	 * Sets the operation value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param operation
	 */
	public void setOperation(java.lang.String operation) {
		this.operation = operation;
	}

	/**
	 * Gets the searchspec value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @return searchspec
	 */
	public java.lang.String getSearchspec() {
		return searchspec;
	}

	/**
	 * Sets the searchspec value for this AssetMgmtAssetOrderMgmt.
	 * 
	 * @param searchspec
	 */
	public void setSearchspec(java.lang.String searchspec) {
		this.searchspec = searchspec;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AssetMgmtAssetOrderMgmt))
			return false;
		AssetMgmtAssetOrderMgmt other = (AssetMgmtAssetOrderMgmt) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.id == null && other.getId() == null) || (this.id != null && this.id.equals(other.getId())))
				&& ((this.created == null && other.getCreated() == null)
						|| (this.created != null && this.created.equals(other.getCreated())))
				&& ((this.createdBy == null && other.getCreatedBy() == null)
						|| (this.createdBy != null && this.createdBy.equals(other.getCreatedBy())))
				&& ((this.updated == null && other.getUpdated() == null)
						|| (this.updated != null && this.updated.equals(other.getUpdated())))
				&& ((this.updatedBy == null && other.getUpdatedBy() == null)
						|| (this.updatedBy != null && this.updatedBy.equals(other.getUpdatedBy())))
				&& ((this.conflictId == null && other.getConflictId() == null)
						|| (this.conflictId != null && this.conflictId.equals(other.getConflictId())))
				&& ((this.modId == null && other.getModId() == null)
						|| (this.modId != null && this.modId.equals(other.getModId())))
				&& ((this.accountPrimaryAddress == null && other.getAccountPrimaryAddress() == null)
						|| (this.accountPrimaryAddress != null
								&& this.accountPrimaryAddress.equals(other.getAccountPrimaryAddress())))
				&& ((this.accountPrimaryAddressId == null && other.getAccountPrimaryAddressId() == null)
						|| (this.accountPrimaryAddressId != null
								&& this.accountPrimaryAddressId.equals(other.getAccountPrimaryAddressId())))
				&& ((this.accountPrimaryAddressLine2 == null && other.getAccountPrimaryAddressLine2() == null)
						|| (this.accountPrimaryAddressLine2 != null
								&& this.accountPrimaryAddressLine2.equals(other.getAccountPrimaryAddressLine2())))
				&& ((this.accountPrimaryCity == null && other.getAccountPrimaryCity() == null)
						|| (this.accountPrimaryCity != null
								&& this.accountPrimaryCity.equals(other.getAccountPrimaryCity())))
				&& ((this.accountPrimaryCountry == null && other.getAccountPrimaryCountry() == null)
						|| (this.accountPrimaryCountry != null
								&& this.accountPrimaryCountry.equals(other.getAccountPrimaryCountry())))
				&& ((this.accountPrimaryServiceAgreementId == null
						&& other.getAccountPrimaryServiceAgreementId() == null)
						|| (this.accountPrimaryServiceAgreementId != null && this.accountPrimaryServiceAgreementId
								.equals(other.getAccountPrimaryServiceAgreementId())))
				&& ((this.accountPrimaryState == null && other.getAccountPrimaryState() == null)
						|| (this.accountPrimaryState != null
								&& this.accountPrimaryState.equals(other.getAccountPrimaryState())))
				&& ((this.accountPrimaryZip == null && other.getAccountPrimaryZip() == null)
						|| (this.accountPrimaryZip != null
								&& this.accountPrimaryZip.equals(other.getAccountPrimaryZip())))
				&& ((this.accountingMethod == null && other.getAccountingMethod() == null)
						|| (this.accountingMethod != null && this.accountingMethod.equals(other.getAccountingMethod())))
				&& ((this.adjustedListPrice == null && other.getAdjustedListPrice() == null)
						|| (this.adjustedListPrice != null
								&& this.adjustedListPrice.equals(other.getAdjustedListPrice())))
				&& ((this.agreementId == null && other.getAgreementId() == null)
						|| (this.agreementId != null && this.agreementId.equals(other.getAgreementId())))
				&& ((this.agreementName == null && other.getAgreementName() == null)
						|| (this.agreementName != null && this.agreementName.equals(other.getAgreementName())))
				&& ((this.assetCurrencyCode == null && other.getAssetCurrencyCode() == null)
						|| (this.assetCurrencyCode != null
								&& this.assetCurrencyCode.equals(other.getAssetCurrencyCode())))
				&& ((this.assetDescription == null && other.getAssetDescription() == null)
						|| (this.assetDescription != null && this.assetDescription.equals(other.getAssetDescription())))
				&& ((this.assetId == null && other.getAssetId() == null)
						|| (this.assetId != null && this.assetId.equals(other.getAssetId())))
				&& ((this.assetNumber == null && other.getAssetNumber() == null)
						|| (this.assetNumber != null && this.assetNumber.equals(other.getAssetNumber())))
				&& ((this.assetValue == null && other.getAssetValue() == null)
						|| (this.assetValue != null && this.assetValue.equals(other.getAssetValue())))
				&& ((this.assetValueExchangeDate == null && other.getAssetValueExchangeDate() == null)
						|| (this.assetValueExchangeDate != null
								&& this.assetValueExchangeDate.equals(other.getAssetValueExchangeDate())))
				&& ((this.basePrice == null && other.getBasePrice() == null)
						|| (this.basePrice != null && this.basePrice.equals(other.getBasePrice())))
				&& ((this.billingAccount == null && other.getBillingAccount() == null)
						|| (this.billingAccount != null && this.billingAccount.equals(other.getBillingAccount())))
				&& ((this.billingAccountId == null && other.getBillingAccountId() == null)
						|| (this.billingAccountId != null && this.billingAccountId.equals(other.getBillingAccountId())))
				&& ((this.billingProfileId2 == null && other.getBillingProfileId2() == null)
						|| (this.billingProfileId2 != null
								&& this.billingProfileId2.equals(other.getBillingProfileId2())))
				&& ((this.billingProfileName == null && other.getBillingProfileName() == null)
						|| (this.billingProfileName != null
								&& this.billingProfileName.equals(other.getBillingProfileName())))
				&& ((this.billingType == null && other.getBillingType() == null)
						|| (this.billingType != null && this.billingType.equals(other.getBillingType())))
				&& ((this.build == null && other.getBuild() == null)
						|| (this.build != null && this.build.equals(other.getBuild())))
				&& ((this.CLLI == null && other.getCLLI() == null)
						|| (this.CLLI != null && this.CLLI.equals(other.getCLLI())))
				&& ((this.cfgStateCode == null && other.getCfgStateCode() == null)
						|| (this.cfgStateCode != null && this.cfgStateCode.equals(other.getCfgStateCode())))
				&& ((this.cfgType == null && other.getCfgType() == null)
						|| (this.cfgType != null && this.cfgType.equals(other.getCfgType())))
				&& ((this.comments == null && other.getComments() == null)
						|| (this.comments != null && this.comments.equals(other.getComments())))
				&& ((this.compoundProductFlag == null && other.getCompoundProductFlag() == null)
						|| (this.compoundProductFlag != null
								&& this.compoundProductFlag.equals(other.getCompoundProductFlag())))
				&& ((this.compoundProductNumber == null && other.getCompoundProductNumber() == null)
						|| (this.compoundProductNumber != null
								&& this.compoundProductNumber.equals(other.getCompoundProductNumber())))
				&& ((this.condition == null && other.getCondition() == null)
						|| (this.condition != null && this.condition.equals(other.getCondition())))
				&& ((this.convertToAssetFlag == null && other.getConvertToAssetFlag() == null)
						|| (this.convertToAssetFlag != null
								&& this.convertToAssetFlag.equals(other.getConvertToAssetFlag())))
				&& ((this.costListId == null && other.getCostListId() == null)
						|| (this.costListId != null && this.costListId.equals(other.getCostListId())))
				&& ((this.currencyCode2 == null && other.getCurrencyCode2() == null)
						|| (this.currencyCode2 != null && this.currencyCode2.equals(other.getCurrencyCode2())))
				&& ((this.customizableFlag == null && other.getCustomizableFlag() == null)
						|| (this.customizableFlag != null && this.customizableFlag.equals(other.getCustomizableFlag())))
				&& ((this.effectiveEndDate == null && other.getEffectiveEndDate() == null)
						|| (this.effectiveEndDate != null && this.effectiveEndDate.equals(other.getEffectiveEndDate())))
				&& ((this.exchangeDate == null && other.getExchangeDate() == null)
						|| (this.exchangeDate != null && this.exchangeDate.equals(other.getExchangeDate())))
				&& ((this.extendedQuantity == null && other.getExtendedQuantity() == null)
						|| (this.extendedQuantity != null && this.extendedQuantity.equals(other.getExtendedQuantity())))
				&& ((this.installDate == null && other.getInstallDate() == null)
						|| (this.installDate != null && this.installDate.equals(other.getInstallDate())))
				&& ((this.integrationId == null && other.getIntegrationId() == null)
						|| (this.integrationId != null && this.integrationId.equals(other.getIntegrationId())))
				&& ((this.inventoryLocationId == null && other.getInventoryLocationId() == null)
						|| (this.inventoryLocationId != null
								&& this.inventoryLocationId.equals(other.getInventoryLocationId())))
				&& ((this.licenseNumber == null && other.getLicenseNumber() == null)
						|| (this.licenseNumber != null && this.licenseNumber.equals(other.getLicenseNumber())))
				&& ((this.meterCount == null && other.getMeterCount() == null)
						|| (this.meterCount != null && this.meterCount.equals(other.getMeterCount())))
				&& ((this.mfgDate == null && other.getMfgDate() == null)
						|| (this.mfgDate != null && this.mfgDate.equals(other.getMfgDate())))
				&& ((this.name == null && other.getName() == null)
						|| (this.name != null && this.name.equals(other.getName())))
				&& ((this.networkElementType == null && other.getNetworkElementType() == null)
						|| (this.networkElementType != null
								&& this.networkElementType.equals(other.getNetworkElementType())))
				&& ((this.node == null && other.getNode() == null)
						|| (this.node != null && this.node.equals(other.getNode())))
				&& ((this.operatingStatus == null && other.getOperatingStatus() == null)
						|| (this.operatingStatus != null && this.operatingStatus.equals(other.getOperatingStatus())))
				&& ((this.organization == null && other.getOrganization() == null)
						|| (this.organization != null && this.organization.equals(other.getOrganization())))
				&& ((this.organizationId == null && other.getOrganizationId() == null)
						|| (this.organizationId != null && this.organizationId.equals(other.getOrganizationId())))
				&& ((this.organizationalUnitAddressId == null && other.getOrganizationalUnitAddressId() == null)
						|| (this.organizationalUnitAddressId != null
								&& this.organizationalUnitAddressId.equals(other.getOrganizationalUnitAddressId())))
				&& ((this.originalCost == null && other.getOriginalCost() == null)
						|| (this.originalCost != null && this.originalCost.equals(other.getOriginalCost())))
				&& ((this.originalOrderId == null && other.getOriginalOrderId() == null)
						|| (this.originalOrderId != null && this.originalOrderId.equals(other.getOriginalOrderId())))
				&& ((this.owner == null && other.getOwner() == null)
						|| (this.owner != null && this.owner.equals(other.getOwner())))
				&& ((this.ownerAccountId == null && other.getOwnerAccountId() == null)
						|| (this.ownerAccountId != null && this.ownerAccountId.equals(other.getOwnerAccountId())))
				&& ((this.ownerAssetNumber == null && other.getOwnerAssetNumber() == null)
						|| (this.ownerAssetNumber != null && this.ownerAssetNumber.equals(other.getOwnerAssetNumber())))
				&& ((this.ownerContactId == null && other.getOwnerContactId() == null)
						|| (this.ownerContactId != null && this.ownerContactId.equals(other.getOwnerContactId())))
				&& ((this.ownerFirstName == null && other.getOwnerFirstName() == null)
						|| (this.ownerFirstName != null && this.ownerFirstName.equals(other.getOwnerFirstName())))
				&& ((this.ownerLastName == null && other.getOwnerLastName() == null)
						|| (this.ownerLastName != null && this.ownerLastName.equals(other.getOwnerLastName())))
				&& ((this.ownership == null && other.getOwnership() == null)
						|| (this.ownership != null && this.ownership.equals(other.getOwnership())))
				&& ((this.parentAssetId == null && other.getParentAssetId() == null)
						|| (this.parentAssetId != null && this.parentAssetId.equals(other.getParentAssetId())))
				&& ((this.paymentType == null && other.getPaymentType() == null)
						|| (this.paymentType != null && this.paymentType.equals(other.getPaymentType())))
				&& ((this.personalAddressId == null && other.getPersonalAddressId() == null)
						|| (this.personalAddressId != null
								&& this.personalAddressId.equals(other.getPersonalAddressId())))
				&& ((this.portNumber == null && other.getPortNumber() == null)
						|| (this.portNumber != null && this.portNumber.equals(other.getPortNumber())))
				&& ((this.prefix == null && other.getPrefix() == null)
						|| (this.prefix != null && this.prefix.equals(other.getPrefix())))
				&& ((this.primaryBillingProfileId == null && other.getPrimaryBillingProfileId() == null)
						|| (this.primaryBillingProfileId != null
								&& this.primaryBillingProfileId.equals(other.getPrimaryBillingProfileId())))
				&& ((this.primaryContactId == null && other.getPrimaryContactId() == null)
						|| (this.primaryContactId != null && this.primaryContactId.equals(other.getPrimaryContactId())))
				&& ((this.primaryEmployeeId == null && other.getPrimaryEmployeeId() == null)
						|| (this.primaryEmployeeId != null
								&& this.primaryEmployeeId.equals(other.getPrimaryEmployeeId())))
				&& ((this.primaryOrganizationId == null && other.getPrimaryOrganizationId() == null)
						|| (this.primaryOrganizationId != null
								&& this.primaryOrganizationId.equals(other.getPrimaryOrganizationId())))
				&& ((this.primaryPositionId == null && other.getPrimaryPositionId() == null)
						|| (this.primaryPositionId != null
								&& this.primaryPositionId.equals(other.getPrimaryPositionId())))
				&& ((this.primaryWarrantyCoverageId == null && other.getPrimaryWarrantyCoverageId() == null)
						|| (this.primaryWarrantyCoverageId != null
								&& this.primaryWarrantyCoverageId.equals(other.getPrimaryWarrantyCoverageId())))
				&& ((this.primaryWarrantyEndDate == null && other.getPrimaryWarrantyEndDate() == null)
						|| (this.primaryWarrantyEndDate != null
								&& this.primaryWarrantyEndDate.equals(other.getPrimaryWarrantyEndDate())))
				&& ((this.primaryWarrantyStartDate == null && other.getPrimaryWarrantyStartDate() == null)
						|| (this.primaryWarrantyStartDate != null
								&& this.primaryWarrantyStartDate.equals(other.getPrimaryWarrantyStartDate())))
				&& ((this.primaryWarrantyType == null && other.getPrimaryWarrantyType() == null)
						|| (this.primaryWarrantyType != null
								&& this.primaryWarrantyType.equals(other.getPrimaryWarrantyType())))
				&& ((this.primaryWarranyId == null && other.getPrimaryWarranyId() == null)
						|| (this.primaryWarranyId != null && this.primaryWarranyId.equals(other.getPrimaryWarranyId())))
				&& ((this.prodItemId == null && other.getProdItemId() == null)
						|| (this.prodItemId != null && this.prodItemId.equals(other.getProdItemId())))
				&& ((this.prodPromId == null && other.getProdPromId() == null)
						|| (this.prodPromId != null && this.prodPromId.equals(other.getProdPromId())))
				&& ((this.prodPromInstanceId == null && other.getProdPromInstanceId() == null)
						|| (this.prodPromInstanceId != null
								&& this.prodPromInstanceId.equals(other.getProdPromInstanceId())))
				&& ((this.prodPromName == null && other.getProdPromName() == null)
						|| (this.prodPromName != null && this.prodPromName.equals(other.getProdPromName())))
				&& ((this.prodPromRuleId == null && other.getProdPromRuleId() == null)
						|| (this.prodPromRuleId != null && this.prodPromRuleId.equals(other.getProdPromRuleId())))
				&& ((this.prodPromSourceId == null && other.getProdPromSourceId() == null)
						|| (this.prodPromSourceId != null && this.prodPromSourceId.equals(other.getProdPromSourceId())))
				&& ((this.productBuild == null && other.getProductBuild() == null)
						|| (this.productBuild != null && this.productBuild.equals(other.getProductBuild())))
				&& ((this.productDefTypeCode == null && other.getProductDefTypeCode() == null)
						|| (this.productDefTypeCode != null
								&& this.productDefTypeCode.equals(other.getProductDefTypeCode())))
				&& ((this.productDescription == null && other.getProductDescription() == null)
						|| (this.productDescription != null
								&& this.productDescription.equals(other.getProductDescription())))
				&& ((this.productId == null && other.getProductId() == null)
						|| (this.productId != null && this.productId.equals(other.getProductId())))
				&& ((this.productInventoryId == null && other.getProductInventoryId() == null)
						|| (this.productInventoryId != null
								&& this.productInventoryId.equals(other.getProductInventoryId())))
				&& ((this.productName == null && other.getProductName() == null)
						|| (this.productName != null && this.productName.equals(other.getProductName())))
				&& ((this.productPartNumber == null && other.getProductPartNumber() == null)
						|| (this.productPartNumber != null
								&& this.productPartNumber.equals(other.getProductPartNumber())))
				&& ((this.productPortId == null && other.getProductPortId() == null)
						|| (this.productPortId != null && this.productPortId.equals(other.getProductPortId())))
				&& ((this.productPrimaryProductLine == null && other.getProductPrimaryProductLine() == null)
						|| (this.productPrimaryProductLine != null
								&& this.productPrimaryProductLine.equals(other.getProductPrimaryProductLine())))
				&& ((this.productPrimaryProductLineId == null && other.getProductPrimaryProductLineId() == null)
						|| (this.productPrimaryProductLineId != null
								&& this.productPrimaryProductLineId.equals(other.getProductPrimaryProductLineId())))
				&& ((this.productSPNDefinitionId == null && other.getProductSPNDefinitionId() == null)
						|| (this.productSPNDefinitionId != null
								&& this.productSPNDefinitionId.equals(other.getProductSPNDefinitionId())))
				&& ((this.productSerializedFlag == null && other.getProductSerializedFlag() == null)
						|| (this.productSerializedFlag != null
								&& this.productSerializedFlag.equals(other.getProductSerializedFlag())))
				&& ((this.productType == null && other.getProductType() == null)
						|| (this.productType != null && this.productType.equals(other.getProductType())))
				&& ((this.productVersion == null && other.getProductVersion() == null)
						|| (this.productVersion != null && this.productVersion.equals(other.getProductVersion())))
				&& ((this.productXAClassId == null && other.getProductXAClassId() == null)
						|| (this.productXAClassId != null && this.productXAClassId.equals(other.getProductXAClassId())))
				&& ((this.purchaseDate2 == null && other.getPurchaseDate2() == null)
						|| (this.purchaseDate2 != null && this.purchaseDate2.equals(other.getPurchaseDate2())))
				&& ((this.purchaseLocationDescription == null && other.getPurchaseLocationDescription() == null)
						|| (this.purchaseLocationDescription != null
								&& this.purchaseLocationDescription.equals(other.getPurchaseLocationDescription())))
				&& ((this.quantity == null && other.getQuantity() == null)
						|| (this.quantity != null && this.quantity.equals(other.getQuantity())))
				&& ((this.referenceFlag == null && other.getReferenceFlag() == null)
						|| (this.referenceFlag != null && this.referenceFlag.equals(other.getReferenceFlag())))
				&& ((this.referenceNumber2 == null && other.getReferenceNumber2() == null)
						|| (this.referenceNumber2 != null && this.referenceNumber2.equals(other.getReferenceNumber2())))
				&& ((this.referenceNumber3 == null && other.getReferenceNumber3() == null)
						|| (this.referenceNumber3 != null && this.referenceNumber3.equals(other.getReferenceNumber3())))
				&& ((this.registeredDate == null && other.getRegisteredDate() == null)
						|| (this.registeredDate != null && this.registeredDate.equals(other.getRegisteredDate())))
				&& ((this.replacementValue == null && other.getReplacementValue() == null)
						|| (this.replacementValue != null && this.replacementValue.equals(other.getReplacementValue())))
				&& ((this.rootAssetId == null && other.getRootAssetId() == null)
						|| (this.rootAssetId != null && this.rootAssetId.equals(other.getRootAssetId())))
				&& ((this.rootAssetNumber == null && other.getRootAssetNumber() == null)
						|| (this.rootAssetNumber != null && this.rootAssetNumber.equals(other.getRootAssetNumber())))
				&& ((this.rootAssetServiceAccountId == null && other.getRootAssetServiceAccountId() == null)
						|| (this.rootAssetServiceAccountId != null
								&& this.rootAssetServiceAccountId.equals(other.getRootAssetServiceAccountId())))
				&& ((this.rootCfgType == null && other.getRootCfgType() == null)
						|| (this.rootCfgType != null && this.rootCfgType.equals(other.getRootCfgType())))
				&& ((this.rootIntegrationId == null && other.getRootIntegrationId() == null)
						|| (this.rootIntegrationId != null
								&& this.rootIntegrationId.equals(other.getRootIntegrationId())))
				&& ((this.rootProductDefTypeCode == null && other.getRootProductDefTypeCode() == null)
						|| (this.rootProductDefTypeCode != null
								&& this.rootProductDefTypeCode.equals(other.getRootProductDefTypeCode())))
				&& ((this.rootProductId == null && other.getRootProductId() == null)
						|| (this.rootProductId != null && this.rootProductId.equals(other.getRootProductId())))
				&& ((this.serialNumber == null && other.getSerialNumber() == null)
						|| (this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber())))
				&& ((this.serialNumberVerifiedFlag == null && other.getSerialNumberVerifiedFlag() == null)
						|| (this.serialNumberVerifiedFlag != null
								&& this.serialNumberVerifiedFlag.equals(other.getSerialNumberVerifiedFlag())))
				&& ((this.serviceAccount == null && other.getServiceAccount() == null)
						|| (this.serviceAccount != null && this.serviceAccount.equals(other.getServiceAccount())))
				&& ((this.serviceAccountId == null && other.getServiceAccountId() == null)
						|| (this.serviceAccountId != null && this.serviceAccountId.equals(other.getServiceAccountId())))
				&& ((this.serviceAddress == null && other.getServiceAddress() == null)
						|| (this.serviceAddress != null && this.serviceAddress.equals(other.getServiceAddress())))
				&& ((this.serviceAddressId == null && other.getServiceAddressId() == null)
						|| (this.serviceAddressId != null && this.serviceAddressId.equals(other.getServiceAddressId())))
				&& ((this.serviceLength == null && other.getServiceLength() == null)
						|| (this.serviceLength != null && this.serviceLength.equals(other.getServiceLength())))
				&& ((this.serviceLengthUoM == null && other.getServiceLengthUoM() == null)
						|| (this.serviceLengthUoM != null && this.serviceLengthUoM.equals(other.getServiceLengthUoM())))
				&& ((this.servicePointId == null && other.getServicePointId() == null)
						|| (this.servicePointId != null && this.servicePointId.equals(other.getServicePointId())))
				&& ((this.servicePointSerialNumber == null && other.getServicePointSerialNumber() == null)
						|| (this.servicePointSerialNumber != null
								&& this.servicePointSerialNumber.equals(other.getServicePointSerialNumber())))
				&& ((this.serviceType == null && other.getServiceType() == null)
						|| (this.serviceType != null && this.serviceType.equals(other.getServiceType())))
				&& ((this.shipDate == null && other.getShipDate() == null)
						|| (this.shipDate != null && this.shipDate.equals(other.getShipDate())))
				&& ((this.smartPartNumber == null && other.getSmartPartNumber() == null)
						|| (this.smartPartNumber != null && this.smartPartNumber.equals(other.getSmartPartNumber())))
				&& ((this.startDate == null && other.getStartDate() == null)
						|| (this.startDate != null && this.startDate.equals(other.getStartDate())))
				&& ((this.status == null && other.getStatus() == null)
						|| (this.status != null && this.status.equals(other.getStatus())))
				&& ((this.toCLLI == null && other.getToCLLI() == null)
						|| (this.toCLLI != null && this.toCLLI.equals(other.getToCLLI())))
				&& ((this.toNode == null && other.getToNode() == null)
						|| (this.toNode != null && this.toNode.equals(other.getToNode())))
				&& ((this.toPortNumber == null && other.getToPortNumber() == null)
						|| (this.toPortNumber != null && this.toPortNumber.equals(other.getToPortNumber())))
				&& ((this.toPrefix == null && other.getToPrefix() == null)
						|| (this.toPrefix != null && this.toPrefix.equals(other.getToPrefix())))
				&& ((this.toServiceAccount == null && other.getToServiceAccount() == null)
						|| (this.toServiceAccount != null && this.toServiceAccount.equals(other.getToServiceAccount())))
				&& ((this.toServiceAccountId == null && other.getToServiceAccountId() == null)
						|| (this.toServiceAccountId != null
								&& this.toServiceAccountId.equals(other.getToServiceAccountId())))
				&& ((this.toServiceAddress == null && other.getToServiceAddress() == null)
						|| (this.toServiceAddress != null && this.toServiceAddress.equals(other.getToServiceAddress())))
				&& ((this.toServiceAddressId == null && other.getToServiceAddressId() == null)
						|| (this.toServiceAddressId != null
								&& this.toServiceAddressId.equals(other.getToServiceAddressId())))
				&& ((this.toServicePoint == null && other.getToServicePoint() == null)
						|| (this.toServicePoint != null && this.toServicePoint.equals(other.getToServicePoint())))
				&& ((this.toServicePointId == null && other.getToServicePointId() == null)
						|| (this.toServicePointId != null && this.toServicePointId.equals(other.getToServicePointId())))
				&& ((this.unitofMeasure3 == null && other.getUnitofMeasure3() == null)
						|| (this.unitofMeasure3 != null && this.unitofMeasure3.equals(other.getUnitofMeasure3())))
				&& ((this.valueBasis == null && other.getValueBasis() == null)
						|| (this.valueBasis != null && this.valueBasis.equals(other.getValueBasis())))
				&& ((this.version == null && other.getVersion() == null)
						|| (this.version != null && this.version.equals(other.getVersion())))
				&& ((this.warrantyEndDate == null && other.getWarrantyEndDate() == null)
						|| (this.warrantyEndDate != null && this.warrantyEndDate.equals(other.getWarrantyEndDate())))
				&& ((this.warrantyStartDate == null && other.getWarrantyStartDate() == null)
						|| (this.warrantyStartDate != null
								&& this.warrantyStartDate.equals(other.getWarrantyStartDate())))
				&& ((this.warrantyType == null && other.getWarrantyType() == null)
						|| (this.warrantyType != null && this.warrantyType.equals(other.getWarrantyType())))
				&& ((this.assetMgmtAssetOrderMgmt == null && other.getAssetMgmtAssetOrderMgmt() == null)
						|| (this.assetMgmtAssetOrderMgmt != null && java.util.Arrays
								.equals(this.assetMgmtAssetOrderMgmt, other.getAssetMgmtAssetOrderMgmt())))
				&& ((this.operation == null && other.getOperation() == null)
						|| (this.operation != null && this.operation.equals(other.getOperation())))
				&& ((this.searchspec == null && other.getSearchspec() == null)
						|| (this.searchspec != null && this.searchspec.equals(other.getSearchspec())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getId() != null) {
			_hashCode += getId().hashCode();
		}
		if (getCreated() != null) {
			_hashCode += getCreated().hashCode();
		}
		if (getCreatedBy() != null) {
			_hashCode += getCreatedBy().hashCode();
		}
		if (getUpdated() != null) {
			_hashCode += getUpdated().hashCode();
		}
		if (getUpdatedBy() != null) {
			_hashCode += getUpdatedBy().hashCode();
		}
		if (getConflictId() != null) {
			_hashCode += getConflictId().hashCode();
		}
		if (getModId() != null) {
			_hashCode += getModId().hashCode();
		}
		if (getAccountPrimaryAddress() != null) {
			_hashCode += getAccountPrimaryAddress().hashCode();
		}
		if (getAccountPrimaryAddressId() != null) {
			_hashCode += getAccountPrimaryAddressId().hashCode();
		}
		if (getAccountPrimaryAddressLine2() != null) {
			_hashCode += getAccountPrimaryAddressLine2().hashCode();
		}
		if (getAccountPrimaryCity() != null) {
			_hashCode += getAccountPrimaryCity().hashCode();
		}
		if (getAccountPrimaryCountry() != null) {
			_hashCode += getAccountPrimaryCountry().hashCode();
		}
		if (getAccountPrimaryServiceAgreementId() != null) {
			_hashCode += getAccountPrimaryServiceAgreementId().hashCode();
		}
		if (getAccountPrimaryState() != null) {
			_hashCode += getAccountPrimaryState().hashCode();
		}
		if (getAccountPrimaryZip() != null) {
			_hashCode += getAccountPrimaryZip().hashCode();
		}
		if (getAccountingMethod() != null) {
			_hashCode += getAccountingMethod().hashCode();
		}
		if (getAdjustedListPrice() != null) {
			_hashCode += getAdjustedListPrice().hashCode();
		}
		if (getAgreementId() != null) {
			_hashCode += getAgreementId().hashCode();
		}
		if (getAgreementName() != null) {
			_hashCode += getAgreementName().hashCode();
		}
		if (getAssetCurrencyCode() != null) {
			_hashCode += getAssetCurrencyCode().hashCode();
		}
		if (getAssetDescription() != null) {
			_hashCode += getAssetDescription().hashCode();
		}
		if (getAssetId() != null) {
			_hashCode += getAssetId().hashCode();
		}
		if (getAssetNumber() != null) {
			_hashCode += getAssetNumber().hashCode();
		}
		if (getAssetValue() != null) {
			_hashCode += getAssetValue().hashCode();
		}
		if (getAssetValueExchangeDate() != null) {
			_hashCode += getAssetValueExchangeDate().hashCode();
		}
		if (getBasePrice() != null) {
			_hashCode += getBasePrice().hashCode();
		}
		if (getBillingAccount() != null) {
			_hashCode += getBillingAccount().hashCode();
		}
		if (getBillingAccountId() != null) {
			_hashCode += getBillingAccountId().hashCode();
		}
		if (getBillingProfileId2() != null) {
			_hashCode += getBillingProfileId2().hashCode();
		}
		if (getBillingProfileName() != null) {
			_hashCode += getBillingProfileName().hashCode();
		}
		if (getBillingType() != null) {
			_hashCode += getBillingType().hashCode();
		}
		if (getBuild() != null) {
			_hashCode += getBuild().hashCode();
		}
		if (getCLLI() != null) {
			_hashCode += getCLLI().hashCode();
		}
		if (getCfgStateCode() != null) {
			_hashCode += getCfgStateCode().hashCode();
		}
		if (getCfgType() != null) {
			_hashCode += getCfgType().hashCode();
		}
		if (getComments() != null) {
			_hashCode += getComments().hashCode();
		}
		if (getCompoundProductFlag() != null) {
			_hashCode += getCompoundProductFlag().hashCode();
		}
		if (getCompoundProductNumber() != null) {
			_hashCode += getCompoundProductNumber().hashCode();
		}
		if (getCondition() != null) {
			_hashCode += getCondition().hashCode();
		}
		if (getConvertToAssetFlag() != null) {
			_hashCode += getConvertToAssetFlag().hashCode();
		}
		if (getCostListId() != null) {
			_hashCode += getCostListId().hashCode();
		}
		if (getCurrencyCode2() != null) {
			_hashCode += getCurrencyCode2().hashCode();
		}
		if (getCustomizableFlag() != null) {
			_hashCode += getCustomizableFlag().hashCode();
		}
		if (getEffectiveEndDate() != null) {
			_hashCode += getEffectiveEndDate().hashCode();
		}
		if (getExchangeDate() != null) {
			_hashCode += getExchangeDate().hashCode();
		}
		if (getExtendedQuantity() != null) {
			_hashCode += getExtendedQuantity().hashCode();
		}
		if (getInstallDate() != null) {
			_hashCode += getInstallDate().hashCode();
		}
		if (getIntegrationId() != null) {
			_hashCode += getIntegrationId().hashCode();
		}
		if (getInventoryLocationId() != null) {
			_hashCode += getInventoryLocationId().hashCode();
		}
		if (getLicenseNumber() != null) {
			_hashCode += getLicenseNumber().hashCode();
		}
		if (getMeterCount() != null) {
			_hashCode += getMeterCount().hashCode();
		}
		if (getMfgDate() != null) {
			_hashCode += getMfgDate().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getNetworkElementType() != null) {
			_hashCode += getNetworkElementType().hashCode();
		}
		if (getNode() != null) {
			_hashCode += getNode().hashCode();
		}
		if (getOperatingStatus() != null) {
			_hashCode += getOperatingStatus().hashCode();
		}
		if (getOrganization() != null) {
			_hashCode += getOrganization().hashCode();
		}
		if (getOrganizationId() != null) {
			_hashCode += getOrganizationId().hashCode();
		}
		if (getOrganizationalUnitAddressId() != null) {
			_hashCode += getOrganizationalUnitAddressId().hashCode();
		}
		if (getOriginalCost() != null) {
			_hashCode += getOriginalCost().hashCode();
		}
		if (getOriginalOrderId() != null) {
			_hashCode += getOriginalOrderId().hashCode();
		}
		if (getOwner() != null) {
			_hashCode += getOwner().hashCode();
		}
		if (getOwnerAccountId() != null) {
			_hashCode += getOwnerAccountId().hashCode();
		}
		if (getOwnerAssetNumber() != null) {
			_hashCode += getOwnerAssetNumber().hashCode();
		}
		if (getOwnerContactId() != null) {
			_hashCode += getOwnerContactId().hashCode();
		}
		if (getOwnerFirstName() != null) {
			_hashCode += getOwnerFirstName().hashCode();
		}
		if (getOwnerLastName() != null) {
			_hashCode += getOwnerLastName().hashCode();
		}
		if (getOwnership() != null) {
			_hashCode += getOwnership().hashCode();
		}
		if (getParentAssetId() != null) {
			_hashCode += getParentAssetId().hashCode();
		}
		if (getPaymentType() != null) {
			_hashCode += getPaymentType().hashCode();
		}
		if (getPersonalAddressId() != null) {
			_hashCode += getPersonalAddressId().hashCode();
		}
		if (getPortNumber() != null) {
			_hashCode += getPortNumber().hashCode();
		}
		if (getPrefix() != null) {
			_hashCode += getPrefix().hashCode();
		}
		if (getPrimaryBillingProfileId() != null) {
			_hashCode += getPrimaryBillingProfileId().hashCode();
		}
		if (getPrimaryContactId() != null) {
			_hashCode += getPrimaryContactId().hashCode();
		}
		if (getPrimaryEmployeeId() != null) {
			_hashCode += getPrimaryEmployeeId().hashCode();
		}
		if (getPrimaryOrganizationId() != null) {
			_hashCode += getPrimaryOrganizationId().hashCode();
		}
		if (getPrimaryPositionId() != null) {
			_hashCode += getPrimaryPositionId().hashCode();
		}
		if (getPrimaryWarrantyCoverageId() != null) {
			_hashCode += getPrimaryWarrantyCoverageId().hashCode();
		}
		if (getPrimaryWarrantyEndDate() != null) {
			_hashCode += getPrimaryWarrantyEndDate().hashCode();
		}
		if (getPrimaryWarrantyStartDate() != null) {
			_hashCode += getPrimaryWarrantyStartDate().hashCode();
		}
		if (getPrimaryWarrantyType() != null) {
			_hashCode += getPrimaryWarrantyType().hashCode();
		}
		if (getPrimaryWarranyId() != null) {
			_hashCode += getPrimaryWarranyId().hashCode();
		}
		if (getProdItemId() != null) {
			_hashCode += getProdItemId().hashCode();
		}
		if (getProdPromId() != null) {
			_hashCode += getProdPromId().hashCode();
		}
		if (getProdPromInstanceId() != null) {
			_hashCode += getProdPromInstanceId().hashCode();
		}
		if (getProdPromName() != null) {
			_hashCode += getProdPromName().hashCode();
		}
		if (getProdPromRuleId() != null) {
			_hashCode += getProdPromRuleId().hashCode();
		}
		if (getProdPromSourceId() != null) {
			_hashCode += getProdPromSourceId().hashCode();
		}
		if (getProductBuild() != null) {
			_hashCode += getProductBuild().hashCode();
		}
		if (getProductDefTypeCode() != null) {
			_hashCode += getProductDefTypeCode().hashCode();
		}
		if (getProductDescription() != null) {
			_hashCode += getProductDescription().hashCode();
		}
		if (getProductId() != null) {
			_hashCode += getProductId().hashCode();
		}
		if (getProductInventoryId() != null) {
			_hashCode += getProductInventoryId().hashCode();
		}
		if (getProductName() != null) {
			_hashCode += getProductName().hashCode();
		}
		if (getProductPartNumber() != null) {
			_hashCode += getProductPartNumber().hashCode();
		}
		if (getProductPortId() != null) {
			_hashCode += getProductPortId().hashCode();
		}
		if (getProductPrimaryProductLine() != null) {
			_hashCode += getProductPrimaryProductLine().hashCode();
		}
		if (getProductPrimaryProductLineId() != null) {
			_hashCode += getProductPrimaryProductLineId().hashCode();
		}
		if (getProductSPNDefinitionId() != null) {
			_hashCode += getProductSPNDefinitionId().hashCode();
		}
		if (getProductSerializedFlag() != null) {
			_hashCode += getProductSerializedFlag().hashCode();
		}
		if (getProductType() != null) {
			_hashCode += getProductType().hashCode();
		}
		if (getProductVersion() != null) {
			_hashCode += getProductVersion().hashCode();
		}
		if (getProductXAClassId() != null) {
			_hashCode += getProductXAClassId().hashCode();
		}
		if (getPurchaseDate2() != null) {
			_hashCode += getPurchaseDate2().hashCode();
		}
		if (getPurchaseLocationDescription() != null) {
			_hashCode += getPurchaseLocationDescription().hashCode();
		}
		if (getQuantity() != null) {
			_hashCode += getQuantity().hashCode();
		}
		if (getReferenceFlag() != null) {
			_hashCode += getReferenceFlag().hashCode();
		}
		if (getReferenceNumber2() != null) {
			_hashCode += getReferenceNumber2().hashCode();
		}
		if (getReferenceNumber3() != null) {
			_hashCode += getReferenceNumber3().hashCode();
		}
		if (getRegisteredDate() != null) {
			_hashCode += getRegisteredDate().hashCode();
		}
		if (getReplacementValue() != null) {
			_hashCode += getReplacementValue().hashCode();
		}
		if (getRootAssetId() != null) {
			_hashCode += getRootAssetId().hashCode();
		}
		if (getRootAssetNumber() != null) {
			_hashCode += getRootAssetNumber().hashCode();
		}
		if (getRootAssetServiceAccountId() != null) {
			_hashCode += getRootAssetServiceAccountId().hashCode();
		}
		if (getRootCfgType() != null) {
			_hashCode += getRootCfgType().hashCode();
		}
		if (getRootIntegrationId() != null) {
			_hashCode += getRootIntegrationId().hashCode();
		}
		if (getRootProductDefTypeCode() != null) {
			_hashCode += getRootProductDefTypeCode().hashCode();
		}
		if (getRootProductId() != null) {
			_hashCode += getRootProductId().hashCode();
		}
		if (getSerialNumber() != null) {
			_hashCode += getSerialNumber().hashCode();
		}
		if (getSerialNumberVerifiedFlag() != null) {
			_hashCode += getSerialNumberVerifiedFlag().hashCode();
		}
		if (getServiceAccount() != null) {
			_hashCode += getServiceAccount().hashCode();
		}
		if (getServiceAccountId() != null) {
			_hashCode += getServiceAccountId().hashCode();
		}
		if (getServiceAddress() != null) {
			_hashCode += getServiceAddress().hashCode();
		}
		if (getServiceAddressId() != null) {
			_hashCode += getServiceAddressId().hashCode();
		}
		if (getServiceLength() != null) {
			_hashCode += getServiceLength().hashCode();
		}
		if (getServiceLengthUoM() != null) {
			_hashCode += getServiceLengthUoM().hashCode();
		}
		if (getServicePointId() != null) {
			_hashCode += getServicePointId().hashCode();
		}
		if (getServicePointSerialNumber() != null) {
			_hashCode += getServicePointSerialNumber().hashCode();
		}
		if (getServiceType() != null) {
			_hashCode += getServiceType().hashCode();
		}
		if (getShipDate() != null) {
			_hashCode += getShipDate().hashCode();
		}
		if (getSmartPartNumber() != null) {
			_hashCode += getSmartPartNumber().hashCode();
		}
		if (getStartDate() != null) {
			_hashCode += getStartDate().hashCode();
		}
		if (getStatus() != null) {
			_hashCode += getStatus().hashCode();
		}
		if (getToCLLI() != null) {
			_hashCode += getToCLLI().hashCode();
		}
		if (getToNode() != null) {
			_hashCode += getToNode().hashCode();
		}
		if (getToPortNumber() != null) {
			_hashCode += getToPortNumber().hashCode();
		}
		if (getToPrefix() != null) {
			_hashCode += getToPrefix().hashCode();
		}
		if (getToServiceAccount() != null) {
			_hashCode += getToServiceAccount().hashCode();
		}
		if (getToServiceAccountId() != null) {
			_hashCode += getToServiceAccountId().hashCode();
		}
		if (getToServiceAddress() != null) {
			_hashCode += getToServiceAddress().hashCode();
		}
		if (getToServiceAddressId() != null) {
			_hashCode += getToServiceAddressId().hashCode();
		}
		if (getToServicePoint() != null) {
			_hashCode += getToServicePoint().hashCode();
		}
		if (getToServicePointId() != null) {
			_hashCode += getToServicePointId().hashCode();
		}
		if (getUnitofMeasure3() != null) {
			_hashCode += getUnitofMeasure3().hashCode();
		}
		if (getValueBasis() != null) {
			_hashCode += getValueBasis().hashCode();
		}
		if (getVersion() != null) {
			_hashCode += getVersion().hashCode();
		}
		if (getWarrantyEndDate() != null) {
			_hashCode += getWarrantyEndDate().hashCode();
		}
		if (getWarrantyStartDate() != null) {
			_hashCode += getWarrantyStartDate().hashCode();
		}
		if (getWarrantyType() != null) {
			_hashCode += getWarrantyType().hashCode();
		}
		if (getAssetMgmtAssetOrderMgmt() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAssetMgmtAssetOrderMgmt()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAssetMgmtAssetOrderMgmt(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getOperation() != null) {
			_hashCode += getOperation().hashCode();
		}
		if (getSearchspec() != null) {
			_hashCode += getSearchspec().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AssetMgmtAssetOrderMgmt.class, true);

	static {
		typeDesc.setXmlType(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetMgmt-AssetOrderMgmt"));
		org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
		attrField.setFieldName("operation");
		attrField.setXmlName(new javax.xml.namespace.QName("", "Operation"));
		attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		typeDesc.addFieldDesc(attrField);
		attrField = new org.apache.axis.description.AttributeDesc();
		attrField.setFieldName("searchspec");
		attrField.setXmlName(new javax.xml.namespace.QName("", "Searchspec"));
		attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		typeDesc.addFieldDesc(attrField);
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("id");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Id"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("created");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Created"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createdBy");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CreatedBy"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("updated");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Updated"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("updatedBy");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "UpdatedBy"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("conflictId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ConflictId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("modId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ModId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryAddress");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountPrimaryAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryAddressId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountPrimaryAddressId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryAddressLine2");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account",
				"AccountPrimaryAddressLine2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryCity");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountPrimaryCity"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryCountry");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountPrimaryCountry"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryServiceAgreementId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account",
				"AccountPrimaryServiceAgreementId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryState");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountPrimaryState"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountPrimaryZip");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountPrimaryZip"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("accountingMethod");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AccountingMethod"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("adjustedListPrice");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AdjustedListPrice"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("agreementId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AgreementId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("agreementName");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AgreementName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetCurrencyCode");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetCurrencyCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetDescription");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetDescription"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetValue");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetValue"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetValueExchangeDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetValueExchangeDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("basePrice");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "BasePrice"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("billingAccount");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "BillingAccount"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("billingAccountId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "BillingAccountId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("billingProfileId2");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "BillingProfileId2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("billingProfileName");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "BillingProfileName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("billingType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "BillingType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("build");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Build"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("CLLI");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CLLI"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cfgStateCode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CfgStateCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cfgType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CfgType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("comments");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Comments"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("compoundProductFlag");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CompoundProductFlag"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("compoundProductNumber");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CompoundProductNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("condition");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Condition"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("convertToAssetFlag");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ConvertToAssetFlag"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("costListId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CostListId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("currencyCode2");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CurrencyCode2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("customizableFlag");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "CustomizableFlag"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("effectiveEndDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "EffectiveEndDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("exchangeDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ExchangeDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extendedQuantity");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ExtendedQuantity"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("installDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "InstallDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("integrationId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "IntegrationId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("inventoryLocationId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "InventoryLocationId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("licenseNumber");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "LicenseNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("meterCount");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "MeterCount"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mfgDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "MfgDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Name"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("networkElementType");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "NetworkElementType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("node");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Node"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("operatingStatus");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OperatingStatus"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organization");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Organization"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organizationId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OrganizationId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organizationalUnitAddressId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account",
				"OrganizationalUnitAddressId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("originalCost");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OriginalCost"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("originalOrderId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OriginalOrderId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("owner");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Owner"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ownerAccountId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OwnerAccountId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ownerAssetNumber");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OwnerAssetNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ownerContactId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OwnerContactId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ownerFirstName");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OwnerFirstName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ownerLastName");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "OwnerLastName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("ownership");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Ownership"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parentAssetId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ParentAssetId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("paymentType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PaymentType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("personalAddressId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PersonalAddressId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PortNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prefix");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Prefix"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryBillingProfileId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryBillingProfileId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryContactId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryContactId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryEmployeeId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryEmployeeId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryOrganizationId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryOrganizationId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryPositionId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryPositionId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryWarrantyCoverageId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryWarrantyCoverageId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryWarrantyEndDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryWarrantyEndDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryWarrantyStartDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryWarrantyStartDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryWarrantyType");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryWarrantyType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryWarranyId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PrimaryWarranyId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prodItemId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProdItemId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prodPromId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProdPromId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prodPromInstanceId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProdPromInstanceId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prodPromName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProdPromName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prodPromRuleId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProdPromRuleId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("prodPromSourceId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProdPromSourceId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productBuild");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductBuild"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productDefTypeCode");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductDefTypeCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productDescription");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductDescription"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productInventoryId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductInventoryId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productName");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductName"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productPartNumber");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductPartNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productPortId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductPortId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productPrimaryProductLine");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductPrimaryProductLine"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productPrimaryProductLineId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account",
				"ProductPrimaryProductLineId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productSPNDefinitionId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductSPNDefinitionId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productSerializedFlag");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductSerializedFlag"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productVersion");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductVersion"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("productXAClassId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ProductXAClassId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("purchaseDate2");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "PurchaseDate2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("purchaseLocationDescription");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account",
				"PurchaseLocationDescription"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("quantity");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Quantity"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("referenceFlag");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ReferenceFlag"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("referenceNumber2");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ReferenceNumber2"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("referenceNumber3");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ReferenceNumber3"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("registeredDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RegisteredDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("replacementValue");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ReplacementValue"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootAssetId");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootAssetId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootAssetNumber");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootAssetNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootAssetServiceAccountId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootAssetServiceAccountId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootCfgType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootCfgType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootIntegrationId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootIntegrationId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootProductDefTypeCode");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootProductDefTypeCode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rootProductId");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "RootProductId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serialNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "SerialNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serialNumberVerifiedFlag");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "SerialNumberVerifiedFlag"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceAccount");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceAccount"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceAccountId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceAccountId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceAddress");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceAddressId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceAddressId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceLength");
		elemField
				.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceLength"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceLengthUoM");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceLengthUoM"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("servicePointId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServicePointId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("servicePointSerialNumber");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServicePointSerialNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("serviceType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ServiceType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("shipDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ShipDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("smartPartNumber");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "SmartPartNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startDate");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "StartDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("status");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Status"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toCLLI");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToCLLI"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toNode");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToNode"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toPortNumber");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToPortNumber"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toPrefix");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToPrefix"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toServiceAccount");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToServiceAccount"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toServiceAccountId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToServiceAccountId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toServiceAddress");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToServiceAddress"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toServiceAddressId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToServiceAddressId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toServicePoint");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToServicePoint"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("toServicePointId");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ToServicePointId"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("unitofMeasure3");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "UnitofMeasure3"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("valueBasis");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "ValueBasis"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("version");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "Version"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("warrantyEndDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "WarrantyEndDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("warrantyStartDate");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "WarrantyStartDate"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("warrantyType");
		elemField.setXmlName(new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "WarrantyType"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assetMgmtAssetOrderMgmt");
		elemField.setXmlName(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetMgmt-AssetOrderMgmt"));
		elemField.setXmlType(
				new javax.xml.namespace.QName("http://www.siebel.com/xml/Base%20Account", "AssetMgmt-AssetOrderMgmt"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
