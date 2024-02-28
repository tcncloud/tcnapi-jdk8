// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/bireportgenerator.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * DeliveryOptions is a message for the delivery options of a report.
 * </pre>
 *
 * Protobuf type {@code api.commons.DeliveryOptions}
 */
public final class DeliveryOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.DeliveryOptions)
    DeliveryOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeliveryOptions.newBuilder() to construct.
  private DeliveryOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeliveryOptions() {
    failureNotificationEmails_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeliveryOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DeliveryOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DeliveryOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.DeliveryOptions.class, com.tcn.cloud.api.api.commons.DeliveryOptions.Builder.class);
  }

  public static final int TRANSFER_CONFIG_SID_FIELD_NUMBER = 1;
  private long transferConfigSid_ = 0L;
  /**
   * <pre>
   * transfer_config_sid is the transfer config sid to deliver the report.
   * </pre>
   *
   * <code>int64 transfer_config_sid = 1 [json_name = "transferConfigSid"];</code>
   * @return The transferConfigSid.
   */
  @java.lang.Override
  public long getTransferConfigSid() {
    return transferConfigSid_;
  }

  public static final int FAILURE_NOTIFICATION_EMAILS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList failureNotificationEmails_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * failure_notification_emails are the emails to notify on failure.
   * </pre>
   *
   * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
   * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
   *     See api/commons/bireportgenerator.proto;l=116
   * @return A list containing the failureNotificationEmails.
   */
  @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
      getFailureNotificationEmailsList() {
    return failureNotificationEmails_;
  }
  /**
   * <pre>
   * failure_notification_emails are the emails to notify on failure.
   * </pre>
   *
   * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
   * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
   *     See api/commons/bireportgenerator.proto;l=116
   * @return The count of failureNotificationEmails.
   */
  @java.lang.Deprecated public int getFailureNotificationEmailsCount() {
    return failureNotificationEmails_.size();
  }
  /**
   * <pre>
   * failure_notification_emails are the emails to notify on failure.
   * </pre>
   *
   * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
   * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
   *     See api/commons/bireportgenerator.proto;l=116
   * @param index The index of the element to return.
   * @return The failureNotificationEmails at the given index.
   */
  @java.lang.Deprecated public java.lang.String getFailureNotificationEmails(int index) {
    return failureNotificationEmails_.get(index);
  }
  /**
   * <pre>
   * failure_notification_emails are the emails to notify on failure.
   * </pre>
   *
   * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
   * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
   *     See api/commons/bireportgenerator.proto;l=116
   * @param index The index of the value to return.
   * @return The bytes of the failureNotificationEmails at the given index.
   */
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getFailureNotificationEmailsBytes(int index) {
    return failureNotificationEmails_.getByteString(index);
  }

  public static final int FAILURE_NOTIFICATION_TRANSFER_CONFIG_SID_FIELD_NUMBER = 3;
  private long failureNotificationTransferConfigSid_ = 0L;
  /**
   * <pre>
   * failure_notification_transfer_config_sid is delivery definition to deliver failure notifications.
   * </pre>
   *
   * <code>int64 failure_notification_transfer_config_sid = 3 [json_name = "failureNotificationTransferConfigSid"];</code>
   * @return The failureNotificationTransferConfigSid.
   */
  @java.lang.Override
  public long getFailureNotificationTransferConfigSid() {
    return failureNotificationTransferConfigSid_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (transferConfigSid_ != 0L) {
      output.writeInt64(1, transferConfigSid_);
    }
    for (int i = 0; i < failureNotificationEmails_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, failureNotificationEmails_.getRaw(i));
    }
    if (failureNotificationTransferConfigSid_ != 0L) {
      output.writeInt64(3, failureNotificationTransferConfigSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transferConfigSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, transferConfigSid_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < failureNotificationEmails_.size(); i++) {
        dataSize += computeStringSizeNoTag(failureNotificationEmails_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getFailureNotificationEmailsList().size();
    }
    if (failureNotificationTransferConfigSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, failureNotificationTransferConfigSid_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.commons.DeliveryOptions)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.DeliveryOptions other = (com.tcn.cloud.api.api.commons.DeliveryOptions) obj;

    if (getTransferConfigSid()
        != other.getTransferConfigSid()) return false;
    if (!getFailureNotificationEmailsList()
        .equals(other.getFailureNotificationEmailsList())) return false;
    if (getFailureNotificationTransferConfigSid()
        != other.getFailureNotificationTransferConfigSid()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRANSFER_CONFIG_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTransferConfigSid());
    if (getFailureNotificationEmailsCount() > 0) {
      hash = (37 * hash) + FAILURE_NOTIFICATION_EMAILS_FIELD_NUMBER;
      hash = (53 * hash) + getFailureNotificationEmailsList().hashCode();
    }
    hash = (37 * hash) + FAILURE_NOTIFICATION_TRANSFER_CONFIG_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailureNotificationTransferConfigSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.DeliveryOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.DeliveryOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * DeliveryOptions is a message for the delivery options of a report.
   * </pre>
   *
   * Protobuf type {@code api.commons.DeliveryOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.DeliveryOptions)
      com.tcn.cloud.api.api.commons.DeliveryOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DeliveryOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DeliveryOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.DeliveryOptions.class, com.tcn.cloud.api.api.commons.DeliveryOptions.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.DeliveryOptions.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      transferConfigSid_ = 0L;
      failureNotificationEmails_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      failureNotificationTransferConfigSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.BireportgeneratorProto.internal_static_api_commons_DeliveryOptions_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DeliveryOptions getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.DeliveryOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DeliveryOptions build() {
      com.tcn.cloud.api.api.commons.DeliveryOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.DeliveryOptions buildPartial() {
      com.tcn.cloud.api.api.commons.DeliveryOptions result = new com.tcn.cloud.api.api.commons.DeliveryOptions(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.DeliveryOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transferConfigSid_ = transferConfigSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        failureNotificationEmails_.makeImmutable();
        result.failureNotificationEmails_ = failureNotificationEmails_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failureNotificationTransferConfigSid_ = failureNotificationTransferConfigSid_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.commons.DeliveryOptions) {
        return mergeFrom((com.tcn.cloud.api.api.commons.DeliveryOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.DeliveryOptions other) {
      if (other == com.tcn.cloud.api.api.commons.DeliveryOptions.getDefaultInstance()) return this;
      if (other.getTransferConfigSid() != 0L) {
        setTransferConfigSid(other.getTransferConfigSid());
      }
      if (!other.failureNotificationEmails_.isEmpty()) {
        if (failureNotificationEmails_.isEmpty()) {
          failureNotificationEmails_ = other.failureNotificationEmails_;
          bitField0_ |= 0x00000002;
        } else {
          ensureFailureNotificationEmailsIsMutable();
          failureNotificationEmails_.addAll(other.failureNotificationEmails_);
        }
        onChanged();
      }
      if (other.getFailureNotificationTransferConfigSid() != 0L) {
        setFailureNotificationTransferConfigSid(other.getFailureNotificationTransferConfigSid());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              transferConfigSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureFailureNotificationEmailsIsMutable();
              failureNotificationEmails_.add(s);
              break;
            } // case 18
            case 24: {
              failureNotificationTransferConfigSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private long transferConfigSid_ ;
    /**
     * <pre>
     * transfer_config_sid is the transfer config sid to deliver the report.
     * </pre>
     *
     * <code>int64 transfer_config_sid = 1 [json_name = "transferConfigSid"];</code>
     * @return The transferConfigSid.
     */
    @java.lang.Override
    public long getTransferConfigSid() {
      return transferConfigSid_;
    }
    /**
     * <pre>
     * transfer_config_sid is the transfer config sid to deliver the report.
     * </pre>
     *
     * <code>int64 transfer_config_sid = 1 [json_name = "transferConfigSid"];</code>
     * @param value The transferConfigSid to set.
     * @return This builder for chaining.
     */
    public Builder setTransferConfigSid(long value) {

      transferConfigSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * transfer_config_sid is the transfer config sid to deliver the report.
     * </pre>
     *
     * <code>int64 transfer_config_sid = 1 [json_name = "transferConfigSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransferConfigSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transferConfigSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList failureNotificationEmails_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureFailureNotificationEmailsIsMutable() {
      if (!failureNotificationEmails_.isModifiable()) {
        failureNotificationEmails_ = new com.google.protobuf.LazyStringArrayList(failureNotificationEmails_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @return A list containing the failureNotificationEmails.
     */
    @java.lang.Deprecated public com.google.protobuf.ProtocolStringList
        getFailureNotificationEmailsList() {
      failureNotificationEmails_.makeImmutable();
      return failureNotificationEmails_;
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @return The count of failureNotificationEmails.
     */
    @java.lang.Deprecated public int getFailureNotificationEmailsCount() {
      return failureNotificationEmails_.size();
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @param index The index of the element to return.
     * @return The failureNotificationEmails at the given index.
     */
    @java.lang.Deprecated public java.lang.String getFailureNotificationEmails(int index) {
      return failureNotificationEmails_.get(index);
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @param index The index of the value to return.
     * @return The bytes of the failureNotificationEmails at the given index.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getFailureNotificationEmailsBytes(int index) {
      return failureNotificationEmails_.getByteString(index);
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @param index The index to set the value at.
     * @param value The failureNotificationEmails to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setFailureNotificationEmails(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFailureNotificationEmailsIsMutable();
      failureNotificationEmails_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @param value The failureNotificationEmails to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addFailureNotificationEmails(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureFailureNotificationEmailsIsMutable();
      failureNotificationEmails_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @param values The failureNotificationEmails to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addAllFailureNotificationEmails(
        java.lang.Iterable<java.lang.String> values) {
      ensureFailureNotificationEmailsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, failureNotificationEmails_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearFailureNotificationEmails() {
      failureNotificationEmails_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failure_notification_emails are the emails to notify on failure.
     * </pre>
     *
     * <code>repeated string failure_notification_emails = 2 [json_name = "failureNotificationEmails", deprecated = true];</code>
     * @deprecated api.commons.DeliveryOptions.failure_notification_emails is deprecated.
     *     See api/commons/bireportgenerator.proto;l=116
     * @param value The bytes of the failureNotificationEmails to add.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder addFailureNotificationEmailsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureFailureNotificationEmailsIsMutable();
      failureNotificationEmails_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long failureNotificationTransferConfigSid_ ;
    /**
     * <pre>
     * failure_notification_transfer_config_sid is delivery definition to deliver failure notifications.
     * </pre>
     *
     * <code>int64 failure_notification_transfer_config_sid = 3 [json_name = "failureNotificationTransferConfigSid"];</code>
     * @return The failureNotificationTransferConfigSid.
     */
    @java.lang.Override
    public long getFailureNotificationTransferConfigSid() {
      return failureNotificationTransferConfigSid_;
    }
    /**
     * <pre>
     * failure_notification_transfer_config_sid is delivery definition to deliver failure notifications.
     * </pre>
     *
     * <code>int64 failure_notification_transfer_config_sid = 3 [json_name = "failureNotificationTransferConfigSid"];</code>
     * @param value The failureNotificationTransferConfigSid to set.
     * @return This builder for chaining.
     */
    public Builder setFailureNotificationTransferConfigSid(long value) {

      failureNotificationTransferConfigSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * failure_notification_transfer_config_sid is delivery definition to deliver failure notifications.
     * </pre>
     *
     * <code>int64 failure_notification_transfer_config_sid = 3 [json_name = "failureNotificationTransferConfigSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureNotificationTransferConfigSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      failureNotificationTransferConfigSid_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.commons.DeliveryOptions)
  }

  // @@protoc_insertion_point(class_scope:api.commons.DeliveryOptions)
  private static final com.tcn.cloud.api.api.commons.DeliveryOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.DeliveryOptions();
  }

  public static com.tcn.cloud.api.api.commons.DeliveryOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeliveryOptions>
      PARSER = new com.google.protobuf.AbstractParser<DeliveryOptions>() {
    @java.lang.Override
    public DeliveryOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DeliveryOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeliveryOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DeliveryOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

