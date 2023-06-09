// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/billing/invoice.proto

package com.tcn.cloud.api.api.commons.billing;

/**
 * <pre>
 * Invoice - a collection of products with their total rated amount for
 * a selected month or month-to-date.
 * </pre>
 *
 * Protobuf type {@code api.commons.billing.Invoice}
 */
public final class Invoice extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.billing.Invoice)
    InvoiceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Invoice.newBuilder() to construct.
  private Invoice(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Invoice() {
    items_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Invoice();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_Invoice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_Invoice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.billing.Invoice.class, com.tcn.cloud.api.api.commons.billing.Invoice.Builder.class);
  }

  public static final int ITEMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.commons.billing.InvoiceItem> items_;
  /**
   * <pre>
   * The items forming the invoice, where a product type
   * should show up only once in this list.
   * </pre>
   *
   * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.commons.billing.InvoiceItem> getItemsList() {
    return items_;
  }
  /**
   * <pre>
   * The items forming the invoice, where a product type
   * should show up only once in this list.
   * </pre>
   *
   * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder> 
      getItemsOrBuilderList() {
    return items_;
  }
  /**
   * <pre>
   * The items forming the invoice, where a product type
   * should show up only once in this list.
   * </pre>
   *
   * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
   */
  @java.lang.Override
  public int getItemsCount() {
    return items_.size();
  }
  /**
   * <pre>
   * The items forming the invoice, where a product type
   * should show up only once in this list.
   * </pre>
   *
   * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.billing.InvoiceItem getItems(int index) {
    return items_.get(index);
  }
  /**
   * <pre>
   * The items forming the invoice, where a product type
   * should show up only once in this list.
   * </pre>
   *
   * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder getItemsOrBuilder(
      int index) {
    return items_.get(index);
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
    for (int i = 0; i < items_.size(); i++) {
      output.writeMessage(1, items_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < items_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, items_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.commons.billing.Invoice)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.billing.Invoice other = (com.tcn.cloud.api.api.commons.billing.Invoice) obj;

    if (!getItemsList()
        .equals(other.getItemsList())) return false;
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
    if (getItemsCount() > 0) {
      hash = (37 * hash) + ITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getItemsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.billing.Invoice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.billing.Invoice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.billing.Invoice parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.billing.Invoice prototype) {
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
   * Invoice - a collection of products with their total rated amount for
   * a selected month or month-to-date.
   * </pre>
   *
   * Protobuf type {@code api.commons.billing.Invoice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.billing.Invoice)
      com.tcn.cloud.api.api.commons.billing.InvoiceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_Invoice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_Invoice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.billing.Invoice.class, com.tcn.cloud.api.api.commons.billing.Invoice.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.billing.Invoice.newBuilder()
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
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
      } else {
        items_ = null;
        itemsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.billing.InvoiceProto.internal_static_api_commons_billing_Invoice_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.Invoice getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.billing.Invoice.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.Invoice build() {
      com.tcn.cloud.api.api.commons.billing.Invoice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.billing.Invoice buildPartial() {
      com.tcn.cloud.api.api.commons.billing.Invoice result = new com.tcn.cloud.api.api.commons.billing.Invoice(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.commons.billing.Invoice result) {
      if (itemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          items_ = java.util.Collections.unmodifiableList(items_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.items_ = items_;
      } else {
        result.items_ = itemsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.commons.billing.Invoice result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.tcn.cloud.api.api.commons.billing.Invoice) {
        return mergeFrom((com.tcn.cloud.api.api.commons.billing.Invoice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.billing.Invoice other) {
      if (other == com.tcn.cloud.api.api.commons.billing.Invoice.getDefaultInstance()) return this;
      if (itemsBuilder_ == null) {
        if (!other.items_.isEmpty()) {
          if (items_.isEmpty()) {
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemsIsMutable();
            items_.addAll(other.items_);
          }
          onChanged();
        }
      } else {
        if (!other.items_.isEmpty()) {
          if (itemsBuilder_.isEmpty()) {
            itemsBuilder_.dispose();
            itemsBuilder_ = null;
            items_ = other.items_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemsFieldBuilder() : null;
          } else {
            itemsBuilder_.addAllMessages(other.items_);
          }
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
              com.tcn.cloud.api.api.commons.billing.InvoiceItem m =
                  input.readMessage(
                      com.tcn.cloud.api.api.commons.billing.InvoiceItem.parser(),
                      extensionRegistry);
              if (itemsBuilder_ == null) {
                ensureItemsIsMutable();
                items_.add(m);
              } else {
                itemsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.tcn.cloud.api.api.commons.billing.InvoiceItem> items_ =
      java.util.Collections.emptyList();
    private void ensureItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        items_ = new java.util.ArrayList<com.tcn.cloud.api.api.commons.billing.InvoiceItem>(items_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.billing.InvoiceItem, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder, com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder> itemsBuilder_;

    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.billing.InvoiceItem> getItemsList() {
      if (itemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(items_);
      } else {
        return itemsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public int getItemsCount() {
      if (itemsBuilder_ == null) {
        return items_.size();
      } else {
        return itemsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem getItems(int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);
      } else {
        return itemsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder setItems(
        int index, com.tcn.cloud.api.api.commons.billing.InvoiceItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.set(index, value);
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder setItems(
        int index, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder addItems(com.tcn.cloud.api.api.commons.billing.InvoiceItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder addItems(
        int index, com.tcn.cloud.api.api.commons.billing.InvoiceItem value) {
      if (itemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemsIsMutable();
        items_.add(index, value);
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder addItems(
        com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder addItems(
        int index, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder builderForValue) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder addAllItems(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.commons.billing.InvoiceItem> values) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, items_);
        onChanged();
      } else {
        itemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder clearItems() {
      if (itemsBuilder_ == null) {
        items_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public Builder removeItems(int index) {
      if (itemsBuilder_ == null) {
        ensureItemsIsMutable();
        items_.remove(index);
        onChanged();
      } else {
        itemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder getItemsBuilder(
        int index) {
      return getItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder getItemsOrBuilder(
        int index) {
      if (itemsBuilder_ == null) {
        return items_.get(index);  } else {
        return itemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder> 
         getItemsOrBuilderList() {
      if (itemsBuilder_ != null) {
        return itemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(items_);
      }
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder addItemsBuilder() {
      return getItemsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.commons.billing.InvoiceItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder addItemsBuilder(
        int index) {
      return getItemsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.commons.billing.InvoiceItem.getDefaultInstance());
    }
    /**
     * <pre>
     * The items forming the invoice, where a product type
     * should show up only once in this list.
     * </pre>
     *
     * <code>repeated .api.commons.billing.InvoiceItem items = 1 [json_name = "items"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder> 
         getItemsBuilderList() {
      return getItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.commons.billing.InvoiceItem, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder, com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder> 
        getItemsFieldBuilder() {
      if (itemsBuilder_ == null) {
        itemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.commons.billing.InvoiceItem, com.tcn.cloud.api.api.commons.billing.InvoiceItem.Builder, com.tcn.cloud.api.api.commons.billing.InvoiceItemOrBuilder>(
                items_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        items_ = null;
      }
      return itemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.commons.billing.Invoice)
  }

  // @@protoc_insertion_point(class_scope:api.commons.billing.Invoice)
  private static final com.tcn.cloud.api.api.commons.billing.Invoice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.billing.Invoice();
  }

  public static com.tcn.cloud.api.api.commons.billing.Invoice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Invoice>
      PARSER = new com.google.protobuf.AbstractParser<Invoice>() {
    @java.lang.Override
    public Invoice parsePartialFrom(
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

  public static com.google.protobuf.Parser<Invoice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Invoice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.billing.Invoice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

