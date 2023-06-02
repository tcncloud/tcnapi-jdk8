// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetRecommendedDashPagesReq}
 */
public final class GetRecommendedDashPagesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetRecommendedDashPagesReq)
    GetRecommendedDashPagesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetRecommendedDashPagesReq.newBuilder() to construct.
  private GetRecommendedDashPagesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetRecommendedDashPagesReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetRecommendedDashPagesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetRecommendedDashPagesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetRecommendedDashPagesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.class, com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.Builder.class);
  }

  public static final int SOURCE_DASH_PAGE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq sourceDashPage_;
  /**
   * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
   * @return Whether the sourceDashPage field is set.
   */
  @java.lang.Override
  public boolean hasSourceDashPage() {
    return sourceDashPage_ != null;
  }
  /**
   * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
   * @return The sourceDashPage.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq getSourceDashPage() {
    return sourceDashPage_ == null ? com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.getDefaultInstance() : sourceDashPage_;
  }
  /**
   * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReqOrBuilder getSourceDashPageOrBuilder() {
    return sourceDashPage_ == null ? com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.getDefaultInstance() : sourceDashPage_;
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
    if (sourceDashPage_ != null) {
      output.writeMessage(1, getSourceDashPage());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceDashPage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSourceDashPage());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq other = (com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq) obj;

    if (hasSourceDashPage() != other.hasSourceDashPage()) return false;
    if (hasSourceDashPage()) {
      if (!getSourceDashPage()
          .equals(other.getSourceDashPage())) return false;
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
    if (hasSourceDashPage()) {
      hash = (37 * hash) + SOURCE_DASH_PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getSourceDashPage().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq prototype) {
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
   * Protobuf type {@code api.v0alpha.GetRecommendedDashPagesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetRecommendedDashPagesReq)
      com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetRecommendedDashPagesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetRecommendedDashPagesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.class, com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.newBuilder()
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
      sourceDashPage_ = null;
      if (sourceDashPageBuilder_ != null) {
        sourceDashPageBuilder_.dispose();
        sourceDashPageBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetRecommendedDashPagesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq build() {
      com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq result = new com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceDashPage_ = sourceDashPageBuilder_ == null
            ? sourceDashPage_
            : sourceDashPageBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq.getDefaultInstance()) return this;
      if (other.hasSourceDashPage()) {
        mergeSourceDashPage(other.getSourceDashPage());
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
                  getSourceDashPageFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq sourceDashPage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq, com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.Builder, com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReqOrBuilder> sourceDashPageBuilder_;
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     * @return Whether the sourceDashPage field is set.
     */
    public boolean hasSourceDashPage() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     * @return The sourceDashPage.
     */
    public com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq getSourceDashPage() {
      if (sourceDashPageBuilder_ == null) {
        return sourceDashPage_ == null ? com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.getDefaultInstance() : sourceDashPage_;
      } else {
        return sourceDashPageBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    public Builder setSourceDashPage(com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq value) {
      if (sourceDashPageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceDashPage_ = value;
      } else {
        sourceDashPageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    public Builder setSourceDashPage(
        com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.Builder builderForValue) {
      if (sourceDashPageBuilder_ == null) {
        sourceDashPage_ = builderForValue.build();
      } else {
        sourceDashPageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    public Builder mergeSourceDashPage(com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq value) {
      if (sourceDashPageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          sourceDashPage_ != null &&
          sourceDashPage_ != com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.getDefaultInstance()) {
          getSourceDashPageBuilder().mergeFrom(value);
        } else {
          sourceDashPage_ = value;
        }
      } else {
        sourceDashPageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    public Builder clearSourceDashPage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sourceDashPage_ = null;
      if (sourceDashPageBuilder_ != null) {
        sourceDashPageBuilder_.dispose();
        sourceDashPageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.Builder getSourceDashPageBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSourceDashPageFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReqOrBuilder getSourceDashPageOrBuilder() {
      if (sourceDashPageBuilder_ != null) {
        return sourceDashPageBuilder_.getMessageOrBuilder();
      } else {
        return sourceDashPage_ == null ?
            com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.getDefaultInstance() : sourceDashPage_;
      }
    }
    /**
     * <code>.api.v0alpha.RecommendedDashPageReq source_dash_page = 1 [json_name = "sourceDashPage"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq, com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.Builder, com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReqOrBuilder> 
        getSourceDashPageFieldBuilder() {
      if (sourceDashPageBuilder_ == null) {
        sourceDashPageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq, com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReq.Builder, com.tcn.cloud.api.api.v0alpha.RecommendedDashPageReqOrBuilder>(
                getSourceDashPage(),
                getParentForChildren(),
                isClean());
        sourceDashPage_ = null;
      }
      return sourceDashPageBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetRecommendedDashPagesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetRecommendedDashPagesReq)
  private static final com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetRecommendedDashPagesReq>
      PARSER = new com.google.protobuf.AbstractParser<GetRecommendedDashPagesReq>() {
    @java.lang.Override
    public GetRecommendedDashPagesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetRecommendedDashPagesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetRecommendedDashPagesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetRecommendedDashPagesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

