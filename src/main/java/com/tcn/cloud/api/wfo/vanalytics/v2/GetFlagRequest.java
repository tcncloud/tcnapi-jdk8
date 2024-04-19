// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * GetFlagRequest is a request for getting a flag.
 * </pre>
 *
 * Protobuf type {@code wfo.vanalytics.v2.GetFlagRequest}
 */
public final class GetFlagRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wfo.vanalytics.v2.GetFlagRequest)
    GetFlagRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetFlagRequest.newBuilder() to construct.
  private GetFlagRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetFlagRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetFlagRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.internal_static_wfo_vanalytics_v2_GetFlagRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.internal_static_wfo_vanalytics_v2_GetFlagRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.Builder.class);
  }

  private int whereCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object where_;
  public enum WhereCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    NAME(2),
    FLAG_SID(3),
    WHERE_NOT_SET(0);
    private final int value;
    private WhereCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WhereCase valueOf(int value) {
      return forNumber(value);
    }

    public static WhereCase forNumber(int value) {
      switch (value) {
        case 2: return NAME;
        case 3: return FLAG_SID;
        case 0: return WHERE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public WhereCase
  getWhereCase() {
    return WhereCase.forNumber(
        whereCase_);
  }

  public static final int NAME_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The name of the flag.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  public boolean hasName() {
    return whereCase_ == 2;
  }
  /**
   * <pre>
   * The name of the flag.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  public java.lang.String getName() {
    java.lang.Object ref = "";
    if (whereCase_ == 2) {
      ref = where_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (whereCase_ == 2) {
        where_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The name of the flag.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = "";
    if (whereCase_ == 2) {
      ref = where_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (whereCase_ == 2) {
        where_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FLAG_SID_FIELD_NUMBER = 3;
  /**
   * <pre>
   * The unique id of the flag.
   * </pre>
   *
   * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
   * @return Whether the flagSid field is set.
   */
  @java.lang.Override
  public boolean hasFlagSid() {
    return whereCase_ == 3;
  }
  /**
   * <pre>
   * The unique id of the flag.
   * </pre>
   *
   * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
   * @return The flagSid.
   */
  @java.lang.Override
  public long getFlagSid() {
    if (whereCase_ == 3) {
      return (java.lang.Long) where_;
    }
    return 0L;
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
    if (whereCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, where_);
    }
    if (whereCase_ == 3) {
      output.writeInt64(
          3, (long)((java.lang.Long) where_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (whereCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, where_);
    }
    if (whereCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(
            3, (long)((java.lang.Long) where_));
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
    if (!(obj instanceof com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest other = (com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest) obj;

    if (!getWhereCase().equals(other.getWhereCase())) return false;
    switch (whereCase_) {
      case 2:
        if (!getName()
            .equals(other.getName())) return false;
        break;
      case 3:
        if (getFlagSid()
            != other.getFlagSid()) return false;
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
    switch (whereCase_) {
      case 2:
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        break;
      case 3:
        hash = (37 * hash) + FLAG_SID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getFlagSid());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest prototype) {
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
   * GetFlagRequest is a request for getting a flag.
   * </pre>
   *
   * Protobuf type {@code wfo.vanalytics.v2.GetFlagRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wfo.vanalytics.v2.GetFlagRequest)
      com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.internal_static_wfo_vanalytics_v2_GetFlagRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.internal_static_wfo_vanalytics_v2_GetFlagRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.class, com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.Builder.class);
    }

    // Construct using com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.newBuilder()
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
      whereCase_ = 0;
      where_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.internal_static_wfo_vanalytics_v2_GetFlagRequest_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest getDefaultInstanceForType() {
      return com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest build() {
      com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest buildPartial() {
      com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest result = new com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest result) {
      result.whereCase_ = whereCase_;
      result.where_ = this.where_;
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
      if (other instanceof com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest) {
        return mergeFrom((com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest other) {
      if (other == com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest.getDefaultInstance()) return this;
      switch (other.getWhereCase()) {
        case NAME: {
          whereCase_ = 2;
          where_ = other.where_;
          onChanged();
          break;
        }
        case FLAG_SID: {
          setFlagSid(other.getFlagSid());
          break;
        }
        case WHERE_NOT_SET: {
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              whereCase_ = 2;
              where_ = s;
              break;
            } // case 18
            case 24: {
              where_ = input.readInt64();
              whereCase_ = 3;
              break;
            } // case 24
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
    private int whereCase_ = 0;
    private java.lang.Object where_;
    public WhereCase
        getWhereCase() {
      return WhereCase.forNumber(
          whereCase_);
    }

    public Builder clearWhere() {
      whereCase_ = 0;
      where_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The name of the flag.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return whereCase_ == 2;
    }
    /**
     * <pre>
     * The name of the flag.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = "";
      if (whereCase_ == 2) {
        ref = where_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (whereCase_ == 2) {
          where_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the flag.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = "";
      if (whereCase_ == 2) {
        ref = where_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (whereCase_ == 2) {
          where_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the flag.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      whereCase_ = 2;
      where_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the flag.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      if (whereCase_ == 2) {
        whereCase_ = 0;
        where_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The name of the flag.
     * </pre>
     *
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      whereCase_ = 2;
      where_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * The unique id of the flag.
     * </pre>
     *
     * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
     * @return Whether the flagSid field is set.
     */
    public boolean hasFlagSid() {
      return whereCase_ == 3;
    }
    /**
     * <pre>
     * The unique id of the flag.
     * </pre>
     *
     * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
     * @return The flagSid.
     */
    public long getFlagSid() {
      if (whereCase_ == 3) {
        return (java.lang.Long) where_;
      }
      return 0L;
    }
    /**
     * <pre>
     * The unique id of the flag.
     * </pre>
     *
     * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
     * @param value The flagSid to set.
     * @return This builder for chaining.
     */
    public Builder setFlagSid(long value) {

      whereCase_ = 3;
      where_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique id of the flag.
     * </pre>
     *
     * <code>int64 flag_sid = 3 [json_name = "flagSid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFlagSid() {
      if (whereCase_ == 3) {
        whereCase_ = 0;
        where_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:wfo.vanalytics.v2.GetFlagRequest)
  }

  // @@protoc_insertion_point(class_scope:wfo.vanalytics.v2.GetFlagRequest)
  private static final com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest();
  }

  public static com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetFlagRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetFlagRequest>() {
    @java.lang.Override
    public GetFlagRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetFlagRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetFlagRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.wfo.vanalytics.v2.GetFlagRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

