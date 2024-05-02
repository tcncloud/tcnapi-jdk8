package com.tcn.cloud.api.api.v1alpha1.scorecards;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: api/v1alpha1/scorecards/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScorecardsGrpc {

  private ScorecardsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "api.v1alpha1.scorecards.Scorecards";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse> getCreateScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScorecard",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse> getCreateScorecardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse> getCreateScorecardMethod;
    if ((getCreateScorecardMethod = ScorecardsGrpc.getCreateScorecardMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateScorecardMethod = ScorecardsGrpc.getCreateScorecardMethod) == null) {
          ScorecardsGrpc.getCreateScorecardMethod = getCreateScorecardMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateScorecard"))
              .build();
        }
      }
    }
    return getCreateScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> getListScorecardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListScorecards",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> getListScorecardsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> getListScorecardsMethod;
    if ((getListScorecardsMethod = ScorecardsGrpc.getListScorecardsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getListScorecardsMethod = ScorecardsGrpc.getListScorecardsMethod) == null) {
          ScorecardsGrpc.getListScorecardsMethod = getListScorecardsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListScorecards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ListScorecards"))
              .build();
        }
      }
    }
    return getListScorecardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse> getUpdateScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScorecard",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse> getUpdateScorecardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse> getUpdateScorecardMethod;
    if ((getUpdateScorecardMethod = ScorecardsGrpc.getUpdateScorecardMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateScorecardMethod = ScorecardsGrpc.getUpdateScorecardMethod) == null) {
          ScorecardsGrpc.getUpdateScorecardMethod = getUpdateScorecardMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateScorecard"))
              .build();
        }
      }
    }
    return getUpdateScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse> getDeleteScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScorecard",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse> getDeleteScorecardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse> getDeleteScorecardMethod;
    if ((getDeleteScorecardMethod = ScorecardsGrpc.getDeleteScorecardMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteScorecardMethod = ScorecardsGrpc.getDeleteScorecardMethod) == null) {
          ScorecardsGrpc.getDeleteScorecardMethod = getDeleteScorecardMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteScorecard"))
              .build();
        }
      }
    }
    return getDeleteScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse> getGetScorecardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScorecard",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse> getGetScorecardMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse> getGetScorecardMethod;
    if ((getGetScorecardMethod = ScorecardsGrpc.getGetScorecardMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetScorecardMethod = ScorecardsGrpc.getGetScorecardMethod) == null) {
          ScorecardsGrpc.getGetScorecardMethod = getGetScorecardMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScorecard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetScorecard"))
              .build();
        }
      }
    }
    return getGetScorecardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse> getCreateQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse> getCreateQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse> getCreateQuestionMethod;
    if ((getCreateQuestionMethod = ScorecardsGrpc.getCreateQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateQuestionMethod = ScorecardsGrpc.getCreateQuestionMethod) == null) {
          ScorecardsGrpc.getCreateQuestionMethod = getCreateQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateQuestion"))
              .build();
        }
      }
    }
    return getCreateQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse> getListQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListQuestions",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse> getListQuestionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse> getListQuestionsMethod;
    if ((getListQuestionsMethod = ScorecardsGrpc.getListQuestionsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getListQuestionsMethod = ScorecardsGrpc.getListQuestionsMethod) == null) {
          ScorecardsGrpc.getListQuestionsMethod = getListQuestionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ListQuestions"))
              .build();
        }
      }
    }
    return getListQuestionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse> getUpdateQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse> getUpdateQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse> getUpdateQuestionMethod;
    if ((getUpdateQuestionMethod = ScorecardsGrpc.getUpdateQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateQuestionMethod = ScorecardsGrpc.getUpdateQuestionMethod) == null) {
          ScorecardsGrpc.getUpdateQuestionMethod = getUpdateQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateQuestion"))
              .build();
        }
      }
    }
    return getUpdateQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse> getDeleteQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse> getDeleteQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse> getDeleteQuestionMethod;
    if ((getDeleteQuestionMethod = ScorecardsGrpc.getDeleteQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteQuestionMethod = ScorecardsGrpc.getDeleteQuestionMethod) == null) {
          ScorecardsGrpc.getDeleteQuestionMethod = getDeleteQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteQuestion"))
              .build();
        }
      }
    }
    return getDeleteQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse> getGetQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse> getGetQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse> getGetQuestionMethod;
    if ((getGetQuestionMethod = ScorecardsGrpc.getGetQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetQuestionMethod = ScorecardsGrpc.getGetQuestionMethod) == null) {
          ScorecardsGrpc.getGetQuestionMethod = getGetQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetQuestion"))
              .build();
        }
      }
    }
    return getGetQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse> getBulkCreateQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkCreateQuestions",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse> getBulkCreateQuestionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse> getBulkCreateQuestionsMethod;
    if ((getBulkCreateQuestionsMethod = ScorecardsGrpc.getBulkCreateQuestionsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getBulkCreateQuestionsMethod = ScorecardsGrpc.getBulkCreateQuestionsMethod) == null) {
          ScorecardsGrpc.getBulkCreateQuestionsMethod = getBulkCreateQuestionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkCreateQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("BulkCreateQuestions"))
              .build();
        }
      }
    }
    return getBulkCreateQuestionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse> getCreateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse> getCreateCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse> getCreateCategoryMethod;
    if ((getCreateCategoryMethod = ScorecardsGrpc.getCreateCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateCategoryMethod = ScorecardsGrpc.getCreateCategoryMethod) == null) {
          ScorecardsGrpc.getCreateCategoryMethod = getCreateCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateCategory"))
              .build();
        }
      }
    }
    return getCreateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse> getListCategoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCategories",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse> getListCategoriesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse> getListCategoriesMethod;
    if ((getListCategoriesMethod = ScorecardsGrpc.getListCategoriesMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getListCategoriesMethod = ScorecardsGrpc.getListCategoriesMethod) == null) {
          ScorecardsGrpc.getListCategoriesMethod = getListCategoriesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCategories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ListCategories"))
              .build();
        }
      }
    }
    return getListCategoriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse> getUpdateCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse> getUpdateCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse> getUpdateCategoryMethod;
    if ((getUpdateCategoryMethod = ScorecardsGrpc.getUpdateCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateCategoryMethod = ScorecardsGrpc.getUpdateCategoryMethod) == null) {
          ScorecardsGrpc.getUpdateCategoryMethod = getUpdateCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateCategory"))
              .build();
        }
      }
    }
    return getUpdateCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse> getDeleteCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse> getDeleteCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse> getDeleteCategoryMethod;
    if ((getDeleteCategoryMethod = ScorecardsGrpc.getDeleteCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteCategoryMethod = ScorecardsGrpc.getDeleteCategoryMethod) == null) {
          ScorecardsGrpc.getDeleteCategoryMethod = getDeleteCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteCategory"))
              .build();
        }
      }
    }
    return getDeleteCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse> getGetCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse> getGetCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse> getGetCategoryMethod;
    if ((getGetCategoryMethod = ScorecardsGrpc.getGetCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetCategoryMethod = ScorecardsGrpc.getGetCategoryMethod) == null) {
          ScorecardsGrpc.getGetCategoryMethod = getGetCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetCategory"))
              .build();
        }
      }
    }
    return getGetCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse> getCreateScorecardQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateScorecardQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse> getCreateScorecardQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse> getCreateScorecardQuestionMethod;
    if ((getCreateScorecardQuestionMethod = ScorecardsGrpc.getCreateScorecardQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateScorecardQuestionMethod = ScorecardsGrpc.getCreateScorecardQuestionMethod) == null) {
          ScorecardsGrpc.getCreateScorecardQuestionMethod = getCreateScorecardQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateScorecardQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateScorecardQuestion"))
              .build();
        }
      }
    }
    return getCreateScorecardQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse> getUpdateScorecardQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateScorecardQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse> getUpdateScorecardQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse> getUpdateScorecardQuestionMethod;
    if ((getUpdateScorecardQuestionMethod = ScorecardsGrpc.getUpdateScorecardQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateScorecardQuestionMethod = ScorecardsGrpc.getUpdateScorecardQuestionMethod) == null) {
          ScorecardsGrpc.getUpdateScorecardQuestionMethod = getUpdateScorecardQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateScorecardQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateScorecardQuestion"))
              .build();
        }
      }
    }
    return getUpdateScorecardQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse> getDeleteScorecardQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteScorecardQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse> getDeleteScorecardQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse> getDeleteScorecardQuestionMethod;
    if ((getDeleteScorecardQuestionMethod = ScorecardsGrpc.getDeleteScorecardQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteScorecardQuestionMethod = ScorecardsGrpc.getDeleteScorecardQuestionMethod) == null) {
          ScorecardsGrpc.getDeleteScorecardQuestionMethod = getDeleteScorecardQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteScorecardQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteScorecardQuestion"))
              .build();
        }
      }
    }
    return getDeleteScorecardQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse> getGetScorecardQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetScorecardQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse> getGetScorecardQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse> getGetScorecardQuestionMethod;
    if ((getGetScorecardQuestionMethod = ScorecardsGrpc.getGetScorecardQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetScorecardQuestionMethod = ScorecardsGrpc.getGetScorecardQuestionMethod) == null) {
          ScorecardsGrpc.getGetScorecardQuestionMethod = getGetScorecardQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetScorecardQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetScorecardQuestion"))
              .build();
        }
      }
    }
    return getGetScorecardQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse> getCreateSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSection",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse> getCreateSectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse> getCreateSectionMethod;
    if ((getCreateSectionMethod = ScorecardsGrpc.getCreateSectionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateSectionMethod = ScorecardsGrpc.getCreateSectionMethod) == null) {
          ScorecardsGrpc.getCreateSectionMethod = getCreateSectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateSection"))
              .build();
        }
      }
    }
    return getCreateSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse> getListSectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSections",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse> getListSectionsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse> getListSectionsMethod;
    if ((getListSectionsMethod = ScorecardsGrpc.getListSectionsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getListSectionsMethod = ScorecardsGrpc.getListSectionsMethod) == null) {
          ScorecardsGrpc.getListSectionsMethod = getListSectionsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ListSections"))
              .build();
        }
      }
    }
    return getListSectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse> getUpdateSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSection",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse> getUpdateSectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse> getUpdateSectionMethod;
    if ((getUpdateSectionMethod = ScorecardsGrpc.getUpdateSectionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateSectionMethod = ScorecardsGrpc.getUpdateSectionMethod) == null) {
          ScorecardsGrpc.getUpdateSectionMethod = getUpdateSectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateSection"))
              .build();
        }
      }
    }
    return getUpdateSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse> getGetSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSection",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse> getGetSectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse> getGetSectionMethod;
    if ((getGetSectionMethod = ScorecardsGrpc.getGetSectionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetSectionMethod = ScorecardsGrpc.getGetSectionMethod) == null) {
          ScorecardsGrpc.getGetSectionMethod = getGetSectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetSection"))
              .build();
        }
      }
    }
    return getGetSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse> getDeleteSectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSection",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse> getDeleteSectionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse> getDeleteSectionMethod;
    if ((getDeleteSectionMethod = ScorecardsGrpc.getDeleteSectionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteSectionMethod = ScorecardsGrpc.getDeleteSectionMethod) == null) {
          ScorecardsGrpc.getDeleteSectionMethod = getDeleteSectionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteSection"))
              .build();
        }
      }
    }
    return getDeleteSectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse> getCreateQuestionCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateQuestionCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse> getCreateQuestionCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse> getCreateQuestionCategoryMethod;
    if ((getCreateQuestionCategoryMethod = ScorecardsGrpc.getCreateQuestionCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateQuestionCategoryMethod = ScorecardsGrpc.getCreateQuestionCategoryMethod) == null) {
          ScorecardsGrpc.getCreateQuestionCategoryMethod = getCreateQuestionCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateQuestionCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateQuestionCategory"))
              .build();
        }
      }
    }
    return getCreateQuestionCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse> getDeleteQuestionCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteQuestionCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse> getDeleteQuestionCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse> getDeleteQuestionCategoryMethod;
    if ((getDeleteQuestionCategoryMethod = ScorecardsGrpc.getDeleteQuestionCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteQuestionCategoryMethod = ScorecardsGrpc.getDeleteQuestionCategoryMethod) == null) {
          ScorecardsGrpc.getDeleteQuestionCategoryMethod = getDeleteQuestionCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteQuestionCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteQuestionCategory"))
              .build();
        }
      }
    }
    return getDeleteQuestionCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse> getCreateEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse> getCreateEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse> getCreateEvaluationMethod;
    if ((getCreateEvaluationMethod = ScorecardsGrpc.getCreateEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateEvaluationMethod = ScorecardsGrpc.getCreateEvaluationMethod) == null) {
          ScorecardsGrpc.getCreateEvaluationMethod = getCreateEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateEvaluation"))
              .build();
        }
      }
    }
    return getCreateEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> getDeleteEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> getDeleteEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> getDeleteEvaluationMethod;
    if ((getDeleteEvaluationMethod = ScorecardsGrpc.getDeleteEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteEvaluationMethod = ScorecardsGrpc.getDeleteEvaluationMethod) == null) {
          ScorecardsGrpc.getDeleteEvaluationMethod = getDeleteEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteEvaluation"))
              .build();
        }
      }
    }
    return getDeleteEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse> getScoreEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScoreEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse> getScoreEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse> getScoreEvaluationMethod;
    if ((getScoreEvaluationMethod = ScorecardsGrpc.getScoreEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getScoreEvaluationMethod = ScorecardsGrpc.getScoreEvaluationMethod) == null) {
          ScorecardsGrpc.getScoreEvaluationMethod = getScoreEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScoreEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ScoreEvaluation"))
              .build();
        }
      }
    }
    return getScoreEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse> getUpdateEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse> getUpdateEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse> getUpdateEvaluationMethod;
    if ((getUpdateEvaluationMethod = ScorecardsGrpc.getUpdateEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateEvaluationMethod = ScorecardsGrpc.getUpdateEvaluationMethod) == null) {
          ScorecardsGrpc.getUpdateEvaluationMethod = getUpdateEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateEvaluation"))
              .build();
        }
      }
    }
    return getUpdateEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse> getGetEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse> getGetEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse> getGetEvaluationMethod;
    if ((getGetEvaluationMethod = ScorecardsGrpc.getGetEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetEvaluationMethod = ScorecardsGrpc.getGetEvaluationMethod) == null) {
          ScorecardsGrpc.getGetEvaluationMethod = getGetEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetEvaluation"))
              .build();
        }
      }
    }
    return getGetEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> getListEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEvaluations",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> getListEvaluationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> getListEvaluationsMethod;
    if ((getListEvaluationsMethod = ScorecardsGrpc.getListEvaluationsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getListEvaluationsMethod = ScorecardsGrpc.getListEvaluationsMethod) == null) {
          ScorecardsGrpc.getListEvaluationsMethod = getListEvaluationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListEvaluations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ListEvaluations"))
              .build();
        }
      }
    }
    return getListEvaluationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse> getCreateEvaluationQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEvaluationQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse> getCreateEvaluationQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse> getCreateEvaluationQuestionMethod;
    if ((getCreateEvaluationQuestionMethod = ScorecardsGrpc.getCreateEvaluationQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateEvaluationQuestionMethod = ScorecardsGrpc.getCreateEvaluationQuestionMethod) == null) {
          ScorecardsGrpc.getCreateEvaluationQuestionMethod = getCreateEvaluationQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEvaluationQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateEvaluationQuestion"))
              .build();
        }
      }
    }
    return getCreateEvaluationQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse> getUpdateEvaluationQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEvaluationQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse> getUpdateEvaluationQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse> getUpdateEvaluationQuestionMethod;
    if ((getUpdateEvaluationQuestionMethod = ScorecardsGrpc.getUpdateEvaluationQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateEvaluationQuestionMethod = ScorecardsGrpc.getUpdateEvaluationQuestionMethod) == null) {
          ScorecardsGrpc.getUpdateEvaluationQuestionMethod = getUpdateEvaluationQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEvaluationQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateEvaluationQuestion"))
              .build();
        }
      }
    }
    return getUpdateEvaluationQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse> getDeleteEvaluationQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEvaluationQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse> getDeleteEvaluationQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse> getDeleteEvaluationQuestionMethod;
    if ((getDeleteEvaluationQuestionMethod = ScorecardsGrpc.getDeleteEvaluationQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteEvaluationQuestionMethod = ScorecardsGrpc.getDeleteEvaluationQuestionMethod) == null) {
          ScorecardsGrpc.getDeleteEvaluationQuestionMethod = getDeleteEvaluationQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEvaluationQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteEvaluationQuestion"))
              .build();
        }
      }
    }
    return getDeleteEvaluationQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse> getSampleCallsByCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SampleCallsByCategory",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse> getSampleCallsByCategoryMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse> getSampleCallsByCategoryMethod;
    if ((getSampleCallsByCategoryMethod = ScorecardsGrpc.getSampleCallsByCategoryMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getSampleCallsByCategoryMethod = ScorecardsGrpc.getSampleCallsByCategoryMethod) == null) {
          ScorecardsGrpc.getSampleCallsByCategoryMethod = getSampleCallsByCategoryMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SampleCallsByCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("SampleCallsByCategory"))
              .build();
        }
      }
    }
    return getSampleCallsByCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse> getCreateAutoQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAutoQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse> getCreateAutoQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse> getCreateAutoQuestionMethod;
    if ((getCreateAutoQuestionMethod = ScorecardsGrpc.getCreateAutoQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getCreateAutoQuestionMethod = ScorecardsGrpc.getCreateAutoQuestionMethod) == null) {
          ScorecardsGrpc.getCreateAutoQuestionMethod = getCreateAutoQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAutoQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("CreateAutoQuestion"))
              .build();
        }
      }
    }
    return getCreateAutoQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse> getUpdateAutoQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAutoQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse> getUpdateAutoQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse> getUpdateAutoQuestionMethod;
    if ((getUpdateAutoQuestionMethod = ScorecardsGrpc.getUpdateAutoQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getUpdateAutoQuestionMethod = ScorecardsGrpc.getUpdateAutoQuestionMethod) == null) {
          ScorecardsGrpc.getUpdateAutoQuestionMethod = getUpdateAutoQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAutoQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("UpdateAutoQuestion"))
              .build();
        }
      }
    }
    return getUpdateAutoQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse> getDeleteAutoQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAutoQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse> getDeleteAutoQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse> getDeleteAutoQuestionMethod;
    if ((getDeleteAutoQuestionMethod = ScorecardsGrpc.getDeleteAutoQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteAutoQuestionMethod = ScorecardsGrpc.getDeleteAutoQuestionMethod) == null) {
          ScorecardsGrpc.getDeleteAutoQuestionMethod = getDeleteAutoQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAutoQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteAutoQuestion"))
              .build();
        }
      }
    }
    return getDeleteAutoQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse> getGetAutoQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAutoQuestion",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse> getGetAutoQuestionMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse> getGetAutoQuestionMethod;
    if ((getGetAutoQuestionMethod = ScorecardsGrpc.getGetAutoQuestionMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetAutoQuestionMethod = ScorecardsGrpc.getGetAutoQuestionMethod) == null) {
          ScorecardsGrpc.getGetAutoQuestionMethod = getGetAutoQuestionMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAutoQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetAutoQuestion"))
              .build();
        }
      }
    }
    return getGetAutoQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse> getGetAutoEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAutoEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse> getGetAutoEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse> getGetAutoEvaluationMethod;
    if ((getGetAutoEvaluationMethod = ScorecardsGrpc.getGetAutoEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getGetAutoEvaluationMethod = ScorecardsGrpc.getGetAutoEvaluationMethod) == null) {
          ScorecardsGrpc.getGetAutoEvaluationMethod = getGetAutoEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAutoEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("GetAutoEvaluation"))
              .build();
        }
      }
    }
    return getGetAutoEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> getListAutoEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAutoEvaluations",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> getListAutoEvaluationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> getListAutoEvaluationsMethod;
    if ((getListAutoEvaluationsMethod = ScorecardsGrpc.getListAutoEvaluationsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getListAutoEvaluationsMethod = ScorecardsGrpc.getListAutoEvaluationsMethod) == null) {
          ScorecardsGrpc.getListAutoEvaluationsMethod = getListAutoEvaluationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAutoEvaluations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("ListAutoEvaluations"))
              .build();
        }
      }
    }
    return getListAutoEvaluationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse> getStreamAutoEvaluationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamAutoEvaluations",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse> getStreamAutoEvaluationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse> getStreamAutoEvaluationsMethod;
    if ((getStreamAutoEvaluationsMethod = ScorecardsGrpc.getStreamAutoEvaluationsMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getStreamAutoEvaluationsMethod = ScorecardsGrpc.getStreamAutoEvaluationsMethod) == null) {
          ScorecardsGrpc.getStreamAutoEvaluationsMethod = getStreamAutoEvaluationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamAutoEvaluations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("StreamAutoEvaluations"))
              .build();
        }
      }
    }
    return getStreamAutoEvaluationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> getDeleteAutoEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAutoEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> getDeleteAutoEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> getDeleteAutoEvaluationMethod;
    if ((getDeleteAutoEvaluationMethod = ScorecardsGrpc.getDeleteAutoEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getDeleteAutoEvaluationMethod = ScorecardsGrpc.getDeleteAutoEvaluationMethod) == null) {
          ScorecardsGrpc.getDeleteAutoEvaluationMethod = getDeleteAutoEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAutoEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("DeleteAutoEvaluation"))
              .build();
        }
      }
    }
    return getDeleteAutoEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse> getPreviewEvaluationScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PreviewEvaluationScore",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse> getPreviewEvaluationScoreMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse> getPreviewEvaluationScoreMethod;
    if ((getPreviewEvaluationScoreMethod = ScorecardsGrpc.getPreviewEvaluationScoreMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getPreviewEvaluationScoreMethod = ScorecardsGrpc.getPreviewEvaluationScoreMethod) == null) {
          ScorecardsGrpc.getPreviewEvaluationScoreMethod = getPreviewEvaluationScoreMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PreviewEvaluationScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("PreviewEvaluationScore"))
              .build();
        }
      }
    }
    return getPreviewEvaluationScoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse> getRestoreEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestoreEvaluation",
      requestType = com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest.class,
      responseType = com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest,
      com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse> getRestoreEvaluationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse> getRestoreEvaluationMethod;
    if ((getRestoreEvaluationMethod = ScorecardsGrpc.getRestoreEvaluationMethod) == null) {
      synchronized (ScorecardsGrpc.class) {
        if ((getRestoreEvaluationMethod = ScorecardsGrpc.getRestoreEvaluationMethod) == null) {
          ScorecardsGrpc.getRestoreEvaluationMethod = getRestoreEvaluationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest, com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestoreEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ScorecardsMethodDescriptorSupplier("RestoreEvaluation"))
              .build();
        }
      }
    }
    return getRestoreEvaluationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScorecardsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScorecardsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScorecardsStub>() {
        @java.lang.Override
        public ScorecardsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScorecardsStub(channel, callOptions);
        }
      };
    return ScorecardsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScorecardsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScorecardsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScorecardsBlockingStub>() {
        @java.lang.Override
        public ScorecardsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScorecardsBlockingStub(channel, callOptions);
        }
      };
    return ScorecardsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScorecardsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScorecardsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScorecardsFutureStub>() {
        @java.lang.Override
        public ScorecardsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScorecardsFutureStub(channel, callOptions);
        }
      };
    return ScorecardsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * CreateScorecard creates a new scorecard
     * </pre>
     */
    default void createScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListScorecards lists scorecards
     * </pre>
     */
    default void listScorecards(com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListScorecardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecard updates an existing scorecard
     * </pre>
     */
    default void updateScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScorecard deletes a scorecard
     * </pre>
     */
    default void deleteScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScorecard gets a scorecard by ID
     * </pre>
     */
    default void getScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScorecardMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateQuestion creates a new library question
     * </pre>
     */
    default void createQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListQuestions lists library questions
     * </pre>
     */
    default void listQuestions(com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListQuestionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateQuestion updates a library question
     * </pre>
     */
    default void updateQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteQuestion deletes a library question
     * </pre>
     */
    default void deleteQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetQuestion gets a library question
     * </pre>
     */
    default void getQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * BulkCreateQuestions creates library questions by a scorecard id
     * </pre>
     */
    default void bulkCreateQuestions(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkCreateQuestionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateCategory creates a new scorecards category
     * </pre>
     */
    default void createCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListCategories lists scorecards categories
     * </pre>
     */
    default void listCategories(com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCategoriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateCategory updates a scorecard category
     * </pre>
     */
    default void updateCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteCategory deletes a scorecard category
     * </pre>
     */
    default void deleteCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetCategory gets a scorecard category
     * </pre>
     */
    default void getCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateScorecardQuestion creates a scorecard scorecard question
     * </pre>
     */
    default void createScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateScorecardQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecardQuestion updates a scorecard question
     * </pre>
     */
    default void updateScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScorecardQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteScorecardQuestion deletes a scorecard question
     * </pre>
     */
    default void deleteScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteScorecardQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetScorecardQuestion gets a scorecard question
     * </pre>
     */
    default void getScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScorecardQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSection creates a new scorecards section
     * </pre>
     */
    default void createSection(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListSections lists scorecards sections
     * </pre>
     */
    default void listSections(com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSection updates a scorecard section
     * </pre>
     */
    default void updateSection(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSection gets a scorecard section
     * </pre>
     */
    default void getSection(com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSection deletes a scorecard section
     * </pre>
     */
    default void deleteSection(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateQuestionCategory links a scorecard question and category
     * </pre>
     */
    default void createQuestionCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateQuestionCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteQuestionCategory deletes link between a scorecard question and category
     * </pre>
     */
    default void deleteQuestionCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteQuestionCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateEvaluation creates a new evaluation
     * </pre>
     */
    default void createEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteEvaluation gets an evaluation
     * </pre>
     */
    default void deleteEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    default void scoreEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScoreEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEvaluation updates an evaluation
     * </pre>
     */
    default void updateEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    default void getEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListEvaluations gets a list of evaluations
     * </pre>
     */
    default void listEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEvaluationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DEPRECATED. Use CreateEvaluation to create evaluation sub-entities.
     * </pre>
     */
    @java.lang.Deprecated
    default void createEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEvaluationQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateEvaluationQuestion updates an existing evaluation question
     * </pre>
     */
    default void updateEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEvaluationQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteEvaluationQuestion creates an evaluation question
     * </pre>
     */
    default void deleteEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEvaluationQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * SampleCallsByCategory
     * </pre>
     */
    default void sampleCallsByCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSampleCallsByCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateAutoQuestion creates an auto question
     * </pre>
     */
    default void createAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAutoQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateAutoQuestion updates an auto question
     * </pre>
     */
    default void updateAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAutoQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAutoQuestion deletes an auto question
     * </pre>
     */
    default void deleteAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAutoQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAutoQuestion gets an auto question
     * </pre>
     */
    default void getAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAutoQuestionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetAutoEvaluation gets an auto evaluation
     * </pre>
     */
    default void getAutoEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAutoEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAutoEvaluations gets a list of auto evaluations
     * </pre>
     */
    default void listAutoEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAutoEvaluationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * StreamAutoEvaluations streams a list of auto evaluations
     * </pre>
     */
    default void streamAutoEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamAutoEvaluationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteAutoEvaluation deletes an auto evaluations
     * </pre>
     */
    default void deleteAutoEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAutoEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * PreviewEvaluationScore previews the score for an evaluation
     * </pre>
     */
    default void previewEvaluationScore(com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPreviewEvaluationScoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * RestoreEvaluation restores an evaluation previously deleted.
     * </pre>
     */
    default void restoreEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestoreEvaluationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Scorecards.
   */
  public static abstract class ScorecardsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ScorecardsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Scorecards.
   */
  public static final class ScorecardsStub
      extends io.grpc.stub.AbstractAsyncStub<ScorecardsStub> {
    private ScorecardsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScorecardsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScorecardsStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateScorecard creates a new scorecard
     * </pre>
     */
    public void createScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListScorecards lists scorecards
     * </pre>
     */
    public void listScorecards(com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListScorecardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecard updates an existing scorecard
     * </pre>
     */
    public void updateScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScorecard deletes a scorecard
     * </pre>
     */
    public void deleteScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScorecard gets a scorecard by ID
     * </pre>
     */
    public void getScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScorecardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateQuestion creates a new library question
     * </pre>
     */
    public void createQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListQuestions lists library questions
     * </pre>
     */
    public void listQuestions(com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListQuestionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateQuestion updates a library question
     * </pre>
     */
    public void updateQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteQuestion deletes a library question
     * </pre>
     */
    public void deleteQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetQuestion gets a library question
     * </pre>
     */
    public void getQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * BulkCreateQuestions creates library questions by a scorecard id
     * </pre>
     */
    public void bulkCreateQuestions(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkCreateQuestionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateCategory creates a new scorecards category
     * </pre>
     */
    public void createCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListCategories lists scorecards categories
     * </pre>
     */
    public void listCategories(com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateCategory updates a scorecard category
     * </pre>
     */
    public void updateCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteCategory deletes a scorecard category
     * </pre>
     */
    public void deleteCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetCategory gets a scorecard category
     * </pre>
     */
    public void getCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateScorecardQuestion creates a scorecard scorecard question
     * </pre>
     */
    public void createScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateScorecardQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateScorecardQuestion updates a scorecard question
     * </pre>
     */
    public void updateScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScorecardQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteScorecardQuestion deletes a scorecard question
     * </pre>
     */
    public void deleteScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteScorecardQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetScorecardQuestion gets a scorecard question
     * </pre>
     */
    public void getScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScorecardQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSection creates a new scorecards section
     * </pre>
     */
    public void createSection(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListSections lists scorecards sections
     * </pre>
     */
    public void listSections(com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSection updates a scorecard section
     * </pre>
     */
    public void updateSection(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSection gets a scorecard section
     * </pre>
     */
    public void getSection(com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSection deletes a scorecard section
     * </pre>
     */
    public void deleteSection(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateQuestionCategory links a scorecard question and category
     * </pre>
     */
    public void createQuestionCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateQuestionCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteQuestionCategory deletes link between a scorecard question and category
     * </pre>
     */
    public void deleteQuestionCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteQuestionCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateEvaluation creates a new evaluation
     * </pre>
     */
    public void createEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteEvaluation gets an evaluation
     * </pre>
     */
    public void deleteEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    public void scoreEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScoreEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEvaluation updates an evaluation
     * </pre>
     */
    public void updateEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    public void getEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListEvaluations gets a list of evaluations
     * </pre>
     */
    public void listEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListEvaluationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DEPRECATED. Use CreateEvaluation to create evaluation sub-entities.
     * </pre>
     */
    @java.lang.Deprecated
    public void createEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEvaluationQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateEvaluationQuestion updates an existing evaluation question
     * </pre>
     */
    public void updateEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEvaluationQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteEvaluationQuestion creates an evaluation question
     * </pre>
     */
    public void deleteEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEvaluationQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SampleCallsByCategory
     * </pre>
     */
    public void sampleCallsByCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSampleCallsByCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateAutoQuestion creates an auto question
     * </pre>
     */
    public void createAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAutoQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateAutoQuestion updates an auto question
     * </pre>
     */
    public void updateAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAutoQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAutoQuestion deletes an auto question
     * </pre>
     */
    public void deleteAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAutoQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAutoQuestion gets an auto question
     * </pre>
     */
    public void getAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAutoQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetAutoEvaluation gets an auto evaluation
     * </pre>
     */
    public void getAutoEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAutoEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAutoEvaluations gets a list of auto evaluations
     * </pre>
     */
    public void listAutoEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAutoEvaluationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StreamAutoEvaluations streams a list of auto evaluations
     * </pre>
     */
    public void streamAutoEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamAutoEvaluationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteAutoEvaluation deletes an auto evaluations
     * </pre>
     */
    public void deleteAutoEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAutoEvaluationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PreviewEvaluationScore previews the score for an evaluation
     * </pre>
     */
    public void previewEvaluationScore(com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPreviewEvaluationScoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * RestoreEvaluation restores an evaluation previously deleted.
     * </pre>
     */
    public void restoreEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestoreEvaluationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Scorecards.
   */
  public static final class ScorecardsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ScorecardsBlockingStub> {
    private ScorecardsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScorecardsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScorecardsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateScorecard creates a new scorecard
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse createScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListScorecards lists scorecards
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse listScorecards(com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListScorecardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateScorecard updates an existing scorecard
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse updateScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScorecard deletes a scorecard
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse deleteScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScorecard gets a scorecard by ID
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse getScorecard(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScorecardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateQuestion creates a new library question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse createQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListQuestions lists library questions
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse listQuestions(com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListQuestionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateQuestion updates a library question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse updateQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteQuestion deletes a library question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse deleteQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetQuestion gets a library question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse getQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * BulkCreateQuestions creates library questions by a scorecard id
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse bulkCreateQuestions(com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkCreateQuestionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateCategory creates a new scorecards category
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse createCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListCategories lists scorecards categories
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse listCategories(com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCategoriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateCategory updates a scorecard category
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse updateCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteCategory deletes a scorecard category
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse deleteCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetCategory gets a scorecard category
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse getCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateScorecardQuestion creates a scorecard scorecard question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse createScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateScorecardQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateScorecardQuestion updates a scorecard question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse updateScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScorecardQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteScorecardQuestion deletes a scorecard question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse deleteScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteScorecardQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetScorecardQuestion gets a scorecard question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse getScorecardQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScorecardQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSection creates a new scorecards section
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse createSection(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListSections lists scorecards sections
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse listSections(com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSection updates a scorecard section
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse updateSection(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSection gets a scorecard section
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse getSection(com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSection deletes a scorecard section
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse deleteSection(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateQuestionCategory links a scorecard question and category
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse createQuestionCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateQuestionCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteQuestionCategory deletes link between a scorecard question and category
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse deleteQuestionCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteQuestionCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateEvaluation creates a new evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse createEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteEvaluation gets an evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse deleteEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse scoreEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScoreEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEvaluation updates an evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse updateEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse getEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListEvaluations gets a list of evaluations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse listEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListEvaluationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DEPRECATED. Use CreateEvaluation to create evaluation sub-entities.
     * </pre>
     */
    @java.lang.Deprecated
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse createEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEvaluationQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateEvaluationQuestion updates an existing evaluation question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse updateEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEvaluationQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteEvaluationQuestion creates an evaluation question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse deleteEvaluationQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEvaluationQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SampleCallsByCategory
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse sampleCallsByCategory(com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSampleCallsByCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateAutoQuestion creates an auto question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse createAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAutoQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateAutoQuestion updates an auto question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse updateAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAutoQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAutoQuestion deletes an auto question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse deleteAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAutoQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAutoQuestion gets an auto question
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse getAutoQuestion(com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAutoQuestionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetAutoEvaluation gets an auto evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse getAutoEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAutoEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAutoEvaluations gets a list of auto evaluations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse listAutoEvaluations(com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAutoEvaluationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StreamAutoEvaluations streams a list of auto evaluations
     * </pre>
     */
    public java.util.Iterator<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse> streamAutoEvaluations(
        com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamAutoEvaluationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteAutoEvaluation deletes an auto evaluations
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse deleteAutoEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAutoEvaluationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PreviewEvaluationScore previews the score for an evaluation
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse previewEvaluationScore(com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPreviewEvaluationScoreMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * RestoreEvaluation restores an evaluation previously deleted.
     * </pre>
     */
    public com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse restoreEvaluation(com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestoreEvaluationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Scorecards.
   */
  public static final class ScorecardsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ScorecardsFutureStub> {
    private ScorecardsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScorecardsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScorecardsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateScorecard creates a new scorecard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse> createScorecard(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListScorecards lists scorecards
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse> listScorecards(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListScorecardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateScorecard updates an existing scorecard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse> updateScorecard(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScorecard deletes a scorecard
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse> deleteScorecard(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScorecard gets a scorecard by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse> getScorecard(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScorecardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateQuestion creates a new library question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse> createQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListQuestions lists library questions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse> listQuestions(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListQuestionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateQuestion updates a library question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse> updateQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteQuestion deletes a library question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse> deleteQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetQuestion gets a library question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse> getQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * BulkCreateQuestions creates library questions by a scorecard id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse> bulkCreateQuestions(
        com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkCreateQuestionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateCategory creates a new scorecards category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse> createCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListCategories lists scorecards categories
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse> listCategories(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCategoriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateCategory updates a scorecard category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse> updateCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteCategory deletes a scorecard category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse> deleteCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetCategory gets a scorecard category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse> getCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateScorecardQuestion creates a scorecard scorecard question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse> createScorecardQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateScorecardQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateScorecardQuestion updates a scorecard question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse> updateScorecardQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScorecardQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteScorecardQuestion deletes a scorecard question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse> deleteScorecardQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteScorecardQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetScorecardQuestion gets a scorecard question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse> getScorecardQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScorecardQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSection creates a new scorecards section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse> createSection(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListSections lists scorecards sections
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse> listSections(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSection updates a scorecard section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse> updateSection(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSection gets a scorecard section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse> getSection(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSection deletes a scorecard section
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse> deleteSection(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateQuestionCategory links a scorecard question and category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse> createQuestionCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateQuestionCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteQuestionCategory deletes link between a scorecard question and category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse> deleteQuestionCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteQuestionCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateEvaluation creates a new evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse> createEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteEvaluation gets an evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse> deleteEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse> scoreEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScoreEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEvaluation updates an evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse> updateEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetEvaluation gets an evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse> getEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListEvaluations gets a list of evaluations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse> listEvaluations(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListEvaluationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DEPRECATED. Use CreateEvaluation to create evaluation sub-entities.
     * </pre>
     */
    @java.lang.Deprecated
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse> createEvaluationQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEvaluationQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateEvaluationQuestion updates an existing evaluation question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse> updateEvaluationQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEvaluationQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteEvaluationQuestion creates an evaluation question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse> deleteEvaluationQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEvaluationQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SampleCallsByCategory
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse> sampleCallsByCategory(
        com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSampleCallsByCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateAutoQuestion creates an auto question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse> createAutoQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAutoQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateAutoQuestion updates an auto question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse> updateAutoQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAutoQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAutoQuestion deletes an auto question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse> deleteAutoQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAutoQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAutoQuestion gets an auto question
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse> getAutoQuestion(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAutoQuestionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetAutoEvaluation gets an auto evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse> getAutoEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAutoEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAutoEvaluations gets a list of auto evaluations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse> listAutoEvaluations(
        com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAutoEvaluationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteAutoEvaluation deletes an auto evaluations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse> deleteAutoEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAutoEvaluationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PreviewEvaluationScore previews the score for an evaluation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse> previewEvaluationScore(
        com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPreviewEvaluationScoreMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * RestoreEvaluation restores an evaluation previously deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse> restoreEvaluation(
        com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestoreEvaluationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SCORECARD = 0;
  private static final int METHODID_LIST_SCORECARDS = 1;
  private static final int METHODID_UPDATE_SCORECARD = 2;
  private static final int METHODID_DELETE_SCORECARD = 3;
  private static final int METHODID_GET_SCORECARD = 4;
  private static final int METHODID_CREATE_QUESTION = 5;
  private static final int METHODID_LIST_QUESTIONS = 6;
  private static final int METHODID_UPDATE_QUESTION = 7;
  private static final int METHODID_DELETE_QUESTION = 8;
  private static final int METHODID_GET_QUESTION = 9;
  private static final int METHODID_BULK_CREATE_QUESTIONS = 10;
  private static final int METHODID_CREATE_CATEGORY = 11;
  private static final int METHODID_LIST_CATEGORIES = 12;
  private static final int METHODID_UPDATE_CATEGORY = 13;
  private static final int METHODID_DELETE_CATEGORY = 14;
  private static final int METHODID_GET_CATEGORY = 15;
  private static final int METHODID_CREATE_SCORECARD_QUESTION = 16;
  private static final int METHODID_UPDATE_SCORECARD_QUESTION = 17;
  private static final int METHODID_DELETE_SCORECARD_QUESTION = 18;
  private static final int METHODID_GET_SCORECARD_QUESTION = 19;
  private static final int METHODID_CREATE_SECTION = 20;
  private static final int METHODID_LIST_SECTIONS = 21;
  private static final int METHODID_UPDATE_SECTION = 22;
  private static final int METHODID_GET_SECTION = 23;
  private static final int METHODID_DELETE_SECTION = 24;
  private static final int METHODID_CREATE_QUESTION_CATEGORY = 25;
  private static final int METHODID_DELETE_QUESTION_CATEGORY = 26;
  private static final int METHODID_CREATE_EVALUATION = 27;
  private static final int METHODID_DELETE_EVALUATION = 28;
  private static final int METHODID_SCORE_EVALUATION = 29;
  private static final int METHODID_UPDATE_EVALUATION = 30;
  private static final int METHODID_GET_EVALUATION = 31;
  private static final int METHODID_LIST_EVALUATIONS = 32;
  private static final int METHODID_CREATE_EVALUATION_QUESTION = 33;
  private static final int METHODID_UPDATE_EVALUATION_QUESTION = 34;
  private static final int METHODID_DELETE_EVALUATION_QUESTION = 35;
  private static final int METHODID_SAMPLE_CALLS_BY_CATEGORY = 36;
  private static final int METHODID_CREATE_AUTO_QUESTION = 37;
  private static final int METHODID_UPDATE_AUTO_QUESTION = 38;
  private static final int METHODID_DELETE_AUTO_QUESTION = 39;
  private static final int METHODID_GET_AUTO_QUESTION = 40;
  private static final int METHODID_GET_AUTO_EVALUATION = 41;
  private static final int METHODID_LIST_AUTO_EVALUATIONS = 42;
  private static final int METHODID_STREAM_AUTO_EVALUATIONS = 43;
  private static final int METHODID_DELETE_AUTO_EVALUATION = 44;
  private static final int METHODID_PREVIEW_EVALUATION_SCORE = 45;
  private static final int METHODID_RESTORE_EVALUATION = 46;

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
        case METHODID_CREATE_SCORECARD:
          serviceImpl.createScorecard((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse>) responseObserver);
          break;
        case METHODID_LIST_SCORECARDS:
          serviceImpl.listScorecards((com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCORECARD:
          serviceImpl.updateScorecard((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCORECARD:
          serviceImpl.deleteScorecard((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse>) responseObserver);
          break;
        case METHODID_GET_SCORECARD:
          serviceImpl.getScorecard((com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse>) responseObserver);
          break;
        case METHODID_CREATE_QUESTION:
          serviceImpl.createQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse>) responseObserver);
          break;
        case METHODID_LIST_QUESTIONS:
          serviceImpl.listQuestions((com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_QUESTION:
          serviceImpl.updateQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse>) responseObserver);
          break;
        case METHODID_DELETE_QUESTION:
          serviceImpl.deleteQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse>) responseObserver);
          break;
        case METHODID_GET_QUESTION:
          serviceImpl.getQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse>) responseObserver);
          break;
        case METHODID_BULK_CREATE_QUESTIONS:
          serviceImpl.bulkCreateQuestions((com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse>) responseObserver);
          break;
        case METHODID_CREATE_CATEGORY:
          serviceImpl.createCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse>) responseObserver);
          break;
        case METHODID_LIST_CATEGORIES:
          serviceImpl.listCategories((com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CATEGORY:
          serviceImpl.updateCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse>) responseObserver);
          break;
        case METHODID_DELETE_CATEGORY:
          serviceImpl.deleteCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse>) responseObserver);
          break;
        case METHODID_GET_CATEGORY:
          serviceImpl.getCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_SCORECARD_QUESTION:
          serviceImpl.createScorecardQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SCORECARD_QUESTION:
          serviceImpl.updateScorecardQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCORECARD_QUESTION:
          serviceImpl.deleteScorecardQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse>) responseObserver);
          break;
        case METHODID_GET_SCORECARD_QUESTION:
          serviceImpl.getScorecardQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse>) responseObserver);
          break;
        case METHODID_CREATE_SECTION:
          serviceImpl.createSection((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse>) responseObserver);
          break;
        case METHODID_LIST_SECTIONS:
          serviceImpl.listSections((com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SECTION:
          serviceImpl.updateSection((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse>) responseObserver);
          break;
        case METHODID_GET_SECTION:
          serviceImpl.getSection((com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SECTION:
          serviceImpl.deleteSection((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse>) responseObserver);
          break;
        case METHODID_CREATE_QUESTION_CATEGORY:
          serviceImpl.createQuestionCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse>) responseObserver);
          break;
        case METHODID_DELETE_QUESTION_CATEGORY:
          serviceImpl.deleteQuestionCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_EVALUATION:
          serviceImpl.createEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse>) responseObserver);
          break;
        case METHODID_DELETE_EVALUATION:
          serviceImpl.deleteEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse>) responseObserver);
          break;
        case METHODID_SCORE_EVALUATION:
          serviceImpl.scoreEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVALUATION:
          serviceImpl.updateEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse>) responseObserver);
          break;
        case METHODID_GET_EVALUATION:
          serviceImpl.getEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse>) responseObserver);
          break;
        case METHODID_LIST_EVALUATIONS:
          serviceImpl.listEvaluations((com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse>) responseObserver);
          break;
        case METHODID_CREATE_EVALUATION_QUESTION:
          serviceImpl.createEvaluationQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_EVALUATION_QUESTION:
          serviceImpl.updateEvaluationQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse>) responseObserver);
          break;
        case METHODID_DELETE_EVALUATION_QUESTION:
          serviceImpl.deleteEvaluationQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse>) responseObserver);
          break;
        case METHODID_SAMPLE_CALLS_BY_CATEGORY:
          serviceImpl.sampleCallsByCategory((com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_AUTO_QUESTION:
          serviceImpl.createAutoQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_AUTO_QUESTION:
          serviceImpl.updateAutoQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTO_QUESTION:
          serviceImpl.deleteAutoQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse>) responseObserver);
          break;
        case METHODID_GET_AUTO_QUESTION:
          serviceImpl.getAutoQuestion((com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse>) responseObserver);
          break;
        case METHODID_GET_AUTO_EVALUATION:
          serviceImpl.getAutoEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse>) responseObserver);
          break;
        case METHODID_LIST_AUTO_EVALUATIONS:
          serviceImpl.listAutoEvaluations((com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse>) responseObserver);
          break;
        case METHODID_STREAM_AUTO_EVALUATIONS:
          serviceImpl.streamAutoEvaluations((com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse>) responseObserver);
          break;
        case METHODID_DELETE_AUTO_EVALUATION:
          serviceImpl.deleteAutoEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse>) responseObserver);
          break;
        case METHODID_PREVIEW_EVALUATION_SCORE:
          serviceImpl.previewEvaluationScore((com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse>) responseObserver);
          break;
        case METHODID_RESTORE_EVALUATION:
          serviceImpl.restoreEvaluation((com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse>) responseObserver);
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
          getCreateScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardResponse>(
                service, METHODID_CREATE_SCORECARD)))
        .addMethod(
          getListScorecardsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListScorecardsResponse>(
                service, METHODID_LIST_SCORECARDS)))
        .addMethod(
          getUpdateScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardResponse>(
                service, METHODID_UPDATE_SCORECARD)))
        .addMethod(
          getDeleteScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardResponse>(
                service, METHODID_DELETE_SCORECARD)))
        .addMethod(
          getGetScorecardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardResponse>(
                service, METHODID_GET_SCORECARD)))
        .addMethod(
          getCreateQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionResponse>(
                service, METHODID_CREATE_QUESTION)))
        .addMethod(
          getListQuestionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListQuestionsResponse>(
                service, METHODID_LIST_QUESTIONS)))
        .addMethod(
          getUpdateQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateQuestionResponse>(
                service, METHODID_UPDATE_QUESTION)))
        .addMethod(
          getDeleteQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionResponse>(
                service, METHODID_DELETE_QUESTION)))
        .addMethod(
          getGetQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetQuestionResponse>(
                service, METHODID_GET_QUESTION)))
        .addMethod(
          getBulkCreateQuestionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.BulkCreateQuestionsResponse>(
                service, METHODID_BULK_CREATE_QUESTIONS)))
        .addMethod(
          getCreateCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateCategoryResponse>(
                service, METHODID_CREATE_CATEGORY)))
        .addMethod(
          getListCategoriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListCategoriesResponse>(
                service, METHODID_LIST_CATEGORIES)))
        .addMethod(
          getUpdateCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateCategoryResponse>(
                service, METHODID_UPDATE_CATEGORY)))
        .addMethod(
          getDeleteCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteCategoryResponse>(
                service, METHODID_DELETE_CATEGORY)))
        .addMethod(
          getGetCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetCategoryResponse>(
                service, METHODID_GET_CATEGORY)))
        .addMethod(
          getCreateScorecardQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateScorecardQuestionResponse>(
                service, METHODID_CREATE_SCORECARD_QUESTION)))
        .addMethod(
          getUpdateScorecardQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateScorecardQuestionResponse>(
                service, METHODID_UPDATE_SCORECARD_QUESTION)))
        .addMethod(
          getDeleteScorecardQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteScorecardQuestionResponse>(
                service, METHODID_DELETE_SCORECARD_QUESTION)))
        .addMethod(
          getGetScorecardQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetScorecardQuestionResponse>(
                service, METHODID_GET_SCORECARD_QUESTION)))
        .addMethod(
          getCreateSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateSectionResponse>(
                service, METHODID_CREATE_SECTION)))
        .addMethod(
          getListSectionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListSectionsResponse>(
                service, METHODID_LIST_SECTIONS)))
        .addMethod(
          getUpdateSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateSectionResponse>(
                service, METHODID_UPDATE_SECTION)))
        .addMethod(
          getGetSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetSectionResponse>(
                service, METHODID_GET_SECTION)))
        .addMethod(
          getDeleteSectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteSectionResponse>(
                service, METHODID_DELETE_SECTION)))
        .addMethod(
          getCreateQuestionCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateQuestionCategoryResponse>(
                service, METHODID_CREATE_QUESTION_CATEGORY)))
        .addMethod(
          getDeleteQuestionCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteQuestionCategoryResponse>(
                service, METHODID_DELETE_QUESTION_CATEGORY)))
        .addMethod(
          getCreateEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationResponse>(
                service, METHODID_CREATE_EVALUATION)))
        .addMethod(
          getDeleteEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationResponse>(
                service, METHODID_DELETE_EVALUATION)))
        .addMethod(
          getScoreEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ScoreEvaluationResponse>(
                service, METHODID_SCORE_EVALUATION)))
        .addMethod(
          getUpdateEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationResponse>(
                service, METHODID_UPDATE_EVALUATION)))
        .addMethod(
          getGetEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetEvaluationResponse>(
                service, METHODID_GET_EVALUATION)))
        .addMethod(
          getListEvaluationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListEvaluationsResponse>(
                service, METHODID_LIST_EVALUATIONS)))
        .addMethod(
          getCreateEvaluationQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateEvaluationQuestionResponse>(
                service, METHODID_CREATE_EVALUATION_QUESTION)))
        .addMethod(
          getUpdateEvaluationQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateEvaluationQuestionResponse>(
                service, METHODID_UPDATE_EVALUATION_QUESTION)))
        .addMethod(
          getDeleteEvaluationQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteEvaluationQuestionResponse>(
                service, METHODID_DELETE_EVALUATION_QUESTION)))
        .addMethod(
          getSampleCallsByCategoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.SampleCallsByCategoryResponse>(
                service, METHODID_SAMPLE_CALLS_BY_CATEGORY)))
        .addMethod(
          getCreateAutoQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.CreateAutoQuestionResponse>(
                service, METHODID_CREATE_AUTO_QUESTION)))
        .addMethod(
          getUpdateAutoQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.UpdateAutoQuestionResponse>(
                service, METHODID_UPDATE_AUTO_QUESTION)))
        .addMethod(
          getDeleteAutoQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoQuestionResponse>(
                service, METHODID_DELETE_AUTO_QUESTION)))
        .addMethod(
          getGetAutoQuestionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoQuestionResponse>(
                service, METHODID_GET_AUTO_QUESTION)))
        .addMethod(
          getGetAutoEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.GetAutoEvaluationResponse>(
                service, METHODID_GET_AUTO_EVALUATION)))
        .addMethod(
          getListAutoEvaluationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.ListAutoEvaluationsResponse>(
                service, METHODID_LIST_AUTO_EVALUATIONS)))
        .addMethod(
          getStreamAutoEvaluationsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.StreamAutoEvaluationsResponse>(
                service, METHODID_STREAM_AUTO_EVALUATIONS)))
        .addMethod(
          getDeleteAutoEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.DeleteAutoEvaluationResponse>(
                service, METHODID_DELETE_AUTO_EVALUATION)))
        .addMethod(
          getPreviewEvaluationScoreMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.PreviewEvaluationScoreResponse>(
                service, METHODID_PREVIEW_EVALUATION_SCORE)))
        .addMethod(
          getRestoreEvaluationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationRequest,
              com.tcn.cloud.api.api.v1alpha1.scorecards.RestoreEvaluationResponse>(
                service, METHODID_RESTORE_EVALUATION)))
        .build();
  }

  private static abstract class ScorecardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScorecardsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.scorecards.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Scorecards");
    }
  }

  private static final class ScorecardsFileDescriptorSupplier
      extends ScorecardsBaseDescriptorSupplier {
    ScorecardsFileDescriptorSupplier() {}
  }

  private static final class ScorecardsMethodDescriptorSupplier
      extends ScorecardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ScorecardsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ScorecardsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScorecardsFileDescriptorSupplier())
              .addMethod(getCreateScorecardMethod())
              .addMethod(getListScorecardsMethod())
              .addMethod(getUpdateScorecardMethod())
              .addMethod(getDeleteScorecardMethod())
              .addMethod(getGetScorecardMethod())
              .addMethod(getCreateQuestionMethod())
              .addMethod(getListQuestionsMethod())
              .addMethod(getUpdateQuestionMethod())
              .addMethod(getDeleteQuestionMethod())
              .addMethod(getGetQuestionMethod())
              .addMethod(getBulkCreateQuestionsMethod())
              .addMethod(getCreateCategoryMethod())
              .addMethod(getListCategoriesMethod())
              .addMethod(getUpdateCategoryMethod())
              .addMethod(getDeleteCategoryMethod())
              .addMethod(getGetCategoryMethod())
              .addMethod(getCreateScorecardQuestionMethod())
              .addMethod(getUpdateScorecardQuestionMethod())
              .addMethod(getDeleteScorecardQuestionMethod())
              .addMethod(getGetScorecardQuestionMethod())
              .addMethod(getCreateSectionMethod())
              .addMethod(getListSectionsMethod())
              .addMethod(getUpdateSectionMethod())
              .addMethod(getGetSectionMethod())
              .addMethod(getDeleteSectionMethod())
              .addMethod(getCreateQuestionCategoryMethod())
              .addMethod(getDeleteQuestionCategoryMethod())
              .addMethod(getCreateEvaluationMethod())
              .addMethod(getDeleteEvaluationMethod())
              .addMethod(getScoreEvaluationMethod())
              .addMethod(getUpdateEvaluationMethod())
              .addMethod(getGetEvaluationMethod())
              .addMethod(getListEvaluationsMethod())
              .addMethod(getCreateEvaluationQuestionMethod())
              .addMethod(getUpdateEvaluationQuestionMethod())
              .addMethod(getDeleteEvaluationQuestionMethod())
              .addMethod(getSampleCallsByCategoryMethod())
              .addMethod(getCreateAutoQuestionMethod())
              .addMethod(getUpdateAutoQuestionMethod())
              .addMethod(getDeleteAutoQuestionMethod())
              .addMethod(getGetAutoQuestionMethod())
              .addMethod(getGetAutoEvaluationMethod())
              .addMethod(getListAutoEvaluationsMethod())
              .addMethod(getStreamAutoEvaluationsMethod())
              .addMethod(getDeleteAutoEvaluationMethod())
              .addMethod(getPreviewEvaluationScoreMethod())
              .addMethod(getRestoreEvaluationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
