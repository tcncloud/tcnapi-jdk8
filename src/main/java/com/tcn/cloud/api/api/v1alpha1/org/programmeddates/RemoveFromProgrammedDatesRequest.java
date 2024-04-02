// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/programmeddates/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.programmeddates;

/**
 * <pre>
 * RemoveFromProgrammedDatesRequest is request message for RemoveFromProgrammedDates
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest}
 */
public final class RemoveFromProgrammedDatesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest)
    RemoveFromProgrammedDatesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoveFromProgrammedDatesRequest.newBuilder() to construct.
  private RemoveFromProgrammedDatesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoveFromProgrammedDatesRequest() {
    programmedDatesId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoveFromProgrammedDatesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_RemoveFromProgrammedDatesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_RemoveFromProgrammedDatesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.Builder.class);
  }

  public static final int PROGRAMMED_DATES_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object programmedDatesId_ = "";
  /**
   * <pre>
   * The ID of the ProgrammedDates to remove from
   * </pre>
   *
   * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
   * @return The programmedDatesId.
   */
  @java.lang.Override
  public java.lang.String getProgrammedDatesId() {
    java.lang.Object ref = programmedDatesId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      programmedDatesId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID of the ProgrammedDates to remove from
   * </pre>
   *
   * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
   * @return The bytes for programmedDatesId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProgrammedDatesIdBytes() {
    java.lang.Object ref = programmedDatesId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      programmedDatesId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DAY_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.org.ProgrammedDay day_;
  /**
   * <pre>
   * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
   * </pre>
   *
   * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
   * @return Whether the day field is set.
   */
  @java.lang.Override
  public boolean hasDay() {
    return day_ != null;
  }
  /**
   * <pre>
   * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
   * </pre>
   *
   * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
   * @return The day.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ProgrammedDay getDay() {
    return day_ == null ? com.tcn.cloud.api.api.commons.org.ProgrammedDay.getDefaultInstance() : day_;
  }
  /**
   * <pre>
   * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
   * </pre>
   *
   * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder getDayOrBuilder() {
    return day_ == null ? com.tcn.cloud.api.api.commons.org.ProgrammedDay.getDefaultInstance() : day_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(programmedDatesId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, programmedDatesId_);
    }
    if (day_ != null) {
      output.writeMessage(2, getDay());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(programmedDatesId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, programmedDatesId_);
    }
    if (day_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDay());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest) obj;

    if (!getProgrammedDatesId()
        .equals(other.getProgrammedDatesId())) return false;
    if (hasDay() != other.hasDay()) return false;
    if (hasDay()) {
      if (!getDay()
          .equals(other.getDay())) return false;
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
    hash = (37 * hash) + PROGRAMMED_DATES_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProgrammedDatesId().hashCode();
    if (hasDay()) {
      hash = (37 * hash) + DAY_FIELD_NUMBER;
      hash = (53 * hash) + getDay().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest prototype) {
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
   * RemoveFromProgrammedDatesRequest is request message for RemoveFromProgrammedDates
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_RemoveFromProgrammedDatesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_RemoveFromProgrammedDatesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.newBuilder()
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
      programmedDatesId_ = "";
      day_ = null;
      if (dayBuilder_ != null) {
        dayBuilder_.dispose();
        dayBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_RemoveFromProgrammedDatesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.programmedDatesId_ = programmedDatesId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.day_ = dayBuilder_ == null
            ? day_
            : dayBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest.getDefaultInstance()) return this;
      if (!other.getProgrammedDatesId().isEmpty()) {
        programmedDatesId_ = other.programmedDatesId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDay()) {
        mergeDay(other.getDay());
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
              programmedDatesId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDayFieldBuilder().getBuilder(),
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

    private java.lang.Object programmedDatesId_ = "";
    /**
     * <pre>
     * The ID of the ProgrammedDates to remove from
     * </pre>
     *
     * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
     * @return The programmedDatesId.
     */
    public java.lang.String getProgrammedDatesId() {
      java.lang.Object ref = programmedDatesId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        programmedDatesId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID of the ProgrammedDates to remove from
     * </pre>
     *
     * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
     * @return The bytes for programmedDatesId.
     */
    public com.google.protobuf.ByteString
        getProgrammedDatesIdBytes() {
      java.lang.Object ref = programmedDatesId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        programmedDatesId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID of the ProgrammedDates to remove from
     * </pre>
     *
     * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
     * @param value The programmedDatesId to set.
     * @return This builder for chaining.
     */
    public Builder setProgrammedDatesId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      programmedDatesId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the ProgrammedDates to remove from
     * </pre>
     *
     * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProgrammedDatesId() {
      programmedDatesId_ = getDefaultInstance().getProgrammedDatesId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID of the ProgrammedDates to remove from
     * </pre>
     *
     * <code>string programmed_dates_id = 1 [json_name = "programmedDatesId"];</code>
     * @param value The bytes for programmedDatesId to set.
     * @return This builder for chaining.
     */
    public Builder setProgrammedDatesIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      programmedDatesId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.commons.org.ProgrammedDay day_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.ProgrammedDay, com.tcn.cloud.api.api.commons.org.ProgrammedDay.Builder, com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder> dayBuilder_;
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     * @return Whether the day field is set.
     */
    public boolean hasDay() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     * @return The day.
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDay getDay() {
      if (dayBuilder_ == null) {
        return day_ == null ? com.tcn.cloud.api.api.commons.org.ProgrammedDay.getDefaultInstance() : day_;
      } else {
        return dayBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    public Builder setDay(com.tcn.cloud.api.api.commons.org.ProgrammedDay value) {
      if (dayBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        day_ = value;
      } else {
        dayBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    public Builder setDay(
        com.tcn.cloud.api.api.commons.org.ProgrammedDay.Builder builderForValue) {
      if (dayBuilder_ == null) {
        day_ = builderForValue.build();
      } else {
        dayBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    public Builder mergeDay(com.tcn.cloud.api.api.commons.org.ProgrammedDay value) {
      if (dayBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          day_ != null &&
          day_ != com.tcn.cloud.api.api.commons.org.ProgrammedDay.getDefaultInstance()) {
          getDayBuilder().mergeFrom(value);
        } else {
          day_ = value;
        }
      } else {
        dayBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    public Builder clearDay() {
      bitField0_ = (bitField0_ & ~0x00000002);
      day_ = null;
      if (dayBuilder_ != null) {
        dayBuilder_.dispose();
        dayBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDay.Builder getDayBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDayFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder getDayOrBuilder() {
      if (dayBuilder_ != null) {
        return dayBuilder_.getMessageOrBuilder();
      } else {
        return day_ == null ?
            com.tcn.cloud.api.api.commons.org.ProgrammedDay.getDefaultInstance() : day_;
      }
    }
    /**
     * <pre>
     * The specified ProgrammedDay to remove (must already exist within the ProgrammedDay)
     * </pre>
     *
     * <code>.api.commons.org.ProgrammedDay day = 2 [json_name = "day"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.ProgrammedDay, com.tcn.cloud.api.api.commons.org.ProgrammedDay.Builder, com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder> 
        getDayFieldBuilder() {
      if (dayBuilder_ == null) {
        dayBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.ProgrammedDay, com.tcn.cloud.api.api.commons.org.ProgrammedDay.Builder, com.tcn.cloud.api.api.commons.org.ProgrammedDayOrBuilder>(
                getDay(),
                getParentForChildren(),
                isClean());
        day_ = null;
      }
      return dayBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoveFromProgrammedDatesRequest>
      PARSER = new com.google.protobuf.AbstractParser<RemoveFromProgrammedDatesRequest>() {
    @java.lang.Override
    public RemoveFromProgrammedDatesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<RemoveFromProgrammedDatesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoveFromProgrammedDatesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.RemoveFromProgrammedDatesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

