// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/skills/service.proto

package com.tcn.cloud.api.api.v1alpha1.org.skills;

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
      "\n%api/v1alpha1/org/skills/service.proto\022" +
      "\027api.v1alpha1.org.skills\032\027annotations/au" +
      "thz.proto\032&api/v1alpha1/org/skills/entit" +
      "ies.proto\032\034google/api/annotations.proto2" +
      "\371\032\n\rSkillsService\022\262\001\n\020CreateSkillGroup\0220" +
      ".api.v1alpha1.org.skills.CreateSkillGrou" +
      "pRequest\0321.api.v1alpha1.org.skills.Creat" +
      "eSkillGroupResponse\"9\272\270\221\002\004\n\002\010d\202\323\344\223\002*\"%/a" +
      "pi/v1alpha1/skills/createskillgroup:\001*\022\263" +
      "\001\n\017ListSkillGroups\022/.api.v1alpha1.org.sk" +
      "ills.ListSkillGroupsRequest\0320.api.v1alph" +
      "a1.org.skills.ListSkillGroupsResponse\"=\272" +
      "\270\221\002\t\n\002\010e\n\003\010\351\002\202\323\344\223\002)\"$/api/v1alpha1/skill" +
      "s/listskillgroups:\001*\022\262\001\n\020UpdateSkillGrou" +
      "p\0220.api.v1alpha1.org.skills.UpdateSkillG" +
      "roupRequest\0321.api.v1alpha1.org.skills.Up" +
      "dateSkillGroupResponse\"9\272\270\221\002\004\n\002\010d\202\323\344\223\002*\"" +
      "%/api/v1alpha1/skills/updateskillgroup:\001" +
      "*\022\246\001\n\rGetSkillGroup\022-.api.v1alpha1.org.s" +
      "kills.GetSkillGroupRequest\032..api.v1alpha" +
      "1.org.skills.GetSkillGroupResponse\"6\272\270\221\002" +
      "\004\n\002\010e\202\323\344\223\002\'\"\"/api/v1alpha1/skills/getski" +
      "llgroup:\001*\022\262\001\n\020DeleteSkillGroup\0220.api.v1" +
      "alpha1.org.skills.DeleteSkillGroupReques" +
      "t\0321.api.v1alpha1.org.skills.DeleteSkillG" +
      "roupResponse\"9\272\270\221\002\004\n\002\010d\202\323\344\223\002*\"%/api/v1al" +
      "pha1/skills/deleteskillgroup:\001*\022\322\001\n\030Remo" +
      "veSkillFromAllGroups\0228.api.v1alpha1.org." +
      "skills.RemoveSkillFromAllGroupsRequest\0329" +
      ".api.v1alpha1.org.skills.RemoveSkillFrom" +
      "AllGroupsResponse\"A\272\270\221\002\004\n\002\010d\202\323\344\223\0022\"-/api" +
      "/v1alpha1/skills/removeskillfromallgroup" +
      "s:\001*\022\266\001\n\021AssignSkillGroups\0221.api.v1alpha" +
      "1.org.skills.AssignSkillGroupsRequest\0322." +
      "api.v1alpha1.org.skills.AssignSkillGroup" +
      "sResponse\":\272\270\221\002\004\n\002\010w\202\323\344\223\002+\"&/api/v1alpha" +
      "1/skills/assignskillgroups:\001*\022\315\001\n\027Update" +
      "UsersOnSkillGroup\0227.api.v1alpha1.org.ski" +
      "lls.UpdateUsersOnSkillGroupRequest\0328.api" +
      ".v1alpha1.org.skills.UpdateUsersOnSkillG" +
      "roupResponse\"?\272\270\221\002\004\n\002\010d\202\323\344\223\0020\"+/api/v1al" +
      "pha1/skills/updateuseronskillgroup:\001*\022\266\001" +
      "\n\021RevokeSkillGroups\0221.api.v1alpha1.org.s" +
      "kills.RevokeSkillGroupsRequest\0322.api.v1a" +
      "lpha1.org.skills.RevokeSkillGroupsRespon" +
      "se\":\272\270\221\002\004\n\002\010w\202\323\344\223\002+\"&/api/v1alpha1/skill" +
      "s/revokeskillgroups:\001*\022\272\001\n\022GetUserSkillG" +
      "roups\0222.api.v1alpha1.org.skills.GetUserS" +
      "killGroupsRequest\0323.api.v1alpha1.org.ski" +
      "lls.GetUserSkillGroupsResponse\";\272\270\221\002\004\n\002\010" +
      "e\202\323\344\223\002,\"\'/api/v1alpha1/skills/getuserski" +
      "llgroups:\001*\022\246\001\n\rGetUserSkills\022-.api.v1al" +
      "pha1.org.skills.GetUserSkillsRequest\032..a" +
      "pi.v1alpha1.org.skills.GetUserSkillsResp" +
      "onse\"6\272\270\221\002\004\n\002\010e\202\323\344\223\002\'\"\"/api/v1alpha1/ski" +
      "lls/getuserskills:\001*\022\302\001\n\024GetSkillGroupMe" +
      "mbers\0224.api.v1alpha1.org.skills.GetSkill" +
      "GroupMembersRequest\0325.api.v1alpha1.org.s" +
      "kills.GetSkillGroupMembersResponse\"=\272\270\221\002" +
      "\004\n\002\010e\202\323\344\223\002.\")/api/v1alpha1/skills/getski" +
      "llgroupmembers:\001*\022\312\001\n\026ListSkillGroupsMem" +
      "bers\0226.api.v1alpha1.org.skills.ListSkill" +
      "GroupsMembersRequest\0327.api.v1alpha1.org." +
      "skills.ListSkillGroupsMembersResponse\"?\272" +
      "\270\221\002\004\n\002\010e\202\323\344\223\0020\"+/api/v1alpha1/skills/lis" +
      "tskillgroupsmembers:\001*\022\250\001\n\016GetAgentSkill" +
      "s\022..api.v1alpha1.org.skills.GetAgentSkil" +
      "lsRequest\032/.api.v1alpha1.org.skills.GetA" +
      "gentSkillsResponse\"5\272\270\221\002\002\030\001\202\323\344\223\002(\"#/api/" +
      "v1alpha1/skills/getagentskills:\001*\022\324\001\n\031Li" +
      "stSkillsForCurrentAgent\0229.api.v1alpha1.o" +
      "rg.skills.ListSkillsForCurrentAgentReque" +
      "st\032:.api.v1alpha1.org.skills.ListSkillsF" +
      "orCurrentAgentResponse\"@\272\270\221\002\002\030\001\202\323\344\223\0023\"./" +
      "api/v1alpha1/skills/listskillsforcurrent" +
      "agent:\001*\022\314\001\n\027ListAssignedSkillGroups\0227.a" +
      "pi.v1alpha1.org.skills.ListAssignedSkill" +
      "GroupsRequest\0328.api.v1alpha1.org.skills." +
      "ListAssignedSkillGroupsResponse\">\272\270\221\002\002\030\001" +
      "\202\323\344\223\0021\",/api/v1alpha1/skills/listassigne" +
      "dskillgroups:\001*\022\303\001\n\024AssignOwnSkillGroups" +
      "\0224.api.v1alpha1.org.skills.AssignOwnSkil" +
      "lGroupsRequest\0325.api.v1alpha1.org.skills" +
      ".AssignOwnSkillGroupsResponse\">\272\270\221\002\005\n\003\010\351" +
      "\002\202\323\344\223\002.\")/api/v1alpha1/skills/assignowns" +
      "killgroups:\001*\022\303\001\n\024RevokeOwnSkillGroups\0224" +
      ".api.v1alpha1.org.skills.RevokeOwnSkillG" +
      "roupsRequest\0325.api.v1alpha1.org.skills.R" +
      "evokeOwnSkillGroupsResponse\">\272\270\221\002\005\n\003\010\351\002\202" +
      "\323\344\223\002.\")/api/v1alpha1/skills/revokeownski" +
      "llgroups:\001*B\271\001\n)com.tcn.cloud.api.api.v1" +
      "alpha1.org.skillsB\014ServiceProtoP\001\242\002\004AVOS" +
      "\252\002\027Api.V1alpha1.Org.Skills\312\002\027Api\\V1alpha" +
      "1\\Org\\Skills\342\002#Api\\V1alpha1\\Org\\Skills\\G" +
      "PBMetadata\352\002\032Api::V1alpha1::Org::Skillsb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.skills.EntitiesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
