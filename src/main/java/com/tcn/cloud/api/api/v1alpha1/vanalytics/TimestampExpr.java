// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/expr.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * Protobuf type {@code api.v1alpha1.vanalytics.TimestampExpr}
 */
public final class TimestampExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.TimestampExpr)
    TimestampExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimestampExpr.newBuilder() to construct.
  private TimestampExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimestampExpr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimestampExpr();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_TimestampExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_TimestampExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.Builder.class);
  }

  private int whereCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object where_;
  public enum WhereCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RANGE(1),
    MOMENT(2),
    WHERE_NOT_SET(0);
    private final int value;
    private WhereCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WhereCase valueOf(int value) {
      return forNumber(value);
    }

    public static WhereCase forNumber(int value) {
      switch (value) {
        case 1: return RANGE;
        case 2: return MOMENT;
        case 0: return WHERE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public WhereCase
  getWhereCase() {
    return WhereCase.forNumber(
        whereCase_);
  }

  public static final int RANGE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Optional. Static time period to match.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
   * @return Whether the range field is set.
   */
  @java.lang.Override
  public boolean hasRange() {
    return whereCase_ == 1;
  }
  /**
   * <pre>
   * Optional. Static time period to match.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
   * @return The range.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange getRange() {
    if (whereCase_ == 1) {
       return (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_;
    }
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance();
  }
  /**
   * <pre>
   * Optional. Static time period to match.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRangeOrBuilder getRangeOrBuilder() {
    if (whereCase_ == 1) {
       return (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_;
    }
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance();
  }

  public static final int MOMENT_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Optional. Dynamic time period to match.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
   * @return Whether the moment field is set.
   */
  @java.lang.Override
  public boolean hasMoment() {
    return whereCase_ == 2;
  }
  /**
   * <pre>
   * Optional. Dynamic time period to match.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
   * @return The moment.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment getMoment() {
    if (whereCase_ == 2) {
       return (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_;
    }
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance();
  }
  /**
   * <pre>
   * Optional. Dynamic time period to match.
   * </pre>
   *
   * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.MomentOrBuilder getMomentOrBuilder() {
    if (whereCase_ == 2) {
       return (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_;
    }
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance();
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
    if (whereCase_ == 1) {
      output.writeMessage(1, (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_);
    }
    if (whereCase_ == 2) {
      output.writeMessage(2, (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (whereCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_);
    }
    if (whereCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr) obj;

    if (!getWhereCase().equals(other.getWhereCase())) return false;
    switch (whereCase_) {
      case 1:
        if (!getRange()
            .equals(other.getRange())) return false;
        break;
      case 2:
        if (!getMoment()
            .equals(other.getMoment())) return false;
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
    switch (whereCase_) {
      case 1:
        hash = (37 * hash) + RANGE_FIELD_NUMBER;
        hash = (53 * hash) + getRange().hashCode();
        break;
      case 2:
        hash = (37 * hash) + MOMENT_FIELD_NUMBER;
        hash = (53 * hash) + getMoment().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr prototype) {
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
   * Protobuf type {@code api.v1alpha1.vanalytics.TimestampExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.TimestampExpr)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_TimestampExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_TimestampExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.newBuilder()
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
      if (rangeBuilder_ != null) {
        rangeBuilder_.clear();
      }
      if (momentBuilder_ != null) {
        momentBuilder_.clear();
      }
      whereCase_ = 0;
      where_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ExprProto.internal_static_api_v1alpha1_vanalytics_TimestampExpr_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr result) {
      result.whereCase_ = whereCase_;
      result.where_ = this.where_;
      if (whereCase_ == 1 &&
          rangeBuilder_ != null) {
        result.where_ = rangeBuilder_.build();
      }
      if (whereCase_ == 2 &&
          momentBuilder_ != null) {
        result.where_ = momentBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr.getDefaultInstance()) return this;
      switch (other.getWhereCase()) {
        case RANGE: {
          mergeRange(other.getRange());
          break;
        }
        case MOMENT: {
          mergeMoment(other.getMoment());
          break;
        }
        case WHERE_NOT_SET: {
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
                  getRangeFieldBuilder().getBuilder(),
                  extensionRegistry);
              whereCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMomentFieldBuilder().getBuilder(),
                  extensionRegistry);
              whereCase_ = 2;
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
    private int whereCase_ = 0;
    private java.lang.Object where_;
    public WhereCase
        getWhereCase() {
      return WhereCase.forNumber(
          whereCase_);
    }

    public Builder clearWhere() {
      whereCase_ = 0;
      where_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRangeOrBuilder> rangeBuilder_;
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     * @return Whether the range field is set.
     */
    @java.lang.Override
    public boolean hasRange() {
      return whereCase_ == 1;
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     * @return The range.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange getRange() {
      if (rangeBuilder_ == null) {
        if (whereCase_ == 1) {
          return (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_;
        }
        return com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance();
      } else {
        if (whereCase_ == 1) {
          return rangeBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    public Builder setRange(com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange value) {
      if (rangeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        where_ = value;
        onChanged();
      } else {
        rangeBuilder_.setMessage(value);
      }
      whereCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    public Builder setRange(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.Builder builderForValue) {
      if (rangeBuilder_ == null) {
        where_ = builderForValue.build();
        onChanged();
      } else {
        rangeBuilder_.setMessage(builderForValue.build());
      }
      whereCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    public Builder mergeRange(com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange value) {
      if (rangeBuilder_ == null) {
        if (whereCase_ == 1 &&
            where_ != com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance()) {
          where_ = com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.newBuilder((com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_)
              .mergeFrom(value).buildPartial();
        } else {
          where_ = value;
        }
        onChanged();
      } else {
        if (whereCase_ == 1) {
          rangeBuilder_.mergeFrom(value);
        } else {
          rangeBuilder_.setMessage(value);
        }
      }
      whereCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    public Builder clearRange() {
      if (rangeBuilder_ == null) {
        if (whereCase_ == 1) {
          whereCase_ = 0;
          where_ = null;
          onChanged();
        }
      } else {
        if (whereCase_ == 1) {
          whereCase_ = 0;
          where_ = null;
        }
        rangeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.Builder getRangeBuilder() {
      return getRangeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRangeOrBuilder getRangeOrBuilder() {
      if ((whereCase_ == 1) && (rangeBuilder_ != null)) {
        return rangeBuilder_.getMessageOrBuilder();
      } else {
        if (whereCase_ == 1) {
          return (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_;
        }
        return com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Optional. Static time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.TimestampRange range = 1 [json_name = "range"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRangeOrBuilder> 
        getRangeFieldBuilder() {
      if (rangeBuilder_ == null) {
        if (!(whereCase_ == 1)) {
          where_ = com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.getDefaultInstance();
        }
        rangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRangeOrBuilder>(
                (com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampRange) where_,
                getParentForChildren(),
                isClean());
        where_ = null;
      }
      whereCase_ = 1;
      onChanged();
      return rangeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment, com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.MomentOrBuilder> momentBuilder_;
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     * @return Whether the moment field is set.
     */
    @java.lang.Override
    public boolean hasMoment() {
      return whereCase_ == 2;
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     * @return The moment.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment getMoment() {
      if (momentBuilder_ == null) {
        if (whereCase_ == 2) {
          return (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_;
        }
        return com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance();
      } else {
        if (whereCase_ == 2) {
          return momentBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    public Builder setMoment(com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment value) {
      if (momentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        where_ = value;
        onChanged();
      } else {
        momentBuilder_.setMessage(value);
      }
      whereCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    public Builder setMoment(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.Builder builderForValue) {
      if (momentBuilder_ == null) {
        where_ = builderForValue.build();
        onChanged();
      } else {
        momentBuilder_.setMessage(builderForValue.build());
      }
      whereCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    public Builder mergeMoment(com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment value) {
      if (momentBuilder_ == null) {
        if (whereCase_ == 2 &&
            where_ != com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance()) {
          where_ = com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.newBuilder((com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_)
              .mergeFrom(value).buildPartial();
        } else {
          where_ = value;
        }
        onChanged();
      } else {
        if (whereCase_ == 2) {
          momentBuilder_.mergeFrom(value);
        } else {
          momentBuilder_.setMessage(value);
        }
      }
      whereCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    public Builder clearMoment() {
      if (momentBuilder_ == null) {
        if (whereCase_ == 2) {
          whereCase_ = 0;
          where_ = null;
          onChanged();
        }
      } else {
        if (whereCase_ == 2) {
          whereCase_ = 0;
          where_ = null;
        }
        momentBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.Builder getMomentBuilder() {
      return getMomentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.MomentOrBuilder getMomentOrBuilder() {
      if ((whereCase_ == 2) && (momentBuilder_ != null)) {
        return momentBuilder_.getMessageOrBuilder();
      } else {
        if (whereCase_ == 2) {
          return (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_;
        }
        return com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Optional. Dynamic time period to match.
     * </pre>
     *
     * <code>.api.v1alpha1.vanalytics.Moment moment = 2 [json_name = "moment"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment, com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.MomentOrBuilder> 
        getMomentFieldBuilder() {
      if (momentBuilder_ == null) {
        if (!(whereCase_ == 2)) {
          where_ = com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.getDefaultInstance();
        }
        momentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment, com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.MomentOrBuilder>(
                (com.tcn.cloud.api.api.v1alpha1.vanalytics.Moment) where_,
                getParentForChildren(),
                isClean());
        where_ = null;
      }
      whereCase_ = 2;
      onChanged();
      return momentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.TimestampExpr)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.TimestampExpr)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimestampExpr>
      PARSER = new com.google.protobuf.AbstractParser<TimestampExpr>() {
    @java.lang.Override
    public TimestampExpr parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimestampExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimestampExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.TimestampExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

