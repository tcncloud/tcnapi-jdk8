// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/billing/invoice.proto

package com.tcn.cloud.api.api.commons.billing;

/**
 * <pre>
 * InvoiceItem -
 * </pre>
 *
 * Protobuf type {@code api.commons.billing.InvoiceItem}
 */
public final class InvoiceItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.billing.InvoiceItem)
    InvoiceItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InvoiceItem.newBuilder() to construct.
  private InvoiceItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvoiceItem() {
    product_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InvoiceItem();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_InvoiceItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_InvoiceItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.billing.InvoiceItem.class, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder.class);
  }

  public static final int INVOICE_ITEM_SID_FIELD_NUMBER = 1;
  private long invoiceItemSid_ = 0L;
  /**
   * <pre>
   * The unique identifier for this invoice item
   * </pre>
   *
   * <code>int64 invoice_item_sid = 1 [json_name = "invoiceItemSid"];</code>
   * @return The invoiceItemSid.
   */
  @java.lang.Override
  public long getInvoiceItemSid() {
    return invoiceItemSid_;
  }

  public static final int PRODUCT_FIELD_NUMBER = 2;
  private int product_ = 0;
  /**
   * <pre>
   * The product this item contains the total for
   * </pre>
   *
   * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
   * @return The enum numeric value on the wire for product.
   */
  @java.lang.Override public int getProductValue() {
    return product_;
  }
  /**
   * <pre>
   * The product this item contains the total for
   * </pre>
   *
   * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
   * @return The product.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.billing.Product getProduct() {
    com.tcn.cloud.api.api.commons.billing.Product result = com.tcn.cloud.api.api.commons.billing.Product.forNumber(product_);
    return result == null ? com.tcn.cloud.api.api.commons.billing.Product.UNRECOGNIZED : result;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private double amount_ = 0D;
  /**
   * <pre>
   * The total amount billed for the product
   * </pre>
   *
   * <code>double amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public double getAmount() {
    return amount_;
  }

  public static final int DATE_CREATED_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp dateCreated_;
  /**
   * <pre>
   * time the invoice item was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
   * @return Whether the dateCreated field is set.
   */
  @java.lang.Override
  public boolean hasDateCreated() {
    return dateCreated_ != null;
  }
  /**
   * <pre>
   * time the invoice item was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
   * @return The dateCreated.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDateCreated() {
    return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
  }
  /**
   * <pre>
   * time the invoice item was created
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder() {
    return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
  }

  public static final int DATE_MODIFIED_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp dateModified_;
  /**
   * <pre>
   * time the invoice item was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
   * @return Whether the dateModified field is set.
   */
  @java.lang.Override
  public boolean hasDateModified() {
    return dateModified_ != null;
  }
  /**
   * <pre>
   * time the invoice item was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
   * @return The dateModified.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDateModified() {
    return dateModified_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateModified_;
  }
  /**
   * <pre>
   * time the invoice item was last modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder() {
    return dateModified_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateModified_;
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
    if (invoiceItemSid_ != 0L) {
      output.writeInt64(1, invoiceItemSid_);
    }
    if (product_ != com.tcn.cloud.api.api.commons.billing.Product.PRODUCT_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, product_);
    }
    if (java.lang.Double.doubleToRawLongBits(amount_) != 0) {
      output.writeDouble(3, amount_);
    }
    if (dateCreated_ != null) {
      output.writeMessage(4, getDateCreated());
    }
    if (dateModified_ != null) {
      output.writeMessage(5, getDateModified());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (invoiceItemSid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, invoiceItemSid_);
    }
    if (product_ != com.tcn.cloud.api.api.commons.billing.Product.PRODUCT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, product_);
    }
    if (java.lang.Double.doubleToRawLongBits(amount_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, amount_);
    }
    if (dateCreated_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getDateCreated());
    }
    if (dateModified_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDateModified());
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.billing.InvoiceItem)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.billing.InvoiceItem other = (com.tcn.cloud.api.api.commons.billing.InvoiceItem) obj;

    if (getInvoiceItemSid()
        != other.getInvoiceItemSid()) return false;
    if (product_ != other.product_) return false;
    if (java.lang.Double.doubleToLongBits(getAmount())
        != java.lang.Double.doubleToLongBits(
            other.getAmount())) return false;
    if (hasDateCreated() != other.hasDateCreated()) return false;
    if (hasDateCreated()) {
      if (!getDateCreated()
          .equals(other.getDateCreated())) return false;
    }
    if (hasDateModified() != other.hasDateModified()) return false;
    if (hasDateModified()) {
      if (!getDateModified()
          .equals(other.getDateModified())) return false;
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
    hash = (37 * hash) + INVOICE_ITEM_SID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getInvoiceItemSid());
    hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
    hash = (53 * hash) + product_;
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAmount()));
    if (hasDateCreated()) {
      hash = (37 * hash) + DATE_CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getDateCreated().hashCode();
    }
    if (hasDateModified()) {
      hash = (37 * hash) + DATE_MODIFIED_FIELD_NUMBER;
      hash = (53 * hash) + getDateModified().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.billing.InvoiceItem prototype) {
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
   * InvoiceItem -
   * </pre>
   *
   * Protobuf type {@code api.commons.billing.InvoiceItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.billing.InvoiceItem)
      com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_InvoiceItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_InvoiceItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.billing.InvoiceItem.class, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.billing.InvoiceItem.newBuilder()
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
      invoiceItemSid_ = 0L;
      product_ = 0;
      amount_ = 0D;
      dateCreated_ = null;
      if (dateCreatedBuilder_ != null) {
        dateCreatedBuilder_.dispose();
        dateCreatedBuilder_ = null;
      }
      dateModified_ = null;
      if (dateModifiedBuilder_ != null) {
        dateModifiedBuilder_.dispose();
        dateModifiedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_InvoiceItem_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem build() {
      com.tcn.cloud.api.api.commons.billing.InvoiceItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem buildPartial() {
      com.tcn.cloud.api.api.commons.billing.InvoiceItem result = new com.tcn.cloud.api.api.commons.billing.InvoiceItem(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.billing.InvoiceItem result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.invoiceItemSid_ = invoiceItemSid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.product_ = product_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dateCreated_ = dateCreatedBuilder_ == null
            ? dateCreated_
            : dateCreatedBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.dateModified_ = dateModifiedBuilder_ == null
            ? dateModified_
            : dateModifiedBuilder_.build();
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
      if (other instanceof com.tcn.cloud.api.api.commons.billing.InvoiceItem) {
        return mergeFrom((com.tcn.cloud.api.api.commons.billing.InvoiceItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.billing.InvoiceItem other) {
      if (other == com.tcn.cloud.api.api.commons.billing.InvoiceItem.getDefaultInstance()) return this;
      if (other.getInvoiceItemSid() != 0L) {
        setInvoiceItemSid(other.getInvoiceItemSid());
      }
      if (other.product_ != 0) {
        setProductValue(other.getProductValue());
      }
      if (other.getAmount() != 0D) {
        setAmount(other.getAmount());
      }
      if (other.hasDateCreated()) {
        mergeDateCreated(other.getDateCreated());
      }
      if (other.hasDateModified()) {
        mergeDateModified(other.getDateModified());
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
              invoiceItemSid_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              product_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 25: {
              amount_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 34: {
              input.readMessage(
                  getDateCreatedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getDateModifiedFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private long invoiceItemSid_ ;
    /**
     * <pre>
     * The unique identifier for this invoice item
     * </pre>
     *
     * <code>int64 invoice_item_sid = 1 [json_name = "invoiceItemSid"];</code>
     * @return The invoiceItemSid.
     */
    @java.lang.Override
    public long getInvoiceItemSid() {
      return invoiceItemSid_;
    }
    /**
     * <pre>
     * The unique identifier for this invoice item
     * </pre>
     *
     * <code>int64 invoice_item_sid = 1 [json_name = "invoiceItemSid"];</code>
     * @param value The invoiceItemSid to set.
     * @return This builder for chaining.
     */
    public Builder setInvoiceItemSid(long value) {

      invoiceItemSid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique identifier for this invoice item
     * </pre>
     *
     * <code>int64 invoice_item_sid = 1 [json_name = "invoiceItemSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearInvoiceItemSid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      invoiceItemSid_ = 0L;
      onChanged();
      return this;
    }

    private int product_ = 0;
    /**
     * <pre>
     * The product this item contains the total for
     * </pre>
     *
     * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
     * @return The enum numeric value on the wire for product.
     */
    @java.lang.Override public int getProductValue() {
      return product_;
    }
    /**
     * <pre>
     * The product this item contains the total for
     * </pre>
     *
     * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
     * @param value The enum numeric value on the wire for product to set.
     * @return This builder for chaining.
     */
    public Builder setProductValue(int value) {
      product_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The product this item contains the total for
     * </pre>
     *
     * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
     * @return The product.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.Product getProduct() {
      com.tcn.cloud.api.api.commons.billing.Product result = com.tcn.cloud.api.api.commons.billing.Product.forNumber(product_);
      return result == null ? com.tcn.cloud.api.api.commons.billing.Product.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The product this item contains the total for
     * </pre>
     *
     * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
     * @param value The product to set.
     * @return This builder for chaining.
     */
    public Builder setProduct(com.tcn.cloud.api.api.commons.billing.Product value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      product_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The product this item contains the total for
     * </pre>
     *
     * <code>.api.commons.billing.Product product = 2 [json_name = "product"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProduct() {
      bitField0_ = (bitField0_ & ~0x00000002);
      product_ = 0;
      onChanged();
      return this;
    }

    private double amount_ ;
    /**
     * <pre>
     * The total amount billed for the product
     * </pre>
     *
     * <code>double amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public double getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * The total amount billed for the product
     * </pre>
     *
     * <code>double amount = 3 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(double value) {

      amount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total amount billed for the product
     * </pre>
     *
     * <code>double amount = 3 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      amount_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp dateCreated_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateCreatedBuilder_;
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     * @return Whether the dateCreated field is set.
     */
    public boolean hasDateCreated() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     * @return The dateCreated.
     */
    public com.google.protobuf.Timestamp getDateCreated() {
      if (dateCreatedBuilder_ == null) {
        return dateCreated_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
      } else {
        return dateCreatedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    public Builder setDateCreated(com.google.protobuf.Timestamp value) {
      if (dateCreatedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateCreated_ = value;
      } else {
        dateCreatedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    public Builder setDateCreated(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateCreatedBuilder_ == null) {
        dateCreated_ = builderForValue.build();
      } else {
        dateCreatedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    public Builder mergeDateCreated(com.google.protobuf.Timestamp value) {
      if (dateCreatedBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          dateCreated_ != null &&
          dateCreated_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDateCreatedBuilder().mergeFrom(value);
        } else {
          dateCreated_ = value;
        }
      } else {
        dateCreatedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    public Builder clearDateCreated() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dateCreated_ = null;
      if (dateCreatedBuilder_ != null) {
        dateCreatedBuilder_.dispose();
        dateCreatedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateCreatedBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getDateCreatedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateCreatedOrBuilder() {
      if (dateCreatedBuilder_ != null) {
        return dateCreatedBuilder_.getMessageOrBuilder();
      } else {
        return dateCreated_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : dateCreated_;
      }
    }
    /**
     * <pre>
     * time the invoice item was created
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_created = 4 [json_name = "dateCreated"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDateCreatedFieldBuilder() {
      if (dateCreatedBuilder_ == null) {
        dateCreatedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDateCreated(),
                getParentForChildren(),
                isClean());
        dateCreated_ = null;
      }
      return dateCreatedBuilder_;
    }

    private com.google.protobuf.Timestamp dateModified_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateModifiedBuilder_;
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     * @return Whether the dateModified field is set.
     */
    public boolean hasDateModified() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     * @return The dateModified.
     */
    public com.google.protobuf.Timestamp getDateModified() {
      if (dateModifiedBuilder_ == null) {
        return dateModified_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateModified_;
      } else {
        return dateModifiedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    public Builder setDateModified(com.google.protobuf.Timestamp value) {
      if (dateModifiedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateModified_ = value;
      } else {
        dateModifiedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    public Builder setDateModified(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateModifiedBuilder_ == null) {
        dateModified_ = builderForValue.build();
      } else {
        dateModifiedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    public Builder mergeDateModified(com.google.protobuf.Timestamp value) {
      if (dateModifiedBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          dateModified_ != null &&
          dateModified_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getDateModifiedBuilder().mergeFrom(value);
        } else {
          dateModified_ = value;
        }
      } else {
        dateModifiedBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    public Builder clearDateModified() {
      bitField0_ = (bitField0_ & ~0x00000010);
      dateModified_ = null;
      if (dateModifiedBuilder_ != null) {
        dateModifiedBuilder_.dispose();
        dateModifiedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateModifiedBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getDateModifiedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateModifiedOrBuilder() {
      if (dateModifiedBuilder_ != null) {
        return dateModifiedBuilder_.getMessageOrBuilder();
      } else {
        return dateModified_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : dateModified_;
      }
    }
    /**
     * <pre>
     * time the invoice item was last modified
     * </pre>
     *
     * <code>.google.protobuf.Timestamp date_modified = 5 [json_name = "dateModified"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDateModifiedFieldBuilder() {
      if (dateModifiedBuilder_ == null) {
        dateModifiedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDateModified(),
                getParentForChildren(),
                isClean());
        dateModified_ = null;
      }
      return dateModifiedBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.billing.InvoiceItem)
  }

  // @@protoc_insertion_point(class_scope:api.commons.billing.InvoiceItem)
  private static final com.tcn.cloud.api.api.commons.billing.InvoiceItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.billing.InvoiceItem();
  }

  public static com.tcn.cloud.api.api.commons.billing.InvoiceItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvoiceItem>
      PARSER = new com.google.protobuf.AbstractParser<InvoiceItem>() {
    @java.lang.Override
    public InvoiceItem parsePartialFrom(
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

  public static com.google.protobuf.Parser<InvoiceItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvoiceItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.billing.InvoiceItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

