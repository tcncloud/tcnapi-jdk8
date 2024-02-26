// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/idp.proto

package com.tcn.cloud.api.api.commons.org;

public interface IdpClientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.IdpClient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The id of the client.
   * </pre>
   *
   * <code>string idp_client_id = 1 [json_name = "idpClientId"];</code>
   * @return The idpClientId.
   */
  java.lang.String getIdpClientId();
  /**
   * <pre>
   * The id of the client.
   * </pre>
   *
   * <code>string idp_client_id = 1 [json_name = "idpClientId"];</code>
   * @return The bytes for idpClientId.
   */
  com.google.protobuf.ByteString
      getIdpClientIdBytes();

  /**
   * <pre>
   * The secret of the client.
   * This field cannot be updated after creation.
   * </pre>
   *
   * <code>string secret = 2 [json_name = "secret"];</code>
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   * <pre>
   * The secret of the client.
   * This field cannot be updated after creation.
   * </pre>
   *
   * <code>string secret = 2 [json_name = "secret"];</code>
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString
      getSecretBytes();

  /**
   * <pre>
   * The clients allowed redirect uris.
   * </pre>
   *
   * <code>repeated string redirect_uris = 3 [json_name = "redirectUris"];</code>
   * @return A list containing the redirectUris.
   */
  java.util.List<java.lang.String>
      getRedirectUrisList();
  /**
   * <pre>
   * The clients allowed redirect uris.
   * </pre>
   *
   * <code>repeated string redirect_uris = 3 [json_name = "redirectUris"];</code>
   * @return The count of redirectUris.
   */
  int getRedirectUrisCount();
  /**
   * <pre>
   * The clients allowed redirect uris.
   * </pre>
   *
   * <code>repeated string redirect_uris = 3 [json_name = "redirectUris"];</code>
   * @param index The index of the element to return.
   * @return The redirectUris at the given index.
   */
  java.lang.String getRedirectUris(int index);
  /**
   * <pre>
   * The clients allowed redirect uris.
   * </pre>
   *
   * <code>repeated string redirect_uris = 3 [json_name = "redirectUris"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the redirectUris at the given index.
   */
  com.google.protobuf.ByteString
      getRedirectUrisBytes(int index);

  /**
   * <pre>
   * The clients trusted peers
   * </pre>
   *
   * <code>repeated string trusted_peers = 4 [json_name = "trustedPeers"];</code>
   * @return A list containing the trustedPeers.
   */
  java.util.List<java.lang.String>
      getTrustedPeersList();
  /**
   * <pre>
   * The clients trusted peers
   * </pre>
   *
   * <code>repeated string trusted_peers = 4 [json_name = "trustedPeers"];</code>
   * @return The count of trustedPeers.
   */
  int getTrustedPeersCount();
  /**
   * <pre>
   * The clients trusted peers
   * </pre>
   *
   * <code>repeated string trusted_peers = 4 [json_name = "trustedPeers"];</code>
   * @param index The index of the element to return.
   * @return The trustedPeers at the given index.
   */
  java.lang.String getTrustedPeers(int index);
  /**
   * <pre>
   * The clients trusted peers
   * </pre>
   *
   * <code>repeated string trusted_peers = 4 [json_name = "trustedPeers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the trustedPeers at the given index.
   */
  com.google.protobuf.ByteString
      getTrustedPeersBytes(int index);

  /**
   * <pre>
   * The name of the client.
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the client.
   * </pre>
   *
   * <code>string name = 5 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
