// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/service.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

/**
 * Protobuf type {@code api.v1alpha1.classifier.ListFileTemplatesResponse}
 */
public final class ListFileTemplatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.classifier.ListFileTemplatesResponse)
    ListFileTemplatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListFileTemplatesResponse.newBuilder() to construct.
  private ListFileTemplatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListFileTemplatesResponse() {
    fileTemplates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListFileTemplatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.classifier.ServiceProto.internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.classifier.ServiceProto.internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.class, com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.Builder.class);
  }

  public static final int FILE_TEMPLATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate> fileTemplates_;
  /**
   * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate> getFileTemplatesList() {
    return fileTemplates_;
  }
  /**
   * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder> 
      getFileTemplatesOrBuilderList() {
    return fileTemplates_;
  }
  /**
   * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
   */
  @java.lang.Override
  public int getFileTemplatesCount() {
    return fileTemplates_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate getFileTemplates(int index) {
    return fileTemplates_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder getFileTemplatesOrBuilder(
      int index) {
    return fileTemplates_.get(index);
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
    for (int i = 0; i < fileTemplates_.size(); i++) {
      output.writeMessage(1, fileTemplates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fileTemplates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fileTemplates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse other = (com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse) obj;

    if (!getFileTemplatesList()
        .equals(other.getFileTemplatesList())) return false;
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
    if (getFileTemplatesCount() > 0) {
      hash = (37 * hash) + FILE_TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getFileTemplatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse prototype) {
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
   * Protobuf type {@code api.v1alpha1.classifier.ListFileTemplatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.classifier.ListFileTemplatesResponse)
      com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.ServiceProto.internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.ServiceProto.internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.class, com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.newBuilder()
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
      if (fileTemplatesBuilder_ == null) {
        fileTemplates_ = java.util.Collections.emptyList();
      } else {
        fileTemplates_ = null;
        fileTemplatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.ServiceProto.internal_static_api_v1alpha1_classifier_ListFileTemplatesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse result = new com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse result) {
      if (fileTemplatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fileTemplates_ = java.util.Collections.unmodifiableList(fileTemplates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fileTemplates_ = fileTemplates_;
      } else {
        result.fileTemplates_ = fileTemplatesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse.getDefaultInstance()) return this;
      if (fileTemplatesBuilder_ == null) {
        if (!other.fileTemplates_.isEmpty()) {
          if (fileTemplates_.isEmpty()) {
            fileTemplates_ = other.fileTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFileTemplatesIsMutable();
            fileTemplates_.addAll(other.fileTemplates_);
          }
          onChanged();
        }
      } else {
        if (!other.fileTemplates_.isEmpty()) {
          if (fileTemplatesBuilder_.isEmpty()) {
            fileTemplatesBuilder_.dispose();
            fileTemplatesBuilder_ = null;
            fileTemplates_ = other.fileTemplates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fileTemplatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFileTemplatesFieldBuilder() : null;
          } else {
            fileTemplatesBuilder_.addAllMessages(other.fileTemplates_);
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
              com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.parser(),
                      extensionRegistry);
              if (fileTemplatesBuilder_ == null) {
                ensureFileTemplatesIsMutable();
                fileTemplates_.add(m);
              } else {
                fileTemplatesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate> fileTemplates_ =
      java.util.Collections.emptyList();
    private void ensureFileTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fileTemplates_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate>(fileTemplates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder> fileTemplatesBuilder_;

    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate> getFileTemplatesList() {
      if (fileTemplatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fileTemplates_);
      } else {
        return fileTemplatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public int getFileTemplatesCount() {
      if (fileTemplatesBuilder_ == null) {
        return fileTemplates_.size();
      } else {
        return fileTemplatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate getFileTemplates(int index) {
      if (fileTemplatesBuilder_ == null) {
        return fileTemplates_.get(index);
      } else {
        return fileTemplatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder setFileTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate value) {
      if (fileTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileTemplatesIsMutable();
        fileTemplates_.set(index, value);
        onChanged();
      } else {
        fileTemplatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder setFileTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder builderForValue) {
      if (fileTemplatesBuilder_ == null) {
        ensureFileTemplatesIsMutable();
        fileTemplates_.set(index, builderForValue.build());
        onChanged();
      } else {
        fileTemplatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder addFileTemplates(com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate value) {
      if (fileTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileTemplatesIsMutable();
        fileTemplates_.add(value);
        onChanged();
      } else {
        fileTemplatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder addFileTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate value) {
      if (fileTemplatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileTemplatesIsMutable();
        fileTemplates_.add(index, value);
        onChanged();
      } else {
        fileTemplatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder addFileTemplates(
        com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder builderForValue) {
      if (fileTemplatesBuilder_ == null) {
        ensureFileTemplatesIsMutable();
        fileTemplates_.add(builderForValue.build());
        onChanged();
      } else {
        fileTemplatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder addFileTemplates(
        int index, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder builderForValue) {
      if (fileTemplatesBuilder_ == null) {
        ensureFileTemplatesIsMutable();
        fileTemplates_.add(index, builderForValue.build());
        onChanged();
      } else {
        fileTemplatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder addAllFileTemplates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate> values) {
      if (fileTemplatesBuilder_ == null) {
        ensureFileTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fileTemplates_);
        onChanged();
      } else {
        fileTemplatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder clearFileTemplates() {
      if (fileTemplatesBuilder_ == null) {
        fileTemplates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fileTemplatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public Builder removeFileTemplates(int index) {
      if (fileTemplatesBuilder_ == null) {
        ensureFileTemplatesIsMutable();
        fileTemplates_.remove(index);
        onChanged();
      } else {
        fileTemplatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder getFileTemplatesBuilder(
        int index) {
      return getFileTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder getFileTemplatesOrBuilder(
        int index) {
      if (fileTemplatesBuilder_ == null) {
        return fileTemplates_.get(index);  } else {
        return fileTemplatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder> 
         getFileTemplatesOrBuilderList() {
      if (fileTemplatesBuilder_ != null) {
        return fileTemplatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fileTemplates_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder addFileTemplatesBuilder() {
      return getFileTemplatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder addFileTemplatesBuilder(
        int index) {
      return getFileTemplatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.classifier.FileTemplate file_templates = 1 [json_name = "fileTemplates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder> 
         getFileTemplatesBuilderList() {
      return getFileTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder> 
        getFileTemplatesFieldBuilder() {
      if (fileTemplatesBuilder_ == null) {
        fileTemplatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplate.Builder, com.tcn.cloud.api.api.v1alpha1.classifier.FileTemplateOrBuilder>(
                fileTemplates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fileTemplates_ = null;
      }
      return fileTemplatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.classifier.ListFileTemplatesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.classifier.ListFileTemplatesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListFileTemplatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListFileTemplatesResponse>() {
    @java.lang.Override
    public ListFileTemplatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListFileTemplatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListFileTemplatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.classifier.ListFileTemplatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

