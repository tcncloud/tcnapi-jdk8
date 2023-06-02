// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/tickets.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 *TicketProject - Fields for Project setting in ticketing system
 * </pre>
 *
 * Protobuf type {@code api.commons.TicketProject}
 */
public final class TicketProject extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.TicketProject)
    TicketProjectOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TicketProject.newBuilder() to construct.
  private TicketProject(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TicketProject() {
    orgId_ = "";
    projectCode_ = "";
    projectTitle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TicketProject();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_TicketProject_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_TicketProject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.TicketProject.class, com.tcn.cloud.api.api.commons.TicketProject.Builder.class);
  }

  public static final int TICKET_PROJECT_ID_FIELD_NUMBER = 1;
  private long ticketProjectId_ = 0L;
  /**
   * <pre>
   * Seq Id of project entry
   * </pre>
   *
   * <code>int64 ticket_project_id = 1 [json_name = "ticketProjectId", jstype = JS_STRING];</code>
   * @return The ticketProjectId.
   */
  @java.lang.Override
  public long getTicketProjectId() {
    return ticketProjectId_;
  }

  public static final int ORG_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object orgId_ = "";
  /**
   * <pre>
   * Logged in user's Org
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The orgId.
   */
  @java.lang.Override
  public java.lang.String getOrgId() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orgId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Logged in user's Org
   * </pre>
   *
   * <code>string org_id = 2 [json_name = "orgId"];</code>
   * @return The bytes for orgId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOrgIdBytes() {
    java.lang.Object ref = orgId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orgId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_SID_FIELD_NUMBER = 3;
  private long projectSid_ = 0L;
  /**
   * <pre>
   * Seq Id of Project from Omni
   * </pre>
   *
   * <code>int64 project_sid = 3 [json_name = "projectSid", jstype = JS_STRING];</code>
   * @return The projectSid.
   */
  @java.lang.Override
  public long getProjectSid() {
    return projectSid_;
  }

  public static final int PROJECT_CODE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectCode_ = "";
  /**
   * <pre>
   * 3 to 5 letter User entered Project Code
   * </pre>
   *
   * <code>string project_code = 4 [json_name = "projectCode"];</code>
   * @return The projectCode.
   */
  @java.lang.Override
  public java.lang.String getProjectCode() {
    java.lang.Object ref = projectCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 3 to 5 letter User entered Project Code
   * </pre>
   *
   * <code>string project_code = 4 [json_name = "projectCode"];</code>
   * @return The bytes for projectCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectCodeBytes() {
    java.lang.Object ref = projectCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_TITLE_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object projectTitle_ = "";
  /**
   * <pre>
   * Project Title as in omni
   * </pre>
   *
   * <code>string project_title = 5 [json_name = "projectTitle"];</code>
   * @return The projectTitle.
   */
  @java.lang.Override
  public java.lang.String getProjectTitle() {
    java.lang.Object ref = projectTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectTitle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Project Title as in omni
   * </pre>
   *
   * <code>string project_title = 5 [json_name = "projectTitle"];</code>
   * @return The bytes for projectTitle.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectTitleBytes() {
    java.lang.Object ref = projectTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_ACTIVE_FIELD_NUMBER = 6;
  private boolean isActive_ = false;
  /**
   * <pre>
   * Indicates if Project is enabled in ticketing system
   * </pre>
   *
   * <code>bool is_active = 6 [json_name = "isActive"];</code>
   * @return The isActive.
   */
  @java.lang.Override
  public boolean getIsActive() {
    return isActive_;
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
    if (ticketProjectId_ != 0L) {
      output.writeInt64(1, ticketProjectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orgId_);
    }
    if (projectSid_ != 0L) {
      output.writeInt64(3, projectSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectCode_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, projectCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectTitle_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, projectTitle_);
    }
    if (isActive_ != false) {
      output.writeBool(6, isActive_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ticketProjectId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, ticketProjectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(orgId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orgId_);
    }
    if (projectSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, projectSid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectCode_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, projectCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectTitle_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, projectTitle_);
    }
    if (isActive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isActive_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.TicketProject)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.TicketProject other = (com.tcn.cloud.api.api.commons.TicketProject) obj;

    if (getTicketProjectId()
        != other.getTicketProjectId()) return false;
    if (!getOrgId()
        .equals(other.getOrgId())) return false;
    if (getProjectSid()
        != other.getProjectSid()) return false;
    if (!getProjectCode()
        .equals(other.getProjectCode())) return false;
    if (!getProjectTitle()
        .equals(other.getProjectTitle())) return false;
    if (getIsActive()
        != other.getIsActive()) return false;
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
    hash = (37 * hash) + TICKET_PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTicketProjectId());
    hash = (37 * hash) + ORG_ID_FIELD_NUMBER;
    hash = (53 * hash) + getOrgId().hashCode();
    hash = (37 * hash) + PROJECT_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getProjectSid());
    hash = (37 * hash) + PROJECT_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getProjectCode().hashCode();
    hash = (37 * hash) + PROJECT_TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getProjectTitle().hashCode();
    hash = (37 * hash) + IS_ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsActive());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.TicketProject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.TicketProject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.TicketProject parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.TicketProject prototype) {
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
   *TicketProject - Fields for Project setting in ticketing system
   * </pre>
   *
   * Protobuf type {@code api.commons.TicketProject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.TicketProject)
      com.tcn.cloud.api.api.commons.TicketProjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_TicketProject_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_TicketProject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.TicketProject.class, com.tcn.cloud.api.api.commons.TicketProject.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.TicketProject.newBuilder()
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
      ticketProjectId_ = 0L;
      orgId_ = "";
      projectSid_ = 0L;
      projectCode_ = "";
      projectTitle_ = "";
      isActive_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.TicketsProto.internal_static_api_commons_TicketProject_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TicketProject getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.TicketProject.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TicketProject build() {
      com.tcn.cloud.api.api.commons.TicketProject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.TicketProject buildPartial() {
      com.tcn.cloud.api.api.commons.TicketProject result = new com.tcn.cloud.api.api.commons.TicketProject(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.TicketProject result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ticketProjectId_ = ticketProjectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.orgId_ = orgId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.projectSid_ = projectSid_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.projectCode_ = projectCode_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.projectTitle_ = projectTitle_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.isActive_ = isActive_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.TicketProject) {
        return mergeFrom((com.tcn.cloud.api.api.commons.TicketProject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.TicketProject other) {
      if (other == com.tcn.cloud.api.api.commons.TicketProject.getDefaultInstance()) return this;
      if (other.getTicketProjectId() != 0L) {
        setTicketProjectId(other.getTicketProjectId());
      }
      if (!other.getOrgId().isEmpty()) {
        orgId_ = other.orgId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getProjectSid() != 0L) {
        setProjectSid(other.getProjectSid());
      }
      if (!other.getProjectCode().isEmpty()) {
        projectCode_ = other.projectCode_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getProjectTitle().isEmpty()) {
        projectTitle_ = other.projectTitle_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getIsActive() != false) {
        setIsActive(other.getIsActive());
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
              ticketProjectId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              orgId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              projectSid_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              projectCode_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              projectTitle_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              isActive_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private long ticketProjectId_ ;
    /**
     * <pre>
     * Seq Id of project entry
     * </pre>
     *
     * <code>int64 ticket_project_id = 1 [json_name = "ticketProjectId", jstype = JS_STRING];</code>
     * @return The ticketProjectId.
     */
    @java.lang.Override
    public long getTicketProjectId() {
      return ticketProjectId_;
    }
    /**
     * <pre>
     * Seq Id of project entry
     * </pre>
     *
     * <code>int64 ticket_project_id = 1 [json_name = "ticketProjectId", jstype = JS_STRING];</code>
     * @param value The ticketProjectId to set.
     * @return This builder for chaining.
     */
    public Builder setTicketProjectId(long value) {

      ticketProjectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Seq Id of project entry
     * </pre>
     *
     * <code>int64 ticket_project_id = 1 [json_name = "ticketProjectId", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearTicketProjectId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ticketProjectId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object orgId_ = "";
    /**
     * <pre>
     * Logged in user's Org
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return The orgId.
     */
    public java.lang.String getOrgId() {
      java.lang.Object ref = orgId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orgId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Logged in user's Org
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return The bytes for orgId.
     */
    public com.google.protobuf.ByteString
        getOrgIdBytes() {
      java.lang.Object ref = orgId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orgId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Logged in user's Org
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      orgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Logged in user's Org
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOrgId() {
      orgId_ = getDefaultInstance().getOrgId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Logged in user's Org
     * </pre>
     *
     * <code>string org_id = 2 [json_name = "orgId"];</code>
     * @param value The bytes for orgId to set.
     * @return This builder for chaining.
     */
    public Builder setOrgIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      orgId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long projectSid_ ;
    /**
     * <pre>
     * Seq Id of Project from Omni
     * </pre>
     *
     * <code>int64 project_sid = 3 [json_name = "projectSid", jstype = JS_STRING];</code>
     * @return The projectSid.
     */
    @java.lang.Override
    public long getProjectSid() {
      return projectSid_;
    }
    /**
     * <pre>
     * Seq Id of Project from Omni
     * </pre>
     *
     * <code>int64 project_sid = 3 [json_name = "projectSid", jstype = JS_STRING];</code>
     * @param value The projectSid to set.
     * @return This builder for chaining.
     */
    public Builder setProjectSid(long value) {

      projectSid_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Seq Id of Project from Omni
     * </pre>
     *
     * <code>int64 project_sid = 3 [json_name = "projectSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectSid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      projectSid_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object projectCode_ = "";
    /**
     * <pre>
     * 3 to 5 letter User entered Project Code
     * </pre>
     *
     * <code>string project_code = 4 [json_name = "projectCode"];</code>
     * @return The projectCode.
     */
    public java.lang.String getProjectCode() {
      java.lang.Object ref = projectCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 3 to 5 letter User entered Project Code
     * </pre>
     *
     * <code>string project_code = 4 [json_name = "projectCode"];</code>
     * @return The bytes for projectCode.
     */
    public com.google.protobuf.ByteString
        getProjectCodeBytes() {
      java.lang.Object ref = projectCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 3 to 5 letter User entered Project Code
     * </pre>
     *
     * <code>string project_code = 4 [json_name = "projectCode"];</code>
     * @param value The projectCode to set.
     * @return This builder for chaining.
     */
    public Builder setProjectCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 3 to 5 letter User entered Project Code
     * </pre>
     *
     * <code>string project_code = 4 [json_name = "projectCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectCode() {
      projectCode_ = getDefaultInstance().getProjectCode();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 3 to 5 letter User entered Project Code
     * </pre>
     *
     * <code>string project_code = 4 [json_name = "projectCode"];</code>
     * @param value The bytes for projectCode to set.
     * @return This builder for chaining.
     */
    public Builder setProjectCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectCode_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object projectTitle_ = "";
    /**
     * <pre>
     * Project Title as in omni
     * </pre>
     *
     * <code>string project_title = 5 [json_name = "projectTitle"];</code>
     * @return The projectTitle.
     */
    public java.lang.String getProjectTitle() {
      java.lang.Object ref = projectTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Project Title as in omni
     * </pre>
     *
     * <code>string project_title = 5 [json_name = "projectTitle"];</code>
     * @return The bytes for projectTitle.
     */
    public com.google.protobuf.ByteString
        getProjectTitleBytes() {
      java.lang.Object ref = projectTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Project Title as in omni
     * </pre>
     *
     * <code>string project_title = 5 [json_name = "projectTitle"];</code>
     * @param value The projectTitle to set.
     * @return This builder for chaining.
     */
    public Builder setProjectTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      projectTitle_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project Title as in omni
     * </pre>
     *
     * <code>string project_title = 5 [json_name = "projectTitle"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectTitle() {
      projectTitle_ = getDefaultInstance().getProjectTitle();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Project Title as in omni
     * </pre>
     *
     * <code>string project_title = 5 [json_name = "projectTitle"];</code>
     * @param value The bytes for projectTitle to set.
     * @return This builder for chaining.
     */
    public Builder setProjectTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      projectTitle_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private boolean isActive_ ;
    /**
     * <pre>
     * Indicates if Project is enabled in ticketing system
     * </pre>
     *
     * <code>bool is_active = 6 [json_name = "isActive"];</code>
     * @return The isActive.
     */
    @java.lang.Override
    public boolean getIsActive() {
      return isActive_;
    }
    /**
     * <pre>
     * Indicates if Project is enabled in ticketing system
     * </pre>
     *
     * <code>bool is_active = 6 [json_name = "isActive"];</code>
     * @param value The isActive to set.
     * @return This builder for chaining.
     */
    public Builder setIsActive(boolean value) {

      isActive_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if Project is enabled in ticketing system
     * </pre>
     *
     * <code>bool is_active = 6 [json_name = "isActive"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsActive() {
      bitField0_ = (bitField0_ & ~0x00000020);
      isActive_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.commons.TicketProject)
  }

  // @@protoc_insertion_point(class_scope:api.commons.TicketProject)
  private static final com.tcn.cloud.api.api.commons.TicketProject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.TicketProject();
  }

  public static com.tcn.cloud.api.api.commons.TicketProject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TicketProject>
      PARSER = new com.google.protobuf.AbstractParser<TicketProject>() {
    @java.lang.Override
    public TicketProject parsePartialFrom(
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

  public static com.google.protobuf.Parser<TicketProject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TicketProject> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.TicketProject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

