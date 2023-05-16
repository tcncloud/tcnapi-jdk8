// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/public/integrations.proto

package com.tcn.cloud.api.api.commons.public;

public interface VerificationFlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.public.VerificationFlow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string plugin_instance_id = 1 [json_name = "pluginInstanceId"];</code>
   * @return The pluginInstanceId.
   */
  java.lang.String getPluginInstanceId();
  /**
   * <code>string plugin_instance_id = 1 [json_name = "pluginInstanceId"];</code>
   * @return The bytes for pluginInstanceId.
   */
  com.google.protobuf.ByteString
      getPluginInstanceIdBytes();

  /**
   * <code>.api.commons.public.VerificationExperianQueryBalance experian_query_balance = 2 [json_name = "experianQueryBalance"];</code>
   * @return Whether the experianQueryBalance field is set.
   */
  boolean hasExperianQueryBalance();
  /**
   * <code>.api.commons.public.VerificationExperianQueryBalance experian_query_balance = 2 [json_name = "experianQueryBalance"];</code>
   * @return The experianQueryBalance.
   */
  com.tcn.cloud.api.api.commons.public.VerificationExperianQueryBalance getExperianQueryBalance();
  /**
   * <code>.api.commons.public.VerificationExperianQueryBalance experian_query_balance = 2 [json_name = "experianQueryBalance"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationExperianQueryBalanceOrBuilder getExperianQueryBalanceOrBuilder();

  /**
   * <code>.api.commons.public.VerificationExperianLinkData experian_link_data = 3 [json_name = "experianLinkData"];</code>
   * @return Whether the experianLinkData field is set.
   */
  boolean hasExperianLinkData();
  /**
   * <code>.api.commons.public.VerificationExperianLinkData experian_link_data = 3 [json_name = "experianLinkData"];</code>
   * @return The experianLinkData.
   */
  com.tcn.cloud.api.api.commons.public.VerificationExperianLinkData getExperianLinkData();
  /**
   * <code>.api.commons.public.VerificationExperianLinkData experian_link_data = 3 [json_name = "experianLinkData"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationExperianLinkDataOrBuilder getExperianLinkDataOrBuilder();

  /**
   * <code>.api.commons.public.VerificationExperianZipDob experian_zip_dob = 4 [json_name = "experianZipDob"];</code>
   * @return Whether the experianZipDob field is set.
   */
  boolean hasExperianZipDob();
  /**
   * <code>.api.commons.public.VerificationExperianZipDob experian_zip_dob = 4 [json_name = "experianZipDob"];</code>
   * @return The experianZipDob.
   */
  com.tcn.cloud.api.api.commons.public.VerificationExperianZipDob getExperianZipDob();
  /**
   * <code>.api.commons.public.VerificationExperianZipDob experian_zip_dob = 4 [json_name = "experianZipDob"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationExperianZipDobOrBuilder getExperianZipDobOrBuilder();

  /**
   * <code>.api.commons.public.VerificationAuthorizeNetCustomerProfile authorize_net_customer_profile = 6 [json_name = "authorizeNetCustomerProfile"];</code>
   * @return Whether the authorizeNetCustomerProfile field is set.
   */
  boolean hasAuthorizeNetCustomerProfile();
  /**
   * <code>.api.commons.public.VerificationAuthorizeNetCustomerProfile authorize_net_customer_profile = 6 [json_name = "authorizeNetCustomerProfile"];</code>
   * @return The authorizeNetCustomerProfile.
   */
  com.tcn.cloud.api.api.commons.public.VerificationAuthorizeNetCustomerProfile getAuthorizeNetCustomerProfile();
  /**
   * <code>.api.commons.public.VerificationAuthorizeNetCustomerProfile authorize_net_customer_profile = 6 [json_name = "authorizeNetCustomerProfile"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationAuthorizeNetCustomerProfileOrBuilder getAuthorizeNetCustomerProfileOrBuilder();

  /**
   * <code>.api.commons.public.VerificationAuthorizeNetLinkData authorize_net_link_data = 7 [json_name = "authorizeNetLinkData"];</code>
   * @return Whether the authorizeNetLinkData field is set.
   */
  boolean hasAuthorizeNetLinkData();
  /**
   * <code>.api.commons.public.VerificationAuthorizeNetLinkData authorize_net_link_data = 7 [json_name = "authorizeNetLinkData"];</code>
   * @return The authorizeNetLinkData.
   */
  com.tcn.cloud.api.api.commons.public.VerificationAuthorizeNetLinkData getAuthorizeNetLinkData();
  /**
   * <code>.api.commons.public.VerificationAuthorizeNetLinkData authorize_net_link_data = 7 [json_name = "authorizeNetLinkData"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationAuthorizeNetLinkDataOrBuilder getAuthorizeNetLinkDataOrBuilder();

  /**
   * <code>.api.commons.public.VerificationJourney journey = 12 [json_name = "journey"];</code>
   * @return Whether the journey field is set.
   */
  boolean hasJourney();
  /**
   * <code>.api.commons.public.VerificationJourney journey = 12 [json_name = "journey"];</code>
   * @return The journey.
   */
  com.tcn.cloud.api.api.commons.public.VerificationJourney getJourney();
  /**
   * <code>.api.commons.public.VerificationJourney journey = 12 [json_name = "journey"];</code>
   */
  com.tcn.cloud.api.api.commons.public.VerificationJourneyOrBuilder getJourneyOrBuilder();

  /**
   * <pre>
   * the fields the user must verify for this flow.
   * must conform to the list of fields returned from the flow
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition verification_fields = 20 [json_name = "verificationFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.public.FieldDefinition> 
      getVerificationFieldsList();
  /**
   * <pre>
   * the fields the user must verify for this flow.
   * must conform to the list of fields returned from the flow
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition verification_fields = 20 [json_name = "verificationFields"];</code>
   */
  com.tcn.cloud.api.api.commons.public.FieldDefinition getVerificationFields(int index);
  /**
   * <pre>
   * the fields the user must verify for this flow.
   * must conform to the list of fields returned from the flow
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition verification_fields = 20 [json_name = "verificationFields"];</code>
   */
  int getVerificationFieldsCount();
  /**
   * <pre>
   * the fields the user must verify for this flow.
   * must conform to the list of fields returned from the flow
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition verification_fields = 20 [json_name = "verificationFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.public.FieldDefinitionOrBuilder> 
      getVerificationFieldsOrBuilderList();
  /**
   * <pre>
   * the fields the user must verify for this flow.
   * must conform to the list of fields returned from the flow
   * </pre>
   *
   * <code>repeated .api.commons.public.FieldDefinition verification_fields = 20 [json_name = "verificationFields"];</code>
   */
  com.tcn.cloud.api.api.commons.public.FieldDefinitionOrBuilder getVerificationFieldsOrBuilder(
      int index);

  com.tcn.cloud.api.api.commons.public.VerificationFlow.ValueCase getValueCase();
}
