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
import com.google.protobuf.Internal;
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

public final class PlayerApplyEnterMpResultRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerApplyEnterMpResultRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerApplyEnterMpResultRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerApplyEnterMpResultRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerApplyEnterMpResultRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!PlayerApplyEnterMpResultRsp.proto\"c\n\u001bPlayerApplyEnterMpResultRsp\u0012\u000f\n\u0007retcode\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tis_agreed\u0018\u0003 \u0001(\b\u0012\u0011\n\tapply_uid\u0018\n \u0001(\r\u0012\r\n\u0005param\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerApplyEnterMpResultRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerApplyEnterMpResultRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerApplyEnterMpResultRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerApplyEnterMpResultRspOuterClass.internal_static_PlayerApplyEnterMpResultRsp_descriptor, new String[] { "Retcode", "IsAgreed", "ApplyUid", "Param" });
    }
    
    public static final class PlayerApplyEnterMpResultRsp extends GeneratedMessageV3 implements PlayerApplyEnterMpResultRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 1;
        private int retcode_;
        public static final int IS_AGREED_FIELD_NUMBER = 3;
        private boolean isAgreed_;
        public static final int APPLY_UID_FIELD_NUMBER = 10;
        private int applyUid_;
        public static final int PARAM_FIELD_NUMBER = 12;
        private int param_;
        private byte memoizedIsInitialized;
        private static final PlayerApplyEnterMpResultRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerApplyEnterMpResultRsp> PARSER;
        
        private PlayerApplyEnterMpResultRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerApplyEnterMpResultRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerApplyEnterMpResultRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerApplyEnterMpResultRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 24: {
                            this.isAgreed_ = input.readBool();
                            continue;
                        }
                        case 80: {
                            this.applyUid_ = input.readUInt32();
                            continue;
                        }
                        case 96: {
                            this.param_ = input.readUInt32();
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
            return PlayerApplyEnterMpResultRspOuterClass.internal_static_PlayerApplyEnterMpResultRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerApplyEnterMpResultRspOuterClass.internal_static_PlayerApplyEnterMpResultRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpResultRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public boolean getIsAgreed() {
            return this.isAgreed_;
        }
        
        @Override
        public int getApplyUid() {
            return this.applyUid_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(1, this.retcode_);
            }
            if (this.isAgreed_) {
                output.writeBool(3, this.isAgreed_);
            }
            if (this.applyUid_ != 0) {
                output.writeUInt32(10, this.applyUid_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(12, this.param_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.retcode_);
            }
            if (this.isAgreed_) {
                size += CodedOutputStream.computeBoolSize(3, this.isAgreed_);
            }
            if (this.applyUid_ != 0) {
                size += CodedOutputStream.computeUInt32Size(10, this.applyUid_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerApplyEnterMpResultRsp)) {
                return super.equals(obj);
            }
            final PlayerApplyEnterMpResultRsp other = (PlayerApplyEnterMpResultRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getIsAgreed() == other.getIsAgreed() && this.getApplyUid() == other.getApplyUid() && this.getParam() == other.getParam() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 3;
            hash = 53 * hash + Internal.hashBoolean(this.getIsAgreed());
            hash = 37 * hash + 10;
            hash = 53 * hash + this.getApplyUid();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getParam();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerApplyEnterMpResultRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultRsp.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpResultRsp.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerApplyEnterMpResultRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultRsp.PARSER, input);
        }
        
        public static PlayerApplyEnterMpResultRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerApplyEnterMpResultRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerApplyEnterMpResultRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerApplyEnterMpResultRsp prototype) {
            return PlayerApplyEnterMpResultRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerApplyEnterMpResultRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerApplyEnterMpResultRsp getDefaultInstance() {
            return PlayerApplyEnterMpResultRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerApplyEnterMpResultRsp> parser() {
            return PlayerApplyEnterMpResultRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerApplyEnterMpResultRsp> getParserForType() {
            return PlayerApplyEnterMpResultRsp.PARSER;
        }
        
        @Override
        public PlayerApplyEnterMpResultRsp getDefaultInstanceForType() {
            return PlayerApplyEnterMpResultRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerApplyEnterMpResultRsp();
            PARSER = new AbstractParser<PlayerApplyEnterMpResultRsp>() {
                @Override
                public PlayerApplyEnterMpResultRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerApplyEnterMpResultRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerApplyEnterMpResultRspOrBuilder
        {
            private int retcode_;
            private boolean isAgreed_;
            private int applyUid_;
            private int param_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerApplyEnterMpResultRspOuterClass.internal_static_PlayerApplyEnterMpResultRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerApplyEnterMpResultRspOuterClass.internal_static_PlayerApplyEnterMpResultRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerApplyEnterMpResultRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerApplyEnterMpResultRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.isAgreed_ = false;
                this.applyUid_ = 0;
                this.param_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerApplyEnterMpResultRspOuterClass.internal_static_PlayerApplyEnterMpResultRsp_descriptor;
            }
            
            @Override
            public PlayerApplyEnterMpResultRsp getDefaultInstanceForType() {
                return PlayerApplyEnterMpResultRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerApplyEnterMpResultRsp build() {
                final PlayerApplyEnterMpResultRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerApplyEnterMpResultRsp buildPartial() {
                final PlayerApplyEnterMpResultRsp result = new PlayerApplyEnterMpResultRsp(this);
                result.retcode_ = this.retcode_;
                result.isAgreed_ = this.isAgreed_;
                result.applyUid_ = this.applyUid_;
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
                if (other instanceof PlayerApplyEnterMpResultRsp) {
                    return this.mergeFrom((PlayerApplyEnterMpResultRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerApplyEnterMpResultRsp other) {
                if (other == PlayerApplyEnterMpResultRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getIsAgreed()) {
                    this.setIsAgreed(other.getIsAgreed());
                }
                if (other.getApplyUid() != 0) {
                    this.setApplyUid(other.getApplyUid());
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
                PlayerApplyEnterMpResultRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerApplyEnterMpResultRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerApplyEnterMpResultRsp)e.getUnfinishedMessage();
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
            public boolean getIsAgreed() {
                return this.isAgreed_;
            }
            
            public Builder setIsAgreed(final boolean value) {
                this.isAgreed_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIsAgreed() {
                this.isAgreed_ = false;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getApplyUid() {
                return this.applyUid_;
            }
            
            public Builder setApplyUid(final int value) {
                this.applyUid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearApplyUid() {
                this.applyUid_ = 0;
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
    
    public interface PlayerApplyEnterMpResultRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        boolean getIsAgreed();
        
        int getApplyUid();
        
        int getParam();
    }
}
