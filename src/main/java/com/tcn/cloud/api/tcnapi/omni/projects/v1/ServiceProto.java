// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcnapi/omni/projects/v1/service.proto

package com.tcn.cloud.api.tcnapi.omni.projects.v1;

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
      "\n%tcnapi/omni/projects/v1/service.proto\022" +
      "\027tcnapi.omni.projects.v1\032\027annotations/au" +
      "thz.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032&tcnapi/omni/pr" +
      "ojects/v1/entities.proto\032&tcnapi/omni/pr" +
      "ojects/v1/projects.proto2\316\007\n\010Projects\022\270\001" +
      "\n\014ListProjects\022,.tcnapi.omni.projects.v1" +
      ".ListProjectsRequest\032-.tcnapi.omni.proje" +
      "cts.v1.ListProjectsResponse\"K\272\270\221\002\005\n\003\010\260\t\202" +
      "\323\344\223\002;\0229/tcnapi/omni/projects/v1/{parent=" +
      "org/*/region/*}/projects\022\256\001\n\nGetProject\022" +
      "*.tcnapi.omni.projects.v1.GetProjectRequ" +
      "est\032 .tcnapi.omni.projects.v1.Project\"R\332" +
      "A\004name\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002;\0229/tcnapi/omni/pro" +
      "jects/v1/{name=org/*/region/*/projects/*" +
      "}\022\307\001\n\rCreateProject\022-.tcnapi.omni.projec" +
      "ts.v1.CreateProjectRequest\032 .tcnapi.omni" +
      ".projects.v1.Project\"e\332A\016parent,project\272" +
      "\270\221\002\005\n\003\010\260\t\202\323\344\223\002D\"9/tcnapi/omni/projects/v" +
      "1/{parent=org/*/region/*}/projects:\007proj" +
      "ect\022\324\001\n\rUpdateProject\022-.tcnapi.omni.proj" +
      "ects.v1.UpdateProjectRequest\032 .tcnapi.om" +
      "ni.projects.v1.Project\"r\332A\023project,updat" +
      "e_mask\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002L2A/tcnapi/omni/pro" +
      "jects/v1/{project.name=org/*/region/*/pr" +
      "ojects/*}:\007project\022\264\001\n\rDeleteProject\022-.t" +
      "cnapi.omni.projects.v1.DeleteProjectRequ" +
      "est\032 .tcnapi.omni.projects.v1.Project\"R\332" +
      "A\004name\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002;*9/tcnapi/omni/pro" +
      "jects/v1/{name=org/*/region/*/projects/*" +
      "}B\270\001\n)com.tcn.cloud.api.tcnapi.omni.proj" +
      "ects.v1B\014ServiceProtoP\001\242\002\003TOP\252\002\027Tcnapi.O" +
      "mni.Projects.V1\312\002\027Tcnapi\\Omni\\Projects\\V" +
      "1\342\002#Tcnapi\\Omni\\Projects\\V1\\GPBMetadata\352" +
      "\002\032Tcnapi::Omni::Projects::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.tcn.cloud.api.tcnapi.omni.projects.v1.EntitiesProto.getDescriptor(),
          com.tcn.cloud.api.tcnapi.omni.projects.v1.ProjectsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.tcn.cloud.api.tcnapi.omni.projects.v1.EntitiesProto.getDescriptor();
    com.tcn.cloud.api.tcnapi.omni.projects.v1.ProjectsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
