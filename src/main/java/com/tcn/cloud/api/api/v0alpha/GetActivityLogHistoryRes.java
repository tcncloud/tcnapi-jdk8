// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetActivityLogHistoryRes}
 */
public final class GetActivityLogHistoryRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetActivityLogHistoryRes)
    GetActivityLogHistoryResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetActivityLogHistoryRes.newBuilder() to construct.
  private GetActivityLogHistoryRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetActivityLogHistoryRes() {
    activityLogs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetActivityLogHistoryRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetActivityLogHistoryRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetActivityLogHistoryRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.class, com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.Builder.class);
  }

  public static final int ACTIVITY_LOGS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.ActivityLog> activityLogs_;
  /**
   * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.ActivityLog> getActivityLogsList() {
    return activityLogs_;
  }
  /**
   * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder> 
      getActivityLogsOrBuilderList() {
    return activityLogs_;
  }
  /**
   * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
   */
  @java.lang.Override
  public int getActivityLogsCount() {
    return activityLogs_.size();
  }
  /**
   * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ActivityLog getActivityLogs(int index) {
    return activityLogs_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder getActivityLogsOrBuilder(
      int index) {
    return activityLogs_.get(index);
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
    for (int i = 0; i < activityLogs_.size(); i++) {
      output.writeMessage(1, activityLogs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < activityLogs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, activityLogs_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes other = (com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes) obj;

    if (!getActivityLogsList()
        .equals(other.getActivityLogsList())) return false;
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
    if (getActivityLogsCount() > 0) {
      hash = (37 * hash) + ACTIVITY_LOGS_FIELD_NUMBER;
      hash = (53 * hash) + getActivityLogsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetActivityLogHistoryRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetActivityLogHistoryRes)
      com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetActivityLogHistoryRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetActivityLogHistoryRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.class, com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.newBuilder()
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
      if (activityLogsBuilder_ == null) {
        activityLogs_ = java.util.Collections.emptyList();
      } else {
        activityLogs_ = null;
        activityLogsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_GetActivityLogHistoryRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes build() {
      com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes result = new com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes result) {
      if (activityLogsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          activityLogs_ = java.util.Collections.unmodifiableList(activityLogs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.activityLogs_ = activityLogs_;
      } else {
        result.activityLogs_ = activityLogsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes.getDefaultInstance()) return this;
      if (activityLogsBuilder_ == null) {
        if (!other.activityLogs_.isEmpty()) {
          if (activityLogs_.isEmpty()) {
            activityLogs_ = other.activityLogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActivityLogsIsMutable();
            activityLogs_.addAll(other.activityLogs_);
          }
          onChanged();
        }
      } else {
        if (!other.activityLogs_.isEmpty()) {
          if (activityLogsBuilder_.isEmpty()) {
            activityLogsBuilder_.dispose();
            activityLogsBuilder_ = null;
            activityLogs_ = other.activityLogs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            activityLogsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getActivityLogsFieldBuilder() : null;
          } else {
            activityLogsBuilder_.addAllMessages(other.activityLogs_);
          }
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
              com.tcn.cloud.api.api.v0alpha.ActivityLog m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.ActivityLog.parser(),
                      extensionRegistry);
              if (activityLogsBuilder_ == null) {
                ensureActivityLogsIsMutable();
                activityLogs_.add(m);
              } else {
                activityLogsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.ActivityLog> activityLogs_ =
      java.util.Collections.emptyList();
    private void ensureActivityLogsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        activityLogs_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.ActivityLog>(activityLogs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ActivityLog, com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder, com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder> activityLogsBuilder_;

    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ActivityLog> getActivityLogsList() {
      if (activityLogsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(activityLogs_);
      } else {
        return activityLogsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public int getActivityLogsCount() {
      if (activityLogsBuilder_ == null) {
        return activityLogs_.size();
      } else {
        return activityLogsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ActivityLog getActivityLogs(int index) {
      if (activityLogsBuilder_ == null) {
        return activityLogs_.get(index);
      } else {
        return activityLogsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder setActivityLogs(
        int index, com.tcn.cloud.api.api.v0alpha.ActivityLog value) {
      if (activityLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActivityLogsIsMutable();
        activityLogs_.set(index, value);
        onChanged();
      } else {
        activityLogsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder setActivityLogs(
        int index, com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder builderForValue) {
      if (activityLogsBuilder_ == null) {
        ensureActivityLogsIsMutable();
        activityLogs_.set(index, builderForValue.build());
        onChanged();
      } else {
        activityLogsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder addActivityLogs(com.tcn.cloud.api.api.v0alpha.ActivityLog value) {
      if (activityLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActivityLogsIsMutable();
        activityLogs_.add(value);
        onChanged();
      } else {
        activityLogsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder addActivityLogs(
        int index, com.tcn.cloud.api.api.v0alpha.ActivityLog value) {
      if (activityLogsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActivityLogsIsMutable();
        activityLogs_.add(index, value);
        onChanged();
      } else {
        activityLogsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder addActivityLogs(
        com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder builderForValue) {
      if (activityLogsBuilder_ == null) {
        ensureActivityLogsIsMutable();
        activityLogs_.add(builderForValue.build());
        onChanged();
      } else {
        activityLogsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder addActivityLogs(
        int index, com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder builderForValue) {
      if (activityLogsBuilder_ == null) {
        ensureActivityLogsIsMutable();
        activityLogs_.add(index, builderForValue.build());
        onChanged();
      } else {
        activityLogsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder addAllActivityLogs(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.ActivityLog> values) {
      if (activityLogsBuilder_ == null) {
        ensureActivityLogsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, activityLogs_);
        onChanged();
      } else {
        activityLogsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder clearActivityLogs() {
      if (activityLogsBuilder_ == null) {
        activityLogs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        activityLogsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public Builder removeActivityLogs(int index) {
      if (activityLogsBuilder_ == null) {
        ensureActivityLogsIsMutable();
        activityLogs_.remove(index);
        onChanged();
      } else {
        activityLogsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder getActivityLogsBuilder(
        int index) {
      return getActivityLogsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder getActivityLogsOrBuilder(
        int index) {
      if (activityLogsBuilder_ == null) {
        return activityLogs_.get(index);  } else {
        return activityLogsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder> 
         getActivityLogsOrBuilderList() {
      if (activityLogsBuilder_ != null) {
        return activityLogsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(activityLogs_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder addActivityLogsBuilder() {
      return getActivityLogsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.ActivityLog.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder addActivityLogsBuilder(
        int index) {
      return getActivityLogsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.ActivityLog.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ActivityLog activity_logs = 1 [json_name = "activityLogs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder> 
         getActivityLogsBuilderList() {
      return getActivityLogsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ActivityLog, com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder, com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder> 
        getActivityLogsFieldBuilder() {
      if (activityLogsBuilder_ == null) {
        activityLogsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ActivityLog, com.tcn.cloud.api.api.v0alpha.ActivityLog.Builder, com.tcn.cloud.api.api.v0alpha.ActivityLogOrBuilder>(
                activityLogs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        activityLogs_ = null;
      }
      return activityLogsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetActivityLogHistoryRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetActivityLogHistoryRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetActivityLogHistoryRes>
      PARSER = new com.google.protobuf.AbstractParser<GetActivityLogHistoryRes>() {
    @java.lang.Override
    public GetActivityLogHistoryRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetActivityLogHistoryRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetActivityLogHistoryRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetActivityLogHistoryRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

