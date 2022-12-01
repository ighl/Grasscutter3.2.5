// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrialAvatarInDungeonIndexNotify.proto

package emu.grasscutter.net.proto;

public final class TrialAvatarInDungeonIndexNotifyOuterClass {
  private TrialAvatarInDungeonIndexNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TrialAvatarInDungeonIndexNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TrialAvatarInDungeonIndexNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 trial_avatar_index_id = 9;</code>
     * @return The trialAvatarIndexId.
     */
    int getTrialAvatarIndexId();
  }
  /**
   * <pre>
   * CmdId: 2104
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code TrialAvatarInDungeonIndexNotify}
   */
  public static final class TrialAvatarInDungeonIndexNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TrialAvatarInDungeonIndexNotify)
      TrialAvatarInDungeonIndexNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TrialAvatarInDungeonIndexNotify.newBuilder() to construct.
    private TrialAvatarInDungeonIndexNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TrialAvatarInDungeonIndexNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TrialAvatarInDungeonIndexNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TrialAvatarInDungeonIndexNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 72: {

              trialAvatarIndexId_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.internal_static_TrialAvatarInDungeonIndexNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.internal_static_TrialAvatarInDungeonIndexNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.class, emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.Builder.class);
    }

    public static final int TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER = 9;
    private int trialAvatarIndexId_;
    /**
     * <code>uint32 trial_avatar_index_id = 9;</code>
     * @return The trialAvatarIndexId.
     */
    @java.lang.Override
    public int getTrialAvatarIndexId() {
      return trialAvatarIndexId_;
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
      if (trialAvatarIndexId_ != 0) {
        output.writeUInt32(9, trialAvatarIndexId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (trialAvatarIndexId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, trialAvatarIndexId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify other = (emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify) obj;

      if (getTrialAvatarIndexId()
          != other.getTrialAvatarIndexId()) return false;
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
      hash = (37 * hash) + TRIAL_AVATAR_INDEX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTrialAvatarIndexId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify prototype) {
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
     * CmdId: 2104
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code TrialAvatarInDungeonIndexNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TrialAvatarInDungeonIndexNotify)
        emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.internal_static_TrialAvatarInDungeonIndexNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.internal_static_TrialAvatarInDungeonIndexNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.class, emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.newBuilder()
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
        trialAvatarIndexId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.internal_static_TrialAvatarInDungeonIndexNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify build() {
        emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify buildPartial() {
        emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify result = new emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify(this);
        result.trialAvatarIndexId_ = trialAvatarIndexId_;
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
        if (other instanceof emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify other) {
        if (other == emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify.getDefaultInstance()) return this;
        if (other.getTrialAvatarIndexId() != 0) {
          setTrialAvatarIndexId(other.getTrialAvatarIndexId());
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
        emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int trialAvatarIndexId_ ;
      /**
       * <code>uint32 trial_avatar_index_id = 9;</code>
       * @return The trialAvatarIndexId.
       */
      @java.lang.Override
      public int getTrialAvatarIndexId() {
        return trialAvatarIndexId_;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 9;</code>
       * @param value The trialAvatarIndexId to set.
       * @return This builder for chaining.
       */
      public Builder setTrialAvatarIndexId(int value) {
        
        trialAvatarIndexId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 trial_avatar_index_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTrialAvatarIndexId() {
        
        trialAvatarIndexId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:TrialAvatarInDungeonIndexNotify)
    }

    // @@protoc_insertion_point(class_scope:TrialAvatarInDungeonIndexNotify)
    private static final emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify();
    }

    public static emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TrialAvatarInDungeonIndexNotify>
        PARSER = new com.google.protobuf.AbstractParser<TrialAvatarInDungeonIndexNotify>() {
      @java.lang.Override
      public TrialAvatarInDungeonIndexNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrialAvatarInDungeonIndexNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TrialAvatarInDungeonIndexNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TrialAvatarInDungeonIndexNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TrialAvatarInDungeonIndexNotifyOuterClass.TrialAvatarInDungeonIndexNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TrialAvatarInDungeonIndexNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TrialAvatarInDungeonIndexNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%TrialAvatarInDungeonIndexNotify.proto\"" +
      "@\n\037TrialAvatarInDungeonIndexNotify\022\035\n\025tr" +
      "ial_avatar_index_id\030\t \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TrialAvatarInDungeonIndexNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TrialAvatarInDungeonIndexNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TrialAvatarInDungeonIndexNotify_descriptor,
        new java.lang.String[] { "TrialAvatarIndexId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
