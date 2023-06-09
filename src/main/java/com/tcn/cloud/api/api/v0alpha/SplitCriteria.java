// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.SplitCriteria}
 */
public final class SplitCriteria extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.SplitCriteria)
    SplitCriteriaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SplitCriteria.newBuilder() to construct.
  private SplitCriteria(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SplitCriteria() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SplitCriteria();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SplitCriteria_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SplitCriteria_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.SplitCriteria.class, com.tcn.cloud.api.api.v0alpha.SplitCriteria.Builder.class);
  }

  private int actionCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object action_;
  public enum ActionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UNIQUE(1),
    MAX_SIZE(2),
    EQUAL_PARTS(3),
    ACTION_NOT_SET(0);
    private final int value;
    private ActionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ActionCase valueOf(int value) {
      return forNumber(value);
    }

    public static ActionCase forNumber(int value) {
      switch (value) {
        case 1: return UNIQUE;
        case 2: return MAX_SIZE;
        case 3: return EQUAL_PARTS;
        case 0: return ACTION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ActionCase
  getActionCase() {
    return ActionCase.forNumber(
        actionCase_);
  }

  public static final int UNIQUE_FIELD_NUMBER = 1;
  /**
   * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
   * @return Whether the unique field is set.
   */
  @java.lang.Override
  public boolean hasUnique() {
    return actionCase_ == 1;
  }
  /**
   * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
   * @return The unique.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitByUnique getUnique() {
    if (actionCase_ == 1) {
       return (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_;
    }
    return com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitByUniqueOrBuilder getUniqueOrBuilder() {
    if (actionCase_ == 1) {
       return (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_;
    }
    return com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance();
  }

  public static final int MAX_SIZE_FIELD_NUMBER = 2;
  /**
   * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
   * @return Whether the maxSize field is set.
   */
  @java.lang.Override
  public boolean hasMaxSize() {
    return actionCase_ == 2;
  }
  /**
   * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
   * @return The maxSize.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitByMaxSize getMaxSize() {
    if (actionCase_ == 2) {
       return (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_;
    }
    return com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitByMaxSizeOrBuilder getMaxSizeOrBuilder() {
    if (actionCase_ == 2) {
       return (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_;
    }
    return com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance();
  }

  public static final int EQUAL_PARTS_FIELD_NUMBER = 3;
  /**
   * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
   * @return Whether the equalParts field is set.
   */
  @java.lang.Override
  public boolean hasEqualParts() {
    return actionCase_ == 3;
  }
  /**
   * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
   * @return The equalParts.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitByEqualParts getEqualParts() {
    if (actionCase_ == 3) {
       return (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_;
    }
    return com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitByEqualPartsOrBuilder getEqualPartsOrBuilder() {
    if (actionCase_ == 3) {
       return (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_;
    }
    return com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance();
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
    if (actionCase_ == 1) {
      output.writeMessage(1, (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_);
    }
    if (actionCase_ == 2) {
      output.writeMessage(2, (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_);
    }
    if (actionCase_ == 3) {
      output.writeMessage(3, (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (actionCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_);
    }
    if (actionCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_);
    }
    if (actionCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.SplitCriteria)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.SplitCriteria other = (com.tcn.cloud.api.api.v0alpha.SplitCriteria) obj;

    if (!getActionCase().equals(other.getActionCase())) return false;
    switch (actionCase_) {
      case 1:
        if (!getUnique()
            .equals(other.getUnique())) return false;
        break;
      case 2:
        if (!getMaxSize()
            .equals(other.getMaxSize())) return false;
        break;
      case 3:
        if (!getEqualParts()
            .equals(other.getEqualParts())) return false;
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
    switch (actionCase_) {
      case 1:
        hash = (37 * hash) + UNIQUE_FIELD_NUMBER;
        hash = (53 * hash) + getUnique().hashCode();
        break;
      case 2:
        hash = (37 * hash) + MAX_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getMaxSize().hashCode();
        break;
      case 3:
        hash = (37 * hash) + EQUAL_PARTS_FIELD_NUMBER;
        hash = (53 * hash) + getEqualParts().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.SplitCriteria prototype) {
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
   * Protobuf type {@code api.v0alpha.SplitCriteria}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.SplitCriteria)
      com.tcn.cloud.api.api.v0alpha.SplitCriteriaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SplitCriteria_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SplitCriteria_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.SplitCriteria.class, com.tcn.cloud.api.api.v0alpha.SplitCriteria.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.SplitCriteria.newBuilder()
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
      if (uniqueBuilder_ != null) {
        uniqueBuilder_.clear();
      }
      if (maxSizeBuilder_ != null) {
        maxSizeBuilder_.clear();
      }
      if (equalPartsBuilder_ != null) {
        equalPartsBuilder_.clear();
      }
      actionCase_ = 0;
      action_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_SplitCriteria_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitCriteria getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.SplitCriteria.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitCriteria build() {
      com.tcn.cloud.api.api.v0alpha.SplitCriteria result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitCriteria buildPartial() {
      com.tcn.cloud.api.api.v0alpha.SplitCriteria result = new com.tcn.cloud.api.api.v0alpha.SplitCriteria(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.SplitCriteria result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.SplitCriteria result) {
      result.actionCase_ = actionCase_;
      result.action_ = this.action_;
      if (actionCase_ == 1 &&
          uniqueBuilder_ != null) {
        result.action_ = uniqueBuilder_.build();
      }
      if (actionCase_ == 2 &&
          maxSizeBuilder_ != null) {
        result.action_ = maxSizeBuilder_.build();
      }
      if (actionCase_ == 3 &&
          equalPartsBuilder_ != null) {
        result.action_ = equalPartsBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.SplitCriteria) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.SplitCriteria)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.SplitCriteria other) {
      if (other == com.tcn.cloud.api.api.v0alpha.SplitCriteria.getDefaultInstance()) return this;
      switch (other.getActionCase()) {
        case UNIQUE: {
          mergeUnique(other.getUnique());
          break;
        }
        case MAX_SIZE: {
          mergeMaxSize(other.getMaxSize());
          break;
        }
        case EQUAL_PARTS: {
          mergeEqualParts(other.getEqualParts());
          break;
        }
        case ACTION_NOT_SET: {
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
                  getUniqueFieldBuilder().getBuilder(),
                  extensionRegistry);
              actionCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMaxSizeFieldBuilder().getBuilder(),
                  extensionRegistry);
              actionCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getEqualPartsFieldBuilder().getBuilder(),
                  extensionRegistry);
              actionCase_ = 3;
              break;
            } // case 26
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
    private int actionCase_ = 0;
    private java.lang.Object action_;
    public ActionCase
        getActionCase() {
      return ActionCase.forNumber(
          actionCase_);
    }

    public Builder clearAction() {
      actionCase_ = 0;
      action_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SplitByUnique, com.tcn.cloud.api.api.v0alpha.SplitByUnique.Builder, com.tcn.cloud.api.api.v0alpha.SplitByUniqueOrBuilder> uniqueBuilder_;
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     * @return Whether the unique field is set.
     */
    @java.lang.Override
    public boolean hasUnique() {
      return actionCase_ == 1;
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     * @return The unique.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitByUnique getUnique() {
      if (uniqueBuilder_ == null) {
        if (actionCase_ == 1) {
          return (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_;
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance();
      } else {
        if (actionCase_ == 1) {
          return uniqueBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    public Builder setUnique(com.tcn.cloud.api.api.v0alpha.SplitByUnique value) {
      if (uniqueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        uniqueBuilder_.setMessage(value);
      }
      actionCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    public Builder setUnique(
        com.tcn.cloud.api.api.v0alpha.SplitByUnique.Builder builderForValue) {
      if (uniqueBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        uniqueBuilder_.setMessage(builderForValue.build());
      }
      actionCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    public Builder mergeUnique(com.tcn.cloud.api.api.v0alpha.SplitByUnique value) {
      if (uniqueBuilder_ == null) {
        if (actionCase_ == 1 &&
            action_ != com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance()) {
          action_ = com.tcn.cloud.api.api.v0alpha.SplitByUnique.newBuilder((com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_)
              .mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        if (actionCase_ == 1) {
          uniqueBuilder_.mergeFrom(value);
        } else {
          uniqueBuilder_.setMessage(value);
        }
      }
      actionCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    public Builder clearUnique() {
      if (uniqueBuilder_ == null) {
        if (actionCase_ == 1) {
          actionCase_ = 0;
          action_ = null;
          onChanged();
        }
      } else {
        if (actionCase_ == 1) {
          actionCase_ = 0;
          action_ = null;
        }
        uniqueBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SplitByUnique.Builder getUniqueBuilder() {
      return getUniqueFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitByUniqueOrBuilder getUniqueOrBuilder() {
      if ((actionCase_ == 1) && (uniqueBuilder_ != null)) {
        return uniqueBuilder_.getMessageOrBuilder();
      } else {
        if (actionCase_ == 1) {
          return (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_;
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.SplitByUnique unique = 1 [json_name = "unique"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SplitByUnique, com.tcn.cloud.api.api.v0alpha.SplitByUnique.Builder, com.tcn.cloud.api.api.v0alpha.SplitByUniqueOrBuilder> 
        getUniqueFieldBuilder() {
      if (uniqueBuilder_ == null) {
        if (!(actionCase_ == 1)) {
          action_ = com.tcn.cloud.api.api.v0alpha.SplitByUnique.getDefaultInstance();
        }
        uniqueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SplitByUnique, com.tcn.cloud.api.api.v0alpha.SplitByUnique.Builder, com.tcn.cloud.api.api.v0alpha.SplitByUniqueOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.SplitByUnique) action_,
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      actionCase_ = 1;
      onChanged();
      return uniqueBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SplitByMaxSize, com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.Builder, com.tcn.cloud.api.api.v0alpha.SplitByMaxSizeOrBuilder> maxSizeBuilder_;
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     * @return Whether the maxSize field is set.
     */
    @java.lang.Override
    public boolean hasMaxSize() {
      return actionCase_ == 2;
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     * @return The maxSize.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitByMaxSize getMaxSize() {
      if (maxSizeBuilder_ == null) {
        if (actionCase_ == 2) {
          return (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_;
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance();
      } else {
        if (actionCase_ == 2) {
          return maxSizeBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    public Builder setMaxSize(com.tcn.cloud.api.api.v0alpha.SplitByMaxSize value) {
      if (maxSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        maxSizeBuilder_.setMessage(value);
      }
      actionCase_ = 2;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    public Builder setMaxSize(
        com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.Builder builderForValue) {
      if (maxSizeBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        maxSizeBuilder_.setMessage(builderForValue.build());
      }
      actionCase_ = 2;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    public Builder mergeMaxSize(com.tcn.cloud.api.api.v0alpha.SplitByMaxSize value) {
      if (maxSizeBuilder_ == null) {
        if (actionCase_ == 2 &&
            action_ != com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance()) {
          action_ = com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.newBuilder((com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_)
              .mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        if (actionCase_ == 2) {
          maxSizeBuilder_.mergeFrom(value);
        } else {
          maxSizeBuilder_.setMessage(value);
        }
      }
      actionCase_ = 2;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    public Builder clearMaxSize() {
      if (maxSizeBuilder_ == null) {
        if (actionCase_ == 2) {
          actionCase_ = 0;
          action_ = null;
          onChanged();
        }
      } else {
        if (actionCase_ == 2) {
          actionCase_ = 0;
          action_ = null;
        }
        maxSizeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.Builder getMaxSizeBuilder() {
      return getMaxSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitByMaxSizeOrBuilder getMaxSizeOrBuilder() {
      if ((actionCase_ == 2) && (maxSizeBuilder_ != null)) {
        return maxSizeBuilder_.getMessageOrBuilder();
      } else {
        if (actionCase_ == 2) {
          return (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_;
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.SplitByMaxSize max_size = 2 [json_name = "maxSize"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SplitByMaxSize, com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.Builder, com.tcn.cloud.api.api.v0alpha.SplitByMaxSizeOrBuilder> 
        getMaxSizeFieldBuilder() {
      if (maxSizeBuilder_ == null) {
        if (!(actionCase_ == 2)) {
          action_ = com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.getDefaultInstance();
        }
        maxSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SplitByMaxSize, com.tcn.cloud.api.api.v0alpha.SplitByMaxSize.Builder, com.tcn.cloud.api.api.v0alpha.SplitByMaxSizeOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.SplitByMaxSize) action_,
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      actionCase_ = 2;
      onChanged();
      return maxSizeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SplitByEqualParts, com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.Builder, com.tcn.cloud.api.api.v0alpha.SplitByEqualPartsOrBuilder> equalPartsBuilder_;
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     * @return Whether the equalParts field is set.
     */
    @java.lang.Override
    public boolean hasEqualParts() {
      return actionCase_ == 3;
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     * @return The equalParts.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitByEqualParts getEqualParts() {
      if (equalPartsBuilder_ == null) {
        if (actionCase_ == 3) {
          return (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_;
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance();
      } else {
        if (actionCase_ == 3) {
          return equalPartsBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    public Builder setEqualParts(com.tcn.cloud.api.api.v0alpha.SplitByEqualParts value) {
      if (equalPartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        equalPartsBuilder_.setMessage(value);
      }
      actionCase_ = 3;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    public Builder setEqualParts(
        com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.Builder builderForValue) {
      if (equalPartsBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        equalPartsBuilder_.setMessage(builderForValue.build());
      }
      actionCase_ = 3;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    public Builder mergeEqualParts(com.tcn.cloud.api.api.v0alpha.SplitByEqualParts value) {
      if (equalPartsBuilder_ == null) {
        if (actionCase_ == 3 &&
            action_ != com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance()) {
          action_ = com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.newBuilder((com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_)
              .mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        if (actionCase_ == 3) {
          equalPartsBuilder_.mergeFrom(value);
        } else {
          equalPartsBuilder_.setMessage(value);
        }
      }
      actionCase_ = 3;
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    public Builder clearEqualParts() {
      if (equalPartsBuilder_ == null) {
        if (actionCase_ == 3) {
          actionCase_ = 0;
          action_ = null;
          onChanged();
        }
      } else {
        if (actionCase_ == 3) {
          actionCase_ = 0;
          action_ = null;
        }
        equalPartsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.Builder getEqualPartsBuilder() {
      return getEqualPartsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.SplitByEqualPartsOrBuilder getEqualPartsOrBuilder() {
      if ((actionCase_ == 3) && (equalPartsBuilder_ != null)) {
        return equalPartsBuilder_.getMessageOrBuilder();
      } else {
        if (actionCase_ == 3) {
          return (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_;
        }
        return com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.SplitByEqualParts equal_parts = 3 [json_name = "equalParts"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.SplitByEqualParts, com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.Builder, com.tcn.cloud.api.api.v0alpha.SplitByEqualPartsOrBuilder> 
        getEqualPartsFieldBuilder() {
      if (equalPartsBuilder_ == null) {
        if (!(actionCase_ == 3)) {
          action_ = com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.getDefaultInstance();
        }
        equalPartsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.SplitByEqualParts, com.tcn.cloud.api.api.v0alpha.SplitByEqualParts.Builder, com.tcn.cloud.api.api.v0alpha.SplitByEqualPartsOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.SplitByEqualParts) action_,
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      actionCase_ = 3;
      onChanged();
      return equalPartsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.SplitCriteria)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.SplitCriteria)
  private static final com.tcn.cloud.api.api.v0alpha.SplitCriteria DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.SplitCriteria();
  }

  public static com.tcn.cloud.api.api.v0alpha.SplitCriteria getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SplitCriteria>
      PARSER = new com.google.protobuf.AbstractParser<SplitCriteria>() {
    @java.lang.Override
    public SplitCriteria parsePartialFrom(
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

  public static com.google.protobuf.Parser<SplitCriteria> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SplitCriteria> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.SplitCriteria getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

