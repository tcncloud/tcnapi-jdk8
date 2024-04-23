// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wfo/vanalytics/v2/flag_filter.proto

package com.tcn.cloud.api.wfo.vanalytics.v2;

public final class FlagFilterProto {
  private FlagFilterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_ListFlagFiltersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_ListFlagFiltersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_ListFlagFiltersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_ListFlagFiltersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wfo_vanalytics_v2_FlagFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wfo_vanalytics_v2_FlagFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#wfo/vanalytics/v2/flag_filter.proto\022\021w" +
      "fo.vanalytics.v2\032 google/protobuf/field_" +
      "mask.proto\032\036wfo/vanalytics/v2/filter.pro" +
      "to\032\034wfo/vanalytics/v2/flag.proto\"\347\001\n\026Lis" +
      "tFlagFiltersRequest\022\033\n\tpage_size\030\002 \001(\rR\010" +
      "pageSize\022\035\n\npage_token\030\003 \001(\tR\tpageToken\022" +
      "7\n\tflag_mask\030\004 \001(\0132\032.google.protobuf.Fie" +
      "ldMaskR\010flagMask\022;\n\013filter_mask\030\005 \001(\0132\032." +
      "google.protobuf.FieldMaskR\nfilterMask\022\033\n" +
      "\tflag_sids\030\006 \003(\003R\010flagSids\"\203\001\n\027ListFlagF" +
      "iltersResponse\022&\n\017next_page_token\030\001 \001(\tR" +
      "\rnextPageToken\022@\n\014flag_filters\030\002 \003(\0132\035.w" +
      "fo.vanalytics.v2.FlagFilterR\013flagFilters" +
      "\"\316\001\n\nFlagFilter\022&\n\017flag_filter_sid\030\001 \001(\003" +
      "R\rflagFilterSid\022\035\n\nfilter_sid\030\002 \001(\003R\tfil" +
      "terSid\022\031\n\010flag_sid\030\003 \001(\003R\007flagSid\022+\n\004fla" +
      "g\030\005 \001(\0132\027.wfo.vanalytics.v2.FlagR\004flag\0221" +
      "\n\006filter\030\006 \001(\0132\031.wfo.vanalytics.v2.Filte" +
      "rR\006filterB\234\001\n#com.tcn.cloud.api.wfo.vana" +
      "lytics.v2B\017FlagFilterProtoP\001\242\002\003WVX\252\002\021Wfo" +
      ".Vanalytics.V2\312\002\021Wfo\\Vanalytics\\V2\342\002\035Wfo" +
      "\\Vanalytics\\V2\\GPBMetadata\352\002\023Wfo::Vanaly" +
      "tics::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.getDescriptor(),
          com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.getDescriptor(),
        });
    internal_static_wfo_vanalytics_v2_ListFlagFiltersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wfo_vanalytics_v2_ListFlagFiltersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_ListFlagFiltersRequest_descriptor,
        new java.lang.String[] { "PageSize", "PageToken", "FlagMask", "FilterMask", "FlagSids", });
    internal_static_wfo_vanalytics_v2_ListFlagFiltersResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wfo_vanalytics_v2_ListFlagFiltersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_ListFlagFiltersResponse_descriptor,
        new java.lang.String[] { "NextPageToken", "FlagFilters", });
    internal_static_wfo_vanalytics_v2_FlagFilter_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wfo_vanalytics_v2_FlagFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wfo_vanalytics_v2_FlagFilter_descriptor,
        new java.lang.String[] { "FlagFilterSid", "FilterSid", "FlagSid", "Flag", "Filter", });
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FilterProto.getDescriptor();
    com.tcn.cloud.api.wfo.vanalytics.v2.FlagProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
