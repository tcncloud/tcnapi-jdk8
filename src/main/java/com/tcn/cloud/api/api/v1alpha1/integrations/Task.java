// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

/**
 * Protobuf type {@code api.v1alpha1.integrations.Task}
 */
public final class Task extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.integrations.Task)
    TaskOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Task.newBuilder() to construct.
  private Task(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Task() {
    taskId_ = "";
    src_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Task();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_Task_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_Task_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.integrations.Task.class, com.tcn.cloud.api.api.v1alpha1.integrations.Task.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>newDefaultInstance(
                com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_Task_ValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.tcn.cloud.api.api.v1alpha1.integrations.Value.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> values_;
  private com.google.protobuf.MapField<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
  internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }
  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   * <pre>
   * the data used to fetch info about this task when the user clicks on a link
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public boolean containsValues(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> getValues() {
    return getValuesMap();
  }
  /**
   * <pre>
   * the data used to fetch info about this task when the user clicks on a link
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   * <pre>
   * the data used to fetch info about this task when the user clicks on a link
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getValuesOrDefault(
      java.lang.String key,
      /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> map =
        internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * the data used to fetch info about this task when the user clicks on a link
   * </pre>
   *
   * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.Value getValuesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> map =
        internalGetValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int TASK_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object taskId_ = "";
  /**
   * <pre>
   * the sms_id, email_id, etc that can be used to identify what generated this link
   * </pre>
   *
   * <code>string task_id = 2 [json_name = "taskId"];</code>
   * @return The taskId.
   */
  @java.lang.Override
  public java.lang.String getTaskId() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      taskId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * the sms_id, email_id, etc that can be used to identify what generated this link
   * </pre>
   *
   * <code>string task_id = 2 [json_name = "taskId"];</code>
   * @return The bytes for taskId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTaskIdBytes() {
    java.lang.Object ref = taskId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      taskId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SRC_FIELD_NUMBER = 3;
  private int src_ = 0;
  /**
   * <pre>
   * the type of the source for this link. ex: Email, Sms, Chat
   * </pre>
   *
   * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
   * @return The enum numeric value on the wire for src.
   */
  @java.lang.Override public int getSrcValue() {
    return src_;
  }
  /**
   * <pre>
   * the type of the source for this link. ex: Email, Sms, Chat
   * </pre>
   *
   * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
   * @return The src.
   */
  @java.lang.Override public com.tcn.cloud.api.api.commons.integrations.RequestSource getSrc() {
    com.tcn.cloud.api.api.commons.integrations.RequestSource result = com.tcn.cloud.api.api.commons.integrations.RequestSource.forNumber(src_);
    return result == null ? com.tcn.cloud.api.api.commons.integrations.RequestSource.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetValues(),
        ValuesDefaultEntryHolder.defaultEntry,
        1);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, taskId_);
    }
    if (src_ != com.tcn.cloud.api.api.commons.integrations.RequestSource.REQUEST_SOURCE_IVR.getNumber()) {
      output.writeEnum(3, src_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> entry
         : internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
      values__ = ValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, values__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(taskId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, taskId_);
    }
    if (src_ != com.tcn.cloud.api.api.commons.integrations.RequestSource.REQUEST_SOURCE_IVR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, src_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.integrations.Task)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.integrations.Task other = (com.tcn.cloud.api.api.v1alpha1.integrations.Task) obj;

    if (!internalGetValues().equals(
        other.internalGetValues())) return false;
    if (!getTaskId()
        .equals(other.getTaskId())) return false;
    if (src_ != other.src_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (37 * hash) + TASK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTaskId().hashCode();
    hash = (37 * hash) + SRC_FIELD_NUMBER;
    hash = (53 * hash) + src_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.integrations.Task prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.v1alpha1.integrations.Task}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.integrations.Task)
      com.tcn.cloud.api.api.v1alpha1.integrations.TaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_Task_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_Task_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.integrations.Task.class, com.tcn.cloud.api.api.v1alpha1.integrations.Task.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.integrations.Task.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableValues().clear();
      taskId_ = "";
      src_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.ServiceProto.internal_static_api_v1alpha1_integrations_Task_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.Task getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.integrations.Task.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.Task build() {
      com.tcn.cloud.api.api.v1alpha1.integrations.Task result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.Task buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.integrations.Task result = new com.tcn.cloud.api.api.v1alpha1.integrations.Task(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.integrations.Task result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.values_ = internalGetValues();
        result.values_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.taskId_ = taskId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.src_ = src_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.integrations.Task) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.integrations.Task)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.integrations.Task other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.integrations.Task.getDefaultInstance()) return this;
      internalGetMutableValues().mergeFrom(
          other.internalGetValues());
      bitField0_ |= 0x00000001;
      if (!other.getTaskId().isEmpty()) {
        taskId_ = other.taskId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.src_ != 0) {
        setSrcValue(other.getSrcValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
              values__ = input.readMessage(
                  ValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableValues().getMutableMap().put(
                  values__.getKey(), values__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              taskId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              src_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> values_;
    private com.google.protobuf.MapField<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
        internalGetValues() {
      if (values_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      return values_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
        internalGetMutableValues() {
      if (values_ == null) {
        values_ = com.google.protobuf.MapField.newMapField(
            ValuesDefaultEntryHolder.defaultEntry);
      }
      if (!values_.isMutable()) {
        values_ = values_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return values_;
    }
    public int getValuesCount() {
      return internalGetValues().getMap().size();
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    @java.lang.Override
    public boolean containsValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetValues().getMap().containsKey(key);
    }
    /**
     * Use {@link #getValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> getValues() {
      return getValuesMap();
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> getValuesMap() {
      return internalGetValues().getMap();
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    @java.lang.Override
    public /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value getValuesOrDefault(
        java.lang.String key,
        /* nullable */
com.tcn.cloud.api.api.v1alpha1.integrations.Value defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> map =
          internalGetValues().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.integrations.Value getValuesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> map =
          internalGetValues().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearValues() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableValues().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    public Builder removeValues(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableValues().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value>
        getMutableValues() {
      bitField0_ |= 0x00000001;
      return internalGetMutableValues().getMutableMap();
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    public Builder putValues(
        java.lang.String key,
        com.tcn.cloud.api.api.v1alpha1.integrations.Value value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableValues().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * the data used to fetch info about this task when the user clicks on a link
     * </pre>
     *
     * <code>map&lt;string, .api.v1alpha1.integrations.Value&gt; values = 1 [json_name = "values"];</code>
     */
    public Builder putAllValues(
        java.util.Map<java.lang.String, com.tcn.cloud.api.api.v1alpha1.integrations.Value> values) {
      internalGetMutableValues().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private java.lang.Object taskId_ = "";
    /**
     * <pre>
     * the sms_id, email_id, etc that can be used to identify what generated this link
     * </pre>
     *
     * <code>string task_id = 2 [json_name = "taskId"];</code>
     * @return The taskId.
     */
    public java.lang.String getTaskId() {
      java.lang.Object ref = taskId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        taskId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * the sms_id, email_id, etc that can be used to identify what generated this link
     * </pre>
     *
     * <code>string task_id = 2 [json_name = "taskId"];</code>
     * @return The bytes for taskId.
     */
    public com.google.protobuf.ByteString
        getTaskIdBytes() {
      java.lang.Object ref = taskId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        taskId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * the sms_id, email_id, etc that can be used to identify what generated this link
     * </pre>
     *
     * <code>string task_id = 2 [json_name = "taskId"];</code>
     * @param value The taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      taskId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the sms_id, email_id, etc that can be used to identify what generated this link
     * </pre>
     *
     * <code>string task_id = 2 [json_name = "taskId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTaskId() {
      taskId_ = getDefaultInstance().getTaskId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the sms_id, email_id, etc that can be used to identify what generated this link
     * </pre>
     *
     * <code>string task_id = 2 [json_name = "taskId"];</code>
     * @param value The bytes for taskId to set.
     * @return This builder for chaining.
     */
    public Builder setTaskIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      taskId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int src_ = 0;
    /**
     * <pre>
     * the type of the source for this link. ex: Email, Sms, Chat
     * </pre>
     *
     * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
     * @return The enum numeric value on the wire for src.
     */
    @java.lang.Override public int getSrcValue() {
      return src_;
    }
    /**
     * <pre>
     * the type of the source for this link. ex: Email, Sms, Chat
     * </pre>
     *
     * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
     * @param value The enum numeric value on the wire for src to set.
     * @return This builder for chaining.
     */
    public Builder setSrcValue(int value) {
      src_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of the source for this link. ex: Email, Sms, Chat
     * </pre>
     *
     * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
     * @return The src.
     */
    @java.lang.Override
    public com.tcn.cloud.api.api.commons.integrations.RequestSource getSrc() {
      com.tcn.cloud.api.api.commons.integrations.RequestSource result = com.tcn.cloud.api.api.commons.integrations.RequestSource.forNumber(src_);
      return result == null ? com.tcn.cloud.api.api.commons.integrations.RequestSource.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * the type of the source for this link. ex: Email, Sms, Chat
     * </pre>
     *
     * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
     * @param value The src to set.
     * @return This builder for chaining.
     */
    public Builder setSrc(com.tcn.cloud.api.api.commons.integrations.RequestSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      src_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the type of the source for this link. ex: Email, Sms, Chat
     * </pre>
     *
     * <code>.api.commons.integrations.RequestSource src = 3 [json_name = "src"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSrc() {
      bitField0_ = (bitField0_ & ~0x00000004);
      src_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.integrations.Task)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.integrations.Task)
  private static final com.tcn.cloud.api.api.v1alpha1.integrations.Task DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.integrations.Task();
  }

  public static com.tcn.cloud.api.api.v1alpha1.integrations.Task getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Task>
      PARSER = new com.google.protobuf.AbstractParser<Task>() {
    @java.lang.Override
    public Task parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Task> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Task> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.integrations.Task getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

