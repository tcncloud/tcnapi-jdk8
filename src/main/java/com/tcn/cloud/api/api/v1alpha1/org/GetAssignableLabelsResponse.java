// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/labels.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response message for the GetAssignableLabels RPC.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.GetAssignableLabelsResponse}
 */
public final class GetAssignableLabelsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.GetAssignableLabelsResponse)
    GetAssignableLabelsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAssignableLabelsResponse.newBuilder() to construct.
  private GetAssignableLabelsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAssignableLabelsResponse() {
    labels_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAssignableLabelsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignableLabelsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignableLabelsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.Builder.class);
  }

  public static final int LABELS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.Label> labels_;
  /**
   * <pre>
   * The list of labels available to the current user based
   * on the users permissions.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.Label> getLabelsList() {
    return labels_;
  }
  /**
   * <pre>
   * The list of labels available to the current user based
   * on the users permissions.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder> 
      getLabelsOrBuilderList() {
    return labels_;
  }
  /**
   * <pre>
   * The list of labels available to the current user based
   * on the users permissions.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   * <pre>
   * The list of labels available to the current user based
   * on the users permissions.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.Label getLabels(int index) {
    return labels_.get(index);
  }
  /**
   * <pre>
   * The list of labels available to the current user based
   * on the users permissions.
   * </pre>
   *
   * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder getLabelsOrBuilder(
      int index) {
    return labels_.get(index);
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
    for (int i = 0; i < labels_.size(); i++) {
      output.writeMessage(1, labels_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < labels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, labels_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse other = (com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse) obj;

    if (!getLabelsList()
        .equals(other.getLabelsList())) return false;
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
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse prototype) {
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
   * Response message for the GetAssignableLabels RPC.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.GetAssignableLabelsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.GetAssignableLabelsResponse)
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignableLabelsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignableLabelsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.class, com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.newBuilder()
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
      if (labelsBuilder_ == null) {
        labels_ = java.util.Collections.emptyList();
      } else {
        labels_ = null;
        labelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.LabelsProto.internal_static_api_v1alpha1_org_GetAssignableLabelsResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse result = new com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse result) {
      if (labelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.labels_ = labels_;
      } else {
        result.labels_ = labelsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse.getDefaultInstance()) return this;
      if (labelsBuilder_ == null) {
        if (!other.labels_.isEmpty()) {
          if (labels_.isEmpty()) {
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLabelsIsMutable();
            labels_.addAll(other.labels_);
          }
          onChanged();
        }
      } else {
        if (!other.labels_.isEmpty()) {
          if (labelsBuilder_.isEmpty()) {
            labelsBuilder_.dispose();
            labelsBuilder_ = null;
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            labelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLabelsFieldBuilder() : null;
          } else {
            labelsBuilder_.addAllMessages(other.labels_);
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
              com.tcn.cloud.api.api.v1alpha1.org.Label m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.org.Label.parser(),
                      extensionRegistry);
              if (labelsBuilder_ == null) {
                ensureLabelsIsMutable();
                labels_.add(m);
              } else {
                labelsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.org.Label> labels_ =
      java.util.Collections.emptyList();
    private void ensureLabelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        labels_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.org.Label>(labels_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.Label, com.tcn.cloud.api.api.v1alpha1.org.Label.Builder, com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder> labelsBuilder_;

    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.Label> getLabelsList() {
      if (labelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(labels_);
      } else {
        return labelsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public int getLabelsCount() {
      if (labelsBuilder_ == null) {
        return labels_.size();
      } else {
        return labelsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.Label getLabels(int index) {
      if (labelsBuilder_ == null) {
        return labels_.get(index);
      } else {
        return labelsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder setLabels(
        int index, com.tcn.cloud.api.api.v1alpha1.org.Label value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.set(index, value);
        onChanged();
      } else {
        labelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder setLabels(
        int index, com.tcn.cloud.api.api.v1alpha1.org.Label.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.set(index, builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder addLabels(com.tcn.cloud.api.api.v1alpha1.org.Label value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.add(value);
        onChanged();
      } else {
        labelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder addLabels(
        int index, com.tcn.cloud.api.api.v1alpha1.org.Label value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.add(index, value);
        onChanged();
      } else {
        labelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder addLabels(
        com.tcn.cloud.api.api.v1alpha1.org.Label.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.add(builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder addLabels(
        int index, com.tcn.cloud.api.api.v1alpha1.org.Label.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.add(index, builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder addAllLabels(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.org.Label> values) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, labels_);
        onChanged();
      } else {
        labelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder clearLabels() {
      if (labelsBuilder_ == null) {
        labels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        labelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public Builder removeLabels(int index) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.remove(index);
        onChanged();
      } else {
        labelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.Label.Builder getLabelsBuilder(
        int index) {
      return getLabelsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder getLabelsOrBuilder(
        int index) {
      if (labelsBuilder_ == null) {
        return labels_.get(index);  } else {
        return labelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder> 
         getLabelsOrBuilderList() {
      if (labelsBuilder_ != null) {
        return labelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(labels_);
      }
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.Label.Builder addLabelsBuilder() {
      return getLabelsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.org.Label.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.org.Label.Builder addLabelsBuilder(
        int index) {
      return getLabelsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.org.Label.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of labels available to the current user based
     * on the users permissions.
     * </pre>
     *
     * <code>repeated .api.v1alpha1.org.Label labels = 1 [json_name = "labels"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.org.Label.Builder> 
         getLabelsBuilderList() {
      return getLabelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.org.Label, com.tcn.cloud.api.api.v1alpha1.org.Label.Builder, com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder> 
        getLabelsFieldBuilder() {
      if (labelsBuilder_ == null) {
        labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.org.Label, com.tcn.cloud.api.api.v1alpha1.org.Label.Builder, com.tcn.cloud.api.api.v1alpha1.org.LabelOrBuilder>(
                labels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        labels_ = null;
      }
      return labelsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.GetAssignableLabelsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.GetAssignableLabelsResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAssignableLabelsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAssignableLabelsResponse>() {
    @java.lang.Override
    public GetAssignableLabelsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAssignableLabelsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAssignableLabelsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.GetAssignableLabelsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

