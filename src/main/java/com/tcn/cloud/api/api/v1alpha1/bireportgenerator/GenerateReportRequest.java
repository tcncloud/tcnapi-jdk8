// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/bireportgenerator/service.proto

package com.tcn.cloud.api.api.v1alpha1.bireportgenerator;

/**
 * <pre>
 * GenerateReportRequest is the request for generating a report.
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.bireportgenerator.GenerateReportRequest}
 */
public final class GenerateReportRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.bireportgenerator.GenerateReportRequest)
    GenerateReportRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateReportRequest.newBuilder() to construct.
  private GenerateReportRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateReportRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateReportRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ServiceProto.internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ServiceProto.internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.class, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.Builder.class);
  }

  public static final int REPORT_JOB_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob reportJob_;
  /**
   * <pre>
   * The report job to generate the report for.
   * </pre>
   *
   * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
   * @return Whether the reportJob field is set.
   */
  @java.lang.Override
  public boolean hasReportJob() {
    return reportJob_ != null;
  }
  /**
   * <pre>
   * The report job to generate the report for.
   * </pre>
   *
   * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
   * @return The reportJob.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob getReportJob() {
    return reportJob_ == null ? com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.getDefaultInstance() : reportJob_;
  }
  /**
   * <pre>
   * The report job to generate the report for.
   * </pre>
   *
   * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJobOrBuilder getReportJobOrBuilder() {
    return reportJob_ == null ? com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.getDefaultInstance() : reportJob_;
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
    if (reportJob_ != null) {
      output.writeMessage(1, getReportJob());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reportJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReportJob());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest other = (com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest) obj;

    if (hasReportJob() != other.hasReportJob()) return false;
    if (hasReportJob()) {
      if (!getReportJob()
          .equals(other.getReportJob())) return false;
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
    if (hasReportJob()) {
      hash = (37 * hash) + REPORT_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getReportJob().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest prototype) {
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
   * GenerateReportRequest is the request for generating a report.
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.bireportgenerator.GenerateReportRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.bireportgenerator.GenerateReportRequest)
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ServiceProto.internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ServiceProto.internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.class, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.newBuilder()
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
      reportJob_ = null;
      if (reportJobBuilder_ != null) {
        reportJobBuilder_.dispose();
        reportJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ServiceProto.internal_static_api_v1alpha1_bireportgenerator_GenerateReportRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest build() {
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest result = new com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reportJob_ = reportJobBuilder_ == null
            ? reportJob_
            : reportJobBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest.getDefaultInstance()) return this;
      if (other.hasReportJob()) {
        mergeReportJob(other.getReportJob());
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
                  getReportJobFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob reportJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.Builder, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJobOrBuilder> reportJobBuilder_;
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     * @return Whether the reportJob field is set.
     */
    public boolean hasReportJob() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     * @return The reportJob.
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob getReportJob() {
      if (reportJobBuilder_ == null) {
        return reportJob_ == null ? com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.getDefaultInstance() : reportJob_;
      } else {
        return reportJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    public Builder setReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob value) {
      if (reportJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reportJob_ = value;
      } else {
        reportJobBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    public Builder setReportJob(
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.Builder builderForValue) {
      if (reportJobBuilder_ == null) {
        reportJob_ = builderForValue.build();
      } else {
        reportJobBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    public Builder mergeReportJob(com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob value) {
      if (reportJobBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          reportJob_ != null &&
          reportJob_ != com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.getDefaultInstance()) {
          getReportJobBuilder().mergeFrom(value);
        } else {
          reportJob_ = value;
        }
      } else {
        reportJobBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    public Builder clearReportJob() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reportJob_ = null;
      if (reportJobBuilder_ != null) {
        reportJobBuilder_.dispose();
        reportJobBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.Builder getReportJobBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReportJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJobOrBuilder getReportJobOrBuilder() {
      if (reportJobBuilder_ != null) {
        return reportJobBuilder_.getMessageOrBuilder();
      } else {
        return reportJob_ == null ?
            com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.getDefaultInstance() : reportJob_;
      }
    }
    /**
     * <pre>
     * The report job to generate the report for.
     * </pre>
     *
     * <code>.api.v1alpha1.bireportgenerator.ReportJob report_job = 1 [json_name = "reportJob"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.Builder, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJobOrBuilder> 
        getReportJobFieldBuilder() {
      if (reportJobBuilder_ == null) {
        reportJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJob.Builder, com.tcn.cloud.api.api.v1alpha1.bireportgenerator.ReportJobOrBuilder>(
                getReportJob(),
                getParentForChildren(),
                isClean());
        reportJob_ = null;
      }
      return reportJobBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.bireportgenerator.GenerateReportRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.bireportgenerator.GenerateReportRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateReportRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateReportRequest>() {
    @java.lang.Override
    public GenerateReportRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateReportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateReportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.bireportgenerator.GenerateReportRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

