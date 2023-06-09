// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/permissions.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface GetLicensesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.GetLicensesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.License> 
      getLicensesList();
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  com.tcn.cloud.api.api.commons.org.License getLicenses(int index);
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  int getLicensesCount();
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.LicenseOrBuilder> 
      getLicensesOrBuilderList();
  /**
   * <pre>
   * List of licenses organization is authorized for.
   * </pre>
   *
   * <code>repeated .api.commons.org.License licenses = 1 [json_name = "licenses"];</code>
   */
  com.tcn.cloud.api.api.commons.org.LicenseOrBuilder getLicensesOrBuilder(
      int index);
}
