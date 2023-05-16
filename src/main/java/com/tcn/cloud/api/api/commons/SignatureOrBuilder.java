// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/omnichannel.proto

package com.tcn.cloud.api.api.commons;

public interface SignatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Signature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique identifier for the signature
   * </pre>
   *
   * <code>int64 signature_sid = 1 [json_name = "signatureSid", jstype = JS_STRING];</code>
   * @return The signatureSid.
   */
  long getSignatureSid();

  /**
   * <pre>
   * the signature text
   * </pre>
   *
   * <code>string signature = 2 [json_name = "signature"];</code>
   * @return The signature.
   */
  java.lang.String getSignature();
  /**
   * <pre>
   * the signature text
   * </pre>
   *
   * <code>string signature = 2 [json_name = "signature"];</code>
   * @return The bytes for signature.
   */
  com.google.protobuf.ByteString
      getSignatureBytes();

  /**
   * <pre>
   * when the signature was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  boolean hasDateCreated();
  /**
   * <pre>
   * when the signature was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  com.google.protobuf.Timestamp getDateCreated();
  /**
   * <pre>
   * when the signature was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 3 [json_name = "dateCreated"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder();

  /**
   * <pre>
   * when the signature was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 4 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  boolean hasDateModified();
  /**
   * <pre>
   * when the signature was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 4 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  com.google.protobuf.Timestamp getDateModified();
  /**
   * <pre>
   * when the signature was last updated
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 4 [json_name = "dateModified"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder();

  /**
   * <pre>
   * when the signature was deleted (if ever)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_on = 5 [json_name = "deletedOn"];</code>
   * @return Whether the deletedOn field is set.
   */
  boolean hasDeletedOn();
  /**
   * <pre>
   * when the signature was deleted (if ever)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_on = 5 [json_name = "deletedOn"];</code>
   * @return The deletedOn.
   */
  com.google.protobuf.Timestamp getDeletedOn();
  /**
   * <pre>
   * when the signature was deleted (if ever)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp deleted_on = 5 [json_name = "deletedOn"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getDeletedOnOrBuilder();

  /**
   * <pre>
   * name for the signature
   * </pre>
   *
   * <code>string name = 6 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name for the signature
   * </pre>
   *
   * <code>string name = 6 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * description for the signature
   * </pre>
   *
   * <code>string description = 7 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description for the signature
   * </pre>
   *
   * <code>string description = 7 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
