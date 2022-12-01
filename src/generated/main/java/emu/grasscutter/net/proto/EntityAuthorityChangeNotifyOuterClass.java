// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EntityAuthorityChangeNotify.proto

package emu.grasscutter.net.proto;

public final class EntityAuthorityChangeNotifyOuterClass {
  private EntityAuthorityChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EntityAuthorityChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EntityAuthorityChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange> 
        getAuthorityChangeListList();
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange getAuthorityChangeList(int index);
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    int getAuthorityChangeListCount();
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder> 
        getAuthorityChangeListOrBuilderList();
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder getAuthorityChangeListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 383
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code EntityAuthorityChangeNotify}
   */
  public static final class EntityAuthorityChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EntityAuthorityChangeNotify)
      EntityAuthorityChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EntityAuthorityChangeNotify.newBuilder() to construct.
    private EntityAuthorityChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EntityAuthorityChangeNotify() {
      authorityChangeList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EntityAuthorityChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EntityAuthorityChangeNotify(
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                authorityChangeList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange>();
                mutable_bitField0_ |= 0x00000001;
              }
              authorityChangeList_.add(
                  input.readMessage(emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          authorityChangeList_ = java.util.Collections.unmodifiableList(authorityChangeList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.internal_static_EntityAuthorityChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.internal_static_EntityAuthorityChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.class, emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.Builder.class);
    }

    public static final int AUTHORITY_CHANGE_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange> authorityChangeList_;
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange> getAuthorityChangeListList() {
      return authorityChangeList_;
    }
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder> 
        getAuthorityChangeListOrBuilderList() {
      return authorityChangeList_;
    }
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    @java.lang.Override
    public int getAuthorityChangeListCount() {
      return authorityChangeList_.size();
    }
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange getAuthorityChangeList(int index) {
      return authorityChangeList_.get(index);
    }
    /**
     * <code>repeated .AuthorityChange authority_change_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder getAuthorityChangeListOrBuilder(
        int index) {
      return authorityChangeList_.get(index);
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
      for (int i = 0; i < authorityChangeList_.size(); i++) {
        output.writeMessage(2, authorityChangeList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < authorityChangeList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, authorityChangeList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify other = (emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify) obj;

      if (!getAuthorityChangeListList()
          .equals(other.getAuthorityChangeListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getAuthorityChangeListCount() > 0) {
        hash = (37 * hash) + AUTHORITY_CHANGE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAuthorityChangeListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify prototype) {
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
     * <pre>
     * CmdId: 383
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code EntityAuthorityChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EntityAuthorityChangeNotify)
        emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.internal_static_EntityAuthorityChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.internal_static_EntityAuthorityChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.class, emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.newBuilder()
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
          getAuthorityChangeListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (authorityChangeListBuilder_ == null) {
          authorityChangeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          authorityChangeListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.internal_static_EntityAuthorityChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify build() {
        emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify buildPartial() {
        emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify result = new emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify(this);
        int from_bitField0_ = bitField0_;
        if (authorityChangeListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            authorityChangeList_ = java.util.Collections.unmodifiableList(authorityChangeList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.authorityChangeList_ = authorityChangeList_;
        } else {
          result.authorityChangeList_ = authorityChangeListBuilder_.build();
        }
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify other) {
        if (other == emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify.getDefaultInstance()) return this;
        if (authorityChangeListBuilder_ == null) {
          if (!other.authorityChangeList_.isEmpty()) {
            if (authorityChangeList_.isEmpty()) {
              authorityChangeList_ = other.authorityChangeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAuthorityChangeListIsMutable();
              authorityChangeList_.addAll(other.authorityChangeList_);
            }
            onChanged();
          }
        } else {
          if (!other.authorityChangeList_.isEmpty()) {
            if (authorityChangeListBuilder_.isEmpty()) {
              authorityChangeListBuilder_.dispose();
              authorityChangeListBuilder_ = null;
              authorityChangeList_ = other.authorityChangeList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              authorityChangeListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAuthorityChangeListFieldBuilder() : null;
            } else {
              authorityChangeListBuilder_.addAllMessages(other.authorityChangeList_);
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
        emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange> authorityChangeList_ =
        java.util.Collections.emptyList();
      private void ensureAuthorityChangeListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          authorityChangeList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange>(authorityChangeList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder> authorityChangeListBuilder_;

      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange> getAuthorityChangeListList() {
        if (authorityChangeListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(authorityChangeList_);
        } else {
          return authorityChangeListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public int getAuthorityChangeListCount() {
        if (authorityChangeListBuilder_ == null) {
          return authorityChangeList_.size();
        } else {
          return authorityChangeListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange getAuthorityChangeList(int index) {
        if (authorityChangeListBuilder_ == null) {
          return authorityChangeList_.get(index);
        } else {
          return authorityChangeListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder setAuthorityChangeList(
          int index, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange value) {
        if (authorityChangeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.set(index, value);
          onChanged();
        } else {
          authorityChangeListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder setAuthorityChangeList(
          int index, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder builderForValue) {
        if (authorityChangeListBuilder_ == null) {
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.set(index, builderForValue.build());
          onChanged();
        } else {
          authorityChangeListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder addAuthorityChangeList(emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange value) {
        if (authorityChangeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.add(value);
          onChanged();
        } else {
          authorityChangeListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder addAuthorityChangeList(
          int index, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange value) {
        if (authorityChangeListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.add(index, value);
          onChanged();
        } else {
          authorityChangeListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder addAuthorityChangeList(
          emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder builderForValue) {
        if (authorityChangeListBuilder_ == null) {
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.add(builderForValue.build());
          onChanged();
        } else {
          authorityChangeListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder addAuthorityChangeList(
          int index, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder builderForValue) {
        if (authorityChangeListBuilder_ == null) {
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.add(index, builderForValue.build());
          onChanged();
        } else {
          authorityChangeListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder addAllAuthorityChangeList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange> values) {
        if (authorityChangeListBuilder_ == null) {
          ensureAuthorityChangeListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, authorityChangeList_);
          onChanged();
        } else {
          authorityChangeListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder clearAuthorityChangeList() {
        if (authorityChangeListBuilder_ == null) {
          authorityChangeList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          authorityChangeListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public Builder removeAuthorityChangeList(int index) {
        if (authorityChangeListBuilder_ == null) {
          ensureAuthorityChangeListIsMutable();
          authorityChangeList_.remove(index);
          onChanged();
        } else {
          authorityChangeListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder getAuthorityChangeListBuilder(
          int index) {
        return getAuthorityChangeListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder getAuthorityChangeListOrBuilder(
          int index) {
        if (authorityChangeListBuilder_ == null) {
          return authorityChangeList_.get(index);  } else {
          return authorityChangeListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder> 
           getAuthorityChangeListOrBuilderList() {
        if (authorityChangeListBuilder_ != null) {
          return authorityChangeListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(authorityChangeList_);
        }
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder addAuthorityChangeListBuilder() {
        return getAuthorityChangeListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.getDefaultInstance());
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder addAuthorityChangeListBuilder(
          int index) {
        return getAuthorityChangeListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.getDefaultInstance());
      }
      /**
       * <code>repeated .AuthorityChange authority_change_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder> 
           getAuthorityChangeListBuilderList() {
        return getAuthorityChangeListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder> 
          getAuthorityChangeListFieldBuilder() {
        if (authorityChangeListBuilder_ == null) {
          authorityChangeListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder>(
                  authorityChangeList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          authorityChangeList_ = null;
        }
        return authorityChangeListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:EntityAuthorityChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:EntityAuthorityChangeNotify)
    private static final emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify();
    }

    public static emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EntityAuthorityChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<EntityAuthorityChangeNotify>() {
      @java.lang.Override
      public EntityAuthorityChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EntityAuthorityChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EntityAuthorityChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EntityAuthorityChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EntityAuthorityChangeNotifyOuterClass.EntityAuthorityChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityAuthorityChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityAuthorityChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!EntityAuthorityChangeNotify.proto\032\025Aut" +
      "horityChange.proto\"N\n\033EntityAuthorityCha" +
      "ngeNotify\022/\n\025authority_change_list\030\002 \003(\013" +
      "2\020.AuthorityChangeB\033\n\031emu.grasscutter.ne" +
      "t.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AuthorityChangeOuterClass.getDescriptor(),
        });
    internal_static_EntityAuthorityChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EntityAuthorityChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityAuthorityChangeNotify_descriptor,
        new java.lang.String[] { "AuthorityChangeList", });
    emu.grasscutter.net.proto.AuthorityChangeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
