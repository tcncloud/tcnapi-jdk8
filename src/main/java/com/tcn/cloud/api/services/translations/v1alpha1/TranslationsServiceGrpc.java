package com.tcn.cloud.api.services.translations.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.1)",
    comments = "Source: services/translations/v1alpha1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TranslationsServiceGrpc {

  private TranslationsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "services.translations.v1alpha1.TranslationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TranslateTemplate",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest, com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> getTranslateTemplateMethod;
    if ((getTranslateTemplateMethod = TranslationsServiceGrpc.getTranslateTemplateMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getTranslateTemplateMethod = TranslationsServiceGrpc.getTranslateTemplateMethod) == null) {
          TranslationsServiceGrpc.getTranslateTemplateMethod = getTranslateTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest, com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TranslateTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("TranslateTemplate"))
              .build();
        }
      }
    }
    return getTranslateTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse> getListTranslationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTranslations",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse> getListTranslationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest, com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse> getListTranslationsMethod;
    if ((getListTranslationsMethod = TranslationsServiceGrpc.getListTranslationsMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getListTranslationsMethod = TranslationsServiceGrpc.getListTranslationsMethod) == null) {
          TranslationsServiceGrpc.getListTranslationsMethod = getListTranslationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest, com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTranslations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("ListTranslations"))
              .build();
        }
      }
    }
    return getListTranslationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse> getListLanguagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLanguages",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse> getListLanguagesMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest, com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse> getListLanguagesMethod;
    if ((getListLanguagesMethod = TranslationsServiceGrpc.getListLanguagesMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getListLanguagesMethod = TranslationsServiceGrpc.getListLanguagesMethod) == null) {
          TranslationsServiceGrpc.getListLanguagesMethod = getListLanguagesMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest, com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("ListLanguages"))
              .build();
        }
      }
    }
    return getListLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse> getListContextsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListContexts",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse> getListContextsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest, com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse> getListContextsMethod;
    if ((getListContextsMethod = TranslationsServiceGrpc.getListContextsMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getListContextsMethod = TranslationsServiceGrpc.getListContextsMethod) == null) {
          TranslationsServiceGrpc.getListContextsMethod = getListContextsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest, com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListContexts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("ListContexts"))
              .build();
        }
      }
    }
    return getListContextsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse> getCreateTranslationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTranslation",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse> getCreateTranslationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest, com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse> getCreateTranslationMethod;
    if ((getCreateTranslationMethod = TranslationsServiceGrpc.getCreateTranslationMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getCreateTranslationMethod = TranslationsServiceGrpc.getCreateTranslationMethod) == null) {
          TranslationsServiceGrpc.getCreateTranslationMethod = getCreateTranslationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest, com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTranslation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("CreateTranslation"))
              .build();
        }
      }
    }
    return getCreateTranslationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse> getUpdateTranslationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTranslation",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse> getUpdateTranslationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest, com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse> getUpdateTranslationMethod;
    if ((getUpdateTranslationMethod = TranslationsServiceGrpc.getUpdateTranslationMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getUpdateTranslationMethod = TranslationsServiceGrpc.getUpdateTranslationMethod) == null) {
          TranslationsServiceGrpc.getUpdateTranslationMethod = getUpdateTranslationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest, com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTranslation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("UpdateTranslation"))
              .build();
        }
      }
    }
    return getUpdateTranslationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse> getTriggerLLMTranslationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerLLMTranslation",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse> getTriggerLLMTranslationMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest, com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse> getTriggerLLMTranslationMethod;
    if ((getTriggerLLMTranslationMethod = TranslationsServiceGrpc.getTriggerLLMTranslationMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getTriggerLLMTranslationMethod = TranslationsServiceGrpc.getTriggerLLMTranslationMethod) == null) {
          TranslationsServiceGrpc.getTriggerLLMTranslationMethod = getTriggerLLMTranslationMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest, com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerLLMTranslation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("TriggerLLMTranslation"))
              .build();
        }
      }
    }
    return getTriggerLLMTranslationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse> getTriggerLLMTranslationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TriggerLLMTranslations",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse> getTriggerLLMTranslationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest, com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse> getTriggerLLMTranslationsMethod;
    if ((getTriggerLLMTranslationsMethod = TranslationsServiceGrpc.getTriggerLLMTranslationsMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getTriggerLLMTranslationsMethod = TranslationsServiceGrpc.getTriggerLLMTranslationsMethod) == null) {
          TranslationsServiceGrpc.getTriggerLLMTranslationsMethod = getTriggerLLMTranslationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest, com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TriggerLLMTranslations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("TriggerLLMTranslations"))
              .build();
        }
      }
    }
    return getTriggerLLMTranslationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse> getSetSystemMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSystemMessage",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse> getSetSystemMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest, com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse> getSetSystemMessageMethod;
    if ((getSetSystemMessageMethod = TranslationsServiceGrpc.getSetSystemMessageMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getSetSystemMessageMethod = TranslationsServiceGrpc.getSetSystemMessageMethod) == null) {
          TranslationsServiceGrpc.getSetSystemMessageMethod = getSetSystemMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest, com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSystemMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("SetSystemMessage"))
              .build();
        }
      }
    }
    return getSetSystemMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse> getGetSystemMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSystemMessage",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse> getGetSystemMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest, com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse> getGetSystemMessageMethod;
    if ((getGetSystemMessageMethod = TranslationsServiceGrpc.getGetSystemMessageMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getGetSystemMessageMethod = TranslationsServiceGrpc.getGetSystemMessageMethod) == null) {
          TranslationsServiceGrpc.getGetSystemMessageMethod = getGetSystemMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest, com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSystemMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("GetSystemMessage"))
              .build();
        }
      }
    }
    return getGetSystemMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse> getTestSystemMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestSystemMessage",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse> getTestSystemMessageMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest, com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse> getTestSystemMessageMethod;
    if ((getTestSystemMessageMethod = TranslationsServiceGrpc.getTestSystemMessageMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getTestSystemMessageMethod = TranslationsServiceGrpc.getTestSystemMessageMethod) == null) {
          TranslationsServiceGrpc.getTestSystemMessageMethod = getTestSystemMessageMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest, com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestSystemMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("TestSystemMessage"))
              .build();
        }
      }
    }
    return getTestSystemMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse> getEnableContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableContext",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse> getEnableContextMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest, com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse> getEnableContextMethod;
    if ((getEnableContextMethod = TranslationsServiceGrpc.getEnableContextMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getEnableContextMethod = TranslationsServiceGrpc.getEnableContextMethod) == null) {
          TranslationsServiceGrpc.getEnableContextMethod = getEnableContextMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest, com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("EnableContext"))
              .build();
        }
      }
    }
    return getEnableContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse> getDisableContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableContext",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse> getDisableContextMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest, com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse> getDisableContextMethod;
    if ((getDisableContextMethod = TranslationsServiceGrpc.getDisableContextMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getDisableContextMethod = TranslationsServiceGrpc.getDisableContextMethod) == null) {
          TranslationsServiceGrpc.getDisableContextMethod = getDisableContextMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest, com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("DisableContext"))
              .build();
        }
      }
    }
    return getDisableContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse> getDeleteTranslationsByTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTranslationsByTemplate",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse> getDeleteTranslationsByTemplateMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest, com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse> getDeleteTranslationsByTemplateMethod;
    if ((getDeleteTranslationsByTemplateMethod = TranslationsServiceGrpc.getDeleteTranslationsByTemplateMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getDeleteTranslationsByTemplateMethod = TranslationsServiceGrpc.getDeleteTranslationsByTemplateMethod) == null) {
          TranslationsServiceGrpc.getDeleteTranslationsByTemplateMethod = getDeleteTranslationsByTemplateMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest, com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTranslationsByTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("DeleteTranslationsByTemplate"))
              .build();
        }
      }
    }
    return getDeleteTranslationsByTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse> getBulkDeleteTranslationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkDeleteTranslations",
      requestType = com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest.class,
      responseType = com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest,
      com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse> getBulkDeleteTranslationsMethod() {
    io.grpc.MethodDescriptor<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest, com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse> getBulkDeleteTranslationsMethod;
    if ((getBulkDeleteTranslationsMethod = TranslationsServiceGrpc.getBulkDeleteTranslationsMethod) == null) {
      synchronized (TranslationsServiceGrpc.class) {
        if ((getBulkDeleteTranslationsMethod = TranslationsServiceGrpc.getBulkDeleteTranslationsMethod) == null) {
          TranslationsServiceGrpc.getBulkDeleteTranslationsMethod = getBulkDeleteTranslationsMethod =
              io.grpc.MethodDescriptor.<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest, com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkDeleteTranslations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TranslationsServiceMethodDescriptorSupplier("BulkDeleteTranslations"))
              .build();
        }
      }
    }
    return getBulkDeleteTranslationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TranslationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceStub>() {
        @java.lang.Override
        public TranslationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationsServiceStub(channel, callOptions);
        }
      };
    return TranslationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TranslationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceBlockingStub>() {
        @java.lang.Override
        public TranslationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationsServiceBlockingStub(channel, callOptions);
        }
      };
    return TranslationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TranslationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TranslationsServiceFutureStub>() {
        @java.lang.Override
        public TranslationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TranslationsServiceFutureStub(channel, callOptions);
        }
      };
    return TranslationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Translate a template for a given context and language.
     * Required permissions:
     *   Any Authenticated User
     * Errors:
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void translateTemplate(com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTranslateTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists translations by context/language
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No templates found for the given context and language.
     * </pre>
     */
    default void listTranslations(com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTranslationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists localization languages
     * Required permissions:
     *  - Any Authenticated User
     * </pre>
     */
    default void listLanguages(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLanguagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists localization contexts
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * </pre>
     */
    default void listContexts(com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListContextsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new Translation
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.AlreadyExists: The template already exists for the given context and language (use override method).
     * </pre>
     */
    default void createTranslation(com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTranslationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Overrides the translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void updateTranslation(com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTranslationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Re-run the LLM translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void triggerLLMTranslation(com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerLLMTranslationMethod(), responseObserver);
    }

    /**
     * <pre>
     * re-run all translations for a given context (WARNING - this should be ran sparingly as it is a heavy operation and costs money)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void triggerLLMTranslations(com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTriggerLLMTranslationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * set/get context system message to give more tuned LLMs when translating for that context (WARNING - this overrides the previous system message for the context if exists)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void setSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSystemMessageMethod(), responseObserver);
    }

    /**
     */
    default void getSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSystemMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gives a translation for a system message, template and language with no side effects (Used for testing system messages)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void testSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestSystemMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * enable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No context found
     * </pre>
     */
    default void enableContext(com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * disable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void disableContext(com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete translations by template and context
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No translations found for the given template and context.
     * </pre>
     */
    default void deleteTranslationsByTemplate(com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTranslationsByTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bulk delete translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    default void bulkDeleteTranslations(com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkDeleteTranslationsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TranslationsService.
   */
  public static abstract class TranslationsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TranslationsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TranslationsService.
   */
  public static final class TranslationsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TranslationsServiceStub> {
    private TranslationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Translate a template for a given context and language.
     * Required permissions:
     *   Any Authenticated User
     * Errors:
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void translateTemplate(com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTranslateTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists translations by context/language
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No templates found for the given context and language.
     * </pre>
     */
    public void listTranslations(com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTranslationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists localization languages
     * Required permissions:
     *  - Any Authenticated User
     * </pre>
     */
    public void listLanguages(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists localization contexts
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * </pre>
     */
    public void listContexts(com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListContextsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new Translation
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.AlreadyExists: The template already exists for the given context and language (use override method).
     * </pre>
     */
    public void createTranslation(com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTranslationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Overrides the translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void updateTranslation(com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTranslationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Re-run the LLM translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void triggerLLMTranslation(com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerLLMTranslationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * re-run all translations for a given context (WARNING - this should be ran sparingly as it is a heavy operation and costs money)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void triggerLLMTranslations(com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTriggerLLMTranslationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * set/get context system message to give more tuned LLMs when translating for that context (WARNING - this overrides the previous system message for the context if exists)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void setSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSystemMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSystemMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gives a translation for a system message, template and language with no side effects (Used for testing system messages)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void testSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestSystemMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * enable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No context found
     * </pre>
     */
    public void enableContext(com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * disable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void disableContext(com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete translations by template and context
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No translations found for the given template and context.
     * </pre>
     */
    public void deleteTranslationsByTemplate(com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTranslationsByTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bulk delete translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public void bulkDeleteTranslations(com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest request,
        io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkDeleteTranslationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TranslationsService.
   */
  public static final class TranslationsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TranslationsServiceBlockingStub> {
    private TranslationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Translate a template for a given context and language.
     * Required permissions:
     *   Any Authenticated User
     * Errors:
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse translateTemplate(com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTranslateTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists translations by context/language
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No templates found for the given context and language.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse listTranslations(com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTranslationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists localization languages
     * Required permissions:
     *  - Any Authenticated User
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse listLanguages(com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListLanguagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists localization contexts
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse listContexts(com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListContextsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new Translation
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.AlreadyExists: The template already exists for the given context and language (use override method).
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse createTranslation(com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTranslationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Overrides the translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse updateTranslation(com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTranslationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Re-run the LLM translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse triggerLLMTranslation(com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerLLMTranslationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * re-run all translations for a given context (WARNING - this should be ran sparingly as it is a heavy operation and costs money)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse triggerLLMTranslations(com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTriggerLLMTranslationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * set/get context system message to give more tuned LLMs when translating for that context (WARNING - this overrides the previous system message for the context if exists)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse setSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSystemMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse getSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSystemMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gives a translation for a system message, template and language with no side effects (Used for testing system messages)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse testSystemMessage(com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestSystemMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * enable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No context found
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse enableContext(com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * disable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse disableContext(com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete translations by template and context
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No translations found for the given template and context.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse deleteTranslationsByTemplate(com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTranslationsByTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bulk delete translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse bulkDeleteTranslations(com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkDeleteTranslationsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TranslationsService.
   */
  public static final class TranslationsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TranslationsServiceFutureStub> {
    private TranslationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TranslationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TranslationsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Translate a template for a given context and language.
     * Required permissions:
     *   Any Authenticated User
     * Errors:
     *   - grpc.AlreadyExists : This template is already translated for the given context and language.
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse> translateTemplate(
        com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTranslateTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists translations by context/language
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No templates found for the given context and language.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse> listTranslations(
        com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTranslationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists localization languages
     * Required permissions:
     *  - Any Authenticated User
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse> listLanguages(
        com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListLanguagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists localization contexts
     * Required permissions:
     *  - PERMISSION_CUSTOMER_SUPPORT
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse> listContexts(
        com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListContextsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new Translation
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.AlreadyExists: The template already exists for the given context and language (use override method).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse> createTranslation(
        com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTranslationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Overrides the translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse> updateTranslation(
        com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTranslationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Re-run the LLM translation for a given translationID
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse> triggerLLMTranslation(
        com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerLLMTranslationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * re-run all translations for a given context (WARNING - this should be ran sparingly as it is a heavy operation and costs money)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse> triggerLLMTranslations(
        com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTriggerLLMTranslationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * set/get context system message to give more tuned LLMs when translating for that context (WARNING - this overrides the previous system message for the context if exists)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse> setSystemMessage(
        com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSystemMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse> getSystemMessage(
        com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSystemMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gives a translation for a system message, template and language with no side effects (Used for testing system messages)
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse> testSystemMessage(
        com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestSystemMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * enable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No context found
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse> enableContext(
        com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * disable a context for LLM translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse> disableContext(
        com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete translations by template and context
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     *   - grpc.NotFound: No translations found for the given template and context.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse> deleteTranslationsByTemplate(
        com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTranslationsByTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bulk delete translations
     * Required permissions:
     *   - PERMISSION_CUSTOMER_SUPPORT
     * Errors:
     *   - grpc.InvalidArgument: The request is not valid.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse> bulkDeleteTranslations(
        com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkDeleteTranslationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSLATE_TEMPLATE = 0;
  private static final int METHODID_LIST_TRANSLATIONS = 1;
  private static final int METHODID_LIST_LANGUAGES = 2;
  private static final int METHODID_LIST_CONTEXTS = 3;
  private static final int METHODID_CREATE_TRANSLATION = 4;
  private static final int METHODID_UPDATE_TRANSLATION = 5;
  private static final int METHODID_TRIGGER_LLMTRANSLATION = 6;
  private static final int METHODID_TRIGGER_LLMTRANSLATIONS = 7;
  private static final int METHODID_SET_SYSTEM_MESSAGE = 8;
  private static final int METHODID_GET_SYSTEM_MESSAGE = 9;
  private static final int METHODID_TEST_SYSTEM_MESSAGE = 10;
  private static final int METHODID_ENABLE_CONTEXT = 11;
  private static final int METHODID_DISABLE_CONTEXT = 12;
  private static final int METHODID_DELETE_TRANSLATIONS_BY_TEMPLATE = 13;
  private static final int METHODID_BULK_DELETE_TRANSLATIONS = 14;

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
        case METHODID_TRANSLATE_TEMPLATE:
          serviceImpl.translateTemplate((com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_TRANSLATIONS:
          serviceImpl.listTranslations((com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse>) responseObserver);
          break;
        case METHODID_LIST_LANGUAGES:
          serviceImpl.listLanguages((com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse>) responseObserver);
          break;
        case METHODID_LIST_CONTEXTS:
          serviceImpl.listContexts((com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse>) responseObserver);
          break;
        case METHODID_CREATE_TRANSLATION:
          serviceImpl.createTranslation((com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TRANSLATION:
          serviceImpl.updateTranslation((com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_LLMTRANSLATION:
          serviceImpl.triggerLLMTranslation((com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse>) responseObserver);
          break;
        case METHODID_TRIGGER_LLMTRANSLATIONS:
          serviceImpl.triggerLLMTranslations((com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse>) responseObserver);
          break;
        case METHODID_SET_SYSTEM_MESSAGE:
          serviceImpl.setSystemMessage((com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse>) responseObserver);
          break;
        case METHODID_GET_SYSTEM_MESSAGE:
          serviceImpl.getSystemMessage((com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse>) responseObserver);
          break;
        case METHODID_TEST_SYSTEM_MESSAGE:
          serviceImpl.testSystemMessage((com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse>) responseObserver);
          break;
        case METHODID_ENABLE_CONTEXT:
          serviceImpl.enableContext((com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse>) responseObserver);
          break;
        case METHODID_DISABLE_CONTEXT:
          serviceImpl.disableContext((com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse>) responseObserver);
          break;
        case METHODID_DELETE_TRANSLATIONS_BY_TEMPLATE:
          serviceImpl.deleteTranslationsByTemplate((com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse>) responseObserver);
          break;
        case METHODID_BULK_DELETE_TRANSLATIONS:
          serviceImpl.bulkDeleteTranslations((com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest) request,
              (io.grpc.stub.StreamObserver<com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse>) responseObserver);
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
          getTranslateTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.TranslateTemplateResponse>(
                service, METHODID_TRANSLATE_TEMPLATE)))
        .addMethod(
          getListTranslationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.ListTranslationsResponse>(
                service, METHODID_LIST_TRANSLATIONS)))
        .addMethod(
          getListLanguagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.ListLanguagesResponse>(
                service, METHODID_LIST_LANGUAGES)))
        .addMethod(
          getListContextsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.ListContextsRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.ListContextsResponse>(
                service, METHODID_LIST_CONTEXTS)))
        .addMethod(
          getCreateTranslationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.CreateTranslationResponse>(
                service, METHODID_CREATE_TRANSLATION)))
        .addMethod(
          getUpdateTranslationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.UpdateTranslationResponse>(
                service, METHODID_UPDATE_TRANSLATION)))
        .addMethod(
          getTriggerLLMTranslationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationResponse>(
                service, METHODID_TRIGGER_LLMTRANSLATION)))
        .addMethod(
          getTriggerLLMTranslationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.TriggerLLMTranslationsResponse>(
                service, METHODID_TRIGGER_LLMTRANSLATIONS)))
        .addMethod(
          getSetSystemMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.SetSystemMessageResponse>(
                service, METHODID_SET_SYSTEM_MESSAGE)))
        .addMethod(
          getGetSystemMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.GetSystemMessageResponse>(
                service, METHODID_GET_SYSTEM_MESSAGE)))
        .addMethod(
          getTestSystemMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.TestSystemMessageResponse>(
                service, METHODID_TEST_SYSTEM_MESSAGE)))
        .addMethod(
          getEnableContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.EnableContextRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.EnableContextResponse>(
                service, METHODID_ENABLE_CONTEXT)))
        .addMethod(
          getDisableContextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.DisableContextRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.DisableContextResponse>(
                service, METHODID_DISABLE_CONTEXT)))
        .addMethod(
          getDeleteTranslationsByTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.DeleteTranslationsByTemplateResponse>(
                service, METHODID_DELETE_TRANSLATIONS_BY_TEMPLATE)))
        .addMethod(
          getBulkDeleteTranslationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsRequest,
              com.tcn.cloud.api.services.translations.v1alpha1.BulkDeleteTranslationsResponse>(
                service, METHODID_BULK_DELETE_TRANSLATIONS)))
        .build();
  }

  private static abstract class TranslationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TranslationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.tcn.cloud.api.services.translations.v1alpha1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TranslationsService");
    }
  }

  private static final class TranslationsServiceFileDescriptorSupplier
      extends TranslationsServiceBaseDescriptorSupplier {
    TranslationsServiceFileDescriptorSupplier() {}
  }

  private static final class TranslationsServiceMethodDescriptorSupplier
      extends TranslationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TranslationsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TranslationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TranslationsServiceFileDescriptorSupplier())
              .addMethod(getTranslateTemplateMethod())
              .addMethod(getListTranslationsMethod())
              .addMethod(getListLanguagesMethod())
              .addMethod(getListContextsMethod())
              .addMethod(getCreateTranslationMethod())
              .addMethod(getUpdateTranslationMethod())
              .addMethod(getTriggerLLMTranslationMethod())
              .addMethod(getTriggerLLMTranslationsMethod())
              .addMethod(getSetSystemMessageMethod())
              .addMethod(getGetSystemMessageMethod())
              .addMethod(getTestSystemMessageMethod())
              .addMethod(getEnableContextMethod())
              .addMethod(getDisableContextMethod())
              .addMethod(getDeleteTranslationsByTemplateMethod())
              .addMethod(getBulkDeleteTranslationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
