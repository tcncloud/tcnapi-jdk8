// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/acd.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * message used to play a dtmf tone in an agent's conference
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.PlayDTMFRequest}
 */
public final class PlayDTMFRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.PlayDTMFRequest)
    PlayDTMFRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlayDTMFRequest.newBuilder() to construct.
  private PlayDTMFRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayDTMFRequest() {
    dtmfDigits_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlayDTMFRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_PlayDTMFRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_PlayDTMFRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.class, com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.Builder.class);
  }

  public static final int SESSION_SID_FIELD_NUMBER = 1;
  private long sessionSid_ = 0L;
  /**
   * <pre>
   * the session sid for the agent
   * </pre>
   *
   * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
   * @return The sessionSid.
   */
  @java.lang.Override
  public long getSessionSid() {
    return sessionSid_;
  }

  public static final int DTMF_DIGITS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> dtmfDigits_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tcn.cloud.api.api.commons.DTMFDigit> dtmfDigits_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tcn.cloud.api.api.commons.DTMFDigit>() {
            public com.tcn.cloud.api.api.commons.DTMFDigit convert(java.lang.Integer from) {
              com.tcn.cloud.api.api.commons.DTMFDigit result = com.tcn.cloud.api.api.commons.DTMFDigit.forNumber(from);
              return result == null ? com.tcn.cloud.api.api.commons.DTMFDigit.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * the dtmf tone to play
   * </pre>
   *
   * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
   * @return A list containing the dtmfDigits.
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.DTMFDigit> getDtmfDigitsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tcn.cloud.api.api.commons.DTMFDigit>(dtmfDigits_, dtmfDigits_converter_);
  }
  /**
   * <pre>
   * the dtmf tone to play
   * </pre>
   *
   * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
   * @return The count of dtmfDigits.
   */
  @java.lang.Override
  public int getDtmfDigitsCount() {
    return dtmfDigits_.size();
  }
  /**
   * <pre>
   * the dtmf tone to play
   * </pre>
   *
   * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
   * @param index The index of the element to return.
   * @return The dtmfDigits at the given index.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.DTMFDigit getDtmfDigits(int index) {
    return dtmfDigits_converter_.convert(dtmfDigits_.get(index));
  }
  /**
   * <pre>
   * the dtmf tone to play
   * </pre>
   *
   * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
   * @return A list containing the enum numeric values on the wire for dtmfDigits.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getDtmfDigitsValueList() {
    return dtmfDigits_;
  }
  /**
   * <pre>
   * the dtmf tone to play
   * </pre>
   *
   * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dtmfDigits at the given index.
   */
  @java.lang.Override
  public int getDtmfDigitsValue(int index) {
    return dtmfDigits_.get(index);
  }
  private int dtmfDigitsMemoizedSerializedSize;

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
    if (sessionSid_ != 0L) {
      output.writeInt64(1, sessionSid_);
    }
    if (getDtmfDigitsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(dtmfDigitsMemoizedSerializedSize);
    }
    for (int i = 0; i < dtmfDigits_.size(); i++) {
      output.writeEnumNoTag(dtmfDigits_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sessionSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, sessionSid_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dtmfDigits_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(dtmfDigits_.get(i));
      }
      size += dataSize;
      if (!getDtmfDigitsList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }dtmfDigitsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest other = (com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest) obj;

    if (getSessionSid()
        != other.getSessionSid()) return false;
    if (!dtmfDigits_.equals(other.dtmfDigits_)) return false;
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
    hash = (37 * hash) + SESSION_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSessionSid());
    if (getDtmfDigitsCount() > 0) {
      hash = (37 * hash) + DTMF_DIGITS_FIELD_NUMBER;
      hash = (53 * hash) + dtmfDigits_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest prototype) {
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
   * message used to play a dtmf tone in an agent's conference
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.PlayDTMFRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.PlayDTMFRequest)
      com.tcn.cloud.api.api.v0alpha.PlayDTMFRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_PlayDTMFRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_PlayDTMFRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.class, com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.newBuilder()
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
      sessionSid_ = 0L;
      dtmfDigits_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AcdProto.internal_static_api_v0alpha_PlayDTMFRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest build() {
      com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest buildPartial() {
      com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest result = new com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        dtmfDigits_ = java.util.Collections.unmodifiableList(dtmfDigits_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.dtmfDigits_ = dtmfDigits_;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionSid_ = sessionSid_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest other) {
      if (other == com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest.getDefaultInstance()) return this;
      if (other.getSessionSid() != 0L) {
        setSessionSid(other.getSessionSid());
      }
      if (!other.dtmfDigits_.isEmpty()) {
        if (dtmfDigits_.isEmpty()) {
          dtmfDigits_ = other.dtmfDigits_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDtmfDigitsIsMutable();
          dtmfDigits_.addAll(other.dtmfDigits_);
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
              sessionSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              int tmpRaw = input.readEnum();
              ensureDtmfDigitsIsMutable();
              dtmfDigits_.add(tmpRaw);
              break;
            } // case 16
            case 18: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureDtmfDigitsIsMutable();
                dtmfDigits_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
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

    private long sessionSid_ ;
    /**
     * <pre>
     * the session sid for the agent
     * </pre>
     *
     * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
     * @return The sessionSid.
     */
    @java.lang.Override
    public long getSessionSid() {
      return sessionSid_;
    }
    /**
     * <pre>
     * the session sid for the agent
     * </pre>
     *
     * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
     * @param value The sessionSid to set.
     * @return This builder for chaining.
     */
    public Builder setSessionSid(long value) {

      sessionSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the session sid for the agent
     * </pre>
     *
     * <code>int64 session_sid = 1 [json_name = "sessionSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionSid_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> dtmfDigits_ =
      java.util.Collections.emptyList();
    private void ensureDtmfDigitsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dtmfDigits_ = new java.util.ArrayList<java.lang.Integer>(dtmfDigits_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @return A list containing the dtmfDigits.
     */
    public java.util.List<com.tcn.cloud.api.api.commons.DTMFDigit> getDtmfDigitsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tcn.cloud.api.api.commons.DTMFDigit>(dtmfDigits_, dtmfDigits_converter_);
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @return The count of dtmfDigits.
     */
    public int getDtmfDigitsCount() {
      return dtmfDigits_.size();
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param index The index of the element to return.
     * @return The dtmfDigits at the given index.
     */
    public com.tcn.cloud.api.api.commons.DTMFDigit getDtmfDigits(int index) {
      return dtmfDigits_converter_.convert(dtmfDigits_.get(index));
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param index The index to set the value at.
     * @param value The dtmfDigits to set.
     * @return This builder for chaining.
     */
    public Builder setDtmfDigits(
        int index, com.tcn.cloud.api.api.commons.DTMFDigit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDtmfDigitsIsMutable();
      dtmfDigits_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param value The dtmfDigits to add.
     * @return This builder for chaining.
     */
    public Builder addDtmfDigits(com.tcn.cloud.api.api.commons.DTMFDigit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureDtmfDigitsIsMutable();
      dtmfDigits_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param values The dtmfDigits to add.
     * @return This builder for chaining.
     */
    public Builder addAllDtmfDigits(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.DTMFDigit> values) {
      ensureDtmfDigitsIsMutable();
      for (com.tcn.cloud.api.api.commons.DTMFDigit value : values) {
        dtmfDigits_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDtmfDigits() {
      dtmfDigits_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @return A list containing the enum numeric values on the wire for dtmfDigits.
     */
    public java.util.List<java.lang.Integer>
    getDtmfDigitsValueList() {
      return java.util.Collections.unmodifiableList(dtmfDigits_);
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of dtmfDigits at the given index.
     */
    public int getDtmfDigitsValue(int index) {
      return dtmfDigits_.get(index);
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for dtmfDigits to set.
     * @return This builder for chaining.
     */
    public Builder setDtmfDigitsValue(
        int index, int value) {
      ensureDtmfDigitsIsMutable();
      dtmfDigits_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param value The enum numeric value on the wire for dtmfDigits to add.
     * @return This builder for chaining.
     */
    public Builder addDtmfDigitsValue(int value) {
      ensureDtmfDigitsIsMutable();
      dtmfDigits_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the dtmf tone to play
     * </pre>
     *
     * <code>repeated .api.commons.DTMFDigit dtmf_digits = 2 [json_name = "dtmfDigits"];</code>
     * @param values The enum numeric values on the wire for dtmfDigits to add.
     * @return This builder for chaining.
     */
    public Builder addAllDtmfDigitsValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureDtmfDigitsIsMutable();
      for (int value : values) {
        dtmfDigits_.add(value);
      }
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.PlayDTMFRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.PlayDTMFRequest)
  private static final com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest();
  }

  public static com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayDTMFRequest>
      PARSER = new com.google.protobuf.AbstractParser<PlayDTMFRequest>() {
    @java.lang.Override
    public PlayDTMFRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlayDTMFRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayDTMFRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PlayDTMFRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

