// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/billing/v1alpha3/invoice.proto

package com.tcn.cloud.api.services.billing.v1alpha3;

/**
 * Protobuf type {@code services.billing.v1alpha3.ExportInvoiceResponse}
 */
public final class ExportInvoiceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.billing.v1alpha3.ExportInvoiceResponse)
    ExportInvoiceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportInvoiceResponse.newBuilder() to construct.
  private ExportInvoiceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportInvoiceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportInvoiceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.internal_static_services_billing_v1alpha3_ExportInvoiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.internal_static_services_billing_v1alpha3_ExportInvoiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.class, com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.Builder.class);
  }

  public static final int INVOICE_FIELD_NUMBER = 1;
  private com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice invoice_;
  /**
   * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
   * @return Whether the invoice field is set.
   */
  @java.lang.Override
  public boolean hasInvoice() {
    return invoice_ != null;
  }
  /**
   * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
   * @return The invoice.
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice getInvoice() {
    return invoice_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.getDefaultInstance() : invoice_;
  }
  /**
   * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceOrBuilder getInvoiceOrBuilder() {
    return invoice_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.getDefaultInstance() : invoice_;
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
    if (invoice_ != null) {
      output.writeMessage(1, getInvoice());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (invoice_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInvoice());
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
    if (!(obj instanceof com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse other = (com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse) obj;

    if (hasInvoice() != other.hasInvoice()) return false;
    if (hasInvoice()) {
      if (!getInvoice()
          .equals(other.getInvoice())) return false;
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
    if (hasInvoice()) {
      hash = (37 * hash) + INVOICE_FIELD_NUMBER;
      hash = (53 * hash) + getInvoice().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse prototype) {
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
   * Protobuf type {@code services.billing.v1alpha3.ExportInvoiceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.billing.v1alpha3.ExportInvoiceResponse)
      com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.internal_static_services_billing_v1alpha3_ExportInvoiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.internal_static_services_billing_v1alpha3_ExportInvoiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.class, com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.Builder.class);
    }

    // Construct using com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.newBuilder()
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
      invoice_ = null;
      if (invoiceBuilder_ != null) {
        invoiceBuilder_.dispose();
        invoiceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.InvoiceProto.internal_static_services_billing_v1alpha3_ExportInvoiceResponse_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse getDefaultInstanceForType() {
      return com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse build() {
      com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse buildPartial() {
      com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse result = new com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.invoice_ = invoiceBuilder_ == null
            ? invoice_
            : invoiceBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse) {
        return mergeFrom((com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse other) {
      if (other == com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse.getDefaultInstance()) return this;
      if (other.hasInvoice()) {
        mergeInvoice(other.getInvoice());
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
                  getInvoiceFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice invoice_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice, com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceOrBuilder> invoiceBuilder_;
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     * @return Whether the invoice field is set.
     */
    public boolean hasInvoice() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     * @return The invoice.
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice getInvoice() {
      if (invoiceBuilder_ == null) {
        return invoice_ == null ? com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.getDefaultInstance() : invoice_;
      } else {
        return invoiceBuilder_.getMessage();
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    public Builder setInvoice(com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice value) {
      if (invoiceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        invoice_ = value;
      } else {
        invoiceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    public Builder setInvoice(
        com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.Builder builderForValue) {
      if (invoiceBuilder_ == null) {
        invoice_ = builderForValue.build();
      } else {
        invoiceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    public Builder mergeInvoice(com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice value) {
      if (invoiceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          invoice_ != null &&
          invoice_ != com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.getDefaultInstance()) {
          getInvoiceBuilder().mergeFrom(value);
        } else {
          invoice_ = value;
        }
      } else {
        invoiceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    public Builder clearInvoice() {
      bitField0_ = (bitField0_ & ~0x00000001);
      invoice_ = null;
      if (invoiceBuilder_ != null) {
        invoiceBuilder_.dispose();
        invoiceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.Builder getInvoiceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInvoiceFieldBuilder().getBuilder();
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    public com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceOrBuilder getInvoiceOrBuilder() {
      if (invoiceBuilder_ != null) {
        return invoiceBuilder_.getMessageOrBuilder();
      } else {
        return invoice_ == null ?
            com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.getDefaultInstance() : invoice_;
      }
    }
    /**
     * <code>.services.billing.entities.v1alpha3.Invoice invoice = 1 [json_name = "invoice"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice, com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceOrBuilder> 
        getInvoiceFieldBuilder() {
      if (invoiceBuilder_ == null) {
        invoiceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice, com.tcn.cloud.api.services.billing.entities.v1alpha3.Invoice.Builder, com.tcn.cloud.api.services.billing.entities.v1alpha3.InvoiceOrBuilder>(
                getInvoice(),
                getParentForChildren(),
                isClean());
        invoice_ = null;
      }
      return invoiceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:services.billing.v1alpha3.ExportInvoiceResponse)
  }

  // @@protoc_insertion_point(class_scope:services.billing.v1alpha3.ExportInvoiceResponse)
  private static final com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse();
  }

  public static com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportInvoiceResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExportInvoiceResponse>() {
    @java.lang.Override
    public ExportInvoiceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportInvoiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportInvoiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.services.billing.v1alpha3.ExportInvoiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

