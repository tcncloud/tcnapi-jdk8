// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * <pre>
 * Response message for the ListWhiteListPhoneBooks RPC
 * </pre>
 *
 * Protobuf type {@code api.v0alpha.ListWhiteListPhoneBooksRes}
 */
public final class ListWhiteListPhoneBooksRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.ListWhiteListPhoneBooksRes)
    ListWhiteListPhoneBooksResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListWhiteListPhoneBooksRes.newBuilder() to construct.
  private ListWhiteListPhoneBooksRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListWhiteListPhoneBooksRes() {
    whiteListPhoneBooks_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListWhiteListPhoneBooksRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListWhiteListPhoneBooksRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListWhiteListPhoneBooksRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.class, com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.Builder.class);
  }

  public static final int WHITE_LIST_PHONE_BOOKS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBook> whiteListPhoneBooks_;
  /**
   * <pre>
   * The list of phone books
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBook> getWhiteListPhoneBooksList() {
    return whiteListPhoneBooks_;
  }
  /**
   * <pre>
   * The list of phone books
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder> 
      getWhiteListPhoneBooksOrBuilderList() {
    return whiteListPhoneBooks_;
  }
  /**
   * <pre>
   * The list of phone books
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
   */
  @java.lang.Override
  public int getWhiteListPhoneBooksCount() {
    return whiteListPhoneBooks_.size();
  }
  /**
   * <pre>
   * The list of phone books
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBook getWhiteListPhoneBooks(int index) {
    return whiteListPhoneBooks_.get(index);
  }
  /**
   * <pre>
   * The list of phone books
   * </pre>
   *
   * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder getWhiteListPhoneBooksOrBuilder(
      int index) {
    return whiteListPhoneBooks_.get(index);
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
    for (int i = 0; i < whiteListPhoneBooks_.size(); i++) {
      output.writeMessage(1, whiteListPhoneBooks_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < whiteListPhoneBooks_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, whiteListPhoneBooks_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes other = (com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes) obj;

    if (!getWhiteListPhoneBooksList()
        .equals(other.getWhiteListPhoneBooksList())) return false;
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
    if (getWhiteListPhoneBooksCount() > 0) {
      hash = (37 * hash) + WHITE_LIST_PHONE_BOOKS_FIELD_NUMBER;
      hash = (53 * hash) + getWhiteListPhoneBooksList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes prototype) {
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
   * Response message for the ListWhiteListPhoneBooks RPC
   * </pre>
   *
   * Protobuf type {@code api.v0alpha.ListWhiteListPhoneBooksRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.ListWhiteListPhoneBooksRes)
      com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListWhiteListPhoneBooksRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListWhiteListPhoneBooksRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.class, com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.newBuilder()
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
      if (whiteListPhoneBooksBuilder_ == null) {
        whiteListPhoneBooks_ = java.util.Collections.emptyList();
      } else {
        whiteListPhoneBooks_ = null;
        whiteListPhoneBooksBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_ListWhiteListPhoneBooksRes_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes build() {
      com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes buildPartial() {
      com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes result = new com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes result) {
      if (whiteListPhoneBooksBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          whiteListPhoneBooks_ = java.util.Collections.unmodifiableList(whiteListPhoneBooks_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.whiteListPhoneBooks_ = whiteListPhoneBooks_;
      } else {
        result.whiteListPhoneBooks_ = whiteListPhoneBooksBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes other) {
      if (other == com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes.getDefaultInstance()) return this;
      if (whiteListPhoneBooksBuilder_ == null) {
        if (!other.whiteListPhoneBooks_.isEmpty()) {
          if (whiteListPhoneBooks_.isEmpty()) {
            whiteListPhoneBooks_ = other.whiteListPhoneBooks_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureWhiteListPhoneBooksIsMutable();
            whiteListPhoneBooks_.addAll(other.whiteListPhoneBooks_);
          }
          onChanged();
        }
      } else {
        if (!other.whiteListPhoneBooks_.isEmpty()) {
          if (whiteListPhoneBooksBuilder_.isEmpty()) {
            whiteListPhoneBooksBuilder_.dispose();
            whiteListPhoneBooksBuilder_ = null;
            whiteListPhoneBooks_ = other.whiteListPhoneBooks_;
            bitField0_ = (bitField0_ & ~0x00000001);
            whiteListPhoneBooksBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWhiteListPhoneBooksFieldBuilder() : null;
          } else {
            whiteListPhoneBooksBuilder_.addAllMessages(other.whiteListPhoneBooks_);
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
              com.tcn.cloud.api.api.v0alpha.PhoneBook m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v0alpha.PhoneBook.parser(),
                      extensionRegistry);
              if (whiteListPhoneBooksBuilder_ == null) {
                ensureWhiteListPhoneBooksIsMutable();
                whiteListPhoneBooks_.add(m);
              } else {
                whiteListPhoneBooksBuilder_.addMessage(m);
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

    private java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBook> whiteListPhoneBooks_ =
      java.util.Collections.emptyList();
    private void ensureWhiteListPhoneBooksIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        whiteListPhoneBooks_ = new java.util.ArrayList<com.tcn.cloud.api.api.v0alpha.PhoneBook>(whiteListPhoneBooks_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhoneBook, com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder> whiteListPhoneBooksBuilder_;

    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBook> getWhiteListPhoneBooksList() {
      if (whiteListPhoneBooksBuilder_ == null) {
        return java.util.Collections.unmodifiableList(whiteListPhoneBooks_);
      } else {
        return whiteListPhoneBooksBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public int getWhiteListPhoneBooksCount() {
      if (whiteListPhoneBooksBuilder_ == null) {
        return whiteListPhoneBooks_.size();
      } else {
        return whiteListPhoneBooksBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBook getWhiteListPhoneBooks(int index) {
      if (whiteListPhoneBooksBuilder_ == null) {
        return whiteListPhoneBooks_.get(index);
      } else {
        return whiteListPhoneBooksBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder setWhiteListPhoneBooks(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBook value) {
      if (whiteListPhoneBooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.set(index, value);
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder setWhiteListPhoneBooks(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder builderForValue) {
      if (whiteListPhoneBooksBuilder_ == null) {
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.set(index, builderForValue.build());
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder addWhiteListPhoneBooks(com.tcn.cloud.api.api.v0alpha.PhoneBook value) {
      if (whiteListPhoneBooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.add(value);
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder addWhiteListPhoneBooks(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBook value) {
      if (whiteListPhoneBooksBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.add(index, value);
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder addWhiteListPhoneBooks(
        com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder builderForValue) {
      if (whiteListPhoneBooksBuilder_ == null) {
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.add(builderForValue.build());
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder addWhiteListPhoneBooks(
        int index, com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder builderForValue) {
      if (whiteListPhoneBooksBuilder_ == null) {
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.add(index, builderForValue.build());
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder addAllWhiteListPhoneBooks(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v0alpha.PhoneBook> values) {
      if (whiteListPhoneBooksBuilder_ == null) {
        ensureWhiteListPhoneBooksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, whiteListPhoneBooks_);
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder clearWhiteListPhoneBooks() {
      if (whiteListPhoneBooksBuilder_ == null) {
        whiteListPhoneBooks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public Builder removeWhiteListPhoneBooks(int index) {
      if (whiteListPhoneBooksBuilder_ == null) {
        ensureWhiteListPhoneBooksIsMutable();
        whiteListPhoneBooks_.remove(index);
        onChanged();
      } else {
        whiteListPhoneBooksBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder getWhiteListPhoneBooksBuilder(
        int index) {
      return getWhiteListPhoneBooksFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder getWhiteListPhoneBooksOrBuilder(
        int index) {
      if (whiteListPhoneBooksBuilder_ == null) {
        return whiteListPhoneBooks_.get(index);  } else {
        return whiteListPhoneBooksBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder> 
         getWhiteListPhoneBooksOrBuilderList() {
      if (whiteListPhoneBooksBuilder_ != null) {
        return whiteListPhoneBooksBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(whiteListPhoneBooks_);
      }
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder addWhiteListPhoneBooksBuilder() {
      return getWhiteListPhoneBooksFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v0alpha.PhoneBook.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder addWhiteListPhoneBooksBuilder(
        int index) {
      return getWhiteListPhoneBooksFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v0alpha.PhoneBook.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of phone books
     * </pre>
     *
     * <code>repeated .api.v0alpha.PhoneBook white_list_phone_books = 1 [json_name = "whiteListPhoneBooks"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder> 
         getWhiteListPhoneBooksBuilderList() {
      return getWhiteListPhoneBooksFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v0alpha.PhoneBook, com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder> 
        getWhiteListPhoneBooksFieldBuilder() {
      if (whiteListPhoneBooksBuilder_ == null) {
        whiteListPhoneBooksBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v0alpha.PhoneBook, com.tcn.cloud.api.api.v0alpha.PhoneBook.Builder, com.tcn.cloud.api.api.v0alpha.PhoneBookOrBuilder>(
                whiteListPhoneBooks_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        whiteListPhoneBooks_ = null;
      }
      return whiteListPhoneBooksBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.ListWhiteListPhoneBooksRes)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.ListWhiteListPhoneBooksRes)
  private static final com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes();
  }

  public static com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListWhiteListPhoneBooksRes>
      PARSER = new com.google.protobuf.AbstractParser<ListWhiteListPhoneBooksRes>() {
    @java.lang.Override
    public ListWhiteListPhoneBooksRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListWhiteListPhoneBooksRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListWhiteListPhoneBooksRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.ListWhiteListPhoneBooksRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

