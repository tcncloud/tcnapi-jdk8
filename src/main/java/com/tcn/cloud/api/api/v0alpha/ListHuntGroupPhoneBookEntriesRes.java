// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response message for the ListHuntGroupPhoneBookEntries RPC
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListHuntGroupPhoneBookEntriesRes}
 */
public final class ListHuntGroupPhoneBookEntriesRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListHuntGroupPhoneBookEntriesRes)
    ListHuntGroupPhoneBookEntriesResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListHuntGroupPhoneBookEntriesRes.newBuilder() to construct.
  private ListHuntGroupPhoneBookEntriesRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListHuntGroupPhoneBookEntriesRes() {
    phoneBookEntries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListHuntGroupPhoneBookEntriesRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListHuntGroupPhoneBookEntriesRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListHuntGroupPhoneBookEntriesRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.class, com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.Builder.class);
  }

  public static final int PHONE_BOOK_ENTRIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry> phoneBookEntries_;
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry> getPhoneBookEntriesList() {
    return phoneBookEntries_;
  }
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder> 
      getPhoneBookEntriesOrBuilderList() {
    return phoneBookEntries_;
  }
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  @java.lang.Override
  public int getPhoneBookEntriesCount() {
    return phoneBookEntries_.size();
  }
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBookEntry getPhoneBookEntries(int index) {
    return phoneBookEntries_.get(index);
  }
  /**
   * <pre>
   * The list of phone book entries
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder getPhoneBookEntriesOrBuilder(
      int index) {
    return phoneBookEntries_.get(index);
  }

  public static final int HUNT_GROUP_SID_FIELD_NUMBER = 2;
  private long huntGroupSid_ = 0L;
  /**
   * <pre>
   * This field is set, since the entry type is 'Hunt Group"
   * </pre>
   *
   * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  @java.lang.Override
  public long getHuntGroupSid() {
    return huntGroupSid_;
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
    for (int i = 0; i < phoneBookEntries_.size(); i++) {
      output.writeMessage(1, phoneBookEntries_.get(i));
    }
    if (huntGroupSid_ != 0L) {
      output.writeInt64(2, huntGroupSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < phoneBookEntries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, phoneBookEntries_.get(i));
    }
    if (huntGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, huntGroupSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes other = (com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes) obj;

    if (!getPhoneBookEntriesList()
        .equals(other.getPhoneBookEntriesList())) return false;
    if (getHuntGroupSid()
        != other.getHuntGroupSid()) return false;
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
    if (getPhoneBookEntriesCount() > 0) {
      hash = (37 * hash) + PHONE_BOOK_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getPhoneBookEntriesList().hashCode();
    }
    hash = (37 * hash) + HUNT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHuntGroupSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes prototype) {
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
   * Response message for the ListHuntGroupPhoneBookEntries RPC
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListHuntGroupPhoneBookEntriesRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListHuntGroupPhoneBookEntriesRes)
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListHuntGroupPhoneBookEntriesRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListHuntGroupPhoneBookEntriesRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.class, com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.newBuilder()
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
      if (phoneBookEntriesBuilder_ == null) {
        phoneBookEntries_ = java.util.Collections.emptyList();
      } else {
        phoneBookEntries_ = null;
        phoneBookEntriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      huntGroupSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListHuntGroupPhoneBookEntriesRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes build() {
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes result = new com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes result) {
      if (phoneBookEntriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          phoneBookEntries_ = java.util.Collections.unmodifiableList(phoneBookEntries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.phoneBookEntries_ = phoneBookEntries_;
      } else {
        result.phoneBookEntries_ = phoneBookEntriesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.huntGroupSid_ = huntGroupSid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes.getDefaultInstance()) return this;
      if (phoneBookEntriesBuilder_ == null) {
        if (!other.phoneBookEntries_.isEmpty()) {
          if (phoneBookEntries_.isEmpty()) {
            phoneBookEntries_ = other.phoneBookEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePhoneBookEntriesIsMutable();
            phoneBookEntries_.addAll(other.phoneBookEntries_);
          }
          onChanged();
        }
      } else {
        if (!other.phoneBookEntries_.isEmpty()) {
          if (phoneBookEntriesBuilder_.isEmpty()) {
            phoneBookEntriesBuilder_.dispose();
            phoneBookEntriesBuilder_ = null;
            phoneBookEntries_ = other.phoneBookEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            phoneBookEntriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPhoneBookEntriesFieldBuilder() : null;
          } else {
            phoneBookEntriesBuilder_.addAllMessages(other.phoneBookEntries_);
          }
        }
      }
      if (other.getHuntGroupSid() != 0L) {
        setHuntGroupSid(other.getHuntGroupSid());
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
              com.tcn.cloud.api.api.v0alpha.PhoneBookEntry m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.parser(),
                      extensionRegistry);
              if (phoneBookEntriesBuilder_ == null) {
                ensurePhoneBookEntriesIsMutable();
                phoneBookEntries_.add(m);
              } else {
                phoneBookEntriesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 16: {
              huntGroupSid_ = input.readInt64();
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry> phoneBookEntries_ =
      java.util.Collections.emptyList();
    private void ensurePhoneBookEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        phoneBookEntries_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry>(phoneBookEntries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhoneBookEntry, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder> phoneBookEntriesBuilder_;

    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry> getPhoneBookEntriesList() {
      if (phoneBookEntriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(phoneBookEntries_);
      } else {
        return phoneBookEntriesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public int getPhoneBookEntriesCount() {
      if (phoneBookEntriesBuilder_ == null) {
        return phoneBookEntries_.size();
      } else {
        return phoneBookEntriesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBookEntry getPhoneBookEntries(int index) {
      if (phoneBookEntriesBuilder_ == null) {
        return phoneBookEntries_.get(index);
      } else {
        return phoneBookEntriesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder setPhoneBookEntries(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry value) {
      if (phoneBookEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.set(index, value);
        onChanged();
      } else {
        phoneBookEntriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder setPhoneBookEntries(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder builderForValue) {
      if (phoneBookEntriesBuilder_ == null) {
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.set(index, builderForValue.build());
        onChanged();
      } else {
        phoneBookEntriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder addPhoneBookEntries(com.tcn.cloud.api.api.v0alpha.PhoneBookEntry value) {
      if (phoneBookEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.add(value);
        onChanged();
      } else {
        phoneBookEntriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder addPhoneBookEntries(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry value) {
      if (phoneBookEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.add(index, value);
        onChanged();
      } else {
        phoneBookEntriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder addPhoneBookEntries(
        com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder builderForValue) {
      if (phoneBookEntriesBuilder_ == null) {
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.add(builderForValue.build());
        onChanged();
      } else {
        phoneBookEntriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder addPhoneBookEntries(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder builderForValue) {
      if (phoneBookEntriesBuilder_ == null) {
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.add(index, builderForValue.build());
        onChanged();
      } else {
        phoneBookEntriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder addAllPhoneBookEntries(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.PhoneBookEntry> values) {
      if (phoneBookEntriesBuilder_ == null) {
        ensurePhoneBookEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, phoneBookEntries_);
        onChanged();
      } else {
        phoneBookEntriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder clearPhoneBookEntries() {
      if (phoneBookEntriesBuilder_ == null) {
        phoneBookEntries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        phoneBookEntriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public Builder removePhoneBookEntries(int index) {
      if (phoneBookEntriesBuilder_ == null) {
        ensurePhoneBookEntriesIsMutable();
        phoneBookEntries_.remove(index);
        onChanged();
      } else {
        phoneBookEntriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder getPhoneBookEntriesBuilder(
        int index) {
      return getPhoneBookEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder getPhoneBookEntriesOrBuilder(
        int index) {
      if (phoneBookEntriesBuilder_ == null) {
        return phoneBookEntries_.get(index);  } else {
        return phoneBookEntriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder> 
         getPhoneBookEntriesOrBuilderList() {
      if (phoneBookEntriesBuilder_ != null) {
        return phoneBookEntriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(phoneBookEntries_);
      }
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder addPhoneBookEntriesBuilder() {
      return getPhoneBookEntriesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder addPhoneBookEntriesBuilder(
        int index) {
      return getPhoneBookEntriesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of phone book entries
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBookEntry phone_book_entries = 1 [json_name = "phoneBookEntries"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder> 
         getPhoneBookEntriesBuilderList() {
      return getPhoneBookEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhoneBookEntry, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder> 
        getPhoneBookEntriesFieldBuilder() {
      if (phoneBookEntriesBuilder_ == null) {
        phoneBookEntriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PhoneBookEntry, com.tcn.cloud.api.api.v0alpha.PhoneBookEntry.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBookEntryOrBuilder>(
                phoneBookEntries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        phoneBookEntries_ = null;
      }
      return phoneBookEntriesBuilder_;
    }

    private long huntGroupSid_ ;
    /**
     * <pre>
     * This field is set, since the entry type is 'Hunt Group"
     * </pre>
     *
     * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
     * @return The huntGroupSid.
     */
    @java.lang.Override
    public long getHuntGroupSid() {
      return huntGroupSid_;
    }
    /**
     * <pre>
     * This field is set, since the entry type is 'Hunt Group"
     * </pre>
     *
     * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
     * @param value The huntGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setHuntGroupSid(long value) {

      huntGroupSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This field is set, since the entry type is 'Hunt Group"
     * </pre>
     *
     * <code>int64 hunt_group_sid = 2 [json_name = "huntGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHuntGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      huntGroupSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListHuntGroupPhoneBookEntriesRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListHuntGroupPhoneBookEntriesRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListHuntGroupPhoneBookEntriesRes>
      PARSER = new com.google.protobuf.AbstractParser<ListHuntGroupPhoneBookEntriesRes>() {
    @java.lang.Override
    public ListHuntGroupPhoneBookEntriesRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListHuntGroupPhoneBookEntriesRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListHuntGroupPhoneBookEntriesRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListHuntGroupPhoneBookEntriesRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

