// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.RecordProtoPair}
 */
public final class RecordProtoPair extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.RecordProtoPair)
    RecordProtoPairOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordProtoPair.newBuilder() to construct.
  private RecordProtoPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordProtoPair() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecordProtoPair();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_RecordProtoPair_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_RecordProtoPair_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.RecordProtoPair.class, com.tcn.cloud.api.api.v0alpha.RecordProtoPair.Builder.class);
  }

  private int bitField0_;
  public static final int OLD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v0alpha.RecordProto old_;
  /**
   * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
   * @return Whether the old field is set.
   */
  @java.lang.Override
  public boolean hasOld() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
   * @return The old.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecordProto getOld() {
    return old_ == null ? com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : old_;
  }
  /**
   * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder getOldOrBuilder() {
    return old_ == null ? com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : old_;
  }

  public static final int NEW_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.RecordProto new_;
  /**
   * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
   * @return Whether the new field is set.
   */
  @java.lang.Override
  public boolean hasNew() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
   * @return The new.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecordProto getNew() {
    return new_ == null ? com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : new_;
  }
  /**
   * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder getNewOrBuilder() {
    return new_ == null ? com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : new_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getOld());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getNew());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOld());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNew());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.RecordProtoPair)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.RecordProtoPair other = (com.tcn.cloud.api.api.v0alpha.RecordProtoPair) obj;

    if (hasOld() != other.hasOld()) return false;
    if (hasOld()) {
      if (!getOld()
          .equals(other.getOld())) return false;
    }
    if (hasNew() != other.hasNew()) return false;
    if (hasNew()) {
      if (!getNew()
          .equals(other.getNew())) return false;
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
    if (hasOld()) {
      hash = (37 * hash) + OLD_FIELD_NUMBER;
      hash = (53 * hash) + getOld().hashCode();
    }
    if (hasNew()) {
      hash = (37 * hash) + NEW_FIELD_NUMBER;
      hash = (53 * hash) + getNew().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.RecordProtoPair prototype) {
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
   * Protobuf type {@code api.v0alpha.RecordProtoPair}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.RecordProtoPair)
      com.tcn.cloud.api.api.v0alpha.RecordProtoPairOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_RecordProtoPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_RecordProtoPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.RecordProtoPair.class, com.tcn.cloud.api.api.v0alpha.RecordProtoPair.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.RecordProtoPair.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOldFieldBuilder();
        getNewFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      old_ = null;
      if (oldBuilder_ != null) {
        oldBuilder_.dispose();
        oldBuilder_ = null;
      }
      new_ = null;
      if (newBuilder_ != null) {
        newBuilder_.dispose();
        newBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_RecordProtoPair_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RecordProtoPair getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.RecordProtoPair.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RecordProtoPair build() {
      com.tcn.cloud.api.api.v0alpha.RecordProtoPair result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.RecordProtoPair buildPartial() {
      com.tcn.cloud.api.api.v0alpha.RecordProtoPair result = new com.tcn.cloud.api.api.v0alpha.RecordProtoPair(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.RecordProtoPair result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.old_ = oldBuilder_ == null
            ? old_
            : oldBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.new_ = newBuilder_ == null
            ? new_
            : newBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.RecordProtoPair) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.RecordProtoPair)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.RecordProtoPair other) {
      if (other == com.tcn.cloud.api.api.v0alpha.RecordProtoPair.getDefaultInstance()) return this;
      if (other.hasOld()) {
        mergeOld(other.getOld());
      }
      if (other.hasNew()) {
        mergeNew(other.getNew());
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
                  getOldFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getNewFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.v0alpha.RecordProto old_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RecordProto, com.tcn.cloud.api.api.v0alpha.RecordProto.Builder, com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder> oldBuilder_;
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     * @return Whether the old field is set.
     */
    public boolean hasOld() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     * @return The old.
     */
    public com.tcn.cloud.api.api.v0alpha.RecordProto getOld() {
      if (oldBuilder_ == null) {
        return old_ == null ? com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : old_;
      } else {
        return oldBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    public Builder setOld(com.tcn.cloud.api.api.v0alpha.RecordProto value) {
      if (oldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        old_ = value;
      } else {
        oldBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    public Builder setOld(
        com.tcn.cloud.api.api.v0alpha.RecordProto.Builder builderForValue) {
      if (oldBuilder_ == null) {
        old_ = builderForValue.build();
      } else {
        oldBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    public Builder mergeOld(com.tcn.cloud.api.api.v0alpha.RecordProto value) {
      if (oldBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          old_ != null &&
          old_ != com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance()) {
          getOldBuilder().mergeFrom(value);
        } else {
          old_ = value;
        }
      } else {
        oldBuilder_.mergeFrom(value);
      }
      if (old_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    public Builder clearOld() {
      bitField0_ = (bitField0_ & ~0x00000001);
      old_ = null;
      if (oldBuilder_ != null) {
        oldBuilder_.dispose();
        oldBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RecordProto.Builder getOldBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOldFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder getOldOrBuilder() {
      if (oldBuilder_ != null) {
        return oldBuilder_.getMessageOrBuilder();
      } else {
        return old_ == null ?
            com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : old_;
      }
    }
    /**
     * <code>.api.v0alpha.RecordProto old = 1 [json_name = "old"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RecordProto, com.tcn.cloud.api.api.v0alpha.RecordProto.Builder, com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder> 
        getOldFieldBuilder() {
      if (oldBuilder_ == null) {
        oldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.RecordProto, com.tcn.cloud.api.api.v0alpha.RecordProto.Builder, com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder>(
                getOld(),
                getParentForChildren(),
                isClean());
        old_ = null;
      }
      return oldBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.RecordProto new_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RecordProto, com.tcn.cloud.api.api.v0alpha.RecordProto.Builder, com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder> newBuilder_;
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     * @return Whether the new field is set.
     */
    public boolean hasNew() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     * @return The new.
     */
    public com.tcn.cloud.api.api.v0alpha.RecordProto getNew() {
      if (newBuilder_ == null) {
        return new_ == null ? com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : new_;
      } else {
        return newBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    public Builder setNew(com.tcn.cloud.api.api.v0alpha.RecordProto value) {
      if (newBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        new_ = value;
      } else {
        newBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    public Builder setNew(
        com.tcn.cloud.api.api.v0alpha.RecordProto.Builder builderForValue) {
      if (newBuilder_ == null) {
        new_ = builderForValue.build();
      } else {
        newBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    public Builder mergeNew(com.tcn.cloud.api.api.v0alpha.RecordProto value) {
      if (newBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          new_ != null &&
          new_ != com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance()) {
          getNewBuilder().mergeFrom(value);
        } else {
          new_ = value;
        }
      } else {
        newBuilder_.mergeFrom(value);
      }
      if (new_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    public Builder clearNew() {
      bitField0_ = (bitField0_ & ~0x00000002);
      new_ = null;
      if (newBuilder_ != null) {
        newBuilder_.dispose();
        newBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RecordProto.Builder getNewBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNewFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder getNewOrBuilder() {
      if (newBuilder_ != null) {
        return newBuilder_.getMessageOrBuilder();
      } else {
        return new_ == null ?
            com.tcn.cloud.api.api.v0alpha.RecordProto.getDefaultInstance() : new_;
      }
    }
    /**
     * <code>.api.v0alpha.RecordProto new = 2 [json_name = "new"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.RecordProto, com.tcn.cloud.api.api.v0alpha.RecordProto.Builder, com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder> 
        getNewFieldBuilder() {
      if (newBuilder_ == null) {
        newBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.RecordProto, com.tcn.cloud.api.api.v0alpha.RecordProto.Builder, com.tcn.cloud.api.api.v0alpha.RecordProtoOrBuilder>(
                getNew(),
                getParentForChildren(),
                isClean());
        new_ = null;
      }
      return newBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.RecordProtoPair)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.RecordProtoPair)
  private static final com.tcn.cloud.api.api.v0alpha.RecordProtoPair DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.RecordProtoPair();
  }

  public static com.tcn.cloud.api.api.v0alpha.RecordProtoPair getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordProtoPair>
      PARSER = new com.google.protobuf.AbstractParser<RecordProtoPair>() {
    @java.lang.Override
    public RecordProtoPair parsePartialFrom(
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

  public static com.google.protobuf.Parser<RecordProtoPair> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordProtoPair> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RecordProtoPair getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

