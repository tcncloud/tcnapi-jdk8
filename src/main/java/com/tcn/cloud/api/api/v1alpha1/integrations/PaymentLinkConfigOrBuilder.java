// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface PaymentLinkConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.PaymentLinkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the pk of payment_link_config table that contains method we will be creating links for
   * </pre>
   *
   * <code>string id = 19 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * the pk of payment_link_config table that contains method we will be creating links for
   * </pre>
   *
   * <code>string id = 19 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * the journey collection that will enrich the link data
   * </pre>
   *
   * <code>string collection_id = 5 [json_name = "collectionId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.collection_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=801
   * @return The collectionId.
   */
  @java.lang.Deprecated java.lang.String getCollectionId();
  /**
   * <pre>
   * the journey collection that will enrich the link data
   * </pre>
   *
   * <code>string collection_id = 5 [json_name = "collectionId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.collection_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=801
   * @return The bytes for collectionId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * which integration will be used in the links
   * </pre>
   *
   * <code>.api.commons.integrations.IntegrationType integration_id = 6 [json_name = "integrationId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.integration_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=803
   * @return The enum numeric value on the wire for integrationId.
   */
  @java.lang.Deprecated int getIntegrationIdValue();
  /**
   * <pre>
   * which integration will be used in the links
   * </pre>
   *
   * <code>.api.commons.integrations.IntegrationType integration_id = 6 [json_name = "integrationId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.integration_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=803
   * @return The integrationId.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.integrations.IntegrationType getIntegrationId();

  /**
   * <pre>
   * the verification method. This is used if there is no collection_id to enrich link data
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod verification_method_id = 7 [json_name = "verificationMethodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.verification_method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=805
   * @return The enum numeric value on the wire for verificationMethodId.
   */
  @java.lang.Deprecated int getVerificationMethodIdValue();
  /**
   * <pre>
   * the verification method. This is used if there is no collection_id to enrich link data
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod verification_method_id = 7 [json_name = "verificationMethodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.verification_method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=805
   * @return The verificationMethodId.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.integrations.RequestMethod getVerificationMethodId();

  /**
   * <code>.api.commons.integrations.RequestMethod invoice_method_id = 8 [json_name = "invoiceMethodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.invoice_method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=806
   * @return The enum numeric value on the wire for invoiceMethodId.
   */
  @java.lang.Deprecated int getInvoiceMethodIdValue();
  /**
   * <code>.api.commons.integrations.RequestMethod invoice_method_id = 8 [json_name = "invoiceMethodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.invoice_method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=806
   * @return The invoiceMethodId.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.integrations.RequestMethod getInvoiceMethodId();

  /**
   * <pre>
   * which method will be called when a payment portal link is process
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod payment_method_id = 9 [json_name = "paymentMethodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.payment_method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=808
   * @return The enum numeric value on the wire for paymentMethodId.
   */
  @java.lang.Deprecated int getPaymentMethodIdValue();
  /**
   * <pre>
   * which method will be called when a payment portal link is process
   * </pre>
   *
   * <code>.api.commons.integrations.RequestMethod payment_method_id = 9 [json_name = "paymentMethodId", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.payment_method_id is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=808
   * @return The paymentMethodId.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.integrations.RequestMethod getPaymentMethodId();

  /**
   * <pre>
   * journey names and method parameter names might not match one to one
   * the keys of this mapping are journey keys
   * the values are method parameter name the key maps to
   * if we encounter a key that is unknown for the method, integrations checks the name mapping
   * for an alternative key name
   * </pre>
   *
   * <code>map&lt;string, string&gt; name_mapping = 10 [json_name = "nameMapping"];</code>
   */
  int getNameMappingCount();
  /**
   * <pre>
   * journey names and method parameter names might not match one to one
   * the keys of this mapping are journey keys
   * the values are method parameter name the key maps to
   * if we encounter a key that is unknown for the method, integrations checks the name mapping
   * for an alternative key name
   * </pre>
   *
   * <code>map&lt;string, string&gt; name_mapping = 10 [json_name = "nameMapping"];</code>
   */
  boolean containsNameMapping(
      java.lang.String key);
  /**
   * Use {@link #getNameMappingMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getNameMapping();
  /**
   * <pre>
   * journey names and method parameter names might not match one to one
   * the keys of this mapping are journey keys
   * the values are method parameter name the key maps to
   * if we encounter a key that is unknown for the method, integrations checks the name mapping
   * for an alternative key name
   * </pre>
   *
   * <code>map&lt;string, string&gt; name_mapping = 10 [json_name = "nameMapping"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getNameMappingMap();
  /**
   * <pre>
   * journey names and method parameter names might not match one to one
   * the keys of this mapping are journey keys
   * the values are method parameter name the key maps to
   * if we encounter a key that is unknown for the method, integrations checks the name mapping
   * for an alternative key name
   * </pre>
   *
   * <code>map&lt;string, string&gt; name_mapping = 10 [json_name = "nameMapping"];</code>
   */
  /* nullable */
java.lang.String getNameMappingOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * journey names and method parameter names might not match one to one
   * the keys of this mapping are journey keys
   * the values are method parameter name the key maps to
   * if we encounter a key that is unknown for the method, integrations checks the name mapping
   * for an alternative key name
   * </pre>
   *
   * <code>map&lt;string, string&gt; name_mapping = 10 [json_name = "nameMapping"];</code>
   */
  java.lang.String getNameMappingOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * these fields will be used to verify customer identity
   * </pre>
   *
   * <code>repeated string verification_fields = 11 [json_name = "verificationFields", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.verification_fields is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=816
   * @return A list containing the verificationFields.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getVerificationFieldsList();
  /**
   * <pre>
   * these fields will be used to verify customer identity
   * </pre>
   *
   * <code>repeated string verification_fields = 11 [json_name = "verificationFields", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.verification_fields is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=816
   * @return The count of verificationFields.
   */
  @java.lang.Deprecated int getVerificationFieldsCount();
  /**
   * <pre>
   * these fields will be used to verify customer identity
   * </pre>
   *
   * <code>repeated string verification_fields = 11 [json_name = "verificationFields", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.verification_fields is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=816
   * @param index The index of the element to return.
   * @return The verificationFields at the given index.
   */
  @java.lang.Deprecated java.lang.String getVerificationFields(int index);
  /**
   * <pre>
   * these fields will be used to verify customer identity
   * </pre>
   *
   * <code>repeated string verification_fields = 11 [json_name = "verificationFields", deprecated = true];</code>
   * @deprecated api.v1alpha1.integrations.PaymentLinkConfig.verification_fields is deprecated.
   *     See api/v1alpha1/integrations/service.proto;l=816
   * @param index The index of the value to return.
   * @return The bytes of the verificationFields at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getVerificationFieldsBytes(int index);

  /**
   * <pre>
   * name of the payment portal config that contains all the details for a payment portal screen shown to the user.
   * (visible to link receiver)
   * these don't affect usability of the service, meaning the backend doesn't require any of this info
   * </pre>
   *
   * <code>string payment_portal_id = 12 [json_name = "paymentPortalId"];</code>
   * @return The paymentPortalId.
   */
  java.lang.String getPaymentPortalId();
  /**
   * <pre>
   * name of the payment portal config that contains all the details for a payment portal screen shown to the user.
   * (visible to link receiver)
   * these don't affect usability of the service, meaning the backend doesn't require any of this info
   * </pre>
   *
   * <code>string payment_portal_id = 12 [json_name = "paymentPortalId"];</code>
   * @return The bytes for paymentPortalId.
   */
  com.google.protobuf.ByteString
      getPaymentPortalIdBytes();

  /**
   * <code>.google.protobuf.Timestamp created_on = 14 [json_name = "createdOn"];</code>
   * @return Whether the createdOn field is set.
   */
  boolean hasCreatedOn();
  /**
   * <code>.google.protobuf.Timestamp created_on = 14 [json_name = "createdOn"];</code>
   * @return The createdOn.
   */
  com.google.protobuf.Timestamp getCreatedOn();
  /**
   * <code>.google.protobuf.Timestamp created_on = 14 [json_name = "createdOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOnOrBuilder();

  /**
   * <pre>
   * how many days till link expires
   * </pre>
   *
   * <code>int32 expiry_days = 15 [json_name = "expiryDays"];</code>
   * @return The expiryDays.
   */
  int getExpiryDays();

  /**
   * <pre>
   * whether we are allowed to refresh links
   * </pre>
   *
   * <code>bool links_refreshable = 16 [json_name = "linksRefreshable"];</code>
   * @return The linksRefreshable.
   */
  boolean getLinksRefreshable();

  /**
   * <pre>
   * how many hours a refreshed link is good for
   * 24 == 1 day
   * 2.5 == 2 hours 30 minutes
   * defaults to 1.0
   * </pre>
   *
   * <code>double refresh_link_valid_hours = 17 [json_name = "refreshLinkValidHours"];</code>
   * @return The refreshLinkValidHours.
   */
  double getRefreshLinkValidHours();

  /**
   * <pre>
   * how many times we will allow a link to refresh
   * </pre>
   *
   * <code>int32 max_refresh_times = 18 [json_name = "maxRefreshTimes"];</code>
   * @return The maxRefreshTimes.
   */
  int getMaxRefreshTimes();

  /**
   * <pre>
   * how we identify the link holder's identity.
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.VerificationRequest verification_request = 20 [json_name = "verificationRequest"];</code>
   * @return Whether the verificationRequest field is set.
   */
  boolean hasVerificationRequest();
  /**
   * <pre>
   * how we identify the link holder's identity.
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.VerificationRequest verification_request = 20 [json_name = "verificationRequest"];</code>
   * @return The verificationRequest.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.VerificationRequest getVerificationRequest();
  /**
   * <pre>
   * how we identify the link holder's identity.
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.VerificationRequest verification_request = 20 [json_name = "verificationRequest"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.VerificationRequestOrBuilder getVerificationRequestOrBuilder();

  /**
   * <pre>
   * happens directly after the verification request to provide the user a description of the items
   * that need payment, and their amounts
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.InvoiceRequest invoice_request = 21 [json_name = "invoiceRequest"];</code>
   * @return Whether the invoiceRequest field is set.
   */
  boolean hasInvoiceRequest();
  /**
   * <pre>
   * happens directly after the verification request to provide the user a description of the items
   * that need payment, and their amounts
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.InvoiceRequest invoice_request = 21 [json_name = "invoiceRequest"];</code>
   * @return The invoiceRequest.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.InvoiceRequest getInvoiceRequest();
  /**
   * <pre>
   * happens directly after the verification request to provide the user a description of the items
   * that need payment, and their amounts
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.InvoiceRequest invoice_request = 21 [json_name = "invoiceRequest"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.InvoiceRequestOrBuilder getInvoiceRequestOrBuilder();

  /**
   * <pre>
   * the set of payments the user can choose from. A valid config needs at least one,
   * but can list as many as they want for the user to pick from.
   * only one PaymentRequest will be processed
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.PaymentRequest payment_requests = 22 [json_name = "paymentRequests"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.PaymentRequest> 
      getPaymentRequestsList();
  /**
   * <pre>
   * the set of payments the user can choose from. A valid config needs at least one,
   * but can list as many as they want for the user to pick from.
   * only one PaymentRequest will be processed
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.PaymentRequest payment_requests = 22 [json_name = "paymentRequests"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PaymentRequest getPaymentRequests(int index);
  /**
   * <pre>
   * the set of payments the user can choose from. A valid config needs at least one,
   * but can list as many as they want for the user to pick from.
   * only one PaymentRequest will be processed
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.PaymentRequest payment_requests = 22 [json_name = "paymentRequests"];</code>
   */
  int getPaymentRequestsCount();
  /**
   * <pre>
   * the set of payments the user can choose from. A valid config needs at least one,
   * but can list as many as they want for the user to pick from.
   * only one PaymentRequest will be processed
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.PaymentRequest payment_requests = 22 [json_name = "paymentRequests"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.PaymentRequestOrBuilder> 
      getPaymentRequestsOrBuilderList();
  /**
   * <pre>
   * the set of payments the user can choose from. A valid config needs at least one,
   * but can list as many as they want for the user to pick from.
   * only one PaymentRequest will be processed
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.PaymentRequest payment_requests = 22 [json_name = "paymentRequests"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PaymentRequestOrBuilder getPaymentRequestsOrBuilder(
      int index);

  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; base_data = 23 [json_name = "baseData"];</code>
   */
  int getBaseDataCount();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; base_data = 23 [json_name = "baseData"];</code>
   */
  boolean containsBaseData(
      java.lang.String key);
  /**
   * Use {@link #getBaseDataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getBaseData();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; base_data = 23 [json_name = "baseData"];</code>
   */
  java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  getBaseDataMap();
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; base_data = 23 [json_name = "baseData"];</code>
   */
  /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getBaseDataOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue);
  /**
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; base_data = 23 [json_name = "baseData"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.Value getBaseDataOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * a marshalled PaymentTemplates proto message
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.PaymentLinkConfigTemplates templates = 24 [json_name = "templates"];</code>
   * @return Whether the templates field is set.
   */
  boolean hasTemplates();
  /**
   * <pre>
   * a marshalled PaymentTemplates proto message
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.PaymentLinkConfigTemplates templates = 24 [json_name = "templates"];</code>
   * @return The templates.
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PaymentLinkConfigTemplates getTemplates();
  /**
   * <pre>
   * a marshalled PaymentTemplates proto message
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.PaymentLinkConfigTemplates templates = 24 [json_name = "templates"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.PaymentLinkConfigTemplatesOrBuilder getTemplatesOrBuilder();

  /**
   * <pre>
   * the name of the profile used to generate this profile
   * </pre>
   *
   * <code>string payment_profile_name = 25 [json_name = "paymentProfileName"];</code>
   * @return The paymentProfileName.
   */
  java.lang.String getPaymentProfileName();
  /**
   * <pre>
   * the name of the profile used to generate this profile
   * </pre>
   *
   * <code>string payment_profile_name = 25 [json_name = "paymentProfileName"];</code>
   * @return The bytes for paymentProfileName.
   */
  com.google.protobuf.ByteString
      getPaymentProfileNameBytes();
}
