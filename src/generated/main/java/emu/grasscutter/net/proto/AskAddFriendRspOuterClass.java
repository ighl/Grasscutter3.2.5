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

public final class AskAddFriendRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_AskAddFriendRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AskAddFriendRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AskAddFriendRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AskAddFriendRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015AskAddFriendRsp.proto\"E\n\u000fAskAddFriendRsp\u0012\r\n\u0005param\u0018\b \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0007 \u0001(\u0005\u0012\u0012\n\ntarget_uid\u0018\u0004 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AskAddFriendRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AskAddFriendRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AskAddFriendRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AskAddFriendRspOuterClass.internal_static_AskAddFriendRsp_descriptor, new String[] { "Param", "Retcode", "TargetUid" });
    }
    
    public static final class AskAddFriendRsp extends GeneratedMessageV3 implements AskAddFriendRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PARAM_FIELD_NUMBER = 8;
        private int param_;
        public static final int RETCODE_FIELD_NUMBER = 7;
        private int retcode_;
        public static final int TARGET_UID_FIELD_NUMBER = 4;
        private int targetUid_;
        private byte memoizedIsInitialized;
        private static final AskAddFriendRsp DEFAULT_INSTANCE;
        private static final Parser<AskAddFriendRsp> PARSER;
        
        private AskAddFriendRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AskAddFriendRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AskAddFriendRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AskAddFriendRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.targetUid_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 64: {
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
            return AskAddFriendRspOuterClass.internal_static_AskAddFriendRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AskAddFriendRspOuterClass.internal_static_AskAddFriendRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AskAddFriendRsp.class, Builder.class);
        }
        
        @Override
        public int getParam() {
            return this.param_;
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
                output.writeUInt32(4, this.targetUid_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(7, this.retcode_);
            }
            if (this.param_ != 0) {
                output.writeUInt32(8, this.param_);
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
                size += CodedOutputStream.computeUInt32Size(4, this.targetUid_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(7, this.retcode_);
            }
            if (this.param_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.param_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AskAddFriendRsp)) {
                return super.equals(obj);
            }
            final AskAddFriendRsp other = (AskAddFriendRsp)obj;
            return this.getParam() == other.getParam() && this.getRetcode() == other.getRetcode() && this.getTargetUid() == other.getTargetUid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getParam();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getTargetUid();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AskAddFriendRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AskAddFriendRsp.PARSER.parseFrom(data);
        }
        
        public static AskAddFriendRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AskAddFriendRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AskAddFriendRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AskAddFriendRsp.PARSER.parseFrom(data);
        }
        
        public static AskAddFriendRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AskAddFriendRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AskAddFriendRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AskAddFriendRsp.PARSER.parseFrom(data);
        }
        
        public static AskAddFriendRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AskAddFriendRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AskAddFriendRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AskAddFriendRsp.PARSER, input);
        }
        
        public static AskAddFriendRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AskAddFriendRsp.PARSER, input, extensionRegistry);
        }
        
        public static AskAddFriendRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AskAddFriendRsp.PARSER, input);
        }
        
        public static AskAddFriendRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AskAddFriendRsp.PARSER, input, extensionRegistry);
        }
        
        public static AskAddFriendRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AskAddFriendRsp.PARSER, input);
        }
        
        public static AskAddFriendRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AskAddFriendRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AskAddFriendRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AskAddFriendRsp prototype) {
            return AskAddFriendRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AskAddFriendRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AskAddFriendRsp getDefaultInstance() {
            return AskAddFriendRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<AskAddFriendRsp> parser() {
            return AskAddFriendRsp.PARSER;
        }
        
        @Override
        public Parser<AskAddFriendRsp> getParserForType() {
            return AskAddFriendRsp.PARSER;
        }
        
        @Override
        public AskAddFriendRsp getDefaultInstanceForType() {
            return AskAddFriendRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AskAddFriendRsp();
            PARSER = new AbstractParser<AskAddFriendRsp>() {
                @Override
                public AskAddFriendRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AskAddFriendRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AskAddFriendRspOrBuilder
        {
            private int param_;
            private int retcode_;
            private int targetUid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AskAddFriendRspOuterClass.internal_static_AskAddFriendRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AskAddFriendRspOuterClass.internal_static_AskAddFriendRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(AskAddFriendRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AskAddFriendRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.param_ = 0;
                this.retcode_ = 0;
                this.targetUid_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AskAddFriendRspOuterClass.internal_static_AskAddFriendRsp_descriptor;
            }
            
            @Override
            public AskAddFriendRsp getDefaultInstanceForType() {
                return AskAddFriendRsp.getDefaultInstance();
            }
            
            @Override
            public AskAddFriendRsp build() {
                final AskAddFriendRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AskAddFriendRsp buildPartial() {
                final AskAddFriendRsp result = new AskAddFriendRsp(this);
                result.param_ = this.param_;
                result.retcode_ = this.retcode_;
                result.targetUid_ = this.targetUid_;
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
                if (other instanceof AskAddFriendRsp) {
                    return this.mergeFrom((AskAddFriendRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AskAddFriendRsp other) {
                if (other == AskAddFriendRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getParam() != 0) {
                    this.setParam(other.getParam());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getTargetUid() != 0) {
                    this.setTargetUid(other.getTargetUid());
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
                AskAddFriendRsp parsedMessage = null;
                try {
                    parsedMessage = AskAddFriendRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AskAddFriendRsp)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface AskAddFriendRspOrBuilder extends MessageOrBuilder
    {
        int getParam();
        
        int getRetcode();
        
        int getTargetUid();
    }
}
