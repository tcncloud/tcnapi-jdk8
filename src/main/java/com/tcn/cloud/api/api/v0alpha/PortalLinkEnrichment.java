// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.PortalLinkEnrichment}
 */
public final class PortalLinkEnrichment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.PortalLinkEnrichment)
    PortalLinkEnrichmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PortalLinkEnrichment.newBuilder() to construct.
  private PortalLinkEnrichment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PortalLinkEnrichment() {
    portalId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PortalLinkEnrichment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_PortalLinkEnrichment_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetKeyMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_PortalLinkEnrichment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.class, com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.Builder.class);
  }

  public static final int KEY_MAP_FIELD_NUMBER = 1;
  private static final class KeyMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_PortalLinkEnrichment_KeyMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> keyMap_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetKeyMap() {
    if (keyMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          KeyMapDefaultEntryHolder.defaultEntry);
    }
    return keyMap_;
  }
  public int getKeyMapCount() {
    return internalGetKeyMap().getMap().size();
  }
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
   */
  @java.lang.Override
  public boolean containsKeyMap(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetKeyMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getKeyMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getKeyMap() {
    return getKeyMapMap();
  }
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getKeyMapMap() {
    return internalGetKeyMap().getMap();
  }
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getKeyMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetKeyMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * lms field names as keys, mapped to what they should be called in the portal
   * </pre>
   *
   * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
   */
  @java.lang.Override
  public java.lang.String getKeyMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetKeyMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int PORTAL_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object portalId_ = "";
  /**
   * <pre>
   * the portal that these links will belong to.
   * </pre>
   *
   * <code>string portal_id = 2 [json_name = "portalId"];</code>
   * @return The portalId.
   */
  @java.lang.Override
  public java.lang.String getPortalId() {
    java.lang.Object ref = portalId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      portalId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the portal that these links will belong to.
   * </pre>
   *
   * <code>string portal_id = 2 [json_name = "portalId"];</code>
   * @return The bytes for portalId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPortalIdBytes() {
    java.lang.Object ref = portalId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      portalId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRATION_FIELD_NUMBER = 6;
  private com.tcn.cloud.api.api.v0alpha.Expiration expiration_;
  /**
   * <pre>
   * unit type and quantity of: months, weeks, days, hours
   * </pre>
   *
   * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
   * @return Whether the expiration field is set.
   */
  @java.lang.Override
  public boolean hasExpiration() {
    return expiration_ != null;
  }
  /**
   * <pre>
   * unit type and quantity of: months, weeks, days, hours
   * </pre>
   *
   * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
   * @return The expiration.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Expiration getExpiration() {
    return expiration_ == null ? com.tcn.cloud.api.api.v0alpha.Expiration.getDefaultInstance() : expiration_;
  }
  /**
   * <pre>
   * unit type and quantity of: months, weeks, days, hours
   * </pre>
   *
   * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ExpirationOrBuilder getExpirationOrBuilder() {
    return expiration_ == null ? com.tcn.cloud.api.api.v0alpha.Expiration.getDefaultInstance() : expiration_;
  }

  public static final int DEMO_FIELD_NUMBER = 7;
  private boolean demo_ = false;
  /**
   * <pre>
   * if the payment will process or not
   * </pre>
   *
   * <code>bool demo = 7 [json_name = "demo"];</code>
   * @return The demo.
   */
  @java.lang.Override
  public boolean getDemo() {
    return demo_;
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
      .serializeStringMapTo(
        output,
        internalGetKeyMap(),
        KeyMapDefaultEntryHolder.defaultEntry,
        1);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portalId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, portalId_);
    }
    if (expiration_ != null) {
      output.writeMessage(6, getExpiration());
    }
    if (demo_ != false) {
      output.writeBool(7, demo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetKeyMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      keyMap__ = KeyMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, keyMap__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(portalId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, portalId_);
    }
    if (expiration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(6, getExpiration());
    }
    if (demo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, demo_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment other = (com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment) obj;

    if (!internalGetKeyMap().equals(
        other.internalGetKeyMap())) return false;
    if (!getPortalId()
        .equals(other.getPortalId())) return false;
    if (hasExpiration() != other.hasExpiration()) return false;
    if (hasExpiration()) {
      if (!getExpiration()
          .equals(other.getExpiration())) return false;
    }
    if (getDemo()
        != other.getDemo()) return false;
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
    if (!internalGetKeyMap().getMap().isEmpty()) {
      hash = (37 * hash) + KEY_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetKeyMap().hashCode();
    }
    hash = (37 * hash) + PORTAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPortalId().hashCode();
    if (hasExpiration()) {
      hash = (37 * hash) + EXPIRATION_FIELD_NUMBER;
      hash = (53 * hash) + getExpiration().hashCode();
    }
    hash = (37 * hash) + DEMO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDemo());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment prototype) {
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
   * Protobuf type {@code api.v0alpha.PortalLinkEnrichment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.PortalLinkEnrichment)
      com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_PortalLinkEnrichment_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetKeyMap();
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
          return internalGetMutableKeyMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_PortalLinkEnrichment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.class, com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.newBuilder()
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
      internalGetMutableKeyMap().clear();
      portalId_ = "";
      expiration_ = null;
      if (expirationBuilder_ != null) {
        expirationBuilder_.dispose();
        expirationBuilder_ = null;
      }
      demo_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_PortalLinkEnrichment_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment build() {
      com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment buildPartial() {
      com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment result = new com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keyMap_ = internalGetKeyMap();
        result.keyMap_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.portalId_ = portalId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.expiration_ = expirationBuilder_ == null
            ? expiration_
            : expirationBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.demo_ = demo_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment other) {
      if (other == com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment.getDefaultInstance()) return this;
      internalGetMutableKeyMap().mergeFrom(
          other.internalGetKeyMap());
      bitField0_ |= 0x00000001;
      if (!other.getPortalId().isEmpty()) {
        portalId_ = other.portalId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasExpiration()) {
        mergeExpiration(other.getExpiration());
      }
      if (other.getDemo() != false) {
        setDemo(other.getDemo());
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
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              keyMap__ = input.readMessage(
                  KeyMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableKeyMap().getMutableMap().put(
                  keyMap__.getKey(), keyMap__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              portalId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 50: {
              input.readMessage(
                  getExpirationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 50
            case 56: {
              demo_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 56
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
        java.lang.String, java.lang.String> keyMap_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetKeyMap() {
      if (keyMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            KeyMapDefaultEntryHolder.defaultEntry);
      }
      return keyMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableKeyMap() {
      if (keyMap_ == null) {
        keyMap_ = com.google.protobuf.MapField.newMapField(
            KeyMapDefaultEntryHolder.defaultEntry);
      }
      if (!keyMap_.isMutable()) {
        keyMap_ = keyMap_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return keyMap_;
    }
    public int getKeyMapCount() {
      return internalGetKeyMap().getMap().size();
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    @java.lang.Override
    public boolean containsKeyMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetKeyMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getKeyMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getKeyMap() {
      return getKeyMapMap();
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getKeyMapMap() {
      return internalGetKeyMap().getMap();
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getKeyMapOrDefault(
        java.lang.String key,
        /* nullable */
java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetKeyMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    @java.lang.Override
    public java.lang.String getKeyMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetKeyMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearKeyMap() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableKeyMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    public Builder removeKeyMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableKeyMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
        getMutableKeyMap() {
      bitField0_ |= 0x00000001;
      return internalGetMutableKeyMap().getMutableMap();
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    public Builder putKeyMap(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableKeyMap().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * lms field names as keys, mapped to what they should be called in the portal
     * </pre>
     *
     * <code>map&lt;string, string&gt; key_map = 1 [json_name = "keyMap"];</code>
     */
    public Builder putAllKeyMap(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableKeyMap().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private java.lang.Object portalId_ = "";
    /**
     * <pre>
     * the portal that these links will belong to.
     * </pre>
     *
     * <code>string portal_id = 2 [json_name = "portalId"];</code>
     * @return The portalId.
     */
    public java.lang.String getPortalId() {
      java.lang.Object ref = portalId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portalId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the portal that these links will belong to.
     * </pre>
     *
     * <code>string portal_id = 2 [json_name = "portalId"];</code>
     * @return The bytes for portalId.
     */
    public com.google.protobuf.ByteString
        getPortalIdBytes() {
      java.lang.Object ref = portalId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        portalId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the portal that these links will belong to.
     * </pre>
     *
     * <code>string portal_id = 2 [json_name = "portalId"];</code>
     * @param value The portalId to set.
     * @return This builder for chaining.
     */
    public Builder setPortalId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      portalId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the portal that these links will belong to.
     * </pre>
     *
     * <code>string portal_id = 2 [json_name = "portalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPortalId() {
      portalId_ = getDefaultInstance().getPortalId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the portal that these links will belong to.
     * </pre>
     *
     * <code>string portal_id = 2 [json_name = "portalId"];</code>
     * @param value The bytes for portalId to set.
     * @return This builder for chaining.
     */
    public Builder setPortalIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      portalId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.tcn.cloud.api.api.v0alpha.Expiration expiration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Expiration, com.tcn.cloud.api.api.v0alpha.Expiration.Builder, com.tcn.cloud.api.api.v0alpha.ExpirationOrBuilder> expirationBuilder_;
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     * @return Whether the expiration field is set.
     */
    public boolean hasExpiration() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     * @return The expiration.
     */
    public com.tcn.cloud.api.api.v0alpha.Expiration getExpiration() {
      if (expirationBuilder_ == null) {
        return expiration_ == null ? com.tcn.cloud.api.api.v0alpha.Expiration.getDefaultInstance() : expiration_;
      } else {
        return expirationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    public Builder setExpiration(com.tcn.cloud.api.api.v0alpha.Expiration value) {
      if (expirationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expiration_ = value;
      } else {
        expirationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    public Builder setExpiration(
        com.tcn.cloud.api.api.v0alpha.Expiration.Builder builderForValue) {
      if (expirationBuilder_ == null) {
        expiration_ = builderForValue.build();
      } else {
        expirationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    public Builder mergeExpiration(com.tcn.cloud.api.api.v0alpha.Expiration value) {
      if (expirationBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          expiration_ != null &&
          expiration_ != com.tcn.cloud.api.api.v0alpha.Expiration.getDefaultInstance()) {
          getExpirationBuilder().mergeFrom(value);
        } else {
          expiration_ = value;
        }
      } else {
        expirationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    public Builder clearExpiration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      expiration_ = null;
      if (expirationBuilder_ != null) {
        expirationBuilder_.dispose();
        expirationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.Expiration.Builder getExpirationBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getExpirationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.ExpirationOrBuilder getExpirationOrBuilder() {
      if (expirationBuilder_ != null) {
        return expirationBuilder_.getMessageOrBuilder();
      } else {
        return expiration_ == null ?
            com.tcn.cloud.api.api.v0alpha.Expiration.getDefaultInstance() : expiration_;
      }
    }
    /**
     * <pre>
     * unit type and quantity of: months, weeks, days, hours
     * </pre>
     *
     * <code>.api.v0alpha.Expiration expiration = 6 [json_name = "expiration"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.Expiration, com.tcn.cloud.api.api.v0alpha.Expiration.Builder, com.tcn.cloud.api.api.v0alpha.ExpirationOrBuilder> 
        getExpirationFieldBuilder() {
      if (expirationBuilder_ == null) {
        expirationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.Expiration, com.tcn.cloud.api.api.v0alpha.Expiration.Builder, com.tcn.cloud.api.api.v0alpha.ExpirationOrBuilder>(
                getExpiration(),
                getParentForChildren(),
                isClean());
        expiration_ = null;
      }
      return expirationBuilder_;
    }

    private boolean demo_ ;
    /**
     * <pre>
     * if the payment will process or not
     * </pre>
     *
     * <code>bool demo = 7 [json_name = "demo"];</code>
     * @return The demo.
     */
    @java.lang.Override
    public boolean getDemo() {
      return demo_;
    }
    /**
     * <pre>
     * if the payment will process or not
     * </pre>
     *
     * <code>bool demo = 7 [json_name = "demo"];</code>
     * @param value The demo to set.
     * @return This builder for chaining.
     */
    public Builder setDemo(boolean value) {

      demo_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * if the payment will process or not
     * </pre>
     *
     * <code>bool demo = 7 [json_name = "demo"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDemo() {
      bitField0_ = (bitField0_ & ~0x00000008);
      demo_ = false;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.PortalLinkEnrichment)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.PortalLinkEnrichment)
  private static final com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment();
  }

  public static com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PortalLinkEnrichment>
      PARSER = new com.google.protobuf.AbstractParser<PortalLinkEnrichment>() {
    @java.lang.Override
    public PortalLinkEnrichment parsePartialFrom(
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

  public static com.google.protobuf.Parser<PortalLinkEnrichment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PortalLinkEnrichment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PortalLinkEnrichment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

