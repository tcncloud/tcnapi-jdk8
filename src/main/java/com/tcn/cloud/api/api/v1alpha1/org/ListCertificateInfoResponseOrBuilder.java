// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/preferences.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public interface ListCertificateInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.org.ListCertificateInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.CertificateInfo> 
      getCertificateInfoListList();
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  com.tcn.cloud.api.api.commons.org.CertificateInfo getCertificateInfoList(int index);
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  int getCertificateInfoListCount();
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder> 
      getCertificateInfoListOrBuilderList();
  /**
   * <pre>
   * The list of certificate info.
   * </pre>
   *
   * <code>repeated .api.commons.org.CertificateInfo certificate_info_list = 1 [json_name = "certificateInfoList"];</code>
   */
  com.tcn.cloud.api.api.commons.org.CertificateInfoOrBuilder getCertificateInfoListOrBuilder(
      int index);
}
