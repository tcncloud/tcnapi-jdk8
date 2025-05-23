// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface PaymentLinkEnrichmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.PaymentLinkEnrichment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string fields = 1 [json_name = "fields", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.fields is deprecated.
   *     See api/v0alpha/lms.proto;l=1356
   * @return A list containing the fields.
   */
  @java.lang.Deprecated java.util.List<java.lang.String>
      getFieldsList();
  /**
   * <code>repeated string fields = 1 [json_name = "fields", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.fields is deprecated.
   *     See api/v0alpha/lms.proto;l=1356
   * @return The count of fields.
   */
  @java.lang.Deprecated int getFieldsCount();
  /**
   * <code>repeated string fields = 1 [json_name = "fields", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.fields is deprecated.
   *     See api/v0alpha/lms.proto;l=1356
   * @param index The index of the element to return.
   * @return The fields at the given index.
   */
  @java.lang.Deprecated java.lang.String getFields(int index);
  /**
   * <code>repeated string fields = 1 [json_name = "fields", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.fields is deprecated.
   *     See api/v0alpha/lms.proto;l=1356
   * @param index The index of the value to return.
   * @return The bytes of the fields at the given index.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getFieldsBytes(int index);

  /**
   * <code>string payment_link_config_id = 2 [json_name = "paymentLinkConfigId", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.payment_link_config_id is deprecated.
   *     See api/v0alpha/lms.proto;l=1357
   * @return The paymentLinkConfigId.
   */
  @java.lang.Deprecated java.lang.String getPaymentLinkConfigId();
  /**
   * <code>string payment_link_config_id = 2 [json_name = "paymentLinkConfigId", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.payment_link_config_id is deprecated.
   *     See api/v0alpha/lms.proto;l=1357
   * @return The bytes for paymentLinkConfigId.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getPaymentLinkConfigIdBytes();

  /**
   * <pre>
   * if true, we will not generate a link for lms records that to not contain *all* of the fields.
   * instead we will move that record to the discards
   * </pre>
   *
   * <code>bool discard_on_missing_fields = 3 [json_name = "discardOnMissingFields", deprecated = true];</code>
   * @deprecated api.v0alpha.PaymentLinkEnrichment.discard_on_missing_fields is deprecated.
   *     See api/v0alpha/lms.proto;l=1360
   * @return The discardOnMissingFields.
   */
  @java.lang.Deprecated boolean getDiscardOnMissingFields();

  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 4 [json_name = "keyMap"];</code>
   */
  int getKeyMapCount();
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 4 [json_name = "keyMap"];</code>
   */
  boolean containsKeyMap(
      java.lang.String key);
  /**
   * Use {@link #getKeyMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getKeyMap();
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 4 [json_name = "keyMap"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getKeyMapMap();
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 4 [json_name = "keyMap"];</code>
   */
  /* nullable */
java.lang.String getKeyMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 4 [json_name = "keyMap"];</code>
   */
  java.lang.String getKeyMapOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * the portal that these links will belong to.
   * </pre>
   *
   * <code>string portal_id = 5 [json_name = "portalId"];</code>
   * @return The portalId.
   */
  java.lang.String getPortalId();
  /**
   * <pre>
   * the portal that these links will belong to.
   * </pre>
   *
   * <code>string portal_id = 5 [json_name = "portalId"];</code>
   * @return The bytes for portalId.
   */
  com.google.protobuf.ByteString
      getPortalIdBytes();
}
