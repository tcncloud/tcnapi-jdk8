// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/vanalytics/transcript.proto

package com.tcn.cloud.api.api.v1alpha1.vanalytics;

/**
 * Protobuf type {@code api.v1alpha1.vanalytics.Segment}
 */
public final class Segment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.v1alpha1.vanalytics.Segment)
    SegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Segment.newBuilder() to construct.
  private Segment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Segment() {
    text_ = "";
    words_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Segment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_Segment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_Segment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.Builder.class);
  }

  public static final int BEGIN_TIME_FIELD_NUMBER = 1;
  private int beginTime_ = 0;
  /**
   * <pre>
   * begin time in milliseconds
   * </pre>
   *
   * <code>uint32 begin_time = 1 [json_name = "beginTime"];</code>
   * @return The beginTime.
   */
  @java.lang.Override
  public int getBeginTime() {
    return beginTime_;
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private int confidence_ = 0;
  /**
   * <pre>
   * confidence from 0 to 100
   * </pre>
   *
   * <code>uint32 confidence = 2 [json_name = "confidence"];</code>
   * @return The confidence.
   */
  @java.lang.Override
  public int getConfidence() {
    return confidence_;
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  private int duration_ = 0;
  /**
   * <pre>
   * duration in milliseconds
   * </pre>
   *
   * <code>uint32 duration = 3 [json_name = "duration"];</code>
   * @return The duration.
   */
  @java.lang.Override
  public int getDuration() {
    return duration_;
  }

  public static final int TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <code>string text = 4 [json_name = "text"];</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <code>string text = 4 [json_name = "text"];</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WORDS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Word> words_;
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Word> getWordsList() {
    return words_;
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder> 
      getWordsOrBuilderList() {
    return words_;
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
   */
  @java.lang.Override
  public int getWordsCount() {
    return words_.size();
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.Word getWords(int index) {
    return words_.get(index);
  }
  /**
   * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
   */
  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder getWordsOrBuilder(
      int index) {
    return words_.get(index);
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
    if (beginTime_ != 0) {
      output.writeUInt32(1, beginTime_);
    }
    if (confidence_ != 0) {
      output.writeUInt32(2, confidence_);
    }
    if (duration_ != 0) {
      output.writeUInt32(3, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, text_);
    }
    for (int i = 0; i < words_.size(); i++) {
      output.writeMessage(5, words_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (beginTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, beginTime_);
    }
    if (confidence_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, confidence_);
    }
    if (duration_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, duration_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, text_);
    }
    for (int i = 0; i < words_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, words_.get(i));
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
    if (!(obj instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment)) {
      return super.equals(obj);
    }
    com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment other = (com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment) obj;

    if (getBeginTime()
        != other.getBeginTime()) return false;
    if (getConfidence()
        != other.getConfidence()) return false;
    if (getDuration()
        != other.getDuration()) return false;
    if (!getText()
        .equals(other.getText())) return false;
    if (!getWordsList()
        .equals(other.getWordsList())) return false;
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
    hash = (37 * hash) + BEGIN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getBeginTime();
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + getConfidence();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration();
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    if (getWordsCount() > 0) {
      hash = (37 * hash) + WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getWordsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment parseFrom(
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
  public static Builder newBuilder(com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment prototype) {
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
   * Protobuf type {@code api.v1alpha1.vanalytics.Segment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.v1alpha1.vanalytics.Segment)
      com.tcn.cloud.api.api.v1alpha1.vanalytics.SegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_Segment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_Segment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.class, com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.Builder.class);
    }

    // Construct using com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.newBuilder()
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
      beginTime_ = 0;
      confidence_ = 0;
      duration_ = 0;
      text_ = "";
      if (wordsBuilder_ == null) {
        words_ = java.util.Collections.emptyList();
      } else {
        words_ = null;
        wordsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.TranscriptProto.internal_static_api_v1alpha1_vanalytics_Segment_descriptor;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment getDefaultInstanceForType() {
      return com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.getDefaultInstance();
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment build() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment buildPartial() {
      com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment result = new com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment result) {
      if (wordsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0)) {
          words_ = java.util.Collections.unmodifiableList(words_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.words_ = words_;
      } else {
        result.words_ = wordsBuilder_.build();
      }
    }

    private void buildPartial0(com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.beginTime_ = beginTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.confidence_ = confidence_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.duration_ = duration_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.text_ = text_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment) {
        return mergeFrom((com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment other) {
      if (other == com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment.getDefaultInstance()) return this;
      if (other.getBeginTime() != 0) {
        setBeginTime(other.getBeginTime());
      }
      if (other.getConfidence() != 0) {
        setConfidence(other.getConfidence());
      }
      if (other.getDuration() != 0) {
        setDuration(other.getDuration());
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (wordsBuilder_ == null) {
        if (!other.words_.isEmpty()) {
          if (words_.isEmpty()) {
            words_ = other.words_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureWordsIsMutable();
            words_.addAll(other.words_);
          }
          onChanged();
        }
      } else {
        if (!other.words_.isEmpty()) {
          if (wordsBuilder_.isEmpty()) {
            wordsBuilder_.dispose();
            wordsBuilder_ = null;
            words_ = other.words_;
            bitField0_ = (bitField0_ & ~0x00000010);
            wordsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWordsFieldBuilder() : null;
          } else {
            wordsBuilder_.addAllMessages(other.words_);
          }
        }
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
            case 8: {
              beginTime_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              confidence_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              duration_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              com.tcn.cloud.api.api.v1alpha1.vanalytics.Word m =
                  input.readMessage(
                      com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.parser(),
                      extensionRegistry);
              if (wordsBuilder_ == null) {
                ensureWordsIsMutable();
                words_.add(m);
              } else {
                wordsBuilder_.addMessage(m);
              }
              break;
            } // case 42
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

    private int beginTime_ ;
    /**
     * <pre>
     * begin time in milliseconds
     * </pre>
     *
     * <code>uint32 begin_time = 1 [json_name = "beginTime"];</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public int getBeginTime() {
      return beginTime_;
    }
    /**
     * <pre>
     * begin time in milliseconds
     * </pre>
     *
     * <code>uint32 begin_time = 1 [json_name = "beginTime"];</code>
     * @param value The beginTime to set.
     * @return This builder for chaining.
     */
    public Builder setBeginTime(int value) {

      beginTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * begin time in milliseconds
     * </pre>
     *
     * <code>uint32 begin_time = 1 [json_name = "beginTime"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBeginTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      beginTime_ = 0;
      onChanged();
      return this;
    }

    private int confidence_ ;
    /**
     * <pre>
     * confidence from 0 to 100
     * </pre>
     *
     * <code>uint32 confidence = 2 [json_name = "confidence"];</code>
     * @return The confidence.
     */
    @java.lang.Override
    public int getConfidence() {
      return confidence_;
    }
    /**
     * <pre>
     * confidence from 0 to 100
     * </pre>
     *
     * <code>uint32 confidence = 2 [json_name = "confidence"];</code>
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(int value) {

      confidence_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * confidence from 0 to 100
     * </pre>
     *
     * <code>uint32 confidence = 2 [json_name = "confidence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      bitField0_ = (bitField0_ & ~0x00000002);
      confidence_ = 0;
      onChanged();
      return this;
    }

    private int duration_ ;
    /**
     * <pre>
     * duration in milliseconds
     * </pre>
     *
     * <code>uint32 duration = 3 [json_name = "duration"];</code>
     * @return The duration.
     */
    @java.lang.Override
    public int getDuration() {
      return duration_;
    }
    /**
     * <pre>
     * duration in milliseconds
     * </pre>
     *
     * <code>uint32 duration = 3 [json_name = "duration"];</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(int value) {

      duration_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * duration in milliseconds
     * </pre>
     *
     * <code>uint32 duration = 3 [json_name = "duration"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      bitField0_ = (bitField0_ & ~0x00000004);
      duration_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <code>string text = 4 [json_name = "text"];</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text = 4 [json_name = "text"];</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text = 4 [json_name = "text"];</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string text = 4 [json_name = "text"];</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string text = 4 [json_name = "text"];</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Word> words_ =
      java.util.Collections.emptyList();
    private void ensureWordsIsMutable() {
      if (!((bitField0_ & 0x00000010) != 0)) {
        words_ = new java.util.ArrayList<com.tcn.cloud.api.api.v1alpha1.vanalytics.Word>(words_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.Word, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder> wordsBuilder_;

    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Word> getWordsList() {
      if (wordsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(words_);
      } else {
        return wordsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public int getWordsCount() {
      if (wordsBuilder_ == null) {
        return words_.size();
      } else {
        return wordsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Word getWords(int index) {
      if (wordsBuilder_ == null) {
        return words_.get(index);
      } else {
        return wordsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder setWords(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.set(index, value);
        onChanged();
      } else {
        wordsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder setWords(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.set(index, builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder addWords(com.tcn.cloud.api.api.v1alpha1.vanalytics.Word value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.add(value);
        onChanged();
      } else {
        wordsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder addWords(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word value) {
      if (wordsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWordsIsMutable();
        words_.add(index, value);
        onChanged();
      } else {
        wordsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder addWords(
        com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.add(builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder addWords(
        int index, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder builderForValue) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.add(index, builderForValue.build());
        onChanged();
      } else {
        wordsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder addAllWords(
        java.lang.Iterable<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.Word> values) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, words_);
        onChanged();
      } else {
        wordsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder clearWords() {
      if (wordsBuilder_ == null) {
        words_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        wordsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public Builder removeWords(int index) {
      if (wordsBuilder_ == null) {
        ensureWordsIsMutable();
        words_.remove(index);
        onChanged();
      } else {
        wordsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder getWordsBuilder(
        int index) {
      return getWordsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder getWordsOrBuilder(
        int index) {
      if (wordsBuilder_ == null) {
        return words_.get(index);  } else {
        return wordsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder> 
         getWordsOrBuilderList() {
      if (wordsBuilder_ != null) {
        return wordsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(words_);
      }
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder addWordsBuilder() {
      return getWordsFieldBuilder().addBuilder(
          com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder addWordsBuilder(
        int index) {
      return getWordsFieldBuilder().addBuilder(
          index, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.getDefaultInstance());
    }
    /**
     * <code>repeated .api.v1alpha1.vanalytics.Word words = 5 [json_name = "words"];</code>
     */
    public java.util.List<com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder> 
         getWordsBuilderList() {
      return getWordsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tcn.cloud.api.api.v1alpha1.vanalytics.Word, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder> 
        getWordsFieldBuilder() {
      if (wordsBuilder_ == null) {
        wordsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tcn.cloud.api.api.v1alpha1.vanalytics.Word, com.tcn.cloud.api.api.v1alpha1.vanalytics.Word.Builder, com.tcn.cloud.api.api.v1alpha1.vanalytics.WordOrBuilder>(
                words_,
                ((bitField0_ & 0x00000010) != 0),
                getParentForChildren(),
                isClean());
        words_ = null;
      }
      return wordsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.v1alpha1.vanalytics.Segment)
  }

  // @@protoc_insertion_point(class_scope:api.v1alpha1.vanalytics.Segment)
  private static final com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment();
  }

  public static com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Segment>
      PARSER = new com.google.protobuf.AbstractParser<Segment>() {
    @java.lang.Override
    public Segment parsePartialFrom(
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

  public static com.google.protobuf.Parser<Segment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Segment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tcn.cloud.api.api.v1alpha1.vanalytics.Segment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

