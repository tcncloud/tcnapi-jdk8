// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/org.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Wrapper WebhookPreferences object for get response and update request
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.WebhookPreferences}
 */
public final class WebhookPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.WebhookPreferences)
    WebhookPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebhookPreferences.newBuilder() to construct.
  private WebhookPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebhookPreferences() {
    callResultPushUrl_ = "";
    agentResponsePushUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebhookPreferences();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_WebhookPreferences_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_WebhookPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.WebhookPreferences.class, com.tcn.cloud.api.api.v0alpha.WebhookPreferences.Builder.class);
  }

  public static final int PUSH_URLS_ENABLED_FIELD_NUMBER = 1;
  private boolean pushUrlsEnabled_ = false;
  /**
   * <pre>
   * Web hook push URLs enabled
   * </pre>
   *
   * <code>bool push_urls_enabled = 1 [json_name = "pushUrlsEnabled"];</code>
   * @return The pushUrlsEnabled.
   */
  @java.lang.Override
  public boolean getPushUrlsEnabled() {
    return pushUrlsEnabled_;
  }

  public static final int CALL_RESULT_PUSH_URL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object callResultPushUrl_ = "";
  /**
   * <pre>
   * Call result from push URL
   * </pre>
   *
   * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
   * @return The callResultPushUrl.
   */
  @java.lang.Override
  public java.lang.String getCallResultPushUrl() {
    java.lang.Object ref = callResultPushUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      callResultPushUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Call result from push URL
   * </pre>
   *
   * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
   * @return The bytes for callResultPushUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCallResultPushUrlBytes() {
    java.lang.Object ref = callResultPushUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      callResultPushUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENT_RESPONSE_PUSH_URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentResponsePushUrl_ = "";
  /**
   * <pre>
   * Agent response from push URL
   * </pre>
   *
   * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
   * @return The agentResponsePushUrl.
   */
  @java.lang.Override
  public java.lang.String getAgentResponsePushUrl() {
    java.lang.Object ref = agentResponsePushUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentResponsePushUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Agent response from push URL
   * </pre>
   *
   * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
   * @return The bytes for agentResponsePushUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentResponsePushUrlBytes() {
    java.lang.Object ref = agentResponsePushUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentResponsePushUrl_ = b;
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
    if (pushUrlsEnabled_ != false) {
      output.writeBool(1, pushUrlsEnabled_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callResultPushUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, callResultPushUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentResponsePushUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, agentResponsePushUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pushUrlsEnabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, pushUrlsEnabled_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callResultPushUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, callResultPushUrl_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentResponsePushUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, agentResponsePushUrl_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.WebhookPreferences)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.WebhookPreferences other = (com.tcn.cloud.api.api.v0alpha.WebhookPreferences) obj;

    if (getPushUrlsEnabled()
        != other.getPushUrlsEnabled()) return false;
    if (!getCallResultPushUrl()
        .equals(other.getCallResultPushUrl())) return false;
    if (!getAgentResponsePushUrl()
        .equals(other.getAgentResponsePushUrl())) return false;
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
    hash = (37 * hash) + PUSH_URLS_ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPushUrlsEnabled());
    hash = (37 * hash) + CALL_RESULT_PUSH_URL_FIELD_NUMBER;
    hash = (53 * hash) + getCallResultPushUrl().hashCode();
    hash = (37 * hash) + AGENT_RESPONSE_PUSH_URL_FIELD_NUMBER;
    hash = (53 * hash) + getAgentResponsePushUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.WebhookPreferences prototype) {
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
   * Wrapper WebhookPreferences object for get response and update request
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.WebhookPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.WebhookPreferences)
      com.tcn.cloud.api.api.v0alpha.WebhookPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_WebhookPreferences_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_WebhookPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.WebhookPreferences.class, com.tcn.cloud.api.api.v0alpha.WebhookPreferences.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.WebhookPreferences.newBuilder()
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
      pushUrlsEnabled_ = false;
      callResultPushUrl_ = "";
      agentResponsePushUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OrgProto.internal_static_api_v0alpha_WebhookPreferences_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WebhookPreferences getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.WebhookPreferences.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WebhookPreferences build() {
      com.tcn.cloud.api.api.v0alpha.WebhookPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.WebhookPreferences buildPartial() {
      com.tcn.cloud.api.api.v0alpha.WebhookPreferences result = new com.tcn.cloud.api.api.v0alpha.WebhookPreferences(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.WebhookPreferences result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pushUrlsEnabled_ = pushUrlsEnabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.callResultPushUrl_ = callResultPushUrl_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.agentResponsePushUrl_ = agentResponsePushUrl_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.WebhookPreferences) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.WebhookPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.WebhookPreferences other) {
      if (other == com.tcn.cloud.api.api.v0alpha.WebhookPreferences.getDefaultInstance()) return this;
      if (other.getPushUrlsEnabled() != false) {
        setPushUrlsEnabled(other.getPushUrlsEnabled());
      }
      if (!other.getCallResultPushUrl().isEmpty()) {
        callResultPushUrl_ = other.callResultPushUrl_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getAgentResponsePushUrl().isEmpty()) {
        agentResponsePushUrl_ = other.agentResponsePushUrl_;
        bitField0_ |= 0x00000004;
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
              pushUrlsEnabled_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              callResultPushUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              agentResponsePushUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private boolean pushUrlsEnabled_ ;
    /**
     * <pre>
     * Web hook push URLs enabled
     * </pre>
     *
     * <code>bool push_urls_enabled = 1 [json_name = "pushUrlsEnabled"];</code>
     * @return The pushUrlsEnabled.
     */
    @java.lang.Override
    public boolean getPushUrlsEnabled() {
      return pushUrlsEnabled_;
    }
    /**
     * <pre>
     * Web hook push URLs enabled
     * </pre>
     *
     * <code>bool push_urls_enabled = 1 [json_name = "pushUrlsEnabled"];</code>
     * @param value The pushUrlsEnabled to set.
     * @return This builder for chaining.
     */
    public Builder setPushUrlsEnabled(boolean value) {

      pushUrlsEnabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Web hook push URLs enabled
     * </pre>
     *
     * <code>bool push_urls_enabled = 1 [json_name = "pushUrlsEnabled"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPushUrlsEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pushUrlsEnabled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object callResultPushUrl_ = "";
    /**
     * <pre>
     * Call result from push URL
     * </pre>
     *
     * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
     * @return The callResultPushUrl.
     */
    public java.lang.String getCallResultPushUrl() {
      java.lang.Object ref = callResultPushUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callResultPushUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Call result from push URL
     * </pre>
     *
     * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
     * @return The bytes for callResultPushUrl.
     */
    public com.google.protobuf.ByteString
        getCallResultPushUrlBytes() {
      java.lang.Object ref = callResultPushUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callResultPushUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Call result from push URL
     * </pre>
     *
     * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
     * @param value The callResultPushUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCallResultPushUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      callResultPushUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Call result from push URL
     * </pre>
     *
     * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCallResultPushUrl() {
      callResultPushUrl_ = getDefaultInstance().getCallResultPushUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Call result from push URL
     * </pre>
     *
     * <code>string call_result_push_url = 2 [json_name = "callResultPushUrl"];</code>
     * @param value The bytes for callResultPushUrl to set.
     * @return This builder for chaining.
     */
    public Builder setCallResultPushUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      callResultPushUrl_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object agentResponsePushUrl_ = "";
    /**
     * <pre>
     * Agent response from push URL
     * </pre>
     *
     * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
     * @return The agentResponsePushUrl.
     */
    public java.lang.String getAgentResponsePushUrl() {
      java.lang.Object ref = agentResponsePushUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentResponsePushUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Agent response from push URL
     * </pre>
     *
     * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
     * @return The bytes for agentResponsePushUrl.
     */
    public com.google.protobuf.ByteString
        getAgentResponsePushUrlBytes() {
      java.lang.Object ref = agentResponsePushUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentResponsePushUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Agent response from push URL
     * </pre>
     *
     * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
     * @param value The agentResponsePushUrl to set.
     * @return This builder for chaining.
     */
    public Builder setAgentResponsePushUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentResponsePushUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent response from push URL
     * </pre>
     *
     * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentResponsePushUrl() {
      agentResponsePushUrl_ = getDefaultInstance().getAgentResponsePushUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Agent response from push URL
     * </pre>
     *
     * <code>string agent_response_push_url = 3 [json_name = "agentResponsePushUrl"];</code>
     * @param value The bytes for agentResponsePushUrl to set.
     * @return This builder for chaining.
     */
    public Builder setAgentResponsePushUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentResponsePushUrl_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.WebhookPreferences)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.WebhookPreferences)
  private static final com.tcn.cloud.api.api.v0alpha.WebhookPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.WebhookPreferences();
  }

  public static com.tcn.cloud.api.api.v0alpha.WebhookPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebhookPreferences>
      PARSER = new com.google.protobuf.AbstractParser<WebhookPreferences>() {
    @java.lang.Override
    public WebhookPreferences parsePartialFrom(
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

  public static com.google.protobuf.Parser<WebhookPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebhookPreferences> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.WebhookPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

