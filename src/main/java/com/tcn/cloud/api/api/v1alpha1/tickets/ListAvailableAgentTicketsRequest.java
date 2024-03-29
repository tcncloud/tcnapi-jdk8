// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * ListAvailableAgentTicketsRequest -
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.ListAvailableAgentTicketsRequest}
 */
public final class ListAvailableAgentTicketsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)
    ListAvailableAgentTicketsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAvailableAgentTicketsRequest.newBuilder() to construct.
  private ListAvailableAgentTicketsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAvailableAgentTicketsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAvailableAgentTicketsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.Builder.class);
  }

  public static final int SELECT_FIELD_MASK_FIELD_NUMBER = 1;
  private com.google.protobuf.FieldMask selectFieldMask_;
  /**
   * <pre>
   *defines the ticket fields to be returned
   * </pre>
   *
   * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
   * @return Whether the selectFieldMask field is set.
   */
  @java.lang.Override
  public boolean hasSelectFieldMask() {
    return selectFieldMask_ != null;
  }
  /**
   * <pre>
   *defines the ticket fields to be returned
   * </pre>
   *
   * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
   * @return The selectFieldMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getSelectFieldMask() {
    return selectFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : selectFieldMask_;
  }
  /**
   * <pre>
   *defines the ticket fields to be returned
   * </pre>
   *
   * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getSelectFieldMaskOrBuilder() {
    return selectFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : selectFieldMask_;
  }

  public static final int AVAILABLE_FILTER_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter availableFilter_;
  /**
   * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
   * @return Whether the availableFilter field is set.
   */
  @java.lang.Override
  public boolean hasAvailableFilter() {
    return availableFilter_ != null;
  }
  /**
   * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
   * @return The availableFilter.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter getAvailableFilter() {
    return availableFilter_ == null ? com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.getDefaultInstance() : availableFilter_;
  }
  /**
   * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilterOrBuilder getAvailableFilterOrBuilder() {
    return availableFilter_ == null ? com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.getDefaultInstance() : availableFilter_;
  }

  public static final int AGENT_VIEW_LIMIT_FIELD_NUMBER = 3;
  private long agentViewLimit_ = 0L;
  /**
   * <pre>
   *agent profile setting
   * </pre>
   *
   * <code>int64 agent_view_limit = 3 [json_name = "agentViewLimit"];</code>
   * @return The agentViewLimit.
   */
  @java.lang.Override
  public long getAgentViewLimit() {
    return agentViewLimit_;
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
    if (selectFieldMask_ != null) {
      output.writeMessage(1, getSelectFieldMask());
    }
    if (availableFilter_ != null) {
      output.writeMessage(2, getAvailableFilter());
    }
    if (agentViewLimit_ != 0L) {
      output.writeInt64(3, agentViewLimit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (selectFieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSelectFieldMask());
    }
    if (availableFilter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAvailableFilter());
    }
    if (agentViewLimit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, agentViewLimit_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest other = (com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest) obj;

    if (hasSelectFieldMask() != other.hasSelectFieldMask()) return false;
    if (hasSelectFieldMask()) {
      if (!getSelectFieldMask()
          .equals(other.getSelectFieldMask())) return false;
    }
    if (hasAvailableFilter() != other.hasAvailableFilter()) return false;
    if (hasAvailableFilter()) {
      if (!getAvailableFilter()
          .equals(other.getAvailableFilter())) return false;
    }
    if (getAgentViewLimit()
        != other.getAgentViewLimit()) return false;
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
    if (hasSelectFieldMask()) {
      hash = (37 * hash) + SELECT_FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getSelectFieldMask().hashCode();
    }
    if (hasAvailableFilter()) {
      hash = (37 * hash) + AVAILABLE_FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableFilter().hashCode();
    }
    hash = (37 * hash) + AGENT_VIEW_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAgentViewLimit());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest prototype) {
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
   * ListAvailableAgentTicketsRequest -
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.ListAvailableAgentTicketsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.newBuilder()
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
      selectFieldMask_ = null;
      if (selectFieldMaskBuilder_ != null) {
        selectFieldMaskBuilder_.dispose();
        selectFieldMaskBuilder_ = null;
      }
      availableFilter_ = null;
      if (availableFilterBuilder_ != null) {
        availableFilterBuilder_.dispose();
        availableFilterBuilder_ = null;
      }
      agentViewLimit_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAvailableAgentTicketsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest result = new com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selectFieldMask_ = selectFieldMaskBuilder_ == null
            ? selectFieldMask_
            : selectFieldMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.availableFilter_ = availableFilterBuilder_ == null
            ? availableFilter_
            : availableFilterBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.agentViewLimit_ = agentViewLimit_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.getDefaultInstance()) return this;
      if (other.hasSelectFieldMask()) {
        mergeSelectFieldMask(other.getSelectFieldMask());
      }
      if (other.hasAvailableFilter()) {
        mergeAvailableFilter(other.getAvailableFilter());
      }
      if (other.getAgentViewLimit() != 0L) {
        setAgentViewLimit(other.getAgentViewLimit());
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
                  getSelectFieldMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAvailableFilterFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              agentViewLimit_ = input.readInt64();
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

    private com.google.protobuf.FieldMask selectFieldMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> selectFieldMaskBuilder_;
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     * @return Whether the selectFieldMask field is set.
     */
    public boolean hasSelectFieldMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     * @return The selectFieldMask.
     */
    public com.google.protobuf.FieldMask getSelectFieldMask() {
      if (selectFieldMaskBuilder_ == null) {
        return selectFieldMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : selectFieldMask_;
      } else {
        return selectFieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    public Builder setSelectFieldMask(com.google.protobuf.FieldMask value) {
      if (selectFieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        selectFieldMask_ = value;
      } else {
        selectFieldMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    public Builder setSelectFieldMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (selectFieldMaskBuilder_ == null) {
        selectFieldMask_ = builderForValue.build();
      } else {
        selectFieldMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    public Builder mergeSelectFieldMask(com.google.protobuf.FieldMask value) {
      if (selectFieldMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          selectFieldMask_ != null &&
          selectFieldMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getSelectFieldMaskBuilder().mergeFrom(value);
        } else {
          selectFieldMask_ = value;
        }
      } else {
        selectFieldMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    public Builder clearSelectFieldMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      selectFieldMask_ = null;
      if (selectFieldMaskBuilder_ != null) {
        selectFieldMaskBuilder_.dispose();
        selectFieldMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getSelectFieldMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSelectFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getSelectFieldMaskOrBuilder() {
      if (selectFieldMaskBuilder_ != null) {
        return selectFieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return selectFieldMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : selectFieldMask_;
      }
    }
    /**
     * <pre>
     *defines the ticket fields to be returned
     * </pre>
     *
     * <code>.google.protobuf.FieldMask select_field_mask = 1 [json_name = "selectFieldMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getSelectFieldMaskFieldBuilder() {
      if (selectFieldMaskBuilder_ == null) {
        selectFieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getSelectFieldMask(),
                getParentForChildren(),
                isClean());
        selectFieldMask_ = null;
      }
      return selectFieldMaskBuilder_;
    }

    private com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter availableFilter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter, com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.Builder, com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilterOrBuilder> availableFilterBuilder_;
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     * @return Whether the availableFilter field is set.
     */
    public boolean hasAvailableFilter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     * @return The availableFilter.
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter getAvailableFilter() {
      if (availableFilterBuilder_ == null) {
        return availableFilter_ == null ? com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.getDefaultInstance() : availableFilter_;
      } else {
        return availableFilterBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    public Builder setAvailableFilter(com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter value) {
      if (availableFilterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        availableFilter_ = value;
      } else {
        availableFilterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    public Builder setAvailableFilter(
        com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.Builder builderForValue) {
      if (availableFilterBuilder_ == null) {
        availableFilter_ = builderForValue.build();
      } else {
        availableFilterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    public Builder mergeAvailableFilter(com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter value) {
      if (availableFilterBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          availableFilter_ != null &&
          availableFilter_ != com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.getDefaultInstance()) {
          getAvailableFilterBuilder().mergeFrom(value);
        } else {
          availableFilter_ = value;
        }
      } else {
        availableFilterBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    public Builder clearAvailableFilter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      availableFilter_ = null;
      if (availableFilterBuilder_ != null) {
        availableFilterBuilder_.dispose();
        availableFilterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.Builder getAvailableFilterBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAvailableFilterFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilterOrBuilder getAvailableFilterOrBuilder() {
      if (availableFilterBuilder_ != null) {
        return availableFilterBuilder_.getMessageOrBuilder();
      } else {
        return availableFilter_ == null ?
            com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.getDefaultInstance() : availableFilter_;
      }
    }
    /**
     * <code>.api.v1alpha1.tickets.AvailableTicketsFilter available_filter = 2 [json_name = "availableFilter"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter, com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.Builder, com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilterOrBuilder> 
        getAvailableFilterFieldBuilder() {
      if (availableFilterBuilder_ == null) {
        availableFilterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter, com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilter.Builder, com.tcn.cloud.api.api.v1alpha1.tickets.AvailableTicketsFilterOrBuilder>(
                getAvailableFilter(),
                getParentForChildren(),
                isClean());
        availableFilter_ = null;
      }
      return availableFilterBuilder_;
    }

    private long agentViewLimit_ ;
    /**
     * <pre>
     *agent profile setting
     * </pre>
     *
     * <code>int64 agent_view_limit = 3 [json_name = "agentViewLimit"];</code>
     * @return The agentViewLimit.
     */
    @java.lang.Override
    public long getAgentViewLimit() {
      return agentViewLimit_;
    }
    /**
     * <pre>
     *agent profile setting
     * </pre>
     *
     * <code>int64 agent_view_limit = 3 [json_name = "agentViewLimit"];</code>
     * @param value The agentViewLimit to set.
     * @return This builder for chaining.
     */
    public Builder setAgentViewLimit(long value) {

      agentViewLimit_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *agent profile setting
     * </pre>
     *
     * <code>int64 agent_view_limit = 3 [json_name = "agentViewLimit"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentViewLimit() {
      bitField0_ = (bitField0_ & ~0x00000004);
      agentViewLimit_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.ListAvailableAgentTicketsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAvailableAgentTicketsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListAvailableAgentTicketsRequest>() {
    @java.lang.Override
    public ListAvailableAgentTicketsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAvailableAgentTicketsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAvailableAgentTicketsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

