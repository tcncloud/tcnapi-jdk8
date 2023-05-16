// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.PortalType}
 */
public final class PortalType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.PortalType)
    PortalTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PortalType.newBuilder() to construct.
  private PortalType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PortalType() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PortalType();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.class, com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.Builder.class);
  }

  private int dataCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object data_;
  public enum DataCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PAYMENT_PORTAL(1),
    IVR_PORTAL(2),
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 1: return PAYMENT_PORTAL;
        case 2: return IVR_PORTAL;
        case 0: return DATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataCase
  getDataCase() {
    return DataCase.forNumber(
        dataCase_);
  }

  public static final int PAYMENT_PORTAL_FIELD_NUMBER = 1;
  /**
   * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
   * @return Whether the paymentPortal field is set.
   */
  @java.lang.Override
  public boolean hasPaymentPortal() {
    return dataCase_ == 1;
  }
  /**
   * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
   * @return The paymentPortal.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal getPaymentPortal() {
    if (dataCase_ == 1) {
       return (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_;
    }
    return com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance();
  }
  /**
   * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortalOrBuilder getPaymentPortalOrBuilder() {
    if (dataCase_ == 1) {
       return (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_;
    }
    return com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance();
  }

  public static final int IVR_PORTAL_FIELD_NUMBER = 2;
  /**
   * <pre>
   * contains info needed for ivr payment
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
   * @return Whether the ivrPortal field is set.
   */
  @java.lang.Override
  public boolean hasIvrPortal() {
    return dataCase_ == 2;
  }
  /**
   * <pre>
   * contains info needed for ivr payment
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
   * @return The ivrPortal.
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal getIvrPortal() {
    if (dataCase_ == 2) {
       return (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_;
    }
    return com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance();
  }
  /**
   * <pre>
   * contains info needed for ivr payment
   * </pre>
   *
   * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortalOrBuilder getIvrPortalOrBuilder() {
    if (dataCase_ == 2) {
       return (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_;
    }
    return com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance();
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
    if (dataCase_ == 1) {
      output.writeMessage(1, (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_);
    }
    if (dataCase_ == 2) {
      output.writeMessage(2, (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_);
    }
    if (dataCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PortalType)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.PortalType other = (com.tcn.cloud.api.api.v1alpha1.integrations.PortalType) obj;

    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 1:
        if (!getPaymentPortal()
            .equals(other.getPaymentPortal())) return false;
        break;
      case 2:
        if (!getIvrPortal()
            .equals(other.getIvrPortal())) return false;
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
    switch (dataCase_) {
      case 1:
        hash = (37 * hash) + PAYMENT_PORTAL_FIELD_NUMBER;
        hash = (53 * hash) + getPaymentPortal().hashCode();
        break;
      case 2:
        hash = (37 * hash) + IVR_PORTAL_FIELD_NUMBER;
        hash = (53 * hash) + getIvrPortal().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.PortalType prototype) {
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
   * Protobuf type {@code api.v1alpha1.integrations.PortalType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.PortalType)
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.class, com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.newBuilder()
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
      if (paymentPortalBuilder_ != null) {
        paymentPortalBuilder_.clear();
      }
      if (ivrPortalBuilder_ != null) {
        ivrPortalBuilder_.clear();
      }
      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_PortalType_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalType getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalType build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PortalType buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.PortalType result = new com.tcn.cloud.api.api.v1alpha1.integrations.PortalType(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.PortalType result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v1alpha1.integrations.PortalType result) {
      result.dataCase_ = dataCase_;
      result.data_ = this.data_;
      if (dataCase_ == 1 &&
          paymentPortalBuilder_ != null) {
        result.data_ = paymentPortalBuilder_.build();
      }
      if (dataCase_ == 2 &&
          ivrPortalBuilder_ != null) {
        result.data_ = ivrPortalBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.PortalType) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.PortalType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.PortalType other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.PortalType.getDefaultInstance()) return this;
      switch (other.getDataCase()) {
        case PAYMENT_PORTAL: {
          mergePaymentPortal(other.getPaymentPortal());
          break;
        }
        case IVR_PORTAL: {
          mergeIvrPortal(other.getIvrPortal());
          break;
        }
        case DATA_NOT_SET: {
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
            case 10: {
              input.readMessage(
                  getPaymentPortalFieldBuilder().getBuilder(),
                  extensionRegistry);
              dataCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getIvrPortalFieldBuilder().getBuilder(),
                  extensionRegistry);
              dataCase_ = 2;
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
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public DataCase
        getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal, com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortalOrBuilder> paymentPortalBuilder_;
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     * @return Whether the paymentPortal field is set.
     */
    @java.lang.Override
    public boolean hasPaymentPortal() {
      return dataCase_ == 1;
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     * @return The paymentPortal.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal getPaymentPortal() {
      if (paymentPortalBuilder_ == null) {
        if (dataCase_ == 1) {
          return (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_;
        }
        return com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance();
      } else {
        if (dataCase_ == 1) {
          return paymentPortalBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    public Builder setPaymentPortal(com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal value) {
      if (paymentPortalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        paymentPortalBuilder_.setMessage(value);
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    public Builder setPaymentPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.Builder builderForValue) {
      if (paymentPortalBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        paymentPortalBuilder_.setMessage(builderForValue.build());
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    public Builder mergePaymentPortal(com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal value) {
      if (paymentPortalBuilder_ == null) {
        if (dataCase_ == 1 &&
            data_ != com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance()) {
          data_ = com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.newBuilder((com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_)
              .mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        if (dataCase_ == 1) {
          paymentPortalBuilder_.mergeFrom(value);
        } else {
          paymentPortalBuilder_.setMessage(value);
        }
      }
      dataCase_ = 1;
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    public Builder clearPaymentPortal() {
      if (paymentPortalBuilder_ == null) {
        if (dataCase_ == 1) {
          dataCase_ = 0;
          data_ = null;
          onChanged();
        }
      } else {
        if (dataCase_ == 1) {
          dataCase_ = 0;
          data_ = null;
        }
        paymentPortalBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.Builder getPaymentPortalBuilder() {
      return getPaymentPortalFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortalOrBuilder getPaymentPortalOrBuilder() {
      if ((dataCase_ == 1) && (paymentPortalBuilder_ != null)) {
        return paymentPortalBuilder_.getMessageOrBuilder();
      } else {
        if (dataCase_ == 1) {
          return (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_;
        }
        return com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance();
      }
    }
    /**
     * <code>.api.v1alpha1.integrations.PaymentPortal payment_portal = 1 [json_name = "paymentPortal"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal, com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortalOrBuilder> 
        getPaymentPortalFieldBuilder() {
      if (paymentPortalBuilder_ == null) {
        if (!(dataCase_ == 1)) {
          data_ = com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.getDefaultInstance();
        }
        paymentPortalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal, com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortalOrBuilder>(
                (com.tcn.cloud.api.api.v1alpha1.integrations.PaymentPortal) data_,
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      dataCase_ = 1;
      onChanged();
      return paymentPortalBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal, com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortalOrBuilder> ivrPortalBuilder_;
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     * @return Whether the ivrPortal field is set.
     */
    @java.lang.Override
    public boolean hasIvrPortal() {
      return dataCase_ == 2;
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     * @return The ivrPortal.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal getIvrPortal() {
      if (ivrPortalBuilder_ == null) {
        if (dataCase_ == 2) {
          return (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_;
        }
        return com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance();
      } else {
        if (dataCase_ == 2) {
          return ivrPortalBuilder_.getMessage();
        }
        return com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    public Builder setIvrPortal(com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal value) {
      if (ivrPortalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        ivrPortalBuilder_.setMessage(value);
      }
      dataCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    public Builder setIvrPortal(
        com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.Builder builderForValue) {
      if (ivrPortalBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        ivrPortalBuilder_.setMessage(builderForValue.build());
      }
      dataCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    public Builder mergeIvrPortal(com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal value) {
      if (ivrPortalBuilder_ == null) {
        if (dataCase_ == 2 &&
            data_ != com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance()) {
          data_ = com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.newBuilder((com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_)
              .mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        if (dataCase_ == 2) {
          ivrPortalBuilder_.mergeFrom(value);
        } else {
          ivrPortalBuilder_.setMessage(value);
        }
      }
      dataCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    public Builder clearIvrPortal() {
      if (ivrPortalBuilder_ == null) {
        if (dataCase_ == 2) {
          dataCase_ = 0;
          data_ = null;
          onChanged();
        }
      } else {
        if (dataCase_ == 2) {
          dataCase_ = 0;
          data_ = null;
        }
        ivrPortalBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.Builder getIvrPortalBuilder() {
      return getIvrPortalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortalOrBuilder getIvrPortalOrBuilder() {
      if ((dataCase_ == 2) && (ivrPortalBuilder_ != null)) {
        return ivrPortalBuilder_.getMessageOrBuilder();
      } else {
        if (dataCase_ == 2) {
          return (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_;
        }
        return com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * contains info needed for ivr payment
     * </pre>
     *
     * <code>.api.v1alpha1.integrations.IVRPortal ivr_portal = 2 [json_name = "ivrPortal"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal, com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortalOrBuilder> 
        getIvrPortalFieldBuilder() {
      if (ivrPortalBuilder_ == null) {
        if (!(dataCase_ == 2)) {
          data_ = com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.getDefaultInstance();
        }
        ivrPortalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal, com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal.Builder, com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortalOrBuilder>(
                (com.tcn.cloud.api.api.v1alpha1.integrations.IVRPortal) data_,
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      dataCase_ = 2;
      onChanged();
      return ivrPortalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.PortalType)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.PortalType)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.PortalType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.PortalType();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.PortalType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PortalType>
      PARSER = new com.google.protobuf.AbstractParser<PortalType>() {
    @java.lang.Override
    public PortalType parsePartialFrom(
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

  public static com.google.protobuf.Parser<PortalType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PortalType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.PortalType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

