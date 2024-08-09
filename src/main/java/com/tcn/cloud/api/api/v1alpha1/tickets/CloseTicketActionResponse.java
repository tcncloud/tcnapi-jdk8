// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * Protobuf type {@code api.v1alpha1.tickets.CloseTicketActionResponse}
 */
public final class CloseTicketActionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.CloseTicketActionResponse)
    CloseTicketActionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloseTicketActionResponse.newBuilder() to construct.
  private CloseTicketActionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloseTicketActionResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloseTicketActionResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketActionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketActionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.class, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.Builder.class);
  }

  public static final int IS_CLOSED_FIELD_NUMBER = 1;
  private boolean isClosed_ = false;
  /**
   * <code>bool is_closed = 1 [json_name = "isClosed", deprecated = true];</code>
   * @deprecated api.v1alpha1.tickets.CloseTicketActionResponse.is_closed is deprecated.
   *     See api/v1alpha1/tickets/ticket.proto;l=402
   * @return The isClosed.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean getIsClosed() {
    return isClosed_;
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
    if (isClosed_ != false) {
      output.writeBool(1, isClosed_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isClosed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isClosed_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse other = (com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse) obj;

    if (getIsClosed()
        != other.getIsClosed()) return false;
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
    hash = (37 * hash) + IS_CLOSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsClosed());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.tickets.CloseTicketActionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.CloseTicketActionResponse)
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketActionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketActionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.class, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.newBuilder()
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
      isClosed_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CloseTicketActionResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse result = new com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isClosed_ = isClosed_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.getDefaultInstance()) return this;
      if (other.getIsClosed() != false) {
        setIsClosed(other.getIsClosed());
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
              isClosed_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private boolean isClosed_ ;
    /**
     * <code>bool is_closed = 1 [json_name = "isClosed", deprecated = true];</code>
     * @deprecated api.v1alpha1.tickets.CloseTicketActionResponse.is_closed is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=402
     * @return The isClosed.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean getIsClosed() {
      return isClosed_;
    }
    /**
     * <code>bool is_closed = 1 [json_name = "isClosed", deprecated = true];</code>
     * @deprecated api.v1alpha1.tickets.CloseTicketActionResponse.is_closed is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=402
     * @param value The isClosed to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setIsClosed(boolean value) {

      isClosed_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_closed = 1 [json_name = "isClosed", deprecated = true];</code>
     * @deprecated api.v1alpha1.tickets.CloseTicketActionResponse.is_closed is deprecated.
     *     See api/v1alpha1/tickets/ticket.proto;l=402
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearIsClosed() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isClosed_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.CloseTicketActionResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.CloseTicketActionResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloseTicketActionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CloseTicketActionResponse>() {
    @java.lang.Override
    public CloseTicketActionResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloseTicketActionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloseTicketActionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

