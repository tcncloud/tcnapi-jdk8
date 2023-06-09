// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/preferences.proto

package com.tcn.cloud.api.api.commons.org;

public interface DialOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.DialOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Standard order enum, (CUSTOM_DIAL_ORDER should not be set here but
   * indicated by setting a CustomDialOrder below).
   * </pre>
   *
   * <code>.api.commons.DialOrderType standard = 1 [json_name = "standard"];</code>
   * @return Whether the standard field is set.
   */
  boolean hasStandard();
  /**
   * <pre>
   * Standard order enum, (CUSTOM_DIAL_ORDER should not be set here but
   * indicated by setting a CustomDialOrder below).
   * </pre>
   *
   * <code>.api.commons.DialOrderType standard = 1 [json_name = "standard"];</code>
   * @return The enum numeric value on the wire for standard.
   */
  int getStandardValue();
  /**
   * <pre>
   * Standard order enum, (CUSTOM_DIAL_ORDER should not be set here but
   * indicated by setting a CustomDialOrder below).
   * </pre>
   *
   * <code>.api.commons.DialOrderType standard = 1 [json_name = "standard"];</code>
   * @return The standard.
   */
  com.tcn.cloud.api.api.commons.DialOrderType getStandard();

  /**
   * <pre>
   * Defines a "Custom Order" using one or more contact field
   * descriptions.
   * </pre>
   *
   * <code>.api.commons.org.CustomDialOrder custom = 2 [json_name = "custom"];</code>
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   * <pre>
   * Defines a "Custom Order" using one or more contact field
   * descriptions.
   * </pre>
   *
   * <code>.api.commons.org.CustomDialOrder custom = 2 [json_name = "custom"];</code>
   * @return The custom.
   */
  com.tcn.cloud.api.api.commons.org.CustomDialOrder getCustom();
  /**
   * <pre>
   * Defines a "Custom Order" using one or more contact field
   * descriptions.
   * </pre>
   *
   * <code>.api.commons.org.CustomDialOrder custom = 2 [json_name = "custom"];</code>
   */
  com.tcn.cloud.api.api.commons.org.CustomDialOrderOrBuilder getCustomOrBuilder();

  com.tcn.cloud.api.api.commons.org.DialOrder.TypeCase getTypeCase();
}
