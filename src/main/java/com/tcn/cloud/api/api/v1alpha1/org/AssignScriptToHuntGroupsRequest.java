// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * The request message for AssignScriptToHuntGroups
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.AssignScriptToHuntGroupsRequest}
 */
public final class AssignScriptToHuntGroupsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.AssignScriptToHuntGroupsRequest)
    AssignScriptToHuntGroupsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignScriptToHuntGroupsRequest.newBuilder() to construct.
  private AssignScriptToHuntGroupsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignScriptToHuntGroupsRequest() {
    huntGroupSids_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignScriptToHuntGroupsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_AssignScriptToHuntGroupsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_AssignScriptToHuntGroupsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.Builder.class);
  }

  public static final int SCRIPT_SID_FIELD_NUMBER = 1;
  private long scriptSid_ = 0L;
  /**
   * <pre>
   * The script to be assigned
   * </pre>
   *
   * <code>int64 script_sid = 1 [json_name = "scriptSid"];</code>
   * @return The scriptSid.
   */
  @java.lang.Override
  public long getScriptSid() {
    return scriptSid_;
  }

  public static final int HUNT_GROUP_SIDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.LongList huntGroupSids_;
  /**
   * <pre>
   * The target hunt groups to assign the specified script
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
   * @return A list containing the huntGroupSids.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getHuntGroupSidsList() {
    return huntGroupSids_;
  }
  /**
   * <pre>
   * The target hunt groups to assign the specified script
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
   * @return The count of huntGroupSids.
   */
  public int getHuntGroupSidsCount() {
    return huntGroupSids_.size();
  }
  /**
   * <pre>
   * The target hunt groups to assign the specified script
   * </pre>
   *
   * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
   * @param index The index of the element to return.
   * @return The huntGroupSids at the given index.
   */
  public long getHuntGroupSids(int index) {
    return huntGroupSids_.getLong(index);
  }
  private int huntGroupSidsMemoizedSerializedSize = -1;

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
    if (scriptSid_ != 0L) {
      output.writeInt64(1, scriptSid_);
    }
    if (getHuntGroupSidsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(huntGroupSidsMemoizedSerializedSize);
    }
    for (int i = 0; i < huntGroupSids_.size(); i++) {
      output.writeInt64NoTag(huntGroupSids_.getLong(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scriptSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, scriptSid_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < huntGroupSids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(huntGroupSids_.getLong(i));
      }
      size += dataSize;
      if (!getHuntGroupSidsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      huntGroupSidsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest other = (com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest) obj;

    if (getScriptSid()
        != other.getScriptSid()) return false;
    if (!getHuntGroupSidsList()
        .equals(other.getHuntGroupSidsList())) return false;
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
    hash = (37 * hash) + SCRIPT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScriptSid());
    if (getHuntGroupSidsCount() > 0) {
      hash = (37 * hash) + HUNT_GROUP_SIDS_FIELD_NUMBER;
      hash = (53 * hash) + getHuntGroupSidsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest prototype) {
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
   * The request message for AssignScriptToHuntGroups
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.AssignScriptToHuntGroupsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.AssignScriptToHuntGroupsRequest)
      com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_AssignScriptToHuntGroupsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_AssignScriptToHuntGroupsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.class, com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.newBuilder()
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
      scriptSid_ = 0L;
      huntGroupSids_ = emptyLongList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_AssignScriptToHuntGroupsRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest result = new com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        huntGroupSids_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.huntGroupSids_ = huntGroupSids_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.scriptSid_ = scriptSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest.getDefaultInstance()) return this;
      if (other.getScriptSid() != 0L) {
        setScriptSid(other.getScriptSid());
      }
      if (!other.huntGroupSids_.isEmpty()) {
        if (huntGroupSids_.isEmpty()) {
          huntGroupSids_ = other.huntGroupSids_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureHuntGroupSidsIsMutable();
          huntGroupSids_.addAll(other.huntGroupSids_);
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
              scriptSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              long v = input.readInt64();
              ensureHuntGroupSidsIsMutable();
              huntGroupSids_.addLong(v);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureHuntGroupSidsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                huntGroupSids_.addLong(input.readInt64());
              }
              input.popLimit(limit);
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

    private long scriptSid_ ;
    /**
     * <pre>
     * The script to be assigned
     * </pre>
     *
     * <code>int64 script_sid = 1 [json_name = "scriptSid"];</code>
     * @return The scriptSid.
     */
    @java.lang.Override
    public long getScriptSid() {
      return scriptSid_;
    }
    /**
     * <pre>
     * The script to be assigned
     * </pre>
     *
     * <code>int64 script_sid = 1 [json_name = "scriptSid"];</code>
     * @param value The scriptSid to set.
     * @return This builder for chaining.
     */
    public Builder setScriptSid(long value) {

      scriptSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The script to be assigned
     * </pre>
     *
     * <code>int64 script_sid = 1 [json_name = "scriptSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScriptSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      scriptSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList huntGroupSids_ = emptyLongList();
    private void ensureHuntGroupSidsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        huntGroupSids_ = mutableCopy(huntGroupSids_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @return A list containing the huntGroupSids.
     */
    public java.util.List<java.lang.Long>
        getHuntGroupSidsList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(huntGroupSids_) : huntGroupSids_;
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @return The count of huntGroupSids.
     */
    public int getHuntGroupSidsCount() {
      return huntGroupSids_.size();
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @param index The index of the element to return.
     * @return The huntGroupSids at the given index.
     */
    public long getHuntGroupSids(int index) {
      return huntGroupSids_.getLong(index);
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @param index The index to set the value at.
     * @param value The huntGroupSids to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupSids(
        int index, long value) {

      ensureHuntGroupSidsIsMutable();
      huntGroupSids_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @param value The huntGroupSids to add.
     * @return This builder for chaining.
     */
    public Builder addHuntGroupSids(long value) {

      ensureHuntGroupSidsIsMutable();
      huntGroupSids_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @param values The huntGroupSids to add.
     * @return This builder for chaining.
     */
    public Builder addAllHuntGroupSids(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureHuntGroupSidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, huntGroupSids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The target hunt groups to assign the specified script
     * </pre>
     *
     * <code>repeated int64 hunt_group_sids = 2 [json_name = "huntGroupSids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHuntGroupSids() {
      huntGroupSids_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.AssignScriptToHuntGroupsRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.AssignScriptToHuntGroupsRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignScriptToHuntGroupsRequest>
      PARSER = new com.google.protobuf.AbstractParser<AssignScriptToHuntGroupsRequest>() {
    @java.lang.Override
    public AssignScriptToHuntGroupsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssignScriptToHuntGroupsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignScriptToHuntGroupsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.AssignScriptToHuntGroupsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

