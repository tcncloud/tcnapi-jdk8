// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/huntgroup.proto

package com.tcn.cloud.api.api.v1alpha1.org;

/**
 * <pre>
 * Response message for ListDataDipTemplates RPC method.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.ListDataDipTemplatesResponse}
 */
public final class ListDataDipTemplatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.ListDataDipTemplatesResponse)
    ListDataDipTemplatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListDataDipTemplatesResponse.newBuilder() to construct.
  private ListDataDipTemplatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListDataDipTemplatesResponse() {
    templates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListDataDipTemplatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_ListDataDipTemplatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_ListDataDipTemplatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.Builder.class);
  }

  public static final int TEMPLATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.DataDipConfig> templates_;
  /**
   * <pre>
   * list of the organizations templates.
   * </pre>
   *
   * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.DataDipConfig> getTemplatesList() {
    return templates_;
  }
  /**
   * <pre>
   * list of the organizations templates.
   * </pre>
   *
   * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder> 
      getTemplatesOrBuilderList() {
    return templates_;
  }
  /**
   * <pre>
   * list of the organizations templates.
   * </pre>
   *
   * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
   */
  @java.lang.Override
  public int getTemplatesCount() {
    return templates_.size();
  }
  /**
   * <pre>
   * list of the organizations templates.
   * </pre>
   *
   * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DataDipConfig getTemplates(int index) {
    return templates_.get(index);
  }
  /**
   * <pre>
   * list of the organizations templates.
   * </pre>
   *
   * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder getTemplatesOrBuilder(
      int index) {
    return templates_.get(index);
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
    for (int i = 0; i < templates_.size(); i++) {
      output.writeMessage(1, templates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < templates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, templates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse) obj;

    if (!getTemplatesList()
        .equals(other.getTemplatesList())) return false;
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
    if (getTemplatesCount() > 0) {
      hash = (37 * hash) + TEMPLATES_FIELD_NUMBER;
      hash = (53 * hash) + getTemplatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse prototype) {
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
   * Response message for ListDataDipTemplates RPC method.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.ListDataDipTemplatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.ListDataDipTemplatesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_ListDataDipTemplatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_ListDataDipTemplatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.newBuilder()
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
      if (templatesBuilder_ == null) {
        templates_ = java.util.Collections.emptyList();
      } else {
        templates_ = null;
        templatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.HuntgroupProto.internal_static_api_v1alpha1_org_ListDataDipTemplatesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse result) {
      if (templatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          templates_ = java.util.Collections.unmodifiableList(templates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.templates_ = templates_;
      } else {
        result.templates_ = templatesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse.getDefaultInstance()) return this;
      if (templatesBuilder_ == null) {
        if (!other.templates_.isEmpty()) {
          if (templates_.isEmpty()) {
            templates_ = other.templates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTemplatesIsMutable();
            templates_.addAll(other.templates_);
          }
          onChanged();
        }
      } else {
        if (!other.templates_.isEmpty()) {
          if (templatesBuilder_.isEmpty()) {
            templatesBuilder_.dispose();
            templatesBuilder_ = null;
            templates_ = other.templates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            templatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTemplatesFieldBuilder() : null;
          } else {
            templatesBuilder_.addAllMessages(other.templates_);
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
              com.tcn.cloud.api.api.commons.org.DataDipConfig m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.DataDipConfig.parser(),
                      extensionRegistry);
              if (templatesBuilder_ == null) {
                ensureTemplatesIsMutable();
                templates_.add(m);
              } else {
                templatesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.org.DataDipConfig> templates_ =
      java.util.Collections.emptyList();
    private void ensureTemplatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        templates_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.DataDipConfig>(templates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.DataDipConfig, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder, com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder> templatesBuilder_;

    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.DataDipConfig> getTemplatesList() {
      if (templatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(templates_);
      } else {
        return templatesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public int getTemplatesCount() {
      if (templatesBuilder_ == null) {
        return templates_.size();
      } else {
        return templatesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfig getTemplates(int index) {
      if (templatesBuilder_ == null) {
        return templates_.get(index);
      } else {
        return templatesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder setTemplates(
        int index, com.tcn.cloud.api.api.commons.org.DataDipConfig value) {
      if (templatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplatesIsMutable();
        templates_.set(index, value);
        onChanged();
      } else {
        templatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder setTemplates(
        int index, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder builderForValue) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.set(index, builderForValue.build());
        onChanged();
      } else {
        templatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder addTemplates(com.tcn.cloud.api.api.commons.org.DataDipConfig value) {
      if (templatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplatesIsMutable();
        templates_.add(value);
        onChanged();
      } else {
        templatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder addTemplates(
        int index, com.tcn.cloud.api.api.commons.org.DataDipConfig value) {
      if (templatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplatesIsMutable();
        templates_.add(index, value);
        onChanged();
      } else {
        templatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder addTemplates(
        com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder builderForValue) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.add(builderForValue.build());
        onChanged();
      } else {
        templatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder addTemplates(
        int index, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder builderForValue) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.add(index, builderForValue.build());
        onChanged();
      } else {
        templatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder addAllTemplates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.DataDipConfig> values) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, templates_);
        onChanged();
      } else {
        templatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder clearTemplates() {
      if (templatesBuilder_ == null) {
        templates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        templatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public Builder removeTemplates(int index) {
      if (templatesBuilder_ == null) {
        ensureTemplatesIsMutable();
        templates_.remove(index);
        onChanged();
      } else {
        templatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder getTemplatesBuilder(
        int index) {
      return getTemplatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder getTemplatesOrBuilder(
        int index) {
      if (templatesBuilder_ == null) {
        return templates_.get(index);  } else {
        return templatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder> 
         getTemplatesOrBuilderList() {
      if (templatesBuilder_ != null) {
        return templatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(templates_);
      }
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder addTemplatesBuilder() {
      return getTemplatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder addTemplatesBuilder(
        int index) {
      return getTemplatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.DataDipConfig.getDefaultInstance());
    }
    /**
     * <pre>
     * list of the organizations templates.
     * </pre>
     *
     * <code>repeated .api.commons.org.DataDipConfig templates = 1 [json_name = "templates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder> 
         getTemplatesBuilderList() {
      return getTemplatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.DataDipConfig, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder, com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder> 
        getTemplatesFieldBuilder() {
      if (templatesBuilder_ == null) {
        templatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.DataDipConfig, com.tcn.cloud.api.api.commons.org.DataDipConfig.Builder, com.tcn.cloud.api.api.commons.org.DataDipConfigOrBuilder>(
                templates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        templates_ = null;
      }
      return templatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.ListDataDipTemplatesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.ListDataDipTemplatesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataDipTemplatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListDataDipTemplatesResponse>() {
    @java.lang.Override
    public ListDataDipTemplatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDataDipTemplatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataDipTemplatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.ListDataDipTemplatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

