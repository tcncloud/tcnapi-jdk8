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
      "oogle/api/annotations.proto\032\036wfo/vanalyt" +
      "ics/v2/filter.proto\032\"wfo/vanalytics/v2/t" +
      "ranscript.proto2\370\006\n\nVanalytics\022\251\001\n\021Searc" +
      "hTranscripts\022+.wfo.vanalytics.v2.SearchT" +
      "ranscriptsRequest\032,.wfo.vanalytics.v2.Se" +
      "archTranscriptsResponse\"9\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002" +
      ")\"$/wfo/vanalytics/v2/searchtranscripts:" +
      "\001*\022\207\001\n\014CreateFilter\022&.wfo.vanalytics.v2." +
      "CreateFilterRequest\032\031.wfo.vanalytics.v2." +
      "Filter\"4\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002$\"\037/wfo/vanalytic" +
      "s/v2/createfilter:\001*\022\221\001\n\013ListFilters\022%.w" +
      "fo.vanalytics.v2.ListFiltersRequest\032&.wf" +
      "o.vanalytics.v2.ListFiltersResponse\"3\272\270\221" +
      "\002\005\n\003\010\364\003\202\323\344\223\002#\"\036/wfo/vanalytics/v2/listfi" +
      "lters:\001*\022\207\001\n\014UpdateFilter\022&.wfo.vanalyti" +
      "cs.v2.UpdateFilterRequest\032\031.wfo.vanalyti" +
      "cs.v2.Filter\"4\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002$\"\037/wfo/van" +
      "alytics/v2/updatefilter:\001*\022\225\001\n\014DeleteFil" +
      "ter\022&.wfo.vanalytics.v2.DeleteFilterRequ" +
      "est\032\'.wfo.vanalytics.v2.DeleteFilterResp" +
      "onse\"4\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002$\"\037/wfo/vanalytics/" +
      "v2/deletefilter:\001*\022~\n\tGetFilter\022#.wfo.va" +
      "nalytics.v2.GetFilterRequest\032\031.wfo.vanal" +
      "ytics.v2.Filter\"1\272\270\221\002\005\n\003\010\364\003\202\323\344\223\002!\"\034/wfo/" +
      "vanalytics/v2/getfilter:\001*B\231\001\n#com.tcn.c" +
      "loud.api.wfo.vanalytics.v2B\014ServiceProto" +
      "P\001\242\002\003WVX\252\002\021Wfo.Vanalytics.V2\312\002\021Wfo\\Vanal" +
      "ytics\\V2\342\002\035Wfo\\Vanalytics\\V2\\GPBMetadata" +
      "\352\002\023Wfo::Vanalytics::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.getDescriptor(),
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
    com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.TranscriptProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
