// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetFieldsForElementResult}
 */
public final class GetFieldsForElementResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetFieldsForElementResult)
    GetFieldsForElementResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFieldsForElementResult.newBuilder() to construct.
  private GetFieldsForElementResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFieldsForElementResult() {
    headers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFieldsForElementResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetFieldsForElementResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetFieldsForElementResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.class, com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.Builder.class);
  }

  public static final int HEADERS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.Header> headers_;
  /**
   * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.Header> getHeadersList() {
    return headers_;
  }
  /**
   * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder> 
      getHeadersOrBuilderList() {
    return headers_;
  }
  /**
   * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
   */
  @java.lang.Override
  public int getHeadersCount() {
    return headers_.size();
  }
  /**
   * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Header getHeaders(int index) {
    return headers_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder getHeadersOrBuilder(
      int index) {
    return headers_.get(index);
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
    for (int i = 0; i < headers_.size(); i++) {
      output.writeMessage(1, headers_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < headers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, headers_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult other = (com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult) obj;

    if (!getHeadersList()
        .equals(other.getHeadersList())) return false;
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
    if (getHeadersCount() > 0) {
      hash = (37 * hash) + HEADERS_FIELD_NUMBER;
      hash = (53 * hash) + getHeadersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult prototype) {
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
   * Protobuf type {@code api.v0alpha.GetFieldsForElementResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetFieldsForElementResult)
      com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetFieldsForElementResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetFieldsForElementResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.class, com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.newBuilder()
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
      if (headersBuilder_ == null) {
        headers_ = java.util.Collections.emptyList();
      } else {
        headers_ = null;
        headersBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_GetFieldsForElementResult_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult build() {
      com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult result = new com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult result) {
      if (headersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          headers_ = java.util.Collections.unmodifiableList(headers_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.headers_ = headers_;
      } else {
        result.headers_ = headersBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult.getDefaultInstance()) return this;
      if (headersBuilder_ == null) {
        if (!other.headers_.isEmpty()) {
          if (headers_.isEmpty()) {
            headers_ = other.headers_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHeadersIsMutable();
            headers_.addAll(other.headers_);
          }
          onChanged();
        }
      } else {
        if (!other.headers_.isEmpty()) {
          if (headersBuilder_.isEmpty()) {
            headersBuilder_.dispose();
            headersBuilder_ = null;
            headers_ = other.headers_;
            bitField0_ = (bitField0_ & ~0x00000001);
            headersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHeadersFieldBuilder() : null;
          } else {
            headersBuilder_.addAllMessages(other.headers_);
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
              com.tcn.cloud.api.api.v0alpha.Header m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.Header.parser(),
                      extensionRegistry);
              if (headersBuilder_ == null) {
                ensureHeadersIsMutable();
                headers_.add(m);
              } else {
                headersBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.Header> headers_ =
      java.util.Collections.emptyList();
    private void ensureHeadersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        headers_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.Header>(headers_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Header, com.tcn.cloud.api.api.v0alpha.Header.Builder, com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder> headersBuilder_;

    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Header> getHeadersList() {
      if (headersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(headers_);
      } else {
        return headersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public int getHeadersCount() {
      if (headersBuilder_ == null) {
        return headers_.size();
      } else {
        return headersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Header getHeaders(int index) {
      if (headersBuilder_ == null) {
        return headers_.get(index);
      } else {
        return headersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder setHeaders(
        int index, com.tcn.cloud.api.api.v0alpha.Header value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.set(index, value);
        onChanged();
      } else {
        headersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder setHeaders(
        int index, com.tcn.cloud.api.api.v0alpha.Header.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.set(index, builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder addHeaders(com.tcn.cloud.api.api.v0alpha.Header value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.add(value);
        onChanged();
      } else {
        headersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder addHeaders(
        int index, com.tcn.cloud.api.api.v0alpha.Header value) {
      if (headersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHeadersIsMutable();
        headers_.add(index, value);
        onChanged();
      } else {
        headersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder addHeaders(
        com.tcn.cloud.api.api.v0alpha.Header.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.add(builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder addHeaders(
        int index, com.tcn.cloud.api.api.v0alpha.Header.Builder builderForValue) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.add(index, builderForValue.build());
        onChanged();
      } else {
        headersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder addAllHeaders(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.Header> values) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, headers_);
        onChanged();
      } else {
        headersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder clearHeaders() {
      if (headersBuilder_ == null) {
        headers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        headersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public Builder removeHeaders(int index) {
      if (headersBuilder_ == null) {
        ensureHeadersIsMutable();
        headers_.remove(index);
        onChanged();
      } else {
        headersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Header.Builder getHeadersBuilder(
        int index) {
      return getHeadersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder getHeadersOrBuilder(
        int index) {
      if (headersBuilder_ == null) {
        return headers_.get(index);  } else {
        return headersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder> 
         getHeadersOrBuilderList() {
      if (headersBuilder_ != null) {
        return headersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(headers_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Header.Builder addHeadersBuilder() {
      return getHeadersFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.Header.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Header.Builder addHeadersBuilder(
        int index) {
      return getHeadersFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.Header.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Header headers = 1 [json_name = "headers"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Header.Builder> 
         getHeadersBuilderList() {
      return getHeadersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Header, com.tcn.cloud.api.api.v0alpha.Header.Builder, com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder> 
        getHeadersFieldBuilder() {
      if (headersBuilder_ == null) {
        headersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Header, com.tcn.cloud.api.api.v0alpha.Header.Builder, com.tcn.cloud.api.api.v0alpha.HeaderOrBuilder>(
                headers_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        headers_ = null;
      }
      return headersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetFieldsForElementResult)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetFieldsForElementResult)
  private static final com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFieldsForElementResult>
      PARSER = new com.google.protobuf.AbstractParser<GetFieldsForElementResult>() {
    @java.lang.Override
    public GetFieldsForElementResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFieldsForElementResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFieldsForElementResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetFieldsForElementResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

