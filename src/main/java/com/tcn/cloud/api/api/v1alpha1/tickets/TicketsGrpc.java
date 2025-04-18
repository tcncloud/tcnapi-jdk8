package com.tcn.cloud.api.api.v1alpha1.tickets;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/tickets/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TicketsGrpc {

  private TicketsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.tickets.Tickets";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> getCreateTicketMethod;
    if ((getCreateTicketMethod = TicketsGrpc.getCreateTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCreateTicketMethod = TicketsGrpc.getCreateTicketMethod) == null) {
          TicketsGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CreateTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> getEditTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> getEditTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> getEditTicketMethod;
    if ((getEditTicketMethod = TicketsGrpc.getEditTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getEditTicketMethod = TicketsGrpc.getEditTicketMethod) == null) {
          TicketsGrpc.getEditTicketMethod = getEditTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("EditTicket"))
              .build();
        }
      }
    }
    return getEditTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> getListTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTickets",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> getListTicketsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> getListTicketsMethod;
    if ((getListTicketsMethod = TicketsGrpc.getListTicketsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListTicketsMethod = TicketsGrpc.getListTicketsMethod) == null) {
          TicketsGrpc.getListTicketsMethod = getListTicketsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListTickets"))
              .build();
        }
      }
    }
    return getListTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> getAssignTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> getAssignTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> getAssignTicketMethod;
    if ((getAssignTicketMethod = TicketsGrpc.getAssignTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getAssignTicketMethod = TicketsGrpc.getAssignTicketMethod) == null) {
          TicketsGrpc.getAssignTicketMethod = getAssignTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("AssignTicket"))
              .build();
        }
      }
    }
    return getAssignTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> getCloseTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> getCloseTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> getCloseTicketMethod;
    if ((getCloseTicketMethod = TicketsGrpc.getCloseTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCloseTicketMethod = TicketsGrpc.getCloseTicketMethod) == null) {
          TicketsGrpc.getCloseTicketMethod = getCloseTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CloseTicket"))
              .build();
        }
      }
    }
    return getCloseTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> getViewTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> getViewTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> getViewTicketMethod;
    if ((getViewTicketMethod = TicketsGrpc.getViewTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getViewTicketMethod = TicketsGrpc.getViewTicketMethod) == null) {
          TicketsGrpc.getViewTicketMethod = getViewTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ViewTicket"))
              .build();
        }
      }
    }
    return getViewTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> getCreateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateComment",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> getCreateCommentMethod;
    if ((getCreateCommentMethod = TicketsGrpc.getCreateCommentMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCreateCommentMethod = TicketsGrpc.getCreateCommentMethod) == null) {
          TicketsGrpc.getCreateCommentMethod = getCreateCommentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CreateComment"))
              .build();
        }
      }
    }
    return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> getEnableProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableProject",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> getEnableProjectMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq, com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> getEnableProjectMethod;
    if ((getEnableProjectMethod = TicketsGrpc.getEnableProjectMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getEnableProjectMethod = TicketsGrpc.getEnableProjectMethod) == null) {
          TicketsGrpc.getEnableProjectMethod = getEnableProjectMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq, com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("EnableProject"))
              .build();
        }
      }
    }
    return getEnableProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> getListEnabledProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEnabledProjects",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> getListEnabledProjectsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> getListEnabledProjectsMethod;
    if ((getListEnabledProjectsMethod = TicketsGrpc.getListEnabledProjectsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListEnabledProjectsMethod = TicketsGrpc.getListEnabledProjectsMethod) == null) {
          TicketsGrpc.getListEnabledProjectsMethod = getListEnabledProjectsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEnabledProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListEnabledProjects"))
              .build();
        }
      }
    }
    return getListEnabledProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> getCreateSLAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSLA",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> getCreateSLAMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> getCreateSLAMethod;
    if ((getCreateSLAMethod = TicketsGrpc.getCreateSLAMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCreateSLAMethod = TicketsGrpc.getCreateSLAMethod) == null) {
          TicketsGrpc.getCreateSLAMethod = getCreateSLAMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSLA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CreateSLA"))
              .build();
        }
      }
    }
    return getCreateSLAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> getListSLAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSLA",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> getListSLAMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> getListSLAMethod;
    if ((getListSLAMethod = TicketsGrpc.getListSLAMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListSLAMethod = TicketsGrpc.getListSLAMethod) == null) {
          TicketsGrpc.getListSLAMethod = getListSLAMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSLA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListSLA"))
              .build();
        }
      }
    }
    return getListSLAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> getUpdateSLAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSLA",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> getUpdateSLAMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq, com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> getUpdateSLAMethod;
    if ((getUpdateSLAMethod = TicketsGrpc.getUpdateSLAMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getUpdateSLAMethod = TicketsGrpc.getUpdateSLAMethod) == null) {
          TicketsGrpc.getUpdateSLAMethod = getUpdateSLAMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq, com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSLA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("UpdateSLA"))
              .build();
        }
      }
    }
    return getUpdateSLAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> getListSLAConditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSLACondition",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> getListSLAConditionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> getListSLAConditionMethod;
    if ((getListSLAConditionMethod = TicketsGrpc.getListSLAConditionMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListSLAConditionMethod = TicketsGrpc.getListSLAConditionMethod) == null) {
          TicketsGrpc.getListSLAConditionMethod = getListSLAConditionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSLACondition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListSLACondition"))
              .build();
        }
      }
    }
    return getListSLAConditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> getReplyCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyComment",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> getReplyCommentMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq, com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> getReplyCommentMethod;
    if ((getReplyCommentMethod = TicketsGrpc.getReplyCommentMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getReplyCommentMethod = TicketsGrpc.getReplyCommentMethod) == null) {
          TicketsGrpc.getReplyCommentMethod = getReplyCommentMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq, com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ReplyComment"))
              .build();
        }
      }
    }
    return getReplyCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> getListTicketAuditLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTicketAuditLog",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> getListTicketAuditLogMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> getListTicketAuditLogMethod;
    if ((getListTicketAuditLogMethod = TicketsGrpc.getListTicketAuditLogMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListTicketAuditLogMethod = TicketsGrpc.getListTicketAuditLogMethod) == null) {
          TicketsGrpc.getListTicketAuditLogMethod = getListTicketAuditLogMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTicketAuditLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListTicketAuditLog"))
              .build();
        }
      }
    }
    return getListTicketAuditLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> getAssignSelfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignSelf",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> getAssignSelfMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> getAssignSelfMethod;
    if ((getAssignSelfMethod = TicketsGrpc.getAssignSelfMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getAssignSelfMethod = TicketsGrpc.getAssignSelfMethod) == null) {
          TicketsGrpc.getAssignSelfMethod = getAssignSelfMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq, com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignSelf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("AssignSelf"))
              .build();
        }
      }
    }
    return getAssignSelfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes> getEditMaskTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditMaskTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes> getEditMaskTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes> getEditMaskTicketMethod;
    if ((getEditMaskTicketMethod = TicketsGrpc.getEditMaskTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getEditMaskTicketMethod = TicketsGrpc.getEditMaskTicketMethod) == null) {
          TicketsGrpc.getEditMaskTicketMethod = getEditMaskTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditMaskTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("EditMaskTicket"))
              .build();
        }
      }
    }
    return getEditMaskTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes> getListAllocatedTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllocatedTickets",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes> getListAllocatedTicketsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes> getListAllocatedTicketsMethod;
    if ((getListAllocatedTicketsMethod = TicketsGrpc.getListAllocatedTicketsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListAllocatedTicketsMethod = TicketsGrpc.getListAllocatedTicketsMethod) == null) {
          TicketsGrpc.getListAllocatedTicketsMethod = getListAllocatedTicketsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq, com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllocatedTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListAllocatedTickets"))
              .build();
        }
      }
    }
    return getListAllocatedTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse> getListAvailableAgentTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableAgentTickets",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse> getListAvailableAgentTicketsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse> getListAvailableAgentTicketsMethod;
    if ((getListAvailableAgentTicketsMethod = TicketsGrpc.getListAvailableAgentTicketsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListAvailableAgentTicketsMethod = TicketsGrpc.getListAvailableAgentTicketsMethod) == null) {
          TicketsGrpc.getListAvailableAgentTicketsMethod = getListAvailableAgentTicketsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableAgentTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListAvailableAgentTickets"))
              .build();
        }
      }
    }
    return getListAvailableAgentTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse> getListAgentTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentTickets",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse> getListAgentTicketsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse> getListAgentTicketsMethod;
    if ((getListAgentTicketsMethod = TicketsGrpc.getListAgentTicketsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListAgentTicketsMethod = TicketsGrpc.getListAgentTicketsMethod) == null) {
          TicketsGrpc.getListAgentTicketsMethod = getListAgentTicketsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAgentTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListAgentTickets"))
              .build();
        }
      }
    }
    return getListAgentTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse> getListSkillsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSkills",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse> getListSkillsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse> getListSkillsMethod;
    if ((getListSkillsMethod = TicketsGrpc.getListSkillsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListSkillsMethod = TicketsGrpc.getListSkillsMethod) == null) {
          TicketsGrpc.getListSkillsMethod = getListSkillsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSkills"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListSkills"))
              .build();
        }
      }
    }
    return getListSkillsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = TicketsGrpc.getListUsersMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListUsersMethod = TicketsGrpc.getListUsersMethod) == null) {
          TicketsGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse> getCloseTicketActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CloseTicketAction",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse> getCloseTicketActionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse> getCloseTicketActionMethod;
    if ((getCloseTicketActionMethod = TicketsGrpc.getCloseTicketActionMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCloseTicketActionMethod = TicketsGrpc.getCloseTicketActionMethod) == null) {
          TicketsGrpc.getCloseTicketActionMethod = getCloseTicketActionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CloseTicketAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CloseTicketAction"))
              .build();
        }
      }
    }
    return getCloseTicketActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse> getAssignTicketActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignTicketAction",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse> getAssignTicketActionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest, com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse> getAssignTicketActionMethod;
    if ((getAssignTicketActionMethod = TicketsGrpc.getAssignTicketActionMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getAssignTicketActionMethod = TicketsGrpc.getAssignTicketActionMethod) == null) {
          TicketsGrpc.getAssignTicketActionMethod = getAssignTicketActionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest, com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignTicketAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("AssignTicketAction"))
              .build();
        }
      }
    }
    return getAssignTicketActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse> getCreateTicketActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicketAction",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse> getCreateTicketActionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse> getCreateTicketActionMethod;
    if ((getCreateTicketActionMethod = TicketsGrpc.getCreateTicketActionMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCreateTicketActionMethod = TicketsGrpc.getCreateTicketActionMethod) == null) {
          TicketsGrpc.getCreateTicketActionMethod = getCreateTicketActionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTicketAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CreateTicketAction"))
              .build();
        }
      }
    }
    return getCreateTicketActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse> getChangeTicketStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeTicketStatus",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse> getChangeTicketStatusMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse> getChangeTicketStatusMethod;
    if ((getChangeTicketStatusMethod = TicketsGrpc.getChangeTicketStatusMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getChangeTicketStatusMethod = TicketsGrpc.getChangeTicketStatusMethod) == null) {
          TicketsGrpc.getChangeTicketStatusMethod = getChangeTicketStatusMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeTicketStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ChangeTicketStatus"))
              .build();
        }
      }
    }
    return getChangeTicketStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse> getCreateTicketTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicketTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse> getCreateTicketTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse> getCreateTicketTemplateMethod;
    if ((getCreateTicketTemplateMethod = TicketsGrpc.getCreateTicketTemplateMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCreateTicketTemplateMethod = TicketsGrpc.getCreateTicketTemplateMethod) == null) {
          TicketsGrpc.getCreateTicketTemplateMethod = getCreateTicketTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTicketTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CreateTicketTemplate"))
              .build();
        }
      }
    }
    return getCreateTicketTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse> getEditTicketTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditTicketTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse> getEditTicketTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse> getEditTicketTemplateMethod;
    if ((getEditTicketTemplateMethod = TicketsGrpc.getEditTicketTemplateMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getEditTicketTemplateMethod = TicketsGrpc.getEditTicketTemplateMethod) == null) {
          TicketsGrpc.getEditTicketTemplateMethod = getEditTicketTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditTicketTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("EditTicketTemplate"))
              .build();
        }
      }
    }
    return getEditTicketTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse> getListTicketTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTicketTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse> getListTicketTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse> getListTicketTemplateMethod;
    if ((getListTicketTemplateMethod = TicketsGrpc.getListTicketTemplateMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListTicketTemplateMethod = TicketsGrpc.getListTicketTemplateMethod) == null) {
          TicketsGrpc.getListTicketTemplateMethod = getListTicketTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTicketTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListTicketTemplate"))
              .build();
        }
      }
    }
    return getListTicketTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse> getAssignTicketTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignTicketTemplate",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse> getAssignTicketTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse> getAssignTicketTemplateMethod;
    if ((getAssignTicketTemplateMethod = TicketsGrpc.getAssignTicketTemplateMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getAssignTicketTemplateMethod = TicketsGrpc.getAssignTicketTemplateMethod) == null) {
          TicketsGrpc.getAssignTicketTemplateMethod = getAssignTicketTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest, com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignTicketTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("AssignTicketTemplate"))
              .build();
        }
      }
    }
    return getAssignTicketTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse> getGetAllActionTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllActionType",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse> getGetAllActionTypeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest, com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse> getGetAllActionTypeMethod;
    if ((getGetAllActionTypeMethod = TicketsGrpc.getGetAllActionTypeMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getGetAllActionTypeMethod = TicketsGrpc.getGetAllActionTypeMethod) == null) {
          TicketsGrpc.getGetAllActionTypeMethod = getGetAllActionTypeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest, com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllActionType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("GetAllActionType"))
              .build();
        }
      }
    }
    return getGetAllActionTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse> getGetPhoneNumberTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPhoneNumberType",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse> getGetPhoneNumberTypeMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest, com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse> getGetPhoneNumberTypeMethod;
    if ((getGetPhoneNumberTypeMethod = TicketsGrpc.getGetPhoneNumberTypeMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getGetPhoneNumberTypeMethod = TicketsGrpc.getGetPhoneNumberTypeMethod) == null) {
          TicketsGrpc.getGetPhoneNumberTypeMethod = getGetPhoneNumberTypeMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest, com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPhoneNumberType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("GetPhoneNumberType"))
              .build();
        }
      }
    }
    return getGetPhoneNumberTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse> getAddEntityRefMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEntityRef",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse> getAddEntityRefMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest, com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse> getAddEntityRefMethod;
    if ((getAddEntityRefMethod = TicketsGrpc.getAddEntityRefMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getAddEntityRefMethod = TicketsGrpc.getAddEntityRefMethod) == null) {
          TicketsGrpc.getAddEntityRefMethod = getAddEntityRefMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest, com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEntityRef"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("AddEntityRef"))
              .build();
        }
      }
    }
    return getAddEntityRefMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse> getListTicketsByEntityRefMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTicketsByEntityRef",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse> getListTicketsByEntityRefMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse> getListTicketsByEntityRefMethod;
    if ((getListTicketsByEntityRefMethod = TicketsGrpc.getListTicketsByEntityRefMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListTicketsByEntityRefMethod = TicketsGrpc.getListTicketsByEntityRefMethod) == null) {
          TicketsGrpc.getListTicketsByEntityRefMethod = getListTicketsByEntityRefMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTicketsByEntityRef"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListTicketsByEntityRef"))
              .build();
        }
      }
    }
    return getListTicketsByEntityRefMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse> getListEntityRefsByTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEntityRefsByTicket",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse> getListEntityRefsByTicketMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse> getListEntityRefsByTicketMethod;
    if ((getListEntityRefsByTicketMethod = TicketsGrpc.getListEntityRefsByTicketMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListEntityRefsByTicketMethod = TicketsGrpc.getListEntityRefsByTicketMethod) == null) {
          TicketsGrpc.getListEntityRefsByTicketMethod = getListEntityRefsByTicketMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEntityRefsByTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListEntityRefsByTicket"))
              .build();
        }
      }
    }
    return getListEntityRefsByTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse> getCreateCustomFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomField",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse> getCreateCustomFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse> getCreateCustomFieldMethod;
    if ((getCreateCustomFieldMethod = TicketsGrpc.getCreateCustomFieldMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getCreateCustomFieldMethod = TicketsGrpc.getCreateCustomFieldMethod) == null) {
          TicketsGrpc.getCreateCustomFieldMethod = getCreateCustomFieldMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest, com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("CreateCustomField"))
              .build();
        }
      }
    }
    return getCreateCustomFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse> getEditCustomFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditCustomField",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse> getEditCustomFieldMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest, com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse> getEditCustomFieldMethod;
    if ((getEditCustomFieldMethod = TicketsGrpc.getEditCustomFieldMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getEditCustomFieldMethod = TicketsGrpc.getEditCustomFieldMethod) == null) {
          TicketsGrpc.getEditCustomFieldMethod = getEditCustomFieldMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest, com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditCustomField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("EditCustomField"))
              .build();
        }
      }
    }
    return getEditCustomFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse> getListCustomFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCustomFields",
      requestType = com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest,
      com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse> getListCustomFieldsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse> getListCustomFieldsMethod;
    if ((getListCustomFieldsMethod = TicketsGrpc.getListCustomFieldsMethod) == null) {
      synchronized (TicketsGrpc.class) {
        if ((getListCustomFieldsMethod = TicketsGrpc.getListCustomFieldsMethod) == null) {
          TicketsGrpc.getListCustomFieldsMethod = getListCustomFieldsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest, com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCustomFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketsMethodDescriptorSupplier("ListCustomFields"))
              .build();
        }
      }
    }
    return getListCustomFieldsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketsStub>() {
        @java.lang.Override
        public TicketsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketsStub(channel, callOptions);
        }
      };
    return TicketsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketsBlockingStub>() {
        @java.lang.Override
        public TicketsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketsBlockingStub(channel, callOptions);
        }
      };
    return TicketsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketsFutureStub>() {
        @java.lang.Override
        public TicketsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketsFutureStub(channel, callOptions);
        }
      };
    return TicketsFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    default void createTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * </pre>
     */
    @java.lang.Deprecated
    default void editTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    default void listTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTicketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * Would be deprecated
     * </pre>
     */
    @java.lang.Deprecated
    default void assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    default void closeTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    default void viewTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    default void createComment(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    default void enableProject(com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    default void listEnabledProjects(com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEnabledProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    default void createSLA(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSLAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    default void listSLA(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSLAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    default void updateSLA(com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSLAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    default void listSLACondition(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSLAConditionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    default void replyComment(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    default void listTicketAuditLog(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTicketAuditLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    @java.lang.Deprecated
    default void assignSelf(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignSelfMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * EditTicket would be deprecated
     * </pre>
     */
    default void editMaskTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditMaskTicketMethod(), responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    default void listAllocatedTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllocatedTicketsMethod(), responseObserver);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    default void listAvailableAgentTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableAgentTicketsMethod(), responseObserver);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    default void listAgentTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAgentTicketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * public method to fetch list of skills for a tickets user
     * </pre>
     */
    default void listSkills(com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSkillsMethod(), responseObserver);
    }

    /**
     * <pre>
     * public method to fetch list of users for a tickets user
     * </pre>
     */
    default void listUsers(com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    default void closeTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseTicketActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a ticket action
     * </pre>
     */
    @java.lang.Deprecated
    default void assignTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignTicketActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    default void createTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketActionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to change the Status of a ticket
     * </pre>
     */
    @java.lang.Deprecated
    default void changeTicketStatus(com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeTicketStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to create a Ticket Template
     * </pre>
     */
    default void createTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to Edit a Ticket Template
     * </pre>
     */
    default void editTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditTicketTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to all Ticket Templates
     * </pre>
     */
    default void listTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTicketTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a Template To a Project
     * </pre>
     */
    default void assignTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignTicketTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    default void getAllActionType(com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllActionTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    @java.lang.Deprecated
    default void getPhoneNumberType(com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPhoneNumberTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to addEntityRef
     * </pre>
     */
    default void addEntityRef(com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddEntityRefMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to listTicketsByEntityRef
     * </pre>
     */
    default void listTicketsByEntityRef(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTicketsByEntityRefMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to listEntityRefsByTicket
     * </pre>
     */
    default void listEntityRefsByTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEntityRefsByTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to create a Custom Field
     * </pre>
     */
    default void createCustomField(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCustomFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to Edit a Custom Field
     * </pre>
     */
    default void editCustomField(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditCustomFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to all Custom Fileds
     * </pre>
     */
    default void listCustomFields(com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCustomFieldsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Tickets.
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static abstract class TicketsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TicketsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Tickets.
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static final class TicketsStub
      extends io.grpc.stub.AbstractAsyncStub<TicketsStub> {
    private TicketsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public void createTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * </pre>
     */
    @java.lang.Deprecated
    public void editTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public void listTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * Would be deprecated
     * </pre>
     */
    @java.lang.Deprecated
    public void assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    public void closeTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public void viewTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getViewTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public void createComment(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public void enableProject(com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public void listEnabledProjects(com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEnabledProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public void createSLA(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSLAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public void listSLA(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSLAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public void updateSLA(com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSLAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public void listSLACondition(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSLAConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public void replyComment(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public void listTicketAuditLog(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTicketAuditLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    @java.lang.Deprecated
    public void assignSelf(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignSelfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * EditTicket would be deprecated
     * </pre>
     */
    public void editMaskTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditMaskTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    @java.lang.Deprecated
    public void listAllocatedTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllocatedTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    public void listAvailableAgentTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableAgentTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    public void listAgentTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAgentTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * public method to fetch list of skills for a tickets user
     * </pre>
     */
    public void listSkills(com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSkillsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * public method to fetch list of users for a tickets user
     * </pre>
     */
    public void listUsers(com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    public void closeTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseTicketActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a ticket action
     * </pre>
     */
    @java.lang.Deprecated
    public void assignTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignTicketActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    public void createTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to change the Status of a ticket
     * </pre>
     */
    @java.lang.Deprecated
    public void changeTicketStatus(com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeTicketStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to create a Ticket Template
     * </pre>
     */
    public void createTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to Edit a Ticket Template
     * </pre>
     */
    public void editTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditTicketTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to all Ticket Templates
     * </pre>
     */
    public void listTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTicketTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to assign a Template To a Project
     * </pre>
     */
    public void assignTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignTicketTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    public void getAllActionType(com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllActionTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    @java.lang.Deprecated
    public void getPhoneNumberType(com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPhoneNumberTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to addEntityRef
     * </pre>
     */
    public void addEntityRef(com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddEntityRefMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to listTicketsByEntityRef
     * </pre>
     */
    public void listTicketsByEntityRef(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTicketsByEntityRefMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to listEntityRefsByTicket
     * </pre>
     */
    public void listEntityRefsByTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEntityRefsByTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to create a Custom Field
     * </pre>
     */
    public void createCustomField(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCustomFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to Edit a Custom Field
     * </pre>
     */
    public void editCustomField(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditCustomFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to all Custom Fileds
     * </pre>
     */
    public void listCustomFields(com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCustomFieldsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Tickets.
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static final class TicketsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TicketsBlockingStub> {
    private TicketsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes createTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes editTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes listTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTicketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * Would be deprecated
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes closeTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes viewTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getViewTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes createComment(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes enableProject(com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes listEnabledProjects(com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEnabledProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes createSLA(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSLAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes listSLA(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSLAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes updateSLA(com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSLAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes listSLACondition(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSLAConditionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes replyComment(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes listTicketAuditLog(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTicketAuditLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes assignSelf(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignSelfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * EditTicket would be deprecated
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes editMaskTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditMaskTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes listAllocatedTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllocatedTicketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse listAvailableAgentTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableAgentTicketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse listAgentTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAgentTicketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * public method to fetch list of skills for a tickets user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse listSkills(com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSkillsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * public method to fetch list of users for a tickets user
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse listUsers(com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse closeTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseTicketActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to assign a ticket action
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse assignTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignTicketActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse createTicketAction(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketActionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to change the Status of a ticket
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse changeTicketStatus(com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeTicketStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to create a Ticket Template
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse createTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to Edit a Ticket Template
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse editTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditTicketTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to all Ticket Templates
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse listTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTicketTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to assign a Template To a Project
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse assignTicketTemplate(com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignTicketTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse getAllActionType(com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllActionTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse getPhoneNumberType(com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPhoneNumberTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to addEntityRef
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse addEntityRef(com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddEntityRefMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to listTicketsByEntityRef
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse listTicketsByEntityRef(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTicketsByEntityRefMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to listEntityRefsByTicket
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse listEntityRefsByTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEntityRefsByTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to create a Custom Field
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse createCustomField(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCustomFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to Edit a Custom Field
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse editCustomField(com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditCustomFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to all Custom Fileds
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse listCustomFields(com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCustomFieldsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Tickets.
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static final class TicketsFutureStub
      extends io.grpc.stub.AbstractFutureStub<TicketsFutureStub> {
    private TicketsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> createTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> editTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> listTickets(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTicketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * Would be deprecated
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> assignTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> closeTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> viewTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getViewTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> createComment(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> enableProject(
        com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> listEnabledProjects(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEnabledProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> createSLA(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSLAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> listSLA(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSLAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> updateSLA(
        com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSLAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> listSLACondition(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSLAConditionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> replyComment(
        com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> listTicketAuditLog(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTicketAuditLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> assignSelf(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignSelfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to edit a ticket.
     * EditTicket would be deprecated
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes> editMaskTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditMaskTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes> listAllocatedTickets(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllocatedTicketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse> listAvailableAgentTickets(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableAgentTicketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *public method - to return list of available tickets to pick for an Agent
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse> listAgentTickets(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAgentTicketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * public method to fetch list of skills for a tickets user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse> listSkills(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSkillsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * public method to fetch list of users for a tickets user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse> listUsers(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Any agent can close the ticket. No BE validation required
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse> closeTicketAction(
        com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseTicketActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to assign a ticket action
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse> assignTicketAction(
        com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignTicketActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to assign a ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse> createTicketAction(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketActionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to change the Status of a ticket
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse> changeTicketStatus(
        com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeTicketStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to create a Ticket Template
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse> createTicketTemplate(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to Edit a Ticket Template
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse> editTicketTemplate(
        com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditTicketTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to all Ticket Templates
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse> listTicketTemplate(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTicketTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to assign a Template To a Project
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse> assignTicketTemplate(
        com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignTicketTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse> getAllActionType(
        com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllActionTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list all Action Types
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse> getPhoneNumberType(
        com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPhoneNumberTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to addEntityRef
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse> addEntityRef(
        com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddEntityRefMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to listTicketsByEntityRef
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse> listTicketsByEntityRef(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTicketsByEntityRefMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to listEntityRefsByTicket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse> listEntityRefsByTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEntityRefsByTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to create a Custom Field
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse> createCustomField(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCustomFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to Edit a Custom Field
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse> editCustomField(
        com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditCustomFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to all Custom Fileds
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse> listCustomFields(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCustomFieldsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_EDIT_TICKET = 1;
  private static final int METHODID_LIST_TICKETS = 2;
  private static final int METHODID_ASSIGN_TICKET = 3;
  private static final int METHODID_CLOSE_TICKET = 4;
  private static final int METHODID_VIEW_TICKET = 5;
  private static final int METHODID_CREATE_COMMENT = 6;
  private static final int METHODID_ENABLE_PROJECT = 7;
  private static final int METHODID_LIST_ENABLED_PROJECTS = 8;
  private static final int METHODID_CREATE_SLA = 9;
  private static final int METHODID_LIST_SLA = 10;
  private static final int METHODID_UPDATE_SLA = 11;
  private static final int METHODID_LIST_SLACONDITION = 12;
  private static final int METHODID_REPLY_COMMENT = 13;
  private static final int METHODID_LIST_TICKET_AUDIT_LOG = 14;
  private static final int METHODID_ASSIGN_SELF = 15;
  private static final int METHODID_EDIT_MASK_TICKET = 16;
  private static final int METHODID_LIST_ALLOCATED_TICKETS = 17;
  private static final int METHODID_LIST_AVAILABLE_AGENT_TICKETS = 18;
  private static final int METHODID_LIST_AGENT_TICKETS = 19;
  private static final int METHODID_LIST_SKILLS = 20;
  private static final int METHODID_LIST_USERS = 21;
  private static final int METHODID_CLOSE_TICKET_ACTION = 22;
  private static final int METHODID_ASSIGN_TICKET_ACTION = 23;
  private static final int METHODID_CREATE_TICKET_ACTION = 24;
  private static final int METHODID_CHANGE_TICKET_STATUS = 25;
  private static final int METHODID_CREATE_TICKET_TEMPLATE = 26;
  private static final int METHODID_EDIT_TICKET_TEMPLATE = 27;
  private static final int METHODID_LIST_TICKET_TEMPLATE = 28;
  private static final int METHODID_ASSIGN_TICKET_TEMPLATE = 29;
  private static final int METHODID_GET_ALL_ACTION_TYPE = 30;
  private static final int METHODID_GET_PHONE_NUMBER_TYPE = 31;
  private static final int METHODID_ADD_ENTITY_REF = 32;
  private static final int METHODID_LIST_TICKETS_BY_ENTITY_REF = 33;
  private static final int METHODID_LIST_ENTITY_REFS_BY_TICKET = 34;
  private static final int METHODID_CREATE_CUSTOM_FIELD = 35;
  private static final int METHODID_EDIT_CUSTOM_FIELD = 36;
  private static final int METHODID_LIST_CUSTOM_FIELDS = 37;

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
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes>) responseObserver);
          break;
        case METHODID_EDIT_TICKET:
          serviceImpl.editTicket((com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes>) responseObserver);
          break;
        case METHODID_LIST_TICKETS:
          serviceImpl.listTickets((com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes>) responseObserver);
          break;
        case METHODID_ASSIGN_TICKET:
          serviceImpl.assignTicket((com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes>) responseObserver);
          break;
        case METHODID_CLOSE_TICKET:
          serviceImpl.closeTicket((com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes>) responseObserver);
          break;
        case METHODID_VIEW_TICKET:
          serviceImpl.viewTicket((com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes>) responseObserver);
          break;
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes>) responseObserver);
          break;
        case METHODID_ENABLE_PROJECT:
          serviceImpl.enableProject((com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes>) responseObserver);
          break;
        case METHODID_LIST_ENABLED_PROJECTS:
          serviceImpl.listEnabledProjects((com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes>) responseObserver);
          break;
        case METHODID_CREATE_SLA:
          serviceImpl.createSLA((com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes>) responseObserver);
          break;
        case METHODID_LIST_SLA:
          serviceImpl.listSLA((com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes>) responseObserver);
          break;
        case METHODID_UPDATE_SLA:
          serviceImpl.updateSLA((com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes>) responseObserver);
          break;
        case METHODID_LIST_SLACONDITION:
          serviceImpl.listSLACondition((com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes>) responseObserver);
          break;
        case METHODID_REPLY_COMMENT:
          serviceImpl.replyComment((com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes>) responseObserver);
          break;
        case METHODID_LIST_TICKET_AUDIT_LOG:
          serviceImpl.listTicketAuditLog((com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes>) responseObserver);
          break;
        case METHODID_ASSIGN_SELF:
          serviceImpl.assignSelf((com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes>) responseObserver);
          break;
        case METHODID_EDIT_MASK_TICKET:
          serviceImpl.editMaskTicket((com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes>) responseObserver);
          break;
        case METHODID_LIST_ALLOCATED_TICKETS:
          serviceImpl.listAllocatedTickets((com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_AGENT_TICKETS:
          serviceImpl.listAvailableAgentTickets((com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_TICKETS:
          serviceImpl.listAgentTickets((com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse>) responseObserver);
          break;
        case METHODID_LIST_SKILLS:
          serviceImpl.listSkills((com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse>) responseObserver);
          break;
        case METHODID_CLOSE_TICKET_ACTION:
          serviceImpl.closeTicketAction((com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_TICKET_ACTION:
          serviceImpl.assignTicketAction((com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse>) responseObserver);
          break;
        case METHODID_CREATE_TICKET_ACTION:
          serviceImpl.createTicketAction((com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse>) responseObserver);
          break;
        case METHODID_CHANGE_TICKET_STATUS:
          serviceImpl.changeTicketStatus((com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse>) responseObserver);
          break;
        case METHODID_CREATE_TICKET_TEMPLATE:
          serviceImpl.createTicketTemplate((com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse>) responseObserver);
          break;
        case METHODID_EDIT_TICKET_TEMPLATE:
          serviceImpl.editTicketTemplate((com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_TICKET_TEMPLATE:
          serviceImpl.listTicketTemplate((com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_TICKET_TEMPLATE:
          serviceImpl.assignTicketTemplate((com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_ACTION_TYPE:
          serviceImpl.getAllActionType((com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse>) responseObserver);
          break;
        case METHODID_GET_PHONE_NUMBER_TYPE:
          serviceImpl.getPhoneNumberType((com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse>) responseObserver);
          break;
        case METHODID_ADD_ENTITY_REF:
          serviceImpl.addEntityRef((com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse>) responseObserver);
          break;
        case METHODID_LIST_TICKETS_BY_ENTITY_REF:
          serviceImpl.listTicketsByEntityRef((com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse>) responseObserver);
          break;
        case METHODID_LIST_ENTITY_REFS_BY_TICKET:
          serviceImpl.listEntityRefsByTicket((com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOM_FIELD:
          serviceImpl.createCustomField((com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse>) responseObserver);
          break;
        case METHODID_EDIT_CUSTOM_FIELD:
          serviceImpl.editCustomField((com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse>) responseObserver);
          break;
        case METHODID_LIST_CUSTOM_FIELDS:
          serviceImpl.listCustomFields((com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse>) responseObserver);
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
          getCreateTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes>(
                service, METHODID_CREATE_TICKET)))
        .addMethod(
          getEditTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes>(
                service, METHODID_EDIT_TICKET)))
        .addMethod(
          getListTicketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes>(
                service, METHODID_LIST_TICKETS)))
        .addMethod(
          getAssignTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes>(
                service, METHODID_ASSIGN_TICKET)))
        .addMethod(
          getCloseTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes>(
                service, METHODID_CLOSE_TICKET)))
        .addMethod(
          getViewTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes>(
                service, METHODID_VIEW_TICKET)))
        .addMethod(
          getCreateCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes>(
                service, METHODID_CREATE_COMMENT)))
        .addMethod(
          getEnableProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes>(
                service, METHODID_ENABLE_PROJECT)))
        .addMethod(
          getListEnabledProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes>(
                service, METHODID_LIST_ENABLED_PROJECTS)))
        .addMethod(
          getCreateSLAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes>(
                service, METHODID_CREATE_SLA)))
        .addMethod(
          getListSLAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes>(
                service, METHODID_LIST_SLA)))
        .addMethod(
          getUpdateSLAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes>(
                service, METHODID_UPDATE_SLA)))
        .addMethod(
          getListSLAConditionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes>(
                service, METHODID_LIST_SLACONDITION)))
        .addMethod(
          getReplyCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes>(
                service, METHODID_REPLY_COMMENT)))
        .addMethod(
          getListTicketAuditLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes>(
                service, METHODID_LIST_TICKET_AUDIT_LOG)))
        .addMethod(
          getAssignSelfMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes>(
                service, METHODID_ASSIGN_SELF)))
        .addMethod(
          getEditMaskTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.EditMaskTicketRes>(
                service, METHODID_EDIT_MASK_TICKET)))
        .addMethod(
          getListAllocatedTicketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketReq,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAllocatedTicketRes>(
                service, METHODID_LIST_ALLOCATED_TICKETS)))
        .addMethod(
          getListAvailableAgentTicketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAvailableAgentTicketsResponse>(
                service, METHODID_LIST_AVAILABLE_AGENT_TICKETS)))
        .addMethod(
          getListAgentTicketsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListAgentTicketsResponse>(
                service, METHODID_LIST_AGENT_TICKETS)))
        .addMethod(
          getListSkillsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListSkillsResponse>(
                service, METHODID_LIST_SKILLS)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getCloseTicketActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketActionResponse>(
                service, METHODID_CLOSE_TICKET_ACTION)))
        .addMethod(
          getAssignTicketActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketActionResponse>(
                service, METHODID_ASSIGN_TICKET_ACTION)))
        .addMethod(
          getCreateTicketActionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketActionResponse>(
                service, METHODID_CREATE_TICKET_ACTION)))
        .addMethod(
          getChangeTicketStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ChangeTicketStatusResponse>(
                service, METHODID_CHANGE_TICKET_STATUS)))
        .addMethod(
          getCreateTicketTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketTemplateResponse>(
                service, METHODID_CREATE_TICKET_TEMPLATE)))
        .addMethod(
          getEditTicketTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketTemplateResponse>(
                service, METHODID_EDIT_TICKET_TEMPLATE)))
        .addMethod(
          getListTicketTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketTemplateResponse>(
                service, METHODID_LIST_TICKET_TEMPLATE)))
        .addMethod(
          getAssignTicketTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.AssignProjectTemplateResponse>(
                service, METHODID_ASSIGN_TICKET_TEMPLATE)))
        .addMethod(
          getGetAllActionTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.GetActionTypeResponse>(
                service, METHODID_GET_ALL_ACTION_TYPE)))
        .addMethod(
          getGetPhoneNumberTypeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.GetPhoneNumberTypeResponse>(
                service, METHODID_GET_PHONE_NUMBER_TYPE)))
        .addMethod(
          getAddEntityRefMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.AddEntityRefResponse>(
                service, METHODID_ADD_ENTITY_REF)))
        .addMethod(
          getListTicketsByEntityRefMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsByEntityRefResponse>(
                service, METHODID_LIST_TICKETS_BY_ENTITY_REF)))
        .addMethod(
          getListEntityRefsByTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListEntityRefsByTicketResponse>(
                service, METHODID_LIST_ENTITY_REFS_BY_TICKET)))
        .addMethod(
          getCreateCustomFieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.CreateCustomFieldResponse>(
                service, METHODID_CREATE_CUSTOM_FIELD)))
        .addMethod(
          getEditCustomFieldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.EditCustomFieldResponse>(
                service, METHODID_EDIT_CUSTOM_FIELD)))
        .addMethod(
          getListCustomFieldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsRequest,
              com.tcn.cloud.api.api.v1alpha1.tickets.ListCustomFieldsResponse>(
                service, METHODID_LIST_CUSTOM_FIELDS)))
        .build();
  }

  private static abstract class TicketsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.tickets.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Tickets");
    }
  }

  private static final class TicketsFileDescriptorSupplier
      extends TicketsBaseDescriptorSupplier {
    TicketsFileDescriptorSupplier() {}
  }

  private static final class TicketsMethodDescriptorSupplier
      extends TicketsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TicketsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TicketsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketsFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getEditTicketMethod())
              .addMethod(getListTicketsMethod())
              .addMethod(getAssignTicketMethod())
              .addMethod(getCloseTicketMethod())
              .addMethod(getViewTicketMethod())
              .addMethod(getCreateCommentMethod())
              .addMethod(getEnableProjectMethod())
              .addMethod(getListEnabledProjectsMethod())
              .addMethod(getCreateSLAMethod())
              .addMethod(getListSLAMethod())
              .addMethod(getUpdateSLAMethod())
              .addMethod(getListSLAConditionMethod())
              .addMethod(getReplyCommentMethod())
              .addMethod(getListTicketAuditLogMethod())
              .addMethod(getAssignSelfMethod())
              .addMethod(getEditMaskTicketMethod())
              .addMethod(getListAllocatedTicketsMethod())
              .addMethod(getListAvailableAgentTicketsMethod())
              .addMethod(getListAgentTicketsMethod())
              .addMethod(getListSkillsMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getCloseTicketActionMethod())
              .addMethod(getAssignTicketActionMethod())
              .addMethod(getCreateTicketActionMethod())
              .addMethod(getChangeTicketStatusMethod())
              .addMethod(getCreateTicketTemplateMethod())
              .addMethod(getEditTicketTemplateMethod())
              .addMethod(getListTicketTemplateMethod())
              .addMethod(getAssignTicketTemplateMethod())
              .addMethod(getGetAllActionTypeMethod())
              .addMethod(getGetPhoneNumberTypeMethod())
              .addMethod(getAddEntityRefMethod())
              .addMethod(getListTicketsByEntityRefMethod())
              .addMethod(getListEntityRefsByTicketMethod())
              .addMethod(getCreateCustomFieldMethod())
              .addMethod(getEditCustomFieldMethod())
              .addMethod(getListCustomFieldsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
