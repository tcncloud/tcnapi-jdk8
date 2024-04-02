// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/programmeddates/entities.proto

package com.tcn.cloud.api.api.v1alpha1.org.programmeddates;

/**
 * <pre>
 * GetProgrammedDatesResponse is the response message for GetProgrammedDates
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse}
 */
public final class GetProgrammedDatesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse)
    GetProgrammedDatesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetProgrammedDatesResponse.newBuilder() to construct.
  private GetProgrammedDatesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProgrammedDatesResponse() {
    dates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetProgrammedDatesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_GetProgrammedDatesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_GetProgrammedDatesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.Builder.class);
  }

  public static final int DATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.org.ProgrammedDates> dates_;
  /**
   * <pre>
   * The retrieved ProgrammedDates
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.org.ProgrammedDates> getDatesList() {
    return dates_;
  }
  /**
   * <pre>
   * The retrieved ProgrammedDates
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder> 
      getDatesOrBuilderList() {
    return dates_;
  }
  /**
   * <pre>
   * The retrieved ProgrammedDates
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
   */
  @java.lang.Override
  public int getDatesCount() {
    return dates_.size();
  }
  /**
   * <pre>
   * The retrieved ProgrammedDates
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ProgrammedDates getDates(int index) {
    return dates_.get(index);
  }
  /**
   * <pre>
   * The retrieved ProgrammedDates
   * </pre>
   *
   * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder getDatesOrBuilder(
      int index) {
    return dates_.get(index);
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
    for (int i = 0; i < dates_.size(); i++) {
      output.writeMessage(1, dates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, dates_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse other = (com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse) obj;

    if (!getDatesList()
        .equals(other.getDatesList())) return false;
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
    if (getDatesCount() > 0) {
      hash = (37 * hash) + DATES_FIELD_NUMBER;
      hash = (53 * hash) + getDatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse prototype) {
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
   * GetProgrammedDatesResponse is the response message for GetProgrammedDates
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse)
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_GetProgrammedDatesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_GetProgrammedDatesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.class, com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.newBuilder()
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
      if (datesBuilder_ == null) {
        dates_ = java.util.Collections.emptyList();
      } else {
        dates_ = null;
        datesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.EntitiesProto.internal_static_api_v1alpha1_org_programmeddates_GetProgrammedDatesResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse build() {
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse result = new com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse result) {
      if (datesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dates_ = java.util.Collections.unmodifiableList(dates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dates_ = dates_;
      } else {
        result.dates_ = datesBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse result) {
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse.getDefaultInstance()) return this;
      if (datesBuilder_ == null) {
        if (!other.dates_.isEmpty()) {
          if (dates_.isEmpty()) {
            dates_ = other.dates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatesIsMutable();
            dates_.addAll(other.dates_);
          }
          onChanged();
        }
      } else {
        if (!other.dates_.isEmpty()) {
          if (datesBuilder_.isEmpty()) {
            datesBuilder_.dispose();
            datesBuilder_ = null;
            dates_ = other.dates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDatesFieldBuilder() : null;
          } else {
            datesBuilder_.addAllMessages(other.dates_);
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
              com.tcn.cloud.api.api.commons.org.ProgrammedDates m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.org.ProgrammedDates.parser(),
                      extensionRegistry);
              if (datesBuilder_ == null) {
                ensureDatesIsMutable();
                dates_.add(m);
              } else {
                datesBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.commons.org.ProgrammedDates> dates_ =
      java.util.Collections.emptyList();
    private void ensureDatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dates_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.org.ProgrammedDates>(dates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.ProgrammedDates, com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder, com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder> datesBuilder_;

    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.ProgrammedDates> getDatesList() {
      if (datesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dates_);
      } else {
        return datesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public int getDatesCount() {
      if (datesBuilder_ == null) {
        return dates_.size();
      } else {
        return datesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDates getDates(int index) {
      if (datesBuilder_ == null) {
        return dates_.get(index);
      } else {
        return datesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder setDates(
        int index, com.tcn.cloud.api.api.commons.org.ProgrammedDates value) {
      if (datesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatesIsMutable();
        dates_.set(index, value);
        onChanged();
      } else {
        datesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder setDates(
        int index, com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder builderForValue) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.set(index, builderForValue.build());
        onChanged();
      } else {
        datesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder addDates(com.tcn.cloud.api.api.commons.org.ProgrammedDates value) {
      if (datesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatesIsMutable();
        dates_.add(value);
        onChanged();
      } else {
        datesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder addDates(
        int index, com.tcn.cloud.api.api.commons.org.ProgrammedDates value) {
      if (datesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatesIsMutable();
        dates_.add(index, value);
        onChanged();
      } else {
        datesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder addDates(
        com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder builderForValue) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.add(builderForValue.build());
        onChanged();
      } else {
        datesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder addDates(
        int index, com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder builderForValue) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.add(index, builderForValue.build());
        onChanged();
      } else {
        datesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder addAllDates(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.org.ProgrammedDates> values) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dates_);
        onChanged();
      } else {
        datesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder clearDates() {
      if (datesBuilder_ == null) {
        dates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public Builder removeDates(int index) {
      if (datesBuilder_ == null) {
        ensureDatesIsMutable();
        dates_.remove(index);
        onChanged();
      } else {
        datesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder getDatesBuilder(
        int index) {
      return getDatesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder getDatesOrBuilder(
        int index) {
      if (datesBuilder_ == null) {
        return dates_.get(index);  } else {
        return datesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder> 
         getDatesOrBuilderList() {
      if (datesBuilder_ != null) {
        return datesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dates_);
      }
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder addDatesBuilder() {
      return getDatesFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.org.ProgrammedDates.getDefaultInstance());
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder addDatesBuilder(
        int index) {
      return getDatesFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.org.ProgrammedDates.getDefaultInstance());
    }
    /**
     * <pre>
     * The retrieved ProgrammedDates
     * </pre>
     *
     * <code>repeated .api.commons.org.ProgrammedDates dates = 1 [json_name = "dates"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder> 
         getDatesBuilderList() {
      return getDatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.org.ProgrammedDates, com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder, com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder> 
        getDatesFieldBuilder() {
      if (datesBuilder_ == null) {
        datesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.org.ProgrammedDates, com.tcn.cloud.api.api.commons.org.ProgrammedDates.Builder, com.tcn.cloud.api.api.commons.org.ProgrammedDatesOrBuilder>(
                dates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dates_ = null;
      }
      return datesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse)
  private static final com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse();
  }

  public static com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProgrammedDatesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetProgrammedDatesResponse>() {
    @java.lang.Override
    public GetProgrammedDatesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetProgrammedDatesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProgrammedDatesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.org.programmeddates.GetProgrammedDatesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

