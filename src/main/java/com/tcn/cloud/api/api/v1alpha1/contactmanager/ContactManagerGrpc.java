package com.tcn.cloud.api.api.v1alpha1.contactmanager;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/contactmanager/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContactManagerGrpc {

  private ContactManagerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.contactmanager.ContactManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse> getGetContactListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactList",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse> getGetContactListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse> getGetContactListMethod;
    if ((getGetContactListMethod = ContactManagerGrpc.getGetContactListMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getGetContactListMethod = ContactManagerGrpc.getGetContactListMethod) == null) {
          ContactManagerGrpc.getGetContactListMethod = getGetContactListMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContactList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("GetContactList"))
              .build();
        }
      }
    }
    return getGetContactListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse> getListContactUpdateTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactUpdateTask",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse> getListContactUpdateTaskMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse> getListContactUpdateTaskMethod;
    if ((getListContactUpdateTaskMethod = ContactManagerGrpc.getListContactUpdateTaskMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getListContactUpdateTaskMethod = ContactManagerGrpc.getListContactUpdateTaskMethod) == null) {
          ContactManagerGrpc.getListContactUpdateTaskMethod = getListContactUpdateTaskMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContactUpdateTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("ListContactUpdateTask"))
              .build();
        }
      }
    }
    return getListContactUpdateTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse> getListContactEntryListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactEntryList",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse> getListContactEntryListMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse> getListContactEntryListMethod;
    if ((getListContactEntryListMethod = ContactManagerGrpc.getListContactEntryListMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getListContactEntryListMethod = ContactManagerGrpc.getListContactEntryListMethod) == null) {
          ContactManagerGrpc.getListContactEntryListMethod = getListContactEntryListMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContactEntryList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("ListContactEntryList"))
              .build();
        }
      }
    }
    return getListContactEntryListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse> getGetEncContactEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEncContactEntry",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse> getGetEncContactEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse> getGetEncContactEntryMethod;
    if ((getGetEncContactEntryMethod = ContactManagerGrpc.getGetEncContactEntryMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getGetEncContactEntryMethod = ContactManagerGrpc.getGetEncContactEntryMethod) == null) {
          ContactManagerGrpc.getGetEncContactEntryMethod = getGetEncContactEntryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEncContactEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("GetEncContactEntry"))
              .build();
        }
      }
    }
    return getGetEncContactEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse> getGetKYCEncContactEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKYCEncContactEntry",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse> getGetKYCEncContactEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse> getGetKYCEncContactEntryMethod;
    if ((getGetKYCEncContactEntryMethod = ContactManagerGrpc.getGetKYCEncContactEntryMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getGetKYCEncContactEntryMethod = ContactManagerGrpc.getGetKYCEncContactEntryMethod) == null) {
          ContactManagerGrpc.getGetKYCEncContactEntryMethod = getGetKYCEncContactEntryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKYCEncContactEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("GetKYCEncContactEntry"))
              .build();
        }
      }
    }
    return getGetKYCEncContactEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse> getGetKYCKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKYCKeys",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse> getGetKYCKeysMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse> getGetKYCKeysMethod;
    if ((getGetKYCKeysMethod = ContactManagerGrpc.getGetKYCKeysMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getGetKYCKeysMethod = ContactManagerGrpc.getGetKYCKeysMethod) == null) {
          ContactManagerGrpc.getGetKYCKeysMethod = getGetKYCKeysMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKYCKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("GetKYCKeys"))
              .build();
        }
      }
    }
    return getGetKYCKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse> getAddContactEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddContactEntry",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse> getAddContactEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse> getAddContactEntryMethod;
    if ((getAddContactEntryMethod = ContactManagerGrpc.getAddContactEntryMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getAddContactEntryMethod = ContactManagerGrpc.getAddContactEntryMethod) == null) {
          ContactManagerGrpc.getAddContactEntryMethod = getAddContactEntryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddContactEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("AddContactEntry"))
              .build();
        }
      }
    }
    return getAddContactEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse> getEditContactEntryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditContactEntry",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse> getEditContactEntryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse> getEditContactEntryMethod;
    if ((getEditContactEntryMethod = ContactManagerGrpc.getEditContactEntryMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getEditContactEntryMethod = ContactManagerGrpc.getEditContactEntryMethod) == null) {
          ContactManagerGrpc.getEditContactEntryMethod = getEditContactEntryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditContactEntry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("EditContactEntry"))
              .build();
        }
      }
    }
    return getEditContactEntryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse> getListContactsByEntityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactsByEntity",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse> getListContactsByEntityMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse> getListContactsByEntityMethod;
    if ((getListContactsByEntityMethod = ContactManagerGrpc.getListContactsByEntityMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getListContactsByEntityMethod = ContactManagerGrpc.getListContactsByEntityMethod) == null) {
          ContactManagerGrpc.getListContactsByEntityMethod = getListContactsByEntityMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContactsByEntity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("ListContactsByEntity"))
              .build();
        }
      }
    }
    return getListContactsByEntityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse> getGetContactFieldTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContactFieldType",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse> getGetContactFieldTypeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse> getGetContactFieldTypeMethod;
    if ((getGetContactFieldTypeMethod = ContactManagerGrpc.getGetContactFieldTypeMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getGetContactFieldTypeMethod = ContactManagerGrpc.getGetContactFieldTypeMethod) == null) {
          ContactManagerGrpc.getGetContactFieldTypeMethod = getGetContactFieldTypeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContactFieldType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("GetContactFieldType"))
              .build();
        }
      }
    }
    return getGetContactFieldTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse> getListContactActivityLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContactActivityLog",
      requestType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest,
      com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse> getListContactActivityLogMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse> getListContactActivityLogMethod;
    if ((getListContactActivityLogMethod = ContactManagerGrpc.getListContactActivityLogMethod) == null) {
      synchronized (ContactManagerGrpc.class) {
        if ((getListContactActivityLogMethod = ContactManagerGrpc.getListContactActivityLogMethod) == null) {
          ContactManagerGrpc.getListContactActivityLogMethod = getListContactActivityLogMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest, com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContactActivityLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ContactManagerMethodDescriptorSupplier("ListContactActivityLog"))
              .build();
        }
      }
    }
    return getListContactActivityLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactManagerStub>() {
        @java.lang.Override
        public ContactManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactManagerStub(channel, callOptions);
        }
      };
    return ContactManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactManagerBlockingStub>() {
        @java.lang.Override
        public ContactManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactManagerBlockingStub(channel, callOptions);
        }
      };
    return ContactManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContactManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContactManagerFutureStub>() {
        @java.lang.Override
        public ContactManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContactManagerFutureStub(channel, callOptions);
        }
      };
    return ContactManagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getContactList(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContactListMethod(), responseObserver);
    }

    /**
     */
    default void listContactUpdateTask(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactUpdateTaskMethod(), responseObserver);
    }

    /**
     */
    default void listContactEntryList(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactEntryListMethod(), responseObserver);
    }

    /**
     */
    default void getEncContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEncContactEntryMethod(), responseObserver);
    }

    /**
     */
    default void getKYCEncContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKYCEncContactEntryMethod(), responseObserver);
    }

    /**
     */
    default void getKYCKeys(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetKYCKeysMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *Adds a new contact entry based on the provided request.
     * </pre>
     */
    default void addContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddContactEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *Edits the fields of an existing contact entry...
     * </pre>
     */
    default void editContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditContactEntryMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *List contacts for entity
     * </pre>
     */
    default void listContactsByEntity(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactsByEntityMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *Get Contact Field Type
     * </pre>
     */
    default void getContactFieldType(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContactFieldTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     *List Audit history for a Contact
     * </pre>
     */
    default void listContactActivityLog(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContactActivityLogMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContactManager.
   */
  public static abstract class ContactManagerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContactManagerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContactManager.
   */
  public static final class ContactManagerStub
      extends io.grpc.stub.AbstractAsyncStub<ContactManagerStub> {
    private ContactManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactManagerStub(channel, callOptions);
    }

    /**
     */
    public void getContactList(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContactListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listContactUpdateTask(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactUpdateTaskMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listContactEntryList(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactEntryListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEncContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEncContactEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKYCEncContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKYCEncContactEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKYCKeys(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetKYCKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *Adds a new contact entry based on the provided request.
     * </pre>
     */
    public void addContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddContactEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *Edits the fields of an existing contact entry...
     * </pre>
     */
    public void editContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditContactEntryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *List contacts for entity
     * </pre>
     */
    public void listContactsByEntity(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactsByEntityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *Get Contact Field Type
     * </pre>
     */
    public void getContactFieldType(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContactFieldTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     *List Audit history for a Contact
     * </pre>
     */
    public void listContactActivityLog(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContactActivityLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContactManager.
   */
  public static final class ContactManagerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContactManagerBlockingStub> {
    private ContactManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse getContactList(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContactListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse listContactUpdateTask(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactUpdateTaskMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse listContactEntryList(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactEntryListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse getEncContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEncContactEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse getKYCEncContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKYCEncContactEntryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse getKYCKeys(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetKYCKeysMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *Adds a new contact entry based on the provided request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse addContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddContactEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *Edits the fields of an existing contact entry...
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse editContactEntry(com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditContactEntryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *List contacts for entity
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse listContactsByEntity(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactsByEntityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *Get Contact Field Type
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse getContactFieldType(com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContactFieldTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     *List Audit history for a Contact
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse listContactActivityLog(com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContactActivityLogMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContactManager.
   */
  public static final class ContactManagerFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContactManagerFutureStub> {
    private ContactManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContactManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse> getContactList(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContactListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse> listContactUpdateTask(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactUpdateTaskMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse> listContactEntryList(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactEntryListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse> getEncContactEntry(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEncContactEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse> getKYCEncContactEntry(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKYCEncContactEntryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse> getKYCKeys(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetKYCKeysMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *Adds a new contact entry based on the provided request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse> addContactEntry(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddContactEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *Edits the fields of an existing contact entry...
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse> editContactEntry(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditContactEntryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *List contacts for entity
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse> listContactsByEntity(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactsByEntityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *Get Contact Field Type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse> getContactFieldType(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContactFieldTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     *List Audit history for a Contact
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse> listContactActivityLog(
        com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContactActivityLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONTACT_LIST = 0;
  private static final int METHODID_LIST_CONTACT_UPDATE_TASK = 1;
  private static final int METHODID_LIST_CONTACT_ENTRY_LIST = 2;
  private static final int METHODID_GET_ENC_CONTACT_ENTRY = 3;
  private static final int METHODID_GET_KYCENC_CONTACT_ENTRY = 4;
  private static final int METHODID_GET_KYCKEYS = 5;
  private static final int METHODID_ADD_CONTACT_ENTRY = 6;
  private static final int METHODID_EDIT_CONTACT_ENTRY = 7;
  private static final int METHODID_LIST_CONTACTS_BY_ENTITY = 8;
  private static final int METHODID_GET_CONTACT_FIELD_TYPE = 9;
  private static final int METHODID_LIST_CONTACT_ACTIVITY_LOG = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CONTACT_LIST:
          serviceImpl.getContactList((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_UPDATE_TASK:
          serviceImpl.listContactUpdateTask((com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_ENTRY_LIST:
          serviceImpl.listContactEntryList((com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse>) responseObserver);
          break;
        case METHODID_GET_ENC_CONTACT_ENTRY:
          serviceImpl.getEncContactEntry((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse>) responseObserver);
          break;
        case METHODID_GET_KYCENC_CONTACT_ENTRY:
          serviceImpl.getKYCEncContactEntry((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse>) responseObserver);
          break;
        case METHODID_GET_KYCKEYS:
          serviceImpl.getKYCKeys((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse>) responseObserver);
          break;
        case METHODID_ADD_CONTACT_ENTRY:
          serviceImpl.addContactEntry((com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse>) responseObserver);
          break;
        case METHODID_EDIT_CONTACT_ENTRY:
          serviceImpl.editContactEntry((com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTACTS_BY_ENTITY:
          serviceImpl.listContactsByEntity((com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse>) responseObserver);
          break;
        case METHODID_GET_CONTACT_FIELD_TYPE:
          serviceImpl.getContactFieldType((com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTACT_ACTIVITY_LOG:
          serviceImpl.listContactActivityLog((com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetContactListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactListResponse>(
                service, METHODID_GET_CONTACT_LIST)))
        .addMethod(
          getListContactUpdateTaskMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactUpdateTaskResponse>(
                service, METHODID_LIST_CONTACT_UPDATE_TASK)))
        .addMethod(
          getListContactEntryListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactEntryListResponse>(
                service, METHODID_LIST_CONTACT_ENTRY_LIST)))
        .addMethod(
          getGetEncContactEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetEncContactEntryResponse>(
                service, METHODID_GET_ENC_CONTACT_ENTRY)))
        .addMethod(
          getGetKYCEncContactEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCEncContactEntryResponse>(
                service, METHODID_GET_KYCENC_CONTACT_ENTRY)))
        .addMethod(
          getGetKYCKeysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetKYCKeysResponse>(
                service, METHODID_GET_KYCKEYS)))
        .addMethod(
          getAddContactEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.AddContactEntryResponse>(
                service, METHODID_ADD_CONTACT_ENTRY)))
        .addMethod(
          getEditContactEntryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.EditContactEntryResponse>(
                service, METHODID_EDIT_CONTACT_ENTRY)))
        .addMethod(
          getListContactsByEntityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactsByEntityResponse>(
                service, METHODID_LIST_CONTACTS_BY_ENTITY)))
        .addMethod(
          getGetContactFieldTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.GetContactFieldTypeResponse>(
                service, METHODID_GET_CONTACT_FIELD_TYPE)))
        .addMethod(
          getListContactActivityLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogRequest,
              com.tcn.cloud.api.api.v1alpha1.contactmanager.ListContactActivityLogResponse>(
                service, METHODID_LIST_CONTACT_ACTIVITY_LOG)))
        .build();
  }

  private static abstract class ContactManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.contactmanager.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContactManager");
    }
  }

  private static final class ContactManagerFileDescriptorSupplier
      extends ContactManagerBaseDescriptorSupplier {
    ContactManagerFileDescriptorSupplier() {}
  }

  private static final class ContactManagerMethodDescriptorSupplier
      extends ContactManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContactManagerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ContactManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactManagerFileDescriptorSupplier())
              .addMethod(getGetContactListMethod())
              .addMethod(getListContactUpdateTaskMethod())
              .addMethod(getListContactEntryListMethod())
              .addMethod(getGetEncContactEntryMethod())
              .addMethod(getGetKYCEncContactEntryMethod())
              .addMethod(getGetKYCKeysMethod())
              .addMethod(getAddContactEntryMethod())
              .addMethod(getEditContactEntryMethod())
              .addMethod(getListContactsByEntityMethod())
              .addMethod(getGetContactFieldTypeMethod())
              .addMethod(getListContactActivityLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
