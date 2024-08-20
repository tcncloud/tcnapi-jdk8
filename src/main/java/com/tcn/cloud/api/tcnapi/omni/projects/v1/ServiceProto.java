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
      "ojects/v1/projects.proto2\341\007\n\010Projects\022\303\001" +
      "\n\014ListProjects\022,.tcnapi.omni.projects.v1" +
      ".ListProjectsRequest\032-.tcnapi.omni.proje" +
      "cts.v1.ListProjectsResponse\"V\332A\006parent\272\270" +
      "\221\002\005\n\003\010\260\t\202\323\344\223\002=\022;/tcnapi/omni/projects/v1" +
      "/{parent=regions/*/orgs/*}/projects\022\260\001\n\n" +
      "GetProject\022*.tcnapi.omni.projects.v1.Get" +
      "ProjectRequest\032 .tcnapi.omni.projects.v1" +
      ".Project\"T\332A\004name\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002=\022;/tcna" +
      "pi/omni/projects/v1/{name=regions/*/orgs" +
      "/*/projects/*}\022\311\001\n\rCreateProject\022-.tcnap" +
      "i.omni.projects.v1.CreateProjectRequest\032" +
      " .tcnapi.omni.projects.v1.Project\"g\332A\016pa" +
      "rent,project\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002F\";/tcnapi/om" +
      "ni/projects/v1/{parent=regions/*/orgs/*}" +
      "/projects:\007project\022\326\001\n\rUpdateProject\022-.t" +
      "cnapi.omni.projects.v1.UpdateProjectRequ" +
      "est\032 .tcnapi.omni.projects.v1.Project\"t\332" +
      "A\023project,update_mask\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002N2C/" +
      "tcnapi/omni/projects/v1/{project.name=re" +
      "gions/*/orgs/*/projects/*}:\007project\022\266\001\n\r" +
      "DeleteProject\022-.tcnapi.omni.projects.v1." +
      "DeleteProjectRequest\032 .tcnapi.omni.proje" +
      "cts.v1.Project\"T\332A\004name\272\270\221\002\005\n\003\010\260\t\202\323\344\223\002=*" +
      ";/tcnapi/omni/projects/v1/{name=regions/" +
      "*/orgs/*/projects/*}B\270\001\n)com.tcn.cloud.a" +
      "pi.tcnapi.omni.projects.v1B\014ServiceProto" +
      "P\001\242\002\003TOP\252\002\027Tcnapi.Omni.Projects.V1\312\002\027Tcn" +
      "api\\Omni\\Projects\\V1\342\002#Tcnapi\\Omni\\Proje" +
      "cts\\V1\\GPBMetadata\352\002\032Tcnapi::Omni::Proje" +
      "cts::V1b\006proto3"
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
