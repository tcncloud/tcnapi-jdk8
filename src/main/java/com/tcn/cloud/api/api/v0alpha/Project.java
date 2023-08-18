// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Project -
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.Project}
 */
public final class Project extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Project)
    ProjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Project.newBuilder() to construct.
  private Project(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Project() {
    name_ = "";
    description_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Project();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_Project_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_Project_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Project.class, com.tcn.cloud.api.api.v0alpha.Project.Builder.class);
  }

  private int bitField0_;
  public static final int PROJECT_SID_FIELD_NUMBER = 1;
  private long projectSid_ = 0L;
  /**
   * <pre>
   * project identifier
   * </pre>
   *
   * <code>int64 project_sid = 1 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  @java.lang.Override
  public long getProjectSid() {
    return projectSid_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * project name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * project name
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <pre>
   * project description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * project description
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_ = 0;
  /**
   * <pre>
   * project status
   * </pre>
   *
   * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * project status
   * </pre>
   *
   * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ProjectStatus getStatus() {
    com.tcn.cloud.api.api.commons.ProjectStatus result = com.tcn.cloud.api.api.commons.ProjectStatus.forNumber(status_);
    return result == null ? com.tcn.cloud.api.api.commons.ProjectStatus.UNRECOGNIZED : result;
  }

  public static final int DATE_CREATED_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp dateCreated_;
  /**
   * <pre>
   * creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  @java.lang.Override
  public boolean hasDateCreated() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDateCreated() {
    return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
  }
  /**
   * <pre>
   * creation date
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder() {
    return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
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
    if (projectSid_ != 0L) {
      output.writeInt64(1, projectSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    if (status_ != com.tcn.cloud.api.api.commons.ProjectStatus.PROJECT_STATUS_UNKNOWN.getNumber()) {
      output.writeEnum(4, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getDateCreated());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (projectSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, projectSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    if (status_ != com.tcn.cloud.api.api.commons.ProjectStatus.PROJECT_STATUS_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDateCreated());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Project)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Project other = (com.tcn.cloud.api.api.v0alpha.Project) obj;

    if (getProjectSid()
        != other.getProjectSid()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (status_ != other.status_) return false;
    if (hasDateCreated() != other.hasDateCreated()) return false;
    if (hasDateCreated()) {
      if (!getDateCreated()
          .equals(other.getDateCreated())) return false;
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
    hash = (37 * hash) + PROJECT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProjectSid());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasDateCreated()) {
      hash = (37 * hash) + DATE_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getDateCreated().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Project parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Project parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Project parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Project prototype) {
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
   * Project -
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.Project}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Project)
      com.tcn.cloud.api.api.v0alpha.ProjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_Project_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_Project_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Project.class, com.tcn.cloud.api.api.v0alpha.Project.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Project.newBuilder()
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
        getDateCreatedFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectSid_ = 0L;
      name_ = "";
      description_ = "";
      status_ = 0;
      dateCreated_ = null;
      if (dateCreatedBuilder_ != null) {
        dateCreatedBuilder_.dispose();
        dateCreatedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_Project_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Project getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Project.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Project build() {
      com.tcn.cloud.api.api.v0alpha.Project result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Project buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Project result = new com.tcn.cloud.api.api.v0alpha.Project(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Project result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectSid_ = projectSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.status_ = status_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.dateCreated_ = dateCreatedBuilder_ == null
            ? dateCreated_
            : dateCreatedBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Project) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Project)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Project other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Project.getDefaultInstance()) return this;
      if (other.getProjectSid() != 0L) {
        setProjectSid(other.getProjectSid());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasDateCreated()) {
        mergeDateCreated(other.getDateCreated());
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
              projectSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getDateCreatedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long projectSid_ ;
    /**
     * <pre>
     * project identifier
     * </pre>
     *
     * <code>int64 project_sid = 1 [json_name = "projectSid", jstype = JS_STRING];</code>
     * @return The projectSid.
     */
    @java.lang.Override
    public long getProjectSid() {
      return projectSid_;
    }
    /**
     * <pre>
     * project identifier
     * </pre>
     *
     * <code>int64 project_sid = 1 [json_name = "projectSid", jstype = JS_STRING];</code>
     * @param value The projectSid to set.
     * @return This builder for chaining.
     */
    public Builder setProjectSid(long value) {

      projectSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project identifier
     * </pre>
     *
     * <code>int64 project_sid = 1 [json_name = "projectSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      projectSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * project name
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * project name
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * project name
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project name
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project name
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * project description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * project description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * project description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project description
     * </pre>
     *
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * project status
     * </pre>
     *
     * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * project status
     * </pre>
     *
     * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project status
     * </pre>
     *
     * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ProjectStatus getStatus() {
      com.tcn.cloud.api.api.commons.ProjectStatus result = com.tcn.cloud.api.api.commons.ProjectStatus.forNumber(status_);
      return result == null ? com.tcn.cloud.api.api.commons.ProjectStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * project status
     * </pre>
     *
     * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.tcn.cloud.api.api.commons.ProjectStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project status
     * </pre>
     *
     * <code>.api.commons.ProjectStatus status = 4 [json_name = "status"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      status_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp dateCreated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateCreatedBuilder_;
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     * @return Whether the dateCreated field is set.
     */
    public boolean hasDateCreated() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     * @return The dateCreated.
     */
    public com.google.protobuf.Timestamp getDateCreated() {
      if (dateCreatedBuilder_ == null) {
        return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
      } else {
        return dateCreatedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    public Builder setDateCreated(com.google.protobuf.Timestamp value) {
      if (dateCreatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateCreated_ = value;
      } else {
        dateCreatedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    public Builder setDateCreated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateCreatedBuilder_ == null) {
        dateCreated_ = builderForValue.build();
      } else {
        dateCreatedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    public Builder mergeDateCreated(com.google.protobuf.Timestamp value) {
      if (dateCreatedBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          dateCreated_ != null &&
          dateCreated_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDateCreatedBuilder().mergeFrom(value);
        } else {
          dateCreated_ = value;
        }
      } else {
        dateCreatedBuilder_.mergeFrom(value);
      }
      if (dateCreated_ != null) {
        bitField0_ |= 0x00000010;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    public Builder clearDateCreated() {
      bitField0_ = (bitField0_ & ~0x00000010);
      dateCreated_ = null;
      if (dateCreatedBuilder_ != null) {
        dateCreatedBuilder_.dispose();
        dateCreatedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateCreatedBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getDateCreatedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder() {
      if (dateCreatedBuilder_ != null) {
        return dateCreatedBuilder_.getMessageOrBuilder();
      } else {
        return dateCreated_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
      }
    }
    /**
     * <pre>
     * creation date
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 5 [json_name = "dateCreated"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDateCreatedFieldBuilder() {
      if (dateCreatedBuilder_ == null) {
        dateCreatedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDateCreated(),
                getParentForChildren(),
                isClean());
        dateCreated_ = null;
      }
      return dateCreatedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Project)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Project)
  private static final com.tcn.cloud.api.api.v0alpha.Project DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Project();
  }

  public static com.tcn.cloud.api.api.v0alpha.Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Project>
      PARSER = new com.google.protobuf.AbstractParser<Project>() {
    @java.lang.Override
    public Project parsePartialFrom(
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

  public static com.google.protobuf.Parser<Project> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Project> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Project getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

