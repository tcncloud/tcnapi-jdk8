// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha1/plans.proto

package com.tcn.cloud.api.services.billing.v1alpha1;

/**
 * Protobuf type {@code services.billing.v1alpha1.GetBillingPlanHistoryResponse}
 */
public final class GetBillingPlanHistoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha1.GetBillingPlanHistoryResponse)
    GetBillingPlanHistoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBillingPlanHistoryResponse.newBuilder() to construct.
  private GetBillingPlanHistoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBillingPlanHistoryResponse() {
    history_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBillingPlanHistoryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_GetBillingPlanHistoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_GetBillingPlanHistoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.class, com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.Builder.class);
  }

  public static final int HISTORY_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot> history_;
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot> getHistoryList() {
    return history_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder> 
      getHistoryOrBuilderList() {
    return history_;
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
   */
  @java.lang.Override
  public int getHistoryCount() {
    return history_.size();
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot getHistory(int index) {
    return history_.get(index);
  }
  /**
   * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder getHistoryOrBuilder(
      int index) {
    return history_.get(index);
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
    for (int i = 0; i < history_.size(); i++) {
      output.writeMessage(1, history_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < history_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, history_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse other = (com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse) obj;

    if (!getHistoryList()
        .equals(other.getHistoryList())) return false;
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
    if (getHistoryCount() > 0) {
      hash = (37 * hash) + HISTORY_FIELD_NUMBER;
      hash = (53 * hash) + getHistoryList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha1.GetBillingPlanHistoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha1.GetBillingPlanHistoryResponse)
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_GetBillingPlanHistoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_GetBillingPlanHistoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.class, com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.newBuilder()
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
      if (historyBuilder_ == null) {
        history_ = java.util.Collections.emptyList();
      } else {
        history_ = null;
        historyBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.PlansProto.internal_static_services_billing_v1alpha1_GetBillingPlanHistoryResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse result = new com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse result) {
      if (historyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          history_ = java.util.Collections.unmodifiableList(history_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.history_ = history_;
      } else {
        result.history_ = historyBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse.getDefaultInstance()) return this;
      if (historyBuilder_ == null) {
        if (!other.history_.isEmpty()) {
          if (history_.isEmpty()) {
            history_ = other.history_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHistoryIsMutable();
            history_.addAll(other.history_);
          }
          onChanged();
        }
      } else {
        if (!other.history_.isEmpty()) {
          if (historyBuilder_.isEmpty()) {
            historyBuilder_.dispose();
            historyBuilder_ = null;
            history_ = other.history_;
            bitField0_ = (bitField0_ & ~0x00000001);
            historyBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHistoryFieldBuilder() : null;
          } else {
            historyBuilder_.addAllMessages(other.history_);
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
              com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot m =
                  input.readMessage(
                      com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.parser(),
                      extensionRegistry);
              if (historyBuilder_ == null) {
                ensureHistoryIsMutable();
                history_.add(m);
              } else {
                historyBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot> history_ =
      java.util.Collections.emptyList();
    private void ensureHistoryIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        history_ = new java.util.ArrayList<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot>(history_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder> historyBuilder_;

    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot> getHistoryList() {
      if (historyBuilder_ == null) {
        return java.util.Collections.unmodifiableList(history_);
      } else {
        return historyBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public int getHistoryCount() {
      if (historyBuilder_ == null) {
        return history_.size();
      } else {
        return historyBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot getHistory(int index) {
      if (historyBuilder_ == null) {
        return history_.get(index);
      } else {
        return historyBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder setHistory(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot value) {
      if (historyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHistoryIsMutable();
        history_.set(index, value);
        onChanged();
      } else {
        historyBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder setHistory(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder builderForValue) {
      if (historyBuilder_ == null) {
        ensureHistoryIsMutable();
        history_.set(index, builderForValue.build());
        onChanged();
      } else {
        historyBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder addHistory(com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot value) {
      if (historyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHistoryIsMutable();
        history_.add(value);
        onChanged();
      } else {
        historyBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder addHistory(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot value) {
      if (historyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHistoryIsMutable();
        history_.add(index, value);
        onChanged();
      } else {
        historyBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder addHistory(
        com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder builderForValue) {
      if (historyBuilder_ == null) {
        ensureHistoryIsMutable();
        history_.add(builderForValue.build());
        onChanged();
      } else {
        historyBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder addHistory(
        int index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder builderForValue) {
      if (historyBuilder_ == null) {
        ensureHistoryIsMutable();
        history_.add(index, builderForValue.build());
        onChanged();
      } else {
        historyBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder addAllHistory(
        java.lang.Iterable<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot> values) {
      if (historyBuilder_ == null) {
        ensureHistoryIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, history_);
        onChanged();
      } else {
        historyBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder clearHistory() {
      if (historyBuilder_ == null) {
        history_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        historyBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public Builder removeHistory(int index) {
      if (historyBuilder_ == null) {
        ensureHistoryIsMutable();
        history_.remove(index);
        onChanged();
      } else {
        historyBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder getHistoryBuilder(
        int index) {
      return getHistoryFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder getHistoryOrBuilder(
        int index) {
      if (historyBuilder_ == null) {
        return history_.get(index);  } else {
        return historyBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder> 
         getHistoryOrBuilderList() {
      if (historyBuilder_ != null) {
        return historyBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(history_);
      }
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder addHistoryBuilder() {
      return getHistoryFieldBuilder().addBuilder(
          com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder addHistoryBuilder(
        int index) {
      return getHistoryFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.getDefaultInstance());
    }
    /**
     * <code>repeated .services.billing.entities.v1alpha1.BillingPlanSnapshot history = 1 [json_name = "history"];</code>
     */
    public java.util.List<com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder> 
         getHistoryBuilderList() {
      return getHistoryFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder> 
        getHistoryFieldBuilder() {
      if (historyBuilder_ == null) {
        historyBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshot.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha1.BillingPlanSnapshotOrBuilder>(
                history_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        history_ = null;
      }
      return historyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha1.GetBillingPlanHistoryResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha1.GetBillingPlanHistoryResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBillingPlanHistoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBillingPlanHistoryResponse>() {
    @java.lang.Override
    public GetBillingPlanHistoryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBillingPlanHistoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBillingPlanHistoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha1.GetBillingPlanHistoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

