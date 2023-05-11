// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.Charts}
 */
public final class Charts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Charts)
    ChartsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Charts.newBuilder() to construct.
  private Charts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Charts() {
    charts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Charts();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Charts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Charts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Charts.class, com.tcn.cloud.api.api.v0alpha.Charts.Builder.class);
  }

  public static final int CHARTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.Chart> charts_;
  /**
   * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.Chart> getChartsList() {
    return charts_;
  }
  /**
   * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ChartOrBuilder> 
      getChartsOrBuilderList() {
    return charts_;
  }
  /**
   * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public int getChartsCount() {
    return charts_.size();
  }
  /**
   * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Chart getCharts(int index) {
    return charts_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ChartOrBuilder getChartsOrBuilder(
      int index) {
    return charts_.get(index);
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
    for (int i = 0; i < charts_.size(); i++) {
      output.writeMessage(1, charts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < charts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, charts_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Charts)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Charts other = (com.tcn.cloud.api.api.v0alpha.Charts) obj;

    if (!getChartsList()
        .equals(other.getChartsList())) return false;
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
    if (getChartsCount() > 0) {
      hash = (37 * hash) + CHARTS_FIELD_NUMBER;
      hash = (53 * hash) + getChartsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Charts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Charts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Charts parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Charts prototype) {
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
   * Protobuf type {@code api.v0alpha.Charts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Charts)
      com.tcn.cloud.api.api.v0alpha.ChartsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Charts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Charts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Charts.class, com.tcn.cloud.api.api.v0alpha.Charts.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Charts.newBuilder()
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
      if (chartsBuilder_ == null) {
        charts_ = java.util.Collections.emptyList();
      } else {
        charts_ = null;
        chartsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_Charts_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Charts getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Charts.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Charts build() {
      com.tcn.cloud.api.api.v0alpha.Charts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Charts buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Charts result = new com.tcn.cloud.api.api.v0alpha.Charts(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.Charts result) {
      if (chartsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          charts_ = java.util.Collections.unmodifiableList(charts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.charts_ = charts_;
      } else {
        result.charts_ = chartsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Charts result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Charts) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Charts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Charts other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Charts.getDefaultInstance()) return this;
      if (chartsBuilder_ == null) {
        if (!other.charts_.isEmpty()) {
          if (charts_.isEmpty()) {
            charts_ = other.charts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChartsIsMutable();
            charts_.addAll(other.charts_);
          }
          onChanged();
        }
      } else {
        if (!other.charts_.isEmpty()) {
          if (chartsBuilder_.isEmpty()) {
            chartsBuilder_.dispose();
            chartsBuilder_ = null;
            charts_ = other.charts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            chartsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChartsFieldBuilder() : null;
          } else {
            chartsBuilder_.addAllMessages(other.charts_);
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
              com.tcn.cloud.api.api.v0alpha.Chart m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.Chart.parser(),
                      extensionRegistry);
              if (chartsBuilder_ == null) {
                ensureChartsIsMutable();
                charts_.add(m);
              } else {
                chartsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.Chart> charts_ =
      java.util.Collections.emptyList();
    private void ensureChartsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        charts_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.Chart>(charts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Chart, com.tcn.cloud.api.api.v0alpha.Chart.Builder, com.tcn.cloud.api.api.v0alpha.ChartOrBuilder> chartsBuilder_;

    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Chart> getChartsList() {
      if (chartsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(charts_);
      } else {
        return chartsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public int getChartsCount() {
      if (chartsBuilder_ == null) {
        return charts_.size();
      } else {
        return chartsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Chart getCharts(int index) {
      if (chartsBuilder_ == null) {
        return charts_.get(index);
      } else {
        return chartsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder setCharts(
        int index, com.tcn.cloud.api.api.v0alpha.Chart value) {
      if (chartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChartsIsMutable();
        charts_.set(index, value);
        onChanged();
      } else {
        chartsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder setCharts(
        int index, com.tcn.cloud.api.api.v0alpha.Chart.Builder builderForValue) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.set(index, builderForValue.build());
        onChanged();
      } else {
        chartsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(com.tcn.cloud.api.api.v0alpha.Chart value) {
      if (chartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChartsIsMutable();
        charts_.add(value);
        onChanged();
      } else {
        chartsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(
        int index, com.tcn.cloud.api.api.v0alpha.Chart value) {
      if (chartsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChartsIsMutable();
        charts_.add(index, value);
        onChanged();
      } else {
        chartsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(
        com.tcn.cloud.api.api.v0alpha.Chart.Builder builderForValue) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.add(builderForValue.build());
        onChanged();
      } else {
        chartsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addCharts(
        int index, com.tcn.cloud.api.api.v0alpha.Chart.Builder builderForValue) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.add(index, builderForValue.build());
        onChanged();
      } else {
        chartsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder addAllCharts(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.Chart> values) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, charts_);
        onChanged();
      } else {
        chartsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder clearCharts() {
      if (chartsBuilder_ == null) {
        charts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        chartsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public Builder removeCharts(int index) {
      if (chartsBuilder_ == null) {
        ensureChartsIsMutable();
        charts_.remove(index);
        onChanged();
      } else {
        chartsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Chart.Builder getChartsBuilder(
        int index) {
      return getChartsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ChartOrBuilder getChartsOrBuilder(
        int index) {
      if (chartsBuilder_ == null) {
        return charts_.get(index);  } else {
        return chartsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ChartOrBuilder> 
         getChartsOrBuilderList() {
      if (chartsBuilder_ != null) {
        return chartsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(charts_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Chart.Builder addChartsBuilder() {
      return getChartsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.Chart.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Chart.Builder addChartsBuilder(
        int index) {
      return getChartsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.Chart.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.Chart charts = 1 [json_name = "charts"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.Chart.Builder> 
         getChartsBuilderList() {
      return getChartsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Chart, com.tcn.cloud.api.api.v0alpha.Chart.Builder, com.tcn.cloud.api.api.v0alpha.ChartOrBuilder> 
        getChartsFieldBuilder() {
      if (chartsBuilder_ == null) {
        chartsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Chart, com.tcn.cloud.api.api.v0alpha.Chart.Builder, com.tcn.cloud.api.api.v0alpha.ChartOrBuilder>(
                charts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        charts_ = null;
      }
      return chartsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Charts)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Charts)
  private static final com.tcn.cloud.api.api.v0alpha.Charts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Charts();
  }

  public static com.tcn.cloud.api.api.v0alpha.Charts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Charts>
      PARSER = new com.google.protobuf.AbstractParser<Charts>() {
    @java.lang.Override
    public Charts parsePartialFrom(
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

  public static com.google.protobuf.Parser<Charts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Charts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Charts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

