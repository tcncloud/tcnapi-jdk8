// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/transcript.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

/**
 * <pre>
 * An enumeration of a flagged transcripts review statuses. Todo means there
 * are flags that need review and have not been reviewed. Done means every flag
 * that needs review has been reviewed. None means no flags require review.
 * </pre>
 *
 * Protobuf enum {@code wfo.vanalytics.v2.ReviewStatus}
 */
public enum ReviewStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>REVIEW_STATUS_TODO = 0;</code>
   */
  REVIEW_STATUS_TODO(0),
  /**
   * <code>REVIEW_STATUS_DONE = 1;</code>
   */
  REVIEW_STATUS_DONE(1),
  /**
   * <code>REVIEW_STATUS_NONE = 2;</code>
   */
  REVIEW_STATUS_NONE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>REVIEW_STATUS_TODO = 0;</code>
   */
  public static final int REVIEW_STATUS_TODO_VALUE = 0;
  /**
   * <code>REVIEW_STATUS_DONE = 1;</code>
   */
  public static final int REVIEW_STATUS_DONE_VALUE = 1;
  /**
   * <code>REVIEW_STATUS_NONE = 2;</code>
   */
  public static final int REVIEW_STATUS_NONE_VALUE = 2;


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
  public static ReviewStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ReviewStatus forNumber(int value) {
    switch (value) {
      case 0: return REVIEW_STATUS_TODO;
      case 1: return REVIEW_STATUS_DONE;
      case 2: return REVIEW_STATUS_NONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReviewStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReviewStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReviewStatus>() {
          public ReviewStatus findValueByNumber(int number) {
            return ReviewStatus.forNumber(number);
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
    return com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReviewStatus[] VALUES = values();

  public static ReviewStatus valueOf(
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

  private ReviewStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:wfo.vanalytics.v2.ReviewStatus)
}

