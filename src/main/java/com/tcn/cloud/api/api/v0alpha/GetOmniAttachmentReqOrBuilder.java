// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

public interface GetOmniAttachmentReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.GetOmniAttachmentReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * flag to include attachment download url or not
   * </pre>
   *
   * <code>bool include_download_url = 1 [json_name = "includeDownloadUrl"];</code>
   * @return The includeDownloadUrl.
   */
  boolean getIncludeDownloadUrl();

  /**
   * <pre>
   * filter by attachment sid
   * </pre>
   *
   * <code>.api.v0alpha.GetOmniAttachmentReq.ByOmniAttachmentSid by_omni_attachment_sid = 100 [json_name = "byOmniAttachmentSid"];</code>
   * @return Whether the byOmniAttachmentSid field is set.
   */
  boolean hasByOmniAttachmentSid();
  /**
   * <pre>
   * filter by attachment sid
   * </pre>
   *
   * <code>.api.v0alpha.GetOmniAttachmentReq.ByOmniAttachmentSid by_omni_attachment_sid = 100 [json_name = "byOmniAttachmentSid"];</code>
   * @return The byOmniAttachmentSid.
   */
  com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq.ByOmniAttachmentSid getByOmniAttachmentSid();
  /**
   * <pre>
   * filter by attachment sid
   * </pre>
   *
   * <code>.api.v0alpha.GetOmniAttachmentReq.ByOmniAttachmentSid by_omni_attachment_sid = 100 [json_name = "byOmniAttachmentSid"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq.ByOmniAttachmentSidOrBuilder getByOmniAttachmentSidOrBuilder();

  com.tcn.cloud.api.api.v0alpha.GetOmniAttachmentReq.FilterCase getFilterCase();
}
