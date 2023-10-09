// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orchestrator.proto

package com.bootcamp.grpc.orchestrator.proto;

/**
 * Protobuf type {@code proto.ProductTrait}
 */
public  final class ProductTrait extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ProductTrait)
    ProductTraitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductTrait.newBuilder() to construct.
  private ProductTrait(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductTrait() {
    featureName_ = "";
    featureValue_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductTrait(
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

            featureName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            featureValue_ = s;
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
    return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_ProductTrait_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_ProductTrait_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bootcamp.grpc.orchestrator.proto.ProductTrait.class, com.bootcamp.grpc.orchestrator.proto.ProductTrait.Builder.class);
  }

  public static final int FEATURENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object featureName_;
  /**
   * <code>string featureName = 1;</code>
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
   * <code>string featureName = 1;</code>
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

  public static final int FEATUREVALUE_FIELD_NUMBER = 2;
  private volatile java.lang.Object featureValue_;
  /**
   * <code>string featureValue = 2;</code>
   */
  public java.lang.String getFeatureValue() {
    java.lang.Object ref = featureValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      featureValue_ = s;
      return s;
    }
  }
  /**
   * <code>string featureValue = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFeatureValueBytes() {
    java.lang.Object ref = featureValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      featureValue_ = b;
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
    if (!getFeatureNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, featureName_);
    }
    if (!getFeatureValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, featureValue_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFeatureNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, featureName_);
    }
    if (!getFeatureValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, featureValue_);
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
    if (!(obj instanceof com.bootcamp.grpc.orchestrator.proto.ProductTrait)) {
      return super.equals(obj);
    }
    com.bootcamp.grpc.orchestrator.proto.ProductTrait other = (com.bootcamp.grpc.orchestrator.proto.ProductTrait) obj;

    boolean result = true;
    result = result && getFeatureName()
        .equals(other.getFeatureName());
    result = result && getFeatureValue()
        .equals(other.getFeatureValue());
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
    hash = (37 * hash) + FEATURENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureName().hashCode();
    hash = (37 * hash) + FEATUREVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait parseFrom(
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
  public static Builder newBuilder(com.bootcamp.grpc.orchestrator.proto.ProductTrait prototype) {
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
   * Protobuf type {@code proto.ProductTrait}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ProductTrait)
      com.bootcamp.grpc.orchestrator.proto.ProductTraitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_ProductTrait_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_ProductTrait_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bootcamp.grpc.orchestrator.proto.ProductTrait.class, com.bootcamp.grpc.orchestrator.proto.ProductTrait.Builder.class);
    }

    // Construct using com.bootcamp.grpc.orchestrator.proto.ProductTrait.newBuilder()
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
      featureName_ = "";

      featureValue_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_ProductTrait_descriptor;
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.ProductTrait getDefaultInstanceForType() {
      return com.bootcamp.grpc.orchestrator.proto.ProductTrait.getDefaultInstance();
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.ProductTrait build() {
      com.bootcamp.grpc.orchestrator.proto.ProductTrait result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.ProductTrait buildPartial() {
      com.bootcamp.grpc.orchestrator.proto.ProductTrait result = new com.bootcamp.grpc.orchestrator.proto.ProductTrait(this);
      result.featureName_ = featureName_;
      result.featureValue_ = featureValue_;
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
      if (other instanceof com.bootcamp.grpc.orchestrator.proto.ProductTrait) {
        return mergeFrom((com.bootcamp.grpc.orchestrator.proto.ProductTrait)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bootcamp.grpc.orchestrator.proto.ProductTrait other) {
      if (other == com.bootcamp.grpc.orchestrator.proto.ProductTrait.getDefaultInstance()) return this;
      if (!other.getFeatureName().isEmpty()) {
        featureName_ = other.featureName_;
        onChanged();
      }
      if (!other.getFeatureValue().isEmpty()) {
        featureValue_ = other.featureValue_;
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
      com.bootcamp.grpc.orchestrator.proto.ProductTrait parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bootcamp.grpc.orchestrator.proto.ProductTrait) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object featureName_ = "";
    /**
     * <code>string featureName = 1;</code>
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
     * <code>string featureName = 1;</code>
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
     * <code>string featureName = 1;</code>
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
     * <code>string featureName = 1;</code>
     */
    public Builder clearFeatureName() {
      
      featureName_ = getDefaultInstance().getFeatureName();
      onChanged();
      return this;
    }
    /**
     * <code>string featureName = 1;</code>
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

    private java.lang.Object featureValue_ = "";
    /**
     * <code>string featureValue = 2;</code>
     */
    public java.lang.String getFeatureValue() {
      java.lang.Object ref = featureValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        featureValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string featureValue = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFeatureValueBytes() {
      java.lang.Object ref = featureValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        featureValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string featureValue = 2;</code>
     */
    public Builder setFeatureValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      featureValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string featureValue = 2;</code>
     */
    public Builder clearFeatureValue() {
      
      featureValue_ = getDefaultInstance().getFeatureValue();
      onChanged();
      return this;
    }
    /**
     * <code>string featureValue = 2;</code>
     */
    public Builder setFeatureValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      featureValue_ = value;
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


    // @@protoc_insertion_point(builder_scope:proto.ProductTrait)
  }

  // @@protoc_insertion_point(class_scope:proto.ProductTrait)
  private static final com.bootcamp.grpc.orchestrator.proto.ProductTrait DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bootcamp.grpc.orchestrator.proto.ProductTrait();
  }

  public static com.bootcamp.grpc.orchestrator.proto.ProductTrait getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductTrait>
      PARSER = new com.google.protobuf.AbstractParser<ProductTrait>() {
    @java.lang.Override
    public ProductTrait parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductTrait(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductTrait> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductTrait> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bootcamp.grpc.orchestrator.proto.ProductTrait getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

