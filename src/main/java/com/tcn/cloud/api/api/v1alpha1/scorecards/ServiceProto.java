// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/scorecards/service.proto

package com.tcn.cloud.api.api.v1alpha1.scorecards;

public final class ServiceProto {
  private ServiceProto() {}
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
      "\n%api/v1alpha1/scorecards/service.proto\022" +
      "\027api.v1alpha1.scorecards\032\027annotations/au" +
      "thz.proto\032-api/v1alpha1/scorecards/auto_" +
      "evaluation.proto\032+api/v1alpha1/scorecard" +
      "s/auto_question.proto\032&api/v1alpha1/scor" +
      "ecards/category.proto\032(api/v1alpha1/scor" +
      "ecards/evaluation.proto\0321api/v1alpha1/sc" +
      "orecards/evaluation_question.proto\032&api/" +
      "v1alpha1/scorecards/question.proto\032\'api/" +
      "v1alpha1/scorecards/scorecard.proto\0320api" +
      "/v1alpha1/scorecards/scorecard_question." +
      "proto\032%api/v1alpha1/scorecards/section.p" +
      "roto\032\034google/api/annotations.proto2\257F\n\nS" +
      "corecards\022\276\001\n\017CreateScorecard\022/.api.v1al" +
      "pha1.scorecards.CreateScorecardRequest\0320" +
      ".api.v1alpha1.scorecards.CreateScorecard" +
      "Response\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v1alpha" +
      "1/scorecards/scorecards/createscorecard:" +
      "\001*\022\277\001\n\016ListScorecards\022..api.v1alpha1.sco" +
      "recards.ListScorecardsRequest\032/.api.v1al" +
      "pha1.scorecards.ListScorecardsResponse\"L" +
      "\272\270\221\002\n\n\003\010\301\014\n\003\010\302\014\202\323\344\223\0027\"2/api/v1alpha1/sco" +
      "recards/scorecards/listscorecards:\001*\022\276\001\n" +
      "\017UpdateScorecard\022/.api.v1alpha1.scorecar" +
      "ds.UpdateScorecardRequest\0320.api.v1alpha1" +
      ".scorecards.UpdateScorecardResponse\"H\272\270\221" +
      "\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v1alpha1/scorecards/" +
      "scorecards/updatescorecard:\001*\022\276\001\n\017Delete" +
      "Scorecard\022/.api.v1alpha1.scorecards.Dele" +
      "teScorecardRequest\0320.api.v1alpha1.scorec" +
      "ards.DeleteScorecardResponse\"H\272\270\221\002\005\n\003\010\301\014" +
      "\202\323\344\223\0028\"3/api/v1alpha1/scorecards/scoreca" +
      "rds/deletescorecard:\001*\022\267\001\n\014GetScorecard\022" +
      ",.api.v1alpha1.scorecards.GetScorecardRe" +
      "quest\032-.api.v1alpha1.scorecards.GetScore" +
      "cardResponse\"J\272\270\221\002\n\n\003\010\301\014\n\003\010\302\014\202\323\344\223\0025\"0/ap" +
      "i/v1alpha1/scorecards/scorecards/getscor" +
      "ecard:\001*\022\272\001\n\016CreateQuestion\022..api.v1alph" +
      "a1.scorecards.CreateQuestionRequest\032/.ap" +
      "i.v1alpha1.scorecards.CreateQuestionResp" +
      "onse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1/sc" +
      "orecards/scorecards/createquestion:\001*\022\266\001" +
      "\n\rListQuestions\022-.api.v1alpha1.scorecard" +
      "s.ListQuestionsRequest\032..api.v1alpha1.sc" +
      "orecards.ListQuestionsResponse\"F\272\270\221\002\005\n\003\010" +
      "\301\014\202\323\344\223\0026\"1/api/v1alpha1/scorecards/score" +
      "cards/listquestions:\001*\022\272\001\n\016UpdateQuestio" +
      "n\022..api.v1alpha1.scorecards.UpdateQuesti" +
      "onRequest\032/.api.v1alpha1.scorecards.Upda" +
      "teQuestionResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/a" +
      "pi/v1alpha1/scorecards/scorecards/update" +
      "question:\001*\022\272\001\n\016DeleteQuestion\022..api.v1a" +
      "lpha1.scorecards.DeleteQuestionRequest\032/" +
      ".api.v1alpha1.scorecards.DeleteQuestionR" +
      "esponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1" +
      "/scorecards/scorecards/deletequestion:\001*" +
      "\022\256\001\n\013GetQuestion\022+.api.v1alpha1.scorecar" +
      "ds.GetQuestionRequest\032,.api.v1alpha1.sco" +
      "recards.GetQuestionResponse\"D\272\270\221\002\005\n\003\010\301\014\202" +
      "\323\344\223\0024\"//api/v1alpha1/scorecards/scorecar" +
      "ds/getquestion:\001*\022\316\001\n\023BulkCreateQuestion" +
      "s\0223.api.v1alpha1.scorecards.BulkCreateQu" +
      "estionsRequest\0324.api.v1alpha1.scorecards" +
      ".BulkCreateQuestionsResponse\"L\272\270\221\002\005\n\003\010\301\014" +
      "\202\323\344\223\002<\"7/api/v1alpha1/scorecards/scoreca" +
      "rds/bulkcreatequestions:\001*\022\272\001\n\016CreateCat" +
      "egory\022..api.v1alpha1.scorecards.CreateCa" +
      "tegoryRequest\032/.api.v1alpha1.scorecards." +
      "CreateCategoryResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027" +
      "\"2/api/v1alpha1/scorecards/scorecards/cr" +
      "eatecategory:\001*\022\277\001\n\016ListCategories\022..api" +
      ".v1alpha1.scorecards.ListCategoriesReque" +
      "st\032/.api.v1alpha1.scorecards.ListCategor" +
      "iesResponse\"L\272\270\221\002\n\n\003\010\301\014\n\003\010\302\014\202\323\344\223\0027\"2/api" +
      "/v1alpha1/scorecards/scorecards/listcate" +
      "gories:\001*\022\272\001\n\016UpdateCategory\022..api.v1alp" +
      "ha1.scorecards.UpdateCategoryRequest\032/.a" +
      "pi.v1alpha1.scorecards.UpdateCategoryRes" +
      "ponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1/s" +
      "corecards/scorecards/updatecategory:\001*\022\272" +
      "\001\n\016DeleteCategory\022..api.v1alpha1.scoreca" +
      "rds.DeleteCategoryRequest\032/.api.v1alpha1" +
      ".scorecards.DeleteCategoryResponse\"G\272\270\221\002" +
      "\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1/scorecards/s" +
      "corecards/deletecategory:\001*\022\256\001\n\013GetCateg" +
      "ory\022+.api.v1alpha1.scorecards.GetCategor" +
      "yRequest\032,.api.v1alpha1.scorecards.GetCa" +
      "tegoryResponse\"D\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0024\"//api/v" +
      "1alpha1/scorecards/scorecards/getcategor" +
      "y:\001*\022\336\001\n\027CreateScorecardQuestion\0227.api.v" +
      "1alpha1.scorecards.CreateScorecardQuesti" +
      "onRequest\0328.api.v1alpha1.scorecards.Crea" +
      "teScorecardQuestionResponse\"P\272\270\221\002\005\n\003\010\301\014\202" +
      "\323\344\223\002@\";/api/v1alpha1/scorecards/scorecar" +
      "ds/createscorecardquestion:\001*\022\336\001\n\027Update" +
      "ScorecardQuestion\0227.api.v1alpha1.scoreca" +
      "rds.UpdateScorecardQuestionRequest\0328.api" +
      ".v1alpha1.scorecards.UpdateScorecardQues" +
      "tionResponse\"P\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002@\";/api/v1a" +
      "lpha1/scorecards/scorecards/updatescorec" +
      "ardquestion:\001*\022\336\001\n\027DeleteScorecardQuesti" +
      "on\0227.api.v1alpha1.scorecards.DeleteScore" +
      "cardQuestionRequest\0328.api.v1alpha1.score" +
      "cards.DeleteScorecardQuestionResponse\"P\272" +
      "\270\221\002\005\n\003\010\301\014\202\323\344\223\002@\";/api/v1alpha1/scorecard" +
      "s/scorecards/deletescorecardquestion:\001*\022" +
      "\322\001\n\024GetScorecardQuestion\0224.api.v1alpha1." +
      "scorecards.GetScorecardQuestionRequest\0325" +
      ".api.v1alpha1.scorecards.GetScorecardQue" +
      "stionResponse\"M\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002=\"8/api/v1" +
      "alpha1/scorecards/scorecards/getscorecar" +
      "dquestion:\001*\022\266\001\n\rCreateSection\022-.api.v1a" +
      "lpha1.scorecards.CreateSectionRequest\032.." +
      "api.v1alpha1.scorecards.CreateSectionRes" +
      "ponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api/v1alpha1/s" +
      "corecards/scorecards/createsection:\001*\022\262\001" +
      "\n\014ListSections\022,.api.v1alpha1.scorecards" +
      ".ListSectionsRequest\032-.api.v1alpha1.scor" +
      "ecards.ListSectionsResponse\"E\272\270\221\002\005\n\003\010\301\014\202" +
      "\323\344\223\0025\"0/api/v1alpha1/scorecards/scorecar" +
      "ds/listsections:\001*\022\266\001\n\rUpdateSection\022-.a" +
      "pi.v1alpha1.scorecards.UpdateSectionRequ" +
      "est\032..api.v1alpha1.scorecards.UpdateSect" +
      "ionResponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api/v1al" +
      "pha1/scorecards/scorecards/updatesection" +
      ":\001*\022\252\001\n\nGetSection\022*.api.v1alpha1.scorec" +
      "ards.GetSectionRequest\032+.api.v1alpha1.sc" +
      "orecards.GetSectionResponse\"C\272\270\221\002\005\n\003\010\301\014\202" +
      "\323\344\223\0023\"./api/v1alpha1/scorecards/scorecar" +
      "ds/getsection:\001*\022\266\001\n\rDeleteSection\022-.api" +
      ".v1alpha1.scorecards.DeleteSectionReques" +
      "t\032..api.v1alpha1.scorecards.DeleteSectio" +
      "nResponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api/v1alph" +
      "a1/scorecards/scorecards/deletesection:\001" +
      "*\022\332\001\n\026CreateQuestionCategory\0226.api.v1alp" +
      "ha1.scorecards.CreateQuestionCategoryReq" +
      "uest\0327.api.v1alpha1.scorecards.CreateQue" +
      "stionCategoryResponse\"O\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002?\"" +
      ":/api/v1alpha1/scorecards/scorecards/cre" +
      "atequestioncategory:\001*\022\332\001\n\026DeleteQuestio" +
      "nCategory\0226.api.v1alpha1.scorecards.Dele" +
      "teQuestionCategoryRequest\0327.api.v1alpha1" +
      ".scorecards.DeleteQuestionCategoryRespon" +
      "se\"O\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002?\":/api/v1alpha1/scor" +
      "ecards/scorecards/deletequestioncategory" +
      ":\001*\022\302\001\n\020CreateEvaluation\0220.api.v1alpha1." +
      "scorecards.CreateEvaluationRequest\0321.api" +
      ".v1alpha1.scorecards.CreateEvaluationRes" +
      "ponse\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"4/api/v1alpha1/s" +
      "corecards/scorecards/createevaluation:\001*" +
      "\022\302\001\n\020DeleteEvaluation\0220.api.v1alpha1.sco" +
      "recards.DeleteEvaluationRequest\0321.api.v1" +
      "alpha1.scorecards.DeleteEvaluationRespon" +
      "se\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"4/api/v1alpha1/scor" +
      "ecards/scorecards/deleteevaluation:\001*\022\276\001" +
      "\n\017ScoreEvaluation\022/.api.v1alpha1.scoreca" +
      "rds.ScoreEvaluationRequest\0320.api.v1alpha" +
      "1.scorecards.ScoreEvaluationResponse\"H\272\270" +
      "\221\002\005\n\003\010\302\014\202\323\344\223\0028\"3/api/v1alpha1/scorecards" +
      "/scorecards/scoreevaluation:\001*\022\302\001\n\020Updat" +
      "eEvaluation\0220.api.v1alpha1.scorecards.Up" +
      "dateEvaluationRequest\0321.api.v1alpha1.sco" +
      "recards.UpdateEvaluationResponse\"I\272\270\221\002\005\n" +
      "\003\010\302\014\202\323\344\223\0029\"4/api/v1alpha1/scorecards/sco" +
      "recards/updateevaluation:\001*\022\266\001\n\rGetEvalu" +
      "ation\022-.api.v1alpha1.scorecards.GetEvalu" +
      "ationRequest\032..api.v1alpha1.scorecards.G" +
      "etEvaluationResponse\"F\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0026\"1" +
      "/api/v1alpha1/scorecards/scorecards/gete" +
      "valuation:\001*\022\276\001\n\017ListEvaluations\022/.api.v" +
      "1alpha1.scorecards.ListEvaluationsReques" +
      "t\0320.api.v1alpha1.scorecards.ListEvaluati" +
      "onsResponse\"H\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0028\"3/api/v1al" +
      "pha1/scorecards/scorecards/listevaluatio" +
      "ns:\001*\022\345\001\n\030CreateEvaluationQuestion\0228.api" +
      ".v1alpha1.scorecards.CreateEvaluationQue" +
      "stionRequest\0329.api.v1alpha1.scorecards.C" +
      "reateEvaluationQuestionResponse\"T\210\002\001\272\270\221\002" +
      "\005\n\003\010\302\014\202\323\344\223\002A\"</api/v1alpha1/scorecards/s" +
      "corecards/createevaluationquestion:\001*\022\342\001" +
      "\n\030UpdateEvaluationQuestion\0228.api.v1alpha" +
      "1.scorecards.UpdateEvaluationQuestionReq" +
      "uest\0329.api.v1alpha1.scorecards.UpdateEva" +
      "luationQuestionResponse\"Q\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002" +
      "A\"</api/v1alpha1/scorecards/scorecards/u" +
      "pdateevaluationquestion:\001*\022\342\001\n\030DeleteEva" +
      "luationQuestion\0228.api.v1alpha1.scorecard" +
      "s.DeleteEvaluationQuestionRequest\0329.api." +
      "v1alpha1.scorecards.DeleteEvaluationQues" +
      "tionResponse\"Q\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002A\"</api/v1a" +
      "lpha1/scorecards/scorecards/deleteevalua" +
      "tionquestion:\001*\022\326\001\n\025SampleCallsByCategor" +
      "y\0225.api.v1alpha1.scorecards.SampleCallsB" +
      "yCategoryRequest\0326.api.v1alpha1.scorecar" +
      "ds.SampleCallsByCategoryResponse\"N\272\270\221\002\005\n" +
      "\003\010\302\014\202\323\344\223\002>\"9/api/v1alpha1/scorecards/sco" +
      "recards/samplecallsbycategory:\001*\022\312\001\n\022Cre" +
      "ateAutoQuestion\0222.api.v1alpha1.scorecard" +
      "s.CreateAutoQuestionRequest\0323.api.v1alph" +
      "a1.scorecards.CreateAutoQuestionResponse" +
      "\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1alpha1/scorec" +
      "ards/scorecards/createautoquestion:\001*\022\312\001" +
      "\n\022UpdateAutoQuestion\0222.api.v1alpha1.scor" +
      "ecards.UpdateAutoQuestionRequest\0323.api.v" +
      "1alpha1.scorecards.UpdateAutoQuestionRes" +
      "ponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1alpha1/s" +
      "corecards/scorecards/updateautoquestion:" +
      "\001*\022\312\001\n\022DeleteAutoQuestion\0222.api.v1alpha1" +
      ".scorecards.DeleteAutoQuestionRequest\0323." +
      "api.v1alpha1.scorecards.DeleteAutoQuesti" +
      "onResponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1alp" +
      "ha1/scorecards/scorecards/deleteautoques" +
      "tion:\001*\022\276\001\n\017GetAutoQuestion\022/.api.v1alph" +
      "a1.scorecards.GetAutoQuestionRequest\0320.a" +
      "pi.v1alpha1.scorecards.GetAutoQuestionRe" +
      "sponse\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v1alpha1/" +
      "scorecards/scorecards/getautoquestion:\001*" +
      "\022\306\001\n\021GetAutoEvaluation\0221.api.v1alpha1.sc" +
      "orecards.GetAutoEvaluationRequest\0322.api." +
      "v1alpha1.scorecards.GetAutoEvaluationRes" +
      "ponse\"J\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002:\"5/api/v1alpha1/s" +
      "corecards/scorecards/getautoevaluation:\001" +
      "*\022\316\001\n\023ListAutoEvaluations\0223.api.v1alpha1" +
      ".scorecards.ListAutoEvaluationsRequest\0324" +
      ".api.v1alpha1.scorecards.ListAutoEvaluat" +
      "ionsResponse\"L\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002<\"7/api/v1a" +
      "lpha1/scorecards/scorecards/listautoeval" +
      "uations:\001*\022\322\001\n\024DeleteAutoEvaluation\0224.ap" +
      "i.v1alpha1.scorecards.DeleteAutoEvaluati" +
      "onRequest\0325.api.v1alpha1.scorecards.Dele" +
      "teAutoEvaluationResponse\"M\272\270\221\002\005\n\003\010\302\014\202\323\344\223" +
      "\002=\"8/api/v1alpha1/scorecards/scorecards/" +
      "deleteautoevaluation:\001*\022\332\001\n\026PreviewEvalu" +
      "ationScore\0226.api.v1alpha1.scorecards.Pre" +
      "viewEvaluationScoreRequest\0327.api.v1alpha" +
      "1.scorecards.PreviewEvaluationScoreRespo" +
      "nse\"O\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002?\":/api/v1alpha1/sco" +
      "recards/scorecards/previewevaluationscor" +
      "e:\001*B\267\001\n)com.tcn.cloud.api.api.v1alpha1." +
      "scorecardsB\014ServiceProtoP\001\242\002\003AVS\252\002\027Api.V" +
      "1alpha1.Scorecards\312\002\027Api\\V1alpha1\\Scorec" +
      "ards\342\002#Api\\V1alpha1\\Scorecards\\GPBMetada" +
      "ta\352\002\031Api::V1alpha1::Scorecardsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.SectionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.AutoEvaluationProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.AutoQuestionProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.CategoryProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.EvaluationQuestionProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.QuestionProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.ScorecardQuestionProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.SectionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
