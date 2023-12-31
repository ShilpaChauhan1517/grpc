// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orchestrator.proto

package com.bootcamp.grpc.orchestrator.proto;

/**
 * Protobuf type {@code proto.Pii}
 */
public  final class Pii extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.Pii)
    PiiOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Pii.newBuilder() to construct.
  private Pii(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Pii() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Pii(
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
            com.bootcamp.grpc.orchestrator.proto.Pan.Builder subBuilder = null;
            if (pan_ != null) {
              subBuilder = pan_.toBuilder();
            }
            pan_ = input.readMessage(com.bootcamp.grpc.orchestrator.proto.Pan.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pan_);
              pan_ = subBuilder.buildPartial();
            }

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
    return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Pii_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Pii_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.bootcamp.grpc.orchestrator.proto.Pii.class, com.bootcamp.grpc.orchestrator.proto.Pii.Builder.class);
  }

  public static final int PAN_FIELD_NUMBER = 1;
  private com.bootcamp.grpc.orchestrator.proto.Pan pan_;
  /**
   * <code>.proto.Pan pan = 1;</code>
   */
  public boolean hasPan() {
    return pan_ != null;
  }
  /**
   * <code>.proto.Pan pan = 1;</code>
   */
  public com.bootcamp.grpc.orchestrator.proto.Pan getPan() {
    return pan_ == null ? com.bootcamp.grpc.orchestrator.proto.Pan.getDefaultInstance() : pan_;
  }
  /**
   * <code>.proto.Pan pan = 1;</code>
   */
  public com.bootcamp.grpc.orchestrator.proto.PanOrBuilder getPanOrBuilder() {
    return getPan();
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
    if (pan_ != null) {
      output.writeMessage(1, getPan());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pan_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPan());
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
    if (!(obj instanceof com.bootcamp.grpc.orchestrator.proto.Pii)) {
      return super.equals(obj);
    }
    com.bootcamp.grpc.orchestrator.proto.Pii other = (com.bootcamp.grpc.orchestrator.proto.Pii) obj;

    boolean result = true;
    result = result && (hasPan() == other.hasPan());
    if (hasPan()) {
      result = result && getPan()
          .equals(other.getPan());
    }
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
    if (hasPan()) {
      hash = (37 * hash) + PAN_FIELD_NUMBER;
      hash = (53 * hash) + getPan().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.bootcamp.grpc.orchestrator.proto.Pii parseFrom(
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
  public static Builder newBuilder(com.bootcamp.grpc.orchestrator.proto.Pii prototype) {
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
   * Protobuf type {@code proto.Pii}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Pii)
      com.bootcamp.grpc.orchestrator.proto.PiiOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Pii_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Pii_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.bootcamp.grpc.orchestrator.proto.Pii.class, com.bootcamp.grpc.orchestrator.proto.Pii.Builder.class);
    }

    // Construct using com.bootcamp.grpc.orchestrator.proto.Pii.newBuilder()
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
      if (panBuilder_ == null) {
        pan_ = null;
      } else {
        pan_ = null;
        panBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.bootcamp.grpc.orchestrator.proto.Orchestrator.internal_static_proto_Pii_descriptor;
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.Pii getDefaultInstanceForType() {
      return com.bootcamp.grpc.orchestrator.proto.Pii.getDefaultInstance();
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.Pii build() {
      com.bootcamp.grpc.orchestrator.proto.Pii result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.bootcamp.grpc.orchestrator.proto.Pii buildPartial() {
      com.bootcamp.grpc.orchestrator.proto.Pii result = new com.bootcamp.grpc.orchestrator.proto.Pii(this);
      if (panBuilder_ == null) {
        result.pan_ = pan_;
      } else {
        result.pan_ = panBuilder_.build();
      }
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
      if (other instanceof com.bootcamp.grpc.orchestrator.proto.Pii) {
        return mergeFrom((com.bootcamp.grpc.orchestrator.proto.Pii)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.bootcamp.grpc.orchestrator.proto.Pii other) {
      if (other == com.bootcamp.grpc.orchestrator.proto.Pii.getDefaultInstance()) return this;
      if (other.hasPan()) {
        mergePan(other.getPan());
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
      com.bootcamp.grpc.orchestrator.proto.Pii parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.bootcamp.grpc.orchestrator.proto.Pii) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.bootcamp.grpc.orchestrator.proto.Pan pan_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bootcamp.grpc.orchestrator.proto.Pan, com.bootcamp.grpc.orchestrator.proto.Pan.Builder, com.bootcamp.grpc.orchestrator.proto.PanOrBuilder> panBuilder_;
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public boolean hasPan() {
      return panBuilder_ != null || pan_ != null;
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public com.bootcamp.grpc.orchestrator.proto.Pan getPan() {
      if (panBuilder_ == null) {
        return pan_ == null ? com.bootcamp.grpc.orchestrator.proto.Pan.getDefaultInstance() : pan_;
      } else {
        return panBuilder_.getMessage();
      }
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public Builder setPan(com.bootcamp.grpc.orchestrator.proto.Pan value) {
      if (panBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pan_ = value;
        onChanged();
      } else {
        panBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public Builder setPan(
        com.bootcamp.grpc.orchestrator.proto.Pan.Builder builderForValue) {
      if (panBuilder_ == null) {
        pan_ = builderForValue.build();
        onChanged();
      } else {
        panBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public Builder mergePan(com.bootcamp.grpc.orchestrator.proto.Pan value) {
      if (panBuilder_ == null) {
        if (pan_ != null) {
          pan_ =
            com.bootcamp.grpc.orchestrator.proto.Pan.newBuilder(pan_).mergeFrom(value).buildPartial();
        } else {
          pan_ = value;
        }
        onChanged();
      } else {
        panBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public Builder clearPan() {
      if (panBuilder_ == null) {
        pan_ = null;
        onChanged();
      } else {
        pan_ = null;
        panBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public com.bootcamp.grpc.orchestrator.proto.Pan.Builder getPanBuilder() {
      
      onChanged();
      return getPanFieldBuilder().getBuilder();
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    public com.bootcamp.grpc.orchestrator.proto.PanOrBuilder getPanOrBuilder() {
      if (panBuilder_ != null) {
        return panBuilder_.getMessageOrBuilder();
      } else {
        return pan_ == null ?
            com.bootcamp.grpc.orchestrator.proto.Pan.getDefaultInstance() : pan_;
      }
    }
    /**
     * <code>.proto.Pan pan = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.bootcamp.grpc.orchestrator.proto.Pan, com.bootcamp.grpc.orchestrator.proto.Pan.Builder, com.bootcamp.grpc.orchestrator.proto.PanOrBuilder> 
        getPanFieldBuilder() {
      if (panBuilder_ == null) {
        panBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.bootcamp.grpc.orchestrator.proto.Pan, com.bootcamp.grpc.orchestrator.proto.Pan.Builder, com.bootcamp.grpc.orchestrator.proto.PanOrBuilder>(
                getPan(),
                getParentForChildren(),
                isClean());
        pan_ = null;
      }
      return panBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.Pii)
  }

  // @@protoc_insertion_point(class_scope:proto.Pii)
  private static final com.bootcamp.grpc.orchestrator.proto.Pii DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.bootcamp.grpc.orchestrator.proto.Pii();
  }

  public static com.bootcamp.grpc.orchestrator.proto.Pii getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pii>
      PARSER = new com.google.protobuf.AbstractParser<Pii>() {
    @java.lang.Override
    public Pii parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Pii(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Pii> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Pii> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.bootcamp.grpc.orchestrator.proto.Pii getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

