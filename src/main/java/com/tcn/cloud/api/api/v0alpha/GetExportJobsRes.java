// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/ana.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.GetExportJobsRes}
 */
public final class GetExportJobsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.GetExportJobsRes)
    GetExportJobsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetExportJobsRes.newBuilder() to construct.
  private GetExportJobsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetExportJobsRes() {
    exportJobs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetExportJobsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetExportJobsRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetExportJobsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.class, com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.Builder.class);
  }

  public static final int EXPORT_JOBS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.ExportJob> exportJobs_;
  /**
   * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.ExportJob> getExportJobsList() {
    return exportJobs_;
  }
  /**
   * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder> 
      getExportJobsOrBuilderList() {
    return exportJobs_;
  }
  /**
   * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
   */
  @java.lang.Override
  public int getExportJobsCount() {
    return exportJobs_.size();
  }
  /**
   * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExportJob getExportJobs(int index) {
    return exportJobs_.get(index);
  }
  /**
   * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder getExportJobsOrBuilder(
      int index) {
    return exportJobs_.get(index);
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
    for (int i = 0; i < exportJobs_.size(); i++) {
      output.writeMessage(1, exportJobs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < exportJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, exportJobs_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.GetExportJobsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.GetExportJobsRes other = (com.tcn.cloud.api.api.v0alpha.GetExportJobsRes) obj;

    if (!getExportJobsList()
        .equals(other.getExportJobsList())) return false;
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
    if (getExportJobsCount() > 0) {
      hash = (37 * hash) + EXPORT_JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getExportJobsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.GetExportJobsRes prototype) {
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
   * Protobuf type {@code api.v0alpha.GetExportJobsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.GetExportJobsRes)
      com.tcn.cloud.api.api.v0alpha.GetExportJobsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetExportJobsRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetExportJobsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.class, com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.newBuilder()
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
      if (exportJobsBuilder_ == null) {
        exportJobs_ = java.util.Collections.emptyList();
      } else {
        exportJobs_ = null;
        exportJobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.AnaProto.internal_static_api_v0alpha_GetExportJobsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetExportJobsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetExportJobsRes build() {
      com.tcn.cloud.api.api.v0alpha.GetExportJobsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.GetExportJobsRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.GetExportJobsRes result = new com.tcn.cloud.api.api.v0alpha.GetExportJobsRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.GetExportJobsRes result) {
      if (exportJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          exportJobs_ = java.util.Collections.unmodifiableList(exportJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.exportJobs_ = exportJobs_;
      } else {
        result.exportJobs_ = exportJobsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.GetExportJobsRes result) {
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.GetExportJobsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.GetExportJobsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.GetExportJobsRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.GetExportJobsRes.getDefaultInstance()) return this;
      if (exportJobsBuilder_ == null) {
        if (!other.exportJobs_.isEmpty()) {
          if (exportJobs_.isEmpty()) {
            exportJobs_ = other.exportJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExportJobsIsMutable();
            exportJobs_.addAll(other.exportJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.exportJobs_.isEmpty()) {
          if (exportJobsBuilder_.isEmpty()) {
            exportJobsBuilder_.dispose();
            exportJobsBuilder_ = null;
            exportJobs_ = other.exportJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            exportJobsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getExportJobsFieldBuilder() : null;
          } else {
            exportJobsBuilder_.addAllMessages(other.exportJobs_);
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
              com.tcn.cloud.api.api.v0alpha.ExportJob m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.ExportJob.parser(),
                      extensionRegistry);
              if (exportJobsBuilder_ == null) {
                ensureExportJobsIsMutable();
                exportJobs_.add(m);
              } else {
                exportJobsBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.ExportJob> exportJobs_ =
      java.util.Collections.emptyList();
    private void ensureExportJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        exportJobs_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.ExportJob>(exportJobs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ExportJob, com.tcn.cloud.api.api.v0alpha.ExportJob.Builder, com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder> exportJobsBuilder_;

    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ExportJob> getExportJobsList() {
      if (exportJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(exportJobs_);
      } else {
        return exportJobsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public int getExportJobsCount() {
      if (exportJobsBuilder_ == null) {
        return exportJobs_.size();
      } else {
        return exportJobsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportJob getExportJobs(int index) {
      if (exportJobsBuilder_ == null) {
        return exportJobs_.get(index);
      } else {
        return exportJobsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder setExportJobs(
        int index, com.tcn.cloud.api.api.v0alpha.ExportJob value) {
      if (exportJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExportJobsIsMutable();
        exportJobs_.set(index, value);
        onChanged();
      } else {
        exportJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder setExportJobs(
        int index, com.tcn.cloud.api.api.v0alpha.ExportJob.Builder builderForValue) {
      if (exportJobsBuilder_ == null) {
        ensureExportJobsIsMutable();
        exportJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        exportJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder addExportJobs(com.tcn.cloud.api.api.v0alpha.ExportJob value) {
      if (exportJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExportJobsIsMutable();
        exportJobs_.add(value);
        onChanged();
      } else {
        exportJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder addExportJobs(
        int index, com.tcn.cloud.api.api.v0alpha.ExportJob value) {
      if (exportJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExportJobsIsMutable();
        exportJobs_.add(index, value);
        onChanged();
      } else {
        exportJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder addExportJobs(
        com.tcn.cloud.api.api.v0alpha.ExportJob.Builder builderForValue) {
      if (exportJobsBuilder_ == null) {
        ensureExportJobsIsMutable();
        exportJobs_.add(builderForValue.build());
        onChanged();
      } else {
        exportJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder addExportJobs(
        int index, com.tcn.cloud.api.api.v0alpha.ExportJob.Builder builderForValue) {
      if (exportJobsBuilder_ == null) {
        ensureExportJobsIsMutable();
        exportJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        exportJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder addAllExportJobs(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.ExportJob> values) {
      if (exportJobsBuilder_ == null) {
        ensureExportJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, exportJobs_);
        onChanged();
      } else {
        exportJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder clearExportJobs() {
      if (exportJobsBuilder_ == null) {
        exportJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        exportJobsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public Builder removeExportJobs(int index) {
      if (exportJobsBuilder_ == null) {
        ensureExportJobsIsMutable();
        exportJobs_.remove(index);
        onChanged();
      } else {
        exportJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportJob.Builder getExportJobsBuilder(
        int index) {
      return getExportJobsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder getExportJobsOrBuilder(
        int index) {
      if (exportJobsBuilder_ == null) {
        return exportJobs_.get(index);  } else {
        return exportJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder> 
         getExportJobsOrBuilderList() {
      if (exportJobsBuilder_ != null) {
        return exportJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(exportJobs_);
      }
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportJob.Builder addExportJobsBuilder() {
      return getExportJobsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.ExportJob.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExportJob.Builder addExportJobsBuilder(
        int index) {
      return getExportJobsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.ExportJob.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v0alpha.ExportJob export_jobs = 1 [json_name = "exportJobs"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.ExportJob.Builder> 
         getExportJobsBuilderList() {
      return getExportJobsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ExportJob, com.tcn.cloud.api.api.v0alpha.ExportJob.Builder, com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder> 
        getExportJobsFieldBuilder() {
      if (exportJobsBuilder_ == null) {
        exportJobsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ExportJob, com.tcn.cloud.api.api.v0alpha.ExportJob.Builder, com.tcn.cloud.api.api.v0alpha.ExportJobOrBuilder>(
                exportJobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        exportJobs_ = null;
      }
      return exportJobsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.GetExportJobsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.GetExportJobsRes)
  private static final com.tcn.cloud.api.api.v0alpha.GetExportJobsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.GetExportJobsRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.GetExportJobsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetExportJobsRes>
      PARSER = new com.google.protobuf.AbstractParser<GetExportJobsRes>() {
    @java.lang.Override
    public GetExportJobsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetExportJobsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetExportJobsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.GetExportJobsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

