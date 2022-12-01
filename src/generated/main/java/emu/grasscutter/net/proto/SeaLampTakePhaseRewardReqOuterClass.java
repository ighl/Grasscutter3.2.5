// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SeaLampTakePhaseRewardReq.proto

package emu.grasscutter.net.proto;

public final class SeaLampTakePhaseRewardReqOuterClass {
  private SeaLampTakePhaseRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SeaLampTakePhaseRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SeaLampTakePhaseRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 phase_id = 7;</code>
     * @return The phaseId.
     */
    int getPhaseId();

    /**
     * <code>uint32 activity_id = 15;</code>
     * @return The activityId.
     */
    int getActivityId();
  }
  /**
   * <pre>
   * CmdId: 2179
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code SeaLampTakePhaseRewardReq}
   */
  public static final class SeaLampTakePhaseRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SeaLampTakePhaseRewardReq)
      SeaLampTakePhaseRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SeaLampTakePhaseRewardReq.newBuilder() to construct.
    private SeaLampTakePhaseRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SeaLampTakePhaseRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SeaLampTakePhaseRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SeaLampTakePhaseRewardReq(
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
            case 56: {

              phaseId_ = input.readUInt32();
              break;
            }
            case 120: {

              activityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.internal_static_SeaLampTakePhaseRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.internal_static_SeaLampTakePhaseRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.class, emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.Builder.class);
    }

    public static final int PHASE_ID_FIELD_NUMBER = 7;
    private int phaseId_;
    /**
     * <code>uint32 phase_id = 7;</code>
     * @return The phaseId.
     */
    @java.lang.Override
    public int getPhaseId() {
      return phaseId_;
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 15;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 15;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
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
      if (phaseId_ != 0) {
        output.writeUInt32(7, phaseId_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(15, activityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (phaseId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, phaseId_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, activityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq other = (emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq) obj;

      if (getPhaseId()
          != other.getPhaseId()) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
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
      hash = (37 * hash) + PHASE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPhaseId();
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq prototype) {
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
     * CmdId: 2179
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code SeaLampTakePhaseRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SeaLampTakePhaseRewardReq)
        emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.internal_static_SeaLampTakePhaseRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.internal_static_SeaLampTakePhaseRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.class, emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.newBuilder()
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
        phaseId_ = 0;

        activityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.internal_static_SeaLampTakePhaseRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq build() {
        emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq buildPartial() {
        emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq result = new emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq(this);
        result.phaseId_ = phaseId_;
        result.activityId_ = activityId_;
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
        if (other instanceof emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq other) {
        if (other == emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq.getDefaultInstance()) return this;
        if (other.getPhaseId() != 0) {
          setPhaseId(other.getPhaseId());
        }
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
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
        emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int phaseId_ ;
      /**
       * <code>uint32 phase_id = 7;</code>
       * @return The phaseId.
       */
      @java.lang.Override
      public int getPhaseId() {
        return phaseId_;
      }
      /**
       * <code>uint32 phase_id = 7;</code>
       * @param value The phaseId to set.
       * @return This builder for chaining.
       */
      public Builder setPhaseId(int value) {
        
        phaseId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 phase_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhaseId() {
        
        phaseId_ = 0;
        onChanged();
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 15;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 15;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SeaLampTakePhaseRewardReq)
    }

    // @@protoc_insertion_point(class_scope:SeaLampTakePhaseRewardReq)
    private static final emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq();
    }

    public static emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SeaLampTakePhaseRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<SeaLampTakePhaseRewardReq>() {
      @java.lang.Override
      public SeaLampTakePhaseRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SeaLampTakePhaseRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SeaLampTakePhaseRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SeaLampTakePhaseRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SeaLampTakePhaseRewardReqOuterClass.SeaLampTakePhaseRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeaLampTakePhaseRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeaLampTakePhaseRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037SeaLampTakePhaseRewardReq.proto\"B\n\031Sea" +
      "LampTakePhaseRewardReq\022\020\n\010phase_id\030\007 \001(\r" +
      "\022\023\n\013activity_id\030\017 \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SeaLampTakePhaseRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SeaLampTakePhaseRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeaLampTakePhaseRewardReq_descriptor,
        new java.lang.String[] { "PhaseId", "ActivityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
