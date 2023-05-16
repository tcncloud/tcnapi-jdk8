// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/category.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

/**
 * <pre>
 * UpdateCategoryRequest is the request to update a category by id.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.scorecards.UpdateCategoryRequest}
 */
public final class UpdateCategoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.scorecards.UpdateCategoryRequest)
    UpdateCategoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCategoryRequest.newBuilder() to construct.
  private UpdateCategoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCategoryRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCategoryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.internal_static_api_v1alpha1_scorecards_UpdateCategoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.internal_static_api_v1alpha1_scorecards_UpdateCategoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.Builder.class);
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.Category category_;
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
   * @return Whether the category field is set.
   */
  @java.lang.Override
  public boolean hasCategory() {
    return category_ != null;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
   * @return The category.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.Category getCategory() {
    return category_ == null ? com.tcn.cloud.api.api.commons.Category.getDefaultInstance() : category_;
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.CategoryOrBuilder getCategoryOrBuilder() {
    return category_ == null ? com.tcn.cloud.api.api.commons.Category.getDefaultInstance() : category_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required. Valid paths: [title, description].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Required. Valid paths: [title, description].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required. Valid paths: [title, description].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
    if (category_ != null) {
      output.writeMessage(1, getCategory());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (category_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCategory());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest other = (com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest) obj;

    if (hasCategory() != other.hasCategory()) return false;
    if (hasCategory()) {
      if (!getCategory()
          .equals(other.getCategory())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasCategory()) {
      hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getCategory().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest prototype) {
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
   * UpdateCategoryRequest is the request to update a category by id.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.scorecards.UpdateCategoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.scorecards.UpdateCategoryRequest)
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.internal_static_api_v1alpha1_scorecards_UpdateCategoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.internal_static_api_v1alpha1_scorecards_UpdateCategoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.class, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.newBuilder()
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
      category_ = null;
      if (categoryBuilder_ != null) {
        categoryBuilder_.dispose();
        categoryBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.internal_static_api_v1alpha1_scorecards_UpdateCategoryRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest build() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest result = new com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.category_ = categoryBuilder_ == null
            ? category_
            : categoryBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.getDefaultInstance()) return this;
      if (other.hasCategory()) {
        mergeCategory(other.getCategory());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getCategoryFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.tcn.cloud.api.api.commons.Category category_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Category, com.tcn.cloud.api.api.commons.Category.Builder, com.tcn.cloud.api.api.commons.CategoryOrBuilder> categoryBuilder_;
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     * @return Whether the category field is set.
     */
    public boolean hasCategory() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     * @return The category.
     */
    public com.tcn.cloud.api.api.commons.Category getCategory() {
      if (categoryBuilder_ == null) {
        return category_ == null ? com.tcn.cloud.api.api.commons.Category.getDefaultInstance() : category_;
      } else {
        return categoryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    public Builder setCategory(com.tcn.cloud.api.api.commons.Category value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        category_ = value;
      } else {
        categoryBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    public Builder setCategory(
        com.tcn.cloud.api.api.commons.Category.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        category_ = builderForValue.build();
      } else {
        categoryBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    public Builder mergeCategory(com.tcn.cloud.api.api.commons.Category value) {
      if (categoryBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          category_ != null &&
          category_ != com.tcn.cloud.api.api.commons.Category.getDefaultInstance()) {
          getCategoryBuilder().mergeFrom(value);
        } else {
          category_ = value;
        }
      } else {
        categoryBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    public Builder clearCategory() {
      bitField0_ = (bitField0_ & ~0x00000001);
      category_ = null;
      if (categoryBuilder_ != null) {
        categoryBuilder_.dispose();
        categoryBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    public com.tcn.cloud.api.api.commons.Category.Builder getCategoryBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCategoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    public com.tcn.cloud.api.api.commons.CategoryOrBuilder getCategoryOrBuilder() {
      if (categoryBuilder_ != null) {
        return categoryBuilder_.getMessageOrBuilder();
      } else {
        return category_ == null ?
            com.tcn.cloud.api.api.commons.Category.getDefaultInstance() : category_;
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>.api.commons.Category category = 1 [json_name = "category"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.Category, com.tcn.cloud.api.api.commons.Category.Builder, com.tcn.cloud.api.api.commons.CategoryOrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        categoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.Category, com.tcn.cloud.api.api.commons.Category.Builder, com.tcn.cloud.api.api.commons.CategoryOrBuilder>(
                getCategory(),
                getParentForChildren(),
                isClean());
        category_ = null;
      }
      return categoryBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required. Valid paths: [title, description].
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [json_name = "updateMask"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.scorecards.UpdateCategoryRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.scorecards.UpdateCategoryRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCategoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCategoryRequest>() {
    @java.lang.Override
    public UpdateCategoryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCategoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCategoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

