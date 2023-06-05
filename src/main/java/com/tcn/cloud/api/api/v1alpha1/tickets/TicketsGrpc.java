package com.tcn.cloud.api.api.v1alpha1.tickets;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/tickets/service.proto")
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "CreateTicket"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "EditTicket"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ListTickets"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "AssignTicket"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "CloseTicket"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ViewTicket"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "CreateComment"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "EnableProject"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ListEnabledProjects"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "CreateSLA"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ListSLA"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "UpdateSLA"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ListSLACondition"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ReplyComment"))
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
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.tickets.Tickets", "ListTicketAuditLog"))
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

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketsStub newStub(io.grpc.Channel channel) {
    return new TicketsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TicketsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TicketsFutureStub(channel);
  }

  /**
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static abstract class TicketsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public void createTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public void editTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEditTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public void listTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTicketsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * </pre>
     */
    public void assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Closes the ticket
     * </pre>
     */
    public void closeTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public void viewTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> responseObserver) {
      asyncUnimplementedUnaryCall(getViewTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public void createComment(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public void enableProject(com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public void listEnabledProjects(com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListEnabledProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public void createSLA(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSLAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public void listSLA(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSLAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public void updateSLA(com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSLAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public void listSLACondition(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListSLAConditionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public void replyComment(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> responseObserver) {
      asyncUnimplementedUnaryCall(getReplyCommentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public void listTicketAuditLog(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> responseObserver) {
      asyncUnimplementedUnaryCall(getListTicketAuditLogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getEditTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes>(
                  this, METHODID_EDIT_TICKET)))
          .addMethod(
            getListTicketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes>(
                  this, METHODID_LIST_TICKETS)))
          .addMethod(
            getAssignTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes>(
                  this, METHODID_ASSIGN_TICKET)))
          .addMethod(
            getCloseTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes>(
                  this, METHODID_CLOSE_TICKET)))
          .addMethod(
            getViewTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes>(
                  this, METHODID_VIEW_TICKET)))
          .addMethod(
            getCreateCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getEnableProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes>(
                  this, METHODID_ENABLE_PROJECT)))
          .addMethod(
            getListEnabledProjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes>(
                  this, METHODID_LIST_ENABLED_PROJECTS)))
          .addMethod(
            getCreateSLAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes>(
                  this, METHODID_CREATE_SLA)))
          .addMethod(
            getListSLAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes>(
                  this, METHODID_LIST_SLA)))
          .addMethod(
            getUpdateSLAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes>(
                  this, METHODID_UPDATE_SLA)))
          .addMethod(
            getListSLAConditionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes>(
                  this, METHODID_LIST_SLACONDITION)))
          .addMethod(
            getReplyCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes>(
                  this, METHODID_REPLY_COMMENT)))
          .addMethod(
            getListTicketAuditLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq,
                com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes>(
                  this, METHODID_LIST_TICKET_AUDIT_LOG)))
          .build();
    }
  }

  /**
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static final class TicketsStub extends io.grpc.stub.AbstractStub<TicketsStub> {
    private TicketsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public void createTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public void editTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public void listTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * </pre>
     */
    public void assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Closes the ticket
     * </pre>
     */
    public void closeTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public void viewTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public void createComment(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public void enableProject(com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public void listEnabledProjects(com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEnabledProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public void createSLA(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSLAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public void listSLA(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSLAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public void updateSLA(com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSLAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public void listSLACondition(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSLAConditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public void replyComment(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReplyCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public void listTicketAuditLog(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTicketAuditLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static final class TicketsBlockingStub extends io.grpc.stub.AbstractStub<TicketsBlockingStub> {
    private TicketsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes createTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes editTicket(com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request) {
      return blockingUnaryCall(
          getChannel(), getEditTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes listTickets(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request) {
      return blockingUnaryCall(
          getChannel(), getListTicketsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes assignTicket(com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request) {
      return blockingUnaryCall(
          getChannel(), getAssignTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Closes the ticket
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes closeTicket(com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request) {
      return blockingUnaryCall(
          getChannel(), getCloseTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes viewTicket(com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request) {
      return blockingUnaryCall(
          getChannel(), getViewTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes createComment(com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes enableProject(com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request) {
      return blockingUnaryCall(
          getChannel(), getEnableProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes listEnabledProjects(com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request) {
      return blockingUnaryCall(
          getChannel(), getListEnabledProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes createSLA(com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request) {
      return blockingUnaryCall(
          getChannel(), getCreateSLAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes listSLA(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request) {
      return blockingUnaryCall(
          getChannel(), getListSLAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes updateSLA(com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSLAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes listSLACondition(com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request) {
      return blockingUnaryCall(
          getChannel(), getListSLAConditionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes replyComment(com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request) {
      return blockingUnaryCall(
          getChannel(), getReplyCommentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes listTicketAuditLog(com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request) {
      return blockingUnaryCall(
          getChannel(), getListTicketAuditLogMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Tickets service is the public api for the tickets service., for public integrations to manage tickets / customer service requests. Can be used by any authorized frontend-app.
   * </pre>
   */
  public static final class TicketsFutureStub extends io.grpc.stub.AbstractStub<TicketsFutureStub> {
    private TicketsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TicketsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TicketsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketRes> createTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateTicketReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to create a ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketRes> editTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.EditTicketReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEditTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list tickets
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsRes> listTickets(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTicketsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to assign ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketRes> assignTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.AssignTicketReq request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Closes the ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketRes> closeTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.CloseTicketReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to view ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketRes> viewTicket(
        com.tcn.cloud.api.api.v1alpha1.tickets.ViewTicketReq request) {
      return futureUnaryCall(
          getChannel().newCall(getViewTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to create a Comment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentRes> createComment(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateCommentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to Enable Project for Ticketing system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectRes> enableProject(
        com.tcn.cloud.api.api.v1alpha1.tickets.EnableProjectReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to List projects enabled for Ticketing system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsRes> listEnabledProjects(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListEnabledProjectsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListEnabledProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public Method to create a sla.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaRes> createSLA(
        com.tcn.cloud.api.api.v1alpha1.tickets.CreateSlaReq request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSLAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list sla
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaRes> listSLA(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSLAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to update sla
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaRes> updateSLA(
        com.tcn.cloud.api.api.v1alpha1.tickets.UpdateSlaReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSLAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionRes> listSLACondition(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListSlaConditionReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListSLAConditionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to list sla_condition
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentRes> replyComment(
        com.tcn.cloud.api.api.v1alpha1.tickets.ReplyCommentReq request) {
      return futureUnaryCall(
          getChannel().newCall(getReplyCommentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public method to List audit log for Ticketing system
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogRes> listTicketAuditLog(
        com.tcn.cloud.api.api.v1alpha1.tickets.ListTicketAuditLogReq request) {
      return futureUnaryCall(
          getChannel().newCall(getListTicketAuditLogMethod(), getCallOptions()), request);
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

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketsImplBase serviceImpl, int methodId) {
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
              .build();
        }
      }
    }
    return result;
  }
}
