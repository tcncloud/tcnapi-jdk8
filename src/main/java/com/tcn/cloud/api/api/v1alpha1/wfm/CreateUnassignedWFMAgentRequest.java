// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the CreateUnassignedWFMAgent RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest}
 */
public final class CreateUnassignedWFMAgentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)
    CreateUnassignedWFMAgentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUnassignedWFMAgentRequest.newBuilder() to construct.
  private CreateUnassignedWFMAgentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUnassignedWFMAgentRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateUnassignedWFMAgentRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateUnassignedWFMAgentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateUnassignedWFMAgentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.Builder.class);
  }

  public static final int WFM_AGENT_SID_TO_COPY_AGENT_GROUP_ASSOCIATIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.Int64Value wfmAgentSidToCopyAgentGroupAssociations_;
  /**
   * <pre>
   * ID of the wfm agent to copy the agent group associations onto the new agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
   * @return Whether the wfmAgentSidToCopyAgentGroupAssociations field is set.
   */
  @java.lang.Override
  public boolean hasWfmAgentSidToCopyAgentGroupAssociations() {
    return wfmAgentSidToCopyAgentGroupAssociations_ != null;
  }
  /**
   * <pre>
   * ID of the wfm agent to copy the agent group associations onto the new agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
   * @return The wfmAgentSidToCopyAgentGroupAssociations.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getWfmAgentSidToCopyAgentGroupAssociations() {
    return wfmAgentSidToCopyAgentGroupAssociations_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : wfmAgentSidToCopyAgentGroupAssociations_;
  }
  /**
   * <pre>
   * ID of the wfm agent to copy the agent group associations onto the new agent.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getWfmAgentSidToCopyAgentGroupAssociationsOrBuilder() {
    return wfmAgentSidToCopyAgentGroupAssociations_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : wfmAgentSidToCopyAgentGroupAssociations_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Optional: name to give the agent, it will always have the following random string postfixed to it:
   * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
   * If left blank, the name will have 'Unassigned Agent' as its prefix.
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
   * Optional: name to give the agent, it will always have the following random string postfixed to it:
   * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
   * If left blank, the name will have 'Unassigned Agent' as its prefix.
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
    if (wfmAgentSidToCopyAgentGroupAssociations_ != null) {
      output.writeMessage(1, getWfmAgentSidToCopyAgentGroupAssociations());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (wfmAgentSidToCopyAgentGroupAssociations_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getWfmAgentSidToCopyAgentGroupAssociations());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest other = (com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest) obj;

    if (hasWfmAgentSidToCopyAgentGroupAssociations() != other.hasWfmAgentSidToCopyAgentGroupAssociations()) return false;
    if (hasWfmAgentSidToCopyAgentGroupAssociations()) {
      if (!getWfmAgentSidToCopyAgentGroupAssociations()
          .equals(other.getWfmAgentSidToCopyAgentGroupAssociations())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
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
    if (hasWfmAgentSidToCopyAgentGroupAssociations()) {
      hash = (37 * hash) + WFM_AGENT_SID_TO_COPY_AGENT_GROUP_ASSOCIATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getWfmAgentSidToCopyAgentGroupAssociations().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest prototype) {
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
   * Request message for the CreateUnassignedWFMAgent RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateUnassignedWFMAgentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateUnassignedWFMAgentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.class, com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.newBuilder()
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
      wfmAgentSidToCopyAgentGroupAssociations_ = null;
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ != null) {
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_.dispose();
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_ = null;
      }
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_CreateUnassignedWFMAgentRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest result = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wfmAgentSidToCopyAgentGroupAssociations_ = wfmAgentSidToCopyAgentGroupAssociationsBuilder_ == null
            ? wfmAgentSidToCopyAgentGroupAssociations_
            : wfmAgentSidToCopyAgentGroupAssociationsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest.getDefaultInstance()) return this;
      if (other.hasWfmAgentSidToCopyAgentGroupAssociations()) {
        mergeWfmAgentSidToCopyAgentGroupAssociations(other.getWfmAgentSidToCopyAgentGroupAssociations());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                  getWfmAgentSidToCopyAgentGroupAssociationsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
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

    private com.google.protobuf.Int64Value wfmAgentSidToCopyAgentGroupAssociations_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> wfmAgentSidToCopyAgentGroupAssociationsBuilder_;
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     * @return Whether the wfmAgentSidToCopyAgentGroupAssociations field is set.
     */
    public boolean hasWfmAgentSidToCopyAgentGroupAssociations() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     * @return The wfmAgentSidToCopyAgentGroupAssociations.
     */
    public com.google.protobuf.Int64Value getWfmAgentSidToCopyAgentGroupAssociations() {
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ == null) {
        return wfmAgentSidToCopyAgentGroupAssociations_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : wfmAgentSidToCopyAgentGroupAssociations_;
      } else {
        return wfmAgentSidToCopyAgentGroupAssociationsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    public Builder setWfmAgentSidToCopyAgentGroupAssociations(com.google.protobuf.Int64Value value) {
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wfmAgentSidToCopyAgentGroupAssociations_ = value;
      } else {
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    public Builder setWfmAgentSidToCopyAgentGroupAssociations(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ == null) {
        wfmAgentSidToCopyAgentGroupAssociations_ = builderForValue.build();
      } else {
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    public Builder mergeWfmAgentSidToCopyAgentGroupAssociations(com.google.protobuf.Int64Value value) {
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          wfmAgentSidToCopyAgentGroupAssociations_ != null &&
          wfmAgentSidToCopyAgentGroupAssociations_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getWfmAgentSidToCopyAgentGroupAssociationsBuilder().mergeFrom(value);
        } else {
          wfmAgentSidToCopyAgentGroupAssociations_ = value;
        }
      } else {
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    public Builder clearWfmAgentSidToCopyAgentGroupAssociations() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wfmAgentSidToCopyAgentGroupAssociations_ = null;
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ != null) {
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_.dispose();
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    public com.google.protobuf.Int64Value.Builder getWfmAgentSidToCopyAgentGroupAssociationsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWfmAgentSidToCopyAgentGroupAssociationsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getWfmAgentSidToCopyAgentGroupAssociationsOrBuilder() {
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ != null) {
        return wfmAgentSidToCopyAgentGroupAssociationsBuilder_.getMessageOrBuilder();
      } else {
        return wfmAgentSidToCopyAgentGroupAssociations_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : wfmAgentSidToCopyAgentGroupAssociations_;
      }
    }
    /**
     * <pre>
     * ID of the wfm agent to copy the agent group associations onto the new agent.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value wfm_agent_sid_to_copy_agent_group_associations = 1 [json_name = "wfmAgentSidToCopyAgentGroupAssociations"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getWfmAgentSidToCopyAgentGroupAssociationsFieldBuilder() {
      if (wfmAgentSidToCopyAgentGroupAssociationsBuilder_ == null) {
        wfmAgentSidToCopyAgentGroupAssociationsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getWfmAgentSidToCopyAgentGroupAssociations(),
                getParentForChildren(),
                isClean());
        wfmAgentSidToCopyAgentGroupAssociations_ = null;
      }
      return wfmAgentSidToCopyAgentGroupAssociationsBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Optional: name to give the agent, it will always have the following random string postfixed to it:
     * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
     * If left blank, the name will have 'Unassigned Agent' as its prefix.
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
     * Optional: name to give the agent, it will always have the following random string postfixed to it:
     * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
     * If left blank, the name will have 'Unassigned Agent' as its prefix.
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
     * Optional: name to give the agent, it will always have the following random string postfixed to it:
     * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
     * If left blank, the name will have 'Unassigned Agent' as its prefix.
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
     * Optional: name to give the agent, it will always have the following random string postfixed to it:
     * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
     * If left blank, the name will have 'Unassigned Agent' as its prefix.
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
     * Optional: name to give the agent, it will always have the following random string postfixed to it:
     * ' - &lt;random_upper_letter&gt;&lt;random_upper_letter&gt;&lt;random_number_from_100_to_999&gt;'.
     * If left blank, the name will have 'Unassigned Agent' as its prefix.
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUnassignedWFMAgentRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUnassignedWFMAgentRequest>() {
    @java.lang.Override
    public CreateUnassignedWFMAgentRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUnassignedWFMAgentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUnassignedWFMAgentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.CreateUnassignedWFMAgentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

