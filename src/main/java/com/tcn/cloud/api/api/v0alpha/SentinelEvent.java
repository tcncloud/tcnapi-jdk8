// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/sentinel.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SentinelEvent}
 */
public final class SentinelEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SentinelEvent)
    SentinelEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SentinelEvent.newBuilder() to construct.
  private SentinelEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SentinelEvent() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SentinelEvent();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.SentinelProto.internal_static_api_v0alpha_SentinelEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.SentinelProto.internal_static_api_v0alpha_SentinelEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SentinelEvent.class, com.tcn.cloud.api.api.v0alpha.SentinelEvent.Builder.class);
  }

  private int eventCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object event_;
  public enum EventCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LOG_EVENT(1),
    EVENT_NOT_SET(0);
    private final int value;
    private EventCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventCase valueOf(int value) {
      return forNumber(value);
    }

    public static EventCase forNumber(int value) {
      switch (value) {
        case 1: return LOG_EVENT;
        case 0: return EVENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EventCase
  getEventCase() {
    return EventCase.forNumber(
        eventCase_);
  }

  public static final int LOG_EVENT_FIELD_NUMBER = 1;
  /**
   * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
   * @return Whether the logEvent field is set.
   */
  @java.lang.Override
  public boolean hasLogEvent() {
    return eventCase_ == 1;
  }
  /**
   * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
   * @return The logEvent.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LogEvent getLogEvent() {
    if (eventCase_ == 1) {
       return (com.tcn.cloud.api.api.v0alpha.LogEvent) event_;
    }
    return com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.LogEventOrBuilder getLogEventOrBuilder() {
    if (eventCase_ == 1) {
       return (com.tcn.cloud.api.api.v0alpha.LogEvent) event_;
    }
    return com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance();
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
    if (eventCase_ == 1) {
      output.writeMessage(1, (com.tcn.cloud.api.api.v0alpha.LogEvent) event_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (eventCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tcn.cloud.api.api.v0alpha.LogEvent) event_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SentinelEvent)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SentinelEvent other = (com.tcn.cloud.api.api.v0alpha.SentinelEvent) obj;

    if (!getEventCase().equals(other.getEventCase())) return false;
    switch (eventCase_) {
      case 1:
        if (!getLogEvent()
            .equals(other.getLogEvent())) return false;
        break;
      case 0:
      default:
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
    switch (eventCase_) {
      case 1:
        hash = (37 * hash) + LOG_EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getLogEvent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SentinelEvent prototype) {
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
   * Protobuf type {@code api.v0alpha.SentinelEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SentinelEvent)
      com.tcn.cloud.api.api.v0alpha.SentinelEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.SentinelProto.internal_static_api_v0alpha_SentinelEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.SentinelProto.internal_static_api_v0alpha_SentinelEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SentinelEvent.class, com.tcn.cloud.api.api.v0alpha.SentinelEvent.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SentinelEvent.newBuilder()
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
      if (logEventBuilder_ != null) {
        logEventBuilder_.clear();
      }
      eventCase_ = 0;
      event_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.SentinelProto.internal_static_api_v0alpha_SentinelEvent_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SentinelEvent getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SentinelEvent.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SentinelEvent build() {
      com.tcn.cloud.api.api.v0alpha.SentinelEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SentinelEvent buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SentinelEvent result = new com.tcn.cloud.api.api.v0alpha.SentinelEvent(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SentinelEvent result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.SentinelEvent result) {
      result.eventCase_ = eventCase_;
      result.event_ = this.event_;
      if (eventCase_ == 1 &&
          logEventBuilder_ != null) {
        result.event_ = logEventBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SentinelEvent) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SentinelEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SentinelEvent other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SentinelEvent.getDefaultInstance()) return this;
      switch (other.getEventCase()) {
        case LOG_EVENT: {
          mergeLogEvent(other.getLogEvent());
          break;
        }
        case EVENT_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getLogEventFieldBuilder().getBuilder(),
                  extensionRegistry);
              eventCase_ = 1;
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
    private int eventCase_ = 0;
    private java.lang.Object event_;
    public EventCase
        getEventCase() {
      return EventCase.forNumber(
          eventCase_);
    }

    public Builder clearEvent() {
      eventCase_ = 0;
      event_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.LogEvent, com.tcn.cloud.api.api.v0alpha.LogEvent.Builder, com.tcn.cloud.api.api.v0alpha.LogEventOrBuilder> logEventBuilder_;
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     * @return Whether the logEvent field is set.
     */
    @java.lang.Override
    public boolean hasLogEvent() {
      return eventCase_ == 1;
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     * @return The logEvent.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.LogEvent getLogEvent() {
      if (logEventBuilder_ == null) {
        if (eventCase_ == 1) {
          return (com.tcn.cloud.api.api.v0alpha.LogEvent) event_;
        }
        return com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance();
      } else {
        if (eventCase_ == 1) {
          return logEventBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    public Builder setLogEvent(com.tcn.cloud.api.api.v0alpha.LogEvent value) {
      if (logEventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        event_ = value;
        onChanged();
      } else {
        logEventBuilder_.setMessage(value);
      }
      eventCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    public Builder setLogEvent(
        com.tcn.cloud.api.api.v0alpha.LogEvent.Builder builderForValue) {
      if (logEventBuilder_ == null) {
        event_ = builderForValue.build();
        onChanged();
      } else {
        logEventBuilder_.setMessage(builderForValue.build());
      }
      eventCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    public Builder mergeLogEvent(com.tcn.cloud.api.api.v0alpha.LogEvent value) {
      if (logEventBuilder_ == null) {
        if (eventCase_ == 1 &&
            event_ != com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance()) {
          event_ = com.tcn.cloud.api.api.v0alpha.LogEvent.newBuilder((com.tcn.cloud.api.api.v0alpha.LogEvent) event_)
              .mergeFrom(value).buildPartial();
        } else {
          event_ = value;
        }
        onChanged();
      } else {
        if (eventCase_ == 1) {
          logEventBuilder_.mergeFrom(value);
        } else {
          logEventBuilder_.setMessage(value);
        }
      }
      eventCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    public Builder clearLogEvent() {
      if (logEventBuilder_ == null) {
        if (eventCase_ == 1) {
          eventCase_ = 0;
          event_ = null;
          onChanged();
        }
      } else {
        if (eventCase_ == 1) {
          eventCase_ = 0;
          event_ = null;
        }
        logEventBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.LogEvent.Builder getLogEventBuilder() {
      return getLogEventFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.LogEventOrBuilder getLogEventOrBuilder() {
      if ((eventCase_ == 1) && (logEventBuilder_ != null)) {
        return logEventBuilder_.getMessageOrBuilder();
      } else {
        if (eventCase_ == 1) {
          return (com.tcn.cloud.api.api.v0alpha.LogEvent) event_;
        }
        return com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.LogEvent log_event = 1 [json_name = "logEvent"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.LogEvent, com.tcn.cloud.api.api.v0alpha.LogEvent.Builder, com.tcn.cloud.api.api.v0alpha.LogEventOrBuilder> 
        getLogEventFieldBuilder() {
      if (logEventBuilder_ == null) {
        if (!(eventCase_ == 1)) {
          event_ = com.tcn.cloud.api.api.v0alpha.LogEvent.getDefaultInstance();
        }
        logEventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.LogEvent, com.tcn.cloud.api.api.v0alpha.LogEvent.Builder, com.tcn.cloud.api.api.v0alpha.LogEventOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.LogEvent) event_,
                getParentForChildren(),
                isClean());
        event_ = null;
      }
      eventCase_ = 1;
      onChanged();
      return logEventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SentinelEvent)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SentinelEvent)
  private static final com.tcn.cloud.api.api.v0alpha.SentinelEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SentinelEvent();
  }

  public static com.tcn.cloud.api.api.v0alpha.SentinelEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentinelEvent>
      PARSER = new com.google.protobuf.AbstractParser<SentinelEvent>() {
    @java.lang.Override
    public SentinelEvent parsePartialFrom(
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

  public static com.google.protobuf.Parser<SentinelEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentinelEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SentinelEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

