// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: template.proto

package com.templateService;

public interface TemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.templateService.TemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.templateService.RequestHeader requestHeader = 1;</code>
   */
  boolean hasRequestHeader();
  /**
   * <code>.com.templateService.RequestHeader requestHeader = 1;</code>
   */
  com.templateService.RequestHeader getRequestHeader();
  /**
   * <code>.com.templateService.RequestHeader requestHeader = 1;</code>
   */
  com.templateService.RequestHeaderOrBuilder getRequestHeaderOrBuilder();

  /**
   * <code>repeated .com.templateService.Template templates = 2;</code>
   */
  java.util.List<com.templateService.Template> 
      getTemplatesList();
  /**
   * <code>repeated .com.templateService.Template templates = 2;</code>
   */
  com.templateService.Template getTemplates(int index);
  /**
   * <code>repeated .com.templateService.Template templates = 2;</code>
   */
  int getTemplatesCount();
  /**
   * <code>repeated .com.templateService.Template templates = 2;</code>
   */
  java.util.List<? extends com.templateService.TemplateOrBuilder> 
      getTemplatesOrBuilderList();
  /**
   * <code>repeated .com.templateService.Template templates = 2;</code>
   */
  com.templateService.TemplateOrBuilder getTemplatesOrBuilder(
      int index);
}