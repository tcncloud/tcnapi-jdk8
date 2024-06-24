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
      "roto\032\034google/api/annotations.proto2\330I\n\nS" +
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
      "eatecategory:\001*\022\304\001\n\016ListCategories\022..api" +
      ".v1alpha1.scorecards.ListCategoriesReque" +
      "st\032/.api.v1alpha1.scorecards.ListCategor" +
      "iesResponse\"Q\272\270\221\002\017\n\003\010\324\002\n\003\010\301\014\n\003\010\302\014\202\323\344\223\0027\"" +
      "2/api/v1alpha1/scorecards/scorecards/lis" +
      "tcategories:\001*\022\272\001\n\016UpdateCategory\022..api." +
      "v1alpha1.scorecards.UpdateCategoryReques" +
      "t\032/.api.v1alpha1.scorecards.UpdateCatego" +
      "ryResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alp" +
      "ha1/scorecards/scorecards/updatecategory" +
      ":\001*\022\272\001\n\016DeleteCategory\022..api.v1alpha1.sc" +
      "orecards.DeleteCategoryRequest\032/.api.v1a" +
      "lpha1.scorecards.DeleteCategoryResponse\"" +
      "G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1/scoreca" +
      "rds/scorecards/deletecategory:\001*\022\256\001\n\013Get" +
      "Category\022+.api.v1alpha1.scorecards.GetCa" +
      "tegoryRequest\032,.api.v1alpha1.scorecards." +
      "GetCategoryResponse\"D\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0024\"//" +
      "api/v1alpha1/scorecards/scorecards/getca" +
      "tegory:\001*\022\336\001\n\027CreateScorecardQuestion\0227." +
      "api.v1alpha1.scorecards.CreateScorecardQ" +
      "uestionRequest\0328.api.v1alpha1.scorecards" +
      ".CreateScorecardQuestionResponse\"P\272\270\221\002\005\n" +
      "\003\010\301\014\202\323\344\223\002@\";/api/v1alpha1/scorecards/sco" +
      "recards/createscorecardquestion:\001*\022\336\001\n\027U" +
      "pdateScorecardQuestion\0227.api.v1alpha1.sc" +
      "orecards.UpdateScorecardQuestionRequest\032" +
      "8.api.v1alpha1.scorecards.UpdateScorecar" +
      "dQuestionResponse\"P\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002@\";/ap" +
      "i/v1alpha1/scorecards/scorecards/updates" +
      "corecardquestion:\001*\022\336\001\n\027DeleteScorecardQ" +
      "uestion\0227.api.v1alpha1.scorecards.Delete" +
      "ScorecardQuestionRequest\0328.api.v1alpha1." +
      "scorecards.DeleteScorecardQuestionRespon" +
      "se\"P\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002@\";/api/v1alpha1/scor" +
      "ecards/scorecards/deletescorecardquestio" +
      "n:\001*\022\322\001\n\024GetScorecardQuestion\0224.api.v1al" +
      "pha1.scorecards.GetScorecardQuestionRequ" +
      "est\0325.api.v1alpha1.scorecards.GetScoreca" +
      "rdQuestionResponse\"M\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002=\"8/a" +
      "pi/v1alpha1/scorecards/scorecards/getsco" +
      "recardquestion:\001*\022\266\001\n\rCreateSection\022-.ap" +
      "i.v1alpha1.scorecards.CreateSectionReque" +
      "st\032..api.v1alpha1.scorecards.CreateSecti" +
      "onResponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api/v1alp" +
      "ha1/scorecards/scorecards/createsection:" +
      "\001*\022\262\001\n\014ListSections\022,.api.v1alpha1.score" +
      "cards.ListSectionsRequest\032-.api.v1alpha1" +
      ".scorecards.ListSectionsResponse\"E\272\270\221\002\005\n" +
      "\003\010\301\014\202\323\344\223\0025\"0/api/v1alpha1/scorecards/sco" +
      "recards/listsections:\001*\022\266\001\n\rUpdateSectio" +
      "n\022-.api.v1alpha1.scorecards.UpdateSectio" +
      "nRequest\032..api.v1alpha1.scorecards.Updat" +
      "eSectionResponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api" +
      "/v1alpha1/scorecards/scorecards/updatese" +
      "ction:\001*\022\252\001\n\nGetSection\022*.api.v1alpha1.s" +
      "corecards.GetSectionRequest\032+.api.v1alph" +
      "a1.scorecards.GetSectionResponse\"C\272\270\221\002\005\n" +
      "\003\010\301\014\202\323\344\223\0023\"./api/v1alpha1/scorecards/sco" +
      "recards/getsection:\001*\022\266\001\n\rDeleteSection\022" +
      "-.api.v1alpha1.scorecards.DeleteSectionR" +
      "equest\032..api.v1alpha1.scorecards.DeleteS" +
      "ectionResponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api/v" +
      "1alpha1/scorecards/scorecards/deletesect" +
      "ion:\001*\022\332\001\n\026CreateQuestionCategory\0226.api." +
      "v1alpha1.scorecards.CreateQuestionCatego" +
      "ryRequest\0327.api.v1alpha1.scorecards.Crea" +
      "teQuestionCategoryResponse\"O\272\270\221\002\005\n\003\010\301\014\202\323" +
      "\344\223\002?\":/api/v1alpha1/scorecards/scorecard" +
      "s/createquestioncategory:\001*\022\332\001\n\026DeleteQu" +
      "estionCategory\0226.api.v1alpha1.scorecards" +
      ".DeleteQuestionCategoryRequest\0327.api.v1a" +
      "lpha1.scorecards.DeleteQuestionCategoryR" +
      "esponse\"O\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002?\":/api/v1alpha1" +
      "/scorecards/scorecards/deletequestioncat" +
      "egory:\001*\022\302\001\n\020CreateEvaluation\0220.api.v1al" +
      "pha1.scorecards.CreateEvaluationRequest\032" +
      "1.api.v1alpha1.scorecards.CreateEvaluati" +
      "onResponse\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"4/api/v1alp" +
      "ha1/scorecards/scorecards/createevaluati" +
      "on:\001*\022\302\001\n\020DeleteEvaluation\0220.api.v1alpha" +
      "1.scorecards.DeleteEvaluationRequest\0321.a" +
      "pi.v1alpha1.scorecards.DeleteEvaluationR" +
      "esponse\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"4/api/v1alpha1" +
      "/scorecards/scorecards/deleteevaluation:" +
      "\001*\022\276\001\n\017ScoreEvaluation\022/.api.v1alpha1.sc" +
      "orecards.ScoreEvaluationRequest\0320.api.v1" +
      "alpha1.scorecards.ScoreEvaluationRespons" +
      "e\"H\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0028\"3/api/v1alpha1/score" +
      "cards/scorecards/scoreevaluation:\001*\022\302\001\n\020" +
      "UpdateEvaluation\0220.api.v1alpha1.scorecar" +
      "ds.UpdateEvaluationRequest\0321.api.v1alpha" +
      "1.scorecards.UpdateEvaluationResponse\"I\272" +
      "\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"4/api/v1alpha1/scorecard" +
      "s/scorecards/updateevaluation:\001*\022\266\001\n\rGet" +
      "Evaluation\022-.api.v1alpha1.scorecards.Get" +
      "EvaluationRequest\032..api.v1alpha1.scoreca" +
      "rds.GetEvaluationResponse\"F\272\270\221\002\005\n\003\010\302\014\202\323\344" +
      "\223\0026\"1/api/v1alpha1/scorecards/scorecards" +
      "/getevaluation:\001*\022\276\001\n\017ListEvaluations\022/." +
      "api.v1alpha1.scorecards.ListEvaluationsR" +
      "equest\0320.api.v1alpha1.scorecards.ListEva" +
      "luationsResponse\"H\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0028\"3/api" +
      "/v1alpha1/scorecards/scorecards/listeval" +
      "uations:\001*\022\345\001\n\030CreateEvaluationQuestion\022" +
      "8.api.v1alpha1.scorecards.CreateEvaluati" +
      "onQuestionRequest\0329.api.v1alpha1.scoreca" +
      "rds.CreateEvaluationQuestionResponse\"T\210\002" +
      "\001\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002A\"</api/v1alpha1/scoreca" +
      "rds/scorecards/createevaluationquestion:" +
      "\001*\022\342\001\n\030UpdateEvaluationQuestion\0228.api.v1" +
      "alpha1.scorecards.UpdateEvaluationQuesti" +
      "onRequest\0329.api.v1alpha1.scorecards.Upda" +
      "teEvaluationQuestionResponse\"Q\272\270\221\002\005\n\003\010\302\014" +
      "\202\323\344\223\002A\"</api/v1alpha1/scorecards/scoreca" +
      "rds/updateevaluationquestion:\001*\022\342\001\n\030Dele" +
      "teEvaluationQuestion\0228.api.v1alpha1.scor" +
      "ecards.DeleteEvaluationQuestionRequest\0329" +
      ".api.v1alpha1.scorecards.DeleteEvaluatio" +
      "nQuestionResponse\"Q\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002A\"</ap" +
      "i/v1alpha1/scorecards/scorecards/deletee" +
      "valuationquestion:\001*\022\326\001\n\025SampleCallsByCa" +
      "tegory\0225.api.v1alpha1.scorecards.SampleC" +
      "allsByCategoryRequest\0326.api.v1alpha1.sco" +
      "recards.SampleCallsByCategoryResponse\"N\272" +
      "\270\221\002\005\n\003\010\302\014\202\323\344\223\002>\"9/api/v1alpha1/scorecard" +
      "s/scorecards/samplecallsbycategory:\001*\022\312\001" +
      "\n\022CreateAutoQuestion\0222.api.v1alpha1.scor" +
      "ecards.CreateAutoQuestionRequest\0323.api.v" +
      "1alpha1.scorecards.CreateAutoQuestionRes" +
      "ponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1alpha1/s" +
      "corecards/scorecards/createautoquestion:" +
      "\001*\022\312\001\n\022UpdateAutoQuestion\0222.api.v1alpha1" +
      ".scorecards.UpdateAutoQuestionRequest\0323." +
      "api.v1alpha1.scorecards.UpdateAutoQuesti" +
      "onResponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1alp" +
      "ha1/scorecards/scorecards/updateautoques" +
      "tion:\001*\022\312\001\n\022DeleteAutoQuestion\0222.api.v1a" +
      "lpha1.scorecards.DeleteAutoQuestionReque" +
      "st\0323.api.v1alpha1.scorecards.DeleteAutoQ" +
      "uestionResponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/" +
      "v1alpha1/scorecards/scorecards/deleteaut" +
      "oquestion:\001*\022\276\001\n\017GetAutoQuestion\022/.api.v" +
      "1alpha1.scorecards.GetAutoQuestionReques" +
      "t\0320.api.v1alpha1.scorecards.GetAutoQuest" +
      "ionResponse\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v1al" +
      "pha1/scorecards/scorecards/getautoquesti" +
      "on:\001*\022\306\001\n\021GetAutoEvaluation\0221.api.v1alph" +
      "a1.scorecards.GetAutoEvaluationRequest\0322" +
      ".api.v1alpha1.scorecards.GetAutoEvaluati" +
      "onResponse\"J\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002:\"5/api/v1alp" +
      "ha1/scorecards/scorecards/getautoevaluat" +
      "ion:\001*\022\316\001\n\023ListAutoEvaluations\0223.api.v1a" +
      "lpha1.scorecards.ListAutoEvaluationsRequ" +
      "est\0324.api.v1alpha1.scorecards.ListAutoEv" +
      "aluationsResponse\"L\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002<\"7/ap" +
      "i/v1alpha1/scorecards/scorecards/listaut" +
      "oevaluations:\001*\022\330\001\n\025StreamAutoEvaluation" +
      "s\0225.api.v1alpha1.scorecards.StreamAutoEv" +
      "aluationsRequest\0326.api.v1alpha1.scorecar" +
      "ds.StreamAutoEvaluationsResponse\"N\272\270\221\002\005\n" +
      "\003\010\302\014\202\323\344\223\002>\"9/api/v1alpha1/scorecards/sco" +
      "recards/streamautoevaluations:\001*0\001\022\322\001\n\024D" +
      "eleteAutoEvaluation\0224.api.v1alpha1.score" +
      "cards.DeleteAutoEvaluationRequest\0325.api." +
      "v1alpha1.scorecards.DeleteAutoEvaluation" +
      "Response\"M\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002=\"8/api/v1alpha" +
      "1/scorecards/scorecards/deleteautoevalua" +
      "tion:\001*\022\332\001\n\026PreviewEvaluationScore\0226.api" +
      ".v1alpha1.scorecards.PreviewEvaluationSc" +
      "oreRequest\0327.api.v1alpha1.scorecards.Pre" +
      "viewEvaluationScoreResponse\"O\272\270\221\002\005\n\003\010\302\014\202" +
      "\323\344\223\002?\":/api/v1alpha1/scorecards/scorecar" +
      "ds/previewevaluationscore:\001*\022\306\001\n\021Restore" +
      "Evaluation\0221.api.v1alpha1.scorecards.Res" +
      "toreEvaluationRequest\0322.api.v1alpha1.sco" +
      "recards.RestoreEvaluationResponse\"J\272\270\221\002\005" +
      "\n\003\010\302\014\202\323\344\223\002:\"5/api/v1alpha1/scorecards/sc" +
      "orecards/restoreevaluation:\001*B\267\001\n)com.tc" +
      "n.cloud.api.api.v1alpha1.scorecardsB\014Ser" +
      "viceProtoP\001\242\002\003AVS\252\002\027Api.V1alpha1.Scoreca" +
      "rds\312\002\027Api\\V1alpha1\\Scorecards\342\002#Api\\V1al" +
      "pha1\\Scorecards\\GPBMetadata\352\002\031Api::V1alp" +
      "ha1::Scorecardsb\006proto3"
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
