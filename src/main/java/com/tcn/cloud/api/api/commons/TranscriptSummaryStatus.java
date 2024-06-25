// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/vanalytics.proto

package com.tcn.cloud.api.api.commons;

/**
 * <pre>
 * TranscriptSummaryStatus defines a set of possible statuses
 * in which transcript summaries may exist.
 * </pre>
 *
 * Protobuf enum {@code api.commons.TranscriptSummaryStatus}
 */
public enum TranscriptSummaryStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Initial - Summary is currently
   * queued and awaiting generation.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_QUEUED = 0;</code>
   */
  TRANSCRIPT_SUMMARY_STATUS_QUEUED(0),
  /**
   * <pre>
   * Summary could not be generated.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_QUEUED_ERRORED = -1;</code>
   */
  TRANSCRIPT_SUMMARY_STATUS_QUEUED_ERRORED(-1),
  /**
   * <pre>
   * Summary has been generated.
   * Waiting to be added to transcript.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED = 1;</code>
   */
  TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED(1),
  /**
   * <pre>
   * Summary could not be added to transcript.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_ERRORED = -2;</code>
   */
  TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_ERRORED(-2),
  /**
   * <pre>
   * Summary is generated and visible.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_VISIBLE = 2;</code>
   */
  TRANSCRIPT_SUMMARY_STATUS_VISIBLE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Initial - Summary is currently
   * queued and awaiting generation.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_QUEUED = 0;</code>
   */
  public static final int TRANSCRIPT_SUMMARY_STATUS_QUEUED_VALUE = 0;
  /**
   * <pre>
   * Summary could not be generated.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_QUEUED_ERRORED = -1;</code>
   */
  public static final int TRANSCRIPT_SUMMARY_STATUS_QUEUED_ERRORED_VALUE = -1;
  /**
   * <pre>
   * Summary has been generated.
   * Waiting to be added to transcript.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED = 1;</code>
   */
  public static final int TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_VALUE = 1;
  /**
   * <pre>
   * Summary could not be added to transcript.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_ERRORED = -2;</code>
   */
  public static final int TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_ERRORED_VALUE = -2;
  /**
   * <pre>
   * Summary is generated and visible.
   * </pre>
   *
   * <code>TRANSCRIPT_SUMMARY_STATUS_VISIBLE = 2;</code>
   */
  public static final int TRANSCRIPT_SUMMARY_STATUS_VISIBLE_VALUE = 2;


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
  public static TranscriptSummaryStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TranscriptSummaryStatus forNumber(int value) {
    switch (value) {
      case 0: return TRANSCRIPT_SUMMARY_STATUS_QUEUED;
      case -1: return TRANSCRIPT_SUMMARY_STATUS_QUEUED_ERRORED;
      case 1: return TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED;
      case -2: return TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_ERRORED;
      case 2: return TRANSCRIPT_SUMMARY_STATUS_VISIBLE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TranscriptSummaryStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TranscriptSummaryStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TranscriptSummaryStatus>() {
          public TranscriptSummaryStatus findValueByNumber(int number) {
            return TranscriptSummaryStatus.forNumber(number);
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
    return com.tcn.cloud.api.api.commons.VanalyticsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final TranscriptSummaryStatus[] VALUES = values();

  public static TranscriptSummaryStatus valueOf(
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

  private TranscriptSummaryStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:api.commons.TranscriptSummaryStatus)
}
