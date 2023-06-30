// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/workflows/example.proto

package com.tcn.cloud.api.api.commons.workflows;

public final class ExampleProto {
  private ExampleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodePrint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodePrint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodeRandom_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodeRandom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodeConsoleInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodeConsoleInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodeStoreInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodeStoreInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodeComparator_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodeComparator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_NodeChatbot_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_NodeChatbot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_DiceDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_DiceDocument_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_DiceDocument_VariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_DiceDocument_VariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_api_commons_workflows_ChatbotDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_api_commons_workflows_ChatbotDocument_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#api/commons/workflows/example.proto\022\025a" +
      "pi.commons.workflows\"%\n\tNodePrint\022\030\n\007mes" +
      "sage\030\001 \001(\tR\007message\"U\n\nNodeRandom\022\020\n\003min" +
      "\030\001 \001(\005R\003min\022\020\n\003max\030\002 \001(\005R\003max\022#\n\rsingle_" +
      "output\030\003 \001(\010R\014singleOutput\"*\n\020NodeConsol" +
      "eInput\022\026\n\006prompt\030\001 \001(\tR\006prompt\"+\n\016NodeSt" +
      "oreInput\022\031\n\010store_to\030\001 \001(\tR\007storeTo\"T\n\016N" +
      "odeComparator\022\037\n\013first_field\030\001 \001(\tR\nfirs" +
      "tField\022!\n\014second_field\030\002 \001(\tR\013secondFiel" +
      "d\"\'\n\013NodeChatbot\022\030\n\007message\030\001 \001(\tR\007messa" +
      "ge\"\302\002\n\014DiceDocument\022\035\n\ndice_value\030\001 \001(\005R" +
      "\tdiceValue\022$\n\016dice_value_max\030\002 \001(\005R\014dice" +
      "ValueMax\022$\n\016dice_value_min\030\003 \001(\005R\014diceVa" +
      "lueMin\022!\n\014last_message\030\004 \001(\tR\013lastMessag" +
      "e\022P\n\tvariables\030\005 \003(\01322.api.commons.workf" +
      "lows.DiceDocument.VariablesEntryR\tvariab" +
      "les\022\024\n\005error\030d \001(\tR\005error\032<\n\016VariablesEn" +
      "try\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\tR\005va" +
      "lue:\0028\001\"g\n\017ChatbotDocument\022\035\n\nin_message" +
      "\030\001 \001(\tR\tinMessage\022\037\n\013out_message\030\002 \001(\tR\n" +
      "outMessage\022\024\n\005error\030d \001(\tR\005errorB\255\001\n\'com" +
      ".tcn.cloud.api.api.commons.workflowsB\014Ex" +
      "ampleProtoP\001\242\002\003ACW\252\002\025Api.Commons.Workflo" +
      "ws\312\002\025Api\\Commons\\Workflows\342\002!Api\\Commons" +
      "\\Workflows\\GPBMetadata\352\002\027Api::Commons::W" +
      "orkflowsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_api_commons_workflows_NodePrint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_api_commons_workflows_NodePrint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodePrint_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_api_commons_workflows_NodeRandom_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_api_commons_workflows_NodeRandom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodeRandom_descriptor,
        new java.lang.String[] { "Min", "Max", "SingleOutput", });
    internal_static_api_commons_workflows_NodeConsoleInput_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_api_commons_workflows_NodeConsoleInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodeConsoleInput_descriptor,
        new java.lang.String[] { "Prompt", });
    internal_static_api_commons_workflows_NodeStoreInput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_api_commons_workflows_NodeStoreInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodeStoreInput_descriptor,
        new java.lang.String[] { "StoreTo", });
    internal_static_api_commons_workflows_NodeComparator_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_api_commons_workflows_NodeComparator_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodeComparator_descriptor,
        new java.lang.String[] { "FirstField", "SecondField", });
    internal_static_api_commons_workflows_NodeChatbot_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_api_commons_workflows_NodeChatbot_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_NodeChatbot_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_api_commons_workflows_DiceDocument_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_api_commons_workflows_DiceDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_DiceDocument_descriptor,
        new java.lang.String[] { "DiceValue", "DiceValueMax", "DiceValueMin", "LastMessage", "Variables", "Error", });
    internal_static_api_commons_workflows_DiceDocument_VariablesEntry_descriptor =
      internal_static_api_commons_workflows_DiceDocument_descriptor.getNestedTypes().get(0);
    internal_static_api_commons_workflows_DiceDocument_VariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_DiceDocument_VariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_api_commons_workflows_ChatbotDocument_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_api_commons_workflows_ChatbotDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_api_commons_workflows_ChatbotDocument_descriptor,
        new java.lang.String[] { "InMessage", "OutMessage", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
