// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the ListProgramNodesBySid RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListProgramNodesBySidReq}
 */
public final class ListProgramNodesBySidReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListProgramNodesBySidReq)
    ListProgramNodesBySidReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListProgramNodesBySidReq.newBuilder() to construct.
  private ListProgramNodesBySidReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListProgramNodesBySidReq() {
    programNodeSids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListProgramNodesBySidReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListProgramNodesBySidReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListProgramNodesBySidReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.Builder.class);
  }

  public static final int PROGRAM_NODE_SIDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList programNodeSids_;
  /**
   * <pre>
   * IDs of the program nodes to list.
   * </pre>
   *
   * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
   * @return A list containing the programNodeSids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getProgramNodeSidsList() {
    return programNodeSids_;
  }
  /**
   * <pre>
   * IDs of the program nodes to list.
   * </pre>
   *
   * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
   * @return The count of programNodeSids.
   */
  public int getProgramNodeSidsCount() {
    return programNodeSids_.size();
  }
  /**
   * <pre>
   * IDs of the program nodes to list.
   * </pre>
   *
   * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
   * @param index The index of the element to return.
   * @return The programNodeSids at the given index.
   */
  public long getProgramNodeSids(int index) {
    return programNodeSids_.getLong(index);
  }
  private int programNodeSidsMemoizedSerializedSize = -1;

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
    if (getProgramNodeSidsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(programNodeSidsMemoizedSerializedSize);
    }
    for (int i = 0; i < programNodeSids_.size(); i++) {
      output.writeInt64NoTag(programNodeSids_.getLong(i));
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
      for (int i = 0; i < programNodeSids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(programNodeSids_.getLong(i));
      }
      size += dataSize;
      if (!getProgramNodeSidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      programNodeSidsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq) obj;

    if (!getProgramNodeSidsList()
        .equals(other.getProgramNodeSidsList())) return false;
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
    if (getProgramNodeSidsCount() > 0) {
      hash = (37 * hash) + PROGRAM_NODE_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getProgramNodeSidsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq prototype) {
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
   * Request message for the ListProgramNodesBySid RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListProgramNodesBySidReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListProgramNodesBySidReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListProgramNodesBySidReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListProgramNodesBySidReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.newBuilder()
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
      programNodeSids_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListProgramNodesBySidReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        programNodeSids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.programNodeSids_ = programNodeSids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq.getDefaultInstance()) return this;
      if (!other.programNodeSids_.isEmpty()) {
        if (programNodeSids_.isEmpty()) {
          programNodeSids_ = other.programNodeSids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProgramNodeSidsIsMutable();
          programNodeSids_.addAll(other.programNodeSids_);
        }
        onChanged();
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
              ensureProgramNodeSidsIsMutable();
              programNodeSids_.addLong(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureProgramNodeSidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                programNodeSids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private com.google.protobuf.Internal.LongList programNodeSids_ = emptyLongList();
    private void ensureProgramNodeSidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        programNodeSids_ = mutableCopy(programNodeSids_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @return A list containing the programNodeSids.
     */
    public java.util.List<java.lang.Long>
        getProgramNodeSidsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(programNodeSids_) : programNodeSids_;
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @return The count of programNodeSids.
     */
    public int getProgramNodeSidsCount() {
      return programNodeSids_.size();
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @param index The index of the element to return.
     * @return The programNodeSids at the given index.
     */
    public long getProgramNodeSids(int index) {
      return programNodeSids_.getLong(index);
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @param index The index to set the value at.
     * @param value The programNodeSids to set.
     * @return This builder for chaining.
     */
    public Builder setProgramNodeSids(
        int index, long value) {

      ensureProgramNodeSidsIsMutable();
      programNodeSids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @param value The programNodeSids to add.
     * @return This builder for chaining.
     */
    public Builder addProgramNodeSids(long value) {

      ensureProgramNodeSidsIsMutable();
      programNodeSids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @param values The programNodeSids to add.
     * @return This builder for chaining.
     */
    public Builder addAllProgramNodeSids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureProgramNodeSidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, programNodeSids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * IDs of the program nodes to list.
     * </pre>
     *
     * <code>repeated int64 program_node_sids = 1 [json_name = "programNodeSids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProgramNodeSids() {
      programNodeSids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListProgramNodesBySidReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListProgramNodesBySidReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListProgramNodesBySidReq>
      PARSER = new com.google.protobuf.AbstractParser<ListProgramNodesBySidReq>() {
    @java.lang.Override
    public ListProgramNodesBySidReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListProgramNodesBySidReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListProgramNodesBySidReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListProgramNodesBySidReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

