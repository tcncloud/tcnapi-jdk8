// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * The request message for UpdateHuntGroupScript
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.UpdateHuntGroupScriptRequest}
 */
public final class UpdateHuntGroupScriptRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.UpdateHuntGroupScriptRequest)
    UpdateHuntGroupScriptRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateHuntGroupScriptRequest.newBuilder() to construct.
  private UpdateHuntGroupScriptRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateHuntGroupScriptRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateHuntGroupScriptRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_UpdateHuntGroupScriptRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_UpdateHuntGroupScriptRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.Builder.class);
  }

  public static final int HUNT_GROUP_SID_FIELD_NUMBER = 1;
  private long huntGroupSid_ = 0L;
  /**
   * <pre>
   * The hunt group sid of where the script belongs
   * </pre>
   *
   * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid", deprecated = true];</code>
   * @deprecated api.v1alpha1.org.UpdateHuntGroupScriptRequest.hunt_group_sid is deprecated.
   *     See api/v1alpha1/org/huntgroup.proto;l=538
   * @return The huntGroupSid.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getHuntGroupSid() {
    return huntGroupSid_;
  }

  public static final int HUNT_GROUP_SCRIPT_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.org.HuntGroupScript huntGroupScript_;
  /**
   * <pre>
   * The script to be created
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
   * @return Whether the huntGroupScript field is set.
   */
  @java.lang.Override
  public boolean hasHuntGroupScript() {
    return huntGroupScript_ != null;
  }
  /**
   * <pre>
   * The script to be created
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
   * @return The huntGroupScript.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.HuntGroupScript getHuntGroupScript() {
    return huntGroupScript_ == null ? com.tcn.cloud.api.api.commons.org.HuntGroupScript.getDefaultInstance() : huntGroupScript_;
  }
  /**
   * <pre>
   * The script to be created
   * </pre>
   *
   * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder getHuntGroupScriptOrBuilder() {
    return huntGroupScript_ == null ? com.tcn.cloud.api.api.commons.org.HuntGroupScript.getDefaultInstance() : huntGroupScript_;
  }

  public static final int SCRIPT_SID_FIELD_NUMBER = 3;
  private long scriptSid_ = 0L;
  /**
   * <pre>
   * The sid of the script to be updated
   * </pre>
   *
   * <code>int64 script_sid = 3 [json_name = "scriptSid"];</code>
   * @return The scriptSid.
   */
  @java.lang.Override
  public long getScriptSid() {
    return scriptSid_;
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
    if (huntGroupSid_ != 0L) {
      output.writeInt64(1, huntGroupSid_);
    }
    if (huntGroupScript_ != null) {
      output.writeMessage(2, getHuntGroupScript());
    }
    if (scriptSid_ != 0L) {
      output.writeInt64(3, scriptSid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (huntGroupSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, huntGroupSid_);
    }
    if (huntGroupScript_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHuntGroupScript());
    }
    if (scriptSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, scriptSid_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest other = (com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest) obj;

    if (getHuntGroupSid()
        != other.getHuntGroupSid()) return false;
    if (hasHuntGroupScript() != other.hasHuntGroupScript()) return false;
    if (hasHuntGroupScript()) {
      if (!getHuntGroupScript()
          .equals(other.getHuntGroupScript())) return false;
    }
    if (getScriptSid()
        != other.getScriptSid()) return false;
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
    hash = (37 * hash) + HUNT_GROUP_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHuntGroupSid());
    if (hasHuntGroupScript()) {
      hash = (37 * hash) + HUNT_GROUP_SCRIPT_FIELD_NUMBER;
      hash = (53 * hash) + getHuntGroupScript().hashCode();
    }
    hash = (37 * hash) + SCRIPT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScriptSid());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest prototype) {
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
   * The request message for UpdateHuntGroupScript
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.UpdateHuntGroupScriptRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.UpdateHuntGroupScriptRequest)
      com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_UpdateHuntGroupScriptRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_UpdateHuntGroupScriptRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.class, com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.newBuilder()
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
      huntGroupSid_ = 0L;
      huntGroupScript_ = null;
      if (huntGroupScriptBuilder_ != null) {
        huntGroupScriptBuilder_.dispose();
        huntGroupScriptBuilder_ = null;
      }
      scriptSid_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_UpdateHuntGroupScriptRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest result = new com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.huntGroupSid_ = huntGroupSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.huntGroupScript_ = huntGroupScriptBuilder_ == null
            ? huntGroupScript_
            : huntGroupScriptBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest.getDefaultInstance()) return this;
      if (other.getHuntGroupSid() != 0L) {
        setHuntGroupSid(other.getHuntGroupSid());
      }
      if (other.hasHuntGroupScript()) {
        mergeHuntGroupScript(other.getHuntGroupScript());
      }
      if (other.getScriptSid() != 0L) {
        setScriptSid(other.getScriptSid());
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
              huntGroupSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getHuntGroupScriptFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              scriptSid_ = input.readInt64();
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

    private long huntGroupSid_ ;
    /**
     * <pre>
     * The hunt group sid of where the script belongs
     * </pre>
     *
     * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.org.UpdateHuntGroupScriptRequest.hunt_group_sid is deprecated.
     *     See api/v1alpha1/org/huntgroup.proto;l=538
     * @return The huntGroupSid.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getHuntGroupSid() {
      return huntGroupSid_;
    }
    /**
     * <pre>
     * The hunt group sid of where the script belongs
     * </pre>
     *
     * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.org.UpdateHuntGroupScriptRequest.hunt_group_sid is deprecated.
     *     See api/v1alpha1/org/huntgroup.proto;l=538
     * @param value The huntGroupSid to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setHuntGroupSid(long value) {

      huntGroupSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The hunt group sid of where the script belongs
     * </pre>
     *
     * <code>int64 hunt_group_sid = 1 [json_name = "huntGroupSid", deprecated = true];</code>
     * @deprecated api.v1alpha1.org.UpdateHuntGroupScriptRequest.hunt_group_sid is deprecated.
     *     See api/v1alpha1/org/huntgroup.proto;l=538
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearHuntGroupSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      huntGroupSid_ = 0L;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.HuntGroupScript huntGroupScript_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.HuntGroupScript, com.tcn.cloud.api.api.commons.org.HuntGroupScript.Builder, com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder> huntGroupScriptBuilder_;
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     * @return Whether the huntGroupScript field is set.
     */
    public boolean hasHuntGroupScript() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     * @return The huntGroupScript.
     */
    public com.tcn.cloud.api.api.commons.org.HuntGroupScript getHuntGroupScript() {
      if (huntGroupScriptBuilder_ == null) {
        return huntGroupScript_ == null ? com.tcn.cloud.api.api.commons.org.HuntGroupScript.getDefaultInstance() : huntGroupScript_;
      } else {
        return huntGroupScriptBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    public Builder setHuntGroupScript(com.tcn.cloud.api.api.commons.org.HuntGroupScript value) {
      if (huntGroupScriptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        huntGroupScript_ = value;
      } else {
        huntGroupScriptBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    public Builder setHuntGroupScript(
        com.tcn.cloud.api.api.commons.org.HuntGroupScript.Builder builderForValue) {
      if (huntGroupScriptBuilder_ == null) {
        huntGroupScript_ = builderForValue.build();
      } else {
        huntGroupScriptBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    public Builder mergeHuntGroupScript(com.tcn.cloud.api.api.commons.org.HuntGroupScript value) {
      if (huntGroupScriptBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          huntGroupScript_ != null &&
          huntGroupScript_ != com.tcn.cloud.api.api.commons.org.HuntGroupScript.getDefaultInstance()) {
          getHuntGroupScriptBuilder().mergeFrom(value);
        } else {
          huntGroupScript_ = value;
        }
      } else {
        huntGroupScriptBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    public Builder clearHuntGroupScript() {
      bitField0_ = (bitField0_ & ~0x00000002);
      huntGroupScript_ = null;
      if (huntGroupScriptBuilder_ != null) {
        huntGroupScriptBuilder_.dispose();
        huntGroupScriptBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.HuntGroupScript.Builder getHuntGroupScriptBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getHuntGroupScriptFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder getHuntGroupScriptOrBuilder() {
      if (huntGroupScriptBuilder_ != null) {
        return huntGroupScriptBuilder_.getMessageOrBuilder();
      } else {
        return huntGroupScript_ == null ?
            com.tcn.cloud.api.api.commons.org.HuntGroupScript.getDefaultInstance() : huntGroupScript_;
      }
    }
    /**
     * <pre>
     * The script to be created
     * </pre>
     *
     * <code>.api.commons.org.HuntGroupScript hunt_group_script = 2 [json_name = "huntGroupScript"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.HuntGroupScript, com.tcn.cloud.api.api.commons.org.HuntGroupScript.Builder, com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder> 
        getHuntGroupScriptFieldBuilder() {
      if (huntGroupScriptBuilder_ == null) {
        huntGroupScriptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.HuntGroupScript, com.tcn.cloud.api.api.commons.org.HuntGroupScript.Builder, com.tcn.cloud.api.api.commons.org.HuntGroupScriptOrBuilder>(
                getHuntGroupScript(),
                getParentForChildren(),
                isClean());
        huntGroupScript_ = null;
      }
      return huntGroupScriptBuilder_;
    }

    private long scriptSid_ ;
    /**
     * <pre>
     * The sid of the script to be updated
     * </pre>
     *
     * <code>int64 script_sid = 3 [json_name = "scriptSid"];</code>
     * @return The scriptSid.
     */
    @java.lang.Override
    public long getScriptSid() {
      return scriptSid_;
    }
    /**
     * <pre>
     * The sid of the script to be updated
     * </pre>
     *
     * <code>int64 script_sid = 3 [json_name = "scriptSid"];</code>
     * @param value The scriptSid to set.
     * @return This builder for chaining.
     */
    public Builder setScriptSid(long value) {

      scriptSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The sid of the script to be updated
     * </pre>
     *
     * <code>int64 script_sid = 3 [json_name = "scriptSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearScriptSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      scriptSid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.UpdateHuntGroupScriptRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.UpdateHuntGroupScriptRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateHuntGroupScriptRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateHuntGroupScriptRequest>() {
    @java.lang.Override
    public UpdateHuntGroupScriptRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateHuntGroupScriptRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateHuntGroupScriptRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.UpdateHuntGroupScriptRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

