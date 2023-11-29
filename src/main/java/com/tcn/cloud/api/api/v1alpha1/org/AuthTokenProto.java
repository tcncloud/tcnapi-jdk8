// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/auth_token.proto

package com.tcn.cloud.api.api.v1alpha1.org;

public final class AuthTokenProto {
  private AuthTokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_CreateAuthTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_CreateAuthTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_CreateAuthTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_CreateAuthTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_ListAuthTokensRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_ListAuthTokensRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_ListAuthTokensResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_ListAuthTokensResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_ListAuthTokensByUserIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_ListAuthTokensByUserIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_ListAuthTokensByUserIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_ListAuthTokensByUserIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_SetAuthTokenExpirationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_SetAuthTokenExpirationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_DeleteAuthTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_DeleteAuthTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_DeleteAuthTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_DeleteAuthTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!api/v1alpha1/org/auth_token.proto\022\020api" +
      ".v1alpha1.org\032 api/commons/org/auth_toke" +
      "n.proto\"\030\n\026CreateAuthTokenRequest\"T\n\027Cre" +
      "ateAuthTokenResponse\0229\n\nauth_token\030\001 \001(\013" +
      "2\032.api.commons.org.AuthTokenR\tauthToken\"" +
      "9\n\036CreateAuthTokenByUserIdRequest\022\027\n\007use" +
      "r_id\030\001 \001(\tR\006userId\"\\\n\037CreateAuthTokenByU" +
      "serIdResponse\0229\n\nauth_token\030\001 \001(\0132\032.api." +
      "commons.org.AuthTokenR\tauthToken\"\027\n\025List" +
      "AuthTokensRequest\"U\n\026ListAuthTokensRespo" +
      "nse\022;\n\013auth_tokens\030\001 \003(\0132\032.api.commons.o" +
      "rg.AuthTokenR\nauthTokens\"8\n\035ListAuthToke" +
      "nsByUserIdRequest\022\027\n\007user_id\030\001 \001(\tR\006user" +
      "Id\"]\n\036ListAuthTokensByUserIdResponse\022;\n\013" +
      "auth_tokens\030\001 \003(\0132\032.api.commons.org.Auth" +
      "TokenR\nauthTokens\"5\n\035SetAuthTokenExpirat" +
      "ionRequest\022\024\n\005token\030\001 \001(\tR\005token\" \n\036SetA" +
      "uthTokenExpirationResponse\"V\n%SetAuthTok" +
      "enExpirationByUserIdRequest\022\024\n\005token\030\001 \001" +
      "(\tR\005token\022\027\n\007user_id\030\002 \001(\tR\006userId\"(\n&Se" +
      "tAuthTokenExpirationByUserIdResponse\".\n\026" +
      "DeleteAuthTokenRequest\022\024\n\005token\030\001 \001(\tR\005t" +
      "oken\"\031\n\027DeleteAuthTokenResponse\"O\n\036Delet" +
      "eAuthTokenByUserIdRequest\022\024\n\005token\030\001 \001(\t" +
      "R\005token\022\027\n\007user_id\030\002 \001(\tR\006userId\"!\n\037Dele" +
      "teAuthTokenByUserIdResponseB\226\001\n\"com.tcn." +
      "cloud.api.api.v1alpha1.orgB\016AuthTokenPro" +
      "toP\001\242\002\003AVO\252\002\020Api.V1alpha1.Org\312\002\020Api\\V1al" +
      "pha1\\Org\342\002\034Api\\V1alpha1\\Org\\GPBMetadata\352" +
      "\002\022Api::V1alpha1::Orgb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.org.AuthTokenProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_org_CreateAuthTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_org_CreateAuthTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_CreateAuthTokenRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_CreateAuthTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_org_CreateAuthTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_CreateAuthTokenResponse_descriptor,
        new java.lang.String[] { "AuthToken", });
    internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_CreateAuthTokenByUserIdResponse_descriptor,
        new java.lang.String[] { "AuthToken", });
    internal_static_api_v1alpha1_org_ListAuthTokensRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_org_ListAuthTokensRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_ListAuthTokensRequest_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_ListAuthTokensResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_org_ListAuthTokensResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_ListAuthTokensResponse_descriptor,
        new java.lang.String[] { "AuthTokens", });
    internal_static_api_v1alpha1_org_ListAuthTokensByUserIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_org_ListAuthTokensByUserIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_ListAuthTokensByUserIdRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_api_v1alpha1_org_ListAuthTokensByUserIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_org_ListAuthTokensByUserIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_ListAuthTokensByUserIdResponse_descriptor,
        new java.lang.String[] { "AuthTokens", });
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_SetAuthTokenExpirationRequest_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_SetAuthTokenExpirationResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdRequest_descriptor,
        new java.lang.String[] { "Token", "UserId", });
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_SetAuthTokenExpirationByUserIdResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_DeleteAuthTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_org_DeleteAuthTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_DeleteAuthTokenRequest_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_api_v1alpha1_org_DeleteAuthTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_org_DeleteAuthTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_DeleteAuthTokenResponse_descriptor,
        new java.lang.String[] { });
    internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdRequest_descriptor,
        new java.lang.String[] { "Token", "UserId", });
    internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_org_DeleteAuthTokenByUserIdResponse_descriptor,
        new java.lang.String[] { });
    com.tcn.cloud.api.api.commons.org.AuthTokenProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
