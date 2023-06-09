// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Request message for the BuildDOWAndMOYProfiles RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq}
 */
public final class BuildDOWAndMOYProfilesReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq)
    BuildDOWAndMOYProfilesReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildDOWAndMOYProfilesReq.newBuilder() to construct.
  private BuildDOWAndMOYProfilesReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildDOWAndMOYProfilesReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildDOWAndMOYProfilesReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.Builder.class);
  }

  public static final int PROFILE_TOD_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.api.commons.ProfileTOD profileTod_;
  /**
   * <pre>
   * ProfileTOD to use to build the ProfileDOW and ProfileMOY
   * </pre>
   *
   * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
   * @return Whether the profileTod field is set.
   */
  @java.lang.Override
  public boolean hasProfileTod() {
    return profileTod_ != null;
  }
  /**
   * <pre>
   * ProfileTOD to use to build the ProfileDOW and ProfileMOY
   * </pre>
   *
   * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
   * @return The profileTod.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileTOD getProfileTod() {
    return profileTod_ == null ? com.tcn.cloud.api.api.commons.ProfileTOD.getDefaultInstance() : profileTod_;
  }
  /**
   * <pre>
   * ProfileTOD to use to build the ProfileDOW and ProfileMOY
   * </pre>
   *
   * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileTODOrBuilder getProfileTodOrBuilder() {
    return profileTod_ == null ? com.tcn.cloud.api.api.commons.ProfileTOD.getDefaultInstance() : profileTod_;
  }

  public static final int PROFILE_WOMS_FIELD_NUMBER = 2;
  private com.tcn.cloud.api.api.commons.ProfileWOMS profileWoms_;
  /**
   * <pre>
   * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
   * </pre>
   *
   * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
   * @return Whether the profileWoms field is set.
   */
  @java.lang.Override
  public boolean hasProfileWoms() {
    return profileWoms_ != null;
  }
  /**
   * <pre>
   * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
   * </pre>
   *
   * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
   * @return The profileWoms.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileWOMS getProfileWoms() {
    return profileWoms_ == null ? com.tcn.cloud.api.api.commons.ProfileWOMS.getDefaultInstance() : profileWoms_;
  }
  /**
   * <pre>
   * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
   * </pre>
   *
   * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ProfileWOMSOrBuilder getProfileWomsOrBuilder() {
    return profileWoms_ == null ? com.tcn.cloud.api.api.commons.ProfileWOMS.getDefaultInstance() : profileWoms_;
  }

  public static final int IS_AVERAGE_PROFILE_FIELD_NUMBER = 3;
  private boolean isAverageProfile_ = false;
  /**
   * <pre>
   * Indicates if the &#64;profile_tod and &#64;profile_woms belongs to the average fields of a call profile template.
   * </pre>
   *
   * <code>bool is_average_profile = 3 [json_name = "isAverageProfile"];</code>
   * @return The isAverageProfile.
   */
  @java.lang.Override
  public boolean getIsAverageProfile() {
    return isAverageProfile_;
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
    if (profileTod_ != null) {
      output.writeMessage(1, getProfileTod());
    }
    if (profileWoms_ != null) {
      output.writeMessage(2, getProfileWoms());
    }
    if (isAverageProfile_ != false) {
      output.writeBool(3, isAverageProfile_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (profileTod_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProfileTod());
    }
    if (profileWoms_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProfileWoms());
    }
    if (isAverageProfile_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isAverageProfile_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq other = (com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq) obj;

    if (hasProfileTod() != other.hasProfileTod()) return false;
    if (hasProfileTod()) {
      if (!getProfileTod()
          .equals(other.getProfileTod())) return false;
    }
    if (hasProfileWoms() != other.hasProfileWoms()) return false;
    if (hasProfileWoms()) {
      if (!getProfileWoms()
          .equals(other.getProfileWoms())) return false;
    }
    if (getIsAverageProfile()
        != other.getIsAverageProfile()) return false;
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
    if (hasProfileTod()) {
      hash = (37 * hash) + PROFILE_TOD_FIELD_NUMBER;
      hash = (53 * hash) + getProfileTod().hashCode();
    }
    if (hasProfileWoms()) {
      hash = (37 * hash) + PROFILE_WOMS_FIELD_NUMBER;
      hash = (53 * hash) + getProfileWoms().hashCode();
    }
    hash = (37 * hash) + IS_AVERAGE_PROFILE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAverageProfile());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq prototype) {
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
   * Request message for the BuildDOWAndMOYProfiles RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq)
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.class, com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.newBuilder()
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
      profileTod_ = null;
      if (profileTodBuilder_ != null) {
        profileTodBuilder_.dispose();
        profileTodBuilder_ = null;
      }
      profileWoms_ = null;
      if (profileWomsBuilder_ != null) {
        profileWomsBuilder_.dispose();
        profileWomsBuilder_ = null;
      }
      isAverageProfile_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_BuildDOWAndMOYProfilesReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq result = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.profileTod_ = profileTodBuilder_ == null
            ? profileTod_
            : profileTodBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.profileWoms_ = profileWomsBuilder_ == null
            ? profileWoms_
            : profileWomsBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isAverageProfile_ = isAverageProfile_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq.getDefaultInstance()) return this;
      if (other.hasProfileTod()) {
        mergeProfileTod(other.getProfileTod());
      }
      if (other.hasProfileWoms()) {
        mergeProfileWoms(other.getProfileWoms());
      }
      if (other.getIsAverageProfile() != false) {
        setIsAverageProfile(other.getIsAverageProfile());
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
                  getProfileTodFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getProfileWomsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              isAverageProfile_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private com.tcn.cloud.api.api.commons.ProfileTOD profileTod_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileTOD, com.tcn.cloud.api.api.commons.ProfileTOD.Builder, com.tcn.cloud.api.api.commons.ProfileTODOrBuilder> profileTodBuilder_;
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     * @return Whether the profileTod field is set.
     */
    public boolean hasProfileTod() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     * @return The profileTod.
     */
    public com.tcn.cloud.api.api.commons.ProfileTOD getProfileTod() {
      if (profileTodBuilder_ == null) {
        return profileTod_ == null ? com.tcn.cloud.api.api.commons.ProfileTOD.getDefaultInstance() : profileTod_;
      } else {
        return profileTodBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    public Builder setProfileTod(com.tcn.cloud.api.api.commons.ProfileTOD value) {
      if (profileTodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profileTod_ = value;
      } else {
        profileTodBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    public Builder setProfileTod(
        com.tcn.cloud.api.api.commons.ProfileTOD.Builder builderForValue) {
      if (profileTodBuilder_ == null) {
        profileTod_ = builderForValue.build();
      } else {
        profileTodBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    public Builder mergeProfileTod(com.tcn.cloud.api.api.commons.ProfileTOD value) {
      if (profileTodBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          profileTod_ != null &&
          profileTod_ != com.tcn.cloud.api.api.commons.ProfileTOD.getDefaultInstance()) {
          getProfileTodBuilder().mergeFrom(value);
        } else {
          profileTod_ = value;
        }
      } else {
        profileTodBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    public Builder clearProfileTod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      profileTod_ = null;
      if (profileTodBuilder_ != null) {
        profileTodBuilder_.dispose();
        profileTodBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileTOD.Builder getProfileTodBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getProfileTodFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileTODOrBuilder getProfileTodOrBuilder() {
      if (profileTodBuilder_ != null) {
        return profileTodBuilder_.getMessageOrBuilder();
      } else {
        return profileTod_ == null ?
            com.tcn.cloud.api.api.commons.ProfileTOD.getDefaultInstance() : profileTod_;
      }
    }
    /**
     * <pre>
     * ProfileTOD to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileTOD profile_tod = 1 [json_name = "profileTod"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileTOD, com.tcn.cloud.api.api.commons.ProfileTOD.Builder, com.tcn.cloud.api.api.commons.ProfileTODOrBuilder> 
        getProfileTodFieldBuilder() {
      if (profileTodBuilder_ == null) {
        profileTodBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ProfileTOD, com.tcn.cloud.api.api.commons.ProfileTOD.Builder, com.tcn.cloud.api.api.commons.ProfileTODOrBuilder>(
                getProfileTod(),
                getParentForChildren(),
                isClean());
        profileTod_ = null;
      }
      return profileTodBuilder_;
    }

    private com.tcn.cloud.api.api.commons.ProfileWOMS profileWoms_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileWOMS, com.tcn.cloud.api.api.commons.ProfileWOMS.Builder, com.tcn.cloud.api.api.commons.ProfileWOMSOrBuilder> profileWomsBuilder_;
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     * @return Whether the profileWoms field is set.
     */
    public boolean hasProfileWoms() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     * @return The profileWoms.
     */
    public com.tcn.cloud.api.api.commons.ProfileWOMS getProfileWoms() {
      if (profileWomsBuilder_ == null) {
        return profileWoms_ == null ? com.tcn.cloud.api.api.commons.ProfileWOMS.getDefaultInstance() : profileWoms_;
      } else {
        return profileWomsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    public Builder setProfileWoms(com.tcn.cloud.api.api.commons.ProfileWOMS value) {
      if (profileWomsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profileWoms_ = value;
      } else {
        profileWomsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    public Builder setProfileWoms(
        com.tcn.cloud.api.api.commons.ProfileWOMS.Builder builderForValue) {
      if (profileWomsBuilder_ == null) {
        profileWoms_ = builderForValue.build();
      } else {
        profileWomsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    public Builder mergeProfileWoms(com.tcn.cloud.api.api.commons.ProfileWOMS value) {
      if (profileWomsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          profileWoms_ != null &&
          profileWoms_ != com.tcn.cloud.api.api.commons.ProfileWOMS.getDefaultInstance()) {
          getProfileWomsBuilder().mergeFrom(value);
        } else {
          profileWoms_ = value;
        }
      } else {
        profileWomsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    public Builder clearProfileWoms() {
      bitField0_ = (bitField0_ & ~0x00000002);
      profileWoms_ = null;
      if (profileWomsBuilder_ != null) {
        profileWomsBuilder_.dispose();
        profileWomsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileWOMS.Builder getProfileWomsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProfileWomsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    public com.tcn.cloud.api.api.commons.ProfileWOMSOrBuilder getProfileWomsOrBuilder() {
      if (profileWomsBuilder_ != null) {
        return profileWomsBuilder_.getMessageOrBuilder();
      } else {
        return profileWoms_ == null ?
            com.tcn.cloud.api.api.commons.ProfileWOMS.getDefaultInstance() : profileWoms_;
      }
    }
    /**
     * <pre>
     * ProfileWOMS to use to build the ProfileDOW and ProfileMOY
     * </pre>
     *
     * <code>.api.commons.ProfileWOMS profile_woms = 2 [json_name = "profileWoms"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.commons.ProfileWOMS, com.tcn.cloud.api.api.commons.ProfileWOMS.Builder, com.tcn.cloud.api.api.commons.ProfileWOMSOrBuilder> 
        getProfileWomsFieldBuilder() {
      if (profileWomsBuilder_ == null) {
        profileWomsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.commons.ProfileWOMS, com.tcn.cloud.api.api.commons.ProfileWOMS.Builder, com.tcn.cloud.api.api.commons.ProfileWOMSOrBuilder>(
                getProfileWoms(),
                getParentForChildren(),
                isClean());
        profileWoms_ = null;
      }
      return profileWomsBuilder_;
    }

    private boolean isAverageProfile_ ;
    /**
     * <pre>
     * Indicates if the &#64;profile_tod and &#64;profile_woms belongs to the average fields of a call profile template.
     * </pre>
     *
     * <code>bool is_average_profile = 3 [json_name = "isAverageProfile"];</code>
     * @return The isAverageProfile.
     */
    @java.lang.Override
    public boolean getIsAverageProfile() {
      return isAverageProfile_;
    }
    /**
     * <pre>
     * Indicates if the &#64;profile_tod and &#64;profile_woms belongs to the average fields of a call profile template.
     * </pre>
     *
     * <code>bool is_average_profile = 3 [json_name = "isAverageProfile"];</code>
     * @param value The isAverageProfile to set.
     * @return This builder for chaining.
     */
    public Builder setIsAverageProfile(boolean value) {

      isAverageProfile_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates if the &#64;profile_tod and &#64;profile_woms belongs to the average fields of a call profile template.
     * </pre>
     *
     * <code>bool is_average_profile = 3 [json_name = "isAverageProfile"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIsAverageProfile() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isAverageProfile_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildDOWAndMOYProfilesReq>
      PARSER = new com.google.protobuf.AbstractParser<BuildDOWAndMOYProfilesReq>() {
    @java.lang.Override
    public BuildDOWAndMOYProfilesReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildDOWAndMOYProfilesReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildDOWAndMOYProfilesReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.BuildDOWAndMOYProfilesReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

