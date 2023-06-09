package com.tcn.cloud.api.api.v1alpha1.tickets;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: api/v1alpha1/tickets/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TicketsGrpc {

  private TicketsGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.tickets.Tickets";

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
     * </pre>
     */
    default void assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
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
    default void assignSelf(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignSelfMethod(), responseObserver);
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
     * </pre>
     */
    public void assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
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
    public void assignSelf(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignSelfMethod(), getCallOptions()), request, responseObserver);
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
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
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
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes assignSelf(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignSelfMethod(), getCallOptions(), request);
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
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> assignTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to Close a ticket
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
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignRes> assignSelf(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateSelfAssignReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignSelfMethod(), getCallOptions()), request);
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
    private final String methodName;

    TicketsMethodDescriptorSupplier(String methodName) {
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
              .build();
        }
      }
    }
    return result;
  }
}
