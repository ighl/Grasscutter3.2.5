// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesmanTakeRewardReq.proto

package emu.grasscutter.net.proto;

public final class SalesmanTakeRewardReqOuterClass {
  private SalesmanTakeRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SalesmanTakeRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SalesmanTakeRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 position = 8;</code>
     * @return The position.
     */
    int getPosition();
  }
  /**
   * <pre>
   * CmdId: 2096
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SalesmanTakeRewardReq}
   */
  public static final class SalesmanTakeRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SalesmanTakeRewardReq)
      SalesmanTakeRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SalesmanTakeRewardReq.newBuilder() to construct.
    private SalesmanTakeRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SalesmanTakeRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SalesmanTakeRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SalesmanTakeRewardReq(
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
            case 64: {

              position_ = input.readUInt32();
              break;
            }
            case 104: {

              scheduleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.internal_static_SalesmanTakeRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.internal_static_SalesmanTakeRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.class, emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.Builder.class);
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 13;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 13;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int POSITION_FIELD_NUMBER = 8;
    private int position_;
    /**
     * <code>uint32 position = 8;</code>
     * @return The position.
     */
    @java.lang.Override
    public int getPosition() {
      return position_;
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
      if (position_ != 0) {
        output.writeUInt32(8, position_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(13, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (position_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, position_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq other = (emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq) obj;

      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getPosition()
          != other.getPosition()) return false;
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
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getPosition();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq prototype) {
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
     * CmdId: 2096
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SalesmanTakeRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SalesmanTakeRewardReq)
        emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.internal_static_SalesmanTakeRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.internal_static_SalesmanTakeRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.class, emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.newBuilder()
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
        scheduleId_ = 0;

        position_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.internal_static_SalesmanTakeRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq build() {
        emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq buildPartial() {
        emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq result = new emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq(this);
        result.scheduleId_ = scheduleId_;
        result.position_ = position_;
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
        if (other instanceof emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq other) {
        if (other == emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq.getDefaultInstance()) return this;
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getPosition() != 0) {
          setPosition(other.getPosition());
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
        emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int position_ ;
      /**
       * <code>uint32 position = 8;</code>
       * @return The position.
       */
      @java.lang.Override
      public int getPosition() {
        return position_;
      }
      /**
       * <code>uint32 position = 8;</code>
       * @param value The position to set.
       * @return This builder for chaining.
       */
      public Builder setPosition(int value) {
        
        position_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 position = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPosition() {
        
        position_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SalesmanTakeRewardReq)
    }

    // @@protoc_insertion_point(class_scope:SalesmanTakeRewardReq)
    private static final emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq();
    }

    public static emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SalesmanTakeRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<SalesmanTakeRewardReq>() {
      @java.lang.Override
      public SalesmanTakeRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SalesmanTakeRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SalesmanTakeRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SalesmanTakeRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SalesmanTakeRewardReqOuterClass.SalesmanTakeRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalesmanTakeRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalesmanTakeRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SalesmanTakeRewardReq.proto\">\n\025Salesma" +
      "nTakeRewardReq\022\023\n\013schedule_id\030\r \001(\r\022\020\n\010p" +
      "osition\030\010 \001(\rB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SalesmanTakeRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SalesmanTakeRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalesmanTakeRewardReq_descriptor,
        new java.lang.String[] { "ScheduleId", "Position", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
