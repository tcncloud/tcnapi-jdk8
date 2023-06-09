// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/lms.proto

package com.tcn.cloud.api.api.commons;

/**
 * Protobuf enum {@code api.commons.HttpVerb}
 */
public enum HttpVerb
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HTTP_VERB_GET = 0;</code>
   */
  HTTP_VERB_GET(0),
  /**
   * <code>HTTP_VERB_POST = 1;</code>
   */
  HTTP_VERB_POST(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HTTP_VERB_GET = 0;</code>
   */
  public static final int HTTP_VERB_GET_VALUE = 0;
  /**
   * <code>HTTP_VERB_POST = 1;</code>
   */
  public static final int HTTP_VERB_POST_VALUE = 1;


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
  public static HttpVerb valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HttpVerb forNumber(int value) {
    switch (value) {
      case 0: return HTTP_VERB_GET;
      case 1: return HTTP_VERB_POST;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HttpVerb>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HttpVerb> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HttpVerb>() {
          public HttpVerb findValueByNumber(int number) {
            return HttpVerb.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.LmsProto.getDescriptor().getEnumTypes().get(24);
  }

  private static final HttpVerb[] VALUES = values();

  public static HttpVerb valueOf(
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

  private HttpVerb(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.HttpVerb)
}

