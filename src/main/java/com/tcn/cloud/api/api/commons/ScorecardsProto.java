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
      "obuf.TimestampR\002lt\"\331\002\n\010Category\022\037\n\013categ" +
      "ory_id\030\001 \001(\003R\ncategoryId\022\033\n\tauthor_id\030\003 " +
      "\001(\tR\010authorId\022\024\n\005title\030\004 \001(\tR\005title\022 \n\013d" +
      "escription\030\005 \001(\tR\013description\022%\n\016skill_p" +
      "rofiles\030\006 \003(\003R\rskillProfiles\022\030\n\007version\030" +
      "\007 \001(\005R\007version\0229\n\ncall_types\030\n \003(\0162\032.api" +
      ".commons.CallType.EnumR\tcallTypes\022\033\n\tis_" +
      "system\030\013 \001(\010R\010isSystem\022>\n\rcategory_type\030" +
      "\014 \001(\0162\031.api.commons.CategoryTypeR\014catego" +
      "ryType\"\200\005\n\nEvaluation\022#\n\revaluation_id\030\002" +
      " \001(\003R\014evaluationId\022!\n\014scorecard_id\030\003 \001(\003" +
      "R\013scorecardId\022\033\n\tscorer_id\030\004 \001(\tR\010scorer" +
      "Id\022\031\n\010call_sid\030\006 \001(\003R\007callSid\022\024\n\005score\030\007" +
      " \001(\001R\005score\022G\n\020evaluation_state\030\010 \001(\0162\034." +
      "api.commons.EvaluationStateR\017evaluationS" +
      "tate\022O\n\023evaluation_sections\030\t \003(\0132\036.api." +
      "commons.EvaluationSectionR\022evaluationSec" +
      "tions\022=\n\014completed_at\030\n \001(\0132\032.google.pro" +
      "tobuf.TimestampR\013completedAt\022\"\n\ragent_us" +
      "er_id\030\r \001(\tR\013agentUserId\0227\n\tcall_type\030\016 " +
      "\001(\0162\032.api.commons.CallType.EnumR\010callTyp" +
      "e\022%\n\016transcript_sid\030\017 \001(\003R\rtranscriptSid" +
      "\022H\n\rcustom_fields\030\021 \003(\0132#.api.commons.Ev" +
      "aluation.CustomFieldR\014customFields\0325\n\013Cu" +
      "stomField\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005field\030\002 \001" +
      "(\tR\005field\"\226\004\n\021EvaluationSection\0222\n\025evalu" +
      "ation_section_id\030\002 \001(\003R\023evaluationSectio" +
      "nId\022#\n\revaluation_id\030\003 \001(\003R\014evaluationId" +
      "\022\035\n\nsection_id\030\004 \001(\003R\tsectionId\022\026\n\006point" +
      "s\030\005 \001(\005R\006points\022\'\n\017possible_points\030\006 \001(\005" +
      "R\016possiblePoints\022\035\n\nsort_order\030\007 \001(\005R\tso" +
      "rtOrder\0229\n\ndeleted_at\030\010 \001(\0132\032.google.pro" +
      "tobuf.TimestampR\tdeletedAt\0229\n\ncreated_at" +
      "\030\t \001(\0132\032.google.protobuf.TimestampR\tcrea" +
      "tedAt\022R\n\024evaluation_questions\030\n \003(\0132\037.ap" +
      "i.commons.EvaluationQuestionR\023evaluation" +
      "Questions\022_\n\031auto_evaluation_questions\030\013" +
      " \003(\0132#.api.commons.AutoEvaluationQuestio" +
      "nR\027autoEvaluationQuestions\"\216\004\n\022Evaluatio" +
      "nQuestion\0224\n\026evaluation_question_id\030\002 \001(" +
      "\003R\024evaluationQuestionId\022#\n\revaluation_id" +
      "\030\003 \001(\003R\014evaluationId\0222\n\025scorecard_questi" +
      "on_id\030\004 \001(\003R\023scorecardQuestionId\022\030\n\007skip" +
      "ped\030\005 \001(\010R\007skipped\022\026\n\006points\030\006 \001(\003R\006poin" +
      "ts\022@\n\007answers\030\007 \003(\0132&.api.commons.Evalua" +
      "tionQuestion.AnswerR\007answers\0222\n\025evaluati" +
      "on_section_id\030\010 \001(\003R\023evaluationSectionId" +
      "\022\030\n\007comment\030\t \001(\tR\007comment\022\035\n\nsort_order" +
      "\030\n \001(\005R\tsortOrder\032\207\001\n\006Answer\022#\n\ranswer_o" +
      "ption\030\001 \001(\tR\014answerOption\022\030\n\006points\030\002 \001(" +
      "\rH\000R\006points\0224\n\tfail_type\030\003 \001(\0162\025.api.com" +
      "mons.FailTypeH\000R\010failTypeB\010\n\006result\"\276\004\n\016" +
      "AutoEvaluation\022,\n\022auto_evaluation_id\030\002 \001" +
      "(\003R\020autoEvaluationId\022!\n\014scorecard_id\030\003 \001" +
      "(\003R\013scorecardId\022\031\n\010call_sid\030\004 \001(\003R\007callS" +
      "id\022\"\n\ragent_user_id\030\005 \001(\tR\013agentUserId\022\\" +
      "\n\030auto_evaluation_sections\030\006 \003(\0132\".api.c" +
      "ommons.AutoEvaluationSectionR\026autoEvalua" +
      "tionSections\022=\n\014completed_at\030\007 \001(\0132\032.goo" +
      "gle.protobuf.TimestampR\013completedAt\0229\n\nd" +
      "eleted_at\030\010 \001(\0132\032.google.protobuf.Timest" +
      "ampR\tdeletedAt\0227\n\tcall_type\030\t \001(\0162\032.api." +
      "commons.CallType.EnumR\010callType\022%\n\016trans" +
      "cript_sid\030\n \001(\003R\rtranscriptSid\022-\n\022expres" +
      "sion_matched\030\013 \001(\010R\021expressionMatched\0225\n" +
      "\nrisk_level\030\014 \001(\0162\026.api.commons.RiskLeve" +
      "lR\triskLevel\"\243\003\n\026AutoEvaluationQuestion\022" +
      "=\n\033auto_evaluation_question_id\030\002 \001(\003R\030au" +
      "toEvaluationQuestionId\022,\n\022auto_evaluatio" +
      "n_id\030\003 \001(\003R\020autoEvaluationId\022;\n\032auto_eva" +
      "luation_section_id\030\004 \001(\003R\027autoEvaluation" +
      "SectionId\022(\n\020auto_question_id\030\005 \001(\003R\016aut" +
      "oQuestionId\022\030\n\007flagged\030\006 \003(\003R\007flagged\022\026\n" +
      "\006passed\030\007 \001(\010R\006passed\022\035\n\nsort_order\030\010 \001(" +
      "\005R\tsortOrder\0225\n\nrisk_level\030\013 \001(\0162\026.api.c" +
      "ommons.RiskLevelR\triskLevel\022-\n\022expressio" +
      "n_matched\030\016 \001(\010R\021expressionMatched\"\316\003\n\025A" +
      "utoEvaluationSection\022;\n\032auto_evaluation_" +
      "section_id\030\002 \001(\003R\027autoEvaluationSectionI" +
      "d\022,\n\022auto_evaluation_id\030\003 \001(\003R\020autoEvalu" +
      "ationId\022\035\n\nsection_id\030\004 \001(\003R\tsectionId\022\035" +
      "\n\nsort_order\030\005 \001(\005R\tsortOrder\0229\n\ndeleted" +
      "_at\030\006 \001(\0132\032.google.protobuf.TimestampR\td" +
      "eletedAt\0229\n\ncreated_at\030\007 \001(\0132\032.google.pr" +
      "otobuf.TimestampR\tcreatedAt\022_\n\031auto_eval" +
      "uation_questions\030\010 \003(\0132#.api.commons.Aut" +
      "oEvaluationQuestionR\027autoEvaluationQuest" +
      "ions\0225\n\nrisk_level\030\t \001(\0162\026.api.commons.R" +
      "iskLevelR\triskLevel\"\275\001\n\010Question\022\037\n\013ques" +
      "tion_id\030\002 \001(\003R\nquestionId\022\033\n\tauthor_id\030\003" +
      " \001(\tR\010authorId\022\032\n\010question\030\004 \001(\tR\010questi" +
      "on\022 \n\013description\030\005 \001(\tR\013description\0225\n\n" +
      "categories\030\006 \003(\0132\025.api.commons.CategoryR" +
      "\ncategories\"\210\005\n\021ScorecardQuestion\0222\n\025sco" +
      "recard_question_id\030\002 \001(\003R\023scorecardQuest" +
      "ionId\022\032\n\010question\030\003 \001(\tR\010question\022 \n\013des" +
      "cription\030\004 \001(\tR\013description\022\037\n\013question_" +
      "id\030\005 \001(\003R\nquestionId\022\035\n\nallow_skip\030\006 \001(\010" +
      "R\tallowSkip\022?\n\007answers\030\007 \003(\0132%.api.commo" +
      "ns.ScorecardQuestion.AnswerR\007answers\022M\n\014" +
      "multi_select\030\010 \001(\0132*.api.commons.Scoreca" +
      "rdQuestion.MultiSelectR\013multiSelect\022!\n\014s" +
      "corecard_id\030\t \001(\003R\013scorecardId\022\035\n\nsectio" +
      "n_id\030\n \001(\003R\tsectionId\022\030\n\007version\030\013 \001(\005R\007" +
      "version\022\035\n\nsort_order\030\014 \001(\005R\tsortOrder\032\207" +
      "\001\n\006Answer\022#\n\ranswer_option\030\001 \001(\tR\014answer" +
      "Option\022\030\n\006points\030\002 \001(\rH\000R\006points\0224\n\tfail" +
      "_type\030\003 \001(\0162\025.api.commons.FailTypeH\000R\010fa" +
      "ilTypeB\010\n\006result\032,\n\013MultiSelect\022\035\n\nmax_p" +
      "oints\030\001 \001(\003R\tmaxPoints\"\324\002\n\007Section\022\035\n\nse" +
      "ction_id\030\002 \001(\003R\tsectionId\022!\n\014scorecard_i" +
      "d\030\003 \001(\003R\013scorecardId\022\024\n\005title\030\004 \001(\tR\005tit" +
      "le\022 \n\013description\030\005 \001(\tR\013description\022\026\n\006" +
      "weight\030\006 \001(\rR\006weight\022<\n\tquestions\030\007 \003(\0132" +
      "\036.api.commons.ScorecardQuestionR\tquestio" +
      "ns\022\030\n\007version\030\010 \001(\005R\007version\022\035\n\nsort_ord" +
      "er\030\t \001(\005R\tsortOrder\022@\n\016auto_questions\030\013 " +
      "\003(\0132\031.api.commons.AutoQuestionR\rautoQues" +
      "tions\"\256\005\n\tScorecard\022!\n\014scorecard_id\030\002 \001(" +
      "\003R\013scorecardId\022\033\n\tauthor_id\030\003 \001(\tR\010autho" +
      "rId\022\024\n\005title\030\004 \001(\tR\005title\022 \n\013description" +
      "\030\005 \001(\tR\013description\022\035\n\npass_score\030\006 \001(\001R" +
      "\tpassScore\0225\n\nscore_type\030\007 \001(\0162\026.api.com" +
      "mons.ScoreTypeR\tscoreType\022D\n\017evaluation_" +
      "type\030\010 \001(\0162\033.api.commons.EvaluationTypeR" +
      "\016evaluationType\022%\n\016allow_feedback\030\n \001(\010R" +
      "\rallowFeedback\022-\n\022distribute_weights\030\013 \001" +
      "(\010R\021distributeWeights\0221\n\010category\030\014 \001(\0132" +
      "\025.api.commons.CategoryR\010category\0220\n\010sect" +
      "ions\030\r \003(\0132\024.api.commons.SectionR\010sectio" +
      "ns\022\030\n\007version\030\016 \001(\005R\007version\0221\n\005state\030\017 " +
      "\001(\0162\033.api.commons.ScorecardStateR\005state\022" +
      "\036\n\tis_ad_hoc\030\020 \001(\010B\002\030\001R\007isAdHoc\022*\n\021custo" +
      "m_field_keys\030\023 \003(\tR\017customFieldKeys\0229\n\nc" +
      "all_types\030\024 \003(\0162\032.api.commons.CallType.E" +
      "numR\tcallTypes\"\255\005\n\014AutoQuestion\022(\n\020auto_" +
      "question_id\030\002 \001(\003R\016autoQuestionId\022\031\n\010fla" +
      "g_sid\030\003 \001(\003R\007flagSid\022!\n\014scorecard_id\030\005 \001" +
      "(\003R\013scorecardId\022&\n\017auto_section_id\030\006 \001(\003" +
      "R\rautoSectionId\022\035\n\nsort_order\030\007 \001(\005R\tsor" +
      "tOrder\022K\n\017flag_expression\030\n \001(\0132\".api.co" +
      "mmons.AutoQuestion.FlagExprR\016flagExpress" +
      "ion\022\032\n\010question\030\013 \001(\tR\010question\022 \n\013descr" +
      "iption\030\014 \001(\tR\013description\022\037\n\013question_id" +
      "\030\r \001(\003R\nquestionId\0225\n\nrisk_level\030\016 \001(\0162\026" +
      ".api.commons.RiskLevelR\triskLevel\032\212\002\n\010Fl" +
      "agExpr\0224\n\003and\030\001 \003(\0132\".api.commons.AutoQu" +
      "estion.FlagExprR\003and\0222\n\002or\030\002 \003(\0132\".api.c" +
      "ommons.AutoQuestion.FlagExprR\002or\022;\n\004flag" +
      "\030\003 \001(\0132\'.api.commons.AutoQuestion.FlagEx" +
      "pr.FlagR\004flag\0224\n\003not\030\004 \001(\0132\".api.commons" +
      ".AutoQuestion.FlagExprR\003not\032!\n\004Flag\022\031\n\010f" +
      "lag_sid\030\001 \001(\003R\007flagSid*=\n\014CategoryType\022\013" +
      "\n\007INVALID\020\000\022\017\n\013SKILL_CALLS\020\001\022\017\n\013MANUAL_D" +
      "IAL\020\002*8\n\016EvaluationType\022\023\n\017EVALUATE_MANU" +
      "AL\020\000\022\021\n\rEVALUATE_AUTO\020\001*V\n\tScoreType\022\024\n\020" +
      "SCORE_SIMPLE_SUM\020\000\022\026\n\022SCORE_WEIGHTED_SUM" +
      "\020\001\022\033\n\027SCORE_EVEN_WEIGHTED_SUM\020\002*C\n\010FailT" +
      "ype\022\021\n\rFAIL_QUESTION\020\000\022\020\n\014FAIL_SECTION\020\001" +
      "\022\022\n\016FAIL_SCORECARD\020\002*\267\001\n\016ScorecardState\022" +
      "\026\n\022SCORECARD_IS_DRAFT\020\000\022\026\n\022SCORECARD_IS_" +
      "READY\020\001\022\027\n\023SCORECARD_IS_IN_USE\020\002\022\031\n\025SCOR" +
      "ECARD_IS_TEMPLATE\020\003\022\037\n\033SCORECARD_IS_READ" +
      "Y_DISABLED\020\004\022 \n\034SCORECARD_IS_IN_USE_DISA" +
      "BLED\020\005*[\n\017EvaluationState\022\032\n\026EVALUATION_" +
      "IN_PROGRESS\020\000\022\025\n\021EVALUATION_PASSED\020\001\022\025\n\021" +
      "EVALUATION_FAILED\020\002*`\n\tRiskLevel\022\023\n\017RISK" +
      "_LEVEL_NONE\020\000\022\022\n\016RISK_LEVEL_LOW\020\001\022\025\n\021RIS" +
      "K_LEVEL_MEDIUM\020\002\022\023\n\017RISK_LEVEL_HIGH\020\003B}\n" +
      "\035com.tcn.cloud.api.api.commonsB\017Scorecar" +
      "dsProtoP\001\242\002\003ACX\252\002\013Api.Commons\312\002\013Api\\Comm" +
      "ons\342\002\027Api\\Commons\\GPBMetadata\352\002\014Api::Com" +
      "monsb\006proto3"
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
        new java.lang.String[] { "EvaluationId", "ScorecardId", "ScorerId", "CallSid", "Score", "EvaluationState", "EvaluationSections", "CompletedAt", "AgentUserId", "CallType", "TranscriptSid", "CustomFields", });
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
        new java.lang.String[] { "EvaluationSectionId", "EvaluationId", "SectionId", "Points", "PossiblePoints", "SortOrder", "DeletedAt", "CreatedAt", "EvaluationQuestions", "AutoEvaluationQuestions", });
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
        new java.lang.String[] { "AutoEvaluationId", "ScorecardId", "CallSid", "AgentUserId", "AutoEvaluationSections", "CompletedAt", "DeletedAt", "CallType", "TranscriptSid", "ExpressionMatched", "RiskLevel", });
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
        new java.lang.String[] { "ScorecardId", "AuthorId", "Title", "Description", "PassScore", "ScoreType", "EvaluationType", "AllowFeedback", "DistributeWeights", "Category", "Sections", "Version", "State", "IsAdHoc", "CustomFieldKeys", "CallTypes", });
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
