// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.Search}
 */
public final class Search extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.Search)
    SearchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Search.newBuilder() to construct.
  private Search(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Search() {
    term_ = "";
    value_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Search();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_Search_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_Search_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.Search.class, com.tcn.cloud.api.api.v0alpha.Search.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object term_ = "";
  /**
   * <pre>
   * The term we are searching for
   * </pre>
   *
   * <code>string term = 1 [json_name = "term"];</code>
   * @return The term.
   */
  @java.lang.Override
  public java.lang.String getTerm() {
    java.lang.Object ref = term_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      term_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The term we are searching for
   * </pre>
   *
   * <code>string term = 1 [json_name = "term"];</code>
   * @return The bytes for term.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTermBytes() {
    java.lang.Object ref = term_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      term_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FUZZINESS_FIELD_NUMBER = 2;
  private long fuzziness_ = 0L;
  /**
   * <pre>
   * Sets the amount of fuzziness allowed
   * in matches
   * Example:
   * Searching "term" would also match "temr"
   * Not compatible with a substring match
   * </pre>
   *
   * <code>int64 fuzziness = 2 [json_name = "fuzziness", deprecated = true];</code>
   * @deprecated api.v0alpha.Search.fuzziness is deprecated.
   *     See api/v0alpha/lms.proto;l=2584
   * @return The fuzziness.
   */
  @java.lang.Override
  @java.lang.Deprecated public long getFuzziness() {
    return fuzziness_;
  }

  public static final int SUBSTRING_FIELD_NUMBER = 3;
  private boolean substring_ = false;
  /**
   * <pre>
   * Checks if a subset of the content matches
   * Example:
   * Searching "but" would also match "rebuttal"
   * Not compatible with fuzziness (will override fuzziness)
   * </pre>
   *
   * <code>bool substring = 3 [json_name = "substring"];</code>
   * @return The substring.
   */
  @java.lang.Override
  public boolean getSubstring() {
    return substring_;
  }

  public static final int NEGATE_FIELD_NUMBER = 4;
  private boolean negate_ = false;
  /**
   * <pre>
   * Specifies if the search should be negated
   * Example:
   * Searching "term" would match everything NOT including "term"
   * </pre>
   *
   * <code>bool negate = 4 [json_name = "negate"];</code>
   * @return The negate.
   */
  @java.lang.Override
  public boolean getNegate() {
    return negate_;
  }

  public static final int CASE_SENSITIVE_FIELD_NUMBER = 5;
  private boolean caseSensitive_ = false;
  /**
   * <pre>
   * Specifies if we should be case sensitive
   * </pre>
   *
   * <code>bool case_sensitive = 5 [json_name = "caseSensitive", deprecated = true];</code>
   * @deprecated api.v0alpha.Search.case_sensitive is deprecated.
   *     See api/v0alpha/lms.proto;l=2595
   * @return The caseSensitive.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean getCaseSensitive() {
    return caseSensitive_;
  }

  public static final int VALUE_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object value_ = "";
  /**
   * <pre>
   * the value of the term we are searching for
   * </pre>
   *
   * <code>string value = 6 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the value of the term we are searching for
   * </pre>
   *
   * <code>string value = 6 [json_name = "value"];</code>
   * @return The bytes for value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(term_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, term_);
    }
    if (fuzziness_ != 0L) {
      output.writeInt64(2, fuzziness_);
    }
    if (substring_ != false) {
      output.writeBool(3, substring_);
    }
    if (negate_ != false) {
      output.writeBool(4, negate_);
    }
    if (caseSensitive_ != false) {
      output.writeBool(5, caseSensitive_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(term_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, term_);
    }
    if (fuzziness_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fuzziness_);
    }
    if (substring_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, substring_);
    }
    if (negate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, negate_);
    }
    if (caseSensitive_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, caseSensitive_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(value_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, value_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.Search)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.Search other = (com.tcn.cloud.api.api.v0alpha.Search) obj;

    if (!getTerm()
        .equals(other.getTerm())) return false;
    if (getFuzziness()
        != other.getFuzziness()) return false;
    if (getSubstring()
        != other.getSubstring()) return false;
    if (getNegate()
        != other.getNegate()) return false;
    if (getCaseSensitive()
        != other.getCaseSensitive()) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm().hashCode();
    hash = (37 * hash) + FUZZINESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFuzziness());
    hash = (37 * hash) + SUBSTRING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSubstring());
    hash = (37 * hash) + NEGATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNegate());
    hash = (37 * hash) + CASE_SENSITIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCaseSensitive());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.Search parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.Search parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.Search parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.Search prototype) {
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
   * Protobuf type {@code api.v0alpha.Search}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.Search)
      com.tcn.cloud.api.api.v0alpha.SearchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_Search_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_Search_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.Search.class, com.tcn.cloud.api.api.v0alpha.Search.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.Search.newBuilder()
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
      term_ = "";
      fuzziness_ = 0L;
      substring_ = false;
      negate_ = false;
      caseSensitive_ = false;
      value_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v0alpha.LmsProto.internal_static_api_v0alpha_Search_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Search getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.Search.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Search build() {
      com.tcn.cloud.api.api.v0alpha.Search result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.Search buildPartial() {
      com.tcn.cloud.api.api.v0alpha.Search result = new com.tcn.cloud.api.api.v0alpha.Search(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v0alpha.Search result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.term_ = term_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fuzziness_ = fuzziness_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.substring_ = substring_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.negate_ = negate_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.caseSensitive_ = caseSensitive_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.value_ = value_;
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
      if (other instanceof com.tcn.cloud.api.api.v0alpha.Search) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.Search)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.Search other) {
      if (other == com.tcn.cloud.api.api.v0alpha.Search.getDefaultInstance()) return this;
      if (!other.getTerm().isEmpty()) {
        term_ = other.term_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getFuzziness() != 0L) {
        setFuzziness(other.getFuzziness());
      }
      if (other.getSubstring() != false) {
        setSubstring(other.getSubstring());
      }
      if (other.getNegate() != false) {
        setNegate(other.getNegate());
      }
      if (other.getCaseSensitive() != false) {
        setCaseSensitive(other.getCaseSensitive());
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        bitField0_ |= 0x00000020;
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
              term_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              fuzziness_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              substring_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              negate_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              caseSensitive_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              value_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
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
    private int bitField0_;

    private java.lang.Object term_ = "";
    /**
     * <pre>
     * The term we are searching for
     * </pre>
     *
     * <code>string term = 1 [json_name = "term"];</code>
     * @return The term.
     */
    public java.lang.String getTerm() {
      java.lang.Object ref = term_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        term_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The term we are searching for
     * </pre>
     *
     * <code>string term = 1 [json_name = "term"];</code>
     * @return The bytes for term.
     */
    public com.google.protobuf.ByteString
        getTermBytes() {
      java.lang.Object ref = term_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        term_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The term we are searching for
     * </pre>
     *
     * <code>string term = 1 [json_name = "term"];</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      term_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The term we are searching for
     * </pre>
     *
     * <code>string term = 1 [json_name = "term"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      term_ = getDefaultInstance().getTerm();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The term we are searching for
     * </pre>
     *
     * <code>string term = 1 [json_name = "term"];</code>
     * @param value The bytes for term to set.
     * @return This builder for chaining.
     */
    public Builder setTermBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      term_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long fuzziness_ ;
    /**
     * <pre>
     * Sets the amount of fuzziness allowed
     * in matches
     * Example:
     * Searching "term" would also match "temr"
     * Not compatible with a substring match
     * </pre>
     *
     * <code>int64 fuzziness = 2 [json_name = "fuzziness", deprecated = true];</code>
     * @deprecated api.v0alpha.Search.fuzziness is deprecated.
     *     See api/v0alpha/lms.proto;l=2584
     * @return The fuzziness.
     */
    @java.lang.Override
    @java.lang.Deprecated public long getFuzziness() {
      return fuzziness_;
    }
    /**
     * <pre>
     * Sets the amount of fuzziness allowed
     * in matches
     * Example:
     * Searching "term" would also match "temr"
     * Not compatible with a substring match
     * </pre>
     *
     * <code>int64 fuzziness = 2 [json_name = "fuzziness", deprecated = true];</code>
     * @deprecated api.v0alpha.Search.fuzziness is deprecated.
     *     See api/v0alpha/lms.proto;l=2584
     * @param value The fuzziness to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setFuzziness(long value) {

      fuzziness_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Sets the amount of fuzziness allowed
     * in matches
     * Example:
     * Searching "term" would also match "temr"
     * Not compatible with a substring match
     * </pre>
     *
     * <code>int64 fuzziness = 2 [json_name = "fuzziness", deprecated = true];</code>
     * @deprecated api.v0alpha.Search.fuzziness is deprecated.
     *     See api/v0alpha/lms.proto;l=2584
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearFuzziness() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fuzziness_ = 0L;
      onChanged();
      return this;
    }

    private boolean substring_ ;
    /**
     * <pre>
     * Checks if a subset of the content matches
     * Example:
     * Searching "but" would also match "rebuttal"
     * Not compatible with fuzziness (will override fuzziness)
     * </pre>
     *
     * <code>bool substring = 3 [json_name = "substring"];</code>
     * @return The substring.
     */
    @java.lang.Override
    public boolean getSubstring() {
      return substring_;
    }
    /**
     * <pre>
     * Checks if a subset of the content matches
     * Example:
     * Searching "but" would also match "rebuttal"
     * Not compatible with fuzziness (will override fuzziness)
     * </pre>
     *
     * <code>bool substring = 3 [json_name = "substring"];</code>
     * @param value The substring to set.
     * @return This builder for chaining.
     */
    public Builder setSubstring(boolean value) {

      substring_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Checks if a subset of the content matches
     * Example:
     * Searching "but" would also match "rebuttal"
     * Not compatible with fuzziness (will override fuzziness)
     * </pre>
     *
     * <code>bool substring = 3 [json_name = "substring"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSubstring() {
      bitField0_ = (bitField0_ & ~0x00000004);
      substring_ = false;
      onChanged();
      return this;
    }

    private boolean negate_ ;
    /**
     * <pre>
     * Specifies if the search should be negated
     * Example:
     * Searching "term" would match everything NOT including "term"
     * </pre>
     *
     * <code>bool negate = 4 [json_name = "negate"];</code>
     * @return The negate.
     */
    @java.lang.Override
    public boolean getNegate() {
      return negate_;
    }
    /**
     * <pre>
     * Specifies if the search should be negated
     * Example:
     * Searching "term" would match everything NOT including "term"
     * </pre>
     *
     * <code>bool negate = 4 [json_name = "negate"];</code>
     * @param value The negate to set.
     * @return This builder for chaining.
     */
    public Builder setNegate(boolean value) {

      negate_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies if the search should be negated
     * Example:
     * Searching "term" would match everything NOT including "term"
     * </pre>
     *
     * <code>bool negate = 4 [json_name = "negate"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNegate() {
      bitField0_ = (bitField0_ & ~0x00000008);
      negate_ = false;
      onChanged();
      return this;
    }

    private boolean caseSensitive_ ;
    /**
     * <pre>
     * Specifies if we should be case sensitive
     * </pre>
     *
     * <code>bool case_sensitive = 5 [json_name = "caseSensitive", deprecated = true];</code>
     * @deprecated api.v0alpha.Search.case_sensitive is deprecated.
     *     See api/v0alpha/lms.proto;l=2595
     * @return The caseSensitive.
     */
    @java.lang.Override
    @java.lang.Deprecated public boolean getCaseSensitive() {
      return caseSensitive_;
    }
    /**
     * <pre>
     * Specifies if we should be case sensitive
     * </pre>
     *
     * <code>bool case_sensitive = 5 [json_name = "caseSensitive", deprecated = true];</code>
     * @deprecated api.v0alpha.Search.case_sensitive is deprecated.
     *     See api/v0alpha/lms.proto;l=2595
     * @param value The caseSensitive to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setCaseSensitive(boolean value) {

      caseSensitive_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies if we should be case sensitive
     * </pre>
     *
     * <code>bool case_sensitive = 5 [json_name = "caseSensitive", deprecated = true];</code>
     * @deprecated api.v0alpha.Search.case_sensitive is deprecated.
     *     See api/v0alpha/lms.proto;l=2595
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearCaseSensitive() {
      bitField0_ = (bitField0_ & ~0x00000010);
      caseSensitive_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <pre>
     * the value of the term we are searching for
     * </pre>
     *
     * <code>string value = 6 [json_name = "value"];</code>
     * @return The value.
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the value of the term we are searching for
     * </pre>
     *
     * <code>string value = 6 [json_name = "value"];</code>
     * @return The bytes for value.
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the value of the term we are searching for
     * </pre>
     *
     * <code>string value = 6 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      value_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the value of the term we are searching for
     * </pre>
     *
     * <code>string value = 6 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      value_ = getDefaultInstance().getValue();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the value of the term we are searching for
     * </pre>
     *
     * <code>string value = 6 [json_name = "value"];</code>
     * @param value The bytes for value to set.
     * @return This builder for chaining.
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      value_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.Search)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.Search)
  private static final com.tcn.cloud.api.api.v0alpha.Search DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.Search();
  }

  public static com.tcn.cloud.api.api.v0alpha.Search getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Search>
      PARSER = new com.google.protobuf.AbstractParser<Search>() {
    @java.lang.Override
    public Search parsePartialFrom(
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

  public static com.google.protobuf.Parser<Search> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Search> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.Search getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

