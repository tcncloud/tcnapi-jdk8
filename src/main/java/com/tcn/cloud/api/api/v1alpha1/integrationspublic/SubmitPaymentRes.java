// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

/**
 * Protobuf type {@code api.v1alpha1.integrationspublic.SubmitPaymentRes}
 */
public final class SubmitPaymentRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrationspublic.SubmitPaymentRes)
    SubmitPaymentResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SubmitPaymentRes.newBuilder() to construct.
  private SubmitPaymentRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubmitPaymentRes() {
    amountPaidKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SubmitPaymentRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SubmitPaymentRes_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetFields();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SubmitPaymentRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.Builder.class);
  }

  public static final int FIELDS_FIELD_NUMBER = 1;
  private static final class FieldsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>newDefaultInstance(
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SubmitPaymentRes_FieldsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> fields_;
  private com.google.protobuf.MapField<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
  internalGetFields() {
    if (fields_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FieldsDefaultEntryHolder.defaultEntry);
    }
    return fields_;
  }
  public int getFieldsCount() {
    return internalGetFields().getMap().size();
  }
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public boolean containsFields(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetFields().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> getFields() {
    return getFieldsMap();
  }
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> getFieldsMap() {
    return internalGetFields().getMap();
  }
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> map =
        internalGetFields().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getFieldsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> map =
        internalGetFields().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int AMOUNT_PAID_FIELD_NUMBER = 2;
  private double amountPaid_ = 0D;
  /**
   * <code>double amount_paid = 2 [json_name = "amountPaid"];</code>
   * @return The amountPaid.
   */
  @java.lang.Override
  public double getAmountPaid() {
    return amountPaid_;
  }

  public static final int AMOUNT_PAID_KEY_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object amountPaidKey_ = "";
  /**
   * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
   * @return The amountPaidKey.
   */
  @java.lang.Override
  public java.lang.String getAmountPaidKey() {
    java.lang.Object ref = amountPaidKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      amountPaidKey_ = s;
      return s;
    }
  }
  /**
   * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
   * @return The bytes for amountPaidKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAmountPaidKeyBytes() {
    java.lang.Object ref = amountPaidKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      amountPaidKey_ = b;
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetFields(),
        FieldsDefaultEntryHolder.defaultEntry,
        1);
    if (java.lang.Double.doubleToRawLongBits(amountPaid_) != 0) {
      output.writeDouble(2, amountPaid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amountPaidKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, amountPaidKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> entry
         : internalGetFields().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
      fields__ = FieldsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, fields__);
    }
    if (java.lang.Double.doubleToRawLongBits(amountPaid_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, amountPaid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(amountPaidKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, amountPaidKey_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes other = (com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes) obj;

    if (!internalGetFields().equals(
        other.internalGetFields())) return false;
    if (java.lang.Double.doubleToLongBits(getAmountPaid())
        != java.lang.Double.doubleToLongBits(
            other.getAmountPaid())) return false;
    if (!getAmountPaidKey()
        .equals(other.getAmountPaidKey())) return false;
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
    if (!internalGetFields().getMap().isEmpty()) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFields().hashCode();
    }
    hash = (37 * hash) + AMOUNT_PAID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmountPaid()));
    hash = (37 * hash) + AMOUNT_PAID_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getAmountPaidKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrationspublic.SubmitPaymentRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrationspublic.SubmitPaymentRes)
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SubmitPaymentRes_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetFields();
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
          return internalGetMutableFields();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SubmitPaymentRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.newBuilder()
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
      internalGetMutableFields().clear();
      amountPaid_ = 0D;
      amountPaidKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_SubmitPaymentRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes build() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes result = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fields_ = internalGetFields();
        result.fields_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.amountPaid_ = amountPaid_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amountPaidKey_ = amountPaidKey_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes.getDefaultInstance()) return this;
      internalGetMutableFields().mergeFrom(
          other.internalGetFields());
      bitField0_ |= 0x00000001;
      if (other.getAmountPaid() != 0D) {
        setAmountPaid(other.getAmountPaid());
      }
      if (!other.getAmountPaidKey().isEmpty()) {
        amountPaidKey_ = other.amountPaidKey_;
        bitField0_ |= 0x00000004;
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
              com.google.protobuf.MapEntry<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
              fields__ = input.readMessage(
                  FieldsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableFields().getMutableMap().put(
                  fields__.getKey(), fields__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 17: {
              amountPaid_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            case 26: {
              amountPaidKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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
        java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> fields_;
    private com.google.protobuf.MapField<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
        internalGetFields() {
      if (fields_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FieldsDefaultEntryHolder.defaultEntry);
      }
      return fields_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
        internalGetMutableFields() {
      if (fields_ == null) {
        fields_ = com.google.protobuf.MapField.newMapField(
            FieldsDefaultEntryHolder.defaultEntry);
      }
      if (!fields_.isMutable()) {
        fields_ = fields_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return fields_;
    }
    public int getFieldsCount() {
      return internalGetFields().getMap().size();
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public boolean containsFields(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetFields().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFieldsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> getFields() {
      return getFieldsMap();
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> getFieldsMap() {
      return internalGetFields().getMap();
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getFieldsOrDefault(
        java.lang.String key,
        /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> map =
          internalGetFields().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value getFieldsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> map =
          internalGetFields().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearFields() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableFields().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    public Builder removeFields(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableFields().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value>
        getMutableFields() {
      bitField0_ |= 0x00000001;
      return internalGetMutableFields().getMutableMap();
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    public Builder putFields(
        java.lang.String key,
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableFields().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .api.v1alpha1.integrationspublic.Value&gt; fields = 1 [json_name = "fields"];</code>
     */
    public Builder putAllFields(
        java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrationspublic.Value> values) {
      internalGetMutableFields().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private double amountPaid_ ;
    /**
     * <code>double amount_paid = 2 [json_name = "amountPaid"];</code>
     * @return The amountPaid.
     */
    @java.lang.Override
    public double getAmountPaid() {
      return amountPaid_;
    }
    /**
     * <code>double amount_paid = 2 [json_name = "amountPaid"];</code>
     * @param value The amountPaid to set.
     * @return This builder for chaining.
     */
    public Builder setAmountPaid(double value) {

      amountPaid_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double amount_paid = 2 [json_name = "amountPaid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmountPaid() {
      bitField0_ = (bitField0_ & ~0x00000002);
      amountPaid_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object amountPaidKey_ = "";
    /**
     * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
     * @return The amountPaidKey.
     */
    public java.lang.String getAmountPaidKey() {
      java.lang.Object ref = amountPaidKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        amountPaidKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
     * @return The bytes for amountPaidKey.
     */
    public com.google.protobuf.ByteString
        getAmountPaidKeyBytes() {
      java.lang.Object ref = amountPaidKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        amountPaidKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
     * @param value The amountPaidKey to set.
     * @return This builder for chaining.
     */
    public Builder setAmountPaidKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      amountPaidKey_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmountPaidKey() {
      amountPaidKey_ = getDefaultInstance().getAmountPaidKey();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string amount_paid_key = 3 [json_name = "amountPaidKey"];</code>
     * @param value The bytes for amountPaidKey to set.
     * @return This builder for chaining.
     */
    public Builder setAmountPaidKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      amountPaidKey_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrationspublic.SubmitPaymentRes)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrationspublic.SubmitPaymentRes)
  private static final com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitPaymentRes>
      PARSER = new com.google.protobuf.AbstractParser<SubmitPaymentRes>() {
    @java.lang.Override
    public SubmitPaymentRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubmitPaymentRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitPaymentRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.SubmitPaymentRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

