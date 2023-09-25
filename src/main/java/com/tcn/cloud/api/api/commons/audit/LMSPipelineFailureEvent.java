// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/audit/lms_events.proto

package com.tcn.cloud.api.api.commons.audit;

/**
 * Protobuf type {@code api.commons.audit.LMSPipelineFailureEvent}
 */
public final class LMSPipelineFailureEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.audit.LMSPipelineFailureEvent)
    LMSPipelineFailureEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LMSPipelineFailureEvent.newBuilder() to construct.
  private LMSPipelineFailureEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LMSPipelineFailureEvent() {
    elementId_ = "";
    elementName_ = "";
    fileName_ = "";
    failureMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LMSPipelineFailureEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.audit.LmsEventsProto.internal_static_api_commons_audit_LMSPipelineFailureEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.audit.LmsEventsProto.internal_static_api_commons_audit_LMSPipelineFailureEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.class, com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.Builder.class);
  }

  public static final int ELEMENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object elementId_ = "";
  /**
   * <code>string element_id = 1 [json_name = "elementId"];</code>
   * @return The elementId.
   */
  @java.lang.Override
  public java.lang.String getElementId() {
    java.lang.Object ref = elementId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      elementId_ = s;
      return s;
    }
  }
  /**
   * <code>string element_id = 1 [json_name = "elementId"];</code>
   * @return The bytes for elementId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getElementIdBytes() {
    java.lang.Object ref = elementId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      elementId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ELEMENT_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object elementName_ = "";
  /**
   * <code>string element_name = 2 [json_name = "elementName"];</code>
   * @return The elementName.
   */
  @java.lang.Override
  public java.lang.String getElementName() {
    java.lang.Object ref = elementName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      elementName_ = s;
      return s;
    }
  }
  /**
   * <code>string element_name = 2 [json_name = "elementName"];</code>
   * @return The bytes for elementName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getElementNameBytes() {
    java.lang.Object ref = elementName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      elementName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILE_NAME_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object fileName_ = "";
  /**
   * <code>string file_name = 3 [json_name = "fileName"];</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string file_name = 3 [json_name = "fileName"];</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object failureMessage_ = "";
  /**
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   * @return The failureMessage.
   */
  @java.lang.Override
  public java.lang.String getFailureMessage() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   * @return The bytes for failureMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFailureMessageBytes() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failureMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(elementId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, elementId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(elementName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, elementName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, failureMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(elementId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, elementId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(elementName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, elementName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, failureMessage_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent other = (com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent) obj;

    if (!getElementId()
        .equals(other.getElementId())) return false;
    if (!getElementName()
        .equals(other.getElementName())) return false;
    if (!getFileName()
        .equals(other.getFileName())) return false;
    if (!getFailureMessage()
        .equals(other.getFailureMessage())) return false;
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
    hash = (37 * hash) + ELEMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getElementId().hashCode();
    hash = (37 * hash) + ELEMENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getElementName().hashCode();
    hash = (37 * hash) + FILE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + FAILURE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFailureMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent prototype) {
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
   * Protobuf type {@code api.commons.audit.LMSPipelineFailureEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.audit.LMSPipelineFailureEvent)
      com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.audit.LmsEventsProto.internal_static_api_commons_audit_LMSPipelineFailureEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.audit.LmsEventsProto.internal_static_api_commons_audit_LMSPipelineFailureEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.class, com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.newBuilder()
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
      elementId_ = "";
      elementName_ = "";
      fileName_ = "";
      failureMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.audit.LmsEventsProto.internal_static_api_commons_audit_LMSPipelineFailureEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent build() {
      com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent buildPartial() {
      com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent result = new com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.elementId_ = elementId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.elementName_ = elementName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.fileName_ = fileName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.failureMessage_ = failureMessage_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent) {
        return mergeFrom((com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent other) {
      if (other == com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent.getDefaultInstance()) return this;
      if (!other.getElementId().isEmpty()) {
        elementId_ = other.elementId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getElementName().isEmpty()) {
        elementName_ = other.elementName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getFailureMessage().isEmpty()) {
        failureMessage_ = other.failureMessage_;
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
            case 10: {
              elementId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              elementName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              fileName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              failureMessage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object elementId_ = "";
    /**
     * <code>string element_id = 1 [json_name = "elementId"];</code>
     * @return The elementId.
     */
    public java.lang.String getElementId() {
      java.lang.Object ref = elementId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        elementId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string element_id = 1 [json_name = "elementId"];</code>
     * @return The bytes for elementId.
     */
    public com.google.protobuf.ByteString
        getElementIdBytes() {
      java.lang.Object ref = elementId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        elementId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string element_id = 1 [json_name = "elementId"];</code>
     * @param value The elementId to set.
     * @return This builder for chaining.
     */
    public Builder setElementId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      elementId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string element_id = 1 [json_name = "elementId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearElementId() {
      elementId_ = getDefaultInstance().getElementId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string element_id = 1 [json_name = "elementId"];</code>
     * @param value The bytes for elementId to set.
     * @return This builder for chaining.
     */
    public Builder setElementIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      elementId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object elementName_ = "";
    /**
     * <code>string element_name = 2 [json_name = "elementName"];</code>
     * @return The elementName.
     */
    public java.lang.String getElementName() {
      java.lang.Object ref = elementName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        elementName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string element_name = 2 [json_name = "elementName"];</code>
     * @return The bytes for elementName.
     */
    public com.google.protobuf.ByteString
        getElementNameBytes() {
      java.lang.Object ref = elementName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        elementName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string element_name = 2 [json_name = "elementName"];</code>
     * @param value The elementName to set.
     * @return This builder for chaining.
     */
    public Builder setElementName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      elementName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string element_name = 2 [json_name = "elementName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearElementName() {
      elementName_ = getDefaultInstance().getElementName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string element_name = 2 [json_name = "elementName"];</code>
     * @param value The bytes for elementName to set.
     * @return This builder for chaining.
     */
    public Builder setElementNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      elementName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string file_name = 3 [json_name = "fileName"];</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string file_name = 3 [json_name = "fileName"];</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string file_name = 3 [json_name = "fileName"];</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      fileName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 3 [json_name = "fileName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      fileName_ = getDefaultInstance().getFileName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string file_name = 3 [json_name = "fileName"];</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      fileName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object failureMessage_ = "";
    /**
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @return The failureMessage.
     */
    public java.lang.String getFailureMessage() {
      java.lang.Object ref = failureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @return The bytes for failureMessage.
     */
    public com.google.protobuf.ByteString
        getFailureMessageBytes() {
      java.lang.Object ref = failureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @param value The failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      failureMessage_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureMessage() {
      failureMessage_ = getDefaultInstance().getFailureMessage();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @param value The bytes for failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      failureMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.commons.audit.LMSPipelineFailureEvent)
  }

  // @@protoc_insertion_point(class_scope:api.commons.audit.LMSPipelineFailureEvent)
  private static final com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent();
  }

  public static com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LMSPipelineFailureEvent>
      PARSER = new com.google.protobuf.AbstractParser<LMSPipelineFailureEvent>() {
    @java.lang.Override
    public LMSPipelineFailureEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<LMSPipelineFailureEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LMSPipelineFailureEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.audit.LMSPipelineFailureEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
