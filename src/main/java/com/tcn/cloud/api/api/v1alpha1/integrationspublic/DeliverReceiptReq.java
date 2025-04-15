// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

/**
 * Protobuf type {@code api.v1alpha1.integrationspublic.DeliverReceiptReq}
 */
public final class DeliverReceiptReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrationspublic.DeliverReceiptReq)
    DeliverReceiptReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeliverReceiptReq.newBuilder() to construct.
  private DeliverReceiptReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeliverReceiptReq() {
    receiptId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeliverReceiptReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_DeliverReceiptReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_DeliverReceiptReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.Builder.class);
  }

  private int deliveryMethodCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object deliveryMethod_;
  public enum DeliveryMethodCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EMAIL_RECEIPT(3),
    DELIVERYMETHOD_NOT_SET(0);
    private final int value;
    private DeliveryMethodCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DeliveryMethodCase valueOf(int value) {
      return forNumber(value);
    }

    public static DeliveryMethodCase forNumber(int value) {
      switch (value) {
        case 3: return EMAIL_RECEIPT;
        case 0: return DELIVERYMETHOD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DeliveryMethodCase
  getDeliveryMethodCase() {
    return DeliveryMethodCase.forNumber(
        deliveryMethodCase_);
  }

  public static final int EMAIL_RECEIPT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * adding sms, and pdf download in the future if requested
   * </pre>
   *
   * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
   * @return Whether the emailReceipt field is set.
   */
  @java.lang.Override
  public boolean hasEmailReceipt() {
    return deliveryMethodCase_ == 3;
  }
  /**
   * <pre>
   * adding sms, and pdf download in the future if requested
   * </pre>
   *
   * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
   * @return The emailReceipt.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt getEmailReceipt() {
    if (deliveryMethodCase_ == 3) {
       return (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_;
    }
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance();
  }
  /**
   * <pre>
   * adding sms, and pdf download in the future if requested
   * </pre>
   *
   * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceiptOrBuilder getEmailReceiptOrBuilder() {
    if (deliveryMethodCase_ == 3) {
       return (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_;
    }
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance();
  }

  public static final int RECEIPT_ID_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object receiptId_ = "";
  /**
   * <pre>
   * used to look up the populated receipt template in tmp storage
   * </pre>
   *
   * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
   * @return The receiptId.
   */
  @java.lang.Override
  public java.lang.String getReceiptId() {
    java.lang.Object ref = receiptId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      receiptId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * used to look up the populated receipt template in tmp storage
   * </pre>
   *
   * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
   * @return The bytes for receiptId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReceiptIdBytes() {
    java.lang.Object ref = receiptId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      receiptId_ = b;
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
    if (deliveryMethodCase_ == 3) {
      output.writeMessage(3, (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, receiptId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deliveryMethodCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiptId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, receiptId_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq other = (com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq) obj;

    if (!getReceiptId()
        .equals(other.getReceiptId())) return false;
    if (!getDeliveryMethodCase().equals(other.getDeliveryMethodCase())) return false;
    switch (deliveryMethodCase_) {
      case 3:
        if (!getEmailReceipt()
            .equals(other.getEmailReceipt())) return false;
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
    hash = (37 * hash) + RECEIPT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReceiptId().hashCode();
    switch (deliveryMethodCase_) {
      case 3:
        hash = (37 * hash) + EMAIL_RECEIPT_FIELD_NUMBER;
        hash = (53 * hash) + getEmailReceipt().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrationspublic.DeliverReceiptReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrationspublic.DeliverReceiptReq)
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_DeliverReceiptReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_DeliverReceiptReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.newBuilder()
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
      if (emailReceiptBuilder_ != null) {
        emailReceiptBuilder_.clear();
      }
      receiptId_ = "";
      deliveryMethodCase_ = 0;
      deliveryMethod_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_DeliverReceiptReq_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq build() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq result = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.receiptId_ = receiptId_;
      }
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq result) {
      result.deliveryMethodCase_ = deliveryMethodCase_;
      result.deliveryMethod_ = this.deliveryMethod_;
      if (deliveryMethodCase_ == 3 &&
          emailReceiptBuilder_ != null) {
        result.deliveryMethod_ = emailReceiptBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq.getDefaultInstance()) return this;
      if (!other.getReceiptId().isEmpty()) {
        receiptId_ = other.receiptId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getDeliveryMethodCase()) {
        case EMAIL_RECEIPT: {
          mergeEmailReceipt(other.getEmailReceipt());
          break;
        }
        case DELIVERYMETHOD_NOT_SET: {
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
            case 26: {
              input.readMessage(
                  getEmailReceiptFieldBuilder().getBuilder(),
                  extensionRegistry);
              deliveryMethodCase_ = 3;
              break;
            } // case 26
            case 50: {
              receiptId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 50
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
    private int deliveryMethodCase_ = 0;
    private java.lang.Object deliveryMethod_;
    public DeliveryMethodCase
        getDeliveryMethodCase() {
      return DeliveryMethodCase.forNumber(
          deliveryMethodCase_);
    }

    public Builder clearDeliveryMethod() {
      deliveryMethodCase_ = 0;
      deliveryMethod_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt, com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.Builder, com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceiptOrBuilder> emailReceiptBuilder_;
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     * @return Whether the emailReceipt field is set.
     */
    @java.lang.Override
    public boolean hasEmailReceipt() {
      return deliveryMethodCase_ == 3;
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     * @return The emailReceipt.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt getEmailReceipt() {
      if (emailReceiptBuilder_ == null) {
        if (deliveryMethodCase_ == 3) {
          return (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_;
        }
        return com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance();
      } else {
        if (deliveryMethodCase_ == 3) {
          return emailReceiptBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    public Builder setEmailReceipt(com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt value) {
      if (emailReceiptBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deliveryMethod_ = value;
        onChanged();
      } else {
        emailReceiptBuilder_.setMessage(value);
      }
      deliveryMethodCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    public Builder setEmailReceipt(
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.Builder builderForValue) {
      if (emailReceiptBuilder_ == null) {
        deliveryMethod_ = builderForValue.build();
        onChanged();
      } else {
        emailReceiptBuilder_.setMessage(builderForValue.build());
      }
      deliveryMethodCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    public Builder mergeEmailReceipt(com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt value) {
      if (emailReceiptBuilder_ == null) {
        if (deliveryMethodCase_ == 3 &&
            deliveryMethod_ != com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance()) {
          deliveryMethod_ = com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.newBuilder((com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_)
              .mergeFrom(value).buildPartial();
        } else {
          deliveryMethod_ = value;
        }
        onChanged();
      } else {
        if (deliveryMethodCase_ == 3) {
          emailReceiptBuilder_.mergeFrom(value);
        } else {
          emailReceiptBuilder_.setMessage(value);
        }
      }
      deliveryMethodCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    public Builder clearEmailReceipt() {
      if (emailReceiptBuilder_ == null) {
        if (deliveryMethodCase_ == 3) {
          deliveryMethodCase_ = 0;
          deliveryMethod_ = null;
          onChanged();
        }
      } else {
        if (deliveryMethodCase_ == 3) {
          deliveryMethodCase_ = 0;
          deliveryMethod_ = null;
        }
        emailReceiptBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.Builder getEmailReceiptBuilder() {
      return getEmailReceiptFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceiptOrBuilder getEmailReceiptOrBuilder() {
      if ((deliveryMethodCase_ == 3) && (emailReceiptBuilder_ != null)) {
        return emailReceiptBuilder_.getMessageOrBuilder();
      } else {
        if (deliveryMethodCase_ == 3) {
          return (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_;
        }
        return com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * adding sms, and pdf download in the future if requested
     * </pre>
     *
     * <code>.api.v1alpha1.integrationspublic.EmailReceipt email_receipt = 3 [json_name = "emailReceipt"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt, com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.Builder, com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceiptOrBuilder> 
        getEmailReceiptFieldBuilder() {
      if (emailReceiptBuilder_ == null) {
        if (!(deliveryMethodCase_ == 3)) {
          deliveryMethod_ = com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.getDefaultInstance();
        }
        emailReceiptBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt, com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt.Builder, com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceiptOrBuilder>(
                (com.tcn.cloud.api.api.v1alpha1.integrationspublic.EmailReceipt) deliveryMethod_,
                getParentForChildren(),
                isClean());
        deliveryMethod_ = null;
      }
      deliveryMethodCase_ = 3;
      onChanged();
      return emailReceiptBuilder_;
    }

    private java.lang.Object receiptId_ = "";
    /**
     * <pre>
     * used to look up the populated receipt template in tmp storage
     * </pre>
     *
     * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
     * @return The receiptId.
     */
    public java.lang.String getReceiptId() {
      java.lang.Object ref = receiptId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiptId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * used to look up the populated receipt template in tmp storage
     * </pre>
     *
     * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
     * @return The bytes for receiptId.
     */
    public com.google.protobuf.ByteString
        getReceiptIdBytes() {
      java.lang.Object ref = receiptId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiptId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * used to look up the populated receipt template in tmp storage
     * </pre>
     *
     * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
     * @param value The receiptId to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      receiptId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * used to look up the populated receipt template in tmp storage
     * </pre>
     *
     * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearReceiptId() {
      receiptId_ = getDefaultInstance().getReceiptId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * used to look up the populated receipt template in tmp storage
     * </pre>
     *
     * <code>string receipt_id = 6 [json_name = "receiptId"];</code>
     * @param value The bytes for receiptId to set.
     * @return This builder for chaining.
     */
    public Builder setReceiptIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      receiptId_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrationspublic.DeliverReceiptReq)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrationspublic.DeliverReceiptReq)
  private static final com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeliverReceiptReq>
      PARSER = new com.google.protobuf.AbstractParser<DeliverReceiptReq>() {
    @java.lang.Override
    public DeliverReceiptReq parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeliverReceiptReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeliverReceiptReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.DeliverReceiptReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

