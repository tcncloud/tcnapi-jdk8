// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/labels.proto

package com.tcn.cloud.api.api.commons;

public final class LabelsProto {
  private LabelsProto() {}
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
      "\n\030api/commons/labels.proto\022\013api.commons*" +
      "Y\n\nEntityType\022\027\n\023ENTITY_TYPE_INVALID\020\000\022\024" +
      "\n\020ENTITY_TYPE_USER\020\001\022\034\n\030ENTITY_TYPE_LMS_" +
      "PIPELINE\020\002*\203\001\n\rLabeledEntity\022\036\n\032LABELED_" +
      "ENTITY_UNSPECIFIED\020\000\022\036\n\032LABELED_ENTITY_S" +
      "KILL_GROUP\020\001\022\027\n\023LABELED_ENTITY_USER\020\002\022\031\n" +
      "\025LABELED_ENTITY_TICKET\020\003By\n\035com.tcn.clou" +
      "d.api.api.commonsB\013LabelsProtoP\001\242\002\003ACX\252\002" +
      "\013Api.Commons\312\002\013Api\\Commons\342\002\027Api\\Commons" +
      "\\GPBMetadata\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
