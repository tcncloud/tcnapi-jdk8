// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrationspublic/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrationspublic;

public interface PortalConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrationspublic.PortalConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 21 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 21 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string name = 22 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 22 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 23 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 23 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * link to pull up a chat with customer service
   * </pre>
   *
   * <code>string chat_client_link = 2 [json_name = "chatClientLink"];</code>
   * @return The chatClientLink.
   */
  java.lang.String getChatClientLink();
  /**
   * <pre>
   * link to pull up a chat with customer service
   * </pre>
   *
   * <code>string chat_client_link = 2 [json_name = "chatClientLink"];</code>
   * @return The bytes for chatClientLink.
   */
  com.google.protobuf.ByteString
      getChatClientLinkBytes();

  /**
   * <code>string contact_email = 3 [json_name = "contactEmail"];</code>
   * @return The contactEmail.
   */
  java.lang.String getContactEmail();
  /**
   * <code>string contact_email = 3 [json_name = "contactEmail"];</code>
   * @return The bytes for contactEmail.
   */
  com.google.protobuf.ByteString
      getContactEmailBytes();

  /**
   * <code>string contact_phone = 4 [json_name = "contactPhone"];</code>
   * @return The contactPhone.
   */
  java.lang.String getContactPhone();
  /**
   * <code>string contact_phone = 4 [json_name = "contactPhone"];</code>
   * @return The bytes for contactPhone.
   */
  com.google.protobuf.ByteString
      getContactPhoneBytes();

  /**
   * <code>string postal_code = 5 [json_name = "postalCode"];</code>
   * @return The postalCode.
   */
  java.lang.String getPostalCode();
  /**
   * <code>string postal_code = 5 [json_name = "postalCode"];</code>
   * @return The bytes for postalCode.
   */
  com.google.protobuf.ByteString
      getPostalCodeBytes();

  /**
   * <code>string city = 6 [json_name = "city"];</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 6 [json_name = "city"];</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string state = 7 [json_name = "state"];</code>
   * @return The state.
   */
  java.lang.String getState();
  /**
   * <code>string state = 7 [json_name = "state"];</code>
   * @return The bytes for state.
   */
  com.google.protobuf.ByteString
      getStateBytes();

  /**
   * <code>string company_name = 8 [json_name = "companyName"];</code>
   * @return The companyName.
   */
  java.lang.String getCompanyName();
  /**
   * <code>string company_name = 8 [json_name = "companyName"];</code>
   * @return The bytes for companyName.
   */
  com.google.protobuf.ByteString
      getCompanyNameBytes();

  /**
   * <pre>
   * is the logo used in the corner of the payment portal screen
   * </pre>
   *
   * <code>bytes logo = 13 [json_name = "logo"];</code>
   * @return The logo.
   */
  com.google.protobuf.ByteString getLogo();

  /**
   * <pre>
   * is the primary color used for the portal screen
   * </pre>
   *
   * <code>string primary_color = 14 [json_name = "primaryColor"];</code>
   * @return The primaryColor.
   */
  java.lang.String getPrimaryColor();
  /**
   * <pre>
   * is the primary color used for the portal screen
   * </pre>
   *
   * <code>string primary_color = 14 [json_name = "primaryColor"];</code>
   * @return The bytes for primaryColor.
   */
  com.google.protobuf.ByteString
      getPrimaryColorBytes();

  /**
   * <pre>
   * accent color used on the portal screen
   * </pre>
   *
   * <code>string secondary_color = 15 [json_name = "secondaryColor"];</code>
   * @return The secondaryColor.
   */
  java.lang.String getSecondaryColor();
  /**
   * <pre>
   * accent color used on the portal screen
   * </pre>
   *
   * <code>string secondary_color = 15 [json_name = "secondaryColor"];</code>
   * @return The bytes for secondaryColor.
   */
  com.google.protobuf.ByteString
      getSecondaryColorBytes();

  /**
   * <code>string street_address = 19 [json_name = "streetAddress"];</code>
   * @return The streetAddress.
   */
  java.lang.String getStreetAddress();
  /**
   * <code>string street_address = 19 [json_name = "streetAddress"];</code>
   * @return The bytes for streetAddress.
   */
  com.google.protobuf.ByteString
      getStreetAddressBytes();
}
