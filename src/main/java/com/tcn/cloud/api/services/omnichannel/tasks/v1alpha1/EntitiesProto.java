// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/omnichannel/tasks/v1alpha1/entities.proto

package com.tcn.cloud.api.services.omnichannel.tasks.v1alpha1;

public final class EntitiesProto {
  private EntitiesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2services/omnichannel/tasks/v1alpha1/en" +
      "tities.proto\022#services.omnichannel.tasks" +
      ".v1alpha1\032\035api/commons/omnichannel.proto" +
      "\"3\n\022CancelTasksRequest\022\035\n\010task_sid\030\001 \003(\003" +
      "B\0020\001R\007taskSid\"\025\n\023CancelTasksResponse\"0\n\026" +
      "BulkCancelTasksRequest\022\026\n\006filter\030\001 \001(\tR\006" +
      "filter\"G\n\027BulkCancelTasksResponse\022,\n\022gho" +
      "st_reference_id\030\001 \001(\tR\020ghostReferenceIdB" +
      "\365\001\n5com.tcn.cloud.api.services.omnichann" +
      "el.tasks.v1alpha1B\rEntitiesProtoP\001\242\002\003SOT" +
      "\252\002#Services.Omnichannel.Tasks.V1alpha1\312\002" +
      "#Services\\Omnichannel\\Tasks\\V1alpha1\342\002/S" +
      "ervices\\Omnichannel\\Tasks\\V1alpha1\\GPBMe" +
      "tadata\352\002&Services::Omnichannel::Tasks::V" +
      "1alpha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor(),
        });
    internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksRequest_descriptor,
        new java.lang.String[] { "TaskSid", });
    internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_omnichannel_tasks_v1alpha1_CancelTasksResponse_descriptor,
        new java.lang.String[] { });
    internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksRequest_descriptor,
        new java.lang.String[] { "Filter", });
    internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_omnichannel_tasks_v1alpha1_BulkCancelTasksResponse_descriptor,
        new java.lang.String[] { "GhostReferenceId", });
    com.tcn.cloud.api.api.commons.OmnichannelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
