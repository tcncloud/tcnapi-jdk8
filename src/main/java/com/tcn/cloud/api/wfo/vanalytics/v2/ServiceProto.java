// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/service.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public final class ServiceProto {
  private ServiceProto() {}
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
      "\n\037wfo/vanalytics/v2/service.proto\022\021wfo.v" +
      "analytics.v2\032\027annotations/authz.proto\032\034g" +
      "oogle/api/annotations.proto\032\"wfo/vanalyt" +
      "ics/v2/correction.proto\032\"wfo/vanalytics/" +
      "v2/transcript.proto2\340\002\n\nVanalytics\022\251\001\n\021S" +
      "earchTranscripts\022+.wfo.vanalytics.v2.Sea" +
      "rchTranscriptsRequest\032,.wfo.vanalytics.v" +
      "2.SearchTranscriptsResponse\"9\272\270\221\002\005\n\003\010\364\003\202" +
      "\323\344\223\002)\"$/wfo/vanalytics/v2/searchtranscri" +
      "pts:\001*\022\245\001\n\020CreateCorrection\022*.wfo.vanaly" +
      "tics.v2.CreateCorrectionRequest\032+.wfo.va" +
      "nalytics.v2.CreateCorrectionResponse\"8\272\270" +
      "\221\002\005\n\003\010\364\003\202\323\344\223\002(\"#/wfo/vanalytics/v2/creat" +
      "ecorrection:\001*B\231\001\n#com.tcn.cloud.api.wfo" +
      ".vanalytics.v2B\014ServiceProtoP\001\242\002\003WVX\252\002\021W" +
      "fo.Vanalytics.V2\312\002\021Wfo\\Vanalytics\\V2\342\002\035W" +
      "fo\\Vanalytics\\V2\\GPBMetadata\352\002\023Wfo::Vana" +
      "lytics::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.CorrectionProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
