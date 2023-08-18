// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the BuildDOWAndMOYProfiles RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes}
 */
public final class BuildDOWAndMOYProfilesRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes)
    BuildDOWAndMOYProfilesResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildDOWAndMOYProfilesRes.newBuilder() to construct.
  private BuildDOWAndMOYProfilesRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildDOWAndMOYProfilesRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildDOWAndMOYProfilesRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.Builder.class);
  }

  private int bitField0_;
  public static final int PROFILE_DOW_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.ProfileDOW profileDow_;
  /**
   * <pre>
   * Generated ProfileDOW from the request parameters.
   * </pre>
   *
   * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
   * @return Whether the profileDow field is set.
   */
  @java.lang.Override
  public boolean hasProfileDow() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Generated ProfileDOW from the request parameters.
   * </pre>
   *
   * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
   * @return The profileDow.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileDOW getProfileDow() {
    return profileDow_ == null ? com.tcn.cloud.api.api.commons.ProfileDOW.getDefaultInstance() : profileDow_;
  }
  /**
   * <pre>
   * Generated ProfileDOW from the request parameters.
   * </pre>
   *
   * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileDOWOrBuilder getProfileDowOrBuilder() {
    return profileDow_ == null ? com.tcn.cloud.api.api.commons.ProfileDOW.getDefaultInstance() : profileDow_;
  }

  public static final int PROFILE_MOY_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.ProfileMOY profileMoy_;
  /**
   * <pre>
   * Generated ProfileMOY from the request parameters.
   * </pre>
   *
   * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
   * @return Whether the profileMoy field is set.
   */
  @java.lang.Override
  public boolean hasProfileMoy() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Generated ProfileMOY from the request parameters.
   * </pre>
   *
   * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
   * @return The profileMoy.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileMOY getProfileMoy() {
    return profileMoy_ == null ? com.tcn.cloud.api.api.commons.ProfileMOY.getDefaultInstance() : profileMoy_;
  }
  /**
   * <pre>
   * Generated ProfileMOY from the request parameters.
   * </pre>
   *
   * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileMOYOrBuilder getProfileMoyOrBuilder() {
    return profileMoy_ == null ? com.tcn.cloud.api.api.commons.ProfileMOY.getDefaultInstance() : profileMoy_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getProfileDow());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getProfileMoy());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProfileDow());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProfileMoy());
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes) obj;

    if (hasProfileDow() != other.hasProfileDow()) return false;
    if (hasProfileDow()) {
      if (!getProfileDow()
          .equals(other.getProfileDow())) return false;
    }
    if (hasProfileMoy() != other.hasProfileMoy()) return false;
    if (hasProfileMoy()) {
      if (!getProfileMoy()
          .equals(other.getProfileMoy())) return false;
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
    if (hasProfileDow()) {
      hash = (37 * hash) + PROFILE_DOW_FIELD_NUMBER;
      hash = (53 * hash) + getProfileDow().hashCode();
    }
    if (hasProfileMoy()) {
      hash = (37 * hash) + PROFILE_MOY_FIELD_NUMBER;
      hash = (53 * hash) + getProfileMoy().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes prototype) {
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
   * Response message for the BuildDOWAndMOYProfiles RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.newBuilder()
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
        getProfileDowFieldBuilder();
        getProfileMoyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      profileDow_ = null;
      if (profileDowBuilder_ != null) {
        profileDowBuilder_.dispose();
        profileDowBuilder_ = null;
      }
      profileMoy_ = null;
      if (profileMoyBuilder_ != null) {
        profileMoyBuilder_.dispose();
        profileMoyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.profileDow_ = profileDowBuilder_ == null
            ? profileDow_
            : profileDowBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.profileMoy_ = profileMoyBuilder_ == null
            ? profileMoy_
            : profileMoyBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes.getDefaultInstance()) return this;
      if (other.hasProfileDow()) {
        mergeProfileDow(other.getProfileDow());
      }
      if (other.hasProfileMoy()) {
        mergeProfileMoy(other.getProfileMoy());
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
                  getProfileDowFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getProfileMoyFieldBuilder().getBuilder(),
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

    private com.tcn.cloud.api.api.commons.ProfileDOW profileDow_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileDOW, com.tcn.cloud.api.api.commons.ProfileDOW.Builder, com.tcn.cloud.api.api.commons.ProfileDOWOrBuilder> profileDowBuilder_;
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     * @return Whether the profileDow field is set.
     */
    public boolean hasProfileDow() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     * @return The profileDow.
     */
    public com.tcn.cloud.api.api.commons.ProfileDOW getProfileDow() {
      if (profileDowBuilder_ == null) {
        return profileDow_ == null ? com.tcn.cloud.api.api.commons.ProfileDOW.getDefaultInstance() : profileDow_;
      } else {
        return profileDowBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    public Builder setProfileDow(com.tcn.cloud.api.api.commons.ProfileDOW value) {
      if (profileDowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profileDow_ = value;
      } else {
        profileDowBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    public Builder setProfileDow(
        com.tcn.cloud.api.api.commons.ProfileDOW.Builder builderForValue) {
      if (profileDowBuilder_ == null) {
        profileDow_ = builderForValue.build();
      } else {
        profileDowBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    public Builder mergeProfileDow(com.tcn.cloud.api.api.commons.ProfileDOW value) {
      if (profileDowBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          profileDow_ != null &&
          profileDow_ != com.tcn.cloud.api.api.commons.ProfileDOW.getDefaultInstance()) {
          getProfileDowBuilder().mergeFrom(value);
        } else {
          profileDow_ = value;
        }
      } else {
        profileDowBuilder_.mergeFrom(value);
      }
      if (profileDow_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    public Builder clearProfileDow() {
      bitField0_ = (bitField0_ & ~0x00000001);
      profileDow_ = null;
      if (profileDowBuilder_ != null) {
        profileDowBuilder_.dispose();
        profileDowBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileDOW.Builder getProfileDowBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProfileDowFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileDOWOrBuilder getProfileDowOrBuilder() {
      if (profileDowBuilder_ != null) {
        return profileDowBuilder_.getMessageOrBuilder();
      } else {
        return profileDow_ == null ?
            com.tcn.cloud.api.api.commons.ProfileDOW.getDefaultInstance() : profileDow_;
      }
    }
    /**
     * <pre>
     * Generated ProfileDOW from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileDOW profile_dow = 1 [json_name = "profileDow"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileDOW, com.tcn.cloud.api.api.commons.ProfileDOW.Builder, com.tcn.cloud.api.api.commons.ProfileDOWOrBuilder> 
        getProfileDowFieldBuilder() {
      if (profileDowBuilder_ == null) {
        profileDowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ProfileDOW, com.tcn.cloud.api.api.commons.ProfileDOW.Builder, com.tcn.cloud.api.api.commons.ProfileDOWOrBuilder>(
                getProfileDow(),
                getParentForChildren(),
                isClean());
        profileDow_ = null;
      }
      return profileDowBuilder_;
    }

    private com.tcn.cloud.api.api.commons.ProfileMOY profileMoy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileMOY, com.tcn.cloud.api.api.commons.ProfileMOY.Builder, com.tcn.cloud.api.api.commons.ProfileMOYOrBuilder> profileMoyBuilder_;
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     * @return Whether the profileMoy field is set.
     */
    public boolean hasProfileMoy() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     * @return The profileMoy.
     */
    public com.tcn.cloud.api.api.commons.ProfileMOY getProfileMoy() {
      if (profileMoyBuilder_ == null) {
        return profileMoy_ == null ? com.tcn.cloud.api.api.commons.ProfileMOY.getDefaultInstance() : profileMoy_;
      } else {
        return profileMoyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    public Builder setProfileMoy(com.tcn.cloud.api.api.commons.ProfileMOY value) {
      if (profileMoyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profileMoy_ = value;
      } else {
        profileMoyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    public Builder setProfileMoy(
        com.tcn.cloud.api.api.commons.ProfileMOY.Builder builderForValue) {
      if (profileMoyBuilder_ == null) {
        profileMoy_ = builderForValue.build();
      } else {
        profileMoyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    public Builder mergeProfileMoy(com.tcn.cloud.api.api.commons.ProfileMOY value) {
      if (profileMoyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          profileMoy_ != null &&
          profileMoy_ != com.tcn.cloud.api.api.commons.ProfileMOY.getDefaultInstance()) {
          getProfileMoyBuilder().mergeFrom(value);
        } else {
          profileMoy_ = value;
        }
      } else {
        profileMoyBuilder_.mergeFrom(value);
      }
      if (profileMoy_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    public Builder clearProfileMoy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      profileMoy_ = null;
      if (profileMoyBuilder_ != null) {
        profileMoyBuilder_.dispose();
        profileMoyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileMOY.Builder getProfileMoyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProfileMoyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileMOYOrBuilder getProfileMoyOrBuilder() {
      if (profileMoyBuilder_ != null) {
        return profileMoyBuilder_.getMessageOrBuilder();
      } else {
        return profileMoy_ == null ?
            com.tcn.cloud.api.api.commons.ProfileMOY.getDefaultInstance() : profileMoy_;
      }
    }
    /**
     * <pre>
     * Generated ProfileMOY from the request parameters.
     * </pre>
     *
     * <code>.api.commons.ProfileMOY profile_moy = 2 [json_name = "profileMoy"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileMOY, com.tcn.cloud.api.api.commons.ProfileMOY.Builder, com.tcn.cloud.api.api.commons.ProfileMOYOrBuilder> 
        getProfileMoyFieldBuilder() {
      if (profileMoyBuilder_ == null) {
        profileMoyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ProfileMOY, com.tcn.cloud.api.api.commons.ProfileMOY.Builder, com.tcn.cloud.api.api.commons.ProfileMOYOrBuilder>(
                getProfileMoy(),
                getParentForChildren(),
                isClean());
        profileMoy_ = null;
      }
      return profileMoyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildDOWAndMOYProfilesRes>
      PARSER = new com.google.protobuf.AbstractParser<BuildDOWAndMOYProfilesRes>() {
    @java.lang.Override
    public BuildDOWAndMOYProfilesRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildDOWAndMOYProfilesRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildDOWAndMOYProfilesRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

