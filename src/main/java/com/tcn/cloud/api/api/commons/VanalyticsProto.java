// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/vanalytics.proto

package com.tcn.cloud.api.api.commons;

public final class VanalyticsProto {
  private VanalyticsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034api/commons/vanalytics.proto\022\013api.comm" +
      "ons*\276\001\n\010Interval\022\t\n\005TODAY\020\000\022\r\n\tYESTERDAY" +
      "\020\001\022\r\n\tTHIS_WEEK\020\002\022\017\n\013LAST_7_DAYS\020\003\022\r\n\tLA" +
      "ST_WEEK\020\004\022\020\n\014LAST_14_DAYS\020\005\022\016\n\nTHIS_MONT" +
      "H\020\006\022\020\n\014LAST_30_DAYS\020\007\022\020\n\014LAST_60_DAYS\020\010\022" +
      "\020\n\014LAST_90_DAYS\020\t\022\021\n\rLAST_180_DAYS\020\n*\202\002\n" +
      "\027TranscriptSummaryStatus\022$\n TRANSCRIPT_S" +
      "UMMARY_STATUS_QUEUED\020\000\0225\n(TRANSCRIPT_SUM" +
      "MARY_STATUS_QUEUED_ERRORED\020\377\377\377\377\377\377\377\377\377\001\022(\n" +
      "$TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED\020\001\022" +
      "9\n,TRANSCRIPT_SUMMARY_STATUS_SUMMARIZED_" +
      "ERRORED\020\376\377\377\377\377\377\377\377\377\001\022%\n!TRANSCRIPT_SUMMARY" +
      "_STATUS_VISIBLE\020\002B}\n\035com.tcn.cloud.api.a" +
      "pi.commonsB\017VanalyticsProtoP\001\242\002\003ACX\252\002\013Ap" +
      "i.Commons\312\002\013Api\\Commons\342\002\027Api\\Commons\\GP" +
      "BMetadata\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
