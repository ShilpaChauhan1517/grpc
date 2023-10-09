// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orchestrator.proto

package com.bootcamp.grpc.orchestrator.proto;

public final class Orchestrator {
  private Orchestrator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Pan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Pan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Pii_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Pii_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_OrchestratorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_OrchestratorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_RequestHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_RequestHeader_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ResponseDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ResponseDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ErrorDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ErrorDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ControlData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ControlData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ProductTrait_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ProductTrait_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ProductTraitsMap_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ProductTraitsMap_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ProductTraitsMap_ProductTraitsMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ProductTraitsMap_ProductTraitsMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ProductDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ProductDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_OrchestratorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_OrchestratorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022orchestrator.proto\022\005proto\032\037google/prot" +
      "obuf/timestamp.proto\"\030\n\003Pan\022\021\n\tpanNumber" +
      "\030\001 \001(\t\"\036\n\003Pii\022\027\n\003pan\030\001 \001(\0132\n.proto.Pan\"J" +
      "\n\007Product\022\017\n\007product\030\001 \001(\t\022\023\n\013isRequeste" +
      "d\030\002 \001(\t\022\031\n\021adviserTemplateId\030\003 \001(\t\"h\n\023Or" +
      "chestratorRequest\022\027\n\003pii\030\001 \001(\0132\n.proto.P" +
      "ii\022\026\n\016monitoringDate\030\002 \001(\t\022 \n\010products\030\003" +
      " \003(\0132\016.proto.Product\"g\n\rRequestHeader\022\025\n" +
      "\rtransactionId\030\001 \001(\t\022\022\n\nmemberCode\030\002 \001(\t" +
      "\022\023\n\013productCode\030\003 \001(\t\022\026\n\016monitoringDate\030" +
      "\004 \001(\t\"<\n\016ResponseDetail\022\024\n\014responseCode\030" +
      "\001 \001(\t\022\024\n\014responseDesc\030\002 \001(\t\"3\n\013ErrorDeta" +
      "il\022\021\n\terrorCode\030\001 \001(\t\022\021\n\terrorDesc\030\002 \001(\t" +
      "\"\206\001\n\013ControlData\022.\n\017responseDetails\030\001 \003(" +
      "\0132\025.proto.ResponseDetail\022(\n\014errorDetails" +
      "\030\002 \003(\0132\022.proto.ErrorDetail\022\016\n\006status\030\003 \001" +
      "(\t\022\r\n\005isHit\030\004 \001(\t\"9\n\014ProductTrait\022\023\n\013fea" +
      "tureName\030\001 \001(\t\022\024\n\014featureValue\030\002 \001(\t\"\224\001\n" +
      "\020ProductTraitsMap\022G\n\020productTraitsMap\030\001 " +
      "\003(\0132-.proto.ProductTraitsMap.ProductTrai" +
      "tsMapEntry\0327\n\025ProductTraitsMapEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\213\001\n\016ProductD" +
      "etails\022*\n\rproductTraits\030\001 \003(\0132\023.proto.Pr" +
      "oductTrait\022\021\n\tsubjectId\030\002 \001(\t\022\'\n\013control" +
      "Data\030\003 \001(\0132\022.proto.ControlData\022\021\n\tproduc" +
      "tId\030\004 \001(\t\"Q\n\017ProductResponse\022-\n\016productD" +
      "etails\030\001 \003(\0132\025.proto.ProductDetails\022\017\n\007p" +
      "roduct\030\002 \001(\t\"H\n\024OrchestratorResponse\0220\n\020" +
      "productResponses\030\001 \003(\0132\026.proto.ProductRe" +
      "sponse2e\n\023OrchestratorService\022N\n\023calcula" +
      "teParameters\022\032.proto.OrchestratorRequest" +
      "\032\033.proto.OrchestratorResponseB(\n$com.boo" +
      "tcamp.grpc.orchestrator.protoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_proto_Pan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_Pan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Pan_descriptor,
        new java.lang.String[] { "PanNumber", });
    internal_static_proto_Pii_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_proto_Pii_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Pii_descriptor,
        new java.lang.String[] { "Pan", });
    internal_static_proto_Product_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_proto_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_Product_descriptor,
        new java.lang.String[] { "Product", "IsRequested", "AdviserTemplateId", });
    internal_static_proto_OrchestratorRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_proto_OrchestratorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_OrchestratorRequest_descriptor,
        new java.lang.String[] { "Pii", "MonitoringDate", "Products", });
    internal_static_proto_RequestHeader_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_proto_RequestHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_RequestHeader_descriptor,
        new java.lang.String[] { "TransactionId", "MemberCode", "ProductCode", "MonitoringDate", });
    internal_static_proto_ResponseDetail_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_proto_ResponseDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ResponseDetail_descriptor,
        new java.lang.String[] { "ResponseCode", "ResponseDesc", });
    internal_static_proto_ErrorDetail_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_proto_ErrorDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ErrorDetail_descriptor,
        new java.lang.String[] { "ErrorCode", "ErrorDesc", });
    internal_static_proto_ControlData_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_proto_ControlData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ControlData_descriptor,
        new java.lang.String[] { "ResponseDetails", "ErrorDetails", "Status", "IsHit", });
    internal_static_proto_ProductTrait_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_proto_ProductTrait_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ProductTrait_descriptor,
        new java.lang.String[] { "FeatureName", "FeatureValue", });
    internal_static_proto_ProductTraitsMap_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_proto_ProductTraitsMap_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ProductTraitsMap_descriptor,
        new java.lang.String[] { "ProductTraitsMap", });
    internal_static_proto_ProductTraitsMap_ProductTraitsMapEntry_descriptor =
      internal_static_proto_ProductTraitsMap_descriptor.getNestedTypes().get(0);
    internal_static_proto_ProductTraitsMap_ProductTraitsMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ProductTraitsMap_ProductTraitsMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_proto_ProductDetails_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_proto_ProductDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ProductDetails_descriptor,
        new java.lang.String[] { "ProductTraits", "SubjectId", "ControlData", "ProductId", });
    internal_static_proto_ProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_proto_ProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ProductResponse_descriptor,
        new java.lang.String[] { "ProductDetails", "Product", });
    internal_static_proto_OrchestratorResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_proto_OrchestratorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_OrchestratorResponse_descriptor,
        new java.lang.String[] { "ProductResponses", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}