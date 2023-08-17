// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.MultiClientSummary}
 */
public final class MultiClientSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.MultiClientSummary)
    MultiClientSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiClientSummary.newBuilder() to construct.
  private MultiClientSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiClientSummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiClientSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_MultiClientSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_MultiClientSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.MultiClientSummary.class, com.tcn.cloud.api.api.v0alpha.MultiClientSummary.Builder.class);
  }

  private int bitField0_;
  public static final int ADOPTABLE_FIELD_NUMBER = 1;
  private boolean adoptable_ = false;
  /**
   * <code>bool adoptable = 1 [json_name = "adoptable"];</code>
   * @return The adoptable.
   */
  @java.lang.Override
  public boolean getAdoptable() {
    return adoptable_;
  }

  public static final int PARENTS_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.v0alpha.Relations parents_;
  /**
   * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
   * @return Whether the parents field is set.
   */
  @java.lang.Override
  public boolean hasParents() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
   * @return The parents.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Relations getParents() {
    return parents_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
  }
  /**
   * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getParentsOrBuilder() {
    return parents_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
  }

  public static final int CHILDREN_FIELD_NUMBER = 3;
  private com.tcn.cloud.api.api.v0alpha.Relations children_;
  /**
   * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
   * @return Whether the children field is set.
   */
  @java.lang.Override
  public boolean hasChildren() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
   * @return The children.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Relations getChildren() {
    return children_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
  }
  /**
   * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getChildrenOrBuilder() {
    return children_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
  }

  public static final int PRO_STATUS_FIELD_NUMBER = 4;
  private boolean proStatus_ = false;
  /**
   * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
   * @return The proStatus.
   */
  @java.lang.Override
  public boolean getProStatus() {
    return proStatus_;
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
    if (adoptable_ != false) {
      output.writeBool(1, adoptable_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getParents());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getChildren());
    }
    if (proStatus_ != false) {
      output.writeBool(4, proStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adoptable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, adoptable_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParents());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getChildren());
    }
    if (proStatus_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, proStatus_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.MultiClientSummary)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.MultiClientSummary other = (com.tcn.cloud.api.api.v0alpha.MultiClientSummary) obj;

    if (getAdoptable()
        != other.getAdoptable()) return false;
    if (hasParents() != other.hasParents()) return false;
    if (hasParents()) {
      if (!getParents()
          .equals(other.getParents())) return false;
    }
    if (hasChildren() != other.hasChildren()) return false;
    if (hasChildren()) {
      if (!getChildren()
          .equals(other.getChildren())) return false;
    }
    if (getProStatus()
        != other.getProStatus()) return false;
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
    hash = (37 * hash) + ADOPTABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAdoptable());
    if (hasParents()) {
      hash = (37 * hash) + PARENTS_FIELD_NUMBER;
      hash = (53 * hash) + getParents().hashCode();
    }
    if (hasChildren()) {
      hash = (37 * hash) + CHILDREN_FIELD_NUMBER;
      hash = (53 * hash) + getChildren().hashCode();
    }
    hash = (37 * hash) + PRO_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getProStatus());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.MultiClientSummary prototype) {
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
   * Protobuf type {@code api.v0alpha.MultiClientSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.MultiClientSummary)
      com.tcn.cloud.api.api.v0alpha.MultiClientSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_MultiClientSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_MultiClientSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.MultiClientSummary.class, com.tcn.cloud.api.api.v0alpha.MultiClientSummary.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.MultiClientSummary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getParentsFieldBuilder();
        getChildrenFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      adoptable_ = false;
      parents_ = null;
      if (parentsBuilder_ != null) {
        parentsBuilder_.dispose();
        parentsBuilder_ = null;
      }
      children_ = null;
      if (childrenBuilder_ != null) {
        childrenBuilder_.dispose();
        childrenBuilder_ = null;
      }
      proStatus_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_MultiClientSummary_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MultiClientSummary getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.MultiClientSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MultiClientSummary build() {
      com.tcn.cloud.api.api.v0alpha.MultiClientSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.MultiClientSummary buildPartial() {
      com.tcn.cloud.api.api.v0alpha.MultiClientSummary result = new com.tcn.cloud.api.api.v0alpha.MultiClientSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.MultiClientSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adoptable_ = adoptable_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parents_ = parentsBuilder_ == null
            ? parents_
            : parentsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.children_ = childrenBuilder_ == null
            ? children_
            : childrenBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.proStatus_ = proStatus_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.MultiClientSummary) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.MultiClientSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.MultiClientSummary other) {
      if (other == com.tcn.cloud.api.api.v0alpha.MultiClientSummary.getDefaultInstance()) return this;
      if (other.getAdoptable() != false) {
        setAdoptable(other.getAdoptable());
      }
      if (other.hasParents()) {
        mergeParents(other.getParents());
      }
      if (other.hasChildren()) {
        mergeChildren(other.getChildren());
      }
      if (other.getProStatus() != false) {
        setProStatus(other.getProStatus());
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
            case 8: {
              adoptable_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getParentsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getChildrenFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              proStatus_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private boolean adoptable_ ;
    /**
     * <code>bool adoptable = 1 [json_name = "adoptable"];</code>
     * @return The adoptable.
     */
    @java.lang.Override
    public boolean getAdoptable() {
      return adoptable_;
    }
    /**
     * <code>bool adoptable = 1 [json_name = "adoptable"];</code>
     * @param value The adoptable to set.
     * @return This builder for chaining.
     */
    public Builder setAdoptable(boolean value) {

      adoptable_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool adoptable = 1 [json_name = "adoptable"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAdoptable() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adoptable_ = false;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.Relations parents_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> parentsBuilder_;
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     * @return Whether the parents field is set.
     */
    public boolean hasParents() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     * @return The parents.
     */
    public com.tcn.cloud.api.api.v0alpha.Relations getParents() {
      if (parentsBuilder_ == null) {
        return parents_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
      } else {
        return parentsBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    public Builder setParents(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (parentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parents_ = value;
      } else {
        parentsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    public Builder setParents(
        com.tcn.cloud.api.api.v0alpha.Relations.Builder builderForValue) {
      if (parentsBuilder_ == null) {
        parents_ = builderForValue.build();
      } else {
        parentsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    public Builder mergeParents(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (parentsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          parents_ != null &&
          parents_ != com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance()) {
          getParentsBuilder().mergeFrom(value);
        } else {
          parents_ = value;
        }
      } else {
        parentsBuilder_.mergeFrom(value);
      }
      if (parents_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    public Builder clearParents() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parents_ = null;
      if (parentsBuilder_ != null) {
        parentsBuilder_.dispose();
        parentsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Relations.Builder getParentsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParentsFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getParentsOrBuilder() {
      if (parentsBuilder_ != null) {
        return parentsBuilder_.getMessageOrBuilder();
      } else {
        return parents_ == null ?
            com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : parents_;
      }
    }
    /**
     * <code>.api.v0alpha.Relations parents = 2 [json_name = "parents"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> 
        getParentsFieldBuilder() {
      if (parentsBuilder_ == null) {
        parentsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder>(
                getParents(),
                getParentForChildren(),
                isClean());
        parents_ = null;
      }
      return parentsBuilder_;
    }

    private com.tcn.cloud.api.api.v0alpha.Relations children_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> childrenBuilder_;
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     * @return Whether the children field is set.
     */
    public boolean hasChildren() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     * @return The children.
     */
    public com.tcn.cloud.api.api.v0alpha.Relations getChildren() {
      if (childrenBuilder_ == null) {
        return children_ == null ? com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
      } else {
        return childrenBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    public Builder setChildren(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (childrenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        children_ = value;
      } else {
        childrenBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    public Builder setChildren(
        com.tcn.cloud.api.api.v0alpha.Relations.Builder builderForValue) {
      if (childrenBuilder_ == null) {
        children_ = builderForValue.build();
      } else {
        childrenBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    public Builder mergeChildren(com.tcn.cloud.api.api.v0alpha.Relations value) {
      if (childrenBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          children_ != null &&
          children_ != com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance()) {
          getChildrenBuilder().mergeFrom(value);
        } else {
          children_ = value;
        }
      } else {
        childrenBuilder_.mergeFrom(value);
      }
      if (children_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    public Builder clearChildren() {
      bitField0_ = (bitField0_ & ~0x00000004);
      children_ = null;
      if (childrenBuilder_ != null) {
        childrenBuilder_.dispose();
        childrenBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Relations.Builder getChildrenBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getChildrenFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder getChildrenOrBuilder() {
      if (childrenBuilder_ != null) {
        return childrenBuilder_.getMessageOrBuilder();
      } else {
        return children_ == null ?
            com.tcn.cloud.api.api.v0alpha.Relations.getDefaultInstance() : children_;
      }
    }
    /**
     * <code>.api.v0alpha.Relations children = 3 [json_name = "children"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder> 
        getChildrenFieldBuilder() {
      if (childrenBuilder_ == null) {
        childrenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Relations, com.tcn.cloud.api.api.v0alpha.Relations.Builder, com.tcn.cloud.api.api.v0alpha.RelationsOrBuilder>(
                getChildren(),
                getParentForChildren(),
                isClean());
        children_ = null;
      }
      return childrenBuilder_;
    }

    private boolean proStatus_ ;
    /**
     * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
     * @return The proStatus.
     */
    @java.lang.Override
    public boolean getProStatus() {
      return proStatus_;
    }
    /**
     * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
     * @param value The proStatus to set.
     * @return This builder for chaining.
     */
    public Builder setProStatus(boolean value) {

      proStatus_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool pro_status = 4 [json_name = "proStatus"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      proStatus_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.MultiClientSummary)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.MultiClientSummary)
  private static final com.tcn.cloud.api.api.v0alpha.MultiClientSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.MultiClientSummary();
  }

  public static com.tcn.cloud.api.api.v0alpha.MultiClientSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiClientSummary>
      PARSER = new com.google.protobuf.AbstractParser<MultiClientSummary>() {
    @java.lang.Override
    public MultiClientSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiClientSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiClientSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.MultiClientSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

