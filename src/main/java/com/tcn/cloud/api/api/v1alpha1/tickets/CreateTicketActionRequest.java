// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * Protobuf type {@code api.v1alpha1.tickets.CreateTicketActionRequest}
 */
public final class CreateTicketActionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.CreateTicketActionRequest)
    CreateTicketActionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTicketActionRequest.newBuilder() to construct.
  private CreateTicketActionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTicketActionRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTicketActionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CreateTicketActionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CreateTicketActionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.Builder.class);
  }

  public static final int TICKET_ACTION_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.TicketAction ticketAction_;
  /**
   * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
   * @return Whether the ticketAction field is set.
   */
  @java.lang.Override
  public boolean hasTicketAction() {
    return ticketAction_ != null;
  }
  /**
   * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
   * @return The ticketAction.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TicketAction getTicketAction() {
    return ticketAction_ == null ? com.tcn.cloud.api.api.commons.TicketAction.getDefaultInstance() : ticketAction_;
  }
  /**
   * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TicketActionOrBuilder getTicketActionOrBuilder() {
    return ticketAction_ == null ? com.tcn.cloud.api.api.commons.TicketAction.getDefaultInstance() : ticketAction_;
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
    if (ticketAction_ != null) {
      output.writeMessage(1, getTicketAction());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ticketAction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTicketAction());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest other = (com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest) obj;

    if (hasTicketAction() != other.hasTicketAction()) return false;
    if (hasTicketAction()) {
      if (!getTicketAction()
          .equals(other.getTicketAction())) return false;
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
    if (hasTicketAction()) {
      hash = (37 * hash) + TICKET_ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTicketAction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest prototype) {
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
   * Protobuf type {@code api.v1alpha1.tickets.CreateTicketActionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.CreateTicketActionRequest)
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CreateTicketActionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CreateTicketActionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.newBuilder()
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
      ticketAction_ = null;
      if (ticketActionBuilder_ != null) {
        ticketActionBuilder_.dispose();
        ticketActionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_CreateTicketActionRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest result = new com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketAction_ = ticketActionBuilder_ == null
            ? ticketAction_
            : ticketActionBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.getDefaultInstance()) return this;
      if (other.hasTicketAction()) {
        mergeTicketAction(other.getTicketAction());
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
                  getTicketActionFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.TicketAction ticketAction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.TicketAction, com.tcn.cloud.api.api.commons.TicketAction.Builder, com.tcn.cloud.api.api.commons.TicketActionOrBuilder> ticketActionBuilder_;
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     * @return Whether the ticketAction field is set.
     */
    public boolean hasTicketAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     * @return The ticketAction.
     */
    public com.tcn.cloud.api.api.commons.TicketAction getTicketAction() {
      if (ticketActionBuilder_ == null) {
        return ticketAction_ == null ? com.tcn.cloud.api.api.commons.TicketAction.getDefaultInstance() : ticketAction_;
      } else {
        return ticketActionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    public Builder setTicketAction(com.tcn.cloud.api.api.commons.TicketAction value) {
      if (ticketActionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ticketAction_ = value;
      } else {
        ticketActionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    public Builder setTicketAction(
        com.tcn.cloud.api.api.commons.TicketAction.Builder builderForValue) {
      if (ticketActionBuilder_ == null) {
        ticketAction_ = builderForValue.build();
      } else {
        ticketActionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    public Builder mergeTicketAction(com.tcn.cloud.api.api.commons.TicketAction value) {
      if (ticketActionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          ticketAction_ != null &&
          ticketAction_ != com.tcn.cloud.api.api.commons.TicketAction.getDefaultInstance()) {
          getTicketActionBuilder().mergeFrom(value);
        } else {
          ticketAction_ = value;
        }
      } else {
        ticketActionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    public Builder clearTicketAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketAction_ = null;
      if (ticketActionBuilder_ != null) {
        ticketActionBuilder_.dispose();
        ticketActionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    public com.tcn.cloud.api.api.commons.TicketAction.Builder getTicketActionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTicketActionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    public com.tcn.cloud.api.api.commons.TicketActionOrBuilder getTicketActionOrBuilder() {
      if (ticketActionBuilder_ != null) {
        return ticketActionBuilder_.getMessageOrBuilder();
      } else {
        return ticketAction_ == null ?
            com.tcn.cloud.api.api.commons.TicketAction.getDefaultInstance() : ticketAction_;
      }
    }
    /**
     * <code>.api.commons.TicketAction ticket_action = 1 [json_name = "ticketAction"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.TicketAction, com.tcn.cloud.api.api.commons.TicketAction.Builder, com.tcn.cloud.api.api.commons.TicketActionOrBuilder> 
        getTicketActionFieldBuilder() {
      if (ticketActionBuilder_ == null) {
        ticketActionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.TicketAction, com.tcn.cloud.api.api.commons.TicketAction.Builder, com.tcn.cloud.api.api.commons.TicketActionOrBuilder>(
                getTicketAction(),
                getParentForChildren(),
                isClean());
        ticketAction_ = null;
      }
      return ticketActionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.CreateTicketActionRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.CreateTicketActionRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTicketActionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateTicketActionRequest>() {
    @java.lang.Override
    public CreateTicketActionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTicketActionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTicketActionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

