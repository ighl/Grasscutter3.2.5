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

public final class TakePlayerLevelRewardRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakePlayerLevelRewardRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakePlayerLevelRewardRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakePlayerLevelRewardRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakePlayerLevelRewardRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001eTakePlayerLevelRewardRsp.proto\"M\n\u0018TakePlayerLevelRewardRsp\u0012\u0011\n\treward_id\u0018\t \u0001(\r\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005\u0012\r\n\u0005level\u0018\u0006 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakePlayerLevelRewardRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_TakePlayerLevelRewardRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakePlayerLevelRewardRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakePlayerLevelRewardRspOuterClass.internal_static_TakePlayerLevelRewardRsp_descriptor, new String[] { "RewardId", "Retcode", "Level" });
    }
    
    public static final class TakePlayerLevelRewardRsp extends GeneratedMessageV3 implements TakePlayerLevelRewardRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int REWARD_ID_FIELD_NUMBER = 9;
        private int rewardId_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        public static final int LEVEL_FIELD_NUMBER = 6;
        private int level_;
        private byte memoizedIsInitialized;
        private static final TakePlayerLevelRewardRsp DEFAULT_INSTANCE;
        private static final Parser<TakePlayerLevelRewardRsp> PARSER;
        
        private TakePlayerLevelRewardRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakePlayerLevelRewardRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakePlayerLevelRewardRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakePlayerLevelRewardRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 48: {
                            this.level_ = input.readUInt32();
                            continue;
                        }
                        case 72: {
                            this.rewardId_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
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
            return TakePlayerLevelRewardRspOuterClass.internal_static_TakePlayerLevelRewardRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakePlayerLevelRewardRspOuterClass.internal_static_TakePlayerLevelRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakePlayerLevelRewardRsp.class, Builder.class);
        }
        
        @Override
        public int getRewardId() {
            return this.rewardId_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getLevel() {
            return this.level_;
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
            if (this.level_ != 0) {
                output.writeUInt32(6, this.level_);
            }
            if (this.rewardId_ != 0) {
                output.writeUInt32(9, this.rewardId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
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
            if (this.level_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.level_);
            }
            if (this.rewardId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(9, this.rewardId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TakePlayerLevelRewardRsp)) {
                return super.equals(obj);
            }
            final TakePlayerLevelRewardRsp other = (TakePlayerLevelRewardRsp)obj;
            return this.getRewardId() == other.getRewardId() && this.getRetcode() == other.getRetcode() && this.getLevel() == other.getLevel() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 9;
            hash = 53 * hash + this.getRewardId();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getLevel();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardRsp.PARSER.parseFrom(data);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardRsp.PARSER.parseFrom(data);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardRsp.PARSER.parseFrom(data);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakePlayerLevelRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardRsp.PARSER, input);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakePlayerLevelRewardRsp.PARSER, input);
        }
        
        public static TakePlayerLevelRewardRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakePlayerLevelRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardRsp.PARSER, input);
        }
        
        public static TakePlayerLevelRewardRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakePlayerLevelRewardRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakePlayerLevelRewardRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakePlayerLevelRewardRsp prototype) {
            return TakePlayerLevelRewardRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakePlayerLevelRewardRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakePlayerLevelRewardRsp getDefaultInstance() {
            return TakePlayerLevelRewardRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakePlayerLevelRewardRsp> parser() {
            return TakePlayerLevelRewardRsp.PARSER;
        }
        
        @Override
        public Parser<TakePlayerLevelRewardRsp> getParserForType() {
            return TakePlayerLevelRewardRsp.PARSER;
        }
        
        @Override
        public TakePlayerLevelRewardRsp getDefaultInstanceForType() {
            return TakePlayerLevelRewardRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakePlayerLevelRewardRsp();
            PARSER = new AbstractParser<TakePlayerLevelRewardRsp>() {
                @Override
                public TakePlayerLevelRewardRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakePlayerLevelRewardRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakePlayerLevelRewardRspOrBuilder
        {
            private int rewardId_;
            private int retcode_;
            private int level_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakePlayerLevelRewardRspOuterClass.internal_static_TakePlayerLevelRewardRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakePlayerLevelRewardRspOuterClass.internal_static_TakePlayerLevelRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakePlayerLevelRewardRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakePlayerLevelRewardRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.rewardId_ = 0;
                this.retcode_ = 0;
                this.level_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakePlayerLevelRewardRspOuterClass.internal_static_TakePlayerLevelRewardRsp_descriptor;
            }
            
            @Override
            public TakePlayerLevelRewardRsp getDefaultInstanceForType() {
                return TakePlayerLevelRewardRsp.getDefaultInstance();
            }
            
            @Override
            public TakePlayerLevelRewardRsp build() {
                final TakePlayerLevelRewardRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakePlayerLevelRewardRsp buildPartial() {
                final TakePlayerLevelRewardRsp result = new TakePlayerLevelRewardRsp(this);
                result.rewardId_ = this.rewardId_;
                result.retcode_ = this.retcode_;
                result.level_ = this.level_;
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
                if (other instanceof TakePlayerLevelRewardRsp) {
                    return this.mergeFrom((TakePlayerLevelRewardRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakePlayerLevelRewardRsp other) {
                if (other == TakePlayerLevelRewardRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRewardId() != 0) {
                    this.setRewardId(other.getRewardId());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getLevel() != 0) {
                    this.setLevel(other.getLevel());
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
                TakePlayerLevelRewardRsp parsedMessage = null;
                try {
                    parsedMessage = TakePlayerLevelRewardRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakePlayerLevelRewardRsp)e.getUnfinishedMessage();
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
            public int getRewardId() {
                return this.rewardId_;
            }
            
            public Builder setRewardId(final int value) {
                this.rewardId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRewardId() {
                this.rewardId_ = 0;
                this.onChanged();
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
            public int getLevel() {
                return this.level_;
            }
            
            public Builder setLevel(final int value) {
                this.level_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearLevel() {
                this.level_ = 0;
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
    
    public interface TakePlayerLevelRewardRspOrBuilder extends MessageOrBuilder
    {
        int getRewardId();
        
        int getRetcode();
        
        int getLevel();
    }
}
