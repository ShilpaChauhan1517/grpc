// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: template.proto

package com.templateService;

/**
 * Protobuf type {@code com.templateService.TemplateResponse}
 */
public  final class TemplateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.templateService.TemplateResponse)
    TemplateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TemplateResponse.newBuilder() to construct.
  private TemplateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TemplateResponse() {
    templateID_ = "";
    templateName_ = "";
    featureList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TemplateResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            templateID_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            templateName_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              featureList_ = new java.util.ArrayList<com.templateService.Feature>();
              mutable_bitField0_ |= 0x00000004;
            }
            featureList_.add(
                input.readMessage(com.templateService.Feature.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        featureList_ = java.util.Collections.unmodifiableList(featureList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.templateService.TemplateOuterClass.internal_static_com_templateService_TemplateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.templateService.TemplateOuterClass.internal_static_com_templateService_TemplateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.templateService.TemplateResponse.class, com.templateService.TemplateResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TEMPLATEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object templateID_;
  /**
   * <code>string templateID = 1;</code>
   */
  public java.lang.String getTemplateID() {
    java.lang.Object ref = templateID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateID_ = s;
      return s;
    }
  }
  /**
   * <code>string templateID = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTemplateIDBytes() {
    java.lang.Object ref = templateID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPLATENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object templateName_;
  /**
   * <code>string templateName = 2;</code>
   */
  public java.lang.String getTemplateName() {
    java.lang.Object ref = templateName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateName_ = s;
      return s;
    }
  }
  /**
   * <code>string templateName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTemplateNameBytes() {
    java.lang.Object ref = templateName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FEATURELIST_FIELD_NUMBER = 3;
  private java.util.List<com.templateService.Feature> featureList_;
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  public java.util.List<com.templateService.Feature> getFeatureListList() {
    return featureList_;
  }
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  public java.util.List<? extends com.templateService.FeatureOrBuilder> 
      getFeatureListOrBuilderList() {
    return featureList_;
  }
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  public int getFeatureListCount() {
    return featureList_.size();
  }
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  public com.templateService.Feature getFeatureList(int index) {
    return featureList_.get(index);
  }
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  public com.templateService.FeatureOrBuilder getFeatureListOrBuilder(
      int index) {
    return featureList_.get(index);
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
    if (!getTemplateIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, templateID_);
    }
    if (!getTemplateNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, templateName_);
    }
    for (int i = 0; i < featureList_.size(); i++) {
      output.writeMessage(3, featureList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTemplateIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, templateID_);
    }
    if (!getTemplateNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, templateName_);
    }
    for (int i = 0; i < featureList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, featureList_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.templateService.TemplateResponse)) {
      return super.equals(obj);
    }
    com.templateService.TemplateResponse other = (com.templateService.TemplateResponse) obj;

    boolean result = true;
    result = result && getTemplateID()
        .equals(other.getTemplateID());
    result = result && getTemplateName()
        .equals(other.getTemplateName());
    result = result && getFeatureListList()
        .equals(other.getFeatureListList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TEMPLATEID_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateID().hashCode();
    hash = (37 * hash) + TEMPLATENAME_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateName().hashCode();
    if (getFeatureListCount() > 0) {
      hash = (37 * hash) + FEATURELIST_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.templateService.TemplateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.templateService.TemplateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.templateService.TemplateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.templateService.TemplateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.templateService.TemplateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.templateService.TemplateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.templateService.TemplateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.templateService.TemplateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.templateService.TemplateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.templateService.TemplateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.templateService.TemplateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.templateService.TemplateResponse parseFrom(
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
  public static Builder newBuilder(com.templateService.TemplateResponse prototype) {
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
   * Protobuf type {@code com.templateService.TemplateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.templateService.TemplateResponse)
      com.templateService.TemplateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.templateService.TemplateOuterClass.internal_static_com_templateService_TemplateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.templateService.TemplateOuterClass.internal_static_com_templateService_TemplateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.templateService.TemplateResponse.class, com.templateService.TemplateResponse.Builder.class);
    }

    // Construct using com.templateService.TemplateResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFeatureListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      templateID_ = "";

      templateName_ = "";

      if (featureListBuilder_ == null) {
        featureList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        featureListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.templateService.TemplateOuterClass.internal_static_com_templateService_TemplateResponse_descriptor;
    }

    @java.lang.Override
    public com.templateService.TemplateResponse getDefaultInstanceForType() {
      return com.templateService.TemplateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.templateService.TemplateResponse build() {
      com.templateService.TemplateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.templateService.TemplateResponse buildPartial() {
      com.templateService.TemplateResponse result = new com.templateService.TemplateResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.templateID_ = templateID_;
      result.templateName_ = templateName_;
      if (featureListBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          featureList_ = java.util.Collections.unmodifiableList(featureList_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.featureList_ = featureList_;
      } else {
        result.featureList_ = featureListBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.templateService.TemplateResponse) {
        return mergeFrom((com.templateService.TemplateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.templateService.TemplateResponse other) {
      if (other == com.templateService.TemplateResponse.getDefaultInstance()) return this;
      if (!other.getTemplateID().isEmpty()) {
        templateID_ = other.templateID_;
        onChanged();
      }
      if (!other.getTemplateName().isEmpty()) {
        templateName_ = other.templateName_;
        onChanged();
      }
      if (featureListBuilder_ == null) {
        if (!other.featureList_.isEmpty()) {
          if (featureList_.isEmpty()) {
            featureList_ = other.featureList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureFeatureListIsMutable();
            featureList_.addAll(other.featureList_);
          }
          onChanged();
        }
      } else {
        if (!other.featureList_.isEmpty()) {
          if (featureListBuilder_.isEmpty()) {
            featureListBuilder_.dispose();
            featureListBuilder_ = null;
            featureList_ = other.featureList_;
            bitField0_ = (bitField0_ & ~0x00000004);
            featureListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFeatureListFieldBuilder() : null;
          } else {
            featureListBuilder_.addAllMessages(other.featureList_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.templateService.TemplateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.templateService.TemplateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object templateID_ = "";
    /**
     * <code>string templateID = 1;</code>
     */
    public java.lang.String getTemplateID() {
      java.lang.Object ref = templateID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string templateID = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTemplateIDBytes() {
      java.lang.Object ref = templateID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string templateID = 1;</code>
     */
    public Builder setTemplateID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string templateID = 1;</code>
     */
    public Builder clearTemplateID() {
      
      templateID_ = getDefaultInstance().getTemplateID();
      onChanged();
      return this;
    }
    /**
     * <code>string templateID = 1;</code>
     */
    public Builder setTemplateIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateID_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object templateName_ = "";
    /**
     * <code>string templateName = 2;</code>
     */
    public java.lang.String getTemplateName() {
      java.lang.Object ref = templateName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string templateName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTemplateNameBytes() {
      java.lang.Object ref = templateName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string templateName = 2;</code>
     */
    public Builder setTemplateName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string templateName = 2;</code>
     */
    public Builder clearTemplateName() {
      
      templateName_ = getDefaultInstance().getTemplateName();
      onChanged();
      return this;
    }
    /**
     * <code>string templateName = 2;</code>
     */
    public Builder setTemplateNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.templateService.Feature> featureList_ =
      java.util.Collections.emptyList();
    private void ensureFeatureListIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        featureList_ = new java.util.ArrayList<com.templateService.Feature>(featureList_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.templateService.Feature, com.templateService.Feature.Builder, com.templateService.FeatureOrBuilder> featureListBuilder_;

    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public java.util.List<com.templateService.Feature> getFeatureListList() {
      if (featureListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(featureList_);
      } else {
        return featureListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public int getFeatureListCount() {
      if (featureListBuilder_ == null) {
        return featureList_.size();
      } else {
        return featureListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public com.templateService.Feature getFeatureList(int index) {
      if (featureListBuilder_ == null) {
        return featureList_.get(index);
      } else {
        return featureListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder setFeatureList(
        int index, com.templateService.Feature value) {
      if (featureListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureListIsMutable();
        featureList_.set(index, value);
        onChanged();
      } else {
        featureListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder setFeatureList(
        int index, com.templateService.Feature.Builder builderForValue) {
      if (featureListBuilder_ == null) {
        ensureFeatureListIsMutable();
        featureList_.set(index, builderForValue.build());
        onChanged();
      } else {
        featureListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder addFeatureList(com.templateService.Feature value) {
      if (featureListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureListIsMutable();
        featureList_.add(value);
        onChanged();
      } else {
        featureListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder addFeatureList(
        int index, com.templateService.Feature value) {
      if (featureListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureListIsMutable();
        featureList_.add(index, value);
        onChanged();
      } else {
        featureListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder addFeatureList(
        com.templateService.Feature.Builder builderForValue) {
      if (featureListBuilder_ == null) {
        ensureFeatureListIsMutable();
        featureList_.add(builderForValue.build());
        onChanged();
      } else {
        featureListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder addFeatureList(
        int index, com.templateService.Feature.Builder builderForValue) {
      if (featureListBuilder_ == null) {
        ensureFeatureListIsMutable();
        featureList_.add(index, builderForValue.build());
        onChanged();
      } else {
        featureListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder addAllFeatureList(
        java.lang.Iterable<? extends com.templateService.Feature> values) {
      if (featureListBuilder_ == null) {
        ensureFeatureListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, featureList_);
        onChanged();
      } else {
        featureListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder clearFeatureList() {
      if (featureListBuilder_ == null) {
        featureList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        featureListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public Builder removeFeatureList(int index) {
      if (featureListBuilder_ == null) {
        ensureFeatureListIsMutable();
        featureList_.remove(index);
        onChanged();
      } else {
        featureListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public com.templateService.Feature.Builder getFeatureListBuilder(
        int index) {
      return getFeatureListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public com.templateService.FeatureOrBuilder getFeatureListOrBuilder(
        int index) {
      if (featureListBuilder_ == null) {
        return featureList_.get(index);  } else {
        return featureListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public java.util.List<? extends com.templateService.FeatureOrBuilder> 
         getFeatureListOrBuilderList() {
      if (featureListBuilder_ != null) {
        return featureListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(featureList_);
      }
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public com.templateService.Feature.Builder addFeatureListBuilder() {
      return getFeatureListFieldBuilder().addBuilder(
          com.templateService.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public com.templateService.Feature.Builder addFeatureListBuilder(
        int index) {
      return getFeatureListFieldBuilder().addBuilder(
          index, com.templateService.Feature.getDefaultInstance());
    }
    /**
     * <code>repeated .com.templateService.Feature featureList = 3;</code>
     */
    public java.util.List<com.templateService.Feature.Builder> 
         getFeatureListBuilderList() {
      return getFeatureListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.templateService.Feature, com.templateService.Feature.Builder, com.templateService.FeatureOrBuilder> 
        getFeatureListFieldBuilder() {
      if (featureListBuilder_ == null) {
        featureListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.templateService.Feature, com.templateService.Feature.Builder, com.templateService.FeatureOrBuilder>(
                featureList_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        featureList_ = null;
      }
      return featureListBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.templateService.TemplateResponse)
  }

  // @@protoc_insertion_point(class_scope:com.templateService.TemplateResponse)
  private static final com.templateService.TemplateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.templateService.TemplateResponse();
  }

  public static com.templateService.TemplateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TemplateResponse>
      PARSER = new com.google.protobuf.AbstractParser<TemplateResponse>() {
    @java.lang.Override
    public TemplateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TemplateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TemplateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TemplateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.templateService.TemplateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

