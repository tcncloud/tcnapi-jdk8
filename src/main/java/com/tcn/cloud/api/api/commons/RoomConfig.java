// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/room303.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * room confirmation settings
 * </pre>
 *
 * Protobuf type {@code api.commons.RoomConfig}
 */
public final class RoomConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.RoomConfig)
    RoomConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomConfig.newBuilder() to construct.
  private RoomConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomConfig() {
    addUser_ = 0;
    removeUser_ = 0;
    promoteToAdmin_ = 0;
    readMessages_ = 0;
    sendMessage_ = 0;
    archiveRoom_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoomConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.Room303Proto.internal_static_api_commons_RoomConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.Room303Proto.internal_static_api_commons_RoomConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.RoomConfig.class, com.tcn.cloud.api.api.commons.RoomConfig.Builder.class);
  }

  public static final int ADD_USER_FIELD_NUMBER = 1;
  private int addUser_ = 0;
  /**
   * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
   * @return The enum numeric value on the wire for addUser.
   */
  @java.lang.Override public int getAddUserValue() {
    return addUser_;
  }
  /**
   * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
   * @return The addUser.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getAddUser() {
    com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(addUser_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
  }

  public static final int REMOVE_USER_FIELD_NUMBER = 2;
  private int removeUser_ = 0;
  /**
   * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
   * @return The enum numeric value on the wire for removeUser.
   */
  @java.lang.Override public int getRemoveUserValue() {
    return removeUser_;
  }
  /**
   * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
   * @return The removeUser.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getRemoveUser() {
    com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(removeUser_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
  }

  public static final int PROMOTE_TO_ADMIN_FIELD_NUMBER = 3;
  private int promoteToAdmin_ = 0;
  /**
   * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
   * @return The enum numeric value on the wire for promoteToAdmin.
   */
  @java.lang.Override public int getPromoteToAdminValue() {
    return promoteToAdmin_;
  }
  /**
   * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
   * @return The promoteToAdmin.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getPromoteToAdmin() {
    com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(promoteToAdmin_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
  }

  public static final int READ_MESSAGES_FIELD_NUMBER = 4;
  private int readMessages_ = 0;
  /**
   * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
   * @return The enum numeric value on the wire for readMessages.
   */
  @java.lang.Override public int getReadMessagesValue() {
    return readMessages_;
  }
  /**
   * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
   * @return The readMessages.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getReadMessages() {
    com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(readMessages_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
  }

  public static final int SEND_MESSAGE_FIELD_NUMBER = 5;
  private int sendMessage_ = 0;
  /**
   * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
   * @return The enum numeric value on the wire for sendMessage.
   */
  @java.lang.Override public int getSendMessageValue() {
    return sendMessage_;
  }
  /**
   * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
   * @return The sendMessage.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getSendMessage() {
    com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(sendMessage_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
  }

  public static final int ARCHIVE_ROOM_FIELD_NUMBER = 6;
  private int archiveRoom_ = 0;
  /**
   * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
   * @return The enum numeric value on the wire for archiveRoom.
   */
  @java.lang.Override public int getArchiveRoomValue() {
    return archiveRoom_;
  }
  /**
   * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
   * @return The archiveRoom.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getArchiveRoom() {
    com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(archiveRoom_);
    return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
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
    if (addUser_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      output.writeEnum(1, addUser_);
    }
    if (removeUser_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      output.writeEnum(2, removeUser_);
    }
    if (promoteToAdmin_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      output.writeEnum(3, promoteToAdmin_);
    }
    if (readMessages_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      output.writeEnum(4, readMessages_);
    }
    if (sendMessage_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      output.writeEnum(5, sendMessage_);
    }
    if (archiveRoom_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      output.writeEnum(6, archiveRoom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (addUser_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, addUser_);
    }
    if (removeUser_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, removeUser_);
    }
    if (promoteToAdmin_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, promoteToAdmin_);
    }
    if (readMessages_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, readMessages_);
    }
    if (sendMessage_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, sendMessage_);
    }
    if (archiveRoom_ != com.tcn.cloud.api.api.commons.ConfigPermissionEnum.LIMITED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, archiveRoom_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.RoomConfig)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.RoomConfig other = (com.tcn.cloud.api.api.commons.RoomConfig) obj;

    if (addUser_ != other.addUser_) return false;
    if (removeUser_ != other.removeUser_) return false;
    if (promoteToAdmin_ != other.promoteToAdmin_) return false;
    if (readMessages_ != other.readMessages_) return false;
    if (sendMessage_ != other.sendMessage_) return false;
    if (archiveRoom_ != other.archiveRoom_) return false;
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
    hash = (37 * hash) + ADD_USER_FIELD_NUMBER;
    hash = (53 * hash) + addUser_;
    hash = (37 * hash) + REMOVE_USER_FIELD_NUMBER;
    hash = (53 * hash) + removeUser_;
    hash = (37 * hash) + PROMOTE_TO_ADMIN_FIELD_NUMBER;
    hash = (53 * hash) + promoteToAdmin_;
    hash = (37 * hash) + READ_MESSAGES_FIELD_NUMBER;
    hash = (53 * hash) + readMessages_;
    hash = (37 * hash) + SEND_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + sendMessage_;
    hash = (37 * hash) + ARCHIVE_ROOM_FIELD_NUMBER;
    hash = (53 * hash) + archiveRoom_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.RoomConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.RoomConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.RoomConfig parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.RoomConfig prototype) {
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
   * room confirmation settings
   * </pre>
   *
   * Protobuf type {@code api.commons.RoomConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.RoomConfig)
      com.tcn.cloud.api.api.commons.RoomConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.Room303Proto.internal_static_api_commons_RoomConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.Room303Proto.internal_static_api_commons_RoomConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.RoomConfig.class, com.tcn.cloud.api.api.commons.RoomConfig.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.RoomConfig.newBuilder()
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
      addUser_ = 0;
      removeUser_ = 0;
      promoteToAdmin_ = 0;
      readMessages_ = 0;
      sendMessage_ = 0;
      archiveRoom_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.Room303Proto.internal_static_api_commons_RoomConfig_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.RoomConfig getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.RoomConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.RoomConfig build() {
      com.tcn.cloud.api.api.commons.RoomConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.RoomConfig buildPartial() {
      com.tcn.cloud.api.api.commons.RoomConfig result = new com.tcn.cloud.api.api.commons.RoomConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.RoomConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.addUser_ = addUser_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.removeUser_ = removeUser_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.promoteToAdmin_ = promoteToAdmin_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.readMessages_ = readMessages_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.sendMessage_ = sendMessage_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.archiveRoom_ = archiveRoom_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.RoomConfig) {
        return mergeFrom((com.tcn.cloud.api.api.commons.RoomConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.RoomConfig other) {
      if (other == com.tcn.cloud.api.api.commons.RoomConfig.getDefaultInstance()) return this;
      if (other.addUser_ != 0) {
        setAddUserValue(other.getAddUserValue());
      }
      if (other.removeUser_ != 0) {
        setRemoveUserValue(other.getRemoveUserValue());
      }
      if (other.promoteToAdmin_ != 0) {
        setPromoteToAdminValue(other.getPromoteToAdminValue());
      }
      if (other.readMessages_ != 0) {
        setReadMessagesValue(other.getReadMessagesValue());
      }
      if (other.sendMessage_ != 0) {
        setSendMessageValue(other.getSendMessageValue());
      }
      if (other.archiveRoom_ != 0) {
        setArchiveRoomValue(other.getArchiveRoomValue());
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
              addUser_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              removeUser_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              promoteToAdmin_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              readMessages_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              sendMessage_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              archiveRoom_ = input.readEnum();
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

    private int addUser_ = 0;
    /**
     * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
     * @return The enum numeric value on the wire for addUser.
     */
    @java.lang.Override public int getAddUserValue() {
      return addUser_;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
     * @param value The enum numeric value on the wire for addUser to set.
     * @return This builder for chaining.
     */
    public Builder setAddUserValue(int value) {
      addUser_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
     * @return The addUser.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getAddUser() {
      com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(addUser_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
     * @param value The addUser to set.
     * @return This builder for chaining.
     */
    public Builder setAddUser(com.tcn.cloud.api.api.commons.ConfigPermissionEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      addUser_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum add_user = 1 [json_name = "addUser"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      addUser_ = 0;
      onChanged();
      return this;
    }

    private int removeUser_ = 0;
    /**
     * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
     * @return The enum numeric value on the wire for removeUser.
     */
    @java.lang.Override public int getRemoveUserValue() {
      return removeUser_;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
     * @param value The enum numeric value on the wire for removeUser to set.
     * @return This builder for chaining.
     */
    public Builder setRemoveUserValue(int value) {
      removeUser_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
     * @return The removeUser.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getRemoveUser() {
      com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(removeUser_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
     * @param value The removeUser to set.
     * @return This builder for chaining.
     */
    public Builder setRemoveUser(com.tcn.cloud.api.api.commons.ConfigPermissionEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      removeUser_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum remove_user = 2 [json_name = "removeUser"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRemoveUser() {
      bitField0_ = (bitField0_ & ~0x00000002);
      removeUser_ = 0;
      onChanged();
      return this;
    }

    private int promoteToAdmin_ = 0;
    /**
     * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
     * @return The enum numeric value on the wire for promoteToAdmin.
     */
    @java.lang.Override public int getPromoteToAdminValue() {
      return promoteToAdmin_;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
     * @param value The enum numeric value on the wire for promoteToAdmin to set.
     * @return This builder for chaining.
     */
    public Builder setPromoteToAdminValue(int value) {
      promoteToAdmin_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
     * @return The promoteToAdmin.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getPromoteToAdmin() {
      com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(promoteToAdmin_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
     * @param value The promoteToAdmin to set.
     * @return This builder for chaining.
     */
    public Builder setPromoteToAdmin(com.tcn.cloud.api.api.commons.ConfigPermissionEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      promoteToAdmin_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum promote_to_admin = 3 [json_name = "promoteToAdmin"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPromoteToAdmin() {
      bitField0_ = (bitField0_ & ~0x00000004);
      promoteToAdmin_ = 0;
      onChanged();
      return this;
    }

    private int readMessages_ = 0;
    /**
     * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
     * @return The enum numeric value on the wire for readMessages.
     */
    @java.lang.Override public int getReadMessagesValue() {
      return readMessages_;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
     * @param value The enum numeric value on the wire for readMessages to set.
     * @return This builder for chaining.
     */
    public Builder setReadMessagesValue(int value) {
      readMessages_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
     * @return The readMessages.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getReadMessages() {
      com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(readMessages_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
     * @param value The readMessages to set.
     * @return This builder for chaining.
     */
    public Builder setReadMessages(com.tcn.cloud.api.api.commons.ConfigPermissionEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      readMessages_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum read_messages = 4 [json_name = "readMessages"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReadMessages() {
      bitField0_ = (bitField0_ & ~0x00000008);
      readMessages_ = 0;
      onChanged();
      return this;
    }

    private int sendMessage_ = 0;
    /**
     * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
     * @return The enum numeric value on the wire for sendMessage.
     */
    @java.lang.Override public int getSendMessageValue() {
      return sendMessage_;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
     * @param value The enum numeric value on the wire for sendMessage to set.
     * @return This builder for chaining.
     */
    public Builder setSendMessageValue(int value) {
      sendMessage_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
     * @return The sendMessage.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getSendMessage() {
      com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(sendMessage_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
     * @param value The sendMessage to set.
     * @return This builder for chaining.
     */
    public Builder setSendMessage(com.tcn.cloud.api.api.commons.ConfigPermissionEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      sendMessage_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum send_message = 5 [json_name = "sendMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSendMessage() {
      bitField0_ = (bitField0_ & ~0x00000010);
      sendMessage_ = 0;
      onChanged();
      return this;
    }

    private int archiveRoom_ = 0;
    /**
     * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
     * @return The enum numeric value on the wire for archiveRoom.
     */
    @java.lang.Override public int getArchiveRoomValue() {
      return archiveRoom_;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
     * @param value The enum numeric value on the wire for archiveRoom to set.
     * @return This builder for chaining.
     */
    public Builder setArchiveRoomValue(int value) {
      archiveRoom_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
     * @return The archiveRoom.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ConfigPermissionEnum getArchiveRoom() {
      com.tcn.cloud.api.api.commons.ConfigPermissionEnum result = com.tcn.cloud.api.api.commons.ConfigPermissionEnum.forNumber(archiveRoom_);
      return result == null ? com.tcn.cloud.api.api.commons.ConfigPermissionEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
     * @param value The archiveRoom to set.
     * @return This builder for chaining.
     */
    public Builder setArchiveRoom(com.tcn.cloud.api.api.commons.ConfigPermissionEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000020;
      archiveRoom_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.api.commons.ConfigPermissionEnum archive_room = 6 [json_name = "archiveRoom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearArchiveRoom() {
      bitField0_ = (bitField0_ & ~0x00000020);
      archiveRoom_ = 0;
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


    // @@protoc_insertion_point(builder_scope:api.commons.RoomConfig)
  }

  // @@protoc_insertion_point(class_scope:api.commons.RoomConfig)
  private static final com.tcn.cloud.api.api.commons.RoomConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.RoomConfig();
  }

  public static com.tcn.cloud.api.api.commons.RoomConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomConfig>
      PARSER = new com.google.protobuf.AbstractParser<RoomConfig>() {
    @java.lang.Override
    public RoomConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<RoomConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.RoomConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

