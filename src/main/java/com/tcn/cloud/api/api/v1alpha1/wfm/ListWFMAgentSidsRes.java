// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/wfm/wfm.proto

package com.tcn.cloud.api.api.v1alpha1.wfm;

/**
 * <pre>
 * Response message for the ListWFMAgentSids RPC
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.wfm.ListWFMAgentSidsRes}
 */
public final class ListWFMAgentSidsRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.wfm.ListWFMAgentSidsRes)
    ListWFMAgentSidsResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWFMAgentSidsRes.newBuilder() to construct.
  private ListWFMAgentSidsRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWFMAgentSidsRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWFMAgentSidsRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListWFMAgentSidsRes_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetSids();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListWFMAgentSidsRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.Builder.class);
  }

  public static final int SIDS_FIELD_NUMBER = 1;
  private static final class SidsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, java.lang.Long>newDefaultInstance(
                com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListWFMAgentSidsRes_SidsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Long, java.lang.Long> sids_;
  private com.google.protobuf.MapField<java.lang.Long, java.lang.Long>
  internalGetSids() {
    if (sids_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SidsDefaultEntryHolder.defaultEntry);
    }
    return sids_;
  }
  public int getSidsCount() {
    return internalGetSids().getMap().size();
  }
  /**
   * <pre>
   * Map of WFM agents found.
   * Key: tcn_agent_sid - Value: wfm_agent_sid.
   * </pre>
   *
   * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
   */
  @java.lang.Override
  public boolean containsSids(
      long key) {

    return internalGetSids().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSidsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, java.lang.Long> getSids() {
    return getSidsMap();
  }
  /**
   * <pre>
   * Map of WFM agents found.
   * Key: tcn_agent_sid - Value: wfm_agent_sid.
   * </pre>
   *
   * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Long, java.lang.Long> getSidsMap() {
    return internalGetSids().getMap();
  }
  /**
   * <pre>
   * Map of WFM agents found.
   * Key: tcn_agent_sid - Value: wfm_agent_sid.
   * </pre>
   *
   * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
   */
  @java.lang.Override
  public long getSidsOrDefault(
      long key,
      long defaultValue) {

    java.util.Map<java.lang.Long, java.lang.Long> map =
        internalGetSids().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map of WFM agents found.
   * Key: tcn_agent_sid - Value: wfm_agent_sid.
   * </pre>
   *
   * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
   */
  @java.lang.Override
  public long getSidsOrThrow(
      long key) {

    java.util.Map<java.lang.Long, java.lang.Long> map =
        internalGetSids().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetSids(),
        SidsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Long, java.lang.Long> entry
         : internalGetSids().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, java.lang.Long>
      sids__ = SidsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, sids__);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes other = (com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes) obj;

    if (!internalGetSids().equals(
        other.internalGetSids())) return false;
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
    if (!internalGetSids().getMap().isEmpty()) {
      hash = (37 * hash) + SIDS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSids().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes prototype) {
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
   * Response message for the ListWFMAgentSids RPC
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.wfm.ListWFMAgentSidsRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.wfm.ListWFMAgentSidsRes)
      com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListWFMAgentSidsRes_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetSids();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableSids();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListWFMAgentSidsRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.class, com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.newBuilder()
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
      internalGetMutableSids().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.WfmProto.internal_static_api_v1alpha1_wfm_ListWFMAgentSidsRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes build() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes result = new com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sids_ = internalGetSids();
        result.sids_.makeImmutable();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes.getDefaultInstance()) return this;
      internalGetMutableSids().mergeFrom(
          other.internalGetSids());
      bitField0_ |= 0x00000001;
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
              com.google.protobuf.MapEntry<java.lang.Long, java.lang.Long>
              sids__ = input.readMessage(
                  SidsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSids().getMutableMap().put(
                  sids__.getKey(), sids__.getValue());
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

    private com.google.protobuf.MapField<
        java.lang.Long, java.lang.Long> sids_;
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Long>
        internalGetSids() {
      if (sids_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SidsDefaultEntryHolder.defaultEntry);
      }
      return sids_;
    }
    private com.google.protobuf.MapField<java.lang.Long, java.lang.Long>
        internalGetMutableSids() {
      if (sids_ == null) {
        sids_ = com.google.protobuf.MapField.newMapField(
            SidsDefaultEntryHolder.defaultEntry);
      }
      if (!sids_.isMutable()) {
        sids_ = sids_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return sids_;
    }
    public int getSidsCount() {
      return internalGetSids().getMap().size();
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    @java.lang.Override
    public boolean containsSids(
        long key) {

      return internalGetSids().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSidsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Long> getSids() {
      return getSidsMap();
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, java.lang.Long> getSidsMap() {
      return internalGetSids().getMap();
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    @java.lang.Override
    public long getSidsOrDefault(
        long key,
        long defaultValue) {

      java.util.Map<java.lang.Long, java.lang.Long> map =
          internalGetSids().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    @java.lang.Override
    public long getSidsOrThrow(
        long key) {

      java.util.Map<java.lang.Long, java.lang.Long> map =
          internalGetSids().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearSids() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableSids().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    public Builder removeSids(
        long key) {

      internalGetMutableSids().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, java.lang.Long>
        getMutableSids() {
      bitField0_ |= 0x00000001;
      return internalGetMutableSids().getMutableMap();
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    public Builder putSids(
        long key,
        long value) {


      internalGetMutableSids().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * Map of WFM agents found.
     * Key: tcn_agent_sid - Value: wfm_agent_sid.
     * </pre>
     *
     * <code>map&lt;int64, int64&gt; sids = 1 [json_name = "sids"];</code>
     */
    public Builder putAllSids(
        java.util.Map<java.lang.Long, java.lang.Long> values) {
      internalGetMutableSids().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.wfm.ListWFMAgentSidsRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.wfm.ListWFMAgentSidsRes)
  private static final com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWFMAgentSidsRes>
      PARSER = new com.google.protobuf.AbstractParser<ListWFMAgentSidsRes>() {
    @java.lang.Override
    public ListWFMAgentSidsRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListWFMAgentSidsRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWFMAgentSidsRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.wfm.ListWFMAgentSidsRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

