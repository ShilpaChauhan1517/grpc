// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: template.proto

package com.templateService;

public interface TemplateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.templateService.TemplateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string templateID = 1;</code>
   */
  java.lang.String getTemplateID();
  /**
   * <code>string templateID = 1;</code>
   */
  com.google.protobuf.ByteString
      getTemplateIDBytes();

  /**
   * <code>string templateName = 2;</code>
   */
  java.lang.String getTemplateName();
  /**
   * <code>string templateName = 2;</code>
   */
  com.google.protobuf.ByteString
      getTemplateNameBytes();

  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  java.util.List<com.templateService.Feature> 
      getFeatureListList();
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  com.templateService.Feature getFeatureList(int index);
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  int getFeatureListCount();
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  java.util.List<? extends com.templateService.FeatureOrBuilder> 
      getFeatureListOrBuilderList();
  /**
   * <code>repeated .com.templateService.Feature featureList = 3;</code>
   */
  com.templateService.FeatureOrBuilder getFeatureListOrBuilder(
      int index);
}