// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/permissions.proto

package com.tcn.cloud.api.api.commons.org;

public interface LicenseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.License)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Application containing licenses.
   * </pre>
   *
   * <code>.annotations.perms.Application app = 1 [json_name = "app"];</code>
   * @return The enum numeric value on the wire for app.
   */
  int getAppValue();
  /**
   * <pre>
   * Application containing licenses.
   * </pre>
   *
   * <code>.annotations.perms.Application app = 1 [json_name = "app"];</code>
   * @return The app.
   */
  com.tcn.cloud.api.annotations.perms.Application getApp();

  /**
   * <pre>
   * Individual cards for the application.
   * </pre>
   *
   * <code>repeated .api.commons.org.License.Card cards = 2 [json_name = "cards"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.License.Card> 
      getCardsList();
  /**
   * <pre>
   * Individual cards for the application.
   * </pre>
   *
   * <code>repeated .api.commons.org.License.Card cards = 2 [json_name = "cards"];</code>
   */
  com.tcn.cloud.api.api.commons.org.License.Card getCards(int index);
  /**
   * <pre>
   * Individual cards for the application.
   * </pre>
   *
   * <code>repeated .api.commons.org.License.Card cards = 2 [json_name = "cards"];</code>
   */
  int getCardsCount();
  /**
   * <pre>
   * Individual cards for the application.
   * </pre>
   *
   * <code>repeated .api.commons.org.License.Card cards = 2 [json_name = "cards"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.License.CardOrBuilder> 
      getCardsOrBuilderList();
  /**
   * <pre>
   * Individual cards for the application.
   * </pre>
   *
   * <code>repeated .api.commons.org.License.Card cards = 2 [json_name = "cards"];</code>
   */
  com.tcn.cloud.api.api.commons.org.License.CardOrBuilder getCardsOrBuilder(
      int index);
}
