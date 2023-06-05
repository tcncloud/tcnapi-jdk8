package com.tcn.cloud.api.api.v1alpha1.vanalytics;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: api/v1alpha1/vanalytics/service.proto")
public final class VanalyticsGrpc {

  private VanalyticsGrpc() {}

  public static final String SERVICE_NAME = "api.v1alpha1.vanalytics.Vanalytics";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse> getAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Audit",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse> getAuditMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse> getAuditMethod;
    if ((getAuditMethod = VanalyticsGrpc.getAuditMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getAuditMethod = VanalyticsGrpc.getAuditMethod) == null) {
          VanalyticsGrpc.getAuditMethod = getAuditMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "Audit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("Audit"))
                  .build();
          }
        }
     }
     return getAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse> getGetRecordingUrlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecordingUrl",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse> getGetRecordingUrlMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse> getGetRecordingUrlMethod;
    if ((getGetRecordingUrlMethod = VanalyticsGrpc.getGetRecordingUrlMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getGetRecordingUrlMethod = VanalyticsGrpc.getGetRecordingUrlMethod) == null) {
          VanalyticsGrpc.getGetRecordingUrlMethod = getGetRecordingUrlMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "GetRecordingUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("GetRecordingUrl"))
                  .build();
          }
        }
     }
     return getGetRecordingUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse> getListBillingSpanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBillingSpan",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse> getListBillingSpanMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse> getListBillingSpanMethod;
    if ((getListBillingSpanMethod = VanalyticsGrpc.getListBillingSpanMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListBillingSpanMethod = VanalyticsGrpc.getListBillingSpanMethod) == null) {
          VanalyticsGrpc.getListBillingSpanMethod = getListBillingSpanMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListBillingSpan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListBillingSpan"))
                  .build();
          }
        }
     }
     return getListBillingSpanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Search",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> getSearchMethod;
    if ((getSearchMethod = VanalyticsGrpc.getSearchMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getSearchMethod = VanalyticsGrpc.getSearchMethod) == null) {
          VanalyticsGrpc.getSearchMethod = getSearchMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "Search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("Search"))
                  .build();
          }
        }
     }
     return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse> getListTranscriptGroupNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTranscriptGroupNames",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse> getListTranscriptGroupNamesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse> getListTranscriptGroupNamesMethod;
    if ((getListTranscriptGroupNamesMethod = VanalyticsGrpc.getListTranscriptGroupNamesMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListTranscriptGroupNamesMethod = VanalyticsGrpc.getListTranscriptGroupNamesMethod) == null) {
          VanalyticsGrpc.getListTranscriptGroupNamesMethod = getListTranscriptGroupNamesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListTranscriptGroupNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListTranscriptGroupNames"))
                  .build();
          }
        }
     }
     return getListTranscriptGroupNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse> getBulkDeleteTranscriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkDeleteTranscripts",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse> getBulkDeleteTranscriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse> getBulkDeleteTranscriptsMethod;
    if ((getBulkDeleteTranscriptsMethod = VanalyticsGrpc.getBulkDeleteTranscriptsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getBulkDeleteTranscriptsMethod = VanalyticsGrpc.getBulkDeleteTranscriptsMethod) == null) {
          VanalyticsGrpc.getBulkDeleteTranscriptsMethod = getBulkDeleteTranscriptsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "BulkDeleteTranscripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("BulkDeleteTranscripts"))
                  .build();
          }
        }
     }
     return getBulkDeleteTranscriptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse> getBulkRestoreTranscriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkRestoreTranscripts",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse> getBulkRestoreTranscriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse> getBulkRestoreTranscriptsMethod;
    if ((getBulkRestoreTranscriptsMethod = VanalyticsGrpc.getBulkRestoreTranscriptsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getBulkRestoreTranscriptsMethod = VanalyticsGrpc.getBulkRestoreTranscriptsMethod) == null) {
          VanalyticsGrpc.getBulkRestoreTranscriptsMethod = getBulkRestoreTranscriptsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "BulkRestoreTranscripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("BulkRestoreTranscripts"))
                  .build();
          }
        }
     }
     return getBulkRestoreTranscriptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse> getListAgentResponseValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAgentResponseValues",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse> getListAgentResponseValuesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse> getListAgentResponseValuesMethod;
    if ((getListAgentResponseValuesMethod = VanalyticsGrpc.getListAgentResponseValuesMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListAgentResponseValuesMethod = VanalyticsGrpc.getListAgentResponseValuesMethod) == null) {
          VanalyticsGrpc.getListAgentResponseValuesMethod = getListAgentResponseValuesMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListAgentResponseValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListAgentResponseValues"))
                  .build();
          }
        }
     }
     return getListAgentResponseValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getCreateFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFilter",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getCreateFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getCreateFilterMethod;
    if ((getCreateFilterMethod = VanalyticsGrpc.getCreateFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFilterMethod = VanalyticsGrpc.getCreateFilterMethod) == null) {
          VanalyticsGrpc.getCreateFilterMethod = getCreateFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "CreateFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFilter"))
                  .build();
          }
        }
     }
     return getCreateFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse> getListFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFilters",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse> getListFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse> getListFiltersMethod;
    if ((getListFiltersMethod = VanalyticsGrpc.getListFiltersMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFiltersMethod = VanalyticsGrpc.getListFiltersMethod) == null) {
          VanalyticsGrpc.getListFiltersMethod = getListFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFilters"))
                  .build();
          }
        }
     }
     return getListFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getUpdateFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFilter",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getUpdateFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getUpdateFilterMethod;
    if ((getUpdateFilterMethod = VanalyticsGrpc.getUpdateFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getUpdateFilterMethod = VanalyticsGrpc.getUpdateFilterMethod) == null) {
          VanalyticsGrpc.getUpdateFilterMethod = getUpdateFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "UpdateFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("UpdateFilter"))
                  .build();
          }
        }
     }
     return getUpdateFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse> getDeleteFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFilter",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse> getDeleteFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse> getDeleteFilterMethod;
    if ((getDeleteFilterMethod = VanalyticsGrpc.getDeleteFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getDeleteFilterMethod = VanalyticsGrpc.getDeleteFilterMethod) == null) {
          VanalyticsGrpc.getDeleteFilterMethod = getDeleteFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "DeleteFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("DeleteFilter"))
                  .build();
          }
        }
     }
     return getDeleteFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getGetFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFilter",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getGetFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getGetFilterMethod;
    if ((getGetFilterMethod = VanalyticsGrpc.getGetFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getGetFilterMethod = VanalyticsGrpc.getGetFilterMethod) == null) {
          VanalyticsGrpc.getGetFilterMethod = getGetFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "GetFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("GetFilter"))
                  .build();
          }
        }
     }
     return getGetFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getGetFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlag",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getGetFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getGetFlagMethod;
    if ((getGetFlagMethod = VanalyticsGrpc.getGetFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getGetFlagMethod = VanalyticsGrpc.getGetFlagMethod) == null) {
          VanalyticsGrpc.getGetFlagMethod = getGetFlagMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "GetFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("GetFlag"))
                  .build();
          }
        }
     }
     return getGetFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getCreateFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlag",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getCreateFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getCreateFlagMethod;
    if ((getCreateFlagMethod = VanalyticsGrpc.getCreateFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagMethod = VanalyticsGrpc.getCreateFlagMethod) == null) {
          VanalyticsGrpc.getCreateFlagMethod = getCreateFlagMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "CreateFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlag"))
                  .build();
          }
        }
     }
     return getCreateFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse> getListFlagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlags",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse> getListFlagsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse> getListFlagsMethod;
    if ((getListFlagsMethod = VanalyticsGrpc.getListFlagsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagsMethod = VanalyticsGrpc.getListFlagsMethod) == null) {
          VanalyticsGrpc.getListFlagsMethod = getListFlagsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListFlags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlags"))
                  .build();
          }
        }
     }
     return getListFlagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getUpdateFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlag",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getUpdateFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getUpdateFlagMethod;
    if ((getUpdateFlagMethod = VanalyticsGrpc.getUpdateFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getUpdateFlagMethod = VanalyticsGrpc.getUpdateFlagMethod) == null) {
          VanalyticsGrpc.getUpdateFlagMethod = getUpdateFlagMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "UpdateFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("UpdateFlag"))
                  .build();
          }
        }
     }
     return getUpdateFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse> getDeleteFlagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlag",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse> getDeleteFlagMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse> getDeleteFlagMethod;
    if ((getDeleteFlagMethod = VanalyticsGrpc.getDeleteFlagMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getDeleteFlagMethod = VanalyticsGrpc.getDeleteFlagMethod) == null) {
          VanalyticsGrpc.getDeleteFlagMethod = getDeleteFlagMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "DeleteFlag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("DeleteFlag"))
                  .build();
          }
        }
     }
     return getDeleteFlagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview> getCreateFlagReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlagReview",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview> getCreateFlagReviewMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview> getCreateFlagReviewMethod;
    if ((getCreateFlagReviewMethod = VanalyticsGrpc.getCreateFlagReviewMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagReviewMethod = VanalyticsGrpc.getCreateFlagReviewMethod) == null) {
          VanalyticsGrpc.getCreateFlagReviewMethod = getCreateFlagReviewMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "CreateFlagReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlagReview"))
                  .build();
          }
        }
     }
     return getCreateFlagReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse> getBulkCreateFlagReviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkCreateFlagReview",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse> getBulkCreateFlagReviewMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse> getBulkCreateFlagReviewMethod;
    if ((getBulkCreateFlagReviewMethod = VanalyticsGrpc.getBulkCreateFlagReviewMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getBulkCreateFlagReviewMethod = VanalyticsGrpc.getBulkCreateFlagReviewMethod) == null) {
          VanalyticsGrpc.getBulkCreateFlagReviewMethod = getBulkCreateFlagReviewMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "BulkCreateFlagReview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("BulkCreateFlagReview"))
                  .build();
          }
        }
     }
     return getBulkCreateFlagReviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse> getListFlagReviewsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlagReviews",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse> getListFlagReviewsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse> getListFlagReviewsMethod;
    if ((getListFlagReviewsMethod = VanalyticsGrpc.getListFlagReviewsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagReviewsMethod = VanalyticsGrpc.getListFlagReviewsMethod) == null) {
          VanalyticsGrpc.getListFlagReviewsMethod = getListFlagReviewsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListFlagReviews"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlagReviews"))
                  .build();
          }
        }
     }
     return getListFlagReviewsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse> getCreateFlagTranscriptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlagTranscript",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse> getCreateFlagTranscriptMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse> getCreateFlagTranscriptMethod;
    if ((getCreateFlagTranscriptMethod = VanalyticsGrpc.getCreateFlagTranscriptMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagTranscriptMethod = VanalyticsGrpc.getCreateFlagTranscriptMethod) == null) {
          VanalyticsGrpc.getCreateFlagTranscriptMethod = getCreateFlagTranscriptMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "CreateFlagTranscript"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlagTranscript"))
                  .build();
          }
        }
     }
     return getCreateFlagTranscriptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse> getSearchFlagTranscriptsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchFlagTranscripts",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse> getSearchFlagTranscriptsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse> getSearchFlagTranscriptsMethod;
    if ((getSearchFlagTranscriptsMethod = VanalyticsGrpc.getSearchFlagTranscriptsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getSearchFlagTranscriptsMethod = VanalyticsGrpc.getSearchFlagTranscriptsMethod) == null) {
          VanalyticsGrpc.getSearchFlagTranscriptsMethod = getSearchFlagTranscriptsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "SearchFlagTranscripts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("SearchFlagTranscripts"))
                  .build();
          }
        }
     }
     return getSearchFlagTranscriptsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> getCreateFlagFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlagFilter",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> getCreateFlagFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> getCreateFlagFilterMethod;
    if ((getCreateFlagFilterMethod = VanalyticsGrpc.getCreateFlagFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getCreateFlagFilterMethod = VanalyticsGrpc.getCreateFlagFilterMethod) == null) {
          VanalyticsGrpc.getCreateFlagFilterMethod = getCreateFlagFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "CreateFlagFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("CreateFlagFilter"))
                  .build();
          }
        }
     }
     return getCreateFlagFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse> getListFlagFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlagFilters",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse> getListFlagFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse> getListFlagFiltersMethod;
    if ((getListFlagFiltersMethod = VanalyticsGrpc.getListFlagFiltersMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagFiltersMethod = VanalyticsGrpc.getListFlagFiltersMethod) == null) {
          VanalyticsGrpc.getListFlagFiltersMethod = getListFlagFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListFlagFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlagFilters"))
                  .build();
          }
        }
     }
     return getListFlagFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse> getDeleteFlagFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlagFilter",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse> getDeleteFlagFilterMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse> getDeleteFlagFilterMethod;
    if ((getDeleteFlagFilterMethod = VanalyticsGrpc.getDeleteFlagFilterMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getDeleteFlagFilterMethod = VanalyticsGrpc.getDeleteFlagFilterMethod) == null) {
          VanalyticsGrpc.getDeleteFlagFilterMethod = getDeleteFlagFilterMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "DeleteFlagFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("DeleteFlagFilter"))
                  .build();
          }
        }
     }
     return getDeleteFlagFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse> getListFlagSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlagSnapshots",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse> getListFlagSnapshotsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse> getListFlagSnapshotsMethod;
    if ((getListFlagSnapshotsMethod = VanalyticsGrpc.getListFlagSnapshotsMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagSnapshotsMethod = VanalyticsGrpc.getListFlagSnapshotsMethod) == null) {
          VanalyticsGrpc.getListFlagSnapshotsMethod = getListFlagSnapshotsMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListFlagSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlagSnapshots"))
                  .build();
          }
        }
     }
     return getListFlagSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse> getListFlagTranscriptFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlagTranscriptFilters",
      requestType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest,
      com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse> getListFlagTranscriptFiltersMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse> getListFlagTranscriptFiltersMethod;
    if ((getListFlagTranscriptFiltersMethod = VanalyticsGrpc.getListFlagTranscriptFiltersMethod) == null) {
      synchronized (VanalyticsGrpc.class) {
        if ((getListFlagTranscriptFiltersMethod = VanalyticsGrpc.getListFlagTranscriptFiltersMethod) == null) {
          VanalyticsGrpc.getListFlagTranscriptFiltersMethod = getListFlagTranscriptFiltersMethod = 
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest, com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "api.v1alpha1.vanalytics.Vanalytics", "ListFlagTranscriptFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VanalyticsMethodDescriptorSupplier("ListFlagTranscriptFilters"))
                  .build();
          }
        }
     }
     return getListFlagTranscriptFiltersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VanalyticsStub newStub(io.grpc.Channel channel) {
    return new VanalyticsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VanalyticsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VanalyticsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VanalyticsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VanalyticsFutureStub(channel);
  }

  /**
   */
  public static abstract class VanalyticsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Audit audits the used transcription audio time for a client. The window
     * of time to audit can be widened or narrowed using the request since and
     * until fields.
     * </pre>
     */
    public void audit(com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAuditMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetRecordingUrl gets a signed url to download a transcript recording.
     * </pre>
     */
    public void getRecordingUrl(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRecordingUrlMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListBillingSpan lists billing spans.
     * </pre>
     */
    public void listBillingSpan(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListBillingSpanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved through subsequent requests using the response sort field.
     * </pre>
     */
    public void search(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListTranscriptGroupNames lists transcript group names.
     * </pre>
     */
    public void listTranscriptGroupNames(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListTranscriptGroupNamesMethod(), responseObserver);
    }

    /**
     * <pre>
     * BulkDeleteTranscripts bulk deletes transcripts matching the provided query.
     * </pre>
     */
    public void bulkDeleteTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBulkDeleteTranscriptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * BulkRestoreTranscripts bulk restores transcripts matching the provided query.
     * </pre>
     */
    public void bulkRestoreTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBulkRestoreTranscriptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAgentResponseValues lists transcript agent response values.
     * </pre>
     */
    public void listAgentResponseValues(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAgentResponseValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a search request
     * to filter transcripts.
     * </pre>
     */
    public void createFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public void listFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter search request and/or name.
     * </pre>
     */
    public void updateFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public void deleteFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid, name or search request.
     * </pre>
     */
    public void getFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public void getFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public void createFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public void listFlags(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFlagsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public void updateFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public void deleteFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFlagMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public void createFlagReview(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFlagReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public void bulkCreateFlagReview(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBulkCreateFlagReviewMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public void listFlagReviews(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFlagReviewsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public void createFlagTranscript(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFlagTranscriptMethod(), responseObserver);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public void searchFlagTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchFlagTranscriptsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public void createFlagFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFlagFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlagFilters lists flag filter associations.
     * </pre>
     */
    public void listFlagFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFlagFiltersMethod(), responseObserver);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public void deleteFlagFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteFlagFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public void listFlagSnapshots(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFlagSnapshotsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListFlagTranscriptFilters lists flag transcript filters in an organization.
     * </pre>
     */
    public void listFlagTranscriptFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListFlagTranscriptFiltersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAuditMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse>(
                  this, METHODID_AUDIT)))
          .addMethod(
            getGetRecordingUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse>(
                  this, METHODID_GET_RECORDING_URL)))
          .addMethod(
            getListBillingSpanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse>(
                  this, METHODID_LIST_BILLING_SPAN)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getListTranscriptGroupNamesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse>(
                  this, METHODID_LIST_TRANSCRIPT_GROUP_NAMES)))
          .addMethod(
            getBulkDeleteTranscriptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse>(
                  this, METHODID_BULK_DELETE_TRANSCRIPTS)))
          .addMethod(
            getBulkRestoreTranscriptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse>(
                  this, METHODID_BULK_RESTORE_TRANSCRIPTS)))
          .addMethod(
            getListAgentResponseValuesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse>(
                  this, METHODID_LIST_AGENT_RESPONSE_VALUES)))
          .addMethod(
            getCreateFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>(
                  this, METHODID_CREATE_FILTER)))
          .addMethod(
            getListFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse>(
                  this, METHODID_LIST_FILTERS)))
          .addMethod(
            getUpdateFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>(
                  this, METHODID_UPDATE_FILTER)))
          .addMethod(
            getDeleteFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse>(
                  this, METHODID_DELETE_FILTER)))
          .addMethod(
            getGetFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>(
                  this, METHODID_GET_FILTER)))
          .addMethod(
            getGetFlagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>(
                  this, METHODID_GET_FLAG)))
          .addMethod(
            getCreateFlagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>(
                  this, METHODID_CREATE_FLAG)))
          .addMethod(
            getListFlagsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse>(
                  this, METHODID_LIST_FLAGS)))
          .addMethod(
            getUpdateFlagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>(
                  this, METHODID_UPDATE_FLAG)))
          .addMethod(
            getDeleteFlagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse>(
                  this, METHODID_DELETE_FLAG)))
          .addMethod(
            getCreateFlagReviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview>(
                  this, METHODID_CREATE_FLAG_REVIEW)))
          .addMethod(
            getBulkCreateFlagReviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse>(
                  this, METHODID_BULK_CREATE_FLAG_REVIEW)))
          .addMethod(
            getListFlagReviewsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse>(
                  this, METHODID_LIST_FLAG_REVIEWS)))
          .addMethod(
            getCreateFlagTranscriptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse>(
                  this, METHODID_CREATE_FLAG_TRANSCRIPT)))
          .addMethod(
            getSearchFlagTranscriptsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse>(
                  this, METHODID_SEARCH_FLAG_TRANSCRIPTS)))
          .addMethod(
            getCreateFlagFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter>(
                  this, METHODID_CREATE_FLAG_FILTER)))
          .addMethod(
            getListFlagFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse>(
                  this, METHODID_LIST_FLAG_FILTERS)))
          .addMethod(
            getDeleteFlagFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse>(
                  this, METHODID_DELETE_FLAG_FILTER)))
          .addMethod(
            getListFlagSnapshotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse>(
                  this, METHODID_LIST_FLAG_SNAPSHOTS)))
          .addMethod(
            getListFlagTranscriptFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest,
                com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse>(
                  this, METHODID_LIST_FLAG_TRANSCRIPT_FILTERS)))
          .build();
    }
  }

  /**
   */
  public static final class VanalyticsStub extends io.grpc.stub.AbstractStub<VanalyticsStub> {
    private VanalyticsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VanalyticsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VanalyticsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Audit audits the used transcription audio time for a client. The window
     * of time to audit can be widened or narrowed using the request since and
     * until fields.
     * </pre>
     */
    public void audit(com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetRecordingUrl gets a signed url to download a transcript recording.
     * </pre>
     */
    public void getRecordingUrl(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRecordingUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListBillingSpan lists billing spans.
     * </pre>
     */
    public void listBillingSpan(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListBillingSpanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved through subsequent requests using the response sort field.
     * </pre>
     */
    public void search(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListTranscriptGroupNames lists transcript group names.
     * </pre>
     */
    public void listTranscriptGroupNames(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTranscriptGroupNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BulkDeleteTranscripts bulk deletes transcripts matching the provided query.
     * </pre>
     */
    public void bulkDeleteTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBulkDeleteTranscriptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BulkRestoreTranscripts bulk restores transcripts matching the provided query.
     * </pre>
     */
    public void bulkRestoreTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBulkRestoreTranscriptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAgentResponseValues lists transcript agent response values.
     * </pre>
     */
    public void listAgentResponseValues(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAgentResponseValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a search request
     * to filter transcripts.
     * </pre>
     */
    public void createFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public void listFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter search request and/or name.
     * </pre>
     */
    public void updateFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public void deleteFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid, name or search request.
     * </pre>
     */
    public void getFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public void getFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public void createFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public void listFlags(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFlagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public void updateFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public void deleteFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFlagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public void createFlagReview(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFlagReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public void bulkCreateFlagReview(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBulkCreateFlagReviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public void listFlagReviews(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFlagReviewsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public void createFlagTranscript(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFlagTranscriptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public void searchFlagTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchFlagTranscriptsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public void createFlagFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFlagFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlagFilters lists flag filter associations.
     * </pre>
     */
    public void listFlagFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFlagFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public void deleteFlagFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteFlagFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public void listFlagSnapshots(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFlagSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListFlagTranscriptFilters lists flag transcript filters in an organization.
     * </pre>
     */
    public void listFlagTranscriptFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListFlagTranscriptFiltersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class VanalyticsBlockingStub extends io.grpc.stub.AbstractStub<VanalyticsBlockingStub> {
    private VanalyticsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VanalyticsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VanalyticsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Audit audits the used transcription audio time for a client. The window
     * of time to audit can be widened or narrowed using the request since and
     * until fields.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse audit(com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest request) {
      return blockingUnaryCall(
          getChannel(), getAuditMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetRecordingUrl gets a signed url to download a transcript recording.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse getRecordingUrl(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRecordingUrlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListBillingSpan lists billing spans.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse listBillingSpan(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest request) {
      return blockingUnaryCall(
          getChannel(), getListBillingSpanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved through subsequent requests using the response sort field.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse search(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListTranscriptGroupNames lists transcript group names.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse listTranscriptGroupNames(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListTranscriptGroupNamesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BulkDeleteTranscripts bulk deletes transcripts matching the provided query.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse bulkDeleteTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getBulkDeleteTranscriptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BulkRestoreTranscripts bulk restores transcripts matching the provided query.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse bulkRestoreTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getBulkRestoreTranscriptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAgentResponseValues lists transcript agent response values.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse listAgentResponseValues(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAgentResponseValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a search request
     * to filter transcripts.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter createFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse listFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter search request and/or name.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter updateFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse deleteFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid, name or search request.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter getFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag getFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag createFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse listFlags(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFlagsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag updateFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse deleteFlag(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFlagMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview createFlagReview(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFlagReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse bulkCreateFlagReview(com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest request) {
      return blockingUnaryCall(
          getChannel(), getBulkCreateFlagReviewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse listFlagReviews(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFlagReviewsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse createFlagTranscript(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFlagTranscriptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse searchFlagTranscripts(com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchFlagTranscriptsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter createFlagFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFlagFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlagFilters lists flag filter associations.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse listFlagFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFlagFiltersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse deleteFlagFilter(com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteFlagFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse listFlagSnapshots(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFlagSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListFlagTranscriptFilters lists flag transcript filters in an organization.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse listFlagTranscriptFilters(com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListFlagTranscriptFiltersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class VanalyticsFutureStub extends io.grpc.stub.AbstractStub<VanalyticsFutureStub> {
    private VanalyticsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VanalyticsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VanalyticsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VanalyticsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Audit audits the used transcription audio time for a client. The window
     * of time to audit can be widened or narrowed using the request since and
     * until fields.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse> audit(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAuditMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetRecordingUrl gets a signed url to download a transcript recording.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse> getRecordingUrl(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRecordingUrlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListBillingSpan lists billing spans.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse> listBillingSpan(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListBillingSpanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search searches transcripts by search criteria. The search response
     * contains one page of transcript hits. Traversing the paginated hits is
     * achieved through subsequent requests using the response sort field.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse> search(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListTranscriptGroupNames lists transcript group names.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse> listTranscriptGroupNames(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTranscriptGroupNamesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BulkDeleteTranscripts bulk deletes transcripts matching the provided query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse> bulkDeleteTranscripts(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBulkDeleteTranscriptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BulkRestoreTranscripts bulk restores transcripts matching the provided query.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse> bulkRestoreTranscripts(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBulkRestoreTranscriptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAgentResponseValues lists transcript agent response values.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse> listAgentResponseValues(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAgentResponseValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFilter creates a new filter. The filter contains a search request
     * to filter transcripts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> createFilter(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFilters lists filters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse> listFilters(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFilter updates a filter search request and/or name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> updateFilter(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFilter deletes filter given a filter_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse> deleteFilter(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFilter gets filter given a filter_sid, name or search request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter> getFilter(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetFlag gets a flag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> getFlag(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFlag creates a new flag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> createFlag(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlags lists flags in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse> listFlags(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFlagsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateFlag updates a flag.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag> updateFlag(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteFlag deletes the flag identified by the given flag_sid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse> deleteFlag(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFlagMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFlagReview creates a flag review.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview> createFlagReview(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFlagReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BulkCreateFlagReview creates flag reviews.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse> bulkCreateFlagReview(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBulkCreateFlagReviewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlagReviews lists reviews in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse> listFlagReviews(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFlagReviewsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFlagTranscript creates a flag transcript.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse> createFlagTranscript(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFlagTranscriptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SearchFlagTranscripts searches flag transcripts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse> searchFlagTranscripts(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchFlagTranscriptsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter> createFlagFilter(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFlagFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlagFilters lists flag filter associations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse> listFlagFilters(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFlagFiltersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DEPRECATED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse> deleteFlagFilter(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteFlagFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlagSnapshots lists flag snapshots in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse> listFlagSnapshots(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFlagSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListFlagTranscriptFilters lists flag transcript filters in an organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse> listFlagTranscriptFilters(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListFlagTranscriptFiltersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AUDIT = 0;
  private static final int METHODID_GET_RECORDING_URL = 1;
  private static final int METHODID_LIST_BILLING_SPAN = 2;
  private static final int METHODID_SEARCH = 3;
  private static final int METHODID_LIST_TRANSCRIPT_GROUP_NAMES = 4;
  private static final int METHODID_BULK_DELETE_TRANSCRIPTS = 5;
  private static final int METHODID_BULK_RESTORE_TRANSCRIPTS = 6;
  private static final int METHODID_LIST_AGENT_RESPONSE_VALUES = 7;
  private static final int METHODID_CREATE_FILTER = 8;
  private static final int METHODID_LIST_FILTERS = 9;
  private static final int METHODID_UPDATE_FILTER = 10;
  private static final int METHODID_DELETE_FILTER = 11;
  private static final int METHODID_GET_FILTER = 12;
  private static final int METHODID_GET_FLAG = 13;
  private static final int METHODID_CREATE_FLAG = 14;
  private static final int METHODID_LIST_FLAGS = 15;
  private static final int METHODID_UPDATE_FLAG = 16;
  private static final int METHODID_DELETE_FLAG = 17;
  private static final int METHODID_CREATE_FLAG_REVIEW = 18;
  private static final int METHODID_BULK_CREATE_FLAG_REVIEW = 19;
  private static final int METHODID_LIST_FLAG_REVIEWS = 20;
  private static final int METHODID_CREATE_FLAG_TRANSCRIPT = 21;
  private static final int METHODID_SEARCH_FLAG_TRANSCRIPTS = 22;
  private static final int METHODID_CREATE_FLAG_FILTER = 23;
  private static final int METHODID_LIST_FLAG_FILTERS = 24;
  private static final int METHODID_DELETE_FLAG_FILTER = 25;
  private static final int METHODID_LIST_FLAG_SNAPSHOTS = 26;
  private static final int METHODID_LIST_FLAG_TRANSCRIPT_FILTERS = 27;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VanalyticsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VanalyticsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUDIT:
          serviceImpl.audit((com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.AuditResponse>) responseObserver);
          break;
        case METHODID_GET_RECORDING_URL:
          serviceImpl.getRecordingUrl((com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.GetRecordingUrlResponse>) responseObserver);
          break;
        case METHODID_LIST_BILLING_SPAN:
          serviceImpl.listBillingSpan((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListBillingSpanResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSCRIPT_GROUP_NAMES:
          serviceImpl.listTranscriptGroupNames((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListTranscriptGroupNamesResponse>) responseObserver);
          break;
        case METHODID_BULK_DELETE_TRANSCRIPTS:
          serviceImpl.bulkDeleteTranscripts((com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkDeleteTranscriptsResponse>) responseObserver);
          break;
        case METHODID_BULK_RESTORE_TRANSCRIPTS:
          serviceImpl.bulkRestoreTranscripts((com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkRestoreTranscriptsResponse>) responseObserver);
          break;
        case METHODID_LIST_AGENT_RESPONSE_VALUES:
          serviceImpl.listAgentResponseValues((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListAgentResponseValuesResponse>) responseObserver);
          break;
        case METHODID_CREATE_FILTER:
          serviceImpl.createFilter((com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>) responseObserver);
          break;
        case METHODID_LIST_FILTERS:
          serviceImpl.listFilters((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFiltersResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FILTER:
          serviceImpl.updateFilter((com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>) responseObserver);
          break;
        case METHODID_DELETE_FILTER:
          serviceImpl.deleteFilter((com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFilterResponse>) responseObserver);
          break;
        case METHODID_GET_FILTER:
          serviceImpl.getFilter((com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Filter>) responseObserver);
          break;
        case METHODID_GET_FLAG:
          serviceImpl.getFlag((com.tcn.cloud.api.api.v1alpha1.vanalytics.GetFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>) responseObserver);
          break;
        case METHODID_CREATE_FLAG:
          serviceImpl.createFlag((com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>) responseObserver);
          break;
        case METHODID_LIST_FLAGS:
          serviceImpl.listFlags((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_FLAG:
          serviceImpl.updateFlag((com.tcn.cloud.api.api.v1alpha1.vanalytics.UpdateFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.Flag>) responseObserver);
          break;
        case METHODID_DELETE_FLAG:
          serviceImpl.deleteFlag((com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagResponse>) responseObserver);
          break;
        case METHODID_CREATE_FLAG_REVIEW:
          serviceImpl.createFlagReview((com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagReview>) responseObserver);
          break;
        case METHODID_BULK_CREATE_FLAG_REVIEW:
          serviceImpl.bulkCreateFlagReview((com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.BulkCreateFlagReviewResponse>) responseObserver);
          break;
        case METHODID_LIST_FLAG_REVIEWS:
          serviceImpl.listFlagReviews((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagReviewsResponse>) responseObserver);
          break;
        case METHODID_CREATE_FLAG_TRANSCRIPT:
          serviceImpl.createFlagTranscript((com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagTranscriptResponse>) responseObserver);
          break;
        case METHODID_SEARCH_FLAG_TRANSCRIPTS:
          serviceImpl.searchFlagTranscripts((com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.SearchFlagTranscriptsResponse>) responseObserver);
          break;
        case METHODID_CREATE_FLAG_FILTER:
          serviceImpl.createFlagFilter((com.tcn.cloud.api.api.v1alpha1.vanalytics.CreateFlagFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.FlagFilter>) responseObserver);
          break;
        case METHODID_LIST_FLAG_FILTERS:
          serviceImpl.listFlagFilters((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagFiltersResponse>) responseObserver);
          break;
        case METHODID_DELETE_FLAG_FILTER:
          serviceImpl.deleteFlagFilter((com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.DeleteFlagFilterResponse>) responseObserver);
          break;
        case METHODID_LIST_FLAG_SNAPSHOTS:
          serviceImpl.listFlagSnapshots((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagSnapshotsResponse>) responseObserver);
          break;
        case METHODID_LIST_FLAG_TRANSCRIPT_FILTERS:
          serviceImpl.listFlagTranscriptFilters((com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.vanalytics.ListFlagTranscriptFiltersResponse>) responseObserver);
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

  private static abstract class VanalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VanalyticsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Vanalytics");
    }
  }

  private static final class VanalyticsFileDescriptorSupplier
      extends VanalyticsBaseDescriptorSupplier {
    VanalyticsFileDescriptorSupplier() {}
  }

  private static final class VanalyticsMethodDescriptorSupplier
      extends VanalyticsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VanalyticsMethodDescriptorSupplier(String methodName) {
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
      synchronized (VanalyticsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VanalyticsFileDescriptorSupplier())
              .addMethod(getAuditMethod())
              .addMethod(getGetRecordingUrlMethod())
              .addMethod(getListBillingSpanMethod())
              .addMethod(getSearchMethod())
              .addMethod(getListTranscriptGroupNamesMethod())
              .addMethod(getBulkDeleteTranscriptsMethod())
              .addMethod(getBulkRestoreTranscriptsMethod())
              .addMethod(getListAgentResponseValuesMethod())
              .addMethod(getCreateFilterMethod())
              .addMethod(getListFiltersMethod())
              .addMethod(getUpdateFilterMethod())
              .addMethod(getDeleteFilterMethod())
              .addMethod(getGetFilterMethod())
              .addMethod(getGetFlagMethod())
              .addMethod(getCreateFlagMethod())
              .addMethod(getListFlagsMethod())
              .addMethod(getUpdateFlagMethod())
              .addMethod(getDeleteFlagMethod())
              .addMethod(getCreateFlagReviewMethod())
              .addMethod(getBulkCreateFlagReviewMethod())
              .addMethod(getListFlagReviewsMethod())
              .addMethod(getCreateFlagTranscriptMethod())
              .addMethod(getSearchFlagTranscriptsMethod())
              .addMethod(getCreateFlagFilterMethod())
              .addMethod(getListFlagFiltersMethod())
              .addMethod(getDeleteFlagFilterMethod())
              .addMethod(getListFlagSnapshotsMethod())
              .addMethod(getListFlagTranscriptFiltersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
