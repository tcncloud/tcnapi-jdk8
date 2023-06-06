// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/p3api.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf type {@code api.commons.ListPhoneBookOrderBy}
 */
public final class ListPhoneBookOrderBy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.commons.ListPhoneBookOrderBy)
    ListPhoneBookOrderByOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPhoneBookOrderBy.newBuilder() to construct.
  private ListPhoneBookOrderBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPhoneBookOrderBy() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListPhoneBookOrderBy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ListPhoneBookOrderBy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ListPhoneBookOrderBy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.class, com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.Builder.class);
  }

  /**
   * Protobuf enum {@code api.commons.ListPhoneBookOrderBy.Enum}
   */
  public enum Enum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PHONE_BOOK_SID = 0;</code>
     */
    PHONE_BOOK_SID(0),
    /**
     * <code>ENTRY_TYPE = 1;</code>
     */
    ENTRY_TYPE(1),
    /**
     * <code>ENTRY_NAME = 2;</code>
     */
    ENTRY_NAME(2),
    /**
     * <code>CLIENT_SID = 3;</code>
     */
    CLIENT_SID(3),
    /**
     * <code>HUNT_GROUP_SID = 4;</code>
     */
    HUNT_GROUP_SID(4),
    /**
     * <code>PHONE_NUMBER = 5;</code>
     */
    PHONE_NUMBER(5),
    /**
     * <code>PHONE_NUMBER_TYPE = 6;</code>
     */
    PHONE_NUMBER_TYPE(6),
    /**
     * <code>PHONE_NUMBER_HIDDEN = 7;</code>
     */
    PHONE_NUMBER_HIDDEN(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PHONE_BOOK_SID = 0;</code>
     */
    public static final int PHONE_BOOK_SID_VALUE = 0;
    /**
     * <code>ENTRY_TYPE = 1;</code>
     */
    public static final int ENTRY_TYPE_VALUE = 1;
    /**
     * <code>ENTRY_NAME = 2;</code>
     */
    public static final int ENTRY_NAME_VALUE = 2;
    /**
     * <code>CLIENT_SID = 3;</code>
     */
    public static final int CLIENT_SID_VALUE = 3;
    /**
     * <code>HUNT_GROUP_SID = 4;</code>
     */
    public static final int HUNT_GROUP_SID_VALUE = 4;
    /**
     * <code>PHONE_NUMBER = 5;</code>
     */
    public static final int PHONE_NUMBER_VALUE = 5;
    /**
     * <code>PHONE_NUMBER_TYPE = 6;</code>
     */
    public static final int PHONE_NUMBER_TYPE_VALUE = 6;
    /**
     * <code>PHONE_NUMBER_HIDDEN = 7;</code>
     */
    public static final int PHONE_NUMBER_HIDDEN_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Enum valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Enum forNumber(int value) {
      switch (value) {
        case 0: return PHONE_BOOK_SID;
        case 1: return ENTRY_TYPE;
        case 2: return ENTRY_NAME;
        case 3: return CLIENT_SID;
        case 4: return HUNT_GROUP_SID;
        case 5: return PHONE_NUMBER;
        case 6: return PHONE_NUMBER_TYPE;
        case 7: return PHONE_NUMBER_HIDDEN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Enum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Enum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Enum>() {
            public Enum findValueByNumber(int number) {
              return Enum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.getDescriptor().getEnumTypes().get(0);
    }

    private static final Enum[] VALUES = values();

    public static Enum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Enum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:api.commons.ListPhoneBookOrderBy.Enum)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy other = (com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy prototype) {
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
   * Protobuf type {@code api.commons.ListPhoneBookOrderBy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.commons.ListPhoneBookOrderBy)
      com.tcn.cloud.api.api.commons.ListPhoneBookOrderByOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ListPhoneBookOrderBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ListPhoneBookOrderBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.class, com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.commons.P3apiProto.internal_static_api_commons_ListPhoneBookOrderBy_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy build() {
      com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy buildPartial() {
      com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy result = new com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy(this);
      onBuilt();
      return result;
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
      if (other instanceof com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy) {
        return mergeFrom((com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy other) {
      if (other == com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:api.commons.ListPhoneBookOrderBy)
  }

  // @@protoc_insertion_point(class_scope:api.commons.ListPhoneBookOrderBy)
  private static final com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy();
  }

  public static com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPhoneBookOrderBy>
      PARSER = new com.google.protobuf.AbstractParser<ListPhoneBookOrderBy>() {
    @java.lang.Override
    public ListPhoneBookOrderBy parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPhoneBookOrderBy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPhoneBookOrderBy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.commons.ListPhoneBookOrderBy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

