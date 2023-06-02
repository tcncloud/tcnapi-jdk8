// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/omniapi.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * CreateTasksReq - create tasks per a contact list
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.CreateTasksReq}
 */
public final class CreateTasksReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.CreateTasksReq)
    CreateTasksReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateTasksReq.newBuilder() to construct.
  private CreateTasksReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateTasksReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateTasksReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateTasksReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateTasksReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.CreateTasksReq.class, com.tcn.cloud.api.api.v0alpha.CreateTasksReq.Builder.class);
  }

  private int dataSourceCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object dataSource_;
  public enum DataSourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONTACT_LIST_DATA_SOURCE(100),
    DATASOURCE_NOT_SET(0);
    private final int value;
    private DataSourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataSourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataSourceCase forNumber(int value) {
      switch (value) {
        case 100: return CONTACT_LIST_DATA_SOURCE;
        case 0: return DATASOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataSourceCase
  getDataSourceCase() {
    return DataSourceCase.forNumber(
        dataSourceCase_);
  }

  public static final int CAMPAIGN_SID_FIELD_NUMBER = 1;
  private long campaignSid_ = 0L;
  /**
   * <pre>
   * campaign identifier
   * </pre>
   *
   * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
   * @return The campaignSid.
   */
  @java.lang.Override
  public long getCampaignSid() {
    return campaignSid_;
  }

  public static final int CAMPAIGN_MODULE_SID_FIELD_NUMBER = 2;
  private long campaignModuleSid_ = 0L;
  /**
   * <pre>
   * campaign module identifier
   * </pre>
   *
   * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
   * @return The campaignModuleSid.
   */
  @java.lang.Override
  public long getCampaignModuleSid() {
    return campaignModuleSid_;
  }

  public static final int CONTACT_LIST_DATA_SOURCE_FIELD_NUMBER = 100;
  /**
   * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
   * @return Whether the contactListDataSource field is set.
   */
  @java.lang.Override
  public boolean hasContactListDataSource() {
    return dataSourceCase_ == 100;
  }
  /**
   * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
   * @return The contactListDataSource.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactListDataSource getContactListDataSource() {
    if (dataSourceCase_ == 100) {
       return (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_;
    }
    return com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance();
  }
  /**
   * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ContactListDataSourceOrBuilder getContactListDataSourceOrBuilder() {
    if (dataSourceCase_ == 100) {
       return (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_;
    }
    return com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance();
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
    if (campaignSid_ != 0L) {
      output.writeInt64(1, campaignSid_);
    }
    if (campaignModuleSid_ != 0L) {
      output.writeInt64(2, campaignModuleSid_);
    }
    if (dataSourceCase_ == 100) {
      output.writeMessage(100, (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (campaignSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, campaignSid_);
    }
    if (campaignModuleSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, campaignModuleSid_);
    }
    if (dataSourceCase_ == 100) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.CreateTasksReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.CreateTasksReq other = (com.tcn.cloud.api.api.v0alpha.CreateTasksReq) obj;

    if (getCampaignSid()
        != other.getCampaignSid()) return false;
    if (getCampaignModuleSid()
        != other.getCampaignModuleSid()) return false;
    if (!getDataSourceCase().equals(other.getDataSourceCase())) return false;
    switch (dataSourceCase_) {
      case 100:
        if (!getContactListDataSource()
            .equals(other.getContactListDataSource())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + CAMPAIGN_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignSid());
    hash = (37 * hash) + CAMPAIGN_MODULE_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignModuleSid());
    switch (dataSourceCase_) {
      case 100:
        hash = (37 * hash) + CONTACT_LIST_DATA_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getContactListDataSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.CreateTasksReq prototype) {
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
   * CreateTasksReq - create tasks per a contact list
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.CreateTasksReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.CreateTasksReq)
      com.tcn.cloud.api.api.v0alpha.CreateTasksReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateTasksReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateTasksReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.CreateTasksReq.class, com.tcn.cloud.api.api.v0alpha.CreateTasksReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.CreateTasksReq.newBuilder()
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
      campaignSid_ = 0L;
      campaignModuleSid_ = 0L;
      if (contactListDataSourceBuilder_ != null) {
        contactListDataSourceBuilder_.clear();
      }
      dataSourceCase_ = 0;
      dataSource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.OmniapiProto.internal_static_api_v0alpha_CreateTasksReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateTasksReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.CreateTasksReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateTasksReq build() {
      com.tcn.cloud.api.api.v0alpha.CreateTasksReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.CreateTasksReq buildPartial() {
      com.tcn.cloud.api.api.v0alpha.CreateTasksReq result = new com.tcn.cloud.api.api.v0alpha.CreateTasksReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.CreateTasksReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campaignSid_ = campaignSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campaignModuleSid_ = campaignModuleSid_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v0alpha.CreateTasksReq result) {
      result.dataSourceCase_ = dataSourceCase_;
      result.dataSource_ = this.dataSource_;
      if (dataSourceCase_ == 100 &&
          contactListDataSourceBuilder_ != null) {
        result.dataSource_ = contactListDataSourceBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.CreateTasksReq) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.CreateTasksReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.CreateTasksReq other) {
      if (other == com.tcn.cloud.api.api.v0alpha.CreateTasksReq.getDefaultInstance()) return this;
      if (other.getCampaignSid() != 0L) {
        setCampaignSid(other.getCampaignSid());
      }
      if (other.getCampaignModuleSid() != 0L) {
        setCampaignModuleSid(other.getCampaignModuleSid());
      }
      switch (other.getDataSourceCase()) {
        case CONTACT_LIST_DATA_SOURCE: {
          mergeContactListDataSource(other.getContactListDataSource());
          break;
        }
        case DATASOURCE_NOT_SET: {
          break;
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
            case 8: {
              campaignSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              campaignModuleSid_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 802: {
              input.readMessage(
                  getContactListDataSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              dataSourceCase_ = 100;
              break;
            } // case 802
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
    private int dataSourceCase_ = 0;
    private java.lang.Object dataSource_;
    public DataSourceCase
        getDataSourceCase() {
      return DataSourceCase.forNumber(
          dataSourceCase_);
    }

    public Builder clearDataSource() {
      dataSourceCase_ = 0;
      dataSource_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private long campaignSid_ ;
    /**
     * <pre>
     * campaign identifier
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return The campaignSid.
     */
    @java.lang.Override
    public long getCampaignSid() {
      return campaignSid_;
    }
    /**
     * <pre>
     * campaign identifier
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @param value The campaignSid to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignSid(long value) {

      campaignSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign identifier
     * </pre>
     *
     * <code>int64 campaign_sid = 1 [json_name = "campaignSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      campaignSid_ = 0L;
      onChanged();
      return this;
    }

    private long campaignModuleSid_ ;
    /**
     * <pre>
     * campaign module identifier
     * </pre>
     *
     * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
     * @return The campaignModuleSid.
     */
    @java.lang.Override
    public long getCampaignModuleSid() {
      return campaignModuleSid_;
    }
    /**
     * <pre>
     * campaign module identifier
     * </pre>
     *
     * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
     * @param value The campaignModuleSid to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignModuleSid(long value) {

      campaignModuleSid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * campaign module identifier
     * </pre>
     *
     * <code>int64 campaign_module_sid = 2 [json_name = "campaignModuleSid", jstype = JS_STRING];</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignModuleSid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      campaignModuleSid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ContactListDataSource, com.tcn.cloud.api.api.v0alpha.ContactListDataSource.Builder, com.tcn.cloud.api.api.v0alpha.ContactListDataSourceOrBuilder> contactListDataSourceBuilder_;
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     * @return Whether the contactListDataSource field is set.
     */
    @java.lang.Override
    public boolean hasContactListDataSource() {
      return dataSourceCase_ == 100;
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     * @return The contactListDataSource.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactListDataSource getContactListDataSource() {
      if (contactListDataSourceBuilder_ == null) {
        if (dataSourceCase_ == 100) {
          return (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_;
        }
        return com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance();
      } else {
        if (dataSourceCase_ == 100) {
          return contactListDataSourceBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    public Builder setContactListDataSource(com.tcn.cloud.api.api.v0alpha.ContactListDataSource value) {
      if (contactListDataSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataSource_ = value;
        onChanged();
      } else {
        contactListDataSourceBuilder_.setMessage(value);
      }
      dataSourceCase_ = 100;
      return this;
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    public Builder setContactListDataSource(
        com.tcn.cloud.api.api.v0alpha.ContactListDataSource.Builder builderForValue) {
      if (contactListDataSourceBuilder_ == null) {
        dataSource_ = builderForValue.build();
        onChanged();
      } else {
        contactListDataSourceBuilder_.setMessage(builderForValue.build());
      }
      dataSourceCase_ = 100;
      return this;
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    public Builder mergeContactListDataSource(com.tcn.cloud.api.api.v0alpha.ContactListDataSource value) {
      if (contactListDataSourceBuilder_ == null) {
        if (dataSourceCase_ == 100 &&
            dataSource_ != com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance()) {
          dataSource_ = com.tcn.cloud.api.api.v0alpha.ContactListDataSource.newBuilder((com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_)
              .mergeFrom(value).buildPartial();
        } else {
          dataSource_ = value;
        }
        onChanged();
      } else {
        if (dataSourceCase_ == 100) {
          contactListDataSourceBuilder_.mergeFrom(value);
        } else {
          contactListDataSourceBuilder_.setMessage(value);
        }
      }
      dataSourceCase_ = 100;
      return this;
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    public Builder clearContactListDataSource() {
      if (contactListDataSourceBuilder_ == null) {
        if (dataSourceCase_ == 100) {
          dataSourceCase_ = 0;
          dataSource_ = null;
          onChanged();
        }
      } else {
        if (dataSourceCase_ == 100) {
          dataSourceCase_ = 0;
          dataSource_ = null;
        }
        contactListDataSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ContactListDataSource.Builder getContactListDataSourceBuilder() {
      return getContactListDataSourceFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ContactListDataSourceOrBuilder getContactListDataSourceOrBuilder() {
      if ((dataSourceCase_ == 100) && (contactListDataSourceBuilder_ != null)) {
        return contactListDataSourceBuilder_.getMessageOrBuilder();
      } else {
        if (dataSourceCase_ == 100) {
          return (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_;
        }
        return com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v0alpha.ContactListDataSource contact_list_data_source = 100 [json_name = "contactListDataSource"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.ContactListDataSource, com.tcn.cloud.api.api.v0alpha.ContactListDataSource.Builder, com.tcn.cloud.api.api.v0alpha.ContactListDataSourceOrBuilder> 
        getContactListDataSourceFieldBuilder() {
      if (contactListDataSourceBuilder_ == null) {
        if (!(dataSourceCase_ == 100)) {
          dataSource_ = com.tcn.cloud.api.api.v0alpha.ContactListDataSource.getDefaultInstance();
        }
        contactListDataSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.ContactListDataSource, com.tcn.cloud.api.api.v0alpha.ContactListDataSource.Builder, com.tcn.cloud.api.api.v0alpha.ContactListDataSourceOrBuilder>(
                (com.tcn.cloud.api.api.v0alpha.ContactListDataSource) dataSource_,
                getParentForChildren(),
                isClean());
        dataSource_ = null;
      }
      dataSourceCase_ = 100;
      onChanged();
      return contactListDataSourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.CreateTasksReq)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.CreateTasksReq)
  private static final com.tcn.cloud.api.api.v0alpha.CreateTasksReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.CreateTasksReq();
  }

  public static com.tcn.cloud.api.api.v0alpha.CreateTasksReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateTasksReq>
      PARSER = new com.google.protobuf.AbstractParser<CreateTasksReq>() {
    @java.lang.Override
    public CreateTasksReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateTasksReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateTasksReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.CreateTasksReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

