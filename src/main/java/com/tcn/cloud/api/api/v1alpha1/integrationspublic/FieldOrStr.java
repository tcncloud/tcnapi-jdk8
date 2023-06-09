// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

/**
 * <pre>
 * represents either a field name whose value needs to be looked up in the payload
 * or a static string value
 * </pre>
 *
 * Protobuf type {@code api.v1alpha1.integrationspublic.FieldOrStr}
 */
public final class FieldOrStr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrationspublic.FieldOrStr)
    FieldOrStrOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FieldOrStr.newBuilder() to construct.
  private FieldOrStr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FieldOrStr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FieldOrStr();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_FieldOrStr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_FieldOrStr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.Builder.class);
  }

  private int valCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object val_;
  public enum ValCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FIELD(1),
    STR_VAL(2),
    VAL_NOT_SET(0);
    private final int value;
    private ValCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValCase forNumber(int value) {
      switch (value) {
        case 1: return FIELD;
        case 2: return STR_VAL;
        case 0: return VAL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValCase
  getValCase() {
    return ValCase.forNumber(
        valCase_);
  }

  public static final int FIELD_FIELD_NUMBER = 1;
  /**
   * <code>string field = 1 [json_name = "field"];</code>
   * @return Whether the field field is set.
   */
  public boolean hasField() {
    return valCase_ == 1;
  }
  /**
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The field.
   */
  public java.lang.String getField() {
    java.lang.Object ref = "";
    if (valCase_ == 1) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valCase_ == 1) {
        val_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string field = 1 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  public com.google.protobuf.ByteString
      getFieldBytes() {
    java.lang.Object ref = "";
    if (valCase_ == 1) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valCase_ == 1) {
        val_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STR_VAL_FIELD_NUMBER = 2;
  /**
   * <code>string str_val = 2 [json_name = "strVal"];</code>
   * @return Whether the strVal field is set.
   */
  public boolean hasStrVal() {
    return valCase_ == 2;
  }
  /**
   * <code>string str_val = 2 [json_name = "strVal"];</code>
   * @return The strVal.
   */
  public java.lang.String getStrVal() {
    java.lang.Object ref = "";
    if (valCase_ == 2) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valCase_ == 2) {
        val_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string str_val = 2 [json_name = "strVal"];</code>
   * @return The bytes for strVal.
   */
  public com.google.protobuf.ByteString
      getStrValBytes() {
    java.lang.Object ref = "";
    if (valCase_ == 2) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valCase_ == 2) {
        val_ = b;
      }
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
    if (valCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, val_);
    }
    if (valCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, val_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, val_);
    }
    if (valCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, val_);
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr other = (com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr) obj;

    if (!getValCase().equals(other.getValCase())) return false;
    switch (valCase_) {
      case 1:
        if (!getField()
            .equals(other.getField())) return false;
        break;
      case 2:
        if (!getStrVal()
            .equals(other.getStrVal())) return false;
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
    switch (valCase_) {
      case 1:
        hash = (37 * hash) + FIELD_FIELD_NUMBER;
        hash = (53 * hash) + getField().hashCode();
        break;
      case 2:
        hash = (37 * hash) + STR_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getStrVal().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr prototype) {
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
   * represents either a field name whose value needs to be looked up in the payload
   * or a static string value
   * </pre>
   *
   * Protobuf type {@code api.v1alpha1.integrationspublic.FieldOrStr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrationspublic.FieldOrStr)
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStrOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_FieldOrStr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_FieldOrStr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.class, com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.newBuilder()
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
      valCase_ = 0;
      val_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.ServiceProto.internal_static_api_v1alpha1_integrationspublic_FieldOrStr_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr build() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr result = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr result) {
      result.valCase_ = valCase_;
      result.val_ = this.val_;
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
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr.getDefaultInstance()) return this;
      switch (other.getValCase()) {
        case FIELD: {
          valCase_ = 1;
          val_ = other.val_;
          onChanged();
          break;
        }
        case STR_VAL: {
          valCase_ = 2;
          val_ = other.val_;
          onChanged();
          break;
        }
        case VAL_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              valCase_ = 1;
              val_ = s;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              valCase_ = 2;
              val_ = s;
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
    private int valCase_ = 0;
    private java.lang.Object val_;
    public ValCase
        getValCase() {
      return ValCase.forNumber(
          valCase_);
    }

    public Builder clearVal() {
      valCase_ = 0;
      val_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return Whether the field field is set.
     */
    @java.lang.Override
    public boolean hasField() {
      return valCase_ == 1;
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return The field.
     */
    @java.lang.Override
    public java.lang.String getField() {
      java.lang.Object ref = "";
      if (valCase_ == 1) {
        ref = val_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valCase_ == 1) {
          val_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return The bytes for field.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFieldBytes() {
      java.lang.Object ref = "";
      if (valCase_ == 1) {
        ref = val_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valCase_ == 1) {
          val_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @param value The field to set.
     * @return This builder for chaining.
     */
    public Builder setField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valCase_ = 1;
      val_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @return This builder for chaining.
     */
    public Builder clearField() {
      if (valCase_ == 1) {
        valCase_ = 0;
        val_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string field = 1 [json_name = "field"];</code>
     * @param value The bytes for field to set.
     * @return This builder for chaining.
     */
    public Builder setFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valCase_ = 1;
      val_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string str_val = 2 [json_name = "strVal"];</code>
     * @return Whether the strVal field is set.
     */
    @java.lang.Override
    public boolean hasStrVal() {
      return valCase_ == 2;
    }
    /**
     * <code>string str_val = 2 [json_name = "strVal"];</code>
     * @return The strVal.
     */
    @java.lang.Override
    public java.lang.String getStrVal() {
      java.lang.Object ref = "";
      if (valCase_ == 2) {
        ref = val_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valCase_ == 2) {
          val_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string str_val = 2 [json_name = "strVal"];</code>
     * @return The bytes for strVal.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStrValBytes() {
      java.lang.Object ref = "";
      if (valCase_ == 2) {
        ref = val_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valCase_ == 2) {
          val_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string str_val = 2 [json_name = "strVal"];</code>
     * @param value The strVal to set.
     * @return This builder for chaining.
     */
    public Builder setStrVal(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valCase_ = 2;
      val_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string str_val = 2 [json_name = "strVal"];</code>
     * @return This builder for chaining.
     */
    public Builder clearStrVal() {
      if (valCase_ == 2) {
        valCase_ = 0;
        val_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string str_val = 2 [json_name = "strVal"];</code>
     * @param value The bytes for strVal to set.
     * @return This builder for chaining.
     */
    public Builder setStrValBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valCase_ = 2;
      val_ = value;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrationspublic.FieldOrStr)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrationspublic.FieldOrStr)
  private static final com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldOrStr>
      PARSER = new com.google.protobuf.AbstractParser<FieldOrStr>() {
    @java.lang.Override
    public FieldOrStr parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldOrStr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldOrStr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrationspublic.FieldOrStr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

