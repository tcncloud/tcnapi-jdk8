// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response message for listing sms numbers
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListSmsNumbersRes}
 */
public final class ListSmsNumbersRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListSmsNumbersRes)
    ListSmsNumbersResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSmsNumbersRes.newBuilder() to construct.
  private ListSmsNumbersRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSmsNumbersRes() {
    smsNumbers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSmsNumbersRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListSmsNumbersRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListSmsNumbersRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.class, com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.Builder.class);
  }

  public static final int SMS_NUMBERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.SmsNumber> smsNumbers_;
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.SmsNumber> getSmsNumbersList() {
    return smsNumbers_;
  }
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.SmsNumberOrBuilder> 
      getSmsNumbersOrBuilderList() {
    return smsNumbers_;
  }
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  @java.lang.Override
  public int getSmsNumbersCount() {
    return smsNumbers_.size();
  }
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SmsNumber getSmsNumbers(int index) {
    return smsNumbers_.get(index);
  }
  /**
   * <pre>
   * list of sms numbers
   * </pre>
   *
   * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.SmsNumberOrBuilder getSmsNumbersOrBuilder(
      int index) {
    return smsNumbers_.get(index);
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
    for (int i = 0; i < smsNumbers_.size(); i++) {
      output.writeMessage(1, smsNumbers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < smsNumbers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, smsNumbers_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes other = (com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes) obj;

    if (!getSmsNumbersList()
        .equals(other.getSmsNumbersList())) return false;
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
    if (getSmsNumbersCount() > 0) {
      hash = (37 * hash) + SMS_NUMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getSmsNumbersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes prototype) {
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
   * Response message for listing sms numbers
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListSmsNumbersRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListSmsNumbersRes)
      com.tcn.cloud.api.api.v0alpha.ListSmsNumbersResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListSmsNumbersRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListSmsNumbersRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.class, com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.newBuilder()
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
      if (smsNumbersBuilder_ == null) {
        smsNumbers_ = java.util.Collections.emptyList();
      } else {
        smsNumbers_ = null;
        smsNumbersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListSmsNumbersRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes build() {
      com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes result = new com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes result) {
      if (smsNumbersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          smsNumbers_ = java.util.Collections.unmodifiableList(smsNumbers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.smsNumbers_ = smsNumbers_;
      } else {
        result.smsNumbers_ = smsNumbersBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes.getDefaultInstance()) return this;
      if (smsNumbersBuilder_ == null) {
        if (!other.smsNumbers_.isEmpty()) {
          if (smsNumbers_.isEmpty()) {
            smsNumbers_ = other.smsNumbers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSmsNumbersIsMutable();
            smsNumbers_.addAll(other.smsNumbers_);
          }
          onChanged();
        }
      } else {
        if (!other.smsNumbers_.isEmpty()) {
          if (smsNumbersBuilder_.isEmpty()) {
            smsNumbersBuilder_.dispose();
            smsNumbersBuilder_ = null;
            smsNumbers_ = other.smsNumbers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            smsNumbersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSmsNumbersFieldBuilder() : null;
          } else {
            smsNumbersBuilder_.addAllMessages(other.smsNumbers_);
          }
        }
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
              com.tcn.cloud.api.api.commons.SmsNumber m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.SmsNumber.parser(),
                      extensionRegistry);
              if (smsNumbersBuilder_ == null) {
                ensureSmsNumbersIsMutable();
                smsNumbers_.add(m);
              } else {
                smsNumbersBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.tcn.cloud.api.api.commons.SmsNumber> smsNumbers_ =
      java.util.Collections.emptyList();
    private void ensureSmsNumbersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        smsNumbers_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.SmsNumber>(smsNumbers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SmsNumber, com.tcn.cloud.api.api.commons.SmsNumber.Builder, com.tcn.cloud.api.api.commons.SmsNumberOrBuilder> smsNumbersBuilder_;

    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.SmsNumber> getSmsNumbersList() {
      if (smsNumbersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(smsNumbers_);
      } else {
        return smsNumbersBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public int getSmsNumbersCount() {
      if (smsNumbersBuilder_ == null) {
        return smsNumbers_.size();
      } else {
        return smsNumbersBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public com.tcn.cloud.api.api.commons.SmsNumber getSmsNumbers(int index) {
      if (smsNumbersBuilder_ == null) {
        return smsNumbers_.get(index);
      } else {
        return smsNumbersBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder setSmsNumbers(
        int index, com.tcn.cloud.api.api.commons.SmsNumber value) {
      if (smsNumbersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsNumbersIsMutable();
        smsNumbers_.set(index, value);
        onChanged();
      } else {
        smsNumbersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder setSmsNumbers(
        int index, com.tcn.cloud.api.api.commons.SmsNumber.Builder builderForValue) {
      if (smsNumbersBuilder_ == null) {
        ensureSmsNumbersIsMutable();
        smsNumbers_.set(index, builderForValue.build());
        onChanged();
      } else {
        smsNumbersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder addSmsNumbers(com.tcn.cloud.api.api.commons.SmsNumber value) {
      if (smsNumbersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsNumbersIsMutable();
        smsNumbers_.add(value);
        onChanged();
      } else {
        smsNumbersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder addSmsNumbers(
        int index, com.tcn.cloud.api.api.commons.SmsNumber value) {
      if (smsNumbersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSmsNumbersIsMutable();
        smsNumbers_.add(index, value);
        onChanged();
      } else {
        smsNumbersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder addSmsNumbers(
        com.tcn.cloud.api.api.commons.SmsNumber.Builder builderForValue) {
      if (smsNumbersBuilder_ == null) {
        ensureSmsNumbersIsMutable();
        smsNumbers_.add(builderForValue.build());
        onChanged();
      } else {
        smsNumbersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder addSmsNumbers(
        int index, com.tcn.cloud.api.api.commons.SmsNumber.Builder builderForValue) {
      if (smsNumbersBuilder_ == null) {
        ensureSmsNumbersIsMutable();
        smsNumbers_.add(index, builderForValue.build());
        onChanged();
      } else {
        smsNumbersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder addAllSmsNumbers(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.SmsNumber> values) {
      if (smsNumbersBuilder_ == null) {
        ensureSmsNumbersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, smsNumbers_);
        onChanged();
      } else {
        smsNumbersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder clearSmsNumbers() {
      if (smsNumbersBuilder_ == null) {
        smsNumbers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        smsNumbersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public Builder removeSmsNumbers(int index) {
      if (smsNumbersBuilder_ == null) {
        ensureSmsNumbersIsMutable();
        smsNumbers_.remove(index);
        onChanged();
      } else {
        smsNumbersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public com.tcn.cloud.api.api.commons.SmsNumber.Builder getSmsNumbersBuilder(
        int index) {
      return getSmsNumbersFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public com.tcn.cloud.api.api.commons.SmsNumberOrBuilder getSmsNumbersOrBuilder(
        int index) {
      if (smsNumbersBuilder_ == null) {
        return smsNumbers_.get(index);  } else {
        return smsNumbersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.SmsNumberOrBuilder> 
         getSmsNumbersOrBuilderList() {
      if (smsNumbersBuilder_ != null) {
        return smsNumbersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(smsNumbers_);
      }
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public com.tcn.cloud.api.api.commons.SmsNumber.Builder addSmsNumbersBuilder() {
      return getSmsNumbersFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.SmsNumber.getDefaultInstance());
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public com.tcn.cloud.api.api.commons.SmsNumber.Builder addSmsNumbersBuilder(
        int index) {
      return getSmsNumbersFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.SmsNumber.getDefaultInstance());
    }
    /**
     * <pre>
     * list of sms numbers
     * </pre>
     *
     * <code>repeated .api.commons.SmsNumber sms_numbers = 1 [json_name = "smsNumbers"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.SmsNumber.Builder> 
         getSmsNumbersBuilderList() {
      return getSmsNumbersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.SmsNumber, com.tcn.cloud.api.api.commons.SmsNumber.Builder, com.tcn.cloud.api.api.commons.SmsNumberOrBuilder> 
        getSmsNumbersFieldBuilder() {
      if (smsNumbersBuilder_ == null) {
        smsNumbersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.SmsNumber, com.tcn.cloud.api.api.commons.SmsNumber.Builder, com.tcn.cloud.api.api.commons.SmsNumberOrBuilder>(
                smsNumbers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        smsNumbers_ = null;
      }
      return smsNumbersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListSmsNumbersRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListSmsNumbersRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSmsNumbersRes>
      PARSER = new com.google.protobuf.AbstractParser<ListSmsNumbersRes>() {
    @java.lang.Override
    public ListSmsNumbersRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSmsNumbersRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSmsNumbersRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListSmsNumbersRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

