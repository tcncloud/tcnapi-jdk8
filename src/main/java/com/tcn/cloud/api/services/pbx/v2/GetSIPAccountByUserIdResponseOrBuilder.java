// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

public interface GetSIPAccountByUserIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.pbx.v2.GetSIPAccountByUserIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.services.pbx.v2.SIPAccount sip_account = 1 [json_name = "sipAccount"];</code>
   * @return Whether the sipAccount field is set.
   */
  boolean hasSipAccount();
  /**
   * <code>.services.pbx.v2.SIPAccount sip_account = 1 [json_name = "sipAccount"];</code>
   * @return The sipAccount.
   */
  com.tcn.cloud.api.services.pbx.v2.SIPAccount getSipAccount();
  /**
   * <code>.services.pbx.v2.SIPAccount sip_account = 1 [json_name = "sipAccount"];</code>
   */
  com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder getSipAccountOrBuilder();
}
