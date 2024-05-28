// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/org/users/service.proto

package com.tcn.cloud.api.api.v1alpha1.org.users;

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
      "\n$api/v1alpha1/org/users/service.proto\022\026" +
      "api.v1alpha1.org.users\032\027annotations/auth" +
      "z.proto\0320api/v1alpha1/org/users/agent_pr" +
      "ofile_group.proto\032\'api/v1alpha1/org/user" +
      "s/auth_token.proto\032*api/v1alpha1/org/use" +
      "rs/notifications.proto\032\"api/v1alpha1/org" +
      "/users/users.proto\032\034google/api/annotatio" +
      "ns.proto2\301l\n\014UsersService\022\233\001\n\nCreateUser" +
      "\022).api.v1alpha1.org.users.CreateUserRequ" +
      "est\032*.api.v1alpha1.org.users.CreateUserR" +
      "esponse\"6\272\270\221\002\004\n\002\010v\202\323\344\223\002\'\"\"/api/v1alpha1/" +
      "org/users/createuser:\001*\022\275\001\n\023CreateDelega" +
      "tedUser\0222.api.v1alpha1.org.users.CreateD" +
      "elegatedUserRequest\0323.api.v1alpha1.org.u" +
      "sers.CreateDelegatedUserResponse\"=\272\270\221\002\002\030" +
      "\001\202\323\344\223\0020\"+/api/v1alpha1/org/users/created" +
      "elegateduser:\001*\022\227\001\n\tGetMyUser\022(.api.v1al" +
      "pha1.org.users.GetMyUserRequest\032).api.v1" +
      "alpha1.org.users.GetMyUserResponse\"5\272\270\221\002" +
      "\004\n\002\010y\202\323\344\223\002&\"!/api/v1alpha1/org/users/get" +
      "myuser:\001*\022\217\001\n\007GetUser\022&.api.v1alpha1.org" +
      ".users.GetUserRequest\032\'.api.v1alpha1.org" +
      ".users.GetUserResponse\"3\272\270\221\002\004\n\002\010e\202\323\344\223\002$\"" +
      "\037/api/v1alpha1/org/users/getuser:\001*\022\254\001\n\016" +
      "GetUserByOrgId\022-.api.v1alpha1.org.users." +
      "GetUserByOrgIdRequest\032..api.v1alpha1.org" +
      ".users.GetUserByOrgIdResponse\";\272\270\221\002\005\n\003\010\310" +
      "\001\202\323\344\223\002+\"&/api/v1alpha1/org/users/getuser" +
      "byorgid:\001*\022\235\001\n\nListAgents\022).api.v1alpha1" +
      ".org.users.ListAgentsRequest\032*.api.v1alp" +
      "ha1.org.users.ListAgentsResponse\"6\272\270\221\002\004\n" +
      "\002\010e\202\323\344\223\002\'\"\"/api/v1alpha1/org/users/lista" +
      "gents:\001*0\001\022\267\001\n\017ListPublicUsers\022..api.v1a" +
      "lpha1.org.users.ListPublicUsersRequest\032/" +
      ".api.v1alpha1.org.users.ListPublicUsersR" +
      "esponse\"A\272\270\221\002\n\n\003\010\364\003\n\003\010\300\014\202\323\344\223\002,\"\'/api/v1a" +
      "lpha1/org/users/listpublicusers:\001*0\001\022\231\001\n" +
      "\tListUsers\022(.api.v1alpha1.org.users.List" +
      "UsersRequest\032).api.v1alpha1.org.users.Li" +
      "stUsersResponse\"5\272\270\221\002\004\n\002\010e\202\323\344\223\002&\"!/api/v" +
      "1alpha1/org/users/listusers:\001*0\001\022\266\001\n\020Lis" +
      "tUsersByOrgId\022/.api.v1alpha1.org.users.L" +
      "istUsersByOrgIdRequest\0320.api.v1alpha1.or" +
      "g.users.ListUsersByOrgIdResponse\"=\272\270\221\002\005\n" +
      "\003\010\310\001\202\323\344\223\002-\"(/api/v1alpha1/org/users/list" +
      "usersbyorgid:\001*0\001\022\272\001\n\021ListUsersByRegion\022" +
      "0.api.v1alpha1.org.users.ListUsersByRegi" +
      "onRequest\0321.api.v1alpha1.org.users.ListU" +
      "sersByRegionResponse\">\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002.\")" +
      "/api/v1alpha1/org/users/listusersbyregio" +
      "n:\001*0\001\022\243\001\n\014UpdateMyUser\022+.api.v1alpha1.o" +
      "rg.users.UpdateMyUserRequest\032,.api.v1alp" +
      "ha1.org.users.UpdateMyUserResponse\"8\272\270\221\002" +
      "\004\n\002\010y\202\323\344\223\002)\"$/api/v1alpha1/org/users/upd" +
      "atemyuser:\001*\022\233\001\n\nUpdateUser\022).api.v1alph" +
      "a1.org.users.UpdateUserRequest\032*.api.v1a" +
      "lpha1.org.users.UpdateUserResponse\"6\272\270\221\002" +
      "\004\n\002\010w\202\323\344\223\002\'\"\"/api/v1alpha1/org/users/upd" +
      "ateuser:\001*\022\263\001\n\020UpdateUserLabels\022/.api.v1" +
      "alpha1.org.users.UpdateUserLabelsRequest" +
      "\0320.api.v1alpha1.org.users.UpdateUserLabe" +
      "lsResponse\"<\272\270\221\002\004\n\002\010w\202\323\344\223\002-\"(/api/v1alph" +
      "a1/org/users/updateuserlabels:\001*\022\273\001\n\022Upd" +
      "ateUserCallerId\0221.api.v1alpha1.org.users" +
      ".UpdateUserCallerIdRequest\0322.api.v1alpha" +
      "1.org.users.UpdateUserCallerIdResponse\">" +
      "\272\270\221\002\004\n\002\010z\202\323\344\223\002/\"*/api/v1alpha1/org/users" +
      "/updateusercallerid:\001*\022\273\001\n\022UpdateUserDis" +
      "abled\0221.api.v1alpha1.org.users.UpdateUse" +
      "rDisabledRequest\0322.api.v1alpha1.org.user" +
      "s.UpdateUserDisabledResponse\">\272\270\221\002\004\n\002\010w\202" +
      "\323\344\223\002/\"*/api/v1alpha1/org/users/updateuse" +
      "rdisabled:\001*\022\330\001\n\031UpdateUserDisabledByOrg" +
      "Id\0228.api.v1alpha1.org.users.UpdateUserDi" +
      "sabledByOrgIdRequest\0329.api.v1alpha1.org." +
      "users.UpdateUserDisabledByOrgIdResponse\"" +
      "F\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0026\"1/api/v1alpha1/org/use" +
      "rs/updateuserdisabledbyorgid:\001*\022\333\001\n\032GetM" +
      "yUserPasswordResetLink\0229.api.v1alpha1.or" +
      "g.users.GetMyUserPasswordResetLinkReques" +
      "t\032:.api.v1alpha1.org.users.GetMyUserPass" +
      "wordResetLinkResponse\"F\272\270\221\002\004\n\002\010x\202\323\344\223\0027\"2" +
      "/api/v1alpha1/org/users/getmyuserpasswor" +
      "dresetlink:\001*\022\323\001\n\030GetUserPasswordResetLi" +
      "nk\0227.api.v1alpha1.org.users.GetUserPassw" +
      "ordResetLinkRequest\0328.api.v1alpha1.org.u" +
      "sers.GetUserPasswordResetLinkResponse\"D\272" +
      "\270\221\002\004\n\002\010w\202\323\344\223\0025\"0/api/v1alpha1/org/users/" +
      "getuserpasswordresetlink:\001*\022\360\001\n\037GetUserP" +
      "asswordResetLinkByOrgId\022>.api.v1alpha1.o" +
      "rg.users.GetUserPasswordResetLinkByOrgId" +
      "Request\032?.api.v1alpha1.org.users.GetUser" +
      "PasswordResetLinkByOrgIdResponse\"L\272\270\221\002\005\n" +
      "\003\010\310\001\202\323\344\223\002<\"7/api/v1alpha1/org/users/getu" +
      "serpasswordresetlinkbyorgid:\001*\022\317\001\n\027Creat" +
      "ePasswordResetLink\0226.api.v1alpha1.org.us" +
      "ers.CreatePasswordResetLinkRequest\0327.api" +
      ".v1alpha1.org.users.CreatePasswordResetL" +
      "inkResponse\"C\272\270\221\002\004\n\002\010w\202\323\344\223\0024\"//api/v1alp" +
      "ha1/org/users/createpasswordresetlink:\001*" +
      "\022\354\001\n\036CreatePasswordResetLinkByOrgId\022=.ap" +
      "i.v1alpha1.org.users.CreatePasswordReset" +
      "LinkByOrgIdRequest\032>.api.v1alpha1.org.us" +
      "ers.CreatePasswordResetLinkByOrgIdRespon" +
      "se\"K\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002;\"6/api/v1alpha1/org/" +
      "users/createpasswordresetlinkbyorgid:\001*\022" +
      "\264\001\n\020GetUserLoginInfo\022/.api.v1alpha1.org." +
      "users.GetUserLoginInfoRequest\0320.api.v1al" +
      "pha1.org.users.GetUserLoginInfoResponse\"" +
      "=\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002-\"(/api/v1alpha1/org/use" +
      "rs/getuserlogininfo:\001*\022\303\001\n\024GetUserEmailV" +
      "erified\0223.api.v1alpha1.org.users.GetUser" +
      "EmailVerifiedRequest\0324.api.v1alpha1.org." +
      "users.GetUserEmailVerifiedResponse\"@\272\270\221\002" +
      "\004\n\002\010w\202\323\344\223\0021\",/api/v1alpha1/org/users/get" +
      "useremailverified:\001*\022\340\001\n\033GetUserEmailVer" +
      "ifiedByOrgId\022:.api.v1alpha1.org.users.Ge" +
      "tUserEmailVerifiedByOrgIdRequest\032;.api.v" +
      "1alpha1.org.users.GetUserEmailVerifiedBy" +
      "OrgIdResponse\"H\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0028\"3/api/v1" +
      "alpha1/org/users/getuseremailverifiedbyo" +
      "rgid:\001*\022\257\001\n\017ResetMyPassword\022..api.v1alph" +
      "a1.org.users.ResetMyPasswordRequest\032/.ap" +
      "i.v1alpha1.org.users.ResetMyPasswordResp" +
      "onse\";\272\270\221\002\004\n\002\010x\202\323\344\223\002,\"\'/api/v1alpha1/org" +
      "/users/resetmypassword:\001*\022\267\001\n\021ResetUserP" +
      "assword\0220.api.v1alpha1.org.users.ResetUs" +
      "erPasswordRequest\0321.api.v1alpha1.org.use" +
      "rs.ResetUserPasswordResponse\"=\272\270\221\002\004\n\002\010w\202" +
      "\323\344\223\002.\")/api/v1alpha1/org/users/resetuser" +
      "password:\001*\022\324\001\n\030ResetUserPasswordByOrgId" +
      "\0227.api.v1alpha1.org.users.ResetUserPassw" +
      "ordByOrgIdRequest\0328.api.v1alpha1.org.use" +
      "rs.ResetUserPasswordByOrgIdResponse\"E\272\270\221" +
      "\002\005\n\003\010\310\001\202\323\344\223\0025\"0/api/v1alpha1/org/users/r" +
      "esetuserpasswordbyorgid:\001*\022\327\001\n\031SendUserE" +
      "mailVerification\0228.api.v1alpha1.org.user" +
      "s.SendUserEmailVerificationRequest\0329.api" +
      ".v1alpha1.org.users.SendUserEmailVerific" +
      "ationResponse\"E\272\270\221\002\004\n\002\010w\202\323\344\223\0026\"1/api/v1a" +
      "lpha1/org/users/senduseremailverificatio" +
      "n:\001*\022\364\001\n SendUserEmailVerificationByOrgI" +
      "d\022?.api.v1alpha1.org.users.SendUserEmail" +
      "VerificationByOrgIdRequest\032@.api.v1alpha" +
      "1.org.users.SendUserEmailVerificationByO" +
      "rgIdResponse\"M\272\270\221\002\005\n\003\010\310\001\202\323\344\223\002=\"8/api/v1a" +
      "lpha1/org/users/senduseremailverificatio" +
      "nbyorgid:\001*\022\267\001\n\021SendPasswordReset\0220.api." +
      "v1alpha1.org.users.SendPasswordResetRequ" +
      "est\0321.api.v1alpha1.org.users.SendPasswor" +
      "dResetResponse\"=\272\270\221\002\004\n\002\010w\202\323\344\223\002.\")/api/v1" +
      "alpha1/org/users/sendpasswordreset:\001*\022\324\001" +
      "\n\030SendPasswordResetByOrgId\0227.api.v1alpha" +
      "1.org.users.SendPasswordResetByOrgIdRequ" +
      "est\0328.api.v1alpha1.org.users.SendPasswor" +
      "dResetByOrgIdResponse\"E\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0025\"" +
      "0/api/v1alpha1/org/users/sendpasswordres" +
      "etbyorgid:\001*\022\271\001\n\022GetUserSessionData\0221.ap" +
      "i.v1alpha1.org.users.GetUserSessionDataR" +
      "equest\0322.api.v1alpha1.org.users.GetUserS" +
      "essionDataResponse\"<\272\270\221\002\002\030\001\202\323\344\223\002/\"*/api/" +
      "v1alpha1/org/users/getusersessiondata:\001*" +
      "\022\303\001\n\024GetAgentProfileGroup\0223.api.v1alpha1" +
      ".org.users.GetAgentProfileGroupRequest\0324" +
      ".api.v1alpha1.org.users.GetAgentProfileG" +
      "roupResponse\"@\272\270\221\002\004\n\002\010e\202\323\344\223\0021\",/api/v1al" +
      "pha1/org/users/getagentprofilegroup:\001*\022\313" +
      "\001\n\026ListAgentProfileGroups\0225.api.v1alpha1" +
      ".org.users.ListAgentProfileGroupsRequest" +
      "\0326.api.v1alpha1.org.users.ListAgentProfi" +
      "leGroupsResponse\"B\272\270\221\002\004\n\002\010e\202\323\344\223\0023\"./api/" +
      "v1alpha1/org/users/listagentprofilegroup" +
      "s:\001*\022\317\001\n\027UpdateAgentProfileGroup\0226.api.v" +
      "1alpha1.org.users.UpdateAgentProfileGrou" +
      "pRequest\0327.api.v1alpha1.org.users.Update" +
      "AgentProfileGroupResponse\"C\272\270\221\002\004\n\002\010d\202\323\344\223" +
      "\0024\"//api/v1alpha1/org/users/updateagentp" +
      "rofilegroup:\001*\022\317\001\n\027CreateAgentProfileGro" +
      "up\0226.api.v1alpha1.org.users.CreateAgentP" +
      "rofileGroupRequest\0327.api.v1alpha1.org.us" +
      "ers.CreateAgentProfileGroupResponse\"C\272\270\221" +
      "\002\004\n\002\010d\202\323\344\223\0024\"//api/v1alpha1/org/users/cr" +
      "eateagentprofilegroup:\001*\022\317\001\n\027DeleteAgent" +
      "ProfileGroup\0226.api.v1alpha1.org.users.De" +
      "leteAgentProfileGroupRequest\0327.api.v1alp" +
      "ha1.org.users.DeleteAgentProfileGroupRes" +
      "ponse\"C\272\270\221\002\004\n\002\010d\202\323\344\223\0024\"//api/v1alpha1/or" +
      "g/users/deleteagentprofilegroup:\001*\022\323\001\n\030A" +
      "ssignAgentProfileGroups\0227.api.v1alpha1.o" +
      "rg.users.AssignAgentProfileGroupsRequest" +
      "\0328.api.v1alpha1.org.users.AssignAgentPro" +
      "fileGroupsResponse\"D\272\270\221\002\004\n\002\010d\202\323\344\223\0025\"0/ap" +
      "i/v1alpha1/org/users/assignagentprofileg" +
      "roups:\001*\022\277\001\n\023AddUserSubscription\0222.api.v" +
      "1alpha1.org.users.AddUserSubscriptionReq" +
      "uest\0323.api.v1alpha1.org.users.AddUserSub" +
      "scriptionResponse\"?\272\270\221\002\004\n\002\010y\202\323\344\223\0020\"+/api" +
      "/v1alpha1/org/users/addusersubscription:" +
      "\001*\022\337\001\n\033AddUserSubscriptionByUserId\022:.api" +
      ".v1alpha1.org.users.AddUserSubscriptionB" +
      "yUserIdRequest\032;.api.v1alpha1.org.users." +
      "AddUserSubscriptionByUserIdResponse\"G\272\270\221" +
      "\002\004\n\002\010w\202\323\344\223\0028\"3/api/v1alpha1/org/users/ad" +
      "dusersubscriptionbyuserid:\001*\022\275\001\n\023GetUser" +
      "Subscription\0222.api.v1alpha1.org.users.Ge" +
      "tUserSubscriptionRequest\0323.api.v1alpha1." +
      "org.users.GetUserSubscriptionResponse\"=\272" +
      "\270\221\002\002\030\001\202\323\344\223\0020\"+/api/v1alpha1/org/users/ge" +
      "tusersubscription:\001*\022\337\001\n\033GetUserSubscrip" +
      "tionByUserId\022:.api.v1alpha1.org.users.Ge" +
      "tUserSubscriptionByUserIdRequest\032;.api.v" +
      "1alpha1.org.users.GetUserSubscriptionByU" +
      "serIdResponse\"G\272\270\221\002\004\n\002\010e\202\323\344\223\0028\"3/api/v1a" +
      "lpha1/org/users/getusersubscriptionbyuse" +
      "rid:\001*\022\313\001\n\026UpdateUserSubscription\0225.api." +
      "v1alpha1.org.users.UpdateUserSubscriptio" +
      "nRequest\0326.api.v1alpha1.org.users.Update" +
      "UserSubscriptionResponse\"B\272\270\221\002\004\n\002\010y\202\323\344\223\002" +
      "3\"./api/v1alpha1/org/users/updateusersub" +
      "scription:\001*\022\353\001\n\036UpdateUserSubscriptionB" +
      "yUserId\022=.api.v1alpha1.org.users.UpdateU" +
      "serSubscriptionByUserIdRequest\032>.api.v1a" +
      "lpha1.org.users.UpdateUserSubscriptionBy" +
      "UserIdResponse\"J\272\270\221\002\004\n\002\010w\202\323\344\223\002;\"6/api/v1" +
      "alpha1/org/users/updateusersubscriptionb" +
      "yuserid:\001*\022\313\001\n\026RemoveUserSubscription\0225." +
      "api.v1alpha1.org.users.RemoveUserSubscri" +
      "ptionRequest\0326.api.v1alpha1.org.users.Re" +
      "moveUserSubscriptionResponse\"B\272\270\221\002\004\n\002\010y\202" +
      "\323\344\223\0023\"./api/v1alpha1/org/users/removeuse" +
      "rsubscription:\001*\022\353\001\n\036RemoveUserSubscript" +
      "ionByUserId\022=.api.v1alpha1.org.users.Rem" +
      "oveUserSubscriptionByUserIdRequest\032>.api" +
      ".v1alpha1.org.users.RemoveUserSubscripti" +
      "onByUserIdResponse\"J\272\270\221\002\004\n\002\010w\202\323\344\223\002;\"6/ap" +
      "i/v1alpha1/org/users/removeusersubscript" +
      "ionbyuserid:\001*\022\305\001\n\025ListUserSubscriptions" +
      "\0224.api.v1alpha1.org.users.ListUserSubscr" +
      "iptionsRequest\0325.api.v1alpha1.org.users." +
      "ListUserSubscriptionsResponse\"?\272\270\221\002\002\030\001\202\323" +
      "\344\223\0022\"-/api/v1alpha1/org/users/listusersu" +
      "bscriptions:\001*\022\347\001\n\035ListUserSubscriptions" +
      "ByUserId\022<.api.v1alpha1.org.users.ListUs" +
      "erSubscriptionsByUserIdRequest\032=.api.v1a" +
      "lpha1.org.users.ListUserSubscriptionsByU" +
      "serIdResponse\"I\272\270\221\002\004\n\002\010e\202\323\344\223\002:\"5/api/v1a" +
      "lpha1/org/users/listusersubscriptionsbyu" +
      "serid:\001*\022\303\001\n\024ListOrgSubscriptions\0223.api." +
      "v1alpha1.org.users.ListOrgSubscriptionsR" +
      "equest\0324.api.v1alpha1.org.users.ListOrgS" +
      "ubscriptionsResponse\"@\272\270\221\002\004\n\002\010e\202\323\344\223\0021\",/" +
      "api/v1alpha1/org/users/listorgsubscripti" +
      "ons:\001*\022\257\001\n\017CreateAuthToken\022..api.v1alpha" +
      "1.org.users.CreateAuthTokenRequest\032/.api" +
      ".v1alpha1.org.users.CreateAuthTokenRespo" +
      "nse\";\272\270\221\002\004\n\002\010y\202\323\344\223\002,\"\'/api/v1alpha1/org/" +
      "users/createauthtoken:\001*\022\317\001\n\027CreateAuthT" +
      "okenByUserId\0226.api.v1alpha1.org.users.Cr" +
      "eateAuthTokenByUserIdRequest\0327.api.v1alp" +
      "ha1.org.users.CreateAuthTokenByUserIdRes" +
      "ponse\"C\272\270\221\002\004\n\002\010w\202\323\344\223\0024\"//api/v1alpha1/or" +
      "g/users/createauthtokenbyuserid:\001*\022\253\001\n\016L" +
      "istAuthTokens\022-.api.v1alpha1.org.users.L" +
      "istAuthTokensRequest\032..api.v1alpha1.org." +
      "users.ListAuthTokensResponse\":\272\270\221\002\004\n\002\010y\202" +
      "\323\344\223\002+\"&/api/v1alpha1/org/users/listautht" +
      "okens:\001*\022\313\001\n\026ListAuthTokensByUserId\0225.ap" +
      "i.v1alpha1.org.users.ListAuthTokensByUse" +
      "rIdRequest\0326.api.v1alpha1.org.users.List" +
      "AuthTokensByUserIdResponse\"B\272\270\221\002\004\n\002\010e\202\323\344" +
      "\223\0023\"./api/v1alpha1/org/users/listauthtok" +
      "ensbyuserid:\001*\022\313\001\n\026SetAuthTokenExpiratio" +
      "n\0225.api.v1alpha1.org.users.SetAuthTokenE" +
      "xpirationRequest\0326.api.v1alpha1.org.user" +
      "s.SetAuthTokenExpirationResponse\"B\272\270\221\002\004\n" +
      "\002\010y\202\323\344\223\0023\"./api/v1alpha1/org/users/setau" +
      "thtokenexpiration:\001*\022\353\001\n\036SetAuthTokenExp" +
      "irationByUserId\022=.api.v1alpha1.org.users" +
      ".SetAuthTokenExpirationByUserIdRequest\032>" +
      ".api.v1alpha1.org.users.SetAuthTokenExpi" +
      "rationByUserIdResponse\"J\272\270\221\002\004\n\002\010w\202\323\344\223\002;\"" +
      "6/api/v1alpha1/org/users/setauthtokenexp" +
      "irationbyuserid:\001*\022\257\001\n\017DeleteAuthToken\022." +
      ".api.v1alpha1.org.users.DeleteAuthTokenR" +
      "equest\032/.api.v1alpha1.org.users.DeleteAu" +
      "thTokenResponse\";\272\270\221\002\004\n\002\010y\202\323\344\223\002,\"\'/api/v" +
      "1alpha1/org/users/deleteauthtoken:\001*\022\317\001\n" +
      "\027DeleteAuthTokenByUserId\0226.api.v1alpha1." +
      "org.users.DeleteAuthTokenByUserIdRequest" +
      "\0327.api.v1alpha1.org.users.DeleteAuthToke" +
      "nByUserIdResponse\"C\272\270\221\002\004\n\002\010w\202\323\344\223\0024\"//api" +
      "/v1alpha1/org/users/deleteauthtokenbyuse" +
      "rid:\001*\022\267\001\n\021RefreshMfaLockout\0220.api.v1alp" +
      "ha1.org.users.RefreshMfaLockoutRequest\0321" +
      ".api.v1alpha1.org.users.RefreshMfaLockou" +
      "tResponse\"=\272\270\221\002\004\n\002\010w\202\323\344\223\002.\")/api/v1alpha" +
      "1/org/users/refreshmfalockout:\001*\022\324\001\n\030Ref" +
      "reshMfaLockoutByOrgId\0227.api.v1alpha1.org" +
      ".users.RefreshMfaLockoutByOrgIdRequest\0328" +
      ".api.v1alpha1.org.users.RefreshMfaLockou" +
      "tByOrgIdResponse\"E\272\270\221\002\005\n\003\010\310\001\202\323\344\223\0025\"0/api" +
      "/v1alpha1/org/users/refreshmfalockoutbyo" +
      "rgid:\001*\022\233\001\n\nSetMfaType\022).api.v1alpha1.or" +
      "g.users.SetMfaTypeRequest\032*.api.v1alpha1" +
      ".org.users.SetMfaTypeResponse\"6\272\270\221\002\004\n\002\010w" +
      "\202\323\344\223\002\'\"\"/api/v1alpha1/org/users/setmfaty" +
      "pe:\001*\022\243\001\n\014SetMyMfaType\022+.api.v1alpha1.or" +
      "g.users.SetMyMfaTypeRequest\032,.api.v1alph" +
      "a1.org.users.SetMyMfaTypeResponse\"8\272\270\221\002\004" +
      "\n\002\010y\202\323\344\223\002)\"$/api/v1alpha1/org/users/setm" +
      "ymfatype:\001*\022\247\001\n\rEnableUserMfa\022,.api.v1al" +
      "pha1.org.users.EnableUserMfaRequest\032-.ap" +
      "i.v1alpha1.org.users.EnableUserMfaRespon" +
      "se\"9\272\270\221\002\004\n\002\010w\202\323\344\223\002*\"%/api/v1alpha1/org/u" +
      "sers/enableusermfa:\001*\022\257\001\n\017EnableMyUserMf" +
      "a\022..api.v1alpha1.org.users.EnableMyUserM" +
      "faRequest\032/.api.v1alpha1.org.users.Enabl" +
      "eMyUserMfaResponse\";\272\270\221\002\004\n\002\010y\202\323\344\223\002,\"\'/ap" +
      "i/v1alpha1/org/users/enablemyusermfa:\001*\022" +
      "\253\001\n\016GetUserMfaInfo\022-.api.v1alpha1.org.us" +
      "ers.GetUserMfaInfoRequest\032..api.v1alpha1" +
      ".org.users.GetUserMfaInfoResponse\":\272\270\221\002\004" +
      "\n\002\010e\202\323\344\223\002+\"&/api/v1alpha1/org/users/getu" +
      "sermfainfo:\001*\022\263\001\n\020GetMyUserMfaInfo\022/.api" +
      ".v1alpha1.org.users.GetMyUserMfaInfoRequ" +
      "est\0320.api.v1alpha1.org.users.GetMyUserMf" +
      "aInfoResponse\"<\272\270\221\002\004\n\002\010y\202\323\344\223\002-\"(/api/v1a" +
      "lpha1/org/users/getmyusermfainfo:\001*\022\343\001\n\034" +
      "AddGroupedUserIPRestrictions\022;.api.v1alp" +
      "ha1.org.users.AddGroupedUserIPRestrictio" +
      "nsRequest\032<.api.v1alpha1.org.users.AddGr" +
      "oupedUserIPRestrictionsResponse\"H\272\270\221\002\004\n\002" +
      "\010w\202\323\344\223\0029\"4/api/v1alpha1/org/users/addgro" +
      "upeduseriprestrictions:\001*\022\357\001\n\037RemoveGrou" +
      "pedUserIPRestrictions\022>.api.v1alpha1.org" +
      ".users.RemoveGroupedUserIPRestrictionsRe" +
      "quest\032?.api.v1alpha1.org.users.RemoveGro" +
      "upedUserIPRestrictionsResponse\"K\272\270\221\002\004\n\002\010" +
      "w\202\323\344\223\002<\"7/api/v1alpha1/org/users/removeg" +
      "roupeduseriprestrictions:\001*\022\277\001\n\023ListUser" +
      "sAllowedIps\0222.api.v1alpha1.org.users.Lis" +
      "tUsersAllowedIpsRequest\0323.api.v1alpha1.o" +
      "rg.users.ListUsersAllowedIpsResponse\"?\272\270" +
      "\221\002\004\n\002\010e\202\323\344\223\0020\"+/api/v1alpha1/org/users/l" +
      "istusersallowedips:\001*\022\272\001\n\023ListUserDirect" +
      "ories\0222.api.v1alpha1.org.users.ListUserD" +
      "irectoriesRequest\0323.api.v1alpha1.org.use" +
      "rs.ListUserDirectoriesResponse\":\272\270\221\002\002\030\001\202" +
      "\323\344\223\002-\"(/api/v1alpha1/org/users/getuserdi" +
      "rectory:\001*\022\317\001\n\027UpdateBulkUsersDisabled\0226" +
      ".api.v1alpha1.org.users.UpdateBulkUsersD" +
      "isabledRequest\0327.api.v1alpha1.org.users." +
      "UpdateBulkUsersDisabledResponse\"C\272\270\221\002\004\n\002" +
      "\010w\202\323\344\223\0024\"//api/v1alpha1/org/users/update" +
      "bulkusersdisabled:\001*B\264\001\n(com.tcn.cloud.a" +
      "pi.api.v1alpha1.org.usersB\014ServiceProtoP" +
      "\001\242\002\004AVOU\252\002\026Api.V1alpha1.Org.Users\312\002\026Api\\" +
      "V1alpha1\\Org\\Users\342\002\"Api\\V1alpha1\\Org\\Us" +
      "ers\\GPBMetadata\352\002\031Api::V1alpha1::Org::Us" +
      "ersb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tcn.cloud.api.annotations.AuthzProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.getDescriptor(),
          com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.tcn.cloud.api.annotations.AuthzProto.authz);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tcn.cloud.api.annotations.AuthzProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.users.AgentProfileGroupProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.users.AuthTokenProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.users.NotificationsProto.getDescriptor();
    com.tcn.cloud.api.api.v1alpha1.org.users.UsersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
