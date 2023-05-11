// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.DispositionSet}
 */
public final class DispositionSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.DispositionSet)
    DispositionSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DispositionSet.newBuilder() to construct.
  private DispositionSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DispositionSet() {
    dispositions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DispositionSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DispositionSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DispositionSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.DispositionSet.class, com.tcn.cloud.api.api.v0alpha.DispositionSet.Builder.class);
  }

  public static final int DISPOSITIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair> dispositions_;
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair> getDispositionsList() {
    return dispositions_;
  }
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder> 
      getDispositionsOrBuilderList() {
    return dispositions_;
  }
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  @java.lang.Override
  public int getDispositionsCount() {
    return dispositions_.size();
  }
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DispositionPair getDispositions(int index) {
    return dispositions_.get(index);
  }
  /**
   * <pre>
   * A set of disposition pairs.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder getDispositionsOrBuilder(
      int index) {
    return dispositions_.get(index);
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
    for (int i = 0; i < dispositions_.size(); i++) {
      output.writeMessage(1, dispositions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dispositions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dispositions_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.DispositionSet)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.DispositionSet other = (com.tcn.cloud.api.api.v0alpha.DispositionSet) obj;

    if (!getDispositionsList()
        .equals(other.getDispositionsList())) return false;
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
    if (getDispositionsCount() > 0) {
      hash = (37 * hash) + DISPOSITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getDispositionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.DispositionSet parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.DispositionSet prototype) {
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
   * Protobuf type {@code api.v0alpha.DispositionSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.DispositionSet)
      com.tcn.cloud.api.api.v0alpha.DispositionSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DispositionSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DispositionSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.DispositionSet.class, com.tcn.cloud.api.api.v0alpha.DispositionSet.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.DispositionSet.newBuilder()
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
      if (dispositionsBuilder_ == null) {
        dispositions_ = java.util.Collections.emptyList();
      } else {
        dispositions_ = null;
        dispositionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_DispositionSet_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DispositionSet getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.DispositionSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DispositionSet build() {
      com.tcn.cloud.api.api.v0alpha.DispositionSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.DispositionSet buildPartial() {
      com.tcn.cloud.api.api.v0alpha.DispositionSet result = new com.tcn.cloud.api.api.v0alpha.DispositionSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.DispositionSet result) {
      if (dispositionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dispositions_ = java.util.Collections.unmodifiableList(dispositions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dispositions_ = dispositions_;
      } else {
        result.dispositions_ = dispositionsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.DispositionSet result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.DispositionSet) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.DispositionSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.DispositionSet other) {
      if (other == com.tcn.cloud.api.api.v0alpha.DispositionSet.getDefaultInstance()) return this;
      if (dispositionsBuilder_ == null) {
        if (!other.dispositions_.isEmpty()) {
          if (dispositions_.isEmpty()) {
            dispositions_ = other.dispositions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDispositionsIsMutable();
            dispositions_.addAll(other.dispositions_);
          }
          onChanged();
        }
      } else {
        if (!other.dispositions_.isEmpty()) {
          if (dispositionsBuilder_.isEmpty()) {
            dispositionsBuilder_.dispose();
            dispositionsBuilder_ = null;
            dispositions_ = other.dispositions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dispositionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDispositionsFieldBuilder() : null;
          } else {
            dispositionsBuilder_.addAllMessages(other.dispositions_);
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
              com.tcn.cloud.api.api.v0alpha.DispositionPair m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.DispositionPair.parser(),
                      extensionRegistry);
              if (dispositionsBuilder_ == null) {
                ensureDispositionsIsMutable();
                dispositions_.add(m);
              } else {
                dispositionsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair> dispositions_ =
      java.util.Collections.emptyList();
    private void ensureDispositionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dispositions_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.DispositionPair>(dispositions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DispositionPair, com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder, com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder> dispositionsBuilder_;

    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair> getDispositionsList() {
      if (dispositionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dispositions_);
      } else {
        return dispositionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public int getDispositionsCount() {
      if (dispositionsBuilder_ == null) {
        return dispositions_.size();
      } else {
        return dispositionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DispositionPair getDispositions(int index) {
      if (dispositionsBuilder_ == null) {
        return dispositions_.get(index);
      } else {
        return dispositionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder setDispositions(
        int index, com.tcn.cloud.api.api.v0alpha.DispositionPair value) {
      if (dispositionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDispositionsIsMutable();
        dispositions_.set(index, value);
        onChanged();
      } else {
        dispositionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder setDispositions(
        int index, com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder builderForValue) {
      if (dispositionsBuilder_ == null) {
        ensureDispositionsIsMutable();
        dispositions_.set(index, builderForValue.build());
        onChanged();
      } else {
        dispositionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder addDispositions(com.tcn.cloud.api.api.v0alpha.DispositionPair value) {
      if (dispositionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDispositionsIsMutable();
        dispositions_.add(value);
        onChanged();
      } else {
        dispositionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder addDispositions(
        int index, com.tcn.cloud.api.api.v0alpha.DispositionPair value) {
      if (dispositionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDispositionsIsMutable();
        dispositions_.add(index, value);
        onChanged();
      } else {
        dispositionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder addDispositions(
        com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder builderForValue) {
      if (dispositionsBuilder_ == null) {
        ensureDispositionsIsMutable();
        dispositions_.add(builderForValue.build());
        onChanged();
      } else {
        dispositionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder addDispositions(
        int index, com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder builderForValue) {
      if (dispositionsBuilder_ == null) {
        ensureDispositionsIsMutable();
        dispositions_.add(index, builderForValue.build());
        onChanged();
      } else {
        dispositionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder addAllDispositions(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.DispositionPair> values) {
      if (dispositionsBuilder_ == null) {
        ensureDispositionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dispositions_);
        onChanged();
      } else {
        dispositionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder clearDispositions() {
      if (dispositionsBuilder_ == null) {
        dispositions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dispositionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public Builder removeDispositions(int index) {
      if (dispositionsBuilder_ == null) {
        ensureDispositionsIsMutable();
        dispositions_.remove(index);
        onChanged();
      } else {
        dispositionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder getDispositionsBuilder(
        int index) {
      return getDispositionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder getDispositionsOrBuilder(
        int index) {
      if (dispositionsBuilder_ == null) {
        return dispositions_.get(index);  } else {
        return dispositionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder> 
         getDispositionsOrBuilderList() {
      if (dispositionsBuilder_ != null) {
        return dispositionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dispositions_);
      }
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder addDispositionsBuilder() {
      return getDispositionsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.DispositionPair.getDefaultInstance());
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder addDispositionsBuilder(
        int index) {
      return getDispositionsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.DispositionPair.getDefaultInstance());
    }
    /**
     * <pre>
     * A set of disposition pairs.
     * </pre>
     *
     * <code>repeated .api.v0alpha.DispositionPair dispositions = 1 [json_name = "dispositions"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder> 
         getDispositionsBuilderList() {
      return getDispositionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.DispositionPair, com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder, com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder> 
        getDispositionsFieldBuilder() {
      if (dispositionsBuilder_ == null) {
        dispositionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.DispositionPair, com.tcn.cloud.api.api.v0alpha.DispositionPair.Builder, com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder>(
                dispositions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dispositions_ = null;
      }
      return dispositionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.DispositionSet)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.DispositionSet)
  private static final com.tcn.cloud.api.api.v0alpha.DispositionSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.DispositionSet();
  }

  public static com.tcn.cloud.api.api.v0alpha.DispositionSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DispositionSet>
      PARSER = new com.google.protobuf.AbstractParser<DispositionSet>() {
    @java.lang.Override
    public DispositionSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<DispositionSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DispositionSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.DispositionSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

