// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/tickets/ticket.proto

package com.tcn.cloud.api.api.v1alpha1.tickets;

/**
 * <pre>
 * ListAgentTicketsRequest -
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.tickets.ListAgentTicketsRequest}
 */
public final class ListAgentTicketsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.tickets.ListAgentTicketsRequest)
    ListAgentTicketsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListAgentTicketsRequest.newBuilder() to construct.
  private ListAgentTicketsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListAgentTicketsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListAgentTicketsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAgentTicketsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAgentTicketsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.Builder.class);
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

  public static final int FILTER_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask filterMask_;
  /**
   * <pre>
   *defines the search by field
   * </pre>
   *
   * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
   * @return Whether the filterMask field is set.
   */
  @java.lang.Override
  public boolean hasFilterMask() {
    return filterMask_ != null;
  }
  /**
   * <pre>
   *defines the search by field
   * </pre>
   *
   * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
   * @return The filterMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getFilterMask() {
    return filterMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : filterMask_;
  }
  /**
   * <pre>
   *defines the search by field
   * </pre>
   *
   * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getFilterMaskOrBuilder() {
    return filterMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : filterMask_;
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
    if (filterMask_ != null) {
      output.writeMessage(2, getFilterMask());
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
    if (filterMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFilterMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest other = (com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest) obj;

    if (hasSelectFieldMask() != other.hasSelectFieldMask()) return false;
    if (hasSelectFieldMask()) {
      if (!getSelectFieldMask()
          .equals(other.getSelectFieldMask())) return false;
    }
    if (hasFilterMask() != other.hasFilterMask()) return false;
    if (hasFilterMask()) {
      if (!getFilterMask()
          .equals(other.getFilterMask())) return false;
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
    if (hasSelectFieldMask()) {
      hash = (37 * hash) + SELECT_FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getSelectFieldMask().hashCode();
    }
    if (hasFilterMask()) {
      hash = (37 * hash) + FILTER_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFilterMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest prototype) {
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
   * ListAgentTicketsRequest -
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.tickets.ListAgentTicketsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.tickets.ListAgentTicketsRequest)
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAgentTicketsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAgentTicketsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.class, com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.newBuilder()
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
      filterMask_ = null;
      if (filterMaskBuilder_ != null) {
        filterMaskBuilder_.dispose();
        filterMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.TicketProto.internal_static_api_v1alpha1_tickets_ListAgentTicketsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest result = new com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selectFieldMask_ = selectFieldMaskBuilder_ == null
            ? selectFieldMask_
            : selectFieldMaskBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filterMask_ = filterMaskBuilder_ == null
            ? filterMask_
            : filterMaskBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.getDefaultInstance()) return this;
      if (other.hasSelectFieldMask()) {
        mergeSelectFieldMask(other.getSelectFieldMask());
      }
      if (other.hasFilterMask()) {
        mergeFilterMask(other.getFilterMask());
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
                  getFilterMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.google.protobuf.FieldMask filterMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> filterMaskBuilder_;
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     * @return Whether the filterMask field is set.
     */
    public boolean hasFilterMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     * @return The filterMask.
     */
    public com.google.protobuf.FieldMask getFilterMask() {
      if (filterMaskBuilder_ == null) {
        return filterMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : filterMask_;
      } else {
        return filterMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    public Builder setFilterMask(com.google.protobuf.FieldMask value) {
      if (filterMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filterMask_ = value;
      } else {
        filterMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    public Builder setFilterMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (filterMaskBuilder_ == null) {
        filterMask_ = builderForValue.build();
      } else {
        filterMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    public Builder mergeFilterMask(com.google.protobuf.FieldMask value) {
      if (filterMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          filterMask_ != null &&
          filterMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getFilterMaskBuilder().mergeFrom(value);
        } else {
          filterMask_ = value;
        }
      } else {
        filterMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    public Builder clearFilterMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      filterMask_ = null;
      if (filterMaskBuilder_ != null) {
        filterMaskBuilder_.dispose();
        filterMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getFilterMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getFilterMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getFilterMaskOrBuilder() {
      if (filterMaskBuilder_ != null) {
        return filterMaskBuilder_.getMessageOrBuilder();
      } else {
        return filterMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : filterMask_;
      }
    }
    /**
     * <pre>
     *defines the search by field
     * </pre>
     *
     * <code>.google.protobuf.FieldMask filter_mask = 2 [json_name = "filterMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getFilterMaskFieldBuilder() {
      if (filterMaskBuilder_ == null) {
        filterMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getFilterMask(),
                getParentForChildren(),
                isClean());
        filterMask_ = null;
      }
      return filterMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.tickets.ListAgentTicketsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.tickets.ListAgentTicketsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAgentTicketsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListAgentTicketsRequest>() {
    @java.lang.Override
    public ListAgentTicketsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAgentTicketsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAgentTicketsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

