// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

public final class ScorecardsProto {
  private ScorecardsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_TimeFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_TimeFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Category_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Category_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Evaluation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Evaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Evaluation_CustomField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Evaluation_CustomField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_EvaluationSection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_EvaluationSection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_EvaluationQuestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_EvaluationQuestion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_EvaluationQuestion_Answer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_EvaluationQuestion_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoEvaluation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoEvaluation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoEvaluation_ScorecardInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoEvaluation_ScorecardInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoEvaluation_CategoryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoEvaluation_CategoryInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoEvaluationQuestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoEvaluationQuestion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoEvaluationSection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoEvaluationSection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Question_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Question_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ScorecardQuestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ScorecardQuestion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ScorecardQuestion_Answer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ScorecardQuestion_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_ScorecardQuestion_MultiSelect_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_ScorecardQuestion_MultiSelect_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Section_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Section_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_Scorecard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_Scorecard_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoQuestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoQuestion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoQuestion_FlagExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoQuestion_FlagExpr_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_AutoQuestion_FlagExpr_Flag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_AutoQuestion_FlagExpr_Flag_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034api/commons/scorecards.proto\022\013api.comm" +
      "ons\032\025api/commons/acd.proto\032\037google/proto" +
      "buf/timestamp.proto\"\354\001\n\nTimeFilter\022*\n\002eq" +
      "\030\001 \001(\0132\032.google.protobuf.TimestampR\002eq\022," +
      "\n\003gte\030\002 \001(\0132\032.google.protobuf.TimestampR" +
      "\003gte\022,\n\003lte\030\003 \001(\0132\032.google.protobuf.Time" +
      "stampR\003lte\022*\n\002gt\030\004 \001(\0132\032.google.protobuf" +
      ".TimestampR\002gt\022*\n\002lt\030\005 \001(\0132\032.google.prot" +
      "obuf.TimestampR\002lt\"\335\002\n\010Category\022\037\n\013categ" +
      "ory_id\030\001 \001(\003R\ncategoryId\022\033\n\tauthor_id\030\003 " +
      "\001(\tR\010authorId\022\024\n\005title\030\004 \001(\tR\005title\022 \n\013d" +
      "escription\030\005 \001(\tR\013description\022%\n\016skill_p" +
      "rofiles\030\006 \003(\003R\rskillProfiles\022\030\n\007version\030" +
      "\007 \001(\005R\007version\022=\n\ncall_types\030\n \003(\0162\032.api" +
      ".commons.CallType.EnumB\002\030\001R\tcallTypes\022\033\n" +
      "\tis_system\030\013 \001(\010R\010isSystem\022>\n\rcategory_t" +
      "ype\030\014 \001(\0162\031.api.commons.CategoryTypeR\014ca" +
      "tegoryType\"\201\006\n\nEvaluation\022#\n\revaluation_" +
      "id\030\002 \001(\003R\014evaluationId\022!\n\014scorecard_id\030\003" +
      " \001(\003R\013scorecardId\022\033\n\tscorer_id\030\004 \001(\tR\010sc" +
      "orerId\022\031\n\010call_sid\030\006 \001(\003R\007callSid\022\024\n\005sco" +
      "re\030\007 \001(\001R\005score\022G\n\020evaluation_state\030\010 \001(" +
      "\0162\034.api.commons.EvaluationStateR\017evaluat" +
      "ionState\022O\n\023evaluation_sections\030\t \003(\0132\036." +
      "api.commons.EvaluationSectionR\022evaluatio" +
      "nSections\022=\n\014completed_at\030\n \001(\0132\032.google" +
      ".protobuf.TimestampR\013completedAt\0229\n\ndele" +
      "ted_at\030\014 \001(\0132\032.google.protobuf.Timestamp" +
      "R\tdeletedAt\022\"\n\ragent_user_id\030\r \001(\tR\013agen" +
      "tUserId\0227\n\tcall_type\030\016 \001(\0162\032.api.commons" +
      ".CallType.EnumR\010callType\022%\n\016transcript_s" +
      "id\030\017 \001(\003R\rtranscriptSid\022H\n\rcustom_fields" +
      "\030\021 \003(\0132#.api.commons.Evaluation.CustomFi" +
      "eldR\014customFields\022\035\n\ndeleted_by\030\022 \001(\tR\td" +
      "eletedBy\022%\n\016is_recoverable\030\024 \001(\010R\risReco" +
      "verable\0325\n\013CustomField\022\020\n\003key\030\001 \001(\tR\003key" +
      "\022\024\n\005field\030\002 \001(\tR\005field\"\260\004\n\021EvaluationSec" +
      "tion\0222\n\025evaluation_section_id\030\002 \001(\003R\023eva" +
      "luationSectionId\022#\n\revaluation_id\030\003 \001(\003R" +
      "\014evaluationId\022\035\n\nsection_id\030\004 \001(\003R\tsecti" +
      "onId\022\026\n\006points\030\005 \001(\005R\006points\022\'\n\017possible" +
      "_points\030\006 \001(\005R\016possiblePoints\022\035\n\nsort_or" +
      "der\030\007 \001(\005R\tsortOrder\0229\n\ndeleted_at\030\010 \001(\013" +
      "2\032.google.protobuf.TimestampR\tdeletedAt\022" +
      "9\n\ncreated_at\030\t \001(\0132\032.google.protobuf.Ti" +
      "mestampR\tcreatedAt\022R\n\024evaluation_questio" +
      "ns\030\n \003(\0132\037.api.commons.EvaluationQuestio" +
      "nR\023evaluationQuestions\022_\n\031auto_evaluatio" +
      "n_questions\030\013 \003(\0132#.api.commons.AutoEval" +
      "uationQuestionR\027autoEvaluationQuestions\022" +
      "\030\n\007skipped\030\014 \001(\010R\007skipped\"\216\004\n\022Evaluation" +
      "Question\0224\n\026evaluation_question_id\030\002 \001(\003" +
      "R\024evaluationQuestionId\022#\n\revaluation_id\030" +
      "\003 \001(\003R\014evaluationId\0222\n\025scorecard_questio" +
      "n_id\030\004 \001(\003R\023scorecardQuestionId\022\030\n\007skipp" +
      "ed\030\005 \001(\010R\007skipped\022\026\n\006points\030\006 \001(\003R\006point" +
      "s\022@\n\007answers\030\007 \003(\0132&.api.commons.Evaluat" +
      "ionQuestion.AnswerR\007answers\0222\n\025evaluatio" +
      "n_section_id\030\010 \001(\003R\023evaluationSectionId\022" +
      "\030\n\007comment\030\t \001(\tR\007comment\022\035\n\nsort_order\030" +
      "\n \001(\005R\tsortOrder\032\207\001\n\006Answer\022#\n\ranswer_op" +
      "tion\030\001 \001(\tR\014answerOption\022\030\n\006points\030\002 \001(\r" +
      "H\000R\006points\0224\n\tfail_type\030\003 \001(\0162\025.api.comm" +
      "ons.FailTypeH\000R\010failTypeB\010\n\006result\"\315\006\n\016A" +
      "utoEvaluation\022,\n\022auto_evaluation_id\030\002 \001(" +
      "\003R\020autoEvaluationId\022!\n\014scorecard_id\030\003 \001(" +
      "\003R\013scorecardId\022\031\n\010call_sid\030\004 \001(\003R\007callSi" +
      "d\022\"\n\ragent_user_id\030\005 \001(\tR\013agentUserId\022\\\n" +
      "\030auto_evaluation_sections\030\006 \003(\0132\".api.co" +
      "mmons.AutoEvaluationSectionR\026autoEvaluat" +
      "ionSections\022=\n\014completed_at\030\007 \001(\0132\032.goog" +
      "le.protobuf.TimestampR\013completedAt\0229\n\nde" +
      "leted_at\030\010 \001(\0132\032.google.protobuf.Timesta" +
      "mpR\tdeletedAt\0227\n\tcall_type\030\t \001(\0162\032.api.c" +
      "ommons.CallType.EnumR\010callType\022%\n\016transc" +
      "ript_sid\030\n \001(\003R\rtranscriptSid\022-\n\022express" +
      "ion_matched\030\013 \001(\010R\021expressionMatched\0225\n\n" +
      "risk_level\030\014 \001(\0162\026.api.commons.RiskLevel" +
      "R\triskLevel\022\037\n\013call_length\030\020 \001(\005R\ncallLe" +
      "ngth\022P\n\016scorecard_info\030\021 \001(\0132).api.commo" +
      "ns.AutoEvaluation.ScorecardInfoR\rscoreca" +
      "rdInfo\022M\n\rcategory_info\030\022 \001(\0132(.api.comm" +
      "ons.AutoEvaluation.CategoryInfoR\014categor" +
      "yInfo\032%\n\rScorecardInfo\022\024\n\005title\030\001 \001(\tR\005t" +
      "itle\032$\n\014CategoryInfo\022\024\n\005title\030\001 \001(\tR\005tit" +
      "le\"\243\003\n\026AutoEvaluationQuestion\022=\n\033auto_ev" +
      "aluation_question_id\030\002 \001(\003R\030autoEvaluati" +
      "onQuestionId\022,\n\022auto_evaluation_id\030\003 \001(\003" +
      "R\020autoEvaluationId\022;\n\032auto_evaluation_se" +
      "ction_id\030\004 \001(\003R\027autoEvaluationSectionId\022" +
      "(\n\020auto_question_id\030\005 \001(\003R\016autoQuestionI" +
      "d\022\030\n\007flagged\030\006 \003(\003R\007flagged\022\026\n\006passed\030\007 " +
      "\001(\010R\006passed\022\035\n\nsort_order\030\010 \001(\005R\tsortOrd" +
      "er\0225\n\nrisk_level\030\013 \001(\0162\026.api.commons.Ris" +
      "kLevelR\triskLevel\022-\n\022expression_matched\030" +
      "\016 \001(\010R\021expressionMatched\"\316\003\n\025AutoEvaluat" +
      "ionSection\022;\n\032auto_evaluation_section_id" +
      "\030\002 \001(\003R\027autoEvaluationSectionId\022,\n\022auto_" +
      "evaluation_id\030\003 \001(\003R\020autoEvaluationId\022\035\n" +
      "\nsection_id\030\004 \001(\003R\tsectionId\022\035\n\nsort_ord" +
      "er\030\005 \001(\005R\tsortOrder\0229\n\ndeleted_at\030\006 \001(\0132" +
      "\032.google.protobuf.TimestampR\tdeletedAt\0229" +
      "\n\ncreated_at\030\007 \001(\0132\032.google.protobuf.Tim" +
      "estampR\tcreatedAt\022_\n\031auto_evaluation_que" +
      "stions\030\010 \003(\0132#.api.commons.AutoEvaluatio" +
      "nQuestionR\027autoEvaluationQuestions\0225\n\nri" +
      "sk_level\030\t \001(\0162\026.api.commons.RiskLevelR\t" +
      "riskLevel\"\275\001\n\010Question\022\037\n\013question_id\030\002 " +
      "\001(\003R\nquestionId\022\033\n\tauthor_id\030\003 \001(\tR\010auth" +
      "orId\022\032\n\010question\030\004 \001(\tR\010question\022 \n\013desc" +
      "ription\030\005 \001(\tR\013description\0225\n\ncategories" +
      "\030\006 \003(\0132\025.api.commons.CategoryR\ncategorie" +
      "s\"\210\005\n\021ScorecardQuestion\0222\n\025scorecard_que" +
      "stion_id\030\002 \001(\003R\023scorecardQuestionId\022\032\n\010q" +
      "uestion\030\003 \001(\tR\010question\022 \n\013description\030\004" +
      " \001(\tR\013description\022\037\n\013question_id\030\005 \001(\003R\n" +
      "questionId\022\035\n\nallow_skip\030\006 \001(\010R\tallowSki" +
      "p\022?\n\007answers\030\007 \003(\0132%.api.commons.Scoreca" +
      "rdQuestion.AnswerR\007answers\022M\n\014multi_sele" +
      "ct\030\010 \001(\0132*.api.commons.ScorecardQuestion" +
      ".MultiSelectR\013multiSelect\022!\n\014scorecard_i" +
      "d\030\t \001(\003R\013scorecardId\022\035\n\nsection_id\030\n \001(\003" +
      "R\tsectionId\022\030\n\007version\030\013 \001(\005R\007version\022\035\n" +
      "\nsort_order\030\014 \001(\005R\tsortOrder\032\207\001\n\006Answer\022" +
      "#\n\ranswer_option\030\001 \001(\tR\014answerOption\022\030\n\006" +
      "points\030\002 \001(\rH\000R\006points\0224\n\tfail_type\030\003 \001(" +
      "\0162\025.api.commons.FailTypeH\000R\010failTypeB\010\n\006" +
      "result\032,\n\013MultiSelect\022\035\n\nmax_points\030\001 \001(" +
      "\003R\tmaxPoints\"\324\002\n\007Section\022\035\n\nsection_id\030\002" +
      " \001(\003R\tsectionId\022!\n\014scorecard_id\030\003 \001(\003R\013s" +
      "corecardId\022\024\n\005title\030\004 \001(\tR\005title\022 \n\013desc" +
      "ription\030\005 \001(\tR\013description\022\026\n\006weight\030\006 \001" +
      "(\rR\006weight\022<\n\tquestions\030\007 \003(\0132\036.api.comm" +
      "ons.ScorecardQuestionR\tquestions\022\030\n\007vers" +
      "ion\030\010 \001(\005R\007version\022\035\n\nsort_order\030\t \001(\005R\t" +
      "sortOrder\022@\n\016auto_questions\030\013 \003(\0132\031.api." +
      "commons.AutoQuestionR\rautoQuestions\"\351\005\n\t" +
      "Scorecard\022!\n\014scorecard_id\030\002 \001(\003R\013scoreca" +
      "rdId\022\033\n\tauthor_id\030\003 \001(\tR\010authorId\022\024\n\005tit" +
      "le\030\004 \001(\tR\005title\022 \n\013description\030\005 \001(\tR\013de" +
      "scription\022\035\n\npass_score\030\006 \001(\001R\tpassScore" +
      "\0225\n\nscore_type\030\007 \001(\0162\026.api.commons.Score" +
      "TypeR\tscoreType\022D\n\017evaluation_type\030\010 \001(\016" +
      "2\033.api.commons.EvaluationTypeR\016evaluatio" +
      "nType\022%\n\016allow_feedback\030\n \001(\010R\rallowFeed" +
      "back\022-\n\022distribute_weights\030\013 \001(\010R\021distri" +
      "buteWeights\0221\n\010category\030\014 \001(\0132\025.api.comm" +
      "ons.CategoryR\010category\0220\n\010sections\030\r \003(\013" +
      "2\024.api.commons.SectionR\010sections\022\030\n\007vers" +
      "ion\030\016 \001(\005R\007version\0221\n\005state\030\017 \001(\0162\033.api." +
      "commons.ScorecardStateR\005state\022\036\n\tis_ad_h" +
      "oc\030\020 \001(\010B\002\030\001R\007isAdHoc\022*\n\021custom_field_ke" +
      "ys\030\023 \003(\tR\017customFieldKeys\0229\n\ncall_types\030" +
      "\024 \003(\0162\032.api.commons.CallType.EnumR\tcallT" +
      "ypes\0229\n\nupdated_at\030\025 \001(\0132\032.google.protob" +
      "uf.TimestampR\tupdatedAt\"\255\005\n\014AutoQuestion" +
      "\022(\n\020auto_question_id\030\002 \001(\003R\016autoQuestion" +
      "Id\022\031\n\010flag_sid\030\003 \001(\003R\007flagSid\022!\n\014scoreca" +
      "rd_id\030\005 \001(\003R\013scorecardId\022&\n\017auto_section" +
      "_id\030\006 \001(\003R\rautoSectionId\022\035\n\nsort_order\030\007" +
      " \001(\005R\tsortOrder\022K\n\017flag_expression\030\n \001(\013" +
      "2\".api.commons.AutoQuestion.FlagExprR\016fl" +
      "agExpression\022\032\n\010question\030\013 \001(\tR\010question" +
      "\022 \n\013description\030\014 \001(\tR\013description\022\037\n\013qu" +
      "estion_id\030\r \001(\003R\nquestionId\0225\n\nrisk_leve" +
      "l\030\016 \001(\0162\026.api.commons.RiskLevelR\triskLev" +
      "el\032\212\002\n\010FlagExpr\0224\n\003and\030\001 \003(\0132\".api.commo" +
      "ns.AutoQuestion.FlagExprR\003and\0222\n\002or\030\002 \003(" +
      "\0132\".api.commons.AutoQuestion.FlagExprR\002o" +
      "r\022;\n\004flag\030\003 \001(\0132\'.api.commons.AutoQuesti" +
      "on.FlagExpr.FlagR\004flag\0224\n\003not\030\004 \001(\0132\".ap" +
      "i.commons.AutoQuestion.FlagExprR\003not\032!\n\004" +
      "Flag\022\031\n\010flag_sid\030\001 \001(\003R\007flagSid*=\n\014Categ" +
      "oryType\022\013\n\007INVALID\020\000\022\017\n\013SKILL_CALLS\020\001\022\017\n" +
      "\013MANUAL_DIAL\020\002*L\n\016EvaluationType\022\023\n\017EVAL" +
      "UATE_MANUAL\020\000\022\021\n\rEVALUATE_AUTO\020\001\022\022\n\016EVAL" +
      "UATE_SMART\020\002*V\n\tScoreType\022\024\n\020SCORE_SIMPL" +
      "E_SUM\020\000\022\026\n\022SCORE_WEIGHTED_SUM\020\001\022\033\n\027SCORE" +
      "_EVEN_WEIGHTED_SUM\020\002*C\n\010FailType\022\021\n\rFAIL" +
      "_QUESTION\020\000\022\020\n\014FAIL_SECTION\020\001\022\022\n\016FAIL_SC" +
      "ORECARD\020\002*\267\001\n\016ScorecardState\022\026\n\022SCORECAR" +
      "D_IS_DRAFT\020\000\022\026\n\022SCORECARD_IS_READY\020\001\022\027\n\023" +
      "SCORECARD_IS_IN_USE\020\002\022\031\n\025SCORECARD_IS_TE" +
      "MPLATE\020\003\022\037\n\033SCORECARD_IS_READY_DISABLED\020" +
      "\004\022 \n\034SCORECARD_IS_IN_USE_DISABLED\020\005*[\n\017E" +
      "valuationState\022\032\n\026EVALUATION_IN_PROGRESS" +
      "\020\000\022\025\n\021EVALUATION_PASSED\020\001\022\025\n\021EVALUATION_" +
      "FAILED\020\002*z\n\tRiskLevel\022\023\n\017RISK_LEVEL_NONE" +
      "\020\000\022\022\n\016RISK_LEVEL_LOW\020\001\022\025\n\021RISK_LEVEL_MED" +
      "IUM\020\002\022\023\n\017RISK_LEVEL_HIGH\020\003\022\030\n\024RISK_LEVEL" +
      "_RISK_FREE\020\004B}\n\035com.tcn.cloud.api.api.co" +
      "mmonsB\017ScorecardsProtoP\001\242\002\003ACX\252\002\013Api.Com" +
      "mons\312\002\013Api\\Commons\342\002\027Api\\Commons\\GPBMeta" +
      "data\352\002\014Api::Commonsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.api.commons.AcdProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_api_commons_TimeFilter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_TimeFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_TimeFilter_descriptor,
        new java.lang.String[] { "Eq", "Gte", "Lte", "Gt", "Lt", });
    internal_static_api_commons_Category_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_Category_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Category_descriptor,
        new java.lang.String[] { "CategoryId", "AuthorId", "Title", "Description", "SkillProfiles", "Version", "CallTypes", "IsSystem", "CategoryType", });
    internal_static_api_commons_Evaluation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_Evaluation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Evaluation_descriptor,
        new java.lang.String[] { "EvaluationId", "ScorecardId", "ScorerId", "CallSid", "Score", "EvaluationState", "EvaluationSections", "CompletedAt", "DeletedAt", "AgentUserId", "CallType", "TranscriptSid", "CustomFields", "DeletedBy", "IsRecoverable", });
    internal_static_api_commons_Evaluation_CustomField_descriptor =
      internal_static_api_commons_Evaluation_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_Evaluation_CustomField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Evaluation_CustomField_descriptor,
        new java.lang.String[] { "Key", "Field", });
    internal_static_api_commons_EvaluationSection_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_EvaluationSection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_EvaluationSection_descriptor,
        new java.lang.String[] { "EvaluationSectionId", "EvaluationId", "SectionId", "Points", "PossiblePoints", "SortOrder", "DeletedAt", "CreatedAt", "EvaluationQuestions", "AutoEvaluationQuestions", "Skipped", });
    internal_static_api_commons_EvaluationQuestion_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_EvaluationQuestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_EvaluationQuestion_descriptor,
        new java.lang.String[] { "EvaluationQuestionId", "EvaluationId", "ScorecardQuestionId", "Skipped", "Points", "Answers", "EvaluationSectionId", "Comment", "SortOrder", });
    internal_static_api_commons_EvaluationQuestion_Answer_descriptor =
      internal_static_api_commons_EvaluationQuestion_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_EvaluationQuestion_Answer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_EvaluationQuestion_Answer_descriptor,
        new java.lang.String[] { "AnswerOption", "Points", "FailType", "Result", });
    internal_static_api_commons_AutoEvaluation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_AutoEvaluation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoEvaluation_descriptor,
        new java.lang.String[] { "AutoEvaluationId", "ScorecardId", "CallSid", "AgentUserId", "AutoEvaluationSections", "CompletedAt", "DeletedAt", "CallType", "TranscriptSid", "ExpressionMatched", "RiskLevel", "CallLength", "ScorecardInfo", "CategoryInfo", });
    internal_static_api_commons_AutoEvaluation_ScorecardInfo_descriptor =
      internal_static_api_commons_AutoEvaluation_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_AutoEvaluation_ScorecardInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoEvaluation_ScorecardInfo_descriptor,
        new java.lang.String[] { "Title", });
    internal_static_api_commons_AutoEvaluation_CategoryInfo_descriptor =
      internal_static_api_commons_AutoEvaluation_descriptor.getNestedTypes().get(1);
    internal_static_api_commons_AutoEvaluation_CategoryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoEvaluation_CategoryInfo_descriptor,
        new java.lang.String[] { "Title", });
    internal_static_api_commons_AutoEvaluationQuestion_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_AutoEvaluationQuestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoEvaluationQuestion_descriptor,
        new java.lang.String[] { "AutoEvaluationQuestionId", "AutoEvaluationId", "AutoEvaluationSectionId", "AutoQuestionId", "Flagged", "Passed", "SortOrder", "RiskLevel", "ExpressionMatched", });
    internal_static_api_commons_AutoEvaluationSection_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_AutoEvaluationSection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoEvaluationSection_descriptor,
        new java.lang.String[] { "AutoEvaluationSectionId", "AutoEvaluationId", "SectionId", "SortOrder", "DeletedAt", "CreatedAt", "AutoEvaluationQuestions", "RiskLevel", });
    internal_static_api_commons_Question_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_api_commons_Question_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Question_descriptor,
        new java.lang.String[] { "QuestionId", "AuthorId", "Question", "Description", "Categories", });
    internal_static_api_commons_ScorecardQuestion_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_api_commons_ScorecardQuestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ScorecardQuestion_descriptor,
        new java.lang.String[] { "ScorecardQuestionId", "Question", "Description", "QuestionId", "AllowSkip", "Answers", "MultiSelect", "ScorecardId", "SectionId", "Version", "SortOrder", });
    internal_static_api_commons_ScorecardQuestion_Answer_descriptor =
      internal_static_api_commons_ScorecardQuestion_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_ScorecardQuestion_Answer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ScorecardQuestion_Answer_descriptor,
        new java.lang.String[] { "AnswerOption", "Points", "FailType", "Result", });
    internal_static_api_commons_ScorecardQuestion_MultiSelect_descriptor =
      internal_static_api_commons_ScorecardQuestion_descriptor.getNestedTypes().get(1);
    internal_static_api_commons_ScorecardQuestion_MultiSelect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_ScorecardQuestion_MultiSelect_descriptor,
        new java.lang.String[] { "MaxPoints", });
    internal_static_api_commons_Section_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_api_commons_Section_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Section_descriptor,
        new java.lang.String[] { "SectionId", "ScorecardId", "Title", "Description", "Weight", "Questions", "Version", "SortOrder", "AutoQuestions", });
    internal_static_api_commons_Scorecard_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_api_commons_Scorecard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_Scorecard_descriptor,
        new java.lang.String[] { "ScorecardId", "AuthorId", "Title", "Description", "PassScore", "ScoreType", "EvaluationType", "AllowFeedback", "DistributeWeights", "Category", "Sections", "Version", "State", "IsAdHoc", "CustomFieldKeys", "CallTypes", "UpdatedAt", });
    internal_static_api_commons_AutoQuestion_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_api_commons_AutoQuestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoQuestion_descriptor,
        new java.lang.String[] { "AutoQuestionId", "FlagSid", "ScorecardId", "AutoSectionId", "SortOrder", "FlagExpression", "Question", "Description", "QuestionId", "RiskLevel", });
    internal_static_api_commons_AutoQuestion_FlagExpr_descriptor =
      internal_static_api_commons_AutoQuestion_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_AutoQuestion_FlagExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoQuestion_FlagExpr_descriptor,
        new java.lang.String[] { "And", "Or", "Flag", "Not", });
    internal_static_api_commons_AutoQuestion_FlagExpr_Flag_descriptor =
      internal_static_api_commons_AutoQuestion_FlagExpr_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_AutoQuestion_FlagExpr_Flag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_AutoQuestion_FlagExpr_Flag_descriptor,
        new java.lang.String[] { "FlagSid", });
    com.tcn.cloud.api.api.commons.AcdProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
