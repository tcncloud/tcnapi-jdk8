// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/billing_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * BillingCreateInvoiceEvent is fired when an invoice is created
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.BillingCreateInvoiceEvent}
 */
@java.lang.Deprecated public final class BillingCreateInvoiceEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.BillingCreateInvoiceEvent)
    BillingCreateInvoiceEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BillingCreateInvoiceEvent.newBuilder() to construct.
  private BillingCreateInvoiceEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BillingCreateInvoiceEvent() {
    invoice_ = "";
    userId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BillingCreateInvoiceEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.BillingEventsProto.internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.BillingEventsProto.internal_static_api_commons_audit_BillingCreateInvoiceEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.class, com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.Builder.class);
  }

  public static final int INVOICE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object invoice_ = "";
  /**
   * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
   * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
   *     See api/commons/audit/billing_events.proto;l=26
   * @return The invoice.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getInvoice() {
    java.lang.Object ref = invoice_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      invoice_ = s;
      return s;
    }
  }
  /**
   * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
   * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
   *     See api/commons/audit/billing_events.proto;l=26
   * @return The bytes for invoice.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getInvoiceBytes() {
    java.lang.Object ref = invoice_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      invoice_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
   * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
   *     See api/commons/audit/billing_events.proto;l=27
   * @return The userId.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
   * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
   *     See api/commons/audit/billing_events.proto;l=27
   * @return The bytes for userId.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(invoice_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, invoice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(invoice_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, invoice_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent other = (com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent) obj;

    if (!getInvoice()
        .equals(other.getInvoice())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
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
    hash = (37 * hash) + INVOICE_FIELD_NUMBER;
    hash = (53 * hash) + getInvoice().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent prototype) {
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
   * BillingCreateInvoiceEvent is fired when an invoice is created
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.BillingCreateInvoiceEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.BillingCreateInvoiceEvent)
      com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.BillingEventsProto.internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.BillingEventsProto.internal_static_api_commons_audit_BillingCreateInvoiceEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.class, com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.newBuilder()
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
      invoice_ = "";
      userId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.BillingEventsProto.internal_static_api_commons_audit_BillingCreateInvoiceEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent build() {
      com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent result = new com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.invoice_ = invoice_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userId_ = userId_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent.getDefaultInstance()) return this;
      if (!other.getInvoice().isEmpty()) {
        invoice_ = other.invoice_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10: {
              invoice_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object invoice_ = "";
    /**
     * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
     *     See api/commons/audit/billing_events.proto;l=26
     * @return The invoice.
     */
    @java.lang.Deprecated public java.lang.String getInvoice() {
      java.lang.Object ref = invoice_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        invoice_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
     *     See api/commons/audit/billing_events.proto;l=26
     * @return The bytes for invoice.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getInvoiceBytes() {
      java.lang.Object ref = invoice_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        invoice_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
     *     See api/commons/audit/billing_events.proto;l=26
     * @param value The invoice to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setInvoice(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      invoice_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
     *     See api/commons/audit/billing_events.proto;l=26
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearInvoice() {
      invoice_ = getDefaultInstance().getInvoice();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string invoice = 1 [json_name = "invoice", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.invoice is deprecated.
     *     See api/commons/audit/billing_events.proto;l=26
     * @param value The bytes for invoice to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setInvoiceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      invoice_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
     *     See api/commons/audit/billing_events.proto;l=27
     * @return The userId.
     */
    @java.lang.Deprecated public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
     *     See api/commons/audit/billing_events.proto;l=27
     * @return The bytes for userId.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
     *     See api/commons/audit/billing_events.proto;l=27
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
     *     See api/commons/audit/billing_events.proto;l=27
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId", deprecated = true];</code>
     * @deprecated api.commons.audit.BillingCreateInvoiceEvent.user_id is deprecated.
     *     See api/commons/audit/billing_events.proto;l=27
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.BillingCreateInvoiceEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.BillingCreateInvoiceEvent)
  private static final com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillingCreateInvoiceEvent>
      PARSER = new com.google.protobuf.AbstractParser<BillingCreateInvoiceEvent>() {
    @java.lang.Override
    public BillingCreateInvoiceEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<BillingCreateInvoiceEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillingCreateInvoiceEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.BillingCreateInvoiceEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

