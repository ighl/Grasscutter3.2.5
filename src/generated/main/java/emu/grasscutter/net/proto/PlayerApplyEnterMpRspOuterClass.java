// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class PlayerApplyEnterMpRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerApplyEnterMpRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerApplyEnterMpRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerApplyEnterMpRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bPlayerApplyEnterMpRsp.proto\"K\n\u0015PlayerApplyEnterMpRsp\u0012\u000f\n\u0007retcode\u0018\u0005 \u0001(\u0005\u0012\u0012\n\ntarget_uid\u0018\u0003 \u0001(\r\u0012\r\n\u0005param\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerApplyEnterMpRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerApplyEnterMpRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor, new String[] { "Retcode", "TargetUid", "Param" });
    }
    
    public static final class PlayerApplyEnterMpRsp extends GeneratedMessageV3 implements PlayerApplyEnterMpRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 5;
        private int retcode_;
        public static final int TARGET_UID_FIELD_NUMBER = 3;
        private int targetUid_;
        public static final int PARAM_FIELD_NUMBER = 4;
        private int param_;
        private byte memoizedIsInitialized;
        private static final PlayerApplyEnterMpRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerApplyEnterMpRsp> PARSER;
        
        private PlayerApplyEnterMpRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerApplyEnterMpRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerApplyEnterMpRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerApplyEnterMpRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 24: {
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.param_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getTargetUid() {
            return this.targetUid_;
        }
        
        @Override
        public int getParam() {
            return this.param_;
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.targetUid_ != 0) {
                output.writeUInt32(3, this.targetUid_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(4, this.param_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(5, this.retcode_);
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.targetUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.targetUid_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.param_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(5, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerApplyEnterMpRsp)) {
                return super.equals(obj);
            }
            final PlayerApplyEnterMpRsp other = (PlayerApplyEnterMpRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getTargetUid() == other.getTargetUid() && this.getParam() == other.getParam() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getTargetUid();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getParam();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpRsp.PARSER, input);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpRsp.PARSER, input);
        }
        
        public static PlayerApplyEnterMpRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpRsp.PARSER, input);
        }
        
        public static PlayerApplyEnterMpRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerApplyEnterMpRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerApplyEnterMpRsp prototype) {
            return PlayerApplyEnterMpRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerApplyEnterMpRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerApplyEnterMpRsp getDefaultInstance() {
            return PlayerApplyEnterMpRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerApplyEnterMpRsp> parser() {
            return PlayerApplyEnterMpRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerApplyEnterMpRsp> getParserForType() {
            return PlayerApplyEnterMpRsp.PARSER;
        }
        
        @Override
        public PlayerApplyEnterMpRsp getDefaultInstanceForType() {
            return PlayerApplyEnterMpRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerApplyEnterMpRsp();
            PARSER = new AbstractParser<PlayerApplyEnterMpRsp>() {
                @Override
                public PlayerApplyEnterMpRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerApplyEnterMpRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerApplyEnterMpRspOrBuilder
        {
            private int retcode_;
            private int targetUid_;
            private int param_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerApplyEnterMpRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.targetUid_ = 0;
                this.param_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerApplyEnterMpRspOuterClass.internal_static_PlayerApplyEnterMpRsp_descriptor;
            }
            
            @Override
            public PlayerApplyEnterMpRsp getDefaultInstanceForType() {
                return PlayerApplyEnterMpRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerApplyEnterMpRsp build() {
                final PlayerApplyEnterMpRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerApplyEnterMpRsp buildPartial() {
                final PlayerApplyEnterMpRsp result = new PlayerApplyEnterMpRsp(this);
                result.retcode_ = this.retcode_;
                result.targetUid_ = this.targetUid_;
                result.param_ = this.param_;
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof PlayerApplyEnterMpRsp) {
                    return this.mergeFrom((PlayerApplyEnterMpRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerApplyEnterMpRsp other) {
                if (other == PlayerApplyEnterMpRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                PlayerApplyEnterMpRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerApplyEnterMpRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerApplyEnterMpRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getTargetUid() {
                return this.targetUid_;
            }
            
            public Builder setTargetUid(final int value) {
                this.targetUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetUid() {
                this.targetUid_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParam() {
                return this.param_;
            }
            
            public Builder setParam(final int value) {
                this.param_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParam() {
                this.param_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface PlayerApplyEnterMpRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getTargetUid();
        
        int getParam();
    }
}
