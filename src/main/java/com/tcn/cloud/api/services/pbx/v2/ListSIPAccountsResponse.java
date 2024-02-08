// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/pbx/v2/service.proto

package com.tcn.cloud.api.services.pbx.v2;

/**
 * Protobuf type {@code services.pbx.v2.ListSIPAccountsResponse}
 */
public final class ListSIPAccountsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.pbx.v2.ListSIPAccountsResponse)
    ListSIPAccountsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSIPAccountsResponse.newBuilder() to construct.
  private ListSIPAccountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSIPAccountsResponse() {
    sipAccounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSIPAccountsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_ListSIPAccountsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_ListSIPAccountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.class, com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.Builder.class);
  }

  public static final int SIP_ACCOUNTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.pbx.v2.SIPAccount> sipAccounts_;
  /**
   * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.pbx.v2.SIPAccount> getSipAccountsList() {
    return sipAccounts_;
  }
  /**
   * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder> 
      getSipAccountsOrBuilderList() {
    return sipAccounts_;
  }
  /**
   * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
   */
  @java.lang.Override
  public int getSipAccountsCount() {
    return sipAccounts_.size();
  }
  /**
   * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v2.SIPAccount getSipAccounts(int index) {
    return sipAccounts_.get(index);
  }
  /**
   * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder getSipAccountsOrBuilder(
      int index) {
    return sipAccounts_.get(index);
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
    for (int i = 0; i < sipAccounts_.size(); i++) {
      output.writeMessage(1, sipAccounts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sipAccounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sipAccounts_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse other = (com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse) obj;

    if (!getSipAccountsList()
        .equals(other.getSipAccountsList())) return false;
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
    if (getSipAccountsCount() > 0) {
      hash = (37 * hash) + SIP_ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getSipAccountsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse prototype) {
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
   * Protobuf type {@code services.pbx.v2.ListSIPAccountsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.pbx.v2.ListSIPAccountsResponse)
      com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_ListSIPAccountsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_ListSIPAccountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.class, com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.newBuilder()
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
      if (sipAccountsBuilder_ == null) {
        sipAccounts_ = java.util.Collections.emptyList();
      } else {
        sipAccounts_ = null;
        sipAccountsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.pbx.v2.ServiceProto.internal_static_services_pbx_v2_ListSIPAccountsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse build() {
      com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse buildPartial() {
      com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse result = new com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse result) {
      if (sipAccountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sipAccounts_ = java.util.Collections.unmodifiableList(sipAccounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sipAccounts_ = sipAccounts_;
      } else {
        result.sipAccounts_ = sipAccountsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse result) {
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
      if (other instanceof com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse) {
        return mergeFrom((com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse other) {
      if (other == com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse.getDefaultInstance()) return this;
      if (sipAccountsBuilder_ == null) {
        if (!other.sipAccounts_.isEmpty()) {
          if (sipAccounts_.isEmpty()) {
            sipAccounts_ = other.sipAccounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSipAccountsIsMutable();
            sipAccounts_.addAll(other.sipAccounts_);
          }
          onChanged();
        }
      } else {
        if (!other.sipAccounts_.isEmpty()) {
          if (sipAccountsBuilder_.isEmpty()) {
            sipAccountsBuilder_.dispose();
            sipAccountsBuilder_ = null;
            sipAccounts_ = other.sipAccounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sipAccountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSipAccountsFieldBuilder() : null;
          } else {
            sipAccountsBuilder_.addAllMessages(other.sipAccounts_);
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
              com.tcn.cloud.api.services.pbx.v2.SIPAccount m =
                  input.readMessage(
                      com.tcn.cloud.api.services.pbx.v2.SIPAccount.parser(),
                      extensionRegistry);
              if (sipAccountsBuilder_ == null) {
                ensureSipAccountsIsMutable();
                sipAccounts_.add(m);
              } else {
                sipAccountsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.services.pbx.v2.SIPAccount> sipAccounts_ =
      java.util.Collections.emptyList();
    private void ensureSipAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sipAccounts_ = new java.util.ArrayList<com.tcn.cloud.api.services.pbx.v2.SIPAccount>(sipAccounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.pbx.v2.SIPAccount, com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder, com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder> sipAccountsBuilder_;

    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.pbx.v2.SIPAccount> getSipAccountsList() {
      if (sipAccountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sipAccounts_);
      } else {
        return sipAccountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public int getSipAccountsCount() {
      if (sipAccountsBuilder_ == null) {
        return sipAccounts_.size();
      } else {
        return sipAccountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v2.SIPAccount getSipAccounts(int index) {
      if (sipAccountsBuilder_ == null) {
        return sipAccounts_.get(index);
      } else {
        return sipAccountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder setSipAccounts(
        int index, com.tcn.cloud.api.services.pbx.v2.SIPAccount value) {
      if (sipAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSipAccountsIsMutable();
        sipAccounts_.set(index, value);
        onChanged();
      } else {
        sipAccountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder setSipAccounts(
        int index, com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder builderForValue) {
      if (sipAccountsBuilder_ == null) {
        ensureSipAccountsIsMutable();
        sipAccounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        sipAccountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder addSipAccounts(com.tcn.cloud.api.services.pbx.v2.SIPAccount value) {
      if (sipAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSipAccountsIsMutable();
        sipAccounts_.add(value);
        onChanged();
      } else {
        sipAccountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder addSipAccounts(
        int index, com.tcn.cloud.api.services.pbx.v2.SIPAccount value) {
      if (sipAccountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSipAccountsIsMutable();
        sipAccounts_.add(index, value);
        onChanged();
      } else {
        sipAccountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder addSipAccounts(
        com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder builderForValue) {
      if (sipAccountsBuilder_ == null) {
        ensureSipAccountsIsMutable();
        sipAccounts_.add(builderForValue.build());
        onChanged();
      } else {
        sipAccountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder addSipAccounts(
        int index, com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder builderForValue) {
      if (sipAccountsBuilder_ == null) {
        ensureSipAccountsIsMutable();
        sipAccounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        sipAccountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder addAllSipAccounts(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.pbx.v2.SIPAccount> values) {
      if (sipAccountsBuilder_ == null) {
        ensureSipAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sipAccounts_);
        onChanged();
      } else {
        sipAccountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder clearSipAccounts() {
      if (sipAccountsBuilder_ == null) {
        sipAccounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sipAccountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public Builder removeSipAccounts(int index) {
      if (sipAccountsBuilder_ == null) {
        ensureSipAccountsIsMutable();
        sipAccounts_.remove(index);
        onChanged();
      } else {
        sipAccountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder getSipAccountsBuilder(
        int index) {
      return getSipAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder getSipAccountsOrBuilder(
        int index) {
      if (sipAccountsBuilder_ == null) {
        return sipAccounts_.get(index);  } else {
        return sipAccountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder> 
         getSipAccountsOrBuilderList() {
      if (sipAccountsBuilder_ != null) {
        return sipAccountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sipAccounts_);
      }
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder addSipAccountsBuilder() {
      return getSipAccountsFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.pbx.v2.SIPAccount.getDefaultInstance());
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder addSipAccountsBuilder(
        int index) {
      return getSipAccountsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.pbx.v2.SIPAccount.getDefaultInstance());
    }
    /**
     * <code>repeated .services.pbx.v2.SIPAccount sip_accounts = 1 [json_name = "sipAccounts"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder> 
         getSipAccountsBuilderList() {
      return getSipAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.pbx.v2.SIPAccount, com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder, com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder> 
        getSipAccountsFieldBuilder() {
      if (sipAccountsBuilder_ == null) {
        sipAccountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.pbx.v2.SIPAccount, com.tcn.cloud.api.services.pbx.v2.SIPAccount.Builder, com.tcn.cloud.api.services.pbx.v2.SIPAccountOrBuilder>(
                sipAccounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sipAccounts_ = null;
      }
      return sipAccountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.pbx.v2.ListSIPAccountsResponse)
  }

  // @@protoc_insertion_point(class_scope:services.pbx.v2.ListSIPAccountsResponse)
  private static final com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse();
  }

  public static com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSIPAccountsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSIPAccountsResponse>() {
    @java.lang.Override
    public ListSIPAccountsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSIPAccountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSIPAccountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.pbx.v2.ListSIPAccountsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
