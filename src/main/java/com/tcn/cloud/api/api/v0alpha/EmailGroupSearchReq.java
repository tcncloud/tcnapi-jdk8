// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/emailapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.EmailGroupSearchReq}
 */
public final class EmailGroupSearchReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.EmailGroupSearchReq)
    EmailGroupSearchReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmailGroupSearchReq.newBuilder() to construct.
  private EmailGroupSearchReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmailGroupSearchReq() {
    statusStr_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmailGroupSearchReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_EmailGroupSearchReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_EmailGroupSearchReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.class, com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.Builder.class);
  }

  public static final int SEARCH_FROM_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp searchFrom_;
  /**
   * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
   * @return Whether the searchFrom field is set.
   */
  @java.lang.Override
  public boolean hasSearchFrom() {
    return searchFrom_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
   * @return The searchFrom.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getSearchFrom() {
    return searchFrom_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : searchFrom_;
  }
  /**
   * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getSearchFromOrBuilder() {
    return searchFrom_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : searchFrom_;
  }

  public static final int SEARCH_TO_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp searchTo_;
  /**
   * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
   * @return Whether the searchTo field is set.
   */
  @java.lang.Override
  public boolean hasSearchTo() {
    return searchTo_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
   * @return The searchTo.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getSearchTo() {
    return searchTo_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : searchTo_;
  }
  /**
   * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getSearchToOrBuilder() {
    return searchTo_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : searchTo_;
  }

  public static final int STATUS_STR_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object statusStr_ = "";
  /**
   * <code>string status_str = 4 [json_name = "statusStr"];</code>
   * @return The statusStr.
   */
  @java.lang.Override
  public java.lang.String getStatusStr() {
    java.lang.Object ref = statusStr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      statusStr_ = s;
      return s;
    }
  }
  /**
   * <code>string status_str = 4 [json_name = "statusStr"];</code>
   * @return The bytes for statusStr.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusStrBytes() {
    java.lang.Object ref = statusStr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      statusStr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (searchFrom_ != null) {
      output.writeMessage(2, getSearchFrom());
    }
    if (searchTo_ != null) {
      output.writeMessage(3, getSearchTo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(statusStr_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, statusStr_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (searchFrom_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSearchFrom());
    }
    if (searchTo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getSearchTo());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(statusStr_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, statusStr_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq other = (com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq) obj;

    if (hasSearchFrom() != other.hasSearchFrom()) return false;
    if (hasSearchFrom()) {
      if (!getSearchFrom()
          .equals(other.getSearchFrom())) return false;
    }
    if (hasSearchTo() != other.hasSearchTo()) return false;
    if (hasSearchTo()) {
      if (!getSearchTo()
          .equals(other.getSearchTo())) return false;
    }
    if (!getStatusStr()
        .equals(other.getStatusStr())) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    if (hasSearchFrom()) {
      hash = (37 * hash) + SEARCH_FROM_FIELD_NUMBER;
      hash = (53 * hash) + getSearchFrom().hashCode();
    }
    if (hasSearchTo()) {
      hash = (37 * hash) + SEARCH_TO_FIELD_NUMBER;
      hash = (53 * hash) + getSearchTo().hashCode();
    }
    hash = (37 * hash) + STATUS_STR_FIELD_NUMBER;
    hash = (53 * hash) + getStatusStr().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq prototype) {
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
   * Protobuf type {@code api.v0alpha.EmailGroupSearchReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.EmailGroupSearchReq)
      com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_EmailGroupSearchReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_EmailGroupSearchReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.class, com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.newBuilder()
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
      searchFrom_ = null;
      if (searchFromBuilder_ != null) {
        searchFromBuilder_.dispose();
        searchFromBuilder_ = null;
      }
      searchTo_ = null;
      if (searchToBuilder_ != null) {
        searchToBuilder_.dispose();
        searchToBuilder_ = null;
      }
      statusStr_ = "";
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailapiProto.internal_static_api_v0alpha_EmailGroupSearchReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq build() {
      com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq result = new com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.searchFrom_ = searchFromBuilder_ == null
            ? searchFrom_
            : searchFromBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchTo_ = searchToBuilder_ == null
            ? searchTo_
            : searchToBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.statusStr_ = statusStr_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq.getDefaultInstance()) return this;
      if (other.hasSearchFrom()) {
        mergeSearchFrom(other.getSearchFrom());
      }
      if (other.hasSearchTo()) {
        mergeSearchTo(other.getSearchTo());
      }
      if (!other.getStatusStr().isEmpty()) {
        statusStr_ = other.statusStr_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000008;
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
            case 18: {
              input.readMessage(
                  getSearchFromFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getSearchToFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 26
            case 34: {
              statusStr_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 34
            case 42: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 42
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

    private com.google.protobuf.Timestamp searchFrom_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> searchFromBuilder_;
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     * @return Whether the searchFrom field is set.
     */
    public boolean hasSearchFrom() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     * @return The searchFrom.
     */
    public com.google.protobuf.Timestamp getSearchFrom() {
      if (searchFromBuilder_ == null) {
        return searchFrom_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : searchFrom_;
      } else {
        return searchFromBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    public Builder setSearchFrom(com.google.protobuf.Timestamp value) {
      if (searchFromBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchFrom_ = value;
      } else {
        searchFromBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    public Builder setSearchFrom(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (searchFromBuilder_ == null) {
        searchFrom_ = builderForValue.build();
      } else {
        searchFromBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    public Builder mergeSearchFrom(com.google.protobuf.Timestamp value) {
      if (searchFromBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          searchFrom_ != null &&
          searchFrom_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getSearchFromBuilder().mergeFrom(value);
        } else {
          searchFrom_ = value;
        }
      } else {
        searchFromBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    public Builder clearSearchFrom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      searchFrom_ = null;
      if (searchFromBuilder_ != null) {
        searchFromBuilder_.dispose();
        searchFromBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getSearchFromBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSearchFromFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSearchFromOrBuilder() {
      if (searchFromBuilder_ != null) {
        return searchFromBuilder_.getMessageOrBuilder();
      } else {
        return searchFrom_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : searchFrom_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp search_from = 2 [json_name = "searchFrom"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getSearchFromFieldBuilder() {
      if (searchFromBuilder_ == null) {
        searchFromBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getSearchFrom(),
                getParentForChildren(),
                isClean());
        searchFrom_ = null;
      }
      return searchFromBuilder_;
    }

    private com.google.protobuf.Timestamp searchTo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> searchToBuilder_;
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     * @return Whether the searchTo field is set.
     */
    public boolean hasSearchTo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     * @return The searchTo.
     */
    public com.google.protobuf.Timestamp getSearchTo() {
      if (searchToBuilder_ == null) {
        return searchTo_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : searchTo_;
      } else {
        return searchToBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    public Builder setSearchTo(com.google.protobuf.Timestamp value) {
      if (searchToBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchTo_ = value;
      } else {
        searchToBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    public Builder setSearchTo(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (searchToBuilder_ == null) {
        searchTo_ = builderForValue.build();
      } else {
        searchToBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    public Builder mergeSearchTo(com.google.protobuf.Timestamp value) {
      if (searchToBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          searchTo_ != null &&
          searchTo_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getSearchToBuilder().mergeFrom(value);
        } else {
          searchTo_ = value;
        }
      } else {
        searchToBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    public Builder clearSearchTo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      searchTo_ = null;
      if (searchToBuilder_ != null) {
        searchToBuilder_.dispose();
        searchToBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getSearchToBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSearchToFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSearchToOrBuilder() {
      if (searchToBuilder_ != null) {
        return searchToBuilder_.getMessageOrBuilder();
      } else {
        return searchTo_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : searchTo_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp search_to = 3 [json_name = "searchTo"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getSearchToFieldBuilder() {
      if (searchToBuilder_ == null) {
        searchToBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getSearchTo(),
                getParentForChildren(),
                isClean());
        searchTo_ = null;
      }
      return searchToBuilder_;
    }

    private java.lang.Object statusStr_ = "";
    /**
     * <code>string status_str = 4 [json_name = "statusStr"];</code>
     * @return The statusStr.
     */
    public java.lang.String getStatusStr() {
      java.lang.Object ref = statusStr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        statusStr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status_str = 4 [json_name = "statusStr"];</code>
     * @return The bytes for statusStr.
     */
    public com.google.protobuf.ByteString
        getStatusStrBytes() {
      java.lang.Object ref = statusStr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        statusStr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status_str = 4 [json_name = "statusStr"];</code>
     * @param value The statusStr to set.
     * @return This builder for chaining.
     */
    public Builder setStatusStr(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      statusStr_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string status_str = 4 [json_name = "statusStr"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatusStr() {
      statusStr_ = getDefaultInstance().getStatusStr();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string status_str = 4 [json_name = "statusStr"];</code>
     * @param value The bytes for statusStr to set.
     * @return This builder for chaining.
     */
    public Builder setStatusStrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      statusStr_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 5 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.EmailGroupSearchReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.EmailGroupSearchReq)
  private static final com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmailGroupSearchReq>
      PARSER = new com.google.protobuf.AbstractParser<EmailGroupSearchReq>() {
    @java.lang.Override
    public EmailGroupSearchReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmailGroupSearchReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmailGroupSearchReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.EmailGroupSearchReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

