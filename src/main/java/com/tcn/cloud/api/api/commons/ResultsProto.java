// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/results.proto

package com.tcn.cloud.api.api.commons;

public final class ResultsProto {
  private ResultsProto() {}
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
      "\n\031api/commons/results.proto\022\013api.commons" +
      "*\332\r\n\nCallResult\022\027\n\023CALL_RESULT_UNKNOWN\020\000" +
      "\022\030\n\023CALL_RESULT_PENDING\020\350\007\022\031\n\024CALL_RESUL" +
      "T_ANSWERED\020\320\017\022\"\n\035CALL_RESULT_ANSWERED_LI" +
      "NKCALL\020\264\020\022,\n\'CALL_RESULT_ANSWERED_LINKCA" +
      "LL_ABANDONED\020\276\020\022-\n(CALL_RESULT_ANSWERED_" +
      "LINKCALL_AGENT_TALK\020\310\020\022,\n\'CALL_RESULT_AN" +
      "SWERED_LINKCALL_SUSPENDED\020\322\020\0224\n/CALL_RES" +
      "ULT_ANSWERED_LINKCALL_SUSPENDED_TIMEOUT\020" +
      "\334\020\022=\n8CALL_RESULT_ANSWERED_LINKCALL_SUSP" +
      "ENDED_INBOUND_OVERRIDE\020\346\020\0224\n/CALL_RESULT" +
      "_ANSWERED_LINKCALL_SUSPENDED_RESUMED\020\360\020\022" +
      " \n\033CALL_RESULT_ANSWERED_HANGUP\020\230\021\022#\n\036CAL" +
      "L_RESULT_ANSWERED_VOICEMAIL\020\374\021\022\030\n\023CALL_R" +
      "ESULT_MACHINE\020\270\027\022\"\n\035CALL_RESULT_MACHINE_" +
      "DELIVERED\020\234\030\022\037\n\032CALL_RESULT_MACHINE_HANG" +
      "UP\020\200\031\022\037\n\032CALL_RESULT_MACHINE_FAILED\020\344\031\022\024" +
      "\n\017CALL_RESULT_FAX\020\240\037\022\036\n\031CALL_RESULT_FAX_" +
      "DELIVERED\020\204 \022\025\n\020CALL_RESULT_BUSY\020\210\'\022\032\n\025C" +
      "ALL_RESULT_NO_ANSWER\020\360.\022\030\n\023CALL_RESULT_I" +
      "NVALID\020\3306\022*\n%CALL_RESULT_INVALID_INCOMPL" +
      "ETE_NUMBER\020\2747\022\'\n\"CALL_RESULT_INVALID_UNK" +
      "NOWN_PREFIX\020\2408\022+\n&CALL_RESULT_INVALID_UN" +
      "KNOWN_PREFIX_NPA\020\2528\022.\n)CALL_RESULT_INVAL" +
      "ID_UNKNOWN_PREFIX_NPANXX\020\2648\0220\n+CALL_RESU" +
      "LT_INVALID_PREFIX_NPANXX_NOT_FOUND\020\2768\022!\n" +
      "\034CALL_RESULT_INVALID_NO_ROUTE\020\2049\022%\n CALL" +
      "_RESULT_INVALID_DISCONNECTED\020\3509\022/\n*CALL_" +
      "RESULT_INVALID_DISCONNECTED_SKIPTRACE\020\3629" +
      "\022\027\n\022CALL_RESULT_FAILED\020\300>\022 \n\033CALL_RESULT" +
      "_FAILED_NO_LINES\020\244?\022%\n CALL_RESULT_FAILE" +
      "D_CIRCUITS_BUSY\020\210@\022\037\n\032CALL_RESULT_FAILED" +
      "_REFUSED\020\354@\022%\n CALL_RESULT_FAILED_REFUSE" +
      "D_LEGAL\020\366@\022)\n$CALL_RESULT_FAILED_REFUSED" +
      "_TECHNICAL\020\200A\022&\n!CALL_RESULT_FAILED_INTE" +
      "RNAL_ERROR\020\212A\0221\n,CALL_RESULT_FAILED_REFU" +
      "SED_RETRIES_EXHAUSTED\020\224A\022%\n CALL_RESULT_" +
      "FAILED_REFUSED_BLOCK\020\236A\022\031\n\024CALL_RESULT_C" +
      "ANCELED\020\250F\022\"\n\035CALL_RESULT_CANCELED_TIMEZ" +
      "ONE\020\214G\022!\n\034CALL_RESULT_CANCELED_TIMEOUT\020\360" +
      "G\022\036\n\031CALL_RESULT_CANCELED_DNCL\020\324H\022\'\n\"CAL" +
      "L_RESULT_CANCELED_CELLULAR_DNCL\020\336H\022\'\n\"CA" +
      "LL_RESULT_CANCELED_DNCL_ZIP_CODE\020\350H\022#\n\036C" +
      "ALL_RESULT_CANCELED_MAX_RETRY\020\270I\022+\n&CALL" +
      "_RESULT_CANCELED_INCOMPLETE_NUMBER\020\234JBz\n" +
      "\035com.tcn.cloud.api.api.commonsB\014ResultsP" +
      "rotoP\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Commons" +
      "\342\002\027Api\\Commons\\GPBMetadata\352\002\014Api::Common" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
