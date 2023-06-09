// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the GetDraftSchedule RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.GetDraftScheduleRes}
 */
public final class GetDraftScheduleRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.GetDraftScheduleRes)
    GetDraftScheduleResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDraftScheduleRes.newBuilder() to construct.
  private GetDraftScheduleRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDraftScheduleRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDraftScheduleRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetDraftScheduleRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetDraftScheduleRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.Builder.class);
  }

  public static final int DRAFT_SCHEDULE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule draftSchedule_;
  /**
   * <pre>
   * Draft schedule found.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
   * @return Whether the draftSchedule field is set.
   */
  @java.lang.Override
  public boolean hasDraftSchedule() {
    return draftSchedule_ != null;
  }
  /**
   * <pre>
   * Draft schedule found.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
   * @return The draftSchedule.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule getDraftSchedule() {
    return draftSchedule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.getDefaultInstance() : draftSchedule_;
  }
  /**
   * <pre>
   * Draft schedule found.
   * </pre>
   *
   * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.DraftScheduleOrBuilder getDraftScheduleOrBuilder() {
    return draftSchedule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.getDefaultInstance() : draftSchedule_;
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
    if (draftSchedule_ != null) {
      output.writeMessage(1, getDraftSchedule());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (draftSchedule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDraftSchedule());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes) obj;

    if (hasDraftSchedule() != other.hasDraftSchedule()) return false;
    if (hasDraftSchedule()) {
      if (!getDraftSchedule()
          .equals(other.getDraftSchedule())) return false;
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
    if (hasDraftSchedule()) {
      hash = (37 * hash) + DRAFT_SCHEDULE_FIELD_NUMBER;
      hash = (53 * hash) + getDraftSchedule().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes prototype) {
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
   * Response message for the GetDraftSchedule RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.GetDraftScheduleRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.GetDraftScheduleRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetDraftScheduleRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetDraftScheduleRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.newBuilder()
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
      draftSchedule_ = null;
      if (draftScheduleBuilder_ != null) {
        draftScheduleBuilder_.dispose();
        draftScheduleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_GetDraftScheduleRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.draftSchedule_ = draftScheduleBuilder_ == null
            ? draftSchedule_
            : draftScheduleBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes.getDefaultInstance()) return this;
      if (other.hasDraftSchedule()) {
        mergeDraftSchedule(other.getDraftSchedule());
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
                  getDraftScheduleFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule draftSchedule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule, com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.DraftScheduleOrBuilder> draftScheduleBuilder_;
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     * @return Whether the draftSchedule field is set.
     */
    public boolean hasDraftSchedule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     * @return The draftSchedule.
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule getDraftSchedule() {
      if (draftScheduleBuilder_ == null) {
        return draftSchedule_ == null ? com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.getDefaultInstance() : draftSchedule_;
      } else {
        return draftScheduleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    public Builder setDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule value) {
      if (draftScheduleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        draftSchedule_ = value;
      } else {
        draftScheduleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    public Builder setDraftSchedule(
        com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.Builder builderForValue) {
      if (draftScheduleBuilder_ == null) {
        draftSchedule_ = builderForValue.build();
      } else {
        draftScheduleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    public Builder mergeDraftSchedule(com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule value) {
      if (draftScheduleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          draftSchedule_ != null &&
          draftSchedule_ != com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.getDefaultInstance()) {
          getDraftScheduleBuilder().mergeFrom(value);
        } else {
          draftSchedule_ = value;
        }
      } else {
        draftScheduleBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    public Builder clearDraftSchedule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      draftSchedule_ = null;
      if (draftScheduleBuilder_ != null) {
        draftScheduleBuilder_.dispose();
        draftScheduleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.Builder getDraftScheduleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDraftScheduleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.wfm.DraftScheduleOrBuilder getDraftScheduleOrBuilder() {
      if (draftScheduleBuilder_ != null) {
        return draftScheduleBuilder_.getMessageOrBuilder();
      } else {
        return draftSchedule_ == null ?
            com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.getDefaultInstance() : draftSchedule_;
      }
    }
    /**
     * <pre>
     * Draft schedule found.
     * </pre>
     *
     * <code>.api.v1alpha1.wfm.DraftSchedule draft_schedule = 1 [json_name = "draftSchedule"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule, com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.DraftScheduleOrBuilder> 
        getDraftScheduleFieldBuilder() {
      if (draftScheduleBuilder_ == null) {
        draftScheduleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule, com.tcn.cloud.api.api.v1alpha1.wfm.DraftSchedule.Builder, com.tcn.cloud.api.api.v1alpha1.wfm.DraftScheduleOrBuilder>(
                getDraftSchedule(),
                getParentForChildren(),
                isClean());
        draftSchedule_ = null;
      }
      return draftScheduleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.GetDraftScheduleRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.GetDraftScheduleRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDraftScheduleRes>
      PARSER = new com.google.protobuf.AbstractParser<GetDraftScheduleRes>() {
    @java.lang.Override
    public GetDraftScheduleRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDraftScheduleRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDraftScheduleRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.GetDraftScheduleRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

