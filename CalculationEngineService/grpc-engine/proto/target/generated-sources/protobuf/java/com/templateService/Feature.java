// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: template.proto

package com.templateService;

/**
 * Protobuf type {@code com.templateService.Feature}
 */
public  final class Feature extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.templateService.Feature)
    FeatureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Feature.newBuilder() to construct.
  private Feature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Feature() {
    seqID_ = 0;
    featureName_ = "";
    attributeName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Feature(
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
          case 8: {

            seqID_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            featureName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            attributeName_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.templateService.TemplateOuterClass.internal_static_com_templateService_Feature_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.templateService.TemplateOuterClass.internal_static_com_templateService_Feature_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.templateService.Feature.class, com.templateService.Feature.Builder.class);
  }

  public static final int SEQID_FIELD_NUMBER = 1;
  private int seqID_;
  /**
   * <code>int32 seqID = 1;</code>
   */
  public int getSeqID() {
    return seqID_;
  }

  public static final int FEATURENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object featureName_;
  /**
   * <code>string featureName = 2;</code>
   */
  public java.lang.String getFeatureName() {
    java.lang.Object ref = featureName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureName_ = s;
      return s;
    }
  }
  /**
   * <code>string featureName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFeatureNameBytes() {
    java.lang.Object ref = featureName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      featureName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object attributeName_;
  /**
   * <code>string attributeName = 3;</code>
   */
  public java.lang.String getAttributeName() {
    java.lang.Object ref = attributeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attributeName_ = s;
      return s;
    }
  }
  /**
   * <code>string attributeName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAttributeNameBytes() {
    java.lang.Object ref = attributeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attributeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (seqID_ != 0) {
      output.writeInt32(1, seqID_);
    }
    if (!getFeatureNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, featureName_);
    }
    if (!getAttributeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, attributeName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (seqID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, seqID_);
    }
    if (!getFeatureNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, featureName_);
    }
    if (!getAttributeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, attributeName_);
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
    if (!(obj instanceof com.templateService.Feature)) {
      return super.equals(obj);
    }
    com.templateService.Feature other = (com.templateService.Feature) obj;

    boolean result = true;
    result = result && (getSeqID()
        == other.getSeqID());
    result = result && getFeatureName()
        .equals(other.getFeatureName());
    result = result && getAttributeName()
        .equals(other.getAttributeName());
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
    hash = (37 * hash) + SEQID_FIELD_NUMBER;
    hash = (53 * hash) + getSeqID();
    hash = (37 * hash) + FEATURENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureName().hashCode();
    hash = (37 * hash) + ATTRIBUTENAME_FIELD_NUMBER;
    hash = (53 * hash) + getAttributeName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.templateService.Feature parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.templateService.Feature parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.templateService.Feature parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.templateService.Feature parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.templateService.Feature parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.templateService.Feature parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.templateService.Feature parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.templateService.Feature parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.templateService.Feature parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.templateService.Feature parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.templateService.Feature parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.templateService.Feature parseFrom(
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
  public static Builder newBuilder(com.templateService.Feature prototype) {
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
   * Protobuf type {@code com.templateService.Feature}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.templateService.Feature)
      com.templateService.FeatureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.templateService.TemplateOuterClass.internal_static_com_templateService_Feature_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.templateService.TemplateOuterClass.internal_static_com_templateService_Feature_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.templateService.Feature.class, com.templateService.Feature.Builder.class);
    }

    // Construct using com.templateService.Feature.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      seqID_ = 0;

      featureName_ = "";

      attributeName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.templateService.TemplateOuterClass.internal_static_com_templateService_Feature_descriptor;
    }

    @java.lang.Override
    public com.templateService.Feature getDefaultInstanceForType() {
      return com.templateService.Feature.getDefaultInstance();
    }

    @java.lang.Override
    public com.templateService.Feature build() {
      com.templateService.Feature result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.templateService.Feature buildPartial() {
      com.templateService.Feature result = new com.templateService.Feature(this);
      result.seqID_ = seqID_;
      result.featureName_ = featureName_;
      result.attributeName_ = attributeName_;
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
      if (other instanceof com.templateService.Feature) {
        return mergeFrom((com.templateService.Feature)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.templateService.Feature other) {
      if (other == com.templateService.Feature.getDefaultInstance()) return this;
      if (other.getSeqID() != 0) {
        setSeqID(other.getSeqID());
      }
      if (!other.getFeatureName().isEmpty()) {
        featureName_ = other.featureName_;
        onChanged();
      }
      if (!other.getAttributeName().isEmpty()) {
        attributeName_ = other.attributeName_;
        onChanged();
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
      com.templateService.Feature parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.templateService.Feature) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int seqID_ ;
    /**
     * <code>int32 seqID = 1;</code>
     */
    public int getSeqID() {
      return seqID_;
    }
    /**
     * <code>int32 seqID = 1;</code>
     */
    public Builder setSeqID(int value) {
      
      seqID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 seqID = 1;</code>
     */
    public Builder clearSeqID() {
      
      seqID_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object featureName_ = "";
    /**
     * <code>string featureName = 2;</code>
     */
    public java.lang.String getFeatureName() {
      java.lang.Object ref = featureName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string featureName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFeatureNameBytes() {
      java.lang.Object ref = featureName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        featureName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string featureName = 2;</code>
     */
    public Builder setFeatureName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      featureName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string featureName = 2;</code>
     */
    public Builder clearFeatureName() {
      
      featureName_ = getDefaultInstance().getFeatureName();
      onChanged();
      return this;
    }
    /**
     * <code>string featureName = 2;</code>
     */
    public Builder setFeatureNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      featureName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object attributeName_ = "";
    /**
     * <code>string attributeName = 3;</code>
     */
    public java.lang.String getAttributeName() {
      java.lang.Object ref = attributeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attributeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string attributeName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAttributeNameBytes() {
      java.lang.Object ref = attributeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string attributeName = 3;</code>
     */
    public Builder setAttributeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      attributeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string attributeName = 3;</code>
     */
    public Builder clearAttributeName() {
      
      attributeName_ = getDefaultInstance().getAttributeName();
      onChanged();
      return this;
    }
    /**
     * <code>string attributeName = 3;</code>
     */
    public Builder setAttributeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      attributeName_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.templateService.Feature)
  }

  // @@protoc_insertion_point(class_scope:com.templateService.Feature)
  private static final com.templateService.Feature DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.templateService.Feature();
  }

  public static com.templateService.Feature getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Feature>
      PARSER = new com.google.protobuf.AbstractParser<Feature>() {
    @java.lang.Override
    public Feature parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Feature(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Feature> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Feature> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.templateService.Feature getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

