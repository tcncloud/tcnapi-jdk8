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
      "roto\032.api/v1alpha1/scorecards/smart_eval" +
      "uation.proto\032,api/v1alpha1/scorecards/sm" +
      "art_question.proto\032\034google/api/annotatio" +
      "ns.proto2\253U\n\nScorecards\022\276\001\n\017CreateScorec" +
      "ard\022/.api.v1alpha1.scorecards.CreateScor" +
      "ecardRequest\0320.api.v1alpha1.scorecards.C" +
      "reateScorecardResponse\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028" +
      "\"3/api/v1alpha1/scorecards/scorecards/cr" +
      "eatescorecard:\001*\022\277\001\n\016ListScorecards\022..ap" +
      "i.v1alpha1.scorecards.ListScorecardsRequ" +
      "est\032/.api.v1alpha1.scorecards.ListScorec" +
      "ardsResponse\"L\272\270\221\002\n\n\003\010\301\014\n\003\010\302\014\202\323\344\223\0027\"2/ap" +
      "i/v1alpha1/scorecards/scorecards/listsco" +
      "recards:\001*\022\276\001\n\017UpdateScorecard\022/.api.v1a" +
      "lpha1.scorecards.UpdateScorecardRequest\032" +
      "0.api.v1alpha1.scorecards.UpdateScorecar" +
      "dResponse\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v1alph" +
      "a1/scorecards/scorecards/updatescorecard" +
      ":\001*\022\276\001\n\017DeleteScorecard\022/.api.v1alpha1.s" +
      "corecards.DeleteScorecardRequest\0320.api.v" +
      "1alpha1.scorecards.DeleteScorecardRespon" +
      "se\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v1alpha1/scor" +
      "ecards/scorecards/deletescorecard:\001*\022\267\001\n" +
      "\014GetScorecard\022,.api.v1alpha1.scorecards." +
      "GetScorecardRequest\032-.api.v1alpha1.score" +
      "cards.GetScorecardResponse\"J\272\270\221\002\n\n\003\010\301\014\n\003" +
      "\010\302\014\202\323\344\223\0025\"0/api/v1alpha1/scorecards/scor" +
      "ecards/getscorecard:\001*\022\272\001\n\016CreateQuestio" +
      "n\022..api.v1alpha1.scorecards.CreateQuesti" +
      "onRequest\032/.api.v1alpha1.scorecards.Crea" +
      "teQuestionResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/a" +
      "pi/v1alpha1/scorecards/scorecards/create" +
      "question:\001*\022\266\001\n\rListQuestions\022-.api.v1al" +
      "pha1.scorecards.ListQuestionsRequest\032..a" +
      "pi.v1alpha1.scorecards.ListQuestionsResp" +
      "onse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0026\"1/api/v1alpha1/sc" +
      "orecards/scorecards/listquestions:\001*\022\272\001\n" +
      "\016UpdateQuestion\022..api.v1alpha1.scorecard" +
      "s.UpdateQuestionRequest\032/.api.v1alpha1.s" +
      "corecards.UpdateQuestionResponse\"G\272\270\221\002\005\n" +
      "\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1/scorecards/sco" +
      "recards/updatequestion:\001*\022\272\001\n\016DeleteQues" +
      "tion\022..api.v1alpha1.scorecards.DeleteQue" +
      "stionRequest\032/.api.v1alpha1.scorecards.D" +
      "eleteQuestionResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"" +
      "2/api/v1alpha1/scorecards/scorecards/del" +
      "etequestion:\001*\022\256\001\n\013GetQuestion\022+.api.v1a" +
      "lpha1.scorecards.GetQuestionRequest\032,.ap" +
      "i.v1alpha1.scorecards.GetQuestionRespons" +
      "e\"D\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0024\"//api/v1alpha1/score" +
      "cards/scorecards/getquestion:\001*\022\316\001\n\023Bulk" +
      "CreateQuestions\0223.api.v1alpha1.scorecard" +
      "s.BulkCreateQuestionsRequest\0324.api.v1alp" +
      "ha1.scorecards.BulkCreateQuestionsRespon" +
      "se\"L\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002<\"7/api/v1alpha1/scor" +
      "ecards/scorecards/bulkcreatequestions:\001*" +
      "\022\272\001\n\016CreateCategory\022..api.v1alpha1.score" +
      "cards.CreateCategoryRequest\032/.api.v1alph" +
      "a1.scorecards.CreateCategoryResponse\"G\272\270" +
      "\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1alpha1/scorecards" +
      "/scorecards/createcategory:\001*\022\304\001\n\016ListCa" +
      "tegories\022..api.v1alpha1.scorecards.ListC" +
      "ategoriesRequest\032/.api.v1alpha1.scorecar" +
      "ds.ListCategoriesResponse\"Q\272\270\221\002\017\n\003\010\324\002\n\003\010" +
      "\301\014\n\003\010\302\014\202\323\344\223\0027\"2/api/v1alpha1/scorecards/" +
      "scorecards/listcategories:\001*\022\272\001\n\016UpdateC" +
      "ategory\022..api.v1alpha1.scorecards.Update" +
      "CategoryRequest\032/.api.v1alpha1.scorecard" +
      "s.UpdateCategoryResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223" +
      "\0027\"2/api/v1alpha1/scorecards/scorecards/" +
      "updatecategory:\001*\022\272\001\n\016DeleteCategory\022..a" +
      "pi.v1alpha1.scorecards.DeleteCategoryReq" +
      "uest\032/.api.v1alpha1.scorecards.DeleteCat" +
      "egoryResponse\"G\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0027\"2/api/v1" +
      "alpha1/scorecards/scorecards/deletecateg" +
      "ory:\001*\022\256\001\n\013GetCategory\022+.api.v1alpha1.sc" +
      "orecards.GetCategoryRequest\032,.api.v1alph" +
      "a1.scorecards.GetCategoryResponse\"D\272\270\221\002\005" +
      "\n\003\010\301\014\202\323\344\223\0024\"//api/v1alpha1/scorecards/sc" +
      "orecards/getcategory:\001*\022\336\001\n\027CreateScorec" +
      "ardQuestion\0227.api.v1alpha1.scorecards.Cr" +
      "eateScorecardQuestionRequest\0328.api.v1alp" +
      "ha1.scorecards.CreateScorecardQuestionRe" +
      "sponse\"P\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002@\";/api/v1alpha1/" +
      "scorecards/scorecards/createscorecardque" +
      "stion:\001*\022\336\001\n\027UpdateScorecardQuestion\0227.a" +
      "pi.v1alpha1.scorecards.UpdateScorecardQu" +
      "estionRequest\0328.api.v1alpha1.scorecards." +
      "UpdateScorecardQuestionResponse\"P\272\270\221\002\005\n\003" +
      "\010\301\014\202\323\344\223\002@\";/api/v1alpha1/scorecards/scor" +
      "ecards/updatescorecardquestion:\001*\022\336\001\n\027De" +
      "leteScorecardQuestion\0227.api.v1alpha1.sco" +
      "recards.DeleteScorecardQuestionRequest\0328" +
      ".api.v1alpha1.scorecards.DeleteScorecard" +
      "QuestionResponse\"P\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002@\";/api" +
      "/v1alpha1/scorecards/scorecards/deletesc" +
      "orecardquestion:\001*\022\322\001\n\024GetScorecardQuest" +
      "ion\0224.api.v1alpha1.scorecards.GetScoreca" +
      "rdQuestionRequest\0325.api.v1alpha1.scoreca" +
      "rds.GetScorecardQuestionResponse\"M\272\270\221\002\005\n" +
      "\003\010\301\014\202\323\344\223\002=\"8/api/v1alpha1/scorecards/sco" +
      "recards/getscorecardquestion:\001*\022\266\001\n\rCrea" +
      "teSection\022-.api.v1alpha1.scorecards.Crea" +
      "teSectionRequest\032..api.v1alpha1.scorecar" +
      "ds.CreateSectionResponse\"F\272\270\221\002\005\n\003\010\301\014\202\323\344\223" +
      "\0026\"1/api/v1alpha1/scorecards/scorecards/" +
      "createsection:\001*\022\262\001\n\014ListSections\022,.api." +
      "v1alpha1.scorecards.ListSectionsRequest\032" +
      "-.api.v1alpha1.scorecards.ListSectionsRe" +
      "sponse\"E\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0025\"0/api/v1alpha1/" +
      "scorecards/scorecards/listsections:\001*\022\266\001" +
      "\n\rUpdateSection\022-.api.v1alpha1.scorecard" +
      "s.UpdateSectionRequest\032..api.v1alpha1.sc" +
      "orecards.UpdateSectionResponse\"F\272\270\221\002\005\n\003\010" +
      "\301\014\202\323\344\223\0026\"1/api/v1alpha1/scorecards/score" +
      "cards/updatesection:\001*\022\252\001\n\nGetSection\022*." +
      "api.v1alpha1.scorecards.GetSectionReques" +
      "t\032+.api.v1alpha1.scorecards.GetSectionRe" +
      "sponse\"C\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0023\"./api/v1alpha1/" +
      "scorecards/scorecards/getsection:\001*\022\266\001\n\r" +
      "DeleteSection\022-.api.v1alpha1.scorecards." +
      "DeleteSectionRequest\032..api.v1alpha1.scor" +
      "ecards.DeleteSectionResponse\"F\272\270\221\002\005\n\003\010\301\014" +
      "\202\323\344\223\0026\"1/api/v1alpha1/scorecards/scoreca" +
      "rds/deletesection:\001*\022\332\001\n\026CreateQuestionC" +
      "ategory\0226.api.v1alpha1.scorecards.Create" +
      "QuestionCategoryRequest\0327.api.v1alpha1.s" +
      "corecards.CreateQuestionCategoryResponse" +
      "\"O\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002?\":/api/v1alpha1/scorec" +
      "ards/scorecards/createquestioncategory:\001" +
      "*\022\332\001\n\026DeleteQuestionCategory\0226.api.v1alp" +
      "ha1.scorecards.DeleteQuestionCategoryReq" +
      "uest\0327.api.v1alpha1.scorecards.DeleteQue" +
      "stionCategoryResponse\"O\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002?\"" +
      ":/api/v1alpha1/scorecards/scorecards/del" +
      "etequestioncategory:\001*\022\302\001\n\020CreateEvaluat" +
      "ion\0220.api.v1alpha1.scorecards.CreateEval" +
      "uationRequest\0321.api.v1alpha1.scorecards." +
      "CreateEvaluationResponse\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223" +
      "\0029\"4/api/v1alpha1/scorecards/scorecards/" +
      "createevaluation:\001*\022\302\001\n\020DeleteEvaluation" +
      "\0220.api.v1alpha1.scorecards.DeleteEvaluat" +
      "ionRequest\0321.api.v1alpha1.scorecards.Del" +
      "eteEvaluationResponse\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"" +
      "4/api/v1alpha1/scorecards/scorecards/del" +
      "eteevaluation:\001*\022\276\001\n\017ScoreEvaluation\022/.a" +
      "pi.v1alpha1.scorecards.ScoreEvaluationRe" +
      "quest\0320.api.v1alpha1.scorecards.ScoreEva" +
      "luationResponse\"H\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0028\"3/api/" +
      "v1alpha1/scorecards/scorecards/scoreeval" +
      "uation:\001*\022\302\001\n\020UpdateEvaluation\0220.api.v1a" +
      "lpha1.scorecards.UpdateEvaluationRequest" +
      "\0321.api.v1alpha1.scorecards.UpdateEvaluat" +
      "ionResponse\"I\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0029\"4/api/v1al" +
      "pha1/scorecards/scorecards/updateevaluat" +
      "ion:\001*\022\266\001\n\rGetEvaluation\022-.api.v1alpha1." +
      "scorecards.GetEvaluationRequest\032..api.v1" +
      "alpha1.scorecards.GetEvaluationResponse\"" +
      "F\272\270\221\002\005\n\003\010\302\014\202\323\344\223\0026\"1/api/v1alpha1/scoreca" +
      "rds/scorecards/getevaluation:\001*\022\276\001\n\017List" +
      "Evaluations\022/.api.v1alpha1.scorecards.Li" +
      "stEvaluationsRequest\0320.api.v1alpha1.scor" +
      "ecards.ListEvaluationsResponse\"H\272\270\221\002\005\n\003\010" +
      "\302\014\202\323\344\223\0028\"3/api/v1alpha1/scorecards/score" +
      "cards/listevaluations:\001*\022\345\001\n\030CreateEvalu" +
      "ationQuestion\0228.api.v1alpha1.scorecards." +
      "CreateEvaluationQuestionRequest\0329.api.v1" +
      "alpha1.scorecards.CreateEvaluationQuesti" +
      "onResponse\"T\210\002\001\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002A\"</api/v1" +
      "alpha1/scorecards/scorecards/createevalu" +
      "ationquestion:\001*\022\342\001\n\030UpdateEvaluationQue" +
      "stion\0228.api.v1alpha1.scorecards.UpdateEv" +
      "aluationQuestionRequest\0329.api.v1alpha1.s" +
      "corecards.UpdateEvaluationQuestionRespon" +
      "se\"Q\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002A\"</api/v1alpha1/scor" +
      "ecards/scorecards/updateevaluationquesti" +
      "on:\001*\022\342\001\n\030DeleteEvaluationQuestion\0228.api" +
      ".v1alpha1.scorecards.DeleteEvaluationQue" +
      "stionRequest\0329.api.v1alpha1.scorecards.D" +
      "eleteEvaluationQuestionResponse\"Q\272\270\221\002\005\n\003" +
      "\010\302\014\202\323\344\223\002A\"</api/v1alpha1/scorecards/scor" +
      "ecards/deleteevaluationquestion:\001*\022\326\001\n\025S" +
      "ampleCallsByCategory\0225.api.v1alpha1.scor" +
      "ecards.SampleCallsByCategoryRequest\0326.ap" +
      "i.v1alpha1.scorecards.SampleCallsByCateg" +
      "oryResponse\"N\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002>\"9/api/v1al" +
      "pha1/scorecards/scorecards/samplecallsby" +
      "category:\001*\022\342\001\n\030SampleAgentConversations" +
      "\0228.api.v1alpha1.scorecards.SampleAgentCo" +
      "nversationsRequest\0329.api.v1alpha1.scorec" +
      "ards.SampleAgentConversationsResponse\"Q\272" +
      "\270\221\002\005\n\003\010\302\014\202\323\344\223\002A\"</api/v1alpha1/scorecard" +
      "s/scorecards/sampleagentconversations:\001*" +
      "\022\312\001\n\022CreateAutoQuestion\0222.api.v1alpha1.s" +
      "corecards.CreateAutoQuestionRequest\0323.ap" +
      "i.v1alpha1.scorecards.CreateAutoQuestion" +
      "Response\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1alpha" +
      "1/scorecards/scorecards/createautoquesti" +
      "on:\001*\022\312\001\n\022UpdateAutoQuestion\0222.api.v1alp" +
      "ha1.scorecards.UpdateAutoQuestionRequest" +
      "\0323.api.v1alpha1.scorecards.UpdateAutoQue" +
      "stionResponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/api/v1" +
      "alpha1/scorecards/scorecards/updateautoq" +
      "uestion:\001*\022\312\001\n\022DeleteAutoQuestion\0222.api." +
      "v1alpha1.scorecards.DeleteAutoQuestionRe" +
      "quest\0323.api.v1alpha1.scorecards.DeleteAu" +
      "toQuestionResponse\"K\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002;\"6/a" +
      "pi/v1alpha1/scorecards/scorecards/delete" +
      "autoquestion:\001*\022\276\001\n\017GetAutoQuestion\022/.ap" +
      "i.v1alpha1.scorecards.GetAutoQuestionReq" +
      "uest\0320.api.v1alpha1.scorecards.GetAutoQu" +
      "estionResponse\"H\272\270\221\002\005\n\003\010\301\014\202\323\344\223\0028\"3/api/v" +
      "1alpha1/scorecards/scorecards/getautoque" +
      "stion:\001*\022\306\001\n\021GetAutoEvaluation\0221.api.v1a" +
      "lpha1.scorecards.GetAutoEvaluationReques" +
      "t\0322.api.v1alpha1.scorecards.GetAutoEvalu" +
      "ationResponse\"J\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002:\"5/api/v1" +
      "alpha1/scorecards/scorecards/getautoeval" +
      "uation:\001*\022\316\001\n\023ListAutoEvaluations\0223.api." +
      "v1alpha1.scorecards.ListAutoEvaluationsR" +
      "equest\0324.api.v1alpha1.scorecards.ListAut" +
      "oEvaluationsResponse\"L\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002<\"7" +
      "/api/v1alpha1/scorecards/scorecards/list" +
      "autoevaluations:\001*\022\330\001\n\025StreamAutoEvaluat" +
      "ions\0225.api.v1alpha1.scorecards.StreamAut" +
      "oEvaluationsRequest\0326.api.v1alpha1.score" +
      "cards.StreamAutoEvaluationsResponse\"N\272\270\221" +
      "\002\005\n\003\010\302\014\202\323\344\223\002>\"9/api/v1alpha1/scorecards/" +
      "scorecards/streamautoevaluations:\001*0\001\022\322\001" +
      "\n\024DeleteAutoEvaluation\0224.api.v1alpha1.sc" +
      "orecards.DeleteAutoEvaluationRequest\0325.a" +
      "pi.v1alpha1.scorecards.DeleteAutoEvaluat" +
      "ionResponse\"M\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002=\"8/api/v1al" +
      "pha1/scorecards/scorecards/deleteautoeva" +
      "luation:\001*\022\332\001\n\026PreviewEvaluationScore\0226." +
      "api.v1alpha1.scorecards.PreviewEvaluatio" +
      "nScoreRequest\0327.api.v1alpha1.scorecards." +
      "PreviewEvaluationScoreResponse\"O\272\270\221\002\005\n\003\010" +
      "\302\014\202\323\344\223\002?\":/api/v1alpha1/scorecards/score" +
      "cards/previewevaluationscore:\001*\022\306\001\n\021Rest" +
      "oreEvaluation\0221.api.v1alpha1.scorecards." +
      "RestoreEvaluationRequest\0322.api.v1alpha1." +
      "scorecards.RestoreEvaluationResponse\"J\272\270" +
      "\221\002\005\n\003\010\302\014\202\323\344\223\002:\"5/api/v1alpha1/scorecards" +
      "/scorecards/restoreevaluation:\001*\022\316\001\n\023Cre" +
      "ateSmartQuestion\0223.api.v1alpha1.scorecar" +
      "ds.CreateSmartQuestionRequest\0324.api.v1al" +
      "pha1.scorecards.CreateSmartQuestionRespo" +
      "nse\"L\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002<\"7/api/v1alpha1/sco" +
      "recards/scorecards/createsmartquestion:\001" +
      "*\022\316\001\n\023UpdateSmartQuestion\0223.api.v1alpha1" +
      ".scorecards.UpdateSmartQuestionRequest\0324" +
      ".api.v1alpha1.scorecards.UpdateSmartQues" +
      "tionResponse\"L\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002<\"7/api/v1a" +
      "lpha1/scorecards/scorecards/updatesmartq" +
      "uestion:\001*\022\316\001\n\023DeleteSmartQuestion\0223.api" +
      ".v1alpha1.scorecards.DeleteSmartQuestion" +
      "Request\0324.api.v1alpha1.scorecards.Delete" +
      "SmartQuestionResponse\"L\272\270\221\002\005\n\003\010\301\014\202\323\344\223\002<\"" +
      "7/api/v1alpha1/scorecards/scorecards/del" +
      "etesmartquestion:\001*\022\322\001\n\024ListSmartEvaluat" +
      "ions\0224.api.v1alpha1.scorecards.ListSmart" +
      "EvaluationsRequest\0325.api.v1alpha1.scorec" +
      "ards.ListSmartEvaluationsResponse\"M\272\270\221\002\005" +
      "\n\003\010\302\014\202\323\344\223\002=\"8/api/v1alpha1/scorecards/sc" +
      "orecards/listsmartevaluations:\001*\022\326\001\n\025Del" +
      "eteSmartEvaluation\0225.api.v1alpha1.scorec" +
      "ards.DeleteSmartEvaluationRequest\0326.api." +
      "v1alpha1.scorecards.DeleteSmartEvaluatio" +
      "nResponse\"N\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002>\"9/api/v1alph" +
      "a1/scorecards/scorecards/deletesmarteval" +
      "uation:\001*\022\312\001\n\022GetSmartEvaluation\0222.api.v" +
      "1alpha1.scorecards.GetSmartEvaluationReq" +
      "uest\0323.api.v1alpha1.scorecards.GetSmartE" +
      "valuationResponse\"K\272\270\221\002\005\n\003\010\302\014\202\323\344\223\002;\"6/ap" +
      "i/v1alpha1/scorecards/scorecards/getsmar" +
      "tevaluation:\001*B\267\001\n)com.tcn.cloud.api.api" +
      ".v1alpha1.scorecardsB\014ServiceProtoP\001\242\002\003A" +
      "VS\252\002\027Api.V1alpha1.Scorecards\312\002\027Api\\V1alp" +
      "ha1\\Scorecards\342\002#Api\\V1alpha1\\Scorecards" +
      "\\GPBMetadata\352\002\031Api::V1alpha1::Scorecards" +
      "b\006proto3"
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
          com.tcn.cloud.api.api.v1alpha1.scorecards.SmartEvaluationProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.scorecards.SmartQuestionProto.getDescriptor(),
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
    com.tcn.cloud.api.api.v1alpha1.scorecards.SmartEvaluationProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.scorecards.SmartQuestionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
