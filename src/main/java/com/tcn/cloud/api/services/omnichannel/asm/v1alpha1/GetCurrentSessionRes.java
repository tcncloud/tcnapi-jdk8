// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/asm/v1alpha1/entities.proto

package com.tcn.cloud.api.services.omnichannel.asm.v1alpha1;

/**
 * Protobuf type {@code services.omnichannel.asm.v1alpha1.GetCurrentSessionRes}
 */
public final class GetCurrentSessionRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.omnichannel.asm.v1alpha1.GetCurrentSessionRes)
    GetCurrentSessionResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCurrentSessionRes.newBuilder() to construct.
  private GetCurrentSessionRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCurrentSessionRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCurrentSessionRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EntitiesProto.internal_static_services_omnichannel_asm_v1alpha1_GetCurrentSessionRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EntitiesProto.internal_static_services_omnichannel_asm_v1alpha1_GetCurrentSessionRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.class, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.Builder.class);
  }

  public static final int ASM_SESSION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession asmSession_;
  /**
   * <pre>
   * current asm session
   * </pre>
   *
   * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
   * @return Whether the asmSession field is set.
   */
  @java.lang.Override
  public boolean hasAsmSession() {
    return asmSession_ != null;
  }
  /**
   * <pre>
   * current asm session
   * </pre>
   *
   * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
   * @return The asmSession.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession getAsmSession() {
    return asmSession_ == null ? com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.getDefaultInstance() : asmSession_;
  }
  /**
   * <pre>
   * current asm session
   * </pre>
   *
   * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSessionOrBuilder getAsmSessionOrBuilder() {
    return asmSession_ == null ? com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.getDefaultInstance() : asmSession_;
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
    if (asmSession_ != null) {
      output.writeMessage(1, getAsmSession());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (asmSession_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAsmSession());
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
    if (!(obj instanceof com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes other = (com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes) obj;

    if (hasAsmSession() != other.hasAsmSession()) return false;
    if (hasAsmSession()) {
      if (!getAsmSession()
          .equals(other.getAsmSession())) return false;
    }
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
    if (hasAsmSession()) {
      hash = (37 * hash) + ASM_SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getAsmSession().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes prototype) {
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
   * Protobuf type {@code services.omnichannel.asm.v1alpha1.GetCurrentSessionRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.omnichannel.asm.v1alpha1.GetCurrentSessionRes)
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EntitiesProto.internal_static_services_omnichannel_asm_v1alpha1_GetCurrentSessionRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EntitiesProto.internal_static_services_omnichannel_asm_v1alpha1_GetCurrentSessionRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.class, com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.newBuilder()
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
      asmSession_ = null;
      if (asmSessionBuilder_ != null) {
        asmSessionBuilder_.dispose();
        asmSessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.EntitiesProto.internal_static_services_omnichannel_asm_v1alpha1_GetCurrentSessionRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes build() {
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes buildPartial() {
      com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes result = new com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.asmSession_ = asmSessionBuilder_ == null
            ? asmSession_
            : asmSessionBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes) {
        return mergeFrom((com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes other) {
      if (other == com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes.getDefaultInstance()) return this;
      if (other.hasAsmSession()) {
        mergeAsmSession(other.getAsmSession());
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
              input.readMessage(
                  getAsmSessionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession asmSession_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession, com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.Builder, com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSessionOrBuilder> asmSessionBuilder_;
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     * @return Whether the asmSession field is set.
     */
    public boolean hasAsmSession() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     * @return The asmSession.
     */
    public com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession getAsmSession() {
      if (asmSessionBuilder_ == null) {
        return asmSession_ == null ? com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.getDefaultInstance() : asmSession_;
      } else {
        return asmSessionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    public Builder setAsmSession(com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession value) {
      if (asmSessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asmSession_ = value;
      } else {
        asmSessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    public Builder setAsmSession(
        com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.Builder builderForValue) {
      if (asmSessionBuilder_ == null) {
        asmSession_ = builderForValue.build();
      } else {
        asmSessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    public Builder mergeAsmSession(com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession value) {
      if (asmSessionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          asmSession_ != null &&
          asmSession_ != com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.getDefaultInstance()) {
          getAsmSessionBuilder().mergeFrom(value);
        } else {
          asmSession_ = value;
        }
      } else {
        asmSessionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    public Builder clearAsmSession() {
      bitField0_ = (bitField0_ & ~0x00000001);
      asmSession_ = null;
      if (asmSessionBuilder_ != null) {
        asmSessionBuilder_.dispose();
        asmSessionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.Builder getAsmSessionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAsmSessionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    public com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSessionOrBuilder getAsmSessionOrBuilder() {
      if (asmSessionBuilder_ != null) {
        return asmSessionBuilder_.getMessageOrBuilder();
      } else {
        return asmSession_ == null ?
            com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.getDefaultInstance() : asmSession_;
      }
    }
    /**
     * <pre>
     * current asm session
     * </pre>
     *
     * <code>.services.omnichannel.asm.entities.v1alpha1.AsmSession asm_session = 1 [json_name = "asmSession"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession, com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.Builder, com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSessionOrBuilder> 
        getAsmSessionFieldBuilder() {
      if (asmSessionBuilder_ == null) {
        asmSessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession, com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSession.Builder, com.tcn.cloud.api.services.omnichannel.asm.entities.v1alpha1.AsmSessionOrBuilder>(
                getAsmSession(),
                getParentForChildren(),
                isClean());
        asmSession_ = null;
      }
      return asmSessionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.omnichannel.asm.v1alpha1.GetCurrentSessionRes)
  }

  // @@protoc_insertion_point(class_scope:services.omnichannel.asm.v1alpha1.GetCurrentSessionRes)
  private static final com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes();
  }

  public static com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCurrentSessionRes>
      PARSER = new com.google.protobuf.AbstractParser<GetCurrentSessionRes>() {
    @java.lang.Override
    public GetCurrentSessionRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCurrentSessionRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCurrentSessionRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.omnichannel.asm.v1alpha1.GetCurrentSessionRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

