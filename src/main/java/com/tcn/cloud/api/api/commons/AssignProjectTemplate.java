// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.AssignProjectTemplate}
 */
@java.lang.Deprecated public final class AssignProjectTemplate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.AssignProjectTemplate)
    AssignProjectTemplateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignProjectTemplate.newBuilder() to construct.
  private AssignProjectTemplate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignProjectTemplate() {
    ticketTemplateId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignProjectTemplate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_AssignProjectTemplate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_AssignProjectTemplate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.AssignProjectTemplate.class, com.tcn.cloud.api.api.commons.AssignProjectTemplate.Builder.class);
  }

  public static final int TICKET_TEMPLATE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList ticketTemplateId_;
  /**
   * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
   * @return A list containing the ticketTemplateId.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getTicketTemplateIdList() {
    return ticketTemplateId_;
  }
  /**
   * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
   * @return The count of ticketTemplateId.
   */
  public int getTicketTemplateIdCount() {
    return ticketTemplateId_.size();
  }
  /**
   * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
   * @param index The index of the element to return.
   * @return The ticketTemplateId at the given index.
   */
  public long getTicketTemplateId(int index) {
    return ticketTemplateId_.getLong(index);
  }
  private int ticketTemplateIdMemoizedSerializedSize = -1;

  public static final int PROJECT_ID_FIELD_NUMBER = 2;
  private long projectId_ = 0L;
  /**
   * <code>int64 project_id = 2 [json_name = "projectId", jstype = JS_STRING];</code>
   * @return The projectId.
   */
  @java.lang.Override
  public long getProjectId() {
    return projectId_;
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
    getSerializedSize();
    if (getTicketTemplateIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(ticketTemplateIdMemoizedSerializedSize);
    }
    for (int i = 0; i < ticketTemplateId_.size(); i++) {
      output.writeInt64NoTag(ticketTemplateId_.getLong(i));
    }
    if (projectId_ != 0L) {
      output.writeInt64(2, projectId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ticketTemplateId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(ticketTemplateId_.getLong(i));
      }
      size += dataSize;
      if (!getTicketTemplateIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      ticketTemplateIdMemoizedSerializedSize = dataSize;
    }
    if (projectId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, projectId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.AssignProjectTemplate)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.AssignProjectTemplate other = (com.tcn.cloud.api.api.commons.AssignProjectTemplate) obj;

    if (!getTicketTemplateIdList()
        .equals(other.getTicketTemplateIdList())) return false;
    if (getProjectId()
        != other.getProjectId()) return false;
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
    if (getTicketTemplateIdCount() > 0) {
      hash = (37 * hash) + TICKET_TEMPLATE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTicketTemplateIdList().hashCode();
    }
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProjectId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.AssignProjectTemplate prototype) {
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
   * Protobuf type {@code api.commons.AssignProjectTemplate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.AssignProjectTemplate)
      com.tcn.cloud.api.api.commons.AssignProjectTemplateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_AssignProjectTemplate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_AssignProjectTemplate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.AssignProjectTemplate.class, com.tcn.cloud.api.api.commons.AssignProjectTemplate.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.AssignProjectTemplate.newBuilder()
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
      ticketTemplateId_ = emptyLongList();
      projectId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_AssignProjectTemplate_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AssignProjectTemplate getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.AssignProjectTemplate.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AssignProjectTemplate build() {
      com.tcn.cloud.api.api.commons.AssignProjectTemplate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.AssignProjectTemplate buildPartial() {
      com.tcn.cloud.api.api.commons.AssignProjectTemplate result = new com.tcn.cloud.api.api.commons.AssignProjectTemplate(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.AssignProjectTemplate result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        ticketTemplateId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ticketTemplateId_ = ticketTemplateId_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.AssignProjectTemplate result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.projectId_ = projectId_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.AssignProjectTemplate) {
        return mergeFrom((com.tcn.cloud.api.api.commons.AssignProjectTemplate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.AssignProjectTemplate other) {
      if (other == com.tcn.cloud.api.api.commons.AssignProjectTemplate.getDefaultInstance()) return this;
      if (!other.ticketTemplateId_.isEmpty()) {
        if (ticketTemplateId_.isEmpty()) {
          ticketTemplateId_ = other.ticketTemplateId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTicketTemplateIdIsMutable();
          ticketTemplateId_.addAll(other.ticketTemplateId_);
        }
        onChanged();
      }
      if (other.getProjectId() != 0L) {
        setProjectId(other.getProjectId());
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
              long v = input.readInt64();
              ensureTicketTemplateIdIsMutable();
              ticketTemplateId_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureTicketTemplateIdIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                ticketTemplateId_.addLong(input.readInt64());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              projectId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private com.google.protobuf.Internal.LongList ticketTemplateId_ = emptyLongList();
    private void ensureTicketTemplateIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ticketTemplateId_ = mutableCopy(ticketTemplateId_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @return A list containing the ticketTemplateId.
     */
    public java.util.List<java.lang.Long>
        getTicketTemplateIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(ticketTemplateId_) : ticketTemplateId_;
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @return The count of ticketTemplateId.
     */
    public int getTicketTemplateIdCount() {
      return ticketTemplateId_.size();
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @param index The index of the element to return.
     * @return The ticketTemplateId at the given index.
     */
    public long getTicketTemplateId(int index) {
      return ticketTemplateId_.getLong(index);
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @param index The index to set the value at.
     * @param value The ticketTemplateId to set.
     * @return This builder for chaining.
     */
    public Builder setTicketTemplateId(
        int index, long value) {

      ensureTicketTemplateIdIsMutable();
      ticketTemplateId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @param value The ticketTemplateId to add.
     * @return This builder for chaining.
     */
    public Builder addTicketTemplateId(long value) {

      ensureTicketTemplateIdIsMutable();
      ticketTemplateId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @param values The ticketTemplateId to add.
     * @return This builder for chaining.
     */
    public Builder addAllTicketTemplateId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTicketTemplateIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ticketTemplateId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 ticket_template_id = 1 [json_name = "ticketTemplateId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketTemplateId() {
      ticketTemplateId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private long projectId_ ;
    /**
     * <code>int64 project_id = 2 [json_name = "projectId", jstype = JS_STRING];</code>
     * @return The projectId.
     */
    @java.lang.Override
    public long getProjectId() {
      return projectId_;
    }
    /**
     * <code>int64 project_id = 2 [json_name = "projectId", jstype = JS_STRING];</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(long value) {

      projectId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 project_id = 2 [json_name = "projectId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      projectId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.commons.AssignProjectTemplate)
  }

  // @@protoc_insertion_point(class_scope:api.commons.AssignProjectTemplate)
  private static final com.tcn.cloud.api.api.commons.AssignProjectTemplate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.AssignProjectTemplate();
  }

  public static com.tcn.cloud.api.api.commons.AssignProjectTemplate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignProjectTemplate>
      PARSER = new com.google.protobuf.AbstractParser<AssignProjectTemplate>() {
    @java.lang.Override
    public AssignProjectTemplate parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignProjectTemplate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignProjectTemplate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.AssignProjectTemplate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

