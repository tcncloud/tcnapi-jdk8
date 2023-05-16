// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Entity message for the ListAgentPauseCodes, CreateAgentPauseCode, and UpdateAgentPauseCode RPCs.
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.PauseCode}
 */
public final class PauseCode extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.PauseCode)
    PauseCodeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PauseCode.newBuilder() to construct.
  private PauseCode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PauseCode() {
    name_ = "";
    description_ = "";
    codes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PauseCode();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_PauseCode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_PauseCode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.PauseCode.class, com.tcn.cloud.api.api.v0alpha.PauseCode.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1 [json_name = "name"];</code>
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
   * <code>string name = 1 [json_name = "name"];</code>
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

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODES_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList codes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @return A list containing the codes.
   */
  public com.google.protobuf.ProtocolStringList
      getCodesList() {
    return codes_;
  }
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @return The count of codes.
   */
  public int getCodesCount() {
    return codes_.size();
  }
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @param index The index of the element to return.
   * @return The codes at the given index.
   */
  public java.lang.String getCodes(int index) {
    return codes_.get(index);
  }
  /**
   * <code>repeated string codes = 3 [json_name = "codes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the codes at the given index.
   */
  public com.google.protobuf.ByteString
      getCodesBytes(int index) {
    return codes_.getByteString(index);
  }

  public static final int XML_CLIENT_PROPERTY_SID_FIELD_NUMBER = 4;
  private long xmlClientPropertySid_ = 0L;
  /**
   * <code>int64 xml_client_property_sid = 4 [json_name = "xmlClientPropertySid"];</code>
   * @return The xmlClientPropertySid.
   */
  @java.lang.Override
  public long getXmlClientPropertySid() {
    return xmlClientPropertySid_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    for (int i = 0; i < codes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, codes_.getRaw(i));
    }
    if (xmlClientPropertySid_ != 0L) {
      output.writeInt64(4, xmlClientPropertySid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < codes_.size(); i++) {
        dataSize += computeStringSizeNoTag(codes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCodesList().size();
    }
    if (xmlClientPropertySid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, xmlClientPropertySid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.PauseCode)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.PauseCode other = (com.tcn.cloud.api.api.v0alpha.PauseCode) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getCodesList()
        .equals(other.getCodesList())) return false;
    if (getXmlClientPropertySid()
        != other.getXmlClientPropertySid()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (getCodesCount() > 0) {
      hash = (37 * hash) + CODES_FIELD_NUMBER;
      hash = (53 * hash) + getCodesList().hashCode();
    }
    hash = (37 * hash) + XML_CLIENT_PROPERTY_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getXmlClientPropertySid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PauseCode parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.PauseCode prototype) {
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
   * Entity message for the ListAgentPauseCodes, CreateAgentPauseCode, and UpdateAgentPauseCode RPCs.
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.PauseCode}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.PauseCode)
      com.tcn.cloud.api.api.v0alpha.PauseCodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_PauseCode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_PauseCode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.PauseCode.class, com.tcn.cloud.api.api.v0alpha.PauseCode.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.PauseCode.newBuilder()
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
      name_ = "";
      description_ = "";
      codes_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      xmlClientPropertySid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_PauseCode_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PauseCode getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PauseCode build() {
      com.tcn.cloud.api.api.v0alpha.PauseCode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PauseCode buildPartial() {
      com.tcn.cloud.api.api.v0alpha.PauseCode result = new com.tcn.cloud.api.api.v0alpha.PauseCode(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.PauseCode result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        codes_.makeImmutable();
        result.codes_ = codes_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.xmlClientPropertySid_ = xmlClientPropertySid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.PauseCode) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.PauseCode)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.PauseCode other) {
      if (other == com.tcn.cloud.api.api.v0alpha.PauseCode.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.codes_.isEmpty()) {
        if (codes_.isEmpty()) {
          codes_ = other.codes_;
          bitField0_ |= 0x00000004;
        } else {
          ensureCodesIsMutable();
          codes_.addAll(other.codes_);
        }
        onChanged();
      }
      if (other.getXmlClientPropertySid() != 0L) {
        setXmlClientPropertySid(other.getXmlClientPropertySid());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureCodesIsMutable();
              codes_.add(s);
              break;
            } // case 26
            case 32: {
              xmlClientPropertySid_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1 [json_name = "name"];</code>
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
     * <code>string name = 1 [json_name = "name"];</code>
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
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 2 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList codes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureCodesIsMutable() {
      if (!codes_.isModifiable()) {
        codes_ = new com.google.protobuf.LazyStringArrayList(codes_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @return A list containing the codes.
     */
    public com.google.protobuf.ProtocolStringList
        getCodesList() {
      codes_.makeImmutable();
      return codes_;
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @return The count of codes.
     */
    public int getCodesCount() {
      return codes_.size();
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @param index The index of the element to return.
     * @return The codes at the given index.
     */
    public java.lang.String getCodes(int index) {
      return codes_.get(index);
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the codes at the given index.
     */
    public com.google.protobuf.ByteString
        getCodesBytes(int index) {
      return codes_.getByteString(index);
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @param index The index to set the value at.
     * @param value The codes to set.
     * @return This builder for chaining.
     */
    public Builder setCodes(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCodesIsMutable();
      codes_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @param value The codes to add.
     * @return This builder for chaining.
     */
    public Builder addCodes(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureCodesIsMutable();
      codes_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @param values The codes to add.
     * @return This builder for chaining.
     */
    public Builder addAllCodes(
        java.lang.Iterable<java.lang.String> values) {
      ensureCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, codes_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCodes() {
      codes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string codes = 3 [json_name = "codes"];</code>
     * @param value The bytes of the codes to add.
     * @return This builder for chaining.
     */
    public Builder addCodesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureCodesIsMutable();
      codes_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long xmlClientPropertySid_ ;
    /**
     * <code>int64 xml_client_property_sid = 4 [json_name = "xmlClientPropertySid"];</code>
     * @return The xmlClientPropertySid.
     */
    @java.lang.Override
    public long getXmlClientPropertySid() {
      return xmlClientPropertySid_;
    }
    /**
     * <code>int64 xml_client_property_sid = 4 [json_name = "xmlClientPropertySid"];</code>
     * @param value The xmlClientPropertySid to set.
     * @return This builder for chaining.
     */
    public Builder setXmlClientPropertySid(long value) {

      xmlClientPropertySid_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 xml_client_property_sid = 4 [json_name = "xmlClientPropertySid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearXmlClientPropertySid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      xmlClientPropertySid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.PauseCode)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.PauseCode)
  private static final com.tcn.cloud.api.api.v0alpha.PauseCode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.PauseCode();
  }

  public static com.tcn.cloud.api.api.v0alpha.PauseCode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PauseCode>
      PARSER = new com.google.protobuf.AbstractParser<PauseCode>() {
    @java.lang.Override
    public PauseCode parsePartialFrom(
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

  public static com.google.protobuf.Parser<PauseCode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PauseCode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PauseCode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

