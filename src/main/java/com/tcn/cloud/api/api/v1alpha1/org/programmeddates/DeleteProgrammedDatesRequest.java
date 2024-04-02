// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/programmeddates/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.programmeddates;

/**
 * <pre>
 * DeleteProgrammedDatesRequest is the request message for DeleteProgrammedDates
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest}
 */
public final class DeleteProgrammedDatesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest)
    DeleteProgrammedDatesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteProgrammedDatesRequest.newBuilder() to construct.
  private DeleteProgrammedDatesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteProgrammedDatesRequest() {
    programmedDatesId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteProgrammedDatesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_DeleteProgrammedDatesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_DeleteProgrammedDatesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.Builder.class);
  }

  public static final int PROGRAMMED_DATES_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object programmedDatesId_ = "";
  /**
   * <pre>
   * The ID of the ProgrammedDates to delete
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
   * The ID of the ProgrammedDates to delete
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest other = (com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest) obj;

    if (!getProgrammedDatesId()
        .equals(other.getProgrammedDatesId())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest prototype) {
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
   * DeleteProgrammedDatesRequest is the request message for DeleteProgrammedDates
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest)
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_DeleteProgrammedDatesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_DeleteProgrammedDatesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.class, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_DeleteProgrammedDatesRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest build() {
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest result = new com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.programmedDatesId_ = programmedDatesId_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest.getDefaultInstance()) return this;
      if (!other.getProgrammedDatesId().isEmpty()) {
        programmedDatesId_ = other.programmedDatesId_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              programmedDatesId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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
     * The ID of the ProgrammedDates to delete
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
     * The ID of the ProgrammedDates to delete
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
     * The ID of the ProgrammedDates to delete
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
     * The ID of the ProgrammedDates to delete
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
     * The ID of the ProgrammedDates to delete
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteProgrammedDatesRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteProgrammedDatesRequest>() {
    @java.lang.Override
    public DeleteProgrammedDatesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteProgrammedDatesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteProgrammedDatesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.DeleteProgrammedDatesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

