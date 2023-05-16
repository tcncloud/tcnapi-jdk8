// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/p3api.proto

package com.tcn.cloud.api.api.v0alpha;

/**
 * Protobuf type {@code api.v0alpha.HoldQueueMonitoringAgentRouting}
 */
public final class HoldQueueMonitoringAgentRouting extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v0alpha.HoldQueueMonitoringAgentRouting)
    HoldQueueMonitoringAgentRoutingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HoldQueueMonitoringAgentRouting.newBuilder() to construct.
  private HoldQueueMonitoringAgentRouting(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HoldQueueMonitoringAgentRouting() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HoldQueueMonitoringAgentRouting();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_HoldQueueMonitoringAgentRouting_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_HoldQueueMonitoringAgentRouting_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.class, com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.Builder.class);
  }

  /**
   * Protobuf enum {@code api.v0alpha.HoldQueueMonitoringAgentRouting.Enum}
   */
  public enum Enum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>ORIGINAL_AGENT_REQUIRED = 1;</code>
     */
    ORIGINAL_AGENT_REQUIRED(1),
    /**
     * <code>ORIGINAL_AGENT_PREFERRED = 2;</code>
     */
    ORIGINAL_AGENT_PREFERRED(2),
    /**
     * <code>ANY_AGENT = 3;</code>
     */
    ANY_AGENT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>ORIGINAL_AGENT_REQUIRED = 1;</code>
     */
    public static final int ORIGINAL_AGENT_REQUIRED_VALUE = 1;
    /**
     * <code>ORIGINAL_AGENT_PREFERRED = 2;</code>
     */
    public static final int ORIGINAL_AGENT_PREFERRED_VALUE = 2;
    /**
     * <code>ANY_AGENT = 3;</code>
     */
    public static final int ANY_AGENT_VALUE = 3;


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
        case 0: return UNKNOWN;
        case 1: return ORIGINAL_AGENT_REQUIRED;
        case 2: return ORIGINAL_AGENT_PREFERRED;
        case 3: return ANY_AGENT;
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
      return com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:api.v0alpha.HoldQueueMonitoringAgentRouting.Enum)
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
    if (!(obj instanceof com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting other = (com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting) obj;

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

  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting prototype) {
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
   * Protobuf type {@code api.v0alpha.HoldQueueMonitoringAgentRouting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v0alpha.HoldQueueMonitoringAgentRouting)
      com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRoutingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_HoldQueueMonitoringAgentRouting_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_HoldQueueMonitoringAgentRouting_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.class, com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.newBuilder()
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
      return com.tcn.cloud.api.api.v0alpha.P3apiProto.internal_static_api_v0alpha_HoldQueueMonitoringAgentRouting_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting build() {
      com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting buildPartial() {
      com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting result = new com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting) {
        return mergeFrom((com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting other) {
      if (other == com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:api.v0alpha.HoldQueueMonitoringAgentRouting)
  }

  // @@protoc_insertion_point(class_scope:api.v0alpha.HoldQueueMonitoringAgentRouting)
  private static final com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting();
  }

  public static com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HoldQueueMonitoringAgentRouting>
      PARSER = new com.google.protobuf.AbstractParser<HoldQueueMonitoringAgentRouting>() {
    @java.lang.Override
    public HoldQueueMonitoringAgentRouting parsePartialFrom(
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

  public static com.google.protobuf.Parser<HoldQueueMonitoringAgentRouting> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HoldQueueMonitoringAgentRouting> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v0alpha.HoldQueueMonitoringAgentRouting getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

