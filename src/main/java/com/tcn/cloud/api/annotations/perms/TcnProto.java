// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: annotations/perms/tcn.proto

package com.tcn.cloud.api.annotations.perms;

public final class TcnProto {
  private TcnProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.tcn.cloud.api.annotations.perms.TcnProto.options);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int OPTIONS_FIELD_NUMBER = 50001;
  /**
   * <pre>
   * Options contain the permission annotation properties.
   * </pre>
   *
   * <code>extend .google.protobuf.EnumValueOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.EnumValueOptions,
      com.tcn.cloud.api.annotations.perms.Tcn> options = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        com.tcn.cloud.api.annotations.perms.Tcn.class,
        com.tcn.cloud.api.annotations.perms.Tcn.getDefaultInstance());
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_annotations_perms_Tcn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_annotations_perms_Tcn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033annotations/perms/tcn.proto\022\021annotatio" +
      "ns.perms\032\037annotations/perms/license.prot" +
      "o\032 google/protobuf/descriptor.proto\"\264\001\n\003" +
      "Tcn\022\020\n\003wip\030\001 \001(\010R\003wip\0220\n\003app\030\002 \001(\0162\036.ann" +
      "otations.perms.ApplicationR\003app\022+\n\004card\030" +
      "\003 \001(\0162\027.annotations.perms.CardR\004card\022\032\n\010" +
      "features\030\004 \003(\tR\010features\022 \n\013blacklisted\030" +
      "\005 \001(\010R\013blacklisted:U\n\007options\022!.google.p" +
      "rotobuf.EnumValueOptions\030\321\206\003 \001(\0132\026.annot" +
      "ations.perms.TcnR\007optionsB\224\001\n#com.tcn.cl" +
      "oud.api.annotations.permsB\010TcnProtoP\001\242\002\003" +
      "APX\252\002\021Annotations.Perms\312\002\021Annotations\\Pe" +
      "rms\342\002\035Annotations\\Perms\\GPBMetadata\352\002\022An" +
      "notations::Perms"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.perms.LicenseProto.getDescriptor(),
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    internal_static_annotations_perms_Tcn_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_annotations_perms_Tcn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_annotations_perms_Tcn_descriptor,
        new java.lang.String[] { "Wip", "App", "Card", "Features", "Blacklisted", });
    options.internalInit(descriptor.getExtensions().get(0));
    com.tcn.cloud.api.annotations.perms.LicenseProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
