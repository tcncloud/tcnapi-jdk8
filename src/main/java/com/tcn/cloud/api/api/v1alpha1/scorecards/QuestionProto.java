// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/question.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public final class QuestionProto {
  private QuestionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateQuestionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateQuestionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_ListQuestionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_ListQuestionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_UpdateQuestionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_UpdateQuestionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_UpdateQuestionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_UpdateQuestionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteQuestionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteQuestionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteQuestionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteQuestionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_GetQuestionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_GetQuestionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_GetQuestionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_GetQuestionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_BothIds_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_BothIds_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&api/v1alpha1/scorecards/question.proto" +
      "\022\027api.v1alpha1.scorecards\032\034api/commons/s" +
      "corecards.proto\032 google/protobuf/field_m" +
      "ask.proto\"J\n\025CreateQuestionRequest\0221\n\010qu" +
      "estion\030\001 \001(\0132\025.api.commons.QuestionR\010que" +
      "stion\"K\n\026CreateQuestionResponse\0221\n\010quest" +
      "ion\030\001 \001(\0132\025.api.commons.QuestionR\010questi" +
      "on\"X\n\024ListQuestionsRequest\022\035\n\nauthor_ids" +
      "\030\002 \003(\tR\tauthorIds\022!\n\014category_ids\030\003 \003(\003R" +
      "\013categoryIds\"L\n\025ListQuestionsResponse\0223\n" +
      "\tquestions\030\001 \003(\0132\025.api.commons.QuestionR" +
      "\tquestions\"\207\001\n\025UpdateQuestionRequest\0221\n\010" +
      "question\030\001 \001(\0132\025.api.commons.QuestionR\010q" +
      "uestion\022;\n\013update_mask\030\002 \001(\0132\032.google.pr" +
      "otobuf.FieldMaskR\nupdateMask\"K\n\026UpdateQu" +
      "estionResponse\0221\n\010question\030\001 \001(\0132\025.api.c" +
      "ommons.QuestionR\010question\"8\n\025DeleteQuest" +
      "ionRequest\022\037\n\013question_id\030\002 \001(\003R\nquestio" +
      "nId\"K\n\026DeleteQuestionResponse\0221\n\010questio" +
      "n\030\001 \001(\0132\025.api.commons.QuestionR\010question" +
      "\"Q\n\022GetQuestionRequest\022\037\n\013question_id\030\002 " +
      "\001(\003R\nquestionId\022\032\n\010question\030\003 \001(\tR\010quest" +
      "ion\"H\n\023GetQuestionResponse\0221\n\010question\030\001" +
      " \001(\0132\025.api.commons.QuestionR\010question\"a\n" +
      "\035CreateQuestionCategoryRequest\022\037\n\013questi" +
      "on_id\030\002 \001(\003R\nquestionId\022\037\n\013category_id\030\003" +
      " \001(\003R\ncategoryId\"\224\001\n\036CreateQuestionCateg" +
      "oryResponse\022\037\n\013question_id\030\002 \001(\003R\nquesti" +
      "onId\022\037\n\013category_id\030\003 \001(\003R\ncategoryId\0220\n" +
      "\024question_category_id\030\004 \001(\003R\022questionCat" +
      "egoryId\"\206\002\n\035DeleteQuestionCategoryReques" +
      "t\0222\n\024question_category_id\030\002 \001(\003H\000R\022quest" +
      "ionCategoryId\022[\n\010both_ids\030\003 \001(\0132>.api.v1" +
      "alpha1.scorecards.DeleteQuestionCategory" +
      "Request.BothIdsH\000R\007bothIds\032K\n\007BothIds\022\037\n" +
      "\013question_id\030\001 \001(\003R\nquestionId\022\037\n\013catego" +
      "ry_id\030\002 \001(\003R\ncategoryIdB\007\n\005where\"\224\001\n\036Del" +
      "eteQuestionCategoryResponse\022\037\n\013question_" +
      "id\030\002 \001(\003R\nquestionId\022\037\n\013category_id\030\003 \001(" +
      "\003R\ncategoryId\0220\n\024question_category_id\030\004 " +
      "\001(\003R\022questionCategoryId\"`\n\032BulkCreateQue" +
      "stionsRequest\022!\n\014scorecard_id\030\003 \001(\003R\013sco" +
      "recardId\022\037\n\013use_default\030\004 \001(\010R\nuseDefaul" +
      "t\"R\n\033BulkCreateQuestionsResponse\0223\n\tques" +
      "tions\030\001 \003(\0132\025.api.commons.QuestionR\tques" +
      "tionsB\270\001\n)com.tcn.cloud.api.api.v1alpha1" +
      ".scorecardsB\rQuestionProtoP\001\242\002\003AVS\252\002\027Api" +
      ".V1alpha1.Scorecards\312\002\027Api\\V1alpha1\\Scor" +
      "ecards\342\002#Api\\V1alpha1\\Scorecards\\GPBMeta" +
      "data\352\002\031Api::V1alpha1::Scorecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_api_v1alpha1_scorecards_CreateQuestionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_v1alpha1_scorecards_CreateQuestionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateQuestionRequest_descriptor,
        new java.lang.String[] { "Question", });
    internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateQuestionResponse_descriptor,
        new java.lang.String[] { "Question", });
    internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListQuestionsRequest_descriptor,
        new java.lang.String[] { "AuthorIds", "CategoryIds", });
    internal_static_api_v1alpha1_scorecards_ListQuestionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_v1alpha1_scorecards_ListQuestionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_ListQuestionsResponse_descriptor,
        new java.lang.String[] { "Questions", });
    internal_static_api_v1alpha1_scorecards_UpdateQuestionRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_v1alpha1_scorecards_UpdateQuestionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_UpdateQuestionRequest_descriptor,
        new java.lang.String[] { "Question", "UpdateMask", });
    internal_static_api_v1alpha1_scorecards_UpdateQuestionResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_v1alpha1_scorecards_UpdateQuestionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_UpdateQuestionResponse_descriptor,
        new java.lang.String[] { "Question", });
    internal_static_api_v1alpha1_scorecards_DeleteQuestionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_v1alpha1_scorecards_DeleteQuestionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteQuestionRequest_descriptor,
        new java.lang.String[] { "QuestionId", });
    internal_static_api_v1alpha1_scorecards_DeleteQuestionResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_v1alpha1_scorecards_DeleteQuestionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteQuestionResponse_descriptor,
        new java.lang.String[] { "Question", });
    internal_static_api_v1alpha1_scorecards_GetQuestionRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_v1alpha1_scorecards_GetQuestionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_GetQuestionRequest_descriptor,
        new java.lang.String[] { "QuestionId", "Question", });
    internal_static_api_v1alpha1_scorecards_GetQuestionResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_v1alpha1_scorecards_GetQuestionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_GetQuestionResponse_descriptor,
        new java.lang.String[] { "Question", });
    internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryRequest_descriptor,
        new java.lang.String[] { "QuestionId", "CategoryId", });
    internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_CreateQuestionCategoryResponse_descriptor,
        new java.lang.String[] { "QuestionId", "CategoryId", "QuestionCategoryId", });
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_descriptor,
        new java.lang.String[] { "QuestionCategoryId", "BothIds", "Where", });
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_BothIds_descriptor =
      internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_descriptor.getNestedTypes().get(0);
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_BothIds_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryRequest_BothIds_descriptor,
        new java.lang.String[] { "QuestionId", "CategoryId", });
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_DeleteQuestionCategoryResponse_descriptor,
        new java.lang.String[] { "QuestionId", "CategoryId", "QuestionCategoryId", });
    internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsRequest_descriptor,
        new java.lang.String[] { "ScorecardId", "UseDefault", });
    internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_v1alpha1_scorecards_BulkCreateQuestionsResponse_descriptor,
        new java.lang.String[] { "Questions", });
    com.tcn.cloud.api.api.commons.ScorecardsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
