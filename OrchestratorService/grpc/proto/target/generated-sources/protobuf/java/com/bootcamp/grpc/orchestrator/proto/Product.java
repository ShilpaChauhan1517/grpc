// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orchestrator.proto

package com.bootcamp.grpc.orchestrator.proto;

/**
 * Protobuf type {@code proto.Product}
 */
public  final class Product extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Product)
    ProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Product.newBuilder() to construct.
  private Product(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Product() {
    product_ = "";
    isRequested_ = "";
    adviserTemplateId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Product(
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

            product_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            isRequested_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            adviserTemplateId_ = s;
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
    return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Product_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Product_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bootcamp.grpc.orchestrator.proto.Product.class, com.bootcamp.grpc.orchestrator.proto.Product.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private volatile java.lang.Object product_;
  /**
   * <code>string product = 1;</code>
   */
  public java.lang.String getProduct() {
    java.lang.Object ref = product_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      product_ = s;
      return s;
    }
  }
  /**
   * <code>string product = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductBytes() {
    java.lang.Object ref = product_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      product_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISREQUESTED_FIELD_NUMBER = 2;
  private volatile java.lang.Object isRequested_;
  /**
   * <code>string isRequested = 2;</code>
   */
  public java.lang.String getIsRequested() {
    java.lang.Object ref = isRequested_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      isRequested_ = s;
      return s;
    }
  }
  /**
   * <code>string isRequested = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIsRequestedBytes() {
    java.lang.Object ref = isRequested_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      isRequested_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADVISERTEMPLATEID_FIELD_NUMBER = 3;
  private volatile java.lang.Object adviserTemplateId_;
  /**
   * <code>string adviserTemplateId = 3;</code>
   */
  public java.lang.String getAdviserTemplateId() {
    java.lang.Object ref = adviserTemplateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      adviserTemplateId_ = s;
      return s;
    }
  }
  /**
   * <code>string adviserTemplateId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAdviserTemplateIdBytes() {
    java.lang.Object ref = adviserTemplateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      adviserTemplateId_ = b;
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
    if (!getProductBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, product_);
    }
    if (!getIsRequestedBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, isRequested_);
    }
    if (!getAdviserTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, adviserTemplateId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, product_);
    }
    if (!getIsRequestedBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, isRequested_);
    }
    if (!getAdviserTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, adviserTemplateId_);
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
    if (!(obj instanceof com.bootcamp.grpc.orchestrator.proto.Product)) {
      return super.equals(obj);
    }
    com.bootcamp.grpc.orchestrator.proto.Product other = (com.bootcamp.grpc.orchestrator.proto.Product) obj;

    boolean result = true;
    result = result && getProduct()
        .equals(other.getProduct());
    result = result && getIsRequested()
        .equals(other.getIsRequested());
    result = result && getAdviserTemplateId()
        .equals(other.getAdviserTemplateId());
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
    hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
    hash = (53 * hash) + getProduct().hashCode();
    hash = (37 * hash) + ISREQUESTED_FIELD_NUMBER;
    hash = (53 * hash) + getIsRequested().hashCode();
    hash = (37 * hash) + ADVISERTEMPLATEID_FIELD_NUMBER;
    hash = (53 * hash) + getAdviserTemplateId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Product parseFrom(
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
  public static Builder newBuilder(com.bootcamp.grpc.orchestrator.proto.Product prototype) {
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
   * Protobuf type {@code proto.Product}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Product)
      com.bootcamp.grpc.orchestrator.proto.ProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Product_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Product_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bootcamp.grpc.orchestrator.proto.Product.class, com.bootcamp.grpc.orchestrator.proto.Product.Builder.class);
    }

    // Construct using com.bootcamp.grpc.orchestrator.proto.Product.newBuilder()
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
      product_ = "";

      isRequested_ = "";

      adviserTemplateId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Product_descriptor;
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.Product getDefaultInstanceForType() {
      return com.bootcamp.grpc.orchestrator.proto.Product.getDefaultInstance();
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.Product build() {
      com.bootcamp.grpc.orchestrator.proto.Product result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.Product buildPartial() {
      com.bootcamp.grpc.orchestrator.proto.Product result = new com.bootcamp.grpc.orchestrator.proto.Product(this);
      result.product_ = product_;
      result.isRequested_ = isRequested_;
      result.adviserTemplateId_ = adviserTemplateId_;
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
      if (other instanceof com.bootcamp.grpc.orchestrator.proto.Product) {
        return mergeFrom((com.bootcamp.grpc.orchestrator.proto.Product)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bootcamp.grpc.orchestrator.proto.Product other) {
      if (other == com.bootcamp.grpc.orchestrator.proto.Product.getDefaultInstance()) return this;
      if (!other.getProduct().isEmpty()) {
        product_ = other.product_;
        onChanged();
      }
      if (!other.getIsRequested().isEmpty()) {
        isRequested_ = other.isRequested_;
        onChanged();
      }
      if (!other.getAdviserTemplateId().isEmpty()) {
        adviserTemplateId_ = other.adviserTemplateId_;
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
      com.bootcamp.grpc.orchestrator.proto.Product parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bootcamp.grpc.orchestrator.proto.Product) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object product_ = "";
    /**
     * <code>string product = 1;</code>
     */
    public java.lang.String getProduct() {
      java.lang.Object ref = product_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        product_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string product = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductBytes() {
      java.lang.Object ref = product_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        product_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string product = 1;</code>
     */
    public Builder setProduct(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      product_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string product = 1;</code>
     */
    public Builder clearProduct() {
      
      product_ = getDefaultInstance().getProduct();
      onChanged();
      return this;
    }
    /**
     * <code>string product = 1;</code>
     */
    public Builder setProductBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      product_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object isRequested_ = "";
    /**
     * <code>string isRequested = 2;</code>
     */
    public java.lang.String getIsRequested() {
      java.lang.Object ref = isRequested_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        isRequested_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string isRequested = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIsRequestedBytes() {
      java.lang.Object ref = isRequested_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        isRequested_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string isRequested = 2;</code>
     */
    public Builder setIsRequested(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      isRequested_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string isRequested = 2;</code>
     */
    public Builder clearIsRequested() {
      
      isRequested_ = getDefaultInstance().getIsRequested();
      onChanged();
      return this;
    }
    /**
     * <code>string isRequested = 2;</code>
     */
    public Builder setIsRequestedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      isRequested_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object adviserTemplateId_ = "";
    /**
     * <code>string adviserTemplateId = 3;</code>
     */
    public java.lang.String getAdviserTemplateId() {
      java.lang.Object ref = adviserTemplateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adviserTemplateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string adviserTemplateId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAdviserTemplateIdBytes() {
      java.lang.Object ref = adviserTemplateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adviserTemplateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string adviserTemplateId = 3;</code>
     */
    public Builder setAdviserTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      adviserTemplateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string adviserTemplateId = 3;</code>
     */
    public Builder clearAdviserTemplateId() {
      
      adviserTemplateId_ = getDefaultInstance().getAdviserTemplateId();
      onChanged();
      return this;
    }
    /**
     * <code>string adviserTemplateId = 3;</code>
     */
    public Builder setAdviserTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      adviserTemplateId_ = value;
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


    // @@protoc_insertion_point(builder_scope:proto.Product)
  }

  // @@protoc_insertion_point(class_scope:proto.Product)
  private static final com.bootcamp.grpc.orchestrator.proto.Product DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bootcamp.grpc.orchestrator.proto.Product();
  }

  public static com.bootcamp.grpc.orchestrator.proto.Product getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Product>
      PARSER = new com.google.protobuf.AbstractParser<Product>() {
    @java.lang.Override
    public Product parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Product(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Product> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Product> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bootcamp.grpc.orchestrator.proto.Product getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

