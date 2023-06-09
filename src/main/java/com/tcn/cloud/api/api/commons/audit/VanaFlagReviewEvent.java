// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/vana_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * <pre>
 * VanaFlagReviewEvent represents a flag that needs review in voice analytics.
 * It summarizes a set of transcripts that need review.
 * </pre>
 *
 * Protobuf type {@code api.commons.audit.VanaFlagReviewEvent}
 */
public final class VanaFlagReviewEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.VanaFlagReviewEvent)
    VanaFlagReviewEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VanaFlagReviewEvent.newBuilder() to construct.
  private VanaFlagReviewEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VanaFlagReviewEvent() {
    flagName_ = "";
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VanaFlagReviewEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.VanaEventsProto.internal_static_api_commons_audit_VanaFlagReviewEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.VanaEventsProto.internal_static_api_commons_audit_VanaFlagReviewEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.class, com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.Builder.class);
  }

  public static final int FLAG_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object flagName_ = "";
  /**
   * <pre>
   * Required. User is not allowed to see flag sid.
   * </pre>
   *
   * <code>string flag_name = 1 [json_name = "flagName"];</code>
   * @return The flagName.
   */
  @java.lang.Override
  public java.lang.String getFlagName() {
    java.lang.Object ref = flagName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      flagName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. User is not allowed to see flag sid.
   * </pre>
   *
   * <code>string flag_name = 1 [json_name = "flagName"];</code>
   * @return The bytes for flagName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFlagNameBytes() {
    java.lang.Object ref = flagName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      flagName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLAG_SID_FIELD_NUMBER = 2;
  private long flagSid_ = 0L;
  /**
   * <pre>
   * Required. Used for matching user notification settings.
   * </pre>
   *
   * <code>int64 flag_sid = 2 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  @java.lang.Override
  public long getFlagSid() {
    return flagSid_;
  }

  public static final int URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * Required. Link to voice analytics page that shows reported transcripts.
   * </pre>
   *
   * <code>string url = 3 [json_name = "url"];</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Link to voice analytics page that shows reported transcripts.
   * </pre>
   *
   * <code>string url = 3 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_TRANSCRIPTS_FIELD_NUMBER = 4;
  private long numTranscripts_ = 0L;
  /**
   * <pre>
   * Required. Number of transcripts that were flagged.
   * </pre>
   *
   * <code>int64 num_transcripts = 4 [json_name = "numTranscripts"];</code>
   * @return The numTranscripts.
   */
  @java.lang.Override
  public long getNumTranscripts() {
    return numTranscripts_;
  }

  public static final int PRIORITY_FIELD_NUMBER = 5;
  private int priority_ = 0;
  /**
   * <pre>
   * Required. Flag priority.
   * </pre>
   *
   * <code>int32 priority = 5 [json_name = "priority"];</code>
   * @return The priority.
   */
  @java.lang.Override
  public int getPriority() {
    return priority_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flagName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, flagName_);
    }
    if (flagSid_ != 0L) {
      output.writeInt64(2, flagSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
    }
    if (numTranscripts_ != 0L) {
      output.writeInt64(4, numTranscripts_);
    }
    if (priority_ != 0) {
      output.writeInt32(5, priority_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(flagName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, flagName_);
    }
    if (flagSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, flagSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
    }
    if (numTranscripts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, numTranscripts_);
    }
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, priority_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent other = (com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent) obj;

    if (!getFlagName()
        .equals(other.getFlagName())) return false;
    if (getFlagSid()
        != other.getFlagSid()) return false;
    if (!getUrl()
        .equals(other.getUrl())) return false;
    if (getNumTranscripts()
        != other.getNumTranscripts()) return false;
    if (getPriority()
        != other.getPriority()) return false;
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
    hash = (37 * hash) + FLAG_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFlagName().hashCode();
    hash = (37 * hash) + FLAG_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFlagSid());
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + NUM_TRANSCRIPTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumTranscripts());
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent prototype) {
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
   * VanaFlagReviewEvent represents a flag that needs review in voice analytics.
   * It summarizes a set of transcripts that need review.
   * </pre>
   *
   * Protobuf type {@code api.commons.audit.VanaFlagReviewEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.VanaFlagReviewEvent)
      com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.VanaEventsProto.internal_static_api_commons_audit_VanaFlagReviewEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.VanaEventsProto.internal_static_api_commons_audit_VanaFlagReviewEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.class, com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.newBuilder()
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
      flagName_ = "";
      flagSid_ = 0L;
      url_ = "";
      numTranscripts_ = 0L;
      priority_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.VanaEventsProto.internal_static_api_commons_audit_VanaFlagReviewEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent build() {
      com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent result = new com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.flagName_ = flagName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.flagSid_ = flagSid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numTranscripts_ = numTranscripts_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.priority_ = priority_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent.getDefaultInstance()) return this;
      if (!other.getFlagName().isEmpty()) {
        flagName_ = other.flagName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFlagSid() != 0L) {
        setFlagSid(other.getFlagSid());
      }
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getNumTranscripts() != 0L) {
        setNumTranscripts(other.getNumTranscripts());
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
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
              flagName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              flagSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              numTranscripts_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              priority_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private java.lang.Object flagName_ = "";
    /**
     * <pre>
     * Required. User is not allowed to see flag sid.
     * </pre>
     *
     * <code>string flag_name = 1 [json_name = "flagName"];</code>
     * @return The flagName.
     */
    public java.lang.String getFlagName() {
      java.lang.Object ref = flagName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        flagName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. User is not allowed to see flag sid.
     * </pre>
     *
     * <code>string flag_name = 1 [json_name = "flagName"];</code>
     * @return The bytes for flagName.
     */
    public com.google.protobuf.ByteString
        getFlagNameBytes() {
      java.lang.Object ref = flagName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        flagName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. User is not allowed to see flag sid.
     * </pre>
     *
     * <code>string flag_name = 1 [json_name = "flagName"];</code>
     * @param value The flagName to set.
     * @return This builder for chaining.
     */
    public Builder setFlagName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      flagName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. User is not allowed to see flag sid.
     * </pre>
     *
     * <code>string flag_name = 1 [json_name = "flagName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFlagName() {
      flagName_ = getDefaultInstance().getFlagName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. User is not allowed to see flag sid.
     * </pre>
     *
     * <code>string flag_name = 1 [json_name = "flagName"];</code>
     * @param value The bytes for flagName to set.
     * @return This builder for chaining.
     */
    public Builder setFlagNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      flagName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long flagSid_ ;
    /**
     * <pre>
     * Required. Used for matching user notification settings.
     * </pre>
     *
     * <code>int64 flag_sid = 2 [json_name = "flagSid"];</code>
     * @return The flagSid.
     */
    @java.lang.Override
    public long getFlagSid() {
      return flagSid_;
    }
    /**
     * <pre>
     * Required. Used for matching user notification settings.
     * </pre>
     *
     * <code>int64 flag_sid = 2 [json_name = "flagSid"];</code>
     * @param value The flagSid to set.
     * @return This builder for chaining.
     */
    public Builder setFlagSid(long value) {

      flagSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Used for matching user notification settings.
     * </pre>
     *
     * <code>int64 flag_sid = 2 [json_name = "flagSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFlagSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      flagSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * Required. Link to voice analytics page that shows reported transcripts.
     * </pre>
     *
     * <code>string url = 3 [json_name = "url"];</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Link to voice analytics page that shows reported transcripts.
     * </pre>
     *
     * <code>string url = 3 [json_name = "url"];</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Link to voice analytics page that shows reported transcripts.
     * </pre>
     *
     * <code>string url = 3 [json_name = "url"];</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Link to voice analytics page that shows reported transcripts.
     * </pre>
     *
     * <code>string url = 3 [json_name = "url"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Link to voice analytics page that shows reported transcripts.
     * </pre>
     *
     * <code>string url = 3 [json_name = "url"];</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long numTranscripts_ ;
    /**
     * <pre>
     * Required. Number of transcripts that were flagged.
     * </pre>
     *
     * <code>int64 num_transcripts = 4 [json_name = "numTranscripts"];</code>
     * @return The numTranscripts.
     */
    @java.lang.Override
    public long getNumTranscripts() {
      return numTranscripts_;
    }
    /**
     * <pre>
     * Required. Number of transcripts that were flagged.
     * </pre>
     *
     * <code>int64 num_transcripts = 4 [json_name = "numTranscripts"];</code>
     * @param value The numTranscripts to set.
     * @return This builder for chaining.
     */
    public Builder setNumTranscripts(long value) {

      numTranscripts_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Number of transcripts that were flagged.
     * </pre>
     *
     * <code>int64 num_transcripts = 4 [json_name = "numTranscripts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNumTranscripts() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numTranscripts_ = 0L;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <pre>
     * Required. Flag priority.
     * </pre>
     *
     * <code>int32 priority = 5 [json_name = "priority"];</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }
    /**
     * <pre>
     * Required. Flag priority.
     * </pre>
     *
     * <code>int32 priority = 5 [json_name = "priority"];</code>
     * @param value The priority to set.
     * @return This builder for chaining.
     */
    public Builder setPriority(int value) {

      priority_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Flag priority.
     * </pre>
     *
     * <code>int32 priority = 5 [json_name = "priority"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPriority() {
      bitField0_ = (bitField0_ & ~0x00000010);
      priority_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.VanaFlagReviewEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.VanaFlagReviewEvent)
  private static final com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VanaFlagReviewEvent>
      PARSER = new com.google.protobuf.AbstractParser<VanaFlagReviewEvent>() {
    @java.lang.Override
    public VanaFlagReviewEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<VanaFlagReviewEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VanaFlagReviewEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.VanaFlagReviewEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

