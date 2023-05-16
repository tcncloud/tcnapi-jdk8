// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.ContactGroup}
 */
public final class ContactGroup extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ContactGroup)
    ContactGroupOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContactGroup.newBuilder() to construct.
  private ContactGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContactGroup() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContactGroup();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactGroup_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactGroup_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ContactGroup.class, com.tcn.cloud.api.api.v0alpha.ContactGroup.Builder.class);
  }

  public static final int CONTACT_GROUP_SID_FIELD_NUMBER = 1;
  private long contactGroupSid_ = 0L;
  /**
   * <code>int64 contact_group_sid = 1 [json_name = "contactGroupSid"];</code>
   * @return The contactGroupSid.
   */
  @java.lang.Override
  public long getContactGroupSid() {
    return contactGroupSid_;
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }

  public static final int COUNTRY_SID_FIELD_NUMBER = 5;
  private long countrySid_ = 0L;
  /**
   * <code>int64 country_sid = 5 [json_name = "countrySid"];</code>
   * @return The countrySid.
   */
  @java.lang.Override
  public long getCountrySid() {
    return countrySid_;
  }

  public static final int LAST_UPDATED_FIELD_NUMBER = 6;
  private com.google.protobuf.Timestamp lastUpdated_;
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
   * @return Whether the lastUpdated field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdated() {
    return lastUpdated_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
   * @return The lastUpdated.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastUpdated() {
    return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
  }
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder() {
    return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
  }

  public static final int SHA_DIGEST_FIELD_NUMBER = 7;
  private com.google.protobuf.StringValue shaDigest_;
  /**
   * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
   * @return Whether the shaDigest field is set.
   */
  @java.lang.Override
  public boolean hasShaDigest() {
    return shaDigest_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
   * @return The shaDigest.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getShaDigest() {
    return shaDigest_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : shaDigest_;
  }
  /**
   * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getShaDigestOrBuilder() {
    return shaDigest_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : shaDigest_;
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
    if (contactGroupSid_ != 0L) {
      output.writeInt64(1, contactGroupSid_);
    }
    if (name_ != null) {
      output.writeMessage(4, getName());
    }
    if (countrySid_ != 0L) {
      output.writeInt64(5, countrySid_);
    }
    if (lastUpdated_ != null) {
      output.writeMessage(6, getLastUpdated());
    }
    if (shaDigest_ != null) {
      output.writeMessage(7, getShaDigest());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contactGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, contactGroupSid_);
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getName());
    }
    if (countrySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, countrySid_);
    }
    if (lastUpdated_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getLastUpdated());
    }
    if (shaDigest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getShaDigest());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ContactGroup)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ContactGroup other = (com.tcn.cloud.api.api.v0alpha.ContactGroup) obj;

    if (getContactGroupSid()
        != other.getContactGroupSid()) return false;
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (getCountrySid()
        != other.getCountrySid()) return false;
    if (hasLastUpdated() != other.hasLastUpdated()) return false;
    if (hasLastUpdated()) {
      if (!getLastUpdated()
          .equals(other.getLastUpdated())) return false;
    }
    if (hasShaDigest() != other.hasShaDigest()) return false;
    if (hasShaDigest()) {
      if (!getShaDigest()
          .equals(other.getShaDigest())) return false;
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
    hash = (37 * hash) + CONTACT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getContactGroupSid());
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (37 * hash) + COUNTRY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCountrySid());
    if (hasLastUpdated()) {
      hash = (37 * hash) + LAST_UPDATED_FIELD_NUMBER;
      hash = (53 * hash) + getLastUpdated().hashCode();
    }
    if (hasShaDigest()) {
      hash = (37 * hash) + SHA_DIGEST_FIELD_NUMBER;
      hash = (53 * hash) + getShaDigest().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ContactGroup parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ContactGroup prototype) {
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
   * Protobuf type {@code api.v0alpha.ContactGroup}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ContactGroup)
      com.tcn.cloud.api.api.v0alpha.ContactGroupOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactGroup_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactGroup_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ContactGroup.class, com.tcn.cloud.api.api.v0alpha.ContactGroup.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ContactGroup.newBuilder()
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
      contactGroupSid_ = 0L;
      name_ = null;
      if (nameBuilder_ != null) {
        nameBuilder_.dispose();
        nameBuilder_ = null;
      }
      countrySid_ = 0L;
      lastUpdated_ = null;
      if (lastUpdatedBuilder_ != null) {
        lastUpdatedBuilder_.dispose();
        lastUpdatedBuilder_ = null;
      }
      shaDigest_ = null;
      if (shaDigestBuilder_ != null) {
        shaDigestBuilder_.dispose();
        shaDigestBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ContactGroup_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactGroup getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ContactGroup.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactGroup build() {
      com.tcn.cloud.api.api.v0alpha.ContactGroup result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactGroup buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ContactGroup result = new com.tcn.cloud.api.api.v0alpha.ContactGroup(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ContactGroup result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contactGroupSid_ = contactGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = nameBuilder_ == null
            ? name_
            : nameBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.countrySid_ = countrySid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.lastUpdated_ = lastUpdatedBuilder_ == null
            ? lastUpdated_
            : lastUpdatedBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.shaDigest_ = shaDigestBuilder_ == null
            ? shaDigest_
            : shaDigestBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ContactGroup) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ContactGroup)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ContactGroup other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ContactGroup.getDefaultInstance()) return this;
      if (other.getContactGroupSid() != 0L) {
        setContactGroupSid(other.getContactGroupSid());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.getCountrySid() != 0L) {
        setCountrySid(other.getCountrySid());
      }
      if (other.hasLastUpdated()) {
        mergeLastUpdated(other.getLastUpdated());
      }
      if (other.hasShaDigest()) {
        mergeShaDigest(other.getShaDigest());
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
              contactGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 34: {
              input.readMessage(
                  getNameFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 40: {
              countrySid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 40
            case 50: {
              input.readMessage(
                  getLastUpdatedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 50
            case 58: {
              input.readMessage(
                  getShaDigestFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 58
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

    private long contactGroupSid_ ;
    /**
     * <code>int64 contact_group_sid = 1 [json_name = "contactGroupSid"];</code>
     * @return The contactGroupSid.
     */
    @java.lang.Override
    public long getContactGroupSid() {
      return contactGroupSid_;
    }
    /**
     * <code>int64 contact_group_sid = 1 [json_name = "contactGroupSid"];</code>
     * @param value The contactGroupSid to set.
     * @return This builder for chaining.
     */
    public Builder setContactGroupSid(long value) {

      contactGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 contact_group_sid = 1 [json_name = "contactGroupSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContactGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contactGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     * @return The name.
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
      } else {
        nameBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          name_ != null &&
          name_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getNameBuilder().mergeFrom(value);
        } else {
          name_ = value;
        }
      } else {
        nameBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = null;
      if (nameBuilder_ != null) {
        nameBuilder_.dispose();
        nameBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 4 [json_name = "name"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private long countrySid_ ;
    /**
     * <code>int64 country_sid = 5 [json_name = "countrySid"];</code>
     * @return The countrySid.
     */
    @java.lang.Override
    public long getCountrySid() {
      return countrySid_;
    }
    /**
     * <code>int64 country_sid = 5 [json_name = "countrySid"];</code>
     * @param value The countrySid to set.
     * @return This builder for chaining.
     */
    public Builder setCountrySid(long value) {

      countrySid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 country_sid = 5 [json_name = "countrySid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCountrySid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      countrySid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp lastUpdated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastUpdatedBuilder_;
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     * @return Whether the lastUpdated field is set.
     */
    public boolean hasLastUpdated() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     * @return The lastUpdated.
     */
    public com.google.protobuf.Timestamp getLastUpdated() {
      if (lastUpdatedBuilder_ == null) {
        return lastUpdated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
      } else {
        return lastUpdatedBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    public Builder setLastUpdated(com.google.protobuf.Timestamp value) {
      if (lastUpdatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastUpdated_ = value;
      } else {
        lastUpdatedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    public Builder setLastUpdated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastUpdatedBuilder_ == null) {
        lastUpdated_ = builderForValue.build();
      } else {
        lastUpdatedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    public Builder mergeLastUpdated(com.google.protobuf.Timestamp value) {
      if (lastUpdatedBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          lastUpdated_ != null &&
          lastUpdated_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getLastUpdatedBuilder().mergeFrom(value);
        } else {
          lastUpdated_ = value;
        }
      } else {
        lastUpdatedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    public Builder clearLastUpdated() {
      bitField0_ = (bitField0_ & ~0x00000008);
      lastUpdated_ = null;
      if (lastUpdatedBuilder_ != null) {
        lastUpdatedBuilder_.dispose();
        lastUpdatedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastUpdatedBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getLastUpdatedFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder() {
      if (lastUpdatedBuilder_ != null) {
        return lastUpdatedBuilder_.getMessageOrBuilder();
      } else {
        return lastUpdated_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastUpdated_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp last_updated = 6 [json_name = "lastUpdated"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastUpdatedFieldBuilder() {
      if (lastUpdatedBuilder_ == null) {
        lastUpdatedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastUpdated(),
                getParentForChildren(),
                isClean());
        lastUpdated_ = null;
      }
      return lastUpdatedBuilder_;
    }

    private com.google.protobuf.StringValue shaDigest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> shaDigestBuilder_;
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     * @return Whether the shaDigest field is set.
     */
    public boolean hasShaDigest() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     * @return The shaDigest.
     */
    public com.google.protobuf.StringValue getShaDigest() {
      if (shaDigestBuilder_ == null) {
        return shaDigest_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : shaDigest_;
      } else {
        return shaDigestBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    public Builder setShaDigest(com.google.protobuf.StringValue value) {
      if (shaDigestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shaDigest_ = value;
      } else {
        shaDigestBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    public Builder setShaDigest(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (shaDigestBuilder_ == null) {
        shaDigest_ = builderForValue.build();
      } else {
        shaDigestBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    public Builder mergeShaDigest(com.google.protobuf.StringValue value) {
      if (shaDigestBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          shaDigest_ != null &&
          shaDigest_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getShaDigestBuilder().mergeFrom(value);
        } else {
          shaDigest_ = value;
        }
      } else {
        shaDigestBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    public Builder clearShaDigest() {
      bitField0_ = (bitField0_ & ~0x00000010);
      shaDigest_ = null;
      if (shaDigestBuilder_ != null) {
        shaDigestBuilder_.dispose();
        shaDigestBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    public com.google.protobuf.StringValue.Builder getShaDigestBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getShaDigestFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getShaDigestOrBuilder() {
      if (shaDigestBuilder_ != null) {
        return shaDigestBuilder_.getMessageOrBuilder();
      } else {
        return shaDigest_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : shaDigest_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue sha_digest = 7 [json_name = "shaDigest"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getShaDigestFieldBuilder() {
      if (shaDigestBuilder_ == null) {
        shaDigestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getShaDigest(),
                getParentForChildren(),
                isClean());
        shaDigest_ = null;
      }
      return shaDigestBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ContactGroup)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ContactGroup)
  private static final com.tcn.cloud.api.api.v0alpha.ContactGroup DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ContactGroup();
  }

  public static com.tcn.cloud.api.api.v0alpha.ContactGroup getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContactGroup>
      PARSER = new com.google.protobuf.AbstractParser<ContactGroup>() {
    @java.lang.Override
    public ContactGroup parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContactGroup> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContactGroup> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactGroup getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

